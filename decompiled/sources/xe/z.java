package xe;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.zzx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SplitInstallRequest f94601p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ b f94602q0;

    public z(b bVar, SplitInstallRequest splitInstallRequest) {
        this.f94602q0 = bVar;
        this.f94601p0 = splitInstallRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar = this.f94602q0.f94546b;
        SplitInstallRequest splitInstallRequest = this.f94601p0;
        List<String> moduleNames = splitInstallRequest.getModuleNames();
        ArrayList arrayListA = b.a(splitInstallRequest.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt(com.huawei.hms.feature.model.b.f50436f, 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50440j, new ArrayList<>(moduleNames));
        }
        if (!arrayListA.isEmpty()) {
            bundle.putStringArrayList(com.huawei.hms.feature.model.b.f50443n, new ArrayList<>(arrayListA));
        }
        bundle.putLong(com.huawei.hms.feature.model.b.f50437g, 0L);
        bundle.putLong(com.huawei.hms.feature.model.b.f50433c, 0L);
        zzxVar.zzk(SplitInstallSessionState.zzd(bundle));
    }
}
