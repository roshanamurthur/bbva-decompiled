package androidx.webkit;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ServiceWorkerWebSettingsCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CacheMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ServiceWorkerWebSettingsCompat() {
    }

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getBlockNetworkLoads();

    public abstract int getCacheMode();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract int getRequestedWithHeaderMode();

    public abstract void setAllowContentAccess(boolean z10);

    public abstract void setAllowFileAccess(boolean z10);

    public abstract void setBlockNetworkLoads(boolean z10);

    public abstract void setCacheMode(int i10);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void setRequestedWithHeaderMode(int i10);
}
