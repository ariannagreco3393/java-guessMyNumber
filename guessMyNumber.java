package com.soprasteria;

import java.util.Random;
import java.util.Scanner;

public class guessMyNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		int count = 1;
		
		int numeroCasuale = r.nextInt(6);

        Scanner in = new Scanner(System.in);
        
        System.out.println("Indovina il numero");
        
        int user = in.nextInt();
        while(numeroCasuale != user ){
        	if(numeroCasuale < user)
        		System.out.println("il numero che hai inserito è maggiore di quello random");
        	else
        		System.out.println("il numero che hai scritto è minore di quello random");
        	
            user = in.nextInt();
        	count++;
        	
        	
        }System.out.println("il numero è corretto, hai effettuato :" + count + "tentativi");
        }
}
