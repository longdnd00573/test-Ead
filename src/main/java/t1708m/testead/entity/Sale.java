package t1708m.testead.entity;

import javax.persistence.*;

@Entity
public class Sale {
    @Id
    private String SINo;
    private int SalesmanID;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProdID;
    private String SalesmanName;
    private String DOS;



    @ManyToMany(fetch = FetchType.LAZY, cascade =
            {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "sale_product",
            joinColumns = @JoinColumn(name = "sale_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))


    public String getSINo() {
        return SINo;
    }

    public void setSINo(String SINo) {
        this.SINo = SINo;
    }

    public int getSalesmanID() {
        return SalesmanID;
    }

    public void setSalesmanID(int salesmanID) {
        SalesmanID = salesmanID;
    }

    public int getProdID() {
        return ProdID;
    }

    public void setProdID(int prodID) {
        ProdID = prodID;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }

    public String getDOS() {
        return DOS;
    }

    public void setDOS(String DOS) {
        this.DOS = DOS;
    }
}
