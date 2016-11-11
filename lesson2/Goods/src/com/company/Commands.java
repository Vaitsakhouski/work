package com.company;

import java.util.Scanner;

/**
 * Class with user's commands
 */
public class Commands {
    private ListCommands[] listcommands;

    /**
     * method, in which choosing
     * user's command
     */
    public void Commands() {
        String a = "countTypes";
        String b = "countAll";
        String c = "averagePrice";
        String q = null;
        listcommands = new ListCommands[3];
        for (int i = 0; i < listcommands.length; i++) {
            System.out.println("choose command :countTypes, countAll , averagePrice");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                q = sc.nextLine();
            }
            if (q.equals(a)) {
                CountTypes countTypes = new CountTypes();
            } else if (q.equals(b)) {
                CountAll countAll = new CountAll();
            } else if (q.equals(c)) {
                AveragePrice averagePrice = new AveragePrice();
            }
            listcommands[i] = new ListCommands();
        }
    }

    class ListCommands {
    }
}