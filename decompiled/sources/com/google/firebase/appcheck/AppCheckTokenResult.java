package com.google.firebase.appcheck;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AppCheckTokenResult {
    @Nullable
    public abstract Exception getError();

    @NonNull
    public abstract String getToken();
}
