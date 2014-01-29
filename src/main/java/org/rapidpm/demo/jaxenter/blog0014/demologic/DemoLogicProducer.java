package org.rapidpm.demo.jaxenter.blog0014.demologic;

import org.rapidpm.demo.jaxenter.blog0014.Blog0014;
import org.rapidpm.demo.jaxenter.blog0014.ContextResolver;
import org.rapidpm.demo.jaxenter.blog0014.ManagedInstanceCreator;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Created by ts40 on 29.01.14.
 */
public class DemoLogicProducer {

    @Inject ContextResolver contextResolver;
    @Inject BeanManager beanManager;
    @Inject ManagedInstanceCreator creator;

    @Produces
    public DemoLogic create(){
        final Class<DemoLogic> beanType = DemoLogic.class;
        final AnnotationLiteral annotationLiteral
                = contextResolver.resolveContext(beanType);
        final DemoLogic logic = creator.getManagedInstance(beanType, annotationLiteral);
        return logic;
    }
}
