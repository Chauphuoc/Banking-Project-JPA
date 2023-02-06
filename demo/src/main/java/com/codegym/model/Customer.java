package com.codegym.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(mappedBy = "customer")
    private List<Deposit> deposits;

    @OneToMany(mappedBy = "customer")
    private List<WithDraw> withDraws;

    public List<WithDraw> getWithDraws() {
        return withDraws;
    }

    public void setWithDraws(List<WithDraw> withDraws) {
        this.withDraws = withDraws;
    }

    public boolean isDeleted() {
        return deleted;
    }

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "balance")
    private BigDecimal balance =new BigDecimal(0);

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by")
    private int updatedBy;

    @Column(name = "deleted")
    private boolean deleted;


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Customer(Long id, List<Deposit> deposits, String full_name, String email, String phone, String address, BigDecimal balance, Date createdAt, int createdBy, Date updatedAt, int updatedBy, boolean deleted) {
        this.id = id;
        this.deposits = deposits;
        this.full_name = full_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.balance = balance;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
        this.deleted = deleted;
    }


    public int getUpdated_by() {
        return updatedBy;
    }

    public void setUpdated_by(int updated_by) {
        this.updatedBy = updated_by;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    public Customer() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public void setDeposits(List<Deposit> deposits) {
        this.deposits = deposits;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}