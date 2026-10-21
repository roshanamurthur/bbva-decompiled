package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class WireFormat {
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType BOOL;
        public static final FieldType BYTES;
        public static final FieldType DOUBLE;
        public static final FieldType ENUM;
        public static final FieldType FIXED32;
        public static final FieldType FIXED64;
        public static final FieldType FLOAT;
        public static final FieldType GROUP;
        public static final FieldType INT32;
        public static final FieldType INT64;
        public static final FieldType MESSAGE;
        public static final FieldType SFIXED32;
        public static final FieldType SFIXED64;
        public static final FieldType SINT32;
        public static final FieldType SINT64;
        public static final FieldType STRING;
        public static final FieldType UINT32;
        public static final FieldType UINT64;
        private final JavaType javaType;
        private final int wireType;

        public final enum a extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        public final enum b extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        public final enum c extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        public final enum d extends FieldType {
            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType
            public final boolean isPackable() {
                return false;
            }
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            DOUBLE = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            FLOAT = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            INT64 = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            UINT64 = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            INT32 = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            FIXED64 = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            FIXED32 = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            BOOL = fieldType8;
            a aVar = new a("STRING", 8, JavaType.STRING, 2);
            STRING = aVar;
            JavaType javaType3 = JavaType.MESSAGE;
            b bVar = new b("GROUP", 9, javaType3, 3);
            GROUP = bVar;
            c cVar = new c("MESSAGE", 10, javaType3, 2);
            MESSAGE = cVar;
            d dVar = new d("BYTES", 11, JavaType.BYTE_STRING, 2);
            BYTES = dVar;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            UINT32 = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            ENUM = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            SFIXED32 = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            SFIXED64 = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            SINT32 = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            SINT64 = fieldType14;
            $VALUES = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, aVar, bVar, cVar, dVar, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public FieldType(String str, int i10, JavaType javaType, int i11) {
            super(str, i10);
            this.javaType = javaType;
            this.wireType = i11;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }

        public JavaType getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.EMPTY),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        JavaType(Serializable serializable) {
            this.defaultDefault = serializable;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47177a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f47177a = iArr;
            try {
                iArr[FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47177a[FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47177a[FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47177a[FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47177a[FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47177a[FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47177a[FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47177a[FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47177a[FieldType.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47177a[FieldType.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47177a[FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47177a[FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47177a[FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47177a[FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47177a[FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47177a[FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47177a[FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f47177a[FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b LAZY;
        public static final b LOOSE;
        public static final b STRICT;

        public final enum a extends b {
            public a() {
                super("LOOSE", 0);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.b
            public final Object a(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readString();
            }
        }

        /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.WireFormat$b$b, reason: collision with other inner class name */
        public final enum C0206b extends b {
            public C0206b() {
                super("STRICT", 1);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.b
            public final Object a(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readStringRequireUtf8();
            }
        }

        public final enum c extends b {
            public c() {
                super("LAZY", 2);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.WireFormat.b
            public final Object a(CodedInputStream codedInputStream) throws IOException {
                return codedInputStream.readBytes();
            }
        }

        static {
            a aVar = new a();
            LOOSE = aVar;
            C0206b c0206b = new C0206b();
            STRICT = c0206b;
            c cVar = new c();
            LAZY = cVar;
            $VALUES = new b[]{aVar, c0206b, cVar};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public abstract Object a(CodedInputStream codedInputStream) throws IOException;
    }

    public static Object a(CodedInputStream codedInputStream, FieldType fieldType, b bVar) throws IOException {
        switch (a.f47177a[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.readDouble());
            case 2:
                return Float.valueOf(codedInputStream.readFloat());
            case 3:
                return Long.valueOf(codedInputStream.readInt64());
            case 4:
                return Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readBytes();
            case 10:
                return Integer.valueOf(codedInputStream.readUInt32());
            case 11:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 12:
                return Long.valueOf(codedInputStream.readSFixed64());
            case 13:
                return Integer.valueOf(codedInputStream.readSInt32());
            case 14:
                return Long.valueOf(codedInputStream.readSInt64());
            case 15:
                return bVar.a(codedInputStream);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int getTagFieldNumber(int i10) {
        return i10 >>> 3;
    }

    public static int getTagWireType(int i10) {
        return i10 & 7;
    }
}
