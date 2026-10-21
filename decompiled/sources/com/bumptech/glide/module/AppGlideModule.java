package com.bumptech.glide.module;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.GlideBuilder;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AppGlideModule extends LibraryGlideModule {
    public boolean isManifestParsingEnabled() {
        return true;
    }

    public void applyOptions(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
    }
}
