package com.ii.app.mappers;

import com.ii.app.dto.in.CurrencyTypeIn;
import com.ii.app.dto.out.CurrencyTypeOut;
import com.ii.app.models.CurrencyType;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-13T22:08:05+0200",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1100.v20200828-0941, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class CurrencyTypeMapperImpl implements CurrencyTypeMapper {

    @Override
    public CurrencyType DTOtoEntity(CurrencyTypeIn currencyTypeIn) {
        if ( currencyTypeIn == null ) {
            return null;
        }

        CurrencyType currencyType = new CurrencyType();

        if ( currencyTypeIn.getExchangeRate() != null ) {
            currencyType.setExchangeRate( currencyTypeIn.getExchangeRate().floatValue() );
        }

        return currencyType;
    }

    @Override
    public CurrencyTypeOut entityToDTO(CurrencyType currencyType) {
        if ( currencyType == null ) {
            return null;
        }

        CurrencyTypeOut currencyTypeOut = new CurrencyTypeOut();

        currencyTypeOut.setExchangeRate( currencyType.getExchangeRate() );
        currencyTypeOut.setId( currencyType.getId() );
        currencyTypeOut.setName( currencyType.getName() );

        return currencyTypeOut;
    }
}
