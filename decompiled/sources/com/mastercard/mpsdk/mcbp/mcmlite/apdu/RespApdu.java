package com.mastercard.mpsdk.mcbp.mcmlite.apdu;

/* JADX INFO: loaded from: classes10.dex */
public class RespApdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f50767a;

    public RespApdu() {
    }

    public byte[] getBytes() {
        return this.f50767a;
    }

    public void setValue(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        this.f50767a = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, this.f50767a, bArr.length, bArr2.length);
    }

    public void setValueAndSuccess(byte[] bArr) {
        setValue(bArr, new byte[]{-112, 0});
    }

    public RespApdu(byte[] bArr, byte[] bArr2) {
        setValue(bArr, bArr2);
    }

    public RespApdu(byte[] bArr) {
        this.f50767a = bArr;
    }
}
