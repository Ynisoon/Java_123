package VarA_Task2_Chapter3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerManager {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    //список покупателей в алфавитном порядке
    public void printCustomersSortedByLastName() {
        customers.sort(Comparator.comparing(Customer::getLastName));
        System.out.println("Покупатели в алфавитном порядке:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    //список покупателей, у которых номер кредитной карты в заданном диапазоне
    public void printCustomersWithCreditCardInRange(String min, String max) {
        System.out.println("Покупатели с картами в диапазоне " + min + " - " + max + ":");
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo(min) >= 0 &&
                    customer.getCreditCardNumber().compareTo(max) <= 0) {
                System.out.println(customer);
            }
        }
    }

    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Добавляем клиентов
        manager.addCustomer(new Customer(1, "Иванов", "Иван", "Иванович", "Москва", "1234567890123456", "R12345678"));
        manager.addCustomer(new Customer(2, "Петров", "Петр", "Петрович", "Санкт-Петербург", "2234567890123456", "R22345678"));
        manager.addCustomer(new Customer(3, "Сидоров", "Алексей", "Александрович", "Казань", "3234567890123456", "R32345678"));

        // Вывод отсортированного списка
        manager.printCustomersSortedByLastName();

        // Вывод списка по диапазону карт
        manager.printCustomersWithCreditCardInRange("2000000000000000", "3000000000000000");
    }

}
