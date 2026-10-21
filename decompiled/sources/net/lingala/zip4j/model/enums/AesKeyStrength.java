package net.lingala.zip4j.model.enums;

/* JADX INFO: loaded from: classes12.dex */
public enum AesKeyStrength {
    KEY_STRENGTH_128(1, 8, 16, 16),
    KEY_STRENGTH_192(2, 12, 24, 24),
    KEY_STRENGTH_256(3, 16, 32, 32);

    private int keyLength;
    private int macLength;
    private int rawCode;
    private int saltLength;

    AesKeyStrength(int i10, int i11, int i12, int i13) {
        this.rawCode = i10;
        this.saltLength = i11;
        this.macLength = i12;
        this.keyLength = i13;
    }

    public static AesKeyStrength getAesKeyStrengthFromRawCode(int i10) {
        for (AesKeyStrength aesKeyStrength : values()) {
            if (aesKeyStrength.getRawCode() == i10) {
                return aesKeyStrength;
            }
        }
        return null;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public int getMacLength() {
        return this.macLength;
    }

    public int getRawCode() {
        return this.rawCode;
    }

    public int getSaltLength() {
        return this.saltLength;
    }
}
