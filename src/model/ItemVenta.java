package model;

public class ItemVenta {

    private Integer id;
    private String description;
    private Integer quantity;
    private Double price;
    private Double pricetotal;

    public ItemVenta(Integer id, String description, Integer quantity, Double price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPricetotal() {
        return pricetotal;
    }

    public void setPricetotal(Double pricetotal) {
        this.pricetotal = pricetotal;
    }
}
