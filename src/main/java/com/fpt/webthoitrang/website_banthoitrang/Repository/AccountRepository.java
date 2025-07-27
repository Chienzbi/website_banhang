package com.fpt.webthoitrang.website_banthoitrang.Repository;

import com.fpt.webthoitrang.website_banthoitrang.Entity.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
    Account deleteById(long id);
    Account findById(long id);
    Account findByEmail(String email);
    Account findAccountByUsername(String username);
    List<Account> findAllById(long id);
    Page<Account> findByUsernameLike(String keywords, Pageable pageable);
}
