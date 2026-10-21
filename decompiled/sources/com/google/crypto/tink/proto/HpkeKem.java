package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum HpkeKem implements Internal.EnumLite {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    public static final int DHKEM_P256_HKDF_SHA256_VALUE = 2;
    public static final int DHKEM_P384_HKDF_SHA384_VALUE = 3;
    public static final int DHKEM_P521_HKDF_SHA512_VALUE = 4;
    public static final int DHKEM_X25519_HKDF_SHA256_VALUE = 1;
    public static final int KEM_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<HpkeKem> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<HpkeKem> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return HpkeKem.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46909a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return HpkeKem.forNumber(i10) != null;
        }
    }

    HpkeKem(int i10) {
        this.value = i10;
    }

    public static HpkeKem forNumber(int i10) {
        if (i10 == 0) {
            return KEM_UNKNOWN;
        }
        if (i10 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i10 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i10 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i10 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    public static Internal.EnumLiteMap<HpkeKem> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46909a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HpkeKem valueOf(int i10) {
        return forNumber(i10);
    }
}
