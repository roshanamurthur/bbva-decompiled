package com.airbnb.lottie.model;

import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.n1;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class DocumentData {
    public float baselineShift;

    @Nullable
    public PointF boxPosition;

    @Nullable
    public PointF boxSize;

    @ColorInt
    public int color;
    public String fontName;
    public Justification justification;
    public float lineHeight;
    public float size;

    @ColorInt
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Justification {
        private static final /* synthetic */ Justification[] $VALUES;
        public static final Justification CENTER;
        public static final Justification LEFT_ALIGN;
        public static final Justification RIGHT_ALIGN;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            LEFT_ALIGN = justification;
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            RIGHT_ALIGN = justification2;
            Justification justification3 = new Justification("CENTER", 2);
            CENTER = justification3;
            $VALUES = new Justification[]{justification, justification2, justification3};
        }

        public Justification() {
            throw null;
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) $VALUES.clone();
        }
    }

    public DocumentData(String str, String str2, float f6, Justification justification, int i10, float f10, float f11, @ColorInt int i11, @ColorInt int i12, float f12, boolean z10, PointF pointF, PointF pointF2) {
        set(str, str2, f6, justification, i10, f10, f11, i11, i12, f12, z10, pointF, pointF2);
    }

    public int hashCode() {
        int iOrdinal = ((this.justification.ordinal() + (((int) (n1.c(this.fontName, this.text.hashCode() * 31, 31) + this.size)) * 31)) * 31) + this.tracking;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.color;
    }

    public void set(String str, String str2, float f6, Justification justification, int i10, float f10, float f11, @ColorInt int i11, @ColorInt int i12, float f12, boolean z10, PointF pointF, PointF pointF2) {
        this.text = str;
        this.fontName = str2;
        this.size = f6;
        this.justification = justification;
        this.tracking = i10;
        this.lineHeight = f10;
        this.baselineShift = f11;
        this.color = i11;
        this.strokeColor = i12;
        this.strokeWidth = f12;
        this.strokeOverFill = z10;
        this.boxPosition = pointF;
        this.boxSize = pointF2;
    }

    public DocumentData() {
    }
}
