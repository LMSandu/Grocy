package com.endava.grocy.client;

import com.endava.grocy.filter.AuthentificationFilter;
import com.endava.grocy.filter.LogFilter;
import com.endava.grocy.util.EnvReader;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseClient {

    protected RequestSpecification getBasicRestConfig() {
        return given().filters(new AuthentificationFilter(), new LogFilter())
                .baseUri(EnvReader.getBaseURI())
                .port(EnvReader.getPort())
                .basePath(EnvReader.getBasePath());
    }
}
