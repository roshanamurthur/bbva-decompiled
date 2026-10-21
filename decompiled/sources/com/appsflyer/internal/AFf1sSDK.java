package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public enum AFf1sSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
