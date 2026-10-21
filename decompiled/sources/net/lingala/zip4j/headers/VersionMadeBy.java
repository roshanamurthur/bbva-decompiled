package net.lingala.zip4j.headers;

/* JADX INFO: loaded from: classes12.dex */
public enum VersionMadeBy {
    SPECIFICATION_VERSION((byte) 51),
    WINDOWS((byte) 0),
    UNIX((byte) 3);

    private final byte code;

    VersionMadeBy(byte b10) {
        this.code = b10;
    }

    public byte getCode() {
        return this.code;
    }
}
