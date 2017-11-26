# Implement hash function

import java.util.*;
import java.lang.*;
import java.io.*;

class HashFunction
{	
	static String[] array;
	static int arrsize;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		HashFunction hashf = new HashFunction(30);
		String[] elements = {"1", "2","6","8","12","16","16","6","21","6","19"};
		//hashf.Hashfunction1(hashf.array, elements);
		//hashf.Hashfunction2(hashf.array, elements);
		//hashf.display();
		//System.out.println("String: " +hashf.key("21"));
	}
	
	// Simple hash function, will not handle duplicate values
	public static void Hashfunction1(String[] array, String[] elements){
		for(int i = 0; i < elements.length; i++){
			String elm = elements[i];
			array[Integer.parseInt(elm)] = elm;
		}
	}
	
	// Handles duplicate values
	public static void Hashfunction2(String[] array, String[] elements){
		for(int i = 0; i < elements.length; i++){
			int index = (Integer.parseInt(elements[i])) % array.length;
			while(array[index] != "-1"){
				index++;
			}
			array[index] = elements[i];
		}
	}
	
	// Looks for an element in the hash table
	public String key(String key){
		int index = (Integer.parseInt(key)) % array.length;
		while(array[index] != "-1"){
			if(array[index] == key){
				System.out.println("String found");
				return array[index]; 
			}
			index++;
			index = index % array.length;
		}
		return "Not found";
	}
	// Constructor
	HashFunction(int size){
		arrsize = size;
		array = new String[size];
		Arrays.fill(array, "-1");
	}
	public static void display(){
		for(int i=0;i<array.length;i++){
			if(array[i]!=""){
				System.out.println("Array: "+i+"   Element: "+array[i]);
			}
		}
	}
	
}