# Swagger Jersey generated server

## Overview
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project. By using the 
[OpenAPI-Spec](https://github.com/swagger-api/swagger-core/wiki) from a remote server, you can easily generate a server stub.  This
is an example of building a swagger-enabled JAX-RS server.

This example uses the [JAX-RS](https://jax-rs-spec.java.net/) framework.

To run the server, please execute the following:

```
mvn clean package jetty:run
```

You can then view the swagger listing here:

```
http://localhost:8080/taxi/swagger.json
```

Note that if you have configured the `host` to be something other than localhost, the calls through
swagger-ui will be directed to that host and not localhost!