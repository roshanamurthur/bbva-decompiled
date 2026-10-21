package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public class LottieImageAsset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Bitmap f25656f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieImageAsset(int i10, int i11, String str, String str2, String str3) {
        this.f25651a = i10;
        this.f25652b = i11;
        this.f25653c = str;
        this.f25654d = str2;
        this.f25655e = str3;
    }

    public LottieImageAsset copyWithScale(float f6) {
        LottieImageAsset lottieImageAsset = new LottieImageAsset((int) (this.f25651a * f6), (int) (this.f25652b * f6), this.f25653c, this.f25654d, this.f25655e);
        Bitmap bitmap = this.f25656f;
        if (bitmap != null) {
            lottieImageAsset.setBitmap(Bitmap.createScaledBitmap(bitmap, lottieImageAsset.f25651a, lottieImageAsset.f25652b, true));
        }
        return lottieImageAsset;
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.f25656f;
    }

    public String getDirName() {
        return this.f25655e;
    }

    public String getFileName() {
        return this.f25654d;
    }

    public int getHeight() {
        return this.f25652b;
    }

    public String getId() {
        return this.f25653c;
    }

    public int getWidth() {
        return this.f25651a;
    }

    public boolean hasBitmap() {
        if (this.f25656f == null) {
            String str = this.f25654d;
            if (!str.startsWith("data:") || str.indexOf("base64,") <= 0) {
                return false;
            }
        }
        return true;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        this.f25656f = bitmap;
    }
}
