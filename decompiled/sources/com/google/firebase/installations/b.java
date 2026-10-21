package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import ig.h;

/* JADX INFO: compiled from: GetAuthTokenListener.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Utils f48468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<InstallationTokenResult> f48469b;

    public b(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.f48468a = utils;
        this.f48469b = taskCompletionSource;
    }

    @Override // ig.h
    public final boolean a(Exception exc) {
        this.f48469b.trySetException(exc);
        return true;
    }

    @Override // ig.h
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.f48468a.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        this.f48469b.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }
}
