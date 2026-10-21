package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.wearable.PutDataRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class zzgj {
    public static IntentFilter zza(String str, Uri uri, int i10) {
        IntentFilter intentFilter = new IntentFilter(str);
        if (uri.getScheme() != null) {
            intentFilter.addDataScheme(uri.getScheme());
        }
        if (uri.getAuthority() != null) {
            intentFilter.addDataAuthority(uri.getAuthority(), Integer.toString(uri.getPort()));
        }
        if (uri.getPath() != null) {
            intentFilter.addDataPath(uri.getPath(), i10);
        }
        return intentFilter;
    }

    public static IntentFilter zzc(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme(PutDataRequest.WEAR_URI_SCHEME);
        intentFilter.addDataAuthority(ProxyConfig.MATCH_ALL_SCHEMES, null);
        return intentFilter;
    }
}
