package com.example.parsaniahardik.recyclerviewheaderfooter;

public class FooterModle {

    private boolean isHeader = false;
    private boolean isFooter = true;

    public boolean isHeader() {
        return isHeader;
    }

    public void setHeader(boolean header) {
        isHeader = header;
    }

    public boolean isFooter() {
        return isFooter;
    }

    public void setFooter(boolean footer) {
        isFooter = footer;
    }
}
