package com.itheima.mapper;

import com.itheima.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    public void save(Account account);

    public List<Account> findAll();
}
