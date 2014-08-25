package com.Mohax.Encoder;
import java.util.Arrays;

import com.Mohax.Utils.*;
import com.Mohax.main.*;
public class Encoder {
public static String cutter(String g,int w){
	String[] array = new String[g.length()+1];
	for(int i=1; i<g.length(); i++){
		array[i+1]=g.substring(i, i+1);
	}
	return Arrays.toString(array);
}
public static String[] cutterz(String g,int w){
	String[] array = new String[g.length()+1];
	for(int i=1; i<g.length(); i++){
		array[i+1]=g.substring(i, i+1);
	}
	return array;
}
}
