package com.example.app;

import java.util.ArrayList;

public class Global {
    public static double soloStartTime;
    public static double vsStartTime;
    public static double arcadeStartTime;
    public static boolean notStarted = true;
    public static int arcadeCounter;
    public static int moneyTotal;
    public static ArrayList<Double> soloTimes = new ArrayList();
    public static ArrayList<Double> vsTimes = new ArrayList();
    public static ArrayList<Double> arcadeTimes = new ArrayList();
    public static ArrayList<VsTime> vsObjs = new ArrayList();
    public static boolean blueNot = true;
    public String selectedColor = "pink";
}
