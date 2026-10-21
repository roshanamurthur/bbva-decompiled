package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: KeylineState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C0197b> f44215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44217d;

    /* JADX INFO: compiled from: KeylineState.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f44218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f44219b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0197b f44221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0197b f44222e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f44220c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44223f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44224g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f44225h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f44226i = -1;

        public a(float f6, float f10) {
            this.f44218a = f6;
            this.f44219b = f10;
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void a(float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10, float f11, boolean z10, boolean z11) {
            float fAbs;
            float f12 = f11 / 2.0f;
            float f13 = f6 - f12;
            float f14 = f12 + f6;
            float f15 = this.f44219b;
            if (f14 > f15) {
                fAbs = Math.abs(f14 - Math.max(f14 - f11, f15));
            } else {
                fAbs = 0.0f;
                if (f13 < 0.0f) {
                    fAbs = Math.abs(f13 - Math.min(f13 + f11, 0.0f));
                }
            }
            b(f6, f10, f11, z10, z11, fAbs, 0.0f, 0.0f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void b(float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10, float f11, boolean z10, boolean z11, float f12, float f13, float f14) {
            if (f11 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f44220c;
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f44226i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f44226i = arrayList.size();
            }
            C0197b c0197b = new C0197b(Float.MIN_VALUE, f6, f10, f11, z11, f12, f13, f14);
            if (z10) {
                if (this.f44221d == null) {
                    this.f44221d = c0197b;
                    this.f44223f = arrayList.size();
                }
                if (this.f44224g != -1 && arrayList.size() - this.f44224g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f11 != this.f44221d.f44230d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f44222e = c0197b;
                this.f44224g = arrayList.size();
            } else {
                if (this.f44221d == null && f11 < this.f44225h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f44222e != null && f11 > this.f44225h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f44225h = f11;
            arrayList.add(c0197b);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void c(float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10, float f11, int i10, boolean z10) {
            if (i10 <= 0 || f11 <= 0.0f) {
                return;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                a((i11 * f11) + f6, f10, f11, z10, false);
            }
        }

        @NonNull
        public final b d() {
            if (this.f44221d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f44220c;
                int size = arrayList2.size();
                float f6 = this.f44218a;
                if (i10 >= size) {
                    return new b(f6, arrayList, this.f44223f, this.f44224g);
                }
                C0197b c0197b = (C0197b) arrayList2.get(i10);
                arrayList.add(new C0197b((i10 * f6) + (this.f44221d.f44228b - (this.f44223f * f6)), c0197b.f44228b, c0197b.f44229c, c0197b.f44230d, c0197b.f44231e, c0197b.f44232f, c0197b.f44233g, c0197b.f44234h));
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KeylineState.java */
    public static final class C0197b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f44227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f44228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f44229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f44230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f44231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f44232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f44233g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f44234h;

        public C0197b(float f6, float f10, float f11, float f12, boolean z10, float f13, float f14, float f15) {
            this.f44227a = f6;
            this.f44228b = f10;
            this.f44229c = f11;
            this.f44230d = f12;
            this.f44231e = z10;
            this.f44232f = f13;
            this.f44233g = f14;
            this.f44234h = f15;
        }
    }

    public b(float f6, ArrayList arrayList, int i10, int i11) {
        this.f44214a = f6;
        this.f44215b = Collections.unmodifiableList(arrayList);
        this.f44216c = i10;
        this.f44217d = i11;
    }

    public final C0197b a() {
        return this.f44215b.get(this.f44216c);
    }

    public final C0197b b() {
        return this.f44215b.get(0);
    }

    public final C0197b c() {
        return this.f44215b.get(this.f44217d);
    }

    public final C0197b d() {
        return (C0197b) androidx.emoji2.text.flatbuffer.a.b(this.f44215b, 1);
    }
}
