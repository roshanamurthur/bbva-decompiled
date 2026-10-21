package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Date;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes12.dex */
public class DERGeneralizedTime extends ASN1GeneralizedTime {
    public DERGeneralizedTime(String str) {
        super(str);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        aSN1OutputStream.f(z10, 24, i());
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final int b() {
        int length = i().length;
        return j.a(length) + 1 + length;
    }

    public final byte[] i() {
        byte[] bArr = this.time;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!hasMinutes()) {
            byte[] bArr2 = this.time;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(Strings.toByteArray("0000Z"), 0, bArr3, this.time.length - 1, 5);
            return bArr3;
        }
        if (!hasSeconds()) {
            byte[] bArr4 = this.time;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(Strings.toByteArray("00Z"), 0, bArr5, this.time.length - 1, 3);
            return bArr5;
        }
        if (!hasFractionalSeconds()) {
            return this.time;
        }
        int length = this.time.length - 2;
        while (length > 0 && this.time[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.time;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i10 = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i10);
        bArr8[i10] = 90;
        return bArr8;
    }

    public DERGeneralizedTime(Date date) {
        super(date);
    }

    public DERGeneralizedTime(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive c() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1GeneralizedTime, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive d() {
        return this;
    }
}
