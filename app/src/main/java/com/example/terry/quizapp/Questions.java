package com.example.terry.quizapp;

/**
 * Created by TERRY on 2017/06/20.
 */

public class Questions {


    public int Q1;
    public int Q2;
    public int Q3;

    final int CORRECT =1;
    final int INCORRECT =0;

    public Questions() {
    }

    public Questions(int q1, int q2, int q3) {
        Q1 = q1;
        Q2 = q2;
        Q3 = q3;
    }

    public int getQ1() {
        return Q1;
    }

    public void setQ1(int q1) {
        Q1 = q1;
    }

    public int getQ2() {
        return Q2;
    }

    public void setQ2(int q2) {
        Q2 = q2;
    }

    public int getQ3() {
        return Q3;
    }

    public void setQ3(int q3) {
        Q3 = q3;
    }

    public int getCORRECT() {
        return CORRECT;
    }

    public int getINCORRECT() {
        return INCORRECT;
    }
}

