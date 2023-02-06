package com.codegym.service.deposit;

import com.codegym.model.Customer;
import com.codegym.model.Deposit;

import java.util.List;

public interface IDepositService {
    List<Deposit> findAllDeposits();

    Deposit findDepositByID(Long id);

    void save(Deposit deposit);

    void remove(Long id);
}