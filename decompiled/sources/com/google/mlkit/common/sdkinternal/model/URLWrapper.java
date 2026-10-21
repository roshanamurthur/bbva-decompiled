package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class URLWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f49486a;

    @KeepForSdk
    public URLWrapper(@NonNull String str) throws MalformedURLException {
        this.f49486a = new URL(str);
    }

    @NonNull
    @KeepForSdk
    public URLConnection openConnection() throws IOException {
        return this.f49486a.openConnection();
    }
}
