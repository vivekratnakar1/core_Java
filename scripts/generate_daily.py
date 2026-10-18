
import os
import re
import subprocess
from datetime import date
from pathlib import Path

from openai import OpenAI

ROOT = Path(__file__).resolve().parent.parent
START_DATE = date.fromisoformat(
    os.getenv("START_DATE", "2026-10-18")
)

today = date.today()
day_number = (today - START_DATE).days + 1

if day_number < 1 or day_number > 365:
    raise SystemExit("Outside the configured 365-day period.")

topics = [
    "Core Java and OOP",
    "Strings and immutable objects",
    "Collections Framework",
    "HashMap and hashing",
    "Exception handling",
    "Generics",
    "Java 8 Streams and Lambda",
    "Optional and functional interfaces",
    "Multithreading",
    "ExecutorService and concurrency",
    "JVM and garbage collection",
    "File handling",
    "JUnit testing",
    "Mockito testing",
    "Spring Core and dependency injection",
    "Spring Boot fundamentals",
    "REST API development",
    "Request validation and error handling",
    "Spring Data JPA",
    "MySQL and SQL",
    "Pagination and sorting",
    "Spring Security",
    "Redis caching",
    "Kafka messaging",
    "Microservices",
    "Docker",
    "API integration testing",
    "Logging and monitoring",
    "Design patterns",
    "System design"
]

topic = topics[(day_number - 1) % len(topics)]
cycle = (day_number - 1) // len(topics) + 1

client = OpenAI(api_key=os.environ["OPENAI_API_KEY"])
model = os.getenv("OPENAI_MODEL", "gpt-4.1-mini")

prompt = f"""
Create an educational Java backend practice exercise.

Day: {day_number} of 365
Main topic: {topic}
Topic cycle: {cycle}

Requirements:
- Produce original, practical Java code.
- Use Java 21-compatible syntax.
- Include exactly one public class named Main.
- Include a valid public static void main method.
- Include useful comments and meaningful example output.
- Make the exercise more advanced in later topic cycles.
- Avoid external dependencies in the Java example.
- Do not include Markdown fences.
- Return only complete Java source code.
- Do not include credentials, secrets or network calls.
"""

response = client.responses.create(
    model=model,
    input=prompt
)

code = response.output_text.strip()
code = re.sub(r"^```(?:java)?\s*", "", code)
code = re.sub(r"\s*```$", "", code)

if "public class Main" not in code:
    raise RuntimeError("Generated code is missing public class Main.")

output_dir = ROOT / "daily-code" / f"day-{day_number:03d}"
output_dir.mkdir(parents=True, exist_ok=True)

java_file = output_dir / "Main.java"

if java_file.exists():
    raise SystemExit(f"Already generated: {java_file}")

java_file.write_text(code + "\n", encoding="utf-8")

readme = output_dir / "README.md"
readme.write_text(
    f"# Day {day_number}: {topic}\n\n"
    f"Practice cycle: {cycle}\n\n"
    "Review the source code and run it with Java 21.\n",
    encoding="utf-8"
)

# Compile before the workflow commits the generated code.
subprocess.run(
    ["javac", str(java_file)],
    check=True,
    cwd=output_dir
)

# Remove compiled artifacts; commit source files only.
class_file = output_dir / "Main.class"
if class_file.exists():
    class_file.unlink()

print(f"Generated and compiled Day {day_number}: {topic}")
