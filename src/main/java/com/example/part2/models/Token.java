package com.example.part2.models;


import jakarta.persistence.*;

@Entity
@Table(name="tokens")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name",unique = true)
    private String name;
    @Column(name="emission")
    private String emission;
    @Column(name = "price")
    private Integer price;

    public Token(){}

    public Token(String name, String emission, Integer price) {
        this.name = name;
        this.emission = emission;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emission='" + emission + '\'' +
                ", price=" + price +
                '}';
    }
}
