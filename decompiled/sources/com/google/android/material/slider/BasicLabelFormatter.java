package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    @Override // com.google.android.material.slider.LabelFormatter
    @NonNull
    public String getFormattedValue(float f6) {
        if (f6 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f6 / 1.0E12f));
        }
        if (f6 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f6 / 1.0E9f));
        }
        if (f6 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f6 / 1000000.0f));
        }
        return f6 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f6 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f6));
    }
}
