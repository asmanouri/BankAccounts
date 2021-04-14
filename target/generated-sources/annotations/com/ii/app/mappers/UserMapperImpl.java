package com.ii.app.mappers;

import com.ii.app.dto.in.UserIn;
import com.ii.app.dto.out.UserOut;
import com.ii.app.models.user.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-13T22:08:06+0200",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1100.v20200828-0941, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userInToUser(UserIn userIn) {
        if ( userIn == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( userIn.getEmail() );
        user.setPassword( userIn.getPassword() );

        return user;
    }

    @Override
    public UserOut userToUserOut(User user) {
        if ( user == null ) {
            return null;
        }

        UserOut userOut = new UserOut();

        userOut.setEmail( user.getEmail() );
        userOut.setID( user.getID() );
        userOut.setIdentifier( user.getIdentifier() );
        userOut.setLocked( user.isLocked() );

        return userOut;
    }
}
