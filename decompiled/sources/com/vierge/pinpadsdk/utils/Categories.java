package com.vierge.pinpadsdk.utils;

import com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class Categories {
    private static final /* synthetic */ Categories[] $VALUES;
    public static final Categories communication;
    public static final Categories debug;

    static {
        Categories categories = new Categories(BuildConfig.BUILD_TYPE, 0);
        debug = categories;
        Categories categories2 = new Categories("communication", 1);
        communication = categories2;
        $VALUES = new Categories[]{categories, categories2};
    }

    public Categories() {
        throw null;
    }

    public static Categories valueOf(String str) {
        return (Categories) Enum.valueOf(Categories.class, str);
    }

    public static Categories[] values() {
        return (Categories[]) $VALUES.clone();
    }
}
