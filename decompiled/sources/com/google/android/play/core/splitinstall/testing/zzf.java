package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class zzf implements Runnable {
    public final /* synthetic */ FakeSplitInstallManager zza;
    public final /* synthetic */ SplitInstallSessionState zzb;

    public /* synthetic */ zzf(FakeSplitInstallManager fakeSplitInstallManager, SplitInstallSessionState splitInstallSessionState) {
        this.zza = fakeSplitInstallManager;
        this.zzb = splitInstallSessionState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FakeSplitInstallManager fakeSplitInstallManager = this.zza;
        SplitInstallSessionState splitInstallSessionState = this.zzb;
        fakeSplitInstallManager.f46333f.zzc(splitInstallSessionState);
        fakeSplitInstallManager.f46334g.zzc(splitInstallSessionState);
    }
}
