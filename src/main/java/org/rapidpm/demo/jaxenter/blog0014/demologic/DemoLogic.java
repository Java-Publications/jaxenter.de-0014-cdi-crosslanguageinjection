package org.rapidpm.demo.jaxenter.blog0014.demologic;


import org.rapidpm.demo.jaxenter.blog0014.CDINotMapped;

/**
 * Created by ts40 on 29.01.14.
 */
@CDINotMapped
public interface DemoLogic {
    public default String workOnString() {
        return "DemoLogicDefault";
    }
}
