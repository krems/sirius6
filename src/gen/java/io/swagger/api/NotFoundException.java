package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-01-17T10:00:02.220+03:00")
public class NotFoundException extends ApiException {
    private int code;
    
    public NotFoundException(int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
