package com.example.android.learnactview;

import java.util.ArrayList;

/**
 * Created by ayush on 3/6/17.
 */

public class Row {

    private ArrayList<Content> contents;

    public Row(ArrayList<Content> contents) {

        this.contents = contents;
    }



    public ArrayList<Content> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }
}
