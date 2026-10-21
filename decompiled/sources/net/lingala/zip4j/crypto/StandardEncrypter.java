package net.lingala.zip4j.crypto;

import java.security.SecureRandom;
import net.lingala.zip4j.crypto.engine.ZipCryptoEngine;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes12.dex */
public class StandardEncrypter implements Encrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZipCryptoEngine f84921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f84922b;

    public StandardEncrypter(char[] cArr, long j10) throws ZipException {
        ZipCryptoEngine zipCryptoEngine = new ZipCryptoEngine();
        this.f84921a = zipCryptoEngine;
        if (cArr == null || cArr.length <= 0) {
            throw new ZipException("input password is null or empty, cannot initialize standard encrypter");
        }
        zipCryptoEngine.initKeys(cArr);
        this.f84922b = generateRandomBytes();
        zipCryptoEngine.initKeys(cArr);
        byte[] bArr = this.f84922b;
        bArr[11] = (byte) (j10 >>> 24);
        bArr[10] = (byte) (j10 >>> 16);
        encryptData(bArr);
    }

    public byte encryptByte(byte b10) {
        ZipCryptoEngine zipCryptoEngine = this.f84921a;
        byte bDecryptByte = (byte) ((zipCryptoEngine.decryptByte() & 255) ^ b10);
        zipCryptoEngine.updateKeys(b10);
        return bDecryptByte;
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr) throws ZipException {
        bArr.getClass();
        return encryptData(bArr, 0, bArr.length);
    }

    public byte[] generateRandomBytes() {
        byte[] bArr = new byte[12];
        SecureRandom secureRandom = new SecureRandom();
        for (int i10 = 0; i10 < 12; i10++) {
            bArr[i10] = encryptByte((byte) secureRandom.nextInt(256));
        }
        return bArr;
    }

    public byte[] getHeaderBytes() {
        return this.f84922b;
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr, int i10, int i11) throws ZipException {
        if (i11 < 0) {
            throw new ZipException("invalid length specified to decrpyt data");
        }
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            bArr[i12] = encryptByte(bArr[i12]);
        }
        return i11;
    }
}
