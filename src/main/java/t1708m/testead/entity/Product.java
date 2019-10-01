package t1708m.testead.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product detail")
public class Product {
    @Id
    private int ProdID;
    private String ProdName;
    private String Description;
    private String DateOfManf;
    private double Price;


    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        ProdName = prodName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDateOfManf() {
        return DateOfManf;
    }

    public void setDateOfManf(String dateOfManf) {
        DateOfManf = dateOfManf;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
