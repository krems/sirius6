#!/usr/bin/env bash
swagger-codegen generate -i src/main/resources/open_api_spec.yml -l jaxrs -o .
mkdir client
swagger-codegen generate -i src/main/resources/open_api_spec.yml -l java -o ./client


#        <dependency>
#            <groupId>javax.validation</groupId>
#            <artifactId>validation-api</artifactId>
#            <version>1.1.0.Final</version>
#            <scope>compile</scope> <------------------- CHANGED FROM PROVIDED!!!
#        </dependency>
