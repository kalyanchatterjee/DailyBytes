package com.kalyanchatterjee;

public class Main {

    public static void main(String[] args) {
        // Day 1
	    ReverseString rs = new ReverseString();
	    rs.reverse("abcd");

        // Day 2
        PalindromeChecker pc = new PalindromeChecker();
        pc.check("apple");
        pc.check("m a d a ! m i'm adam");

        // Day 3
        VacuumCleanerRoute vcr = new VacuumCleanerRoute();
        vcr.returnsToOrigin("LR");
        vcr.returnsToOrigin("URURD");
        vcr.returnsToOrigin("RUULLDRD");
    }
}
