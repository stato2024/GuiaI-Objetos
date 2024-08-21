package service;

import model.ItemVenta;

public class ServiceItem {
    public ServiceItem() {
    }

    public ItemVenta CreateItem (Integer id, String description, Integer quantity, Double price){
        return new ItemVenta(id,description,quantity,price);

    }

    public void calcularPrecioTotal ( ItemVenta item ){
        item.setPricetotal(item.getPrice()* item.getQuantity());
    }

    public void ImprimirItem (ItemVenta itemVenta){
        System.out.println("Item Venta[id :" + itemVenta.getId() + " descripcion :" + itemVenta.getDescription() + " cantidad :" + itemVenta.getQuantity() + " PrecioUnit : " + itemVenta.getPrice() + " PreioTotal :" + itemVenta.getPricetotal() + "]");
    }
}
