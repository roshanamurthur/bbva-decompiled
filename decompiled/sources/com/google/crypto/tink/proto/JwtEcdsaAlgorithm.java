package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum JwtEcdsaAlgorithm implements Internal.EnumLite {
    ES_UNKNOWN(0),
    ES256(1),
    ES384(2),
    ES512(3),
    UNRECOGNIZED(-1);

    public static final int ES256_VALUE = 1;
    public static final int ES384_VALUE = 2;
    public static final int ES512_VALUE = 3;
    public static final int ES_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<JwtEcdsaAlgorithm> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<JwtEcdsaAlgorithm> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return JwtEcdsaAlgorithm.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46914a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return JwtEcdsaAlgorithm.forNumber(i10) != null;
        }
    }

    JwtEcdsaAlgorithm(int i10) {
        this.value = i10;
    }

    public static JwtEcdsaAlgorithm forNumber(int i10) {
        if (i10 == 0) {
            return ES_UNKNOWN;
        }
        if (i10 == 1) {
            return ES256;
        }
        if (i10 == 2) {
            return ES384;
        }
        if (i10 != 3) {
            return null;
        }
        return ES512;
    }

    public static Internal.EnumLiteMap<JwtEcdsaAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46914a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtEcdsaAlgorithm valueOf(int i10) {
        return forNumber(i10);
    }
}
