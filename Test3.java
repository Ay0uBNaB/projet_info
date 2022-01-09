/*
 * Test3.java
 * 
 * Copyright 2022 ayoub <ayoub@LAPTOP-U2M910UG>
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
                  list1[i] = trimmed.charAt(i);
                  for (j = 0; j <= lettres.length() - 1; j++){
                        list2[j] = lettres.charAt(j);
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

            if (count1 >= count2){
                   sortie.write(ligne + System.getProperty("line.separator"));
			}
            else{
                   continue;
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


