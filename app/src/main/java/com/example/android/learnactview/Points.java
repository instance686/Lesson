package com.example.android.learnactview;

/**
 * Created by ayush on 3/6/17.
 */

public class Points {
    private String pointHead;
    private String pointDesciption;
    private String javaCode;
    private String kotlinCode;

    public Points(String pointHead, String pointDesciption, String javaCode, String kotlinCode) {
        this.pointHead = pointHead;
        this.pointDesciption = pointDesciption;
        this.javaCode = javaCode;
        this.kotlinCode = kotlinCode;
    }

    public String getPointHead() {
        return pointHead;
    }

    public void setPointHead(String pointHead) {
        this.pointHead = pointHead;
    }

    public String getPointDesciption() {
        return pointDesciption;
    }

    public void setPointDesciption(String pointDesciption) {
        this.pointDesciption = pointDesciption;
    }

    public String getJavaCode() {
        return javaCode;
    }

    public void setJavaCode(String javaCode) {
        this.javaCode = javaCode;
    }

    public String getKotlinCode() {
        return kotlinCode;
    }

    public void setKotlinCode(String kotlinCode) {
        this.kotlinCode = kotlinCode;
    }
}
