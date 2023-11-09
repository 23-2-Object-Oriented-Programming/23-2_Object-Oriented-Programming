package org.example.week9.p1;

public class ColorTV extends TV{
    private int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public void printProperty(){
        System.out.println(super.getSize() + "인치 " + this.color + "컬러");
    }
}
