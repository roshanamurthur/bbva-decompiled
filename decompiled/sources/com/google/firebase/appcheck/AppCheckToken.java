package com.google.firebase.appcheck;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AppCheckToken {
    public abstract long getExpireTimeMillis();

    @NonNull
    public abstract String getToken();
}
