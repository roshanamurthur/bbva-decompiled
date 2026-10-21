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

/* JADX INFO: compiled from: ChaCha20Poly1305ProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<ChaCha20Poly1305Parameters, ProtoParametersSerialization> f46549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<ChaCha20Poly1305Key, ProtoKeySerialization> f46551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46552d;

    /* JADX INFO: compiled from: ChaCha20Poly1305ProtoSerialization.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46553a;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46553a = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46553a[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46553a[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46553a[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f46549a = ParametersSerializer.create(new w4.a(4), ChaCha20Poly1305Parameters.class, ProtoParametersSerialization.class);
        f46550b = ParametersParser.create(new w4.b(4), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46551c = KeySerializer.create(new i8.d(4), ChaCha20Poly1305Key.class, ProtoKeySerialization.class);
        f46552d = KeyParser.create(new j4.b(3), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static OutputPrefixType a(ChaCha20Poly1305Parameters.Variant variant) throws GeneralSecurityException {
        if (ChaCha20Poly1305Parameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (ChaCha20Poly1305Parameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (ChaCha20Poly1305Parameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static ChaCha20Poly1305Parameters.Variant b(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = a.f46553a[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return ChaCha20Poly1305Parameters.Variant.TINK;
        }
        if (i10 == 2 || i10 == 3) {
            return ChaCha20Poly1305Parameters.Variant.CRUNCHY;
        }
        if (i10 == 4) {
            return ChaCha20Poly1305Parameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
