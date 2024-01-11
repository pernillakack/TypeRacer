package com.fredrik.typeRacer;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import static java.lang.Math.round;

public class TypeRacerGame {
    
    
    Scanner scanner = new Scanner(System.in);
    String[] orgSentance
    
    public void startGame(String sentence) {
        // TODO: Refine this method
        
        Instant start = startStopWatch();
        System.out.println("Type the following sentence as fast as you can:");
        System.out.println(sentence);
        
        String userInput = scanner.nextLine();
        
        boolean isCorrect = userInput.equals(sentence);
//        Dela upp sentence i ord, lägg i arraylist,
//        dela upp input i ord och lägg i arrayList,
//        se vilka
        
        System.out.println(isCorrect ? "Correct!" : "Incorrect!");
        Instant end = stopStopwatch();
        System.out.println(calculateStopWatch(start, end));
        
        
    }
    
    public void divideString(String s, String[] array){
        String[] tempArr = s.split(" ");
        
    }
    
    
    private double calculateStopWatch(Instant start, Instant end) {
        int nano = Duration.between(start, end).getNano();
        return nano / 9.0;
    }
    
    
    private Instant stopStopwatch() {
        return Instant.now();
        
    }
    
    
    public Instant startStopWatch() {
        return Instant.now();
    }
    
    
    public double wPM(double seconds, int noOfWords) {
        int minutes = (int) seconds / 60;
        double wPM = noOfWords / minutes;
        return wPM;
        
    }
    
    
    
    
}
