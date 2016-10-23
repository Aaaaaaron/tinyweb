package view;

import java.util.List;
import java.util.Map;

/**
 * Created by Melody on 2016/10/20.
 */
public interface RenderingStrategy {
    public String renderView ( Map< String, List< String > > model );
}
