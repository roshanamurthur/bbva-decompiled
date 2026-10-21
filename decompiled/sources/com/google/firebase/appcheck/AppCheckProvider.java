package com.google.firebase.appcheck;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes10.dex */
public interface AppCheckProvider {
    @NonNull
    Task<AppCheckToken> getToken();
}
