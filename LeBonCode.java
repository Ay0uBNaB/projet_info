/*
 * Test3.java
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


import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test3 {
	
	public static void main (String[] args) throws IOException {
		String lettres;
		Scanner tirage = new Scanner(System.in);
		System.out.println("Veuillez saisir les 7 lettres attachees");
		lettres = tirage.nextLine();
		
		File dictionnaire = new File("dictionnaire.txt");
		File temporaire = new File("temporaire.txt");
		
		BufferedReader entree = new BufferedReader(new FileReader(dictionnaire));
		BufferedWriter sortie = new BufferedWriter(new FileWriter(temporaire));
		
		String ligne;
		while((ligne = entree.readLine()) != null){
			String trimmed = ligne.trim();
            int i, j, count1, count2;
            count1 = 0;
            count2 = 0;
            char[] list1 = new char[255];
            char[] list2 = new char[255];
            char[] list3 = new char[255];
            for (i = 0; i <= trimmed.length() - 1; i++){
                  list1[i] = trimmed.charAt(i);//les lettres du mot du dico
                  for (j = 0; j <= lettres.length() - 1; j++){
                        list2[j] = lettres.charAt(j);//les lettres du tirage
                        if (list1[i] == list2[j]){
                              count1++;
                        }
                  }
            }
            for (i = 0; i <= trimmed.length() - 1; i++){
                  list1[i] = trimmed.charAt(i);
                  for (j = 0; j <= trimmed.length() - 1; j++){
                        list3[j] = trimmed.charAt(j);
                        if (list1[i] == list3[j]){
                             count2++;
                        }
                  }
            }

            if (count1 >= count2){//donc aucune lettre etrangere au tirage dans le mot
                   sortie.write(ligne + System.getProperty("line.separator"));//sortie : ecrire dans le fichier temporaire et revenir a la ligne
			}
            else{
                   continue;//si le mot de la ligne remplit pas conditions on passe a l'autre ligne
			}						
		}
			entree.close();
			sortie.close();	
			
		int t_rep;	
		Scanner t = new Scanner(System.in);
		System.out.println("Quelle est la taille du mot demandee?");
		t_rep = t.nextInt();	
		char[] tab = new char[t_rep];
		
		System.out.println("Pour repondre a vos contraintes, il vous faudra saisir les lettres imposees dans le mot. Saisir un 0 lorsqu'aucune lettre n'est demandee dans la position.");
		Scanner p = new Scanner(System.in);
		for(int g = 1; g <= t_rep; g++){
			System.out.println("Quelle lettre contient le mot dans la position "+g+" ?");
			tab[g-1] = p.next().charAt(0);//on met soit une lettre soit un 0 dans le tableau
		}
		
		File temporaire2 = new File("temporaire2.txt");
		
		BufferedReader entree2 = new BufferedReader(new FileReader(temporaire));
		BufferedWriter sortie2 = new BufferedWriter(new FileWriter(temporaire2));
		
		String ligne2;
		while((ligne2 = entree2.readLine()) != null){
			String trimmed2 = ligne2.trim();
			int k, count;
			count = 0;
			if(trimmed2.length() != t_rep){ //si longueur ligne pas meme que imposee on passe
				continue;
			}
			else{
			    for(k = 0; k < trimmed2.length(); k++){
				    if((tab[k] == '0') || ((tab[k] != '0') && (tab[k] == ligne2.charAt(k)))){//si pas de lettre imposée ou que lettre imposée= lettre du mot à la meme position
					    count ++;
				    }
				    else{
					    count = count;
				    }
			    }
			    if(count == t_rep){//si a chaque lettre count++ alors count==taille du mot
				sortie2.write(ligne2 + System.getProperty("line.separator"));
			    }
			    else{
				    continue;
			    }
			}
		}
		entree2.close();
		sortie2.close();
		
		BufferedReader entree3 = new BufferedReader(new FileReader(temporaire2));
		String liner;
		while((liner = entree3.readLine()) != null){
			String line = liner.trim();
			int points = 0;
			for(int x=0; x < line.length(); x++){
			if(line.charAt(x)=='e'||line.charAt(x)=='E'){
				points++;
			}
			if(line.charAt(x)=='a'||line.charAt(x)=='A'){
				points++;
			}
			if(line.charAt(x)=='i'||line.charAt(x)=='I'){
				points++;
			}
			if(line.charAt(x)=='n'||line.charAt(x)=='N'){
				points++;
			}
			if(line.charAt(x)=='o'||line.charAt(x)=='O'){
				points++;
			}
			if(line.charAt(x)=='r'||line.charAt(x)=='R'){
				points++;
			}
			if(line.charAt(x)=='s'||line.charAt(x)=='S'){
				points++;
			}
			if(line.charAt(x)=='t'||line.charAt(x)=='T'){
				points++;
			}
			if(line.charAt(x)=='u'||line.charAt(x)=='T'){
				points++;
			}
			if(line.charAt(x)=='l'||line.charAt(x)=='L'){
				points++;
			}
			if(line.charAt(x)=='d'||line.charAt(x)=='D'){
				points=points+2;
			}
			if(line.charAt(x)=='m'||line.charAt(x)=='M'){
				points=points+2;
			}
			if(line.charAt(x)=='g'||line.charAt(x)=='G'){
				points=points+2;
			}
			if(line.charAt(x)=='b'||line.charAt(x)=='B'){
				points=points+3;
			}
			if(line.charAt(x)=='C'||line.charAt(x)=='C'){
				points=points+3;
			}
			if(line.charAt(x)=='p'||line.charAt(x)=='P'){
				points=points+3;
			}
			if(line.charAt(x)=='f'||line.charAt(x)=='F'){
				points=points+4;
			}
			if(line.charAt(x)=='h'||line.charAt(x)=='H'){
				points=points+4;
			}
			if(line.charAt(x)=='v'||line.charAt(x)=='V'){
				points=points+4;
			}
			if(line.charAt(x)=='Q'||line.charAt(x)=='Q'){
				points=points+8;
			}
			if(line.charAt(x)=='j'||line.charAt(x)=='J'){
				points=points+8;
			}
			if(line.charAt(x)=='k'||line.charAt(x)=='K'){
				points=points+10;
			}
			if(line.charAt(x)=='w'||line.charAt(x)=='W'){
				points=points+10;
			}
			if(line.charAt(x)=='x'||line.charAt(x)=='X'){
				points=points+10;
			}
			if(line.charAt(x)=='y'||line.charAt(x)=='Y'){
				points=points+10;
			}
			if(line.charAt(x)=='z'||line.charAt(x)=='Z'){
				points=points+10;
			
		}
	}
		System.out.println("Le mot "+line+" vaut "+points+" points");
}
}
}
