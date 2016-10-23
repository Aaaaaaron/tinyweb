package exception;

/**
 * Created by Melody on 2016/10/23.
 */
public class RenderingException extends RuntimeException {
    public RenderingException ( Exception e ) {
        super( e );
    }
}
