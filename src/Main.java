import model.Customer;
import model.Items;
import model.Order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Items i1 = new Items("chicken momo", "food","momo");
        Items i2 = new Items("chicken fried rice", "lunch","fried rice");
        Items i3 = new Items("chicken pizza", "lunch","pizza");
        Items i4 = new Items("chicken rolls", "Snacks","rolls");
        Items i5 = new Items("chicken biryani", "lunch","biryani");
        Items i6 = new Items("tuna sushi", "Snacks","sushi");

        ArrayList<Items> Items1 = new ArrayList<>();
        Items1.add(i1);
        Items1.add(i2);

        ArrayList<Items> Items2 = new ArrayList<>();
        Items2.add(i3);
        Items2.add(i4);

        ArrayList<Items> Items3 = new ArrayList<>();
        Items2.add(i5);
        Items2.add(i6);



        Order o1 = new Order("Ashraya", Items1);
        Order o2 = new Order("Ram",  Items2);
        Order o3 = new Order("Lakhan",  Items2);

        ArrayList<Order> customer1order = new ArrayList<>();
        customer1order.add(o1);

        ArrayList<Order> customer2order = new ArrayList<>();
        customer2order.add(o2);

        ArrayList<Order> customer3order = new ArrayList<>();
        customer3order.add(o3);

        Customer c1 = new Customer(1, customer1order, 200);
        Customer c2 = new Customer(2, customer2order, 175);
        Customer c3 = new Customer(3, customer2order, 150);

        i1.getItemDetails();
        c1.getInvoice(500.35);
    }
}