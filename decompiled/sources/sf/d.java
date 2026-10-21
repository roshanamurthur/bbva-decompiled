package sf;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.firebase.appcheck.internal.DefaultTokenRefresher;
import com.google.firebase.appcheck.internal.TokenRefreshManager;
import com.google.firebase.appcheck.internal.util.Clock;

/* JADX INFO: compiled from: TokenRefreshManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DefaultTokenRefresher f93181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Clock f93182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TokenRefreshManager f93183c;

    public d(TokenRefreshManager tokenRefreshManager, DefaultTokenRefresher defaultTokenRefresher, Clock.DefaultClock defaultClock) {
        this.f93183c = tokenRefreshManager;
        this.f93181a = defaultTokenRefresher;
        this.f93182b = defaultClock;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z10) {
        this.f93183c.f47633c = z10;
        if (z10) {
            this.f93181a.cancel();
        } else if (this.f93183c.a()) {
            this.f93181a.scheduleRefresh(this.f93183c.f47635e - this.f93182b.currentTimeMillis());
        }
    }
}
