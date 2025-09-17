package com.tns.finalkey;

final class SecureData {
    public void display() {
        System.out.println("Secure data access.");
    }
}

// Cannot extend SecureData
// class Hacker extends SecureData { } // This would cause an error

public class FinalClassDemo {
    public static void main(String[] args) {
        SecureData sd = new SecureData();
        sd.display();
    }
}
