package com.codegym.service.deposit;

import com.codegym.model.Deposit;
import com.codegym.repository.deposit.IDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DepositServiceImp implements  IDepositService {
    @Autowired
    private IDepositRepository depositRepository;

    @Override
    public List<Deposit> findAllDeposits() {
        return null;
    }

    @Override
    public Deposit findDepositByID(Long id) {
        return null;
    }

    @Override
    public void save(Deposit deposit) {
        depositRepository.save(deposit);
    }

    @Override
    public void remove(Long id) {

    }
}