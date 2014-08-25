package com.Mohax.main;
import com.Mohax.Utils.AlphabetSwitcher;
import com.Mohax.Encoder.*;
import com.Mohax.Frame.*;
public class Main {
	public static String g= "";
	public static void main(String[] args) {
	Frame frame = new Frame();
	}
    public static void Lo(){
    	g= "";
    	for(int i = 1; i<AlphabetSwitcher.ArrayN.length; i++){
        	g+=AlphabetSwitcher.ArrayN[i]+"-";
        }
    say(Frame.j+"Done: came out with "+g);
    }
    public static void say(String a){
    	System.out.println(a);
    }
}
