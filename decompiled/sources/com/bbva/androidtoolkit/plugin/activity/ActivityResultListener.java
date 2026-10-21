package com.bbva.androidtoolkit.plugin.activity;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public interface ActivityResultListener {
    void onCancel();

    void onSuccess(Intent intent);
}
