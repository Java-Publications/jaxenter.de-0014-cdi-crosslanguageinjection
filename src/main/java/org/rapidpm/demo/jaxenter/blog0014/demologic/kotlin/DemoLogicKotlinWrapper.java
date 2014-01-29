package org.rapidpm.demo.jaxenter.blog0014.demologic.kotlin;

import org.rapidpm.demo.jaxenter.blog0014.CDINotMapped;
import org.rapidpm.demo.jaxenter.blog0014.demologic.DemoLogic;

import javax.inject.Inject;

/**
 * Created by ts40 on 29.01.14.
 */
@CDINotMapped
public class DemoLogicKotlinWrapper implements DemoLogic {

    private @Inject DemoLogicKotlin kotlin;

    public String workOnString() {
        return kotlin.workOnString();
    }

}
