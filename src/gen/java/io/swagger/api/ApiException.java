package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T00:10:11.830+03:00")
public class ApiException extends Exception {
    private int code;
    
    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
