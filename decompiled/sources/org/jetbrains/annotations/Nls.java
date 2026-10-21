package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE, ElementType.TYPE, ElementType.PACKAGE})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Nls {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Capitalization {
        private static final /* synthetic */ Capitalization[] $VALUES;
        public static final Capitalization NotSpecified;
        public static final Capitalization Sentence;
        public static final Capitalization Title;

        static {
            Capitalization capitalization = new Capitalization("NotSpecified", 0);
            NotSpecified = capitalization;
            Capitalization capitalization2 = new Capitalization("Title", 1);
            Title = capitalization2;
            Capitalization capitalization3 = new Capitalization("Sentence", 2);
            Sentence = capitalization3;
            $VALUES = new Capitalization[]{capitalization, capitalization2, capitalization3};
        }

        public Capitalization() {
            throw null;
        }

        public static Capitalization valueOf(String str) {
            return (Capitalization) Enum.valueOf(Capitalization.class, str);
        }

        public static Capitalization[] values() {
            return (Capitalization[]) $VALUES.clone();
        }
    }

    Capitalization capitalization() default Capitalization.NotSpecified;
}
