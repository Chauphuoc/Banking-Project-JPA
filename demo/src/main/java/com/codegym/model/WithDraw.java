package com.codegym.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "withdraws")
public class WithDraw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "created_by")
    private int created_by;

    @Column(name = "deleted")
    private boolean deleted;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "updated_by")
    private int updated_by;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, referencedColumnName = "id")
    private Customer customer;

    @Column(name = "transaction_amount")
    private BigDecimal transaction_amount;

    public WithDraw() {
    }

    public WithDraw(int id, Date created_at, int created_by, boolean deleted, Date updated_at, int updated_by, Customer customer, BigDecimal transaction_amount) {
        this.id = id;
        this.created_at = created_at;
        this.created_by = created_by;
        this.deleted = deleted;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
        this.customer = customer;
        this.transaction_amount = transaction_amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public int getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(int updated_by) {
        this.updated_by = updated_by;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(BigDecimal transaction_amount) {
        this.transaction_amount = transaction_amount;
    }
}
