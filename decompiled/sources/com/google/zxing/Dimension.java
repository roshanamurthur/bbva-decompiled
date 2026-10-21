package com.google.zxing;

/* JADX INFO: loaded from: classes10.dex */
public final class Dimension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49644b;

    public Dimension(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        this.f49643a = i10;
        this.f49644b = i11;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            if (this.f49643a == dimension.f49643a && this.f49644b == dimension.f49644b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f49644b;
    }

    public int getWidth() {
        return this.f49643a;
    }

    public int hashCode() {
        return (this.f49643a * 32713) + this.f49644b;
    }

    public String toString() {
        return this.f49643a + "x" + this.f49644b;
    }
}
