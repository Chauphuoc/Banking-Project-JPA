package com.codegym.repository.deposit;

import com.codegym.model.Customer;
import com.codegym.model.Deposit;

import java.util.List;

public interface IDepositRepository {
    List<Deposit> findAllDeposit();

    Deposit findDepositByID(Long id);

    void save(Deposit deposit);

    void remove(Long id);
}