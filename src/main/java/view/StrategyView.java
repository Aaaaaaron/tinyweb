package view;

import exception.RenderingException;

import java.util.List;
import java.util.Map;

/**
 * Created by Melody on 2016/10/20.
 */
public class StrategyView implements View {

    private RenderingStrategy viewRenderer;

    public StrategyView ( RenderingStrategy viewRenderer ) {
        this.viewRenderer = viewRenderer;
    }

    public String render ( Map< String, List< String > > model ) {
        try {
            return viewRenderer.renderView( model );
        } catch ( Exception e ) {
            throw new RenderingException( e );
        }
    }
}
