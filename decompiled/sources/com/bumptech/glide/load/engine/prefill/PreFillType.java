package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.activity.a;
import androidx.annotation.Nullable;
import com.bumptech.glide.util.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class PreFillType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f38398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38399d;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f38401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f38402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38403d;

        public Builder(int i10) {
            this(i10, i10);
        }

        public Builder setConfig(@Nullable Bitmap.Config config) {
            this.f38402c = config;
            return this;
        }

        public Builder setWeight(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f38403d = i10;
            return this;
        }

        public Builder(int i10, int i11) {
            this.f38403d = 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i11 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f38400a = i10;
            this.f38401b = i11;
        }
    }

    static {
        Bitmap.Config config = Bitmap.Config.RGB_565;
    }

    public PreFillType(int i10, int i11, Bitmap.Config config, int i12) {
        this.f38398c = (Bitmap.Config) Preconditions.checkNotNull(config, "Config must not be null");
        this.f38396a = i10;
        this.f38397b = i11;
        this.f38399d = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PreFillType)) {
            return false;
        }
        PreFillType preFillType = (PreFillType) obj;
        return this.f38397b == preFillType.f38397b && this.f38396a == preFillType.f38396a && this.f38399d == preFillType.f38399d && this.f38398c == preFillType.f38398c;
    }

    public int hashCode() {
        return ((this.f38398c.hashCode() + (((this.f38396a * 31) + this.f38397b) * 31)) * 31) + this.f38399d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreFillSize{width=");
        sb2.append(this.f38396a);
        sb2.append(", height=");
        sb2.append(this.f38397b);
        sb2.append(", config=");
        sb2.append(this.f38398c);
        sb2.append(", weight=");
        return a.d(sb2, this.f38399d, AbstractJsonLexerKt.END_OBJ);
    }
}
