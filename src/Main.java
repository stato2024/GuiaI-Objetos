import model.BankAccount;
import model.ItemVenta;
import service.ServiceBank;
import service.ServiceItem;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ServiceItem serviceItem = new ServiceItem();
        ItemVenta I1;
        System.out.println("Ejercicio 3");
        I1 = serviceItem.CreateItem(1,"Cafe",20, 2000.0);
        serviceItem.calcularPrecioTotal(I1);
        serviceItem.ImprimirItem(I1);
        System.out.println("Ejercicio 4");
        ServiceBank serviceBank = new ServiceBank();
        BankAccount A1;
        A1 = serviceBank.createAccount(1,"marcosr_87",15000.0);
        serviceBank.ImprimirAccount(A1);
        serviceBank.credito(A1,2500.0);
        serviceBank.debito(A1,1500.0);
        serviceBank.debito(A1,30000.0);
        serviceBank.ImprimirAccount(A1);



    }
}