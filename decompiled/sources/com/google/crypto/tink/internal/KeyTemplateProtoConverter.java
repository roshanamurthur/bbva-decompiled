package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public final class KeyTemplateProtoConverter {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46642b;

        static {
            int[] iArr = new int[KeyTemplate.OutputPrefixType.values().length];
            f46642b = iArr;
            try {
                iArr[KeyTemplate.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46642b[KeyTemplate.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46642b[KeyTemplate.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46642b[KeyTemplate.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OutputPrefixType.values().length];
            f46641a = iArr2;
            try {
                iArr2[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46641a[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46641a[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46641a[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static KeyTemplate fromByteArray(byte[] bArr) throws GeneralSecurityException {
        try {
            return fromProto(com.google.crypto.tink.proto.KeyTemplate.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry()));
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("invalid key template", e5);
        }
    }

    public static KeyTemplate fromProto(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        return KeyTemplate.create(keyTemplate.getTypeUrl(), keyTemplate.getValue().toByteArray(), prefixFromProto(keyTemplate.getOutputPrefixType()));
    }

    public static KeyTemplate.OutputPrefixType prefixFromProto(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = a.f46641a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return KeyTemplate.OutputPrefixType.TINK;
        }
        if (i10 == 2) {
            return KeyTemplate.OutputPrefixType.LEGACY;
        }
        if (i10 == 3) {
            return KeyTemplate.OutputPrefixType.RAW;
        }
        if (i10 == 4) {
            return KeyTemplate.OutputPrefixType.CRUNCHY;
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    public static byte[] toByteArray(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return toProto(keyTemplate).toByteArray();
    }

    public static com.google.crypto.tink.proto.KeyTemplate toProto(KeyTemplate keyTemplate) throws GeneralSecurityException {
        OutputPrefixType outputPrefixType;
        com.google.crypto.tink.proto.KeyTemplate.Builder value = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(keyTemplate.getTypeUrl()).setValue(ByteString.copyFrom(keyTemplate.getValue()));
        int i10 = a.f46642b[keyTemplate.getOutputPrefixType().ordinal()];
        if (i10 == 1) {
            outputPrefixType = OutputPrefixType.TINK;
        } else if (i10 == 2) {
            outputPrefixType = OutputPrefixType.LEGACY;
        } else if (i10 == 3) {
            outputPrefixType = OutputPrefixType.RAW;
        } else {
            if (i10 != 4) {
                throw new GeneralSecurityException("Unknown output prefix type");
            }
            outputPrefixType = OutputPrefixType.CRUNCHY;
        }
        return value.setOutputPrefixType(outputPrefixType).build();
    }
}
