package com.google.crypto.tink.aead;

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
import w4.j;
import w4.q;

/* JADX INFO: compiled from: XChaCha20Poly1305ProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<XChaCha20Poly1305Parameters, ProtoParametersSerialization> f46554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<XChaCha20Poly1305Key, ProtoKeySerialization> f46556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46557d;

    /* JADX INFO: compiled from: XChaCha20Poly1305ProtoSerialization.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46558a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46558a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46558a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46558a[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46558a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        int i10 = 5;
        f46554a = ParametersSerializer.create(new j(i10), XChaCha20Poly1305Parameters.class, ProtoParametersSerialization.class);
        f46555b = ParametersParser.create(new com.google.android.gms.internal.mlkit_common.a(), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46556c = KeySerializer.create(new k4.d(i10), XChaCha20Poly1305Key.class, ProtoKeySerialization.class);
        f46557d = KeyParser.create(new q(), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static OutputPrefixType a(XChaCha20Poly1305Parameters.Variant variant) throws GeneralSecurityException {
        if (XChaCha20Poly1305Parameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (XChaCha20Poly1305Parameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (XChaCha20Poly1305Parameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static XChaCha20Poly1305Parameters.Variant b(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = a.f46558a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return XChaCha20Poly1305Parameters.Variant.TINK;
        }
        if (i10 == 2 || i10 == 3) {
            return XChaCha20Poly1305Parameters.Variant.CRUNCHY;
        }
        if (i10 == 4) {
            return XChaCha20Poly1305Parameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
