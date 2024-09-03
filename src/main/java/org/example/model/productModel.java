package org.example.model;


import jakarta.persistence.*;

@Entity
public class productModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String product_name;
    private String product_category;

    private String product_qty;

    private String product_price;

    private String product_image;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getProduct_name()
    {
        return product_name;
    }

    public void setProduct_name(String product_name)
    {
        this.product_name = product_name;
    }

    public String getProduct_category()
    {
        return product_category;
    }

    public void setProduct_category(String product_category)
    {
        this.product_category = product_category;
    }

    public String getProduct_qty()
    {
        return product_qty;
    }

    public void setProduct_qty(String product_qty)
    {
        this.product_qty = product_qty;
    }

    public String getProduct_price()
    {
        return product_price;
    }

    public void setProduct_price(String product_price)
    {
        this.product_price = product_price;
    }

    public String getProduct_image()
    {
        return product_image;
    }

    public void setProduct_image(String product_image)
    {
        this.product_image = product_image;
    }

    @Override
    public String toString()
    {
        return "productModel{" +
            "id=" + id +
            ", product_name='" + product_name + '\'' +
            ", product_category='" + product_category + '\'' +
            ", product_qty='" + product_qty + '\'' +
            ", product_price='" + product_price + '\'' +
            ", product_image='" + product_image + '\'' +
            '}';
    }
}
