package com.google.crypto.tink.aead;

import androidx.databinding.f;
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
import w4.i;

/* JADX INFO: compiled from: AesGcmSivProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<AesGcmSivParameters, ProtoParametersSerialization> f46544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<AesGcmSivKey, ProtoKeySerialization> f46546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46547d;

    /* JADX INFO: compiled from: AesGcmSivProtoSerialization.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46548a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46548a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46548a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46548a[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46548a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f46544a = ParametersSerializer.create(new i(4), AesGcmSivParameters.class, ProtoParametersSerialization.class);
        f46545b = ParametersParser.create(new fc.a(), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46546c = KeySerializer.create(new f(), AesGcmSivKey.class, ProtoKeySerialization.class);
        f46547d = KeyParser.create(new v7.a(3), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static OutputPrefixType a(AesGcmSivParameters.Variant variant) throws GeneralSecurityException {
        if (AesGcmSivParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (AesGcmSivParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesGcmSivParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static AesGcmSivParameters.Variant b(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = a.f46548a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return AesGcmSivParameters.Variant.TINK;
        }
        if (i10 == 2 || i10 == 3) {
            return AesGcmSivParameters.Variant.CRUNCHY;
        }
        if (i10 == 4) {
            return AesGcmSivParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
