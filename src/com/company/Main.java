package com.company;

public class Main {

    public static void main(String[] args) {
        String fullName = new String("Amanda Vollmar");
        String lowerFullName = new String ("amanda vollmar");
        fullName.equals(lowerFullName);
        fullName.equalsIgnoreCase(lowerFullName);
        int lengthOfFullName = fullName.length();
        String TotalFullName = fullName.concat(lowerFullName);
        char fourthLetter = fullName.charAt(3);
        System.out.println(lengthOfFullName + " " +TotalFullName + " "+ fourthLetter);
        System.out.println(fullName.equals(lowerFullName));
        System.out.println(fullName.equalsIgnoreCase(lowerFullName));

        String myName = new String("Elissa");
        String myTeamMateName = new String("Collin");

        System.out.println(myName.compareTo(myTeamMateName));
        System.out.println(myName.replace('i','z'));
        System.out.println(myName.substring(4));


    }
}
