import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class Main {
	 static int rowCounter=0;							
	 static int columnCounter=0;   																		
	 
	 public static void main(String[] args) {
		 String [] s=null;	
		 int x,y;					
		 int score,total=0;
		 String name=" ";
		 ArrayList<String[]> grid = new ArrayList<String[]>();					
		 ArrayList <LeaderBoard> leaderBoard=new ArrayList<LeaderBoard>();		

				 
	try {																		
		File file = new File("gameGrid.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bf=new BufferedReader(fr);	
		String line2 = bf.readLine();
		while (line2 != null) {
			s=line2.split(" ");
			columnCounter=s.length;
			grid.add(s);
			s=null;	
			rowCounter++;
			line2= bf.readLine();
		}
	}
	catch(IOException iox){
		System.out.println("cant read");
	}
	
	System.out.println("Game grid");
	System.out.println();
	
	for(int i=0;i<rowCounter;i++)
	{
		for(int j=0;j<columnCounter;j++)
		{
			System.out.printf("%s ",grid.get(i)[j]);
		}
		System.out.println();
	}
	System.out.println();
	
	try {																				
		//InputStream testFile = new InputStream(System.in);
		//FileReader frTest = new FileReader(testFile);
		BufferedReader bfTest=new BufferedReader(new InputStreamReader(System.in));				
		
		System.out.print("Select coordinate or enter E to end the game:");
		String line7 ;
		while ((line7=bfTest.readLine()) != null) {
			String testList [];	
			testList=line7.split(" ");
			if(testList.length==2) {
				x=Integer.parseInt(testList[0]);							
				y=Integer.parseInt(testList[1]);
				System.out.println();
				try {
					if(x>=rowCounter || y>=columnCounter) {
						System.out.println("not available coordinate");
						continue;
					}
			
					if(grid.get(x)[y]==" ") {
						System.out.println("this coordinate is empty");
						continue;
					}
					
					else {
						
						if(grid.get(x)[y].equals("D")) {
							D o=new D();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++) 
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("S")) {
							S o=new S();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++) 
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("T")) {
							T o=new T();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++)
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("/")) {
							Symbol1 o=new Symbol1();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++)
							{
								for(int j=0;j<columnCounter;j++)
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("-")) {
							Symbol2 o=new Symbol2();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++) 
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("+")) {
							Symbol3 o=new Symbol3();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++)
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("\\")) {
							Symbol4 o=new Symbol4();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++) 
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("|")) {
							Symbol5 o=new Symbol5();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++) 
								
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							
							System.out.println("score"+" "+score+" "+"points");
						}
						
						else if(grid.get(x)[y].equals("W")) {
							W o=new W();
							grid=o.deleting(grid, x, y);
							score=o.point;
							total=total+score;
							for(int i=0;i<rowCounter;i++) 
							{
								for(int j=0;j<columnCounter;j++) 
								{
									System.out.printf("%s ",grid.get(i)[j]);
								}
								System.out.println();
							}
							System.out.println();
							
							System.out.println("score"+" "+score+" "+"points");
						}
					}
				}
				catch(InputMismatchException imp) {
					System.out.println("not available");
					}	
			 	}
			

			else break;	
			System.out.print("Select coordinate or enter E to end the game:");
		 	
		}
			System.out.println("Enter name:");	
			line7=bfTest.readLine();
			
			name=line7;
			System.out.println();
			System.out.println("Total score:"+" "+total+" "+"points");
			System.out.println();
					
			LeaderBoard player=new LeaderBoard(name,total);
			try {	
				File fileOutput2=new File("leaderboard.txt");
		        FileWriter fw3 = new FileWriter(fileOutput2,true);
		        BufferedWriter bw3 = new BufferedWriter(fw3);
		        File file = new File("leaderboard.txt");
		        if(file.length()==0) {
		        bw3.write(player.getName()+" "+player.getScore());
		        } 
		        else {
		        	bw3.newLine();
		        	bw3.write(player.getName()+" "+player.getScore());  	
		        }
		        bw3.close();   
			}	
		catch(Exception iox){
			System.out.println("cant write");
		}	 
	
			
		
	try {
		
    	File fileR = new File("leaderboard.txt");
		FileReader fr = new FileReader(fileR);
		BufferedReader bf=new BufferedReader(fr);
		String line3 = bf.readLine();

		while (line3 != null) {
			
			String allPlayers [];
			allPlayers=line3.split(" ");
					
			LeaderBoard player1=new LeaderBoard(allPlayers[0],Integer.parseInt(allPlayers[1]));		
			leaderBoard.add(player1);
			allPlayers =null;
			line3=bf.readLine();
		}
		bf.close();
		}
	 catch(Exception r) {
	 	}
	
	Collections.sort(leaderBoard);
	
	for (int i=0;i<leaderBoard.size();i++) {
		if(leaderBoard.size()==1) {
		if(player.getName().equals(leaderBoard.get(i).getName()) && player.getScore()==leaderBoard.get(i).getScore()) {	
		System.out.println("your rank is 1/1 your point is"+" "+leaderBoard.get(i).getScore());
	}
	}
	}
	
	
	try {
	 for (int i=0;i<leaderBoard.size();i++) {
		 if(player.getName().equals(leaderBoard.get(i).getName()) && player.getScore()==leaderBoard.get(i).getScore()) {
			 System.out.format("your rank is %d/%d,your score is %d points higher than %s\t", leaderBoard.indexOf(leaderBoard.get(i))+1 ,leaderBoard.size(),leaderBoard.get(i).getScore()-leaderBoard.get(i+1).getScore(),leaderBoard.get(i+1).getName());
			
		 }
	 }
	}
	catch(Exception e) {
		
	}
	
	try {
		 for (int i=0;i<leaderBoard.size();i++) {
			 if(player.getName().equals(leaderBoard.get(i).getName()) && player.getScore()==leaderBoard.get(i).getScore()) {
				 System.out.format("your rank is %d/%d,your score is %d points lower than %s", leaderBoard.indexOf(leaderBoard.get(i))+1 ,leaderBoard.size(),leaderBoard.get(i-1).getScore()-leaderBoard.get(i).getScore(),leaderBoard.get(i-1).getName());
			
			 }
		 }
		 
		 
		}
		catch(Exception e) {
			
		}
	System.out.println();
	System.out.println("Good bye!");
	
	}
	catch(IOException iox){
		System.out.println("cant read");
	}
	
	
	}	
	}
	
