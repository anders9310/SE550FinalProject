/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.antr.myapplication.backend;

import com.example.antr.myapplication.backend.data.User;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.UUID;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "loginApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.antr.example.com",
                ownerName = "backend.myapplication.antr.example.com",
                packagePath = ""
        )
)
public class LoginEndpoint {

    @ApiMethod(name = "loginByDevicePairing")
    public LoginBean login(@Named("deviceId") String deviceId) {
        LoginBean response = new LoginBean();

        //TODO: If the user with device ID is in the database, return the ID

        //If not, create a new user and return the username
        User user = new User();
        UUID userUUID = UUID.randomUUID();
        //TODO: generate username and save user to database
        String username = "user" + userUUID.toString();
        response.setUsername(deviceId);

        return response;
    }

}
