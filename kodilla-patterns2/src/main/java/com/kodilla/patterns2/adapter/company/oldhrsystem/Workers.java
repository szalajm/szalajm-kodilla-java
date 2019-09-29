package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    public String[][] workers = {
            {"82012407017", "Jas", "Fasola"},
            {"76120214017", "Malgosia", "Niezgodka"},
            {"41050134501", "Jedrzej", "Pachete"},
            {"82041003012", "Tomek", "Pawlowski"},
            {"84031202104", "Marzena", "Migdal"}};


    public double[] salaries = {
            4500.0,
            7000.0,
            3500.0,
            9000.0,
            6500.0};


    public String getWorker( int n) {
        if(n> salaries.length){
            return "";
        }

        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers(){
        return workers;
    }

    public double[] getSalaries(){
        return salaries;
    }
}