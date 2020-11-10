package com.kalyanchatterjee;

public class VacuumCleanerRoute {
    public void returnsToOrigin(String seq) {
        int[] position = {0, 0};

        for (int i = 0; i < seq.length(); i++) {
            switch(seq.charAt(i)) {
                case 'L':
                    position[0]--;
                    break;
                case 'R':
                    position[0]++;
                    break;
                case 'U':
                    position[1]++;
                    break;
                case 'D':
                    position[1]--;
                    break;
                default:
                    break;
            }
        }

        if (position[0] == 0 && position[1] ==0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
