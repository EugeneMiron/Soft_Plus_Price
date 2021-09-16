package com.company;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> newPrice = new ArrayList<>();
    
    public static void main(String[] args) {
        int[] price = {5,100,20,66,16};
        decryptData(price,50,1,4);
        System.out.println(newPrice);
    }

    public static ArrayList<Integer> decryptData(@NonNull int[] price,
                                                 @IntRange(from = 1) int discount,
                                                 @IntRange(from = 0) int offset,
                                                 @IntRange(from = 1) int readLength) {
        if (discount < 0 | offset < 0 | readLength < 0){
            System.out.println("введите верные значения");
            return null;
        }
        if(discount > 99){
            System.out.println("скидка не может быть больше 99%");
            return null;
        }
        int tempPrice;
        for (int i = offset; i < readLength; i++) {
            if (price[i] < 0){
                System.out.println("в индексе " + readLength + " неверное значение =" +  " " + price[i]);
                break;
            }
            tempPrice = (price[i]*discount/100);
            newPrice.add((price[i] - tempPrice));
        }
        return newPrice;
    }
}
