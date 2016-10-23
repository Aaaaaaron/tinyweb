package exception;

/**
 * Created by Melody on 2016/10/23.
 */
public class ControllerException extends RuntimeException {
    private Integer statusCode;

    public ControllerException(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
