package Restorant;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

  public Menu() {
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<Fatura> list_fatura = new ArrayList<>();

    while (true) {
      System.out.println(
          "\nCan I take your order :\n1.Sandwich 2.Drinks 3.Hotdog 4.Coffee 5.Pizza 6.Donuts 0.Exit");
      int choice = input.nextInt();

      if (choice == 0) {
        break;
      }

      System.out.println("Input amount :");
      int amount = input.nextInt();

      if (choice == 1) {
        list_fatura.add(new Fatura(80, "Sandwich", amount));
      } else if (choice == 2) {
        list_fatura.add(new Fatura(40, "Drinks", amount));
      } else if (choice == 3) {
        list_fatura.add(new Fatura(50, "Hotdog", amount));
      } else if (choice == 4) {
        list_fatura.add(new Fatura(20, "Coffee", amount));
      } else if (choice == 5) {
        list_fatura.add(new Fatura(60, "Pizza", amount));
      } else if (choice == 6) {
        list_fatura.add(new Fatura(70, "Donuts", amount));
      } else {
        System.out.println("ERROR Input!");
      }
    }

    double total = 0;

    if (list_fatura.size() != 0) {
      for (Fatura fatura : list_fatura) {
        double price_temp = fatura.getPrice() * fatura.getAmount();

        System.out.println(
            fatura.getProductName() +
                "    " +
                fatura.getAmount() +
                " Cope" +
                "    " +
                price_temp +
                " ALL");
        total += price_temp;
      }
    }
    System.out.println("\nTotali = " + total + " ALL");

    input.close();
  }

  @Override
  public String toString() {
    return "Menu []";
  }
}
