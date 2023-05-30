package com.example.wallet.repository;

import com.example.wallet.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("select u from Account u join Wallet u1 on u.id = u1.id where u1.id = ?1")
    Account getAccountById (Integer id);

    @Query("select u from Account u join Wallet u1 on u.id = u1.id where u1.balance = ?1")
    List<Account> getAccountByBalance (String balance);
}
