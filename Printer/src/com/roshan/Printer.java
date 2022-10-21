package com.roshan;

public class Printer {

    private int tonerLevel;
    private  int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if( tonerLevel >-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted =0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount >0 && tonerAmount<100){
            if((tonerAmount+ this.tonerLevel)> 100){
                return -1;
            }else {
                this.tonerLevel = (this.tonerLevel + tonerAmount);
            }

        }else {
            return -1;
        }

        return this.tonerLevel;
    }

    public int printPages (int pages){    // need to include isduplex here,

        int pagesToPrint = pages;


        if (this.duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("printing in duplex mode ");
        }

        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}