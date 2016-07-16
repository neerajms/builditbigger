/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.neeraj.myapplication.backend;

import com.example.JavaJoke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.neeraj.example.com",
                ownerName = "backend.myapplication.neeraj.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "freeJoke")
    public MyBean freeJoke() {
        MyBean response = new MyBean();
        JavaJoke javaJoke = new JavaJoke();
        String joke = javaJoke.getJoke();
        response.setData(joke);
        return response;
    }

    @ApiMethod(name = "paidJoke")
    public MyBean paidJoke() {
        MyBean response = new MyBean();
        JavaJoke javaJoke = new JavaJoke();
        String joke = javaJoke.getPaidJoke();
        response.setData(joke);
        return response;
    }
}
