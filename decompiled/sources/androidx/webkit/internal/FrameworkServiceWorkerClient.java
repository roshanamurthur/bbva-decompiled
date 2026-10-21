package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
public class FrameworkServiceWorkerClient extends ServiceWorkerClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceWorkerClientCompat f24055a;

    public FrameworkServiceWorkerClient(@NonNull ServiceWorkerClientCompat serviceWorkerClientCompat) {
        this.f24055a = serviceWorkerClientCompat;
    }

    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        return this.f24055a.shouldInterceptRequest(webResourceRequest);
    }
}
