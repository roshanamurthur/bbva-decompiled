package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes10.dex */
public final class Enums {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HashType {
        private static final /* synthetic */ HashType[] $VALUES;
        public static final HashType SHA1;
        public static final HashType SHA224;
        public static final HashType SHA256;
        public static final HashType SHA384;
        public static final HashType SHA512;

        static {
            HashType hashType = new HashType("SHA1", 0);
            SHA1 = hashType;
            HashType hashType2 = new HashType("SHA224", 1);
            SHA224 = hashType2;
            HashType hashType3 = new HashType("SHA256", 2);
            SHA256 = hashType3;
            HashType hashType4 = new HashType("SHA384", 3);
            SHA384 = hashType4;
            HashType hashType5 = new HashType("SHA512", 4);
            SHA512 = hashType5;
            $VALUES = new HashType[]{hashType, hashType2, hashType3, hashType4, hashType5};
        }

        public HashType() {
            throw null;
        }

        public static HashType valueOf(String str) {
            return (HashType) Enum.valueOf(HashType.class, str);
        }

        public static HashType[] values() {
            return (HashType[]) $VALUES.clone();
        }
    }
}
