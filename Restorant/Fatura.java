package Restorant;

public class Fatura {

    private double price;
    private String name;
    private int amount;

    public Fatura(double p, String n, int a) {
        price = p;
        name = n;
        amount = a;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public void setname(String n) {
    }

    public String getname() {
        return name;
    }

    public void setAmount(int a) {
        amount = a;
    }

    public int getAmount() {
        return amount;
    }

    public String getProductName() {
        return null;
    }
}