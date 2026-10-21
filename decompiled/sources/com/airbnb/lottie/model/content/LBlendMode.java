package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import androidx.core.graphics.BlendModeCompat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class LBlendMode {
    private static final /* synthetic */ LBlendMode[] $VALUES;
    public static final LBlendMode ADD;
    public static final LBlendMode COLOR;
    public static final LBlendMode COLOR_BURN;
    public static final LBlendMode COLOR_DODGE;
    public static final LBlendMode DARKEN;
    public static final LBlendMode DIFFERENCE;
    public static final LBlendMode EXCLUSION;
    public static final LBlendMode HARD_LIGHT;
    public static final LBlendMode HARD_MIX;
    public static final LBlendMode HUE;
    public static final LBlendMode LIGHTEN;
    public static final LBlendMode LUMINOSITY;
    public static final LBlendMode MULTIPLY;
    public static final LBlendMode NORMAL;
    public static final LBlendMode OVERLAY;
    public static final LBlendMode SATURATION;
    public static final LBlendMode SCREEN;
    public static final LBlendMode SOFT_LIGHT;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26007a;

        static {
            int[] iArr = new int[LBlendMode.values().length];
            f26007a = iArr;
            try {
                iArr[LBlendMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26007a[LBlendMode.MULTIPLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26007a[LBlendMode.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26007a[LBlendMode.OVERLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26007a[LBlendMode.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26007a[LBlendMode.LIGHTEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26007a[LBlendMode.ADD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26007a[LBlendMode.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26007a[LBlendMode.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26007a[LBlendMode.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26007a[LBlendMode.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26007a[LBlendMode.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26007a[LBlendMode.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26007a[LBlendMode.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26007a[LBlendMode.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26007a[LBlendMode.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26007a[LBlendMode.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26007a[LBlendMode.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static {
        LBlendMode lBlendMode = new LBlendMode("NORMAL", 0);
        NORMAL = lBlendMode;
        LBlendMode lBlendMode2 = new LBlendMode("MULTIPLY", 1);
        MULTIPLY = lBlendMode2;
        LBlendMode lBlendMode3 = new LBlendMode("SCREEN", 2);
        SCREEN = lBlendMode3;
        LBlendMode lBlendMode4 = new LBlendMode("OVERLAY", 3);
        OVERLAY = lBlendMode4;
        LBlendMode lBlendMode5 = new LBlendMode("DARKEN", 4);
        DARKEN = lBlendMode5;
        LBlendMode lBlendMode6 = new LBlendMode("LIGHTEN", 5);
        LIGHTEN = lBlendMode6;
        LBlendMode lBlendMode7 = new LBlendMode("COLOR_DODGE", 6);
        COLOR_DODGE = lBlendMode7;
        LBlendMode lBlendMode8 = new LBlendMode("COLOR_BURN", 7);
        COLOR_BURN = lBlendMode8;
        LBlendMode lBlendMode9 = new LBlendMode("HARD_LIGHT", 8);
        HARD_LIGHT = lBlendMode9;
        LBlendMode lBlendMode10 = new LBlendMode("SOFT_LIGHT", 9);
        SOFT_LIGHT = lBlendMode10;
        LBlendMode lBlendMode11 = new LBlendMode("DIFFERENCE", 10);
        DIFFERENCE = lBlendMode11;
        LBlendMode lBlendMode12 = new LBlendMode("EXCLUSION", 11);
        EXCLUSION = lBlendMode12;
        LBlendMode lBlendMode13 = new LBlendMode("HUE", 12);
        HUE = lBlendMode13;
        LBlendMode lBlendMode14 = new LBlendMode("SATURATION", 13);
        SATURATION = lBlendMode14;
        LBlendMode lBlendMode15 = new LBlendMode("COLOR", 14);
        COLOR = lBlendMode15;
        LBlendMode lBlendMode16 = new LBlendMode("LUMINOSITY", 15);
        LUMINOSITY = lBlendMode16;
        LBlendMode lBlendMode17 = new LBlendMode("ADD", 16);
        ADD = lBlendMode17;
        LBlendMode lBlendMode18 = new LBlendMode("HARD_MIX", 17);
        HARD_MIX = lBlendMode18;
        $VALUES = new LBlendMode[]{lBlendMode, lBlendMode2, lBlendMode3, lBlendMode4, lBlendMode5, lBlendMode6, lBlendMode7, lBlendMode8, lBlendMode9, lBlendMode10, lBlendMode11, lBlendMode12, lBlendMode13, lBlendMode14, lBlendMode15, lBlendMode16, lBlendMode17, lBlendMode18};
    }

    public LBlendMode() {
        throw null;
    }

    public static LBlendMode valueOf(String str) {
        return (LBlendMode) Enum.valueOf(LBlendMode.class, str);
    }

    public static LBlendMode[] values() {
        return (LBlendMode[]) $VALUES.clone();
    }

    @Nullable
    public BlendModeCompat toNativeBlendMode() {
        switch (a.f26007a[ordinal()]) {
            case 2:
                return BlendModeCompat.MODULATE;
            case 3:
                return BlendModeCompat.SCREEN;
            case 4:
                return BlendModeCompat.OVERLAY;
            case 5:
                return BlendModeCompat.DARKEN;
            case 6:
                return BlendModeCompat.LIGHTEN;
            case 7:
                return BlendModeCompat.PLUS;
            default:
                return null;
        }
    }
}
