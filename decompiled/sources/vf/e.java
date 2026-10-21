package vf;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: FirebaseCrashlytics.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements Callable<Void> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f94050p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f94051q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SettingsController f94052r0;

    public e(boolean z10, CrashlyticsCore crashlyticsCore, SettingsController settingsController) {
        this.f94050p0 = z10;
        this.f94051q0 = crashlyticsCore;
        this.f94052r0 = settingsController;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        if (!this.f94050p0) {
            return null;
        }
        this.f94051q0.doBackgroundInitializationAsync(this.f94052r0);
        return null;
    }
}
