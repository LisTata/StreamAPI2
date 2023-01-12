package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Mersenn {

    public static void main(String[] args) {
	/*
Простое число Мерсенна — это простое число, имеющее вид 2^P - 1.
Первыми простыми числами Мерсенна являются 3, 7, 31 и 127, соответствующие P = 2, 3, 5 и 7.
 */
        int[] arr=IntStream.iterate(1,i->i+1)
                .map(i->(int)Math.pow(2,i)-1)
                .filter(i->isPrime(i))
                .limit(7)
                .toArray();
        System.out.println(Arrays.toString(arr));
    }
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .allMatch(n -> number % n != 0);
    }
    /*
Шелдон из сериала "Теория большого взрыва" дал определение зеркальным простым числам.
Шелдон: Самое замечательное число — 73. Вы, скорее всего, теряетесь в догадках почему.
73 — это 21-ое простое число. Его зеркальное отражение 37 является 12-ым.
Найти несколько зеркальных простых чисел.
 */
}
