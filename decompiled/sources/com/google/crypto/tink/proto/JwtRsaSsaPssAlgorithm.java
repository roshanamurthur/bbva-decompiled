package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum JwtRsaSsaPssAlgorithm implements Internal.EnumLite {
    PS_UNKNOWN(0),
    PS256(1),
    PS384(2),
    PS512(3),
    UNRECOGNIZED(-1);

    public static final int PS256_VALUE = 1;
    public static final int PS384_VALUE = 2;
    public static final int PS512_VALUE = 3;
    public static final int PS_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<JwtRsaSsaPssAlgorithm> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<JwtRsaSsaPssAlgorithm> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return JwtRsaSsaPssAlgorithm.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46925a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return JwtRsaSsaPssAlgorithm.forNumber(i10) != null;
        }
    }

    JwtRsaSsaPssAlgorithm(int i10) {
        this.value = i10;
    }

    public static JwtRsaSsaPssAlgorithm forNumber(int i10) {
        if (i10 == 0) {
            return PS_UNKNOWN;
        }
        if (i10 == 1) {
            return PS256;
        }
        if (i10 == 2) {
            return PS384;
        }
        if (i10 != 3) {
            return null;
        }
        return PS512;
    }

    public static Internal.EnumLiteMap<JwtRsaSsaPssAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46925a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtRsaSsaPssAlgorithm valueOf(int i10) {
        return forNumber(i10);
    }
}
