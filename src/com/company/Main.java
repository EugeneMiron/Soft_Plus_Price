package com.company;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Integer> newPrice = new ArrayList<>();

    public static void main(String[] args) {


        int[] price = {5,100,20,66,16};
        decryptData(price,50,1,3);
        System.out.println(newPrice);

    }

    public static @Nullable ArrayList<Integer> decryptData(@NonNull int[] price,
                                                          @IntRange(from = 1) int discount,
                                                          @IntRange(from = 0) int offset,
                                                          @IntRange(from = 1) int readLength) {
        for (int i = offset; i < readLength+1; i++) {
            newPrice.add(price[i] = price[i]*discount/100);
        }
        return newPrice;
    }
}
