package com.ak;

import java.util.*;

public class Theater {
    private final String theaterName;
    private List<Seat> seats=new ArrayList<>();


    public String getTheaterName() {
        return theaterName;
    }

    public Theater(String theaterName, int numRow, int seatsPerRow) {
        this.theaterName = theaterName;


        int lastRow= 'A' + (numRow-1);
        for(char rows='A';rows<=lastRow;rows++){
            for (int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(rows + String.format("%02d",seatNum));
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat s : seats) {
            if (s.getSeatNumber().equals(seatNumber)) {
                requestedSeat = s;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("there is no seat");
            return false;
        }
        return requestedSeat.reserve();
    }
            public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }

    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved=false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+ seatNumber + " reserved");
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean cancel(){
            if(this.reserved){
                reserved=false;
                System.out.println("Reservation of seat "+ seatNumber+" Cancelled");
                return true;
            }
            else{
                return false;
            }
        }


    }





}
