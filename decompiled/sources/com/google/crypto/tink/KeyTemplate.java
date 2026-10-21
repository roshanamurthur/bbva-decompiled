package com.google.crypto.tink;

import com.bbva.ethermobilesdk.cipher.token.utils.HMACUtilsKt;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class KeyTemplate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.proto.KeyTemplate f46412a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OutputPrefixType {
        private static final /* synthetic */ OutputPrefixType[] $VALUES;
        public static final OutputPrefixType CRUNCHY;
        public static final OutputPrefixType LEGACY;
        public static final OutputPrefixType RAW;
        public static final OutputPrefixType TINK;

        static {
            OutputPrefixType outputPrefixType = new OutputPrefixType("TINK", 0);
            TINK = outputPrefixType;
            OutputPrefixType outputPrefixType2 = new OutputPrefixType("LEGACY", 1);
            LEGACY = outputPrefixType2;
            OutputPrefixType outputPrefixType3 = new OutputPrefixType(HMACUtilsKt.DEFAULT_SECRET_KEYSPEC_ALGORITHM, 2);
            RAW = outputPrefixType3;
            OutputPrefixType outputPrefixType4 = new OutputPrefixType("CRUNCHY", 3);
            CRUNCHY = outputPrefixType4;
            $VALUES = new OutputPrefixType[]{outputPrefixType, outputPrefixType2, outputPrefixType3, outputPrefixType4};
        }

        public OutputPrefixType() {
            throw null;
        }

        public static OutputPrefixType valueOf(String str) {
            return (OutputPrefixType) Enum.valueOf(OutputPrefixType.class, str);
        }

        public static OutputPrefixType[] values() {
            return (OutputPrefixType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46414b;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46414b = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46414b[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46414b[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46414b[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            f46413a = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46413a[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46413a[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46413a[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public KeyTemplate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) {
        this.f46412a = keyTemplate;
    }

    public static OutputPrefixType a(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        int i10 = a.f46413a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return OutputPrefixType.TINK;
        }
        if (i10 == 2) {
            return OutputPrefixType.LEGACY;
        }
        if (i10 == 3) {
            return OutputPrefixType.RAW;
        }
        if (i10 == 4) {
            return OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    public static com.google.crypto.tink.proto.OutputPrefixType b(OutputPrefixType outputPrefixType) {
        int i10 = a.f46414b[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (i10 == 2) {
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        if (i10 == 3) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (i10 == 4) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    public static KeyTemplate create(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        return new KeyTemplate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(str).setValue(ByteString.copyFrom(bArr)).setOutputPrefixType(b(outputPrefixType)).build());
    }

    public OutputPrefixType getOutputPrefixType() {
        return a(this.f46412a.getOutputPrefixType());
    }

    public String getTypeUrl() {
        return this.f46412a.getTypeUrl();
    }

    public byte[] getValue() {
        return this.f46412a.getValue().toByteArray();
    }
}
