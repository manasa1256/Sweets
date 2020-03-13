package ToolsQA.DemoMavenEclipseProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App extends Gifts
{
    public static void main( String[] args )
    {
    	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
    		// TODO Auto-generated method stub
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter no of choclates : ");
        	int no_of_choclates = sc.nextInt();
        	for (int i=0; i<no_of_choclates; i++){
        		System.out.println("Enter choclate type 0 / 1: ");
        		int choclate_type = sc.nextInt();
        		System.out.println("Enter weight of choclate : ");
        		int choclateWeight = sc.nextInt();
        		System.out.println("Enter price of choclate : ");
        		int choclatePrice = sc.nextInt();
        		String candyName = null;
        		if (choclate_type == 1){
        			System.out.println("Enter name of the candy : ");
        			candyName = sc.next();
        			tm.put(choclateWeight,  candyName);
        			wgt.add(choclateWeight);
        		}
        	}
    	
        Sweets s1 = new Sweets(50, 80);
        Sweets s2 = new Sweets(20, 60);
        Sweets s3 = new Sweets(40, 50);
        Sweets s4 = new Sweets(30, 40);
        Gifts g = new Gifts();
        System.out.println("Total Weight = "+g.getWeight());
        System.out.println("Sorting choclates based on weight : ");
        Choclates c = new Choclates();
        c.sortChoclates(tm);
        System.out.println("Enter lower limit and upper limit : ");
        int ll = sc.nextInt();
        int ul = sc.nextInt();
        c.getChoclatesInRange(ll, ul, tm);
    } 
}
