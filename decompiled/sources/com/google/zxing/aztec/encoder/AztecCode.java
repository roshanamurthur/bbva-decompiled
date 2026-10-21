package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes10.dex */
public final class AztecCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitMatrix f49695e;

    public int getCodeWords() {
        return this.f49694d;
    }

    public int getLayers() {
        return this.f49693c;
    }

    public BitMatrix getMatrix() {
        return this.f49695e;
    }

    public int getSize() {
        return this.f49692b;
    }

    public boolean isCompact() {
        return this.f49691a;
    }

    public void setCodeWords(int i10) {
        this.f49694d = i10;
    }

    public void setCompact(boolean z10) {
        this.f49691a = z10;
    }

    public void setLayers(int i10) {
        this.f49693c = i10;
    }

    public void setMatrix(BitMatrix bitMatrix) {
        this.f49695e = bitMatrix;
    }

    public void setSize(int i10) {
        this.f49692b = i10;
    }
}
