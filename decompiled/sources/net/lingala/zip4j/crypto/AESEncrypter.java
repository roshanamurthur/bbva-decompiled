package net.lingala.zip4j.crypto;

import java.security.SecureRandom;
import net.lingala.zip4j.crypto.PBKDF2.MacBasedPRF;
import net.lingala.zip4j.crypto.engine.AESEngine;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.AesKeyStrength;

/* JADX INFO: loaded from: classes12.dex */
public class AESEncrypter implements Encrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEngine f84905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MacBasedPRF f84906b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84908d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f84911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f84912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f84913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f84914j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f84907c = new SecureRandom();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84909e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84910f = 0;

    public AESEncrypter(char[] cArr, AesKeyStrength aesKeyStrength) throws ZipException {
        if (cArr == null || cArr.length == 0) {
            throw new ZipException("input password is empty or null");
        }
        if (aesKeyStrength != AesKeyStrength.KEY_STRENGTH_128 && aesKeyStrength != AesKeyStrength.KEY_STRENGTH_256) {
            throw new ZipException("Invalid AES key strength");
        }
        this.f84908d = false;
        this.f84912h = new byte[16];
        this.f84911g = new byte[16];
        int saltLength = aesKeyStrength.getSaltLength();
        if (saltLength != 8 && saltLength != 16) {
            throw new ZipException("invalid salt size, cannot generate salt");
        }
        int i10 = saltLength == 8 ? 2 : 4;
        byte[] bArr = new byte[saltLength];
        for (int i11 = 0; i11 < i10; i11++) {
            int iNextInt = this.f84907c.nextInt();
            int i12 = i11 * 4;
            bArr[i12] = (byte) (iNextInt >> 24);
            bArr[i12 + 1] = (byte) (iNextInt >> 16);
            bArr[i12 + 2] = (byte) (iNextInt >> 8);
            bArr[i12 + 3] = (byte) iNextInt;
        }
        this.f84914j = bArr;
        byte[] bArrDerivePasswordBasedKey = AesCipherUtil.derivePasswordBasedKey(bArr, cArr, aesKeyStrength);
        this.f84913i = AesCipherUtil.derivePasswordVerifier(bArrDerivePasswordBasedKey, aesKeyStrength);
        this.f84905a = AesCipherUtil.getAESEngine(bArrDerivePasswordBasedKey, aesKeyStrength);
        this.f84906b = AesCipherUtil.getMacBasedPRF(bArrDerivePasswordBasedKey, aesKeyStrength);
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr) throws ZipException {
        if (bArr != null) {
            return encryptData(bArr, 0, bArr.length);
        }
        throw new ZipException("input bytes are null, cannot perform AES encryption");
    }

    public byte[] getDerivedPasswordVerifier() {
        return this.f84913i;
    }

    public byte[] getFinalMac() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f84906b.doFinal(), 0, bArr, 0, 10);
        return bArr;
    }

    public byte[] getSaltBytes() {
        return this.f84914j;
    }

    @Override // net.lingala.zip4j.crypto.Encrypter
    public int encryptData(byte[] bArr, int i10, int i11) throws ZipException {
        int i12;
        if (!this.f84908d) {
            if (i11 % 16 != 0) {
                this.f84908d = true;
            }
            int i13 = i10;
            while (true) {
                int i14 = i10 + i11;
                if (i13 >= i14) {
                    return i11;
                }
                int i15 = i13 + 16;
                this.f84910f = i15 <= i14 ? 16 : i14 - i13;
                int i16 = this.f84909e;
                byte[] bArr2 = this.f84911g;
                AesCipherUtil.prepareBuffAESIVBytes(bArr2, i16);
                AESEngine aESEngine = this.f84905a;
                byte[] bArr3 = this.f84912h;
                aESEngine.processBlock(bArr2, bArr3);
                int i17 = 0;
                while (true) {
                    i12 = this.f84910f;
                    if (i17 < i12) {
                        int i18 = i13 + i17;
                        bArr[i18] = (byte) (bArr[i18] ^ bArr3[i17]);
                        i17++;
                    }
                }
                this.f84906b.update(bArr, i13, i12);
                this.f84909e++;
                i13 = i15;
            }
        } else {
            throw new ZipException("AES Encrypter is in finished state (A non 16 byte block has already been passed to encrypter)");
        }
    }
}
