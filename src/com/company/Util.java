package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Util {

    int openKey1 = 83;
    int openKey2 = 2453;
    int openKey4 = 1177;
    int closeKey = 303;



    ArrayList<Integer> message = new ArrayList<>();
    ArrayList<Integer> messageDec = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> inputMessage(ArrayList<Integer> message){

        System.out.println("Enter count of letters: ");
        int count = scanner.nextInt();
        System.out.println("Enter code");
        for (int i = 0; i < count; i++){
            message.add(scanner.nextInt());
        }
        return  message;
    }

    public ArrayList<Integer> ASCIItoDec(ArrayList<Integer> message) {

        ArrayList<Integer> messageInDecArray = new ArrayList<>();
        for (Object o : message) {
            String stringMessage = o.toString();
            Integer messageInDec = Integer.parseInt(stringMessage, 16);
            messageInDecArray.add(messageInDec);
        }
        return messageInDecArray;
    }

    public ArrayList<Integer> decryption(ArrayList<Integer> arrayList, int openKey1, int openKey2) {
        ArrayList<Integer> decrArray = new ArrayList<>();
        for (Object o : arrayList) {
            int decrMassage = modPow((int) o, openKey1, openKey2);
            decrArray.add(decrMassage);
        }
        System.out.println("Зашивровка: " + decrArray);
        return decrArray;
    }

    public ArrayList<Integer> encryption(ArrayList<Integer> arrayList, int closeKey, int openKey2) {
        ArrayList<Integer> encrArray = new ArrayList<>();
        for (Object o : arrayList) {
            int decrMassage = modPow((int) o, closeKey, openKey2);
            encrArray.add(decrMassage);
        }
        System.out.println("Розшифровка " + encrArray);
        return encrArray;
    }

    public int modPow(int a, int b, int c) {
        int res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
            res %= c;
        }
        return res % c;
    }

}
