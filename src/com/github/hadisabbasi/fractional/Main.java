package com.github.hadisabbasi.fractional;
public class Main {
    public static void main(String[] args) {

        FractionalNumber firstNumber = new FractionalNumber(8,10);
        FractionalNumber secondNumber = new FractionalNumber(6,2);
        firstNumber.print();
        secondNumber.print();
        FractionalNumber resultPlus =firstNumber.plus(secondNumber);
        resultPlus.print();
        FractionalNumber resultMultiplication =firstNumber.multiplication(secondNumber);
        resultMultiplication.print();
        FractionalNumber resultSubtraction=firstNumber.subtraction(secondNumber);
        resultSubtraction.print();
        FractionalNumber resultDivision =firstNumber.division(secondNumber);
        resultDivision.print();



}}