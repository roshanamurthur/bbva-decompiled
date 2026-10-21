package com.bbva.cells.component.kit.ui.helper;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes2.dex */
public class UnitHelper {
    public static float dpToPixels(Resources resources, float f6) {
        return TypedValue.applyDimension(1, f6, resources.getDisplayMetrics());
    }

    public static float spToPixels(Resources resources, float f6) {
        return TypedValue.applyDimension(2, f6, resources.getDisplayMetrics());
    }
}
