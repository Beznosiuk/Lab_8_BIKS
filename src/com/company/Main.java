package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Util util = new Util();


//        util.decryption(util.ASCIItoDec(util.inputMessage(util.message)), util.openKey1, util.openKey2);

        ArrayList<Integer> a = util.encryption(util.inputMessage(util.message), util.closeKey, util.openKey4);




    }
}
