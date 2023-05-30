package com.example.wallet;

import com.example.wallet.entity.Account;
import com.example.wallet.entity.Wallet;
import com.example.wallet.repository.AccountRepository;
import com.example.wallet.repository.WallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WalletApplication implements CommandLineRunner {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private WallerRepository wallerRepository;

    public static void main(String[] args) {
        SpringApplication.run(WalletApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Wallet wallet = new Wallet();
//        wallet.setBalance(200000);
//        wallerRepository.save(wallet);
//
//
//        Account account = new Account();
//        account.setUsername("Quan");
//        account.setPassword("123456");
//        account.setWallet(wallet);
//        accountRepository.save(account);


    }
}
