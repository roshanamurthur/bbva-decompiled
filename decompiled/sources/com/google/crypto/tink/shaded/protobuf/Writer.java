package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes10.dex */
public interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FieldOrder {
        private static final /* synthetic */ FieldOrder[] $VALUES;
        public static final FieldOrder ASCENDING;
        public static final FieldOrder DESCENDING;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            ASCENDING = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            DESCENDING = fieldOrder2;
            $VALUES = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public FieldOrder() {
            throw null;
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) $VALUES.clone();
        }
    }
}
