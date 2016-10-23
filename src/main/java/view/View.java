package view;

import java.util.List;
import java.util.Map;

/**
 * Created by Melody on 2016/10/20.
 */
public interface View {
    public String render ( Map< String, List< String > > model );
}
