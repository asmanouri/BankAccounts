package com.ii.app.mappers;

import com.ii.app.dto.in.ExchangeCurrencyIn;
import com.ii.app.dto.out.ExchangeCurrencyOut;
import com.ii.app.models.ExchangeCurrency;
import java.math.BigDecimal;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-13T22:08:05+0200",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1100.v20200828-0941, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class ExchangeCurrencyMapperImpl implements ExchangeCurrencyMapper {

    @Override
    public ExchangeCurrency DTOtoEntity(ExchangeCurrencyIn exchangeCurrencyIn) {
        if ( exchangeCurrencyIn == null ) {
            return null;
        }

        ExchangeCurrency exchangeCurrency = new ExchangeCurrency();

        exchangeCurrency.setBalance( exchangeCurrencyIn.getBalance() );
        exchangeCurrency.setDestCurrency( exchangeCurrencyIn.getDestCurrency() );
        exchangeCurrency.setSourceCurrency( exchangeCurrencyIn.getSourceCurrency() );

        return exchangeCurrency;
    }

    @Override
    public ExchangeCurrencyOut entityToDTO(ExchangeCurrency exchangeCurrency) {
        if ( exchangeCurrency == null ) {
            return null;
        }

        ExchangeCurrencyOut exchangeCurrencyOut = new ExchangeCurrencyOut();

        exchangeCurrencyOut.setBalance( BigDecimal.valueOf( exchangeCurrency.getBalance() ) );
        exchangeCurrencyOut.setDestCurrency( exchangeCurrency.getDestCurrency() );

        return exchangeCurrencyOut;
    }
}
