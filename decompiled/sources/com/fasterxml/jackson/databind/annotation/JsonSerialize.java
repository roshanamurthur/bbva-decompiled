package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes9.dex */
@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class Inclusion {
        private static final /* synthetic */ Inclusion[] $VALUES;
        public static final Inclusion ALWAYS;
        public static final Inclusion DEFAULT_INCLUSION;
        public static final Inclusion NON_DEFAULT;
        public static final Inclusion NON_EMPTY;
        public static final Inclusion NON_NULL;

        static {
            Inclusion inclusion = new Inclusion("ALWAYS", 0);
            ALWAYS = inclusion;
            Inclusion inclusion2 = new Inclusion("NON_NULL", 1);
            NON_NULL = inclusion2;
            Inclusion inclusion3 = new Inclusion("NON_DEFAULT", 2);
            NON_DEFAULT = inclusion3;
            Inclusion inclusion4 = new Inclusion("NON_EMPTY", 3);
            NON_EMPTY = inclusion4;
            Inclusion inclusion5 = new Inclusion("DEFAULT_INCLUSION", 4);
            DEFAULT_INCLUSION = inclusion5;
            $VALUES = new Inclusion[]{inclusion, inclusion2, inclusion3, inclusion4, inclusion5};
        }

        public Inclusion() {
            throw null;
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Typing {
        private static final /* synthetic */ Typing[] $VALUES;
        public static final Typing DEFAULT_TYPING;
        public static final Typing DYNAMIC;
        public static final Typing STATIC;

        static {
            Typing typing = new Typing("DYNAMIC", 0);
            DYNAMIC = typing;
            Typing typing2 = new Typing("STATIC", 1);
            STATIC = typing2;
            Typing typing3 = new Typing("DEFAULT_TYPING", 2);
            DEFAULT_TYPING = typing3;
            $VALUES = new Typing[]{typing, typing2, typing3};
        }

        public Typing() {
            throw null;
        }

        public static Typing valueOf(String str) {
            return (Typing) Enum.valueOf(Typing.class, str);
        }

        public static Typing[] values() {
            return (Typing[]) $VALUES.clone();
        }
    }

    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends Converter> contentConverter() default Converter.None.class;

    Class<? extends JsonSerializer> contentUsing() default JsonSerializer.None.class;

    Class<? extends Converter> converter() default Converter.None.class;

    @Deprecated
    Inclusion include() default Inclusion.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends JsonSerializer> keyUsing() default JsonSerializer.None.class;

    Class<? extends JsonSerializer> nullsUsing() default JsonSerializer.None.class;

    Typing typing() default Typing.DEFAULT_TYPING;

    Class<? extends JsonSerializer> using() default JsonSerializer.None.class;
}
