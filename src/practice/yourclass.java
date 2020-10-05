package practice;

import java.util.Iterator;

public class yourclass<T> {
	T object;
	boolean value;
	
	yourclass(T obj, boolean val){
		object = obj;
		value = val;
	}
	
	public static void display(yourclass[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i].value == true) {
				System.out.println(array[i].object);
			}
		}
	}
}
