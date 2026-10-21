package flexjson;

import flexjson.transformer.Transformer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JSON {
    boolean include() default true;

    String name() default "";

    Class<? extends ObjectFactory> objectFactory() default ObjectFactory.class;

    Class<? extends Transformer> transformer() default Transformer.class;
}
