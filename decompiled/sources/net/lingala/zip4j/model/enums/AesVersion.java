package net.lingala.zip4j.model.enums;

/* JADX INFO: loaded from: classes12.dex */
public enum AesVersion {
    ONE(1),
    TWO(2);

    private int versionNumber;

    AesVersion(int i10) {
        this.versionNumber = i10;
    }

    public static AesVersion getFromVersionNumber(int i10) {
        for (AesVersion aesVersion : values()) {
            if (aesVersion.versionNumber == i10) {
                return aesVersion;
            }
        }
        throw new IllegalArgumentException("Unsupported Aes version");
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }
}
