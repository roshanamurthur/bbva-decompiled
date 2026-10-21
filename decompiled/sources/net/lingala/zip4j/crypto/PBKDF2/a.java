package net.lingala.zip4j.crypto.PBKDF2;

/* JADX INFO: compiled from: PRF.java */
/* JADX INFO: loaded from: classes12.dex */
public interface a {
    byte[] doFinal(byte[] bArr);

    int getHLen();

    void init(byte[] bArr);
}
