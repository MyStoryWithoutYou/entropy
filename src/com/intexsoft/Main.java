package com.intexsoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Введите значение N: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;
        String StrN = reader.readLine();
        int N = Integer.parseInt(StrN);
        ArrayList<Double> drv = new ArrayList<>();
        System.out.print("Введите p д.с.в.:");
        for (int i = 1; i < N + 1; i++){
            String StrP = reader.readLine();
            double P = Double.parseDouble(StrP);
            if (0 < P & P > 1){
                System.out.print("Значение вероятности было введено неверно.");
            }
            drv.add(P);
        }
        double entropy = 0;
        for (int i = 0; i < drv.size(); i++) {
            entropy += drv.get(i) * Math.log(drv.get(i));
        }
        System.out.print("Значение энтропии: " + -1 * entropy);
    }
}
