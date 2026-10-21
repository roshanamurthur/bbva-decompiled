package org.bouncycastle.util;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes13.dex */
public class Fingerprint {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f91635b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f91636a;

    public Fingerprint(byte[] bArr) {
        this(bArr, 160);
    }

    public static byte[] calculateFingerprint(byte[] bArr) {
        return calculateFingerprint(bArr, 160);
    }

    public static byte[] calculateFingerprintSHA512_160(byte[] bArr) {
        SHA512tDigest sHA512tDigest = new SHA512tDigest(160);
        sHA512tDigest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[sHA512tDigest.getDigestSize()];
        sHA512tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Fingerprint) {
            return Arrays.areEqual(((Fingerprint) obj).f91636a, this.f91636a);
        }
        return false;
    }

    public byte[] getFingerprint() {
        return Arrays.clone(this.f91636a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91636a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f91636a;
            if (i10 == bArr.length) {
                return stringBuffer.toString();
            }
            if (i10 > 0) {
                stringBuffer.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            }
            char[] cArr = f91635b;
            stringBuffer.append(cArr[(bArr[i10] >>> 4) & 15]);
            stringBuffer.append(cArr[bArr[i10] & 15]);
            i10++;
        }
    }

    public Fingerprint(byte[] bArr, int i10) {
        this.f91636a = calculateFingerprint(bArr, i10);
    }

    public static byte[] calculateFingerprint(byte[] bArr, int i10) {
        if (i10 % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i11 = i10 / 8;
        byte[] bArr2 = new byte[i11];
        sHAKEDigest.doFinal(bArr2, 0, i11);
        return bArr2;
    }

    public Fingerprint(byte[] bArr, boolean z10) {
        if (z10) {
            this.f91636a = calculateFingerprintSHA512_160(bArr);
        } else {
            this.f91636a = calculateFingerprint(bArr);
        }
    }
}
