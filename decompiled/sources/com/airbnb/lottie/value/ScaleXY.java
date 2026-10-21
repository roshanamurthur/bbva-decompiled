package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleXY {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26241b;

    public ScaleXY(float f6, float f10) {
        this.f26240a = f6;
        this.f26241b = f10;
    }

    public boolean equals(float f6, float f10) {
        return this.f26240a == f6 && this.f26241b == f10;
    }

    public float getScaleX() {
        return this.f26240a;
    }

    public float getScaleY() {
        return this.f26241b;
    }

    public void set(float f6, float f10) {
        this.f26240a = f6;
        this.f26241b = f10;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
