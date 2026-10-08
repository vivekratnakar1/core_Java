package com.core_java_Constructor1_day13_practice;

public class Buy extends Order {
    public String noReturn;

    // कंस्ट्रक्टर (Constructor)
    public Buy(String name, String type, int amount, String noReturn) 
    {
        super(name, type, amount); // पैरेंट क्लास (Order) के कंस्ट्रक्टर को कॉल करना (3 पैरामीटर्स)
        this.noReturn = noReturn;  // सही वेरिएबल असाइनमेंट
    }   
    
}
