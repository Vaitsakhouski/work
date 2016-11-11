package com.company;

import java.util.List;
import java.util.Scanner;

/**
 * Class, which save objects
 */
public class Goods {
    private ListGoods[] listgoods;
    private String type;
    private String name;
    private double count;
    private double cost;

    class ListGoods {
        private String type;
        private String name;
        private double count;
        private double cost;
        private double totalCost;

        /**
         * Inicial params
         *
         * @param type  - type of goods
         * @param name  - name of type of goods
         * @param count - count of goods
         * @param cost  - cost of goods
         */
        public ListGoods(String type, String name, double count, double cost) {
            this.type = type;
            this.name = name;
            this.count = count;
            this.cost = cost;
        }

        public String getType() {
            return this.type;
        }

        public String getName() {
            return this.name;
        }

        public double getCount() {
            return this.count;
        }

        public double getCost() {
            return this.cost;
        }
    }

    /**
     * Method, which fill massive by objects
     */
    public void setList() {
        String s = null;
        String b = "yes";
        int k = 0;
        int w = 0;
        System.out.println("How much?");
        Scanner scc = new Scanner(System.in);
        k = scc.nextInt();
        listgoods = new ListGoods[k];
        for (int i = 0; i < listgoods.length; i++) {
            System.out.println("write type of goods - ");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                this.type = sc.nextLine();
            }
            System.out.println("write name of goods - ");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.hasNextLine()) {
                this.name = sc1.nextLine();
            }
            System.out.println("write count of goods - ");
            Scanner sc2 = new Scanner(System.in);
            if (sc2.hasNextDouble()) {
                this.count = sc2.nextDouble();
            }
            System.out.println("write cost of goods - ");
            Scanner sc3 = new Scanner(System.in);
            if (sc3.hasNextDouble()) {
                this.cost = sc3.nextDouble();
            }
            System.out.println("add more?");
            Scanner sc4 = new Scanner(System.in);
            s = sc4.nextLine();
            if (s.equals(b)) {
                int n = 0;
                Scanner scv = new Scanner(System.in);
                System.out.println("How much?");
                n = scv.nextInt();
                listgoods = new ListGoods[k + n];
            }
            listgoods[i] = new ListGoods(type, name, count, cost);
        }
    }

    /**
     * Method, which prints objects
     */
    public void show() {
        if (listgoods.length != 0) {
            for (int i = 0; i < listgoods.length; i++) {
                System.out.print("Type - " + " " + this.listgoods[i].getType() + " || name - " + this.listgoods[i].getName() + " || cost - " + this.listgoods[i].getCost()
                        + " || count - " + this.listgoods[i].getCount() + "\n");
            }
        }
    }
}