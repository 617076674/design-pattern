package creational.prototype.demo2.shallowclone;

public class Client {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setAddress(new Address());
        Customer customer2 = customer1.clone();
        System.out.println(customer1 == customer2); //false
        System.out.println(customer1.getAddress() == customer2.getAddress());   //true
    }
}