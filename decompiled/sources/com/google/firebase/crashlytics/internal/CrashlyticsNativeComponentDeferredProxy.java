package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import y0.h;

/* JADX INFO: loaded from: classes10.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47695c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred<CrashlyticsNativeComponent> f47696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<CrashlyticsNativeComponent> f47697b = new AtomicReference<>(null);

    public static final class a implements NativeSessionFileProvider {
        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getAppFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getBinaryImagesFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getDeviceFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getMetadataFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getMinidumpFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getOsFile() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.NativeSessionFileProvider
        public final File getSessionFile() {
            return null;
        }
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.f47696a = deferred;
        deferred.whenAvailable(new h(this));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f47697b.get();
        return crashlyticsNativeComponent == null ? f47695c : crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f47697b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(@NonNull String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f47697b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(@NonNull final String str, @NonNull final String str2, final long j10, @NonNull final StaticSessionData staticSessionData) {
        Logger.getLogger().v("Deferring native open session: " + str);
        this.f47696a.whenAvailable(new Deferred.DeferredHandler() { // from class: wf.a
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                ((CrashlyticsNativeComponent) provider.get()).prepareNativeSession(str, str2, j10, staticSessionData);
            }
        });
    }
}
