package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum JwtRsaSsaPkcs1Algorithm implements Internal.EnumLite {
    RS_UNKNOWN(0),
    RS256(1),
    RS384(2),
    RS512(3),
    UNRECOGNIZED(-1);

    public static final int RS256_VALUE = 1;
    public static final int RS384_VALUE = 2;
    public static final int RS512_VALUE = 3;
    public static final int RS_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return JwtRsaSsaPkcs1Algorithm.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46921a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return JwtRsaSsaPkcs1Algorithm.forNumber(i10) != null;
        }
    }

    JwtRsaSsaPkcs1Algorithm(int i10) {
        this.value = i10;
    }

    public static JwtRsaSsaPkcs1Algorithm forNumber(int i10) {
        if (i10 == 0) {
            return RS_UNKNOWN;
        }
        if (i10 == 1) {
            return RS256;
        }
        if (i10 == 2) {
            return RS384;
        }
        if (i10 != 3) {
            return null;
        }
        return RS512;
    }

    public static Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46921a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtRsaSsaPkcs1Algorithm valueOf(int i10) {
        return forNumber(i10);
    }
}
