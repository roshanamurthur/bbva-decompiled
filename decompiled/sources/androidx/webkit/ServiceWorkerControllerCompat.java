package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ServiceWorkerControllerImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ServiceWorkerControllerCompat {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ServiceWorkerControllerImpl f24022a = new ServiceWorkerControllerImpl();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ServiceWorkerControllerCompat() {
    }

    @NonNull
    public static ServiceWorkerControllerCompat getInstance() {
        return a.f24022a;
    }

    @NonNull
    public abstract ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat);
}
