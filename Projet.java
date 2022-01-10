/*
 * Projet.java
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

public class Projet {
	
	public static void main (String[] args) throws IOException {
		
		// Mettre tous les mots du dictionnaire en miniscule
		// Créer un nouveau dictionnaire et y remplir par ces mots
		
		File dico = new File("dictionnaireScrabble.txt");
		File dictionnaire = new File("dictionnaire_miniscules.txt");
		BufferedReader dico_read = new BufferedReader(new FileReader(dico));
		BufferedWriter dico_write = new BufferedWriter(new FileWriter(dictionnaire));
		String ligne_actuelle;
		while((ligne_actuelle = dico_read.readLine()) != null){
			String ligne_trimmed = ligne_actuelle.trim();
			dico_write.write(ligne_trimmed.toLowerCase() + System.getProperty("line.separator"));
		}
		dico_read.close();
		dico_write.close();
		
		// Faire rentrer à l'utilisateur son tirage de 7 lettres
		
		String lettres;
		Scanner tirage = new Scanner(System.in);
		System.out.println("- Veuillez saisir les 7 lettres attachees :");
		lettres = tirage.nextLine();

		// Importer le nouveau dictionnaire
		// Créer un fichier texte temporaire
		
		File temporaire = new File("temporaire.txt");		
		BufferedReader entree = new BufferedReader(new FileReader(dictionnaire));
		BufferedWriter sortie = new BufferedWriter(new FileWriter(temporaire));
		
		// Remplir le fichier temporaire
		
		String ligne;
		while((ligne = entree.readLine()) != null){ // Tant que la ligne du dictionnaire n'est pas vide
			String trimmed = ligne.trim(); 			// Enlever les espaces contenus dans la ligne
            int i, j, count1, count2;
            count1 = 0;
            count2 = 0;
            
            // Créer 3 tableaux
            
            char[] list1 = new char[255];
            char[] list2 = new char[255];
            char[] list3 = new char[255];
            
            for (i = 0; i <= trimmed.length() - 1; i++){
                  list1[i] = trimmed.charAt(i);        // Mettre les lettres du mot dans le premier tableau
                  for (j = 0; j <= lettres.length() - 1; j++){
                        list2[j] = lettres.charAt(j);  // Mettre les lettres du tirage dans le deuxième tableau
                        if (list1[i] == list2[j]){
                              count1++;                // Compter les lettres en commun entre le mot et le tirage
                        }
                  }
            }
            for (i = 0; i <= trimmed.length() - 1; i++){
                  list1[i] = trimmed.charAt(i);        // Mettre les lettres du mot dans le premier tableau
                  for (j = 0; j <= trimmed.length() - 1; j++){
                        list3[j] = trimmed.charAt(j);  // Mettre les lettres du tirage dans le troisième tableau
                        if (list1[i] == list3[j]){
                             count2++;                 // Compter les lettres en commun entre le mot et lui même
                        }
                  }
            }

            if (count1 >= count2){ // Tous les lettres constituant le mot sont des lettres du tirage
								   // Car si count2 > count1 donc le mot contient une lettre étrangère au tirage
                   sortie.write(ligne + System.getProperty("line.separator")); // Ecrire le mot dans le fichier temporaire et revenir à la ligne
			}
            else{
                   continue; // Passer à la ligne suivante si le mot n'est pas jouable
			}						
		}
		entree.close();
		sortie.close();	
		
		// Saisir la taille du mot imposée
		// Créer un tableau de même taille que celle du mot
					
		int t_rep;	
		Scanner t = new Scanner(System.in);
		System.out.println("- Quelle est la taille du mot demandee?");
		t_rep = t.nextInt();
		char[] tab = new char[t_rep];
		
		// Saisir les lettres imposées et leurs positions
		// Remplir le tableau à partir de ces informations	
			
		System.out.println("- Pour repondre a vos contraintes, il vous faudra saisir les lettres imposees dans le mot. Saisir un 0 lorsqu'aucune lettre n'est demandee dans la position.");
		Scanner p = new Scanner(System.in);
		for(int g = 1; g <= t_rep; g++){
			System.out.println("- Quelle lettre contient le mot dans la position "+g+" ?");
			tab[g-1] = p.next().charAt(0);
		}
		
		// Créer un deuxième fichier texte temporaire
		
		File temporaire2 = new File("temporaire2.txt");		
		BufferedReader entree2 = new BufferedReader(new FileReader(temporaire));
		BufferedWriter sortie2 = new BufferedWriter(new FileWriter(temporaire2));

		// Remplir le texte seulement par les mots qui répondent aux exigences saisies par l'utilisateur
		
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
		
		// Préciser la valeur des points donnés par chaque lettre
		// Calculer la somme des points associée à chaque mot
		
		BufferedReader entree3 = new BufferedReader(new FileReader(temporaire2));
		String liner;
		System.out.println(" On vous suggere les solutions suivantes :");
		while((liner = entree3.readLine()) != null){
			String line = liner.trim();
			int points = 0;
			for(int x=0; x < line.length(); x++){
				if(line.charAt(x)=='e'){
					points++;
				}
				if(line.charAt(x)=='a'){
					points++;
				}
				if(line.charAt(x)=='i'){
					points++;
				}
				if(line.charAt(x)=='n'){
					points++;
				}
				if(line.charAt(x)=='o'){
					points++;
				}
				if(line.charAt(x)=='r'){
					points++;
				}
				if(line.charAt(x)=='s'){
					points++;
				}
				if(line.charAt(x)=='t'){
					points++;
				}
				if(line.charAt(x)=='u'){
					points++;
				}
				if(line.charAt(x)=='l'){
					points++;
				}
				if(line.charAt(x)=='d'){
					points=points+2;
				}
				if(line.charAt(x)=='m'){
					points=points+2;
				}
				if(line.charAt(x)=='g'){
					points=points+2;
				}
				if(line.charAt(x)=='b'){
					points=points+3;
				}
				if(line.charAt(x)=='c'){
					points=points+3;
				}
				if(line.charAt(x)=='p'){
					points=points+3;
				}
				if(line.charAt(x)=='f'){
					points=points+4;
				}
				if(line.charAt(x)=='h'){
					points=points+4;
				}
				if(line.charAt(x)=='v'){
					points=points+4;
				}
				if(line.charAt(x)=='Q'){
					points=points+8;
				}
				if(line.charAt(x)=='j'){
					points=points+8;
				}
				if(line.charAt(x)=='k'){
					points=points+10;
				}
				if(line.charAt(x)=='w'){
					points=points+10;
				}
				if(line.charAt(x)=='x'){
					points=points+10;
				}
				if(line.charAt(x)=='y'){
					points=points+10;
				}
				if(line.charAt(x)=='z'){
					points=points+10;			
				}
			}
			System.out.println("- Le mot "+line+" qui vaut "+points+" points");
		}
	}
}



