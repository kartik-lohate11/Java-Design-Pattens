package org.example.design.observer;

public class UserMain {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Subscriber kartik = new Subscriber("kartik");
        Subscriber aman = new Subscriber("Aman");
        Subscriber bhanu = new Subscriber("Bhanu");

        channel.subscribe(kartik);
        channel.subscribe(aman);
        channel.subscribe(bhanu);

        channel.alert();
    }
}
