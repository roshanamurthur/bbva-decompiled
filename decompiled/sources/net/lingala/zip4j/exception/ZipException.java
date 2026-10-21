package net.lingala.zip4j.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ZipException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Type f84934p0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CHECKSUM_MISMATCH;
        public static final Type FILE_NOT_FOUND;
        public static final Type TASK_CANCELLED_EXCEPTION;
        public static final Type UNKNOWN;
        public static final Type UNKNOWN_COMPRESSION_METHOD;
        public static final Type UNSUPPORTED_ENCRYPTION;
        public static final Type WRONG_PASSWORD;

        static {
            Type type = new Type("WRONG_PASSWORD", 0);
            WRONG_PASSWORD = type;
            Type type2 = new Type("TASK_CANCELLED_EXCEPTION", 1);
            TASK_CANCELLED_EXCEPTION = type2;
            Type type3 = new Type("CHECKSUM_MISMATCH", 2);
            CHECKSUM_MISMATCH = type3;
            Type type4 = new Type("UNKNOWN_COMPRESSION_METHOD", 3);
            UNKNOWN_COMPRESSION_METHOD = type4;
            Type type5 = new Type("FILE_NOT_FOUND", 4);
            FILE_NOT_FOUND = type5;
            Type type6 = new Type("UNSUPPORTED_ENCRYPTION", 5);
            UNSUPPORTED_ENCRYPTION = type6;
            Type type7 = new Type("UNKNOWN", 6);
            UNKNOWN = type7;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ZipException(String str) {
        super(str);
        this.f84934p0 = Type.UNKNOWN;
    }

    public Type getType() {
        return this.f84934p0;
    }

    public ZipException(Exception exc) {
        super(exc);
        this.f84934p0 = Type.UNKNOWN;
    }

    public ZipException(String str, Exception exc) {
        super(str, exc);
        this.f84934p0 = Type.UNKNOWN;
    }

    public ZipException(String str, Type type) {
        super(str);
        this.f84934p0 = type;
    }

    public ZipException(String str, Throwable th2, Type type) {
        super(str, th2);
        this.f84934p0 = type;
    }
}
