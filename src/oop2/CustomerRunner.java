package oop2;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("line 1", "Seoul", "12345");
        Customer customer = new Customer("bug", homeAddress);

        Address workAddress = new Address("line 1 for work", "Seoul", "23456");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
