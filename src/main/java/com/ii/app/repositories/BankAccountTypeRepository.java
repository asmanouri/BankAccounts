package com.ii.app.repositories;

import com.ii.app.models.BankAccType;
import com.ii.app.models.enums.BankAccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BankAccountTypeRepository extends JpaRepository<BankAccType, Long> {
    BankAccType findByBankAccountType(BankAccountType bankAccountType);
}
