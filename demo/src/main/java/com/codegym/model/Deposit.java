package com.codegym.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "deposits")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "transaction_amount")
    private BigDecimal amount;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private int createdBy;

    @Column(name = "updated_at")
    private Date updateAt;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "updated_by")
    private int updatedBy;

    public Deposit(Long id, BigDecimal amount, Date createdAt, int createdBy, Date updateAt, boolean deleted, int updatedBy, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updateAt = updateAt;
        this.deleted = deleted;
        this.updatedBy = updatedBy;
        this.customer = customer;
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Date getDate() {
        return createdAt;
    }

    public void setDate(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Deposit(Long id, BigDecimal amount, Customer customer, Date createdAt) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
        this.createdAt = createdAt;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
    private Customer customer;

    public Deposit() {
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "id=" + id +
                ", amount=" + amount +
                ", customer=" + customer +
                '}';
    }
}