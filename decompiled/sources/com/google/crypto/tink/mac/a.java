package com.google.crypto.tink.mac;

import ad.e;
import androidx.camera.core.m0;
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

/* JADX INFO: compiled from: AesCmacProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<AesCmacParameters, ProtoParametersSerialization> f46800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<AesCmacKey, ProtoKeySerialization> f46802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46803d;

    /* JADX INFO: renamed from: com.google.crypto.tink.mac.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AesCmacProtoSerialization.java */
    public static /* synthetic */ class C0203a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46804a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46804a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46804a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46804a[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46804a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f46800a = ParametersSerializer.create(new m0(7), AesCmacParameters.class, ProtoParametersSerialization.class);
        f46801b = ParametersParser.create(new androidx.camera.core.impl.utils.b(), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46802c = KeySerializer.create(new e(), AesCmacKey.class, ProtoKeySerialization.class);
        f46803d = KeyParser.create(new k(), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static OutputPrefixType a(AesCmacParameters.Variant variant) throws GeneralSecurityException {
        if (AesCmacParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (AesCmacParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (AesCmacParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        if (AesCmacParameters.Variant.LEGACY.equals(variant)) {
            return OutputPrefixType.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static AesCmacParameters.Variant b(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = C0203a.f46804a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return AesCmacParameters.Variant.TINK;
        }
        if (i10 == 2) {
            return AesCmacParameters.Variant.CRUNCHY;
        }
        if (i10 == 3) {
            return AesCmacParameters.Variant.LEGACY;
        }
        if (i10 == 4) {
            return AesCmacParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
