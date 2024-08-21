import model.ItemVenta;
import service.ServiceItem;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ServiceItem serviceItem = new ServiceItem();
        ItemVenta I1;

        I1 = serviceItem.CreateItem(1,"Cafe",20, 2000.0);
        serviceItem.calcularPrecioTotal(I1);
        serviceItem.ImprimirItem(I1);

    }
}