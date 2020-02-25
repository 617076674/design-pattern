package creational.prototype.demo2.deepclone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Customer customer1 = new Customer();
        customer1.setAddress(new Address());
        Customer customer2 = customer1.deepClone();
        System.out.println(customer1 == customer2); //false
        System.out.println(customer1.getAddress() == customer2.getAddress());   //false
    }
}