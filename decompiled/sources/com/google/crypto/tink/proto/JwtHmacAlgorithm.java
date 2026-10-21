package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum JwtHmacAlgorithm implements Internal.EnumLite {
    HS_UNKNOWN(0),
    HS256(1),
    HS384(2),
    HS512(3),
    UNRECOGNIZED(-1);

    public static final int HS256_VALUE = 1;
    public static final int HS384_VALUE = 2;
    public static final int HS512_VALUE = 3;
    public static final int HS_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<JwtHmacAlgorithm> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<JwtHmacAlgorithm> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return JwtHmacAlgorithm.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46918a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return JwtHmacAlgorithm.forNumber(i10) != null;
        }
    }

    JwtHmacAlgorithm(int i10) {
        this.value = i10;
    }

    public static JwtHmacAlgorithm forNumber(int i10) {
        if (i10 == 0) {
            return HS_UNKNOWN;
        }
        if (i10 == 1) {
            return HS256;
        }
        if (i10 == 2) {
            return HS384;
        }
        if (i10 != 3) {
            return null;
        }
        return HS512;
    }

    public static Internal.EnumLiteMap<JwtHmacAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46918a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtHmacAlgorithm valueOf(int i10) {
        return forNumber(i10);
    }
}
