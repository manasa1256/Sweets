package ToolsQA.DemoMavenEclipseProject;

import java.util.ArrayList;

public class Gifts {
	public static ArrayList<Integer> wgt = new ArrayList<Integer>();
	public int getWeight(){
		int totalWeight = 0;
		for(int i=0; i<wgt.size(); i++){
			totalWeight += wgt.get(i);
		}
		return totalWeight;
	}
}
