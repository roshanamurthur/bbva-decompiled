package com.google.android.gms.common.internal;

import android.net.Uri;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
public final class ResourceUtils {
    private static final Uri zza = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath(PluginUtils.IDENTIFIER_DRAWABLE).build();

    private ResourceUtils() {
    }
}
