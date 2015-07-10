package com.hometask.prog.kiev.ua;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerRuner {

    public void customAction() {
        // write your code here
        //create object
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Customer customer5 = new Customer();

        //set id
        customer1.setId("01");
        customer2.setId("02");
        customer3.setId("03");
        customer4.setId("04");
        customer5.setId("05");

        //set Surname
        customer1.setSurname("Иванов");
        customer2.setSurname("Петров");
        customer3.setSurname("Сидоров");
        customer4.setSurname("Козлов");
        customer5.setSurname("Потапов");

        //set Name
        customer1.setName("Иван");
        customer2.setName("Борис");
        customer3.setName("Данил");
        customer4.setName("Кирил");
        customer5.setName("Семен");

        //set Patronymic
        customer1.setPatronymic("Семенович");
        customer2.setPatronymic("Кирилович");
        customer3.setPatronymic("Данилович");
        customer4.setPatronymic("Борисович");
        customer5.setPatronymic("Иванович");

        //set Address
        customer1.setAddress("Жилябова 2 кв. 4");
        customer2.setAddress("Артема 7 кв. 5");
        customer3.setAddress("Ленина 15 кв. 10");
        customer4.setAddress("Григорьева 11 кв. 14");
        customer5.setAddress("Смирнова Ласточки 17 кв. 20");

        //set credit card id
        customer1.setCreditCardId(19856757801L);
        customer2.setCreditCardId(19856757802L);
        customer3.setCreditCardId(19856757803L);
        customer4.setCreditCardId(19856757804L);
        customer5.setCreditCardId(19856757805L);

        // add customers to ArrayList customersList
      ArrayList<Customer> customersList = new ArrayList<Customer>();
        customersList.add(customer1);
        customersList.add(customer2);
        customersList.add(customer3);
        customersList.add(customer4);
        customersList.add(customer5);


        customersCardFilter(customersList);
        customersSernameFilter(customersList);

    }

  private  void customersCardFilter(ArrayList<Customer> customersList) {
        //customer which have Credit card in specified interval 19856757801 - 19856757803
        long customersFilter = 19856757803L;
        long customerVar;
        System.out.println("Выборка покупателей по фильтру кредитных карт <= 19856757803");
        for (Customer customerValue : customersList) {
            customerVar = customerValue.getCreditCardId();
            if (customersFilter <= customerVar)

                System.out.println("ФИО: " + customerValue.getSurname() + " " + customerValue.getName() + " " + customerValue.getPatronymic() + "" +
                        " Адресс: " + customerValue.getAddress() + " Номер карты: " + customerValue.getCreditCardId());
        }
    }

  private  void  customersSernameFilter(ArrayList<Customer> customersList) {
        //List of customers in alphabet order
        Map<String, Customer> customersMap = new HashMap<String, Customer>();
        String customerVarD;
        for (Customer customerValue : customersList) {
            customerVarD = customerValue.getSurname();
            customersMap.put(customerVarD, customerValue);
        }
        System.out.println();
        System.out.println("Выборка покупателей в алфавитном порядке:");

        for (Customer customersMapValue : customersMap.values()) {


            System.out.println("ФИО: " + customersMapValue.getSurname() + " " + customersMapValue.getName() + " " + customersMapValue.getPatronymic() + "" +
                    " Адресс: " + customersMapValue.getAddress() + " Номер карты: " + customersMapValue.getCreditCardId());

        }
    }


}
