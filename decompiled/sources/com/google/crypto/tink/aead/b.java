package com.google.crypto.tink.aead;

import androidx.appcompat.widget.o1;
import androidx.collection.k;
import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: AesGcmProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<AesGcmParameters, ProtoParametersSerialization> f46539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<AesGcmKey, ProtoKeySerialization> f46541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46542d;

    /* JADX INFO: compiled from: AesGcmProtoSerialization.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46543a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46543a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46543a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46543a[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46543a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f46539a = ParametersSerializer.create(new ad.e(), AesGcmParameters.class, ProtoParametersSerialization.class);
        f46540b = ParametersParser.create(new k(), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46541c = KeySerializer.create(new androidx.emoji2.text.flatbuffer.a(), AesGcmKey.class, ProtoKeySerialization.class);
        f46542d = KeyParser.create(new o1(), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static OutputPrefixType a(AesGcmParameters.Variant variant) throws GeneralSecurityException {
        if (AesGcmParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (AesGcmParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesGcmParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static AesGcmParameters.Variant b(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = a.f46543a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return AesGcmParameters.Variant.TINK;
        }
        if (i10 == 2 || i10 == 3) {
            return AesGcmParameters.Variant.CRUNCHY;
        }
        if (i10 == 4) {
            return AesGcmParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }

    public static void c(AesGcmParameters aesGcmParameters) throws GeneralSecurityException {
        if (aesGcmParameters.getTagSizeBytes() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(aesGcmParameters.getTagSizeBytes())));
        }
        if (aesGcmParameters.getIvSizeBytes() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(aesGcmParameters.getIvSizeBytes())));
        }
    }
}
