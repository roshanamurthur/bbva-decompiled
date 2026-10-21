package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes2.dex */
public class MeanCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26213b;

    public void add(float f6) {
        float f10 = this.f26212a + f6;
        this.f26212a = f10;
        int i10 = this.f26213b + 1;
        this.f26213b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f26212a = f10 / 2.0f;
            this.f26213b = i10 / 2;
        }
    }

    public float getMean() {
        int i10 = this.f26213b;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.f26212a / i10;
    }
}
