package com.core_java_Constructor1_day13;

public class Electronic extends Ott {
	
	public int warrenty;
	
	public Electronic
	(String _name,  String _type, int _amount, int _warrenty)
	{
		super (_name,_type,_amount); //init the default producs
		
		this.warrenty = _warrenty;
		
		
		
	} 
		

}
