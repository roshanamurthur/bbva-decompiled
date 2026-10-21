package com.google.crypto.tink.mac;

import androidx.appcompat.widget.o1;
import androidx.databinding.f;
import com.google.crypto.tink.AccessesPartialKey;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import w4.i;

/* JADX INFO: compiled from: HmacProtoSerialization.java */
/* JADX INFO: loaded from: classes10.dex */
@AccessesPartialKey
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ParametersSerializer<HmacParameters, ProtoParametersSerialization> f46805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ParametersParser<ProtoParametersSerialization> f46806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final KeySerializer<HmacKey, ProtoKeySerialization> f46807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KeyParser<ProtoKeySerialization> f46808d;

    /* JADX INFO: compiled from: HmacProtoSerialization.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46810b;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            f46810b = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46810b[OutputPrefixType.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46810b[OutputPrefixType.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46810b[OutputPrefixType.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[HashType.values().length];
            f46809a = iArr2;
            try {
                iArr2[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46809a[HashType.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46809a[HashType.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46809a[HashType.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46809a[HashType.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        Bytes bytesFromPrintableAscii = Util.toBytesFromPrintableAscii("type.googleapis.com/google.crypto.tink.HmacKey");
        f46805a = ParametersSerializer.create(new o1(), HmacParameters.class, ProtoParametersSerialization.class);
        f46806b = ParametersParser.create(new i(5), bytesFromPrintableAscii, ProtoParametersSerialization.class);
        f46807c = KeySerializer.create(new fc.a(), HmacKey.class, ProtoKeySerialization.class);
        f46808d = KeyParser.create(new f(), bytesFromPrintableAscii, ProtoKeySerialization.class);
    }

    public static HmacParams a(HmacParameters hmacParameters) throws GeneralSecurityException {
        HashType hashType;
        HmacParams.Builder tagSize = HmacParams.newBuilder().setTagSize(hmacParameters.getCryptographicTagSizeBytes());
        HmacParameters.HashType hashType2 = hmacParameters.getHashType();
        if (HmacParameters.HashType.SHA1.equals(hashType2)) {
            hashType = HashType.SHA1;
        } else if (HmacParameters.HashType.SHA224.equals(hashType2)) {
            hashType = HashType.SHA224;
        } else if (HmacParameters.HashType.SHA256.equals(hashType2)) {
            hashType = HashType.SHA256;
        } else if (HmacParameters.HashType.SHA384.equals(hashType2)) {
            hashType = HashType.SHA384;
        } else {
            if (!HmacParameters.HashType.SHA512.equals(hashType2)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + hashType2);
            }
            hashType = HashType.SHA512;
        }
        return tagSize.setHash(hashType).build();
    }

    public static HmacParameters.HashType b(HashType hashType) throws GeneralSecurityException {
        int i10 = a.f46809a[hashType.ordinal()];
        if (i10 == 1) {
            return HmacParameters.HashType.SHA1;
        }
        if (i10 == 2) {
            return HmacParameters.HashType.SHA224;
        }
        if (i10 == 3) {
            return HmacParameters.HashType.SHA256;
        }
        if (i10 == 4) {
            return HmacParameters.HashType.SHA384;
        }
        if (i10 == 5) {
            return HmacParameters.HashType.SHA512;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + hashType.getNumber());
    }

    public static OutputPrefixType c(HmacParameters.Variant variant) throws GeneralSecurityException {
        if (HmacParameters.Variant.TINK.equals(variant)) {
            return OutputPrefixType.TINK;
        }
        if (HmacParameters.Variant.CRUNCHY.equals(variant)) {
            return OutputPrefixType.CRUNCHY;
        }
        if (HmacParameters.Variant.NO_PREFIX.equals(variant)) {
            return OutputPrefixType.RAW;
        }
        if (HmacParameters.Variant.LEGACY.equals(variant)) {
            return OutputPrefixType.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + variant);
    }

    public static HmacParameters.Variant d(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i10 = a.f46810b[outputPrefixType.ordinal()];
        if (i10 == 1) {
            return HmacParameters.Variant.TINK;
        }
        if (i10 == 2) {
            return HmacParameters.Variant.CRUNCHY;
        }
        if (i10 == 3) {
            return HmacParameters.Variant.LEGACY;
        }
        if (i10 == 4) {
            return HmacParameters.Variant.NO_PREFIX;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
