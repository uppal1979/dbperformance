package com.mkyong.model;

import java.util.Date;

public class MCTESTTBL {



   String FIELD1;
    String FIELD2;
    int FIELD3;
    String FIELD4;

    public MCTESTTBL(String FIELD1, String FIELD2, int FIELD3, String FIELD4, int FIELD5, String FIELD6, int CREATE_TIMESTAMP) {
        this.FIELD1 = FIELD1;
        this.FIELD2 = FIELD2;
        this.FIELD3 = FIELD3;
        this.FIELD4 = FIELD4;
        this.FIELD5 = FIELD5;
        this.FIELD6 = FIELD6;
        this.CREATE_TIMESTAMP = CREATE_TIMESTAMP;
    }

    public String getFIELD1() {
        return FIELD1;
    }

    public void setFIELD1(String FIELD1) {
        this.FIELD1 = FIELD1;
    }

    public String getFIELD2() {
        return FIELD2;
    }

    public void setFIELD2(String FIELD2) {
        this.FIELD2 = FIELD2;
    }

    public int getFIELD3() {
        return FIELD3;
    }

    public void setFIELD3(int FIELD3) {
        this.FIELD3 = FIELD3;
    }

    public String getFIELD4() {
        return FIELD4;
    }

    public void setFIELD4(String FIELD4) {
        this.FIELD4 = FIELD4;
    }

    public int getFIELD5() {
        return FIELD5;
    }

    public void setFIELD5(int FIELD5) {
        this.FIELD5 = FIELD5;
    }

    public String getFIELD6() {
        return FIELD6;
    }

    public void setFIELD6(String FIELD6) {
        this.FIELD6 = FIELD6;
    }

    public int getCREATE_TIMESTAMP() {
        return CREATE_TIMESTAMP;
    }

    public void setCREATE_TIMESTAMP(int CREATE_TIMESTAMP) {
        this.CREATE_TIMESTAMP = CREATE_TIMESTAMP;
    }

    int FIELD5;
    String FIELD6;
    int CREATE_TIMESTAMP;

}
