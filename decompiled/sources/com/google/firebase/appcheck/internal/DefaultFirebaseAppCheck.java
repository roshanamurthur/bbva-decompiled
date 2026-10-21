package com.google.firebase.appcheck.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.k;
import androidx.databinding.f;
import androidx.lifecycle.d;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckProviderFactory;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.appcheck.interop.AppCheckTokenListener;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes10.dex */
public class DefaultFirebaseAppCheck extends FirebaseAppCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f47600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<HeartBeatController> f47601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f47602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f47603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StorageHelper f47604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TokenRefreshManager f47605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f47606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f47607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f47608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Task<Void> f47609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Clock.DefaultClock f47610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppCheckProviderFactory f47611l;
    public AppCheckProvider m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AppCheckToken f47612n;

    public DefaultFirebaseAppCheck(@NonNull FirebaseApp firebaseApp, @NonNull Provider<HeartBeatController> provider, @UiThread Executor executor, @Lightweight Executor executor2, @Background Executor executor3, @Blocking ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(provider);
        this.f47600a = firebaseApp;
        this.f47601b = provider;
        this.f47602c = new ArrayList();
        this.f47603d = new ArrayList();
        this.f47604e = new StorageHelper(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey());
        this.f47605f = new TokenRefreshManager(firebaseApp.getApplicationContext(), this, executor2, scheduledExecutorService);
        this.f47606g = executor;
        this.f47607h = executor2;
        this.f47608i = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new d(this, taskCompletionSource, 2));
        this.f47609j = taskCompletionSource.getTask();
        this.f47610k = new Clock.DefaultClock();
    }

    public final boolean a() {
        AppCheckToken appCheckToken = this.f47612n;
        return appCheckToken != null && appCheckToken.getExpireTimeMillis() - this.f47610k.currentTimeMillis() > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void addAppCheckListener(@NonNull FirebaseAppCheck.AppCheckListener appCheckListener) {
        Preconditions.checkNotNull(appCheckListener);
        ArrayList arrayList = this.f47603d;
        arrayList.add(appCheckListener);
        this.f47605f.onListenerCountChanged(arrayList.size() + this.f47602c.size());
        if (a()) {
            appCheckListener.onAppCheckTokenChanged(this.f47612n);
        }
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public void addAppCheckTokenListener(@NonNull AppCheckTokenListener appCheckTokenListener) {
        Preconditions.checkNotNull(appCheckTokenListener);
        ArrayList arrayList = this.f47602c;
        arrayList.add(appCheckTokenListener);
        this.f47605f.onListenerCountChanged(this.f47603d.size() + arrayList.size());
        if (a()) {
            appCheckTokenListener.onAppCheckTokenChanged(DefaultAppCheckTokenResult.constructFromAppCheckToken(this.f47612n));
        }
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    @NonNull
    public Task<AppCheckToken> getAppCheckToken(final boolean z10) {
        return this.f47609j.continueWithTask(this.f47607h, new Continuation() { // from class: sf.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                boolean z11 = z10;
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = this.f93175p0;
                if (!z11 && defaultFirebaseAppCheck.a()) {
                    return Tasks.forResult(defaultFirebaseAppCheck.f47612n);
                }
                AppCheckProvider appCheckProvider = defaultFirebaseAppCheck.m;
                if (appCheckProvider == null) {
                    return Tasks.forException(new FirebaseException("No AppCheckProvider installed."));
                }
                return appCheckProvider.getToken().onSuccessTask(defaultFirebaseAppCheck.f47606g, new k(defaultFirebaseAppCheck));
            }
        });
    }

    @Nullable
    @VisibleForTesting
    public AppCheckProviderFactory getInstalledAppCheckProviderFactory() {
        return this.f47611l;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    @NonNull
    public Task<AppCheckToken> getLimitedUseAppCheckToken() {
        AppCheckProvider appCheckProvider = this.m;
        return appCheckProvider == null ? Tasks.forException(new FirebaseException("No AppCheckProvider installed.")) : appCheckProvider.getToken();
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    @NonNull
    public Task<AppCheckTokenResult> getLimitedUseToken() {
        return getLimitedUseAppCheckToken().continueWithTask(this.f47607h, new f());
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    @NonNull
    public Task<AppCheckTokenResult> getToken(final boolean z10) {
        return this.f47609j.continueWithTask(this.f47607h, new Continuation() { // from class: sf.b
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                boolean z11 = z10;
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = this.f93177p0;
                if (!z11 && defaultFirebaseAppCheck.a()) {
                    return Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken(defaultFirebaseAppCheck.f47612n));
                }
                AppCheckProvider appCheckProvider = defaultFirebaseAppCheck.m;
                if (appCheckProvider == null) {
                    return Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException("No AppCheckProvider installed.")));
                }
                return appCheckProvider.getToken().onSuccessTask(defaultFirebaseAppCheck.f47606g, new k(defaultFirebaseAppCheck)).continueWithTask(defaultFirebaseAppCheck.f47607h, new w4.a(5));
            }
        });
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void installAppCheckProviderFactory(@NonNull AppCheckProviderFactory appCheckProviderFactory) {
        installAppCheckProviderFactory(appCheckProviderFactory, this.f47600a.isDataCollectionDefaultEnabled());
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void removeAppCheckListener(@NonNull FirebaseAppCheck.AppCheckListener appCheckListener) {
        Preconditions.checkNotNull(appCheckListener);
        ArrayList arrayList = this.f47603d;
        arrayList.remove(appCheckListener);
        this.f47605f.onListenerCountChanged(arrayList.size() + this.f47602c.size());
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public void removeAppCheckTokenListener(@NonNull AppCheckTokenListener appCheckTokenListener) {
        Preconditions.checkNotNull(appCheckTokenListener);
        ArrayList arrayList = this.f47602c;
        arrayList.remove(appCheckTokenListener);
        this.f47605f.onListenerCountChanged(this.f47603d.size() + arrayList.size());
    }

    @VisibleForTesting
    public void resetAppCheckState() {
        this.f47611l = null;
        this.m = null;
        this.f47612n = null;
        this.f47604e.f47629a.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void setTokenAutoRefreshEnabled(boolean z10) {
        this.f47605f.setIsAutoRefreshEnabled(z10);
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public void installAppCheckProviderFactory(@NonNull AppCheckProviderFactory appCheckProviderFactory, boolean z10) {
        Preconditions.checkNotNull(appCheckProviderFactory);
        this.f47611l = appCheckProviderFactory;
        this.m = appCheckProviderFactory.create(this.f47600a);
        this.f47605f.setIsAutoRefreshEnabled(z10);
    }
}
