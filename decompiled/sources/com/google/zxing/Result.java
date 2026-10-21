package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f49664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultPoint[] f49666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BarcodeFormat f49667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<ResultMetadataType, Object> f49668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f49669g;

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, resultPointArr, barcodeFormat, System.currentTimeMillis());
    }

    public void addResultPoints(ResultPoint[] resultPointArr) {
        ResultPoint[] resultPointArr2 = this.f49666d;
        if (resultPointArr2 == null) {
            this.f49666d = resultPointArr;
            return;
        }
        if (resultPointArr == null || resultPointArr.length <= 0) {
            return;
        }
        ResultPoint[] resultPointArr3 = new ResultPoint[resultPointArr2.length + resultPointArr.length];
        System.arraycopy(resultPointArr2, 0, resultPointArr3, 0, resultPointArr2.length);
        System.arraycopy(resultPointArr, 0, resultPointArr3, resultPointArr2.length, resultPointArr.length);
        this.f49666d = resultPointArr3;
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.f49667e;
    }

    public int getNumBits() {
        return this.f49665c;
    }

    public byte[] getRawBytes() {
        return this.f49664b;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.f49668f;
    }

    public ResultPoint[] getResultPoints() {
        return this.f49666d;
    }

    public String getText() {
        return this.f49663a;
    }

    public long getTimestamp() {
        return this.f49669g;
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f49668f;
            if (map2 == null) {
                this.f49668f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f49668f == null) {
            this.f49668f = new EnumMap(ResultMetadataType.class);
        }
        this.f49668f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f49663a;
    }

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, resultPointArr, barcodeFormat, j10);
    }

    public Result(String str, byte[] bArr, int i10, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j10) {
        this.f49663a = str;
        this.f49664b = bArr;
        this.f49665c = i10;
        this.f49666d = resultPointArr;
        this.f49667e = barcodeFormat;
        this.f49668f = null;
        this.f49669g = j10;
    }
}
