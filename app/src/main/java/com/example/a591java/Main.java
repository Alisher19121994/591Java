package com.example.a591java;

import java.util.ArrayList;

public class Main {
    ArrayList<Feeds> feeds = new ArrayList<>();
    Story story;
    boolean isHeaders;

    public Main(ArrayList<Feeds> feeds) {
        this.feeds = feeds;
        this.isHeaders = false;
    }

    public Main(Story story) {
        this.story = story;
        this.isHeaders = false;
    }

    public Main() {
        this.isHeaders = true;
    }
}
