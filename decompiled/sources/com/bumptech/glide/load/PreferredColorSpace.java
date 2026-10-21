package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PreferredColorSpace {
    private static final /* synthetic */ PreferredColorSpace[] $VALUES;
    public static final PreferredColorSpace DISPLAY_P3;
    public static final PreferredColorSpace SRGB;

    static {
        PreferredColorSpace preferredColorSpace = new PreferredColorSpace("SRGB", 0);
        SRGB = preferredColorSpace;
        PreferredColorSpace preferredColorSpace2 = new PreferredColorSpace("DISPLAY_P3", 1);
        DISPLAY_P3 = preferredColorSpace2;
        $VALUES = new PreferredColorSpace[]{preferredColorSpace, preferredColorSpace2};
    }

    public PreferredColorSpace() {
        throw null;
    }

    public static PreferredColorSpace valueOf(String str) {
        return (PreferredColorSpace) Enum.valueOf(PreferredColorSpace.class, str);
    }

    public static PreferredColorSpace[] values() {
        return (PreferredColorSpace[]) $VALUES.clone();
    }
}
