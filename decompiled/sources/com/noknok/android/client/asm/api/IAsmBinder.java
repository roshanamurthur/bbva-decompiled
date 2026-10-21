package com.noknok.android.client.asm.api;

import android.content.ComponentName;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes11.dex */
public interface IAsmBinder {
    boolean bind();

    ComponentName getComponentName();

    Drawable getIcon();

    void unbind();
}
