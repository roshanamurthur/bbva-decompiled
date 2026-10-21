package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends InstallState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46125e;

    public a(int i10, long j10, long j11, int i11, String str) {
        this.f46121a = i10;
        this.f46122b = j10;
        this.f46123c = j11;
        this.f46124d = i11;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.f46125e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.f46122b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f46121a == installState.installStatus() && this.f46122b == installState.bytesDownloaded() && this.f46123c == installState.totalBytesToDownload() && this.f46124d == installState.installErrorCode() && this.f46125e.equals(installState.packageName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f46121a ^ 1000003;
        long j10 = this.f46122b;
        long j11 = this.f46123c;
        return (((((((i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f46124d) * 1000003) ^ this.f46125e.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallErrorCode
    public final int installErrorCode() {
        return this.f46124d;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallStatus
    public final int installStatus() {
        return this.f46121a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.f46125e;
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f46121a + ", bytesDownloaded=" + this.f46122b + ", totalBytesToDownload=" + this.f46123c + ", installErrorCode=" + this.f46124d + ", packageName=" + this.f46125e + "}";
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.f46123c;
    }
}
