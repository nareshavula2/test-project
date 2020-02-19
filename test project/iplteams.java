package com.nubes.cj.basics;

public class iplteams {
	public static void main(String[] args) {
		
	
	String t = "Dc = Shreyas Iyer,11,- csk = Dhoni,11 ";
	String teams[] = t.split("-");

	
	System.out.println("----------------------------------");
	System.out.println("ipl2020 teams:");
	String team1 = teams[0];
	System.out.println(team1);
	
	String team2 = teams[1];
	System.out.println(team2);
	System.out.println("---------------------------------------");
	System.out.println("team1 details:");
	
	String teamName1 = team1.split("=")[0];
	System.out.println("name of the team1:"+teamName1);
	String CaptainName = team1.split("=")[1].split(",")[0];
	System.out.println("captain of team1 is: "+CaptainName);
	String team1Members = team1.split("=")[1].split(",")[1];
	System.out.println("number of team1 members is:"+team1Members);
	System.out.println("-------------------------------------------------");
	System.out.println("team2 details:");
	
	String teamName2 = team2.split("=")[0];
	System.out.println("name of the team2:"+teamName2);
	String CaptainName2 = team2.split("=")[1].split(",")[0];
	System.out.println("captain of team2 is: "+CaptainName2);
	String team2Members = team1.split("=")[1].split(",")[1];
	System.out.println("number of team2 members is:"+team2Members);
	
	
	
	

}
}
