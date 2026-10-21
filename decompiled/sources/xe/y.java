package xe;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zzx;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SplitInstallSessionState f94597p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f94598q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f94599r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ zzx f94600s0;

    public y(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, int i10, int i11) {
        this.f94600s0 = zzxVar;
        this.f94597p0 = splitInstallSessionState;
        this.f94598q0 = i10;
        this.f94599r0 = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f94598q0;
        int i11 = this.f94599r0;
        SplitInstallSessionState splitInstallSessionState = this.f94597p0;
        this.f94600s0.zzk(new a(splitInstallSessionState.sessionId(), i10, i11, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.b(), splitInstallSessionState.a(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.c()));
    }
}
