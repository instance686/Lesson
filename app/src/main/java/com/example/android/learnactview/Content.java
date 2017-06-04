package com.example.android.learnactview;

import java.util.ArrayList;

/**
 * Created by ayush on 3/6/17.
 */

public class Content {
    private String subHeading;
    private String subHeadDescription;
    private ArrayList<Points> points;

    public Content(String subHeading, String subHeadDescription1, ArrayList<Points> points) {

        this.subHeading = subHeading;
        this.subHeadDescription = subHeadDescription1;
        this.points = points;
    }

    public String getSubHeadDescription() {
        return subHeadDescription;
    }

    public void setSubHeadDescription(String subHeadDescription) {
        this.subHeadDescription = subHeadDescription;
    }

    public ArrayList<Points> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Points> points) {
        this.points = points;
    }

    public String getSubHeading() {
        return subHeading;
    }

    public void setSubHeading(String subHeading) {
        this.subHeading = subHeading;
    }
}
