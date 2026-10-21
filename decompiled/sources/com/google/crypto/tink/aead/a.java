package com.google.crypto.tink.aead;

import androidx.camera.core.m0;
import androidx.camera.core.processing.f;
import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.AesEaxParams;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: AesEaxProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<AesEaxParameters, ProtoParametersSerialization> f46534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<AesEaxKey, ProtoKeySerialization> f46536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46537d;

    /* JADX INFO: renamed from: com.google.crypto.tink.aead.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AesEaxProtoSerialization.java */
    public static /* synthetic */ class C0201a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46538a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46538a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46538a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46538a[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46538a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f46534a = ParametersSerializer.create(new f(), AesEaxParameters.class, ProtoParametersSerialization.class);
        f46535b = ParametersParser.create(new ad.d(), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46536c = KeySerializer.create(new m0(6), AesEaxKey.class, ProtoKeySerialization.class);
        f46537d = KeyParser.create(new androidx.camera.core.impl.utils.b(), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static AesEaxParams a(AesEaxParameters aesEaxParameters) throws GeneralSecurityException {
        if (aesEaxParameters.getTagSizeBytes() == 16) {
            return AesEaxParams.newBuilder().setIvSize(aesEaxParameters.getIvSizeBytes()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(aesEaxParameters.getTagSizeBytes())));
    }

    public static OutputPrefixType b(AesEaxParameters.Variant variant) throws GeneralSecurityException {
        if (AesEaxParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (AesEaxParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesEaxParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static AesEaxParameters.Variant c(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = C0201a.f46538a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return AesEaxParameters.Variant.TINK;
        }
        if (i10 == 2 || i10 == 3) {
            return AesEaxParameters.Variant.CRUNCHY;
        }
        if (i10 == 4) {
            return AesEaxParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
