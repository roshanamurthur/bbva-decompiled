package com.google.firebase.iid;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public interface InstanceIdResult {
    @NonNull
    String getId();

    @NonNull
    String getToken();
}
