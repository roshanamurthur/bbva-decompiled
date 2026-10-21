package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum EcdsaSignatureEncoding implements Internal.EnumLite {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);

    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    private static final Internal.EnumLiteMap<EcdsaSignatureEncoding> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<EcdsaSignatureEncoding> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return EcdsaSignatureEncoding.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46885a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return EcdsaSignatureEncoding.forNumber(i10) != null;
        }
    }

    EcdsaSignatureEncoding(int i10) {
        this.value = i10;
    }

    public static EcdsaSignatureEncoding forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i10 == 1) {
            return IEEE_P1363;
        }
        if (i10 != 2) {
            return null;
        }
        return DER;
    }

    public static Internal.EnumLiteMap<EcdsaSignatureEncoding> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46885a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcdsaSignatureEncoding valueOf(int i10) {
        return forNumber(i10);
    }
}
