package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class GradientType {
    private static final /* synthetic */ GradientType[] $VALUES;
    public static final GradientType LINEAR;
    public static final GradientType RADIAL;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        LINEAR = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        RADIAL = gradientType2;
        $VALUES = new GradientType[]{gradientType, gradientType2};
    }

    public GradientType() {
        throw null;
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) $VALUES.clone();
    }
}
