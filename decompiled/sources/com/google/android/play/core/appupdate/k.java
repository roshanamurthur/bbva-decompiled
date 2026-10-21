package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends AppUpdateOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46088b;

    public /* synthetic */ k(int i10, boolean z10) {
        this.f46087a = i10;
        this.f46088b = z10;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
        return this.f46088b;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    @AppUpdateType
    public final int appUpdateType() {
        return this.f46087a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppUpdateOptions) {
            AppUpdateOptions appUpdateOptions = (AppUpdateOptions) obj;
            if (this.f46087a == appUpdateOptions.appUpdateType() && this.f46088b == appUpdateOptions.allowAssetPackDeletion()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46087a ^ 1000003) * 1000003) ^ (true != this.f46088b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f46087a + ", allowAssetPackDeletion=" + this.f46088b + "}";
    }
}
