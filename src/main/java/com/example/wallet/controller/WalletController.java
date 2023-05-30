package com.example.wallet.controller;

import com.example.wallet.entity.Account;
import com.example.wallet.entity.Wallet;
import com.example.wallet.repository.AccountRepository;
import com.example.wallet.repository.WallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    private AccountRepository accountRepository;
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        List<Account> accounts = accountRepository.findAll();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAccountById(@PathVariable int id) {
        Account account = accountRepository.getAccountById(id);
        return ResponseEntity.ok(account);
    }
    @GetMapping("/balance")
    public ResponseEntity<?> getAccountByBalance(@RequestParam String balance) {
        List<Account> accounts = accountRepository.getAccountByBalance(balance);
        return ResponseEntity.ok(accounts);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateBalance(@PathVariable int id, @RequestParam(required = true) Integer balance) {
        Account account = accountRepository.getAccountById(id);
        account.getWallet().setBalance(balance);
        accountRepository.save(account);
        return ResponseEntity.ok(account);
    }
}
