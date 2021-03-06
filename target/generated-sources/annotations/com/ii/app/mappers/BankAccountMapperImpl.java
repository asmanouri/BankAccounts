package com.ii.app.mappers;

import com.ii.app.dto.out.BankAccountOut;
import com.ii.app.dto.out.SaldoOut;
import com.ii.app.models.BankAccount;
import com.ii.app.models.Saldo;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-13T22:08:05+0200",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1100.v20200828-0941, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class BankAccountMapperImpl implements BankAccountMapper {

    @Autowired
    private SaldoMapper saldoMapper;
    @Autowired
    private BankAccTypeMapper bankAccTypeMapper;

    @Override
    public BankAccountOut entityToDTO(BankAccount bankAccount) {
        if ( bankAccount == null ) {
            return null;
        }

        BankAccountOut bankAccountOut = new BankAccountOut();

        bankAccountOut.setBankAccType( bankAccTypeMapper.entityToDto( bankAccount.getBankAccType() ) );
        bankAccountOut.setId( bankAccount.getId() );
        bankAccountOut.setNumber( bankAccount.getNumber() );
        bankAccountOut.setRemoved( bankAccount.isRemoved() );
        bankAccountOut.setSaldos( saldoSetToSaldoOutSet( bankAccount.getSaldos() ) );

        return bankAccountOut;
    }

    protected Set<SaldoOut> saldoSetToSaldoOutSet(Set<Saldo> set) {
        if ( set == null ) {
            return null;
        }

        Set<SaldoOut> set1 = new HashSet<SaldoOut>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Saldo saldo : set ) {
            set1.add( saldoMapper.saldoToSaldoOut( saldo ) );
        }

        return set1;
    }
}
