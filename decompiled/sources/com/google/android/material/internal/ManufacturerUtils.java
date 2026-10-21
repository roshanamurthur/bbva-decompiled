package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ManufacturerUtils {
    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    public static boolean isLGEDevice() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("lge");
    }

    public static boolean isMeizuDevice() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu");
    }

    public static boolean isSamsungDevice() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("samsung");
    }
}
