package com.google.crypto.tink.prf;

import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HkdfPrfParams;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.util.Bytes;
import i8.d;
import java.security.GeneralSecurityException;
import w4.b;
import w4.j;

/* JADX INFO: compiled from: HkdfPrfProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<HkdfPrfParameters, ProtoParametersSerialization> f46848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<HkdfPrfKey, ProtoKeySerialization> f46850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46851d;

    /* JADX INFO: renamed from: com.google.crypto.tink.prf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HkdfPrfProtoSerialization.java */
    public static /* synthetic */ class C0205a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46852a;

        static {
            int[] iArr = new int[HashType.values().length];
            f46852a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46852a[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46852a[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46852a[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46852a[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.HkdfPrfKey");
        f46848a = ParametersSerializer.create(new b(5), HkdfPrfParameters.class, ProtoParametersSerialization.class);
        f46849b = ParametersParser.create(new d(5), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46850c = KeySerializer.create(new j4.b(4), HkdfPrfKey.class, ProtoKeySerialization.class);
        f46851d = KeyParser.create(new j(6), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static HkdfPrfParams a(HkdfPrfParameters hkdfPrfParameters) throws GeneralSecurityException {
        HashType hashType;
        HkdfPrfParams.Builder builderNewBuilder = HkdfPrfParams.newBuilder();
        HkdfPrfParameters.HashType hashType2 = hkdfPrfParameters.getHashType();
        if (HkdfPrfParameters.HashType.SHA1.equals(hashType2)) {
            hashType = HashType.SHA1;
        } else if (HkdfPrfParameters.HashType.SHA224.equals(hashType2)) {
            hashType = HashType.SHA224;
        } else if (HkdfPrfParameters.HashType.SHA256.equals(hashType2)) {
            hashType = HashType.SHA256;
        } else if (HkdfPrfParameters.HashType.SHA384.equals(hashType2)) {
            hashType = HashType.SHA384;
        } else {
            if (!HkdfPrfParameters.HashType.SHA512.equals(hashType2)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + hashType2);
            }
            hashType = HashType.SHA512;
        }
        HkdfPrfParams.Builder hash = builderNewBuilder.setHash(hashType);
        if (hkdfPrfParameters.getSalt() != null && hkdfPrfParameters.getSalt().size() > 0) {
            hash.setSalt(ByteString.copyFrom(hkdfPrfParameters.getSalt().toByteArray()));
        }
        return hash.build();
    }

    public static HkdfPrfParameters.HashType b(HashType hashType) throws GeneralSecurityException {
        int i10 = C0205a.f46852a[hashType.ordinal()];
        if (i10 == 1) {
            return HkdfPrfParameters.HashType.SHA1;
        }
        if (i10 == 2) {
            return HkdfPrfParameters.HashType.SHA224;
        }
        if (i10 == 3) {
            return HkdfPrfParameters.HashType.SHA256;
        }
        if (i10 == 4) {
            return HkdfPrfParameters.HashType.SHA384;
        }
        if (i10 == 5) {
            return HkdfPrfParameters.HashType.SHA512;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }
}
