package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* JADX INFO: loaded from: classes10.dex */
public enum HashType implements Internal.EnumLite {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final Internal.EnumLiteMap<HashType> internalValueMap = new a();
    private final int value;

    public class a implements Internal.EnumLiteMap<HashType> {
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return HashType.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46897a = new b();

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return HashType.forNumber(i10) != null;
        }
    }

    HashType(int i10) {
        this.value = i10;
    }

    public static HashType forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    public static Internal.EnumLiteMap<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f46897a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i10) {
        return forNumber(i10);
    }
}
