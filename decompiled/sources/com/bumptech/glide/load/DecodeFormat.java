package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DecodeFormat {
    private static final /* synthetic */ DecodeFormat[] $VALUES;
    public static final DecodeFormat DEFAULT;
    public static final DecodeFormat PREFER_ARGB_8888;
    public static final DecodeFormat PREFER_RGB_565;

    static {
        DecodeFormat decodeFormat = new DecodeFormat("PREFER_ARGB_8888", 0);
        PREFER_ARGB_8888 = decodeFormat;
        DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
        PREFER_RGB_565 = decodeFormat2;
        $VALUES = new DecodeFormat[]{decodeFormat, decodeFormat2};
        DEFAULT = decodeFormat;
    }

    public DecodeFormat() {
        throw null;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) $VALUES.clone();
    }
}
