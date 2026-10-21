package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class UInt32Value extends GeneratedMessageLite<UInt32Value, Builder> implements UInt32ValueOrBuilder {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile Parser<UInt32Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<UInt32Value, Builder> implements UInt32ValueOrBuilder {
        public Builder() {
            super(UInt32Value.DEFAULT_INSTANCE);
        }

        public Builder clearValue() {
            copyOnWrite();
            UInt32Value.m((UInt32Value) this.instance);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
        public int getValue() {
            return ((UInt32Value) this.instance).getValue();
        }

        public Builder setValue(int i10) {
            copyOnWrite();
            UInt32Value.l((UInt32Value) this.instance, i10);
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21000a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f21000a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21000a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21000a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21000a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21000a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21000a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21000a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        GeneratedMessageLite.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static void l(UInt32Value uInt32Value, int i10) {
        uInt32Value.value_ = i10;
    }

    public static void m(UInt32Value uInt32Value) {
        uInt32Value.value_ = 0;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt32Value of(int i10) {
        return newBuilder().setValue(i10).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UInt32Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (a.f21000a[methodToInvoke.ordinal()]) {
            case 1:
                return new UInt32Value();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UInt32Value> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (UInt32Value.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.UInt32ValueOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(UInt32Value uInt32Value) {
        return DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UInt32Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UInt32Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UInt32Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UInt32Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
