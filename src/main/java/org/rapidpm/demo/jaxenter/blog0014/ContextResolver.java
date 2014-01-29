package org.rapidpm.demo.jaxenter.blog0014;

import org.rapidpm.demo.jaxenter.blog0014.demologic.DefaultImpl;
import org.rapidpm.demo.jaxenter.blog0014.demologic.kotlin.KotlinImpl;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Created by ts40 on 29.01.14.
 */
public class ContextResolver {

    @Inject Context context;

    public AnnotationLiteral resolveContext(final Class<?> targetClass){
        if (context.defaultImpl){
            return  new AnnotationLiteral<DefaultImpl>() {};
        }else{
            return  new AnnotationLiteral<KotlinImpl>() {};
        }
    }
}
