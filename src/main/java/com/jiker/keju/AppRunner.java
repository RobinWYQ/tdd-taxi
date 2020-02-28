package com.jiker.keju;

public class AppRunner {

    public static void main(String[] args) {
        String testDataFile = args[0];
        String receipt = "";
        ReadFile readFile = new ReadFile();
        String text = readFile.readFile(testDataFile);
        for(String line: text.split("\n")){
            ReadPara readPara = new ReadPara(line);
            Taxi taxi = new Taxi(readPara.getDistance(),
                    readPara.getWaitTime());
            receipt += taxi.getReceipt() + "\n";
        }
        System.out.println(receipt);
    }
}
