/*
 * PROJET_INFOjava
 * 
 * Copyright 2022 aserarfi01 <aserarfi01@SEC-C212-F18>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
public class PROJET_INFO {
	
	public static void main (String[] args) throws IOException {
		File temporaire = new File("temporaire.txt");
		BufferedWriter sortie = new BufferedWriter(new FileWriter(temporaire));
		String L1m,L1M,L2m,L2M,L3m,L3M,L4m,L4M,L5m,L5M,L6m,L6M,L7m,L7M;
		String L1NM, L2NM, L3NM, L4NM, L5NM, L6NM, L7NM, L8NM, L9NM, L10NM, L11NM, L12NM, L13NM, L14NM, L15NM, L16NM, L17NM, L18NM, L19NM;
		String L1Nm,L2Nm,L3Nm,L4Nm,L5Nm,L6Nm,L7Nm,L8Nm,L9Nm,L10Nm,L11Nm,L12Nm,L13Nm,L14Nm,L15Nm,L16Nm,L17Nm,L18Nm,L19Nm;
		String line;
		//faire saisir le tirage de 7 lettres et le lire au clavier.
		Scanner clavier=new Scanner(System.in);
		System.out.println("veuillez saisir la 1e lettre de votre tirage en minuscule");
		L1m=clavier.nextLine();
		System.out.println("a present saisissez la en majuscule");//car certains mots commencent par une majuscule dans le dictionnaire
		L1M=clavier.nextLine();
		System.out.println("veuillez saisir la 2e lettre de votre tirage en minuscule");
	    L2m=clavier.nextLine();
	    System.out.println("a present saisissez la en majuscule");
	    L2M=clavier.nextLine();
		System.out.println("veuillez saisir la 3e lettre de votre tirage en minuscule");
	    L3m=clavier.nextLine();
	    System.out.println("a present saisissez la en majuscule");
	    L3M=clavier.nextLine();
		System.out.println("veuillez saisir la 4e lettre de votre tirage en minuscule");
	    L4m=clavier.nextLine();
	    System.out.println("a present saisissez la en majuscule");
	    L4M=clavier.nextLine();
		System.out.println("veuillez saisir la 5e lettre de votre tirage en minuscule");
	    L5m=clavier.nextLine();
	    System.out.println("a present saisissez la en majuscule");
	    L5M=clavier.nextLine();
		System.out.println("veuillez saisir la 6e lettre de votre tirage en minuscule");
	    L6m=clavier.nextLine();
	    System.out.println("a present saisissez la en majuscule");
	    L6M=clavier.nextLine();
		System.out.println("veuillez saisir la 7e lettre de votre tirage en minuscule");
	    L7m=clavier.nextLine();
	    System.out.println("a present saisissez la en majuscule");
	    L7M=clavier.nextLine();
	    System.out.println("votre tirage est donc: "+L1M+", "+L2M+", "+L3M+", "+L4M+", "+L5M+", "+L6M+", "+L7M);
	    
	    //afficher les lettres differentes du tirage
	    try{
			FileInputStream file = new FileInputStream("Alphabet.txt");//necessite d'avoir sur son ordinateur un fichier texte avec les lettres de l'alphabet
			Scanner scanner = new Scanner(file); 
			String currentLine=null;
			System.out.println("voici les lettres qui n'appartiennent pas a votre tirage:");
			
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				}
				else{
					System.out.println(line);
				}
			}
			scanner.close();
			
		 }
		catch(IOException e){
			e.printStackTrace();
		}
		Scanner scanner2 = new Scanner (System.in);
		System.out.println("veuillez copier coller les lettres ci dessus et aussi la derniere ligne sans caractere c'est important");
		
		L1NM=clavier.nextLine();
		L1Nm=clavier.nextLine();
		L2NM=clavier.nextLine();
		L2Nm=clavier.nextLine();
        L3NM=clavier.nextLine();
        L3Nm=clavier.nextLine();
	    L4NM=clavier.nextLine();
	    L4Nm=clavier.nextLine();
		L5NM=clavier.nextLine();
		L5Nm=clavier.nextLine();
		L6NM=clavier.nextLine();
		L6Nm=clavier.nextLine();
		L7NM=clavier.nextLine();
		L7Nm=clavier.nextLine();
		L8NM=clavier.nextLine();
		L8Nm=clavier.nextLine();
		L9NM=clavier.nextLine();
		L9Nm=clavier.nextLine();
		L10NM=clavier.nextLine();
		L10Nm=clavier.nextLine();
		L11NM=clavier.nextLine();
		L11Nm=clavier.nextLine();
		L12NM=clavier.nextLine();
		L12Nm=clavier.nextLine();
		L13NM=clavier.nextLine();
		L13Nm=clavier.nextLine();
		L14NM=clavier.nextLine();
		L14Nm=clavier.nextLine();
		L15NM=clavier.nextLine();
		L15Nm=clavier.nextLine();
		L16NM=clavier.nextLine();
		L16Nm=clavier.nextLine();
		L17NM=clavier.nextLine();
		L17Nm=clavier.nextLine();
		L18NM=clavier.nextLine();
		L18Nm=clavier.nextLine();
		L19NM=clavier.nextLine();
		L19Nm=clavier.nextLine();//si tt les lettres sont différentes on a 19 lettres non présentes dans le tirage.
		
	    
		
		//Afficher les mots jouables
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 7 lettres:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=7&&count<=7){
						    sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		//A partir d'ici on répète la même boucle mais simplement qu'on affiche les mots dont le count vaut 6 puis ceux de 5 etc jusqu'à 1.
		//Cela permet de trier les mots et de les afficher dans l'ordre du nombre de lettres.
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 6 lettres:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=6&&count<=6){
							sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
				
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 5 lettres:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=5&&count<=5){
							sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
				
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 4 lettres:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=4&&count<=4){
							sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
				
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 3 lettres:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=3&&count<=3){
							sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
				
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 2 lettres:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=2&&count<=2){
							sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
				
		try{
			System.out.println("");
			System.out.println("voici les mots que vous pouvez jouer en 1 lettre:");
			FileInputStream file = new FileInputStream("dictionnaireScrabble.txt");   
			Scanner scanner = new Scanner(file); 
			while(scanner.hasNextLine()){
				line=scanner.nextLine();
				if(line.contains(L1Nm)||line.contains(L2Nm)||line.contains(L3Nm)||line.contains(L4Nm)||line.contains(L5Nm)||line.contains(L6Nm)||line.contains(L7Nm)||line.contains(L8Nm)||line.contains(L9Nm)||line.contains(L10Nm)||line.contains(L11Nm)||line.contains(L12Nm)||line.contains(L13Nm)||line.contains(L14Nm)||line.contains(L15Nm)||line.contains(L16Nm)||line.contains(L17Nm)||line.contains(L18Nm)||line.contains(L19Nm)||line.contains(L1NM)||line.contains(L2NM)||line.contains(L3NM)||line.contains(L4NM)||line.contains(L5NM)||line.contains(L6NM)||line.contains(L7NM)||line.contains(L8NM)||line.contains(L9NM)||line.contains(L10NM)||line.contains(L11NM)||line.contains(L12NM)||line.contains(L13NM)||line.contains(L14NM)||line.contains(L15NM)||line.contains(L16NM)||line.contains(L17NM)||line.contains(L18NM)||line.contains(L19NM)){
				}
				else{
					if((line.contains(L1m)||line.contains(L1M))||(line.contains(L2m)||line.contains(L2M))||(line.contains(L3m)||line.contains(L3M))||(line.contains(L4m)||line.contains(L4M))||(line.contains(L5m)||line.contains(L5M))||(line.contains(L6m)||line.contains(L6M))||(line.contains(L7m)||line.contains(L7M))){
				        //compter le nombre de caracteres (lettres) dans la ligne (dans le mot)
				        int count=0;
				        for (int i=0;i<line.length();i++){
							count++;
						}
						int points=0;
						for(int j=0; j<line.length(); j++){
							if(line.charAt(j)=='e'||line.charAt(j)=='E'){
								points++;
							}
							if(line.charAt(j)=='a'||line.charAt(j)=='A'){
								points++;
							}
							if(line.charAt(j)=='i'||line.charAt(j)=='I'){
								points++;
							}
							if(line.charAt(j)=='n'||line.charAt(j)=='N'){
								points++;
							}
							if(line.charAt(j)=='o'||line.charAt(j)=='O'){
								points++;
							}
							if(line.charAt(j)=='r'||line.charAt(j)=='R'){
								points++;
							}
							if(line.charAt(j)=='s'||line.charAt(j)=='S'){
								points++;
							}
							if(line.charAt(j)=='t'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='u'||line.charAt(j)=='T'){
								points++;
							}
							if(line.charAt(j)=='l'||line.charAt(j)=='L'){
								points++;
							}
							if(line.charAt(j)=='d'||line.charAt(j)=='D'){
								points=points+2;
							}
							if(line.charAt(j)=='m'||line.charAt(j)=='M'){
								points=points+2;
							}
							if(line.charAt(j)=='g'||line.charAt(j)=='G'){
								points=points+2;
							}
							if(line.charAt(j)=='b'||line.charAt(j)=='B'){
								points=points+3;
							}
							if(line.charAt(j)=='C'||line.charAt(j)=='C'){
								points=points+3;
							}
							if(line.charAt(j)=='p'||line.charAt(j)=='P'){
								points=points+3;
							}
							if(line.charAt(j)=='f'||line.charAt(j)=='F'){
								points=points+4;
							}
							if(line.charAt(j)=='h'||line.charAt(j)=='H'){
								points=points+4;
							}
							if(line.charAt(j)=='v'||line.charAt(j)=='V'){
								points=points+4;
							}
							if(line.charAt(j)=='Q'||line.charAt(j)=='Q'){
								points=points+8;
							}
							if(line.charAt(j)=='j'||line.charAt(j)=='J'){
								points=points+8;
							}
							if(line.charAt(j)=='k'||line.charAt(j)=='K'){
								points=points+10;
							}
							if(line.charAt(j)=='w'||line.charAt(j)=='W'){
								points=points+10;
							}
							if(line.charAt(j)=='x'||line.charAt(j)=='X'){
								points=points+10;
							}
							if(line.charAt(j)=='y'||line.charAt(j)=='Y'){
								points=points+10;
							}
							if(line.charAt(j)=='z'||line.charAt(j)=='Z'){
								points=points+10;
							}
						}
						if (count>=1&&count<=1){
							sortie.write(line + System.getProperty("line.separator"));
						}
						else{
						}	
					}
				}
			}
		    scanner.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		//Trier les mots en fonction du nombre de lettres
		//Trier les mots en fonctions du nombre de points
	int t_rep;	
		Scanner t = new Scanner(System.in);
		System.out.println("Quelle est la taille du mot demandee?");
		t_rep = t.nextInt();	
		char[] tab = new char[t_rep];
		
		System.out.println("Pour repondre a vos contraintes, il vous faudra saisir les lettres imposees dans le mot. Saisir un 0 lorsqu'aucune lettre n'est demandee dans la position.");
		Scanner p = new Scanner(System.in);
		for(int g = 1; g <= t_rep; g++){
			System.out.println("Quelle lettre contient le mot dans la position "+g+" ?");
			tab[g-1] = p.next().charAt(0);
		}
		
		File temporaire2 = new File("temporaire2.txt");
		
		BufferedReader entree2 = new BufferedReader(new FileReader(temporaire));
		BufferedWriter sortie2 = new BufferedWriter(new FileWriter(temporaire2));
		
		String ligne2;
		while((ligne2 = entree2.readLine()) != null){
			String trimmed2 = ligne2.trim();
			int k, count;
			count = 0;
			if(trimmed2.length() != t_rep){
				continue;
			}
			else{
			    for(k = 0; k < trimmed2.length(); k++){
				    if((tab[k] == '0') || ((tab[k] != '0') && (tab[k] == ligne2.charAt(k)))){
					    count ++;
				    }
				    else{
					    count = count;
				    }
			    }
			    if(count == t_rep){
				sortie2.write(ligne2 + System.getProperty("line.separator"));
			    }
			    else{
				    continue;
			    }
			}
		}
		entree2.close();
		sortie2.close();
	}
}
