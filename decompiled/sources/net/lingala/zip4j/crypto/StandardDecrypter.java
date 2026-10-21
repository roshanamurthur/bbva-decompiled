package net.lingala.zip4j.crypto;

import net.lingala.zip4j.crypto.engine.ZipCryptoEngine;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes12.dex */
public class StandardDecrypter implements Decrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZipCryptoEngine f84920a;

    public StandardDecrypter(char[] cArr, long j10, long j11, byte[] bArr) throws ZipException {
        byte bDecryptByte;
        ZipCryptoEngine zipCryptoEngine = new ZipCryptoEngine();
        this.f84920a = zipCryptoEngine;
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
        }
        zipCryptoEngine.initKeys(cArr);
        int i10 = 0;
        byte b10 = bArr[0];
        while (i10 < 12) {
            i10++;
            if (i10 == 12 && (bDecryptByte = (byte) (zipCryptoEngine.decryptByte() ^ b10)) != ((byte) (j10 >> 24)) && bDecryptByte != ((byte) (j11 >> 8))) {
                throw new ZipException("Wrong password!", ZipException.Type.WRONG_PASSWORD);
            }
            zipCryptoEngine.updateKeys((byte) (zipCryptoEngine.decryptByte() ^ b10));
            if (i10 != 12) {
                b10 = bArr[i10];
            }
        }
    }

    @Override // net.lingala.zip4j.crypto.Decrypter
    public int decryptData(byte[] bArr, int i10, int i11) throws ZipException {
        if (i10 < 0 || i11 < 0) {
            throw new ZipException("one of the input parameters were null in standard decrypt data");
        }
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            int i13 = bArr[i12] & 255;
            ZipCryptoEngine zipCryptoEngine = this.f84920a;
            byte bDecryptByte = (byte) ((i13 ^ zipCryptoEngine.decryptByte()) & 255);
            zipCryptoEngine.updateKeys(bDecryptByte);
            bArr[i12] = bDecryptByte;
        }
        return i11;
    }
}
