package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public final class MemorySizeCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38303c;

    public static final class Builder {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f38304i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f38305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityManager f38306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f38307c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f38309e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f38308d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f38310f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f38311g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f38312h = 4194304;

        static {
            f38304i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public Builder(Context context) {
            this.f38309e = f38304i;
            this.f38305a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
            this.f38306b = activityManager;
            this.f38307c = new a(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
                return;
            }
            this.f38309e = 0.0f;
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        public Builder setArrayPoolSize(int i10) {
            this.f38312h = i10;
            return this;
        }

        public Builder setBitmapPoolScreens(float f6) {
            Preconditions.checkArgument(f6 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f38309e = f6;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f6) {
            Preconditions.checkArgument(f6 >= 0.0f && f6 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f38311g = f6;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f6) {
            Preconditions.checkArgument(f6 >= 0.0f && f6 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f38310f = f6;
            return this;
        }

        public Builder setMemoryCacheScreens(float f6) {
            Preconditions.checkArgument(f6 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f38308d = f6;
            return this;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f38313a;

        public a(DisplayMetrics displayMetrics) {
            this.f38313a = displayMetrics;
        }
    }

    public MemorySizeCalculator(Builder builder) {
        Context context = builder.f38305a;
        ActivityManager activityManager = builder.f38306b;
        int i10 = activityManager.isLowRamDevice() ? builder.f38312h / 2 : builder.f38312h;
        this.f38303c = i10;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? builder.f38311g : builder.f38310f));
        DisplayMetrics displayMetrics = builder.f38307c.f38313a;
        float f6 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(builder.f38309e * f6);
        int iRound3 = Math.round(f6 * builder.f38308d);
        int i11 = iRound - i10;
        if (iRound3 + iRound2 <= i11) {
            this.f38302b = iRound3;
            this.f38301a = iRound2;
        } else {
            float f10 = i11;
            float f11 = builder.f38309e;
            float f12 = builder.f38308d;
            float f13 = f10 / (f11 + f12);
            this.f38302b = Math.round(f12 * f13);
            this.f38301a = Math.round(f13 * builder.f38309e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f38302b);
            Formatter.formatFileSize(context, this.f38301a);
            Formatter.formatFileSize(context, i10);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }

    public int getArrayPoolSizeInBytes() {
        return this.f38303c;
    }

    public int getBitmapPoolSize() {
        return this.f38301a;
    }

    public int getMemoryCacheSize() {
        return this.f38302b;
    }
}
