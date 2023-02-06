package com.codegym.repository.deposit;

import com.codegym.model.Deposit;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Transactional
public class DepositRepositoryImp implements IDepositRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Deposit> findAllDeposit() {
        TypedQuery query = entityManager.createQuery("SELECT c FROM Deposit c", Deposit.class);
        return query.getResultList();
    }

    @Override
    public Deposit findDepositByID(Long id) {
        TypedQuery<Deposit> query = entityManager.createQuery("SELECT c FROM Deposit c WHERE c.id=:id",Deposit.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(Deposit deposit) {
        if (deposit.getId() != null) {
            entityManager.merge(deposit);
        } else {
            entityManager.persist(deposit);
        }
    }

    @Override
    public void remove(Long id) {

    }
}