package edu.hackeru;

public class Main {

    public static void main(String[] args) {
//        MoviesThread t = new MoviesThread();
//        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.println("Hye");
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.println("Bye");
                }
            }
        }).start();

    }
}
