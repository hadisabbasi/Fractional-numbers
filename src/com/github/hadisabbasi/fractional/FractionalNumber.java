package com.github.hadisabbasi.fractional;

public class FractionalNumber {
    private int numerator;
    private int denominator;

    public FractionalNumber() {
        this(1, 1);
    }

    public FractionalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        // todo: validate parameter. if value > 0
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public FractionalNumber plus(FractionalNumber this, FractionalNumber c2) {
        int finalNumerator = this.numerator * c2.denominator + c2.numerator * this.denominator;
        int finalDenominator = this.denominator * c2.denominator;
        FractionalNumber result = new FractionalNumber(finalNumerator, finalDenominator);
        return result;
    }

    public FractionalNumber multiplication(FractionalNumber this, FractionalNumber c2) {
        int finalNumerator = this.numerator * c2.numerator;
        int finalDenominator = this.denominator * c2.denominator;
        FractionalNumber result = new FractionalNumber(finalNumerator, finalDenominator);
        return result;
    }

    public FractionalNumber subtraction(FractionalNumber this, FractionalNumber c2) {
        int finalNumerator = this.numerator * c2.denominator - this.denominator * c2.numerator;
        int finalDenominator = this.denominator * c2.denominator;
        FractionalNumber result = new FractionalNumber(finalNumerator, finalDenominator);
        return result;
    }

    public FractionalNumber division(FractionalNumber this, FractionalNumber c2) {
        int finalNumerator = this.numerator * c2.denominator;
        int finalDenominator = this.denominator * c2.numerator;
        FractionalNumber result = new FractionalNumber(finalNumerator, finalDenominator);
        return result;
    }

    public void print(FractionalNumber this) {
        System.out.println(numerator + "/" + denominator);
    }

}
