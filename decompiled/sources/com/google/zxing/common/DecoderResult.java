package com.google.zxing.common;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class DecoderResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f49815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<byte[]> f49818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f49820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f49821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f49822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f49823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f49824j;

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> getByteSegments() {
        return this.f49818d;
    }

    public String getECLevel() {
        return this.f49819e;
    }

    public Integer getErasures() {
        return this.f49821g;
    }

    public Integer getErrorsCorrected() {
        return this.f49820f;
    }

    public int getNumBits() {
        return this.f49816b;
    }

    public Object getOther() {
        return this.f49822h;
    }

    public byte[] getRawBytes() {
        return this.f49815a;
    }

    public int getStructuredAppendParity() {
        return this.f49823i;
    }

    public int getStructuredAppendSequenceNumber() {
        return this.f49824j;
    }

    public String getText() {
        return this.f49817c;
    }

    public boolean hasStructuredAppend() {
        return this.f49823i >= 0 && this.f49824j >= 0;
    }

    public void setErasures(Integer num) {
        this.f49821g = num;
    }

    public void setErrorsCorrected(Integer num) {
        this.f49820f = num;
    }

    public void setNumBits(int i10) {
        this.f49816b = i10;
    }

    public void setOther(Object obj) {
        this.f49822h = obj;
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f49815a = bArr;
        this.f49816b = bArr == null ? 0 : bArr.length * 8;
        this.f49817c = str;
        this.f49818d = list;
        this.f49819e = str2;
        this.f49823i = i11;
        this.f49824j = i10;
    }
}
