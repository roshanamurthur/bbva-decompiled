package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.ExtraProperty;

/* JADX INFO: loaded from: classes10.dex */
@ExtraProperty
public @interface Protobuf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IntEncoding {
        private static final /* synthetic */ IntEncoding[] $VALUES;
        public static final IntEncoding DEFAULT;
        public static final IntEncoding FIXED;
        public static final IntEncoding SIGNED;

        static {
            IntEncoding intEncoding = new IntEncoding("DEFAULT", 0);
            DEFAULT = intEncoding;
            IntEncoding intEncoding2 = new IntEncoding("SIGNED", 1);
            SIGNED = intEncoding2;
            IntEncoding intEncoding3 = new IntEncoding("FIXED", 2);
            FIXED = intEncoding3;
            $VALUES = new IntEncoding[]{intEncoding, intEncoding2, intEncoding3};
        }

        public IntEncoding() {
            throw null;
        }

        public static IntEncoding valueOf(String str) {
            return (IntEncoding) Enum.valueOf(IntEncoding.class, str);
        }

        public static IntEncoding[] values() {
            return (IntEncoding[]) $VALUES.clone();
        }
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
