package com.sun.mail.iap;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes9.dex */
public class ByteArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f65243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65245c;

    public ByteArray(byte[] bArr, int i10, int i11) {
        this.f65243a = bArr;
        this.f65244b = i10;
        this.f65245c = i11;
    }

    public byte[] getBytes() {
        return this.f65243a;
    }

    public int getCount() {
        return this.f65245c;
    }

    public byte[] getNewBytes() {
        int i10 = this.f65245c;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f65243a, this.f65244b, bArr, 0, i10);
        return bArr;
    }

    public int getStart() {
        return this.f65244b;
    }

    public void grow(int i10) {
        byte[] bArr = this.f65243a;
        byte[] bArr2 = new byte[bArr.length + i10];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f65243a = bArr2;
    }

    public void setCount(int i10) {
        this.f65245c = i10;
    }

    public ByteArrayInputStream toByteArrayInputStream() {
        return new ByteArrayInputStream(this.f65243a, this.f65244b, this.f65245c);
    }

    public ByteArray(int i10) {
        this(new byte[i10], 0, i10);
    }
}
