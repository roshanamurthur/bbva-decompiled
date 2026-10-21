package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends AppUpdateOptions.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f46086c;

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions build() {
        if (this.f46086c == 3) {
            return new k(this.f46084a, this.f46085b);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f46086c & 1) == 0) {
            sb2.append(" appUpdateType");
        }
        if ((this.f46086c & 2) == 0) {
            sb2.append(" allowAssetPackDeletion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z10) {
        this.f46085b = z10;
        this.f46086c = (byte) (this.f46086c | 2);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAppUpdateType(int i10) {
        this.f46084a = i10;
        this.f46086c = (byte) (this.f46086c | 1);
        return this;
    }
}
