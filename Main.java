package com.ak;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater("National", 26, 12);
        theater.getSeats();

        if(theater.reserveSeat("H11")){
            System.out.println("please pay");
        }else{
            System.out.println("Sorry seat is taken");
        }  if(theater.reserveSeat("H11")){
            System.out.println("please pay");
        }else{
            System.out.println("Sorry seat is taken");
        }
    }
}