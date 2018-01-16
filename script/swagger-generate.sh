#!/usr/bin/env bash
swagger-codegen generate -i src/main/resources/open_api_spec.yml -l jaxrs -o .
mkdir client
swagger-codegen generate -i src/main/resources/open_api_spec.yml -l java -o ./client

