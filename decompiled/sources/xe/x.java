package xe;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.internal.zzs;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.zzf;
import com.google.android.play.core.splitinstall.zzx;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class x implements zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitInstallSessionState f94593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f94594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f94595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzx f94596d;

    public x(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f94596d = zzxVar;
        this.f94593a = splitInstallSessionState;
        this.f94594b = intent;
        this.f94595c = context;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        zzx zzxVar = this.f94596d;
        zzxVar.f46375e.post(new y(zzxVar, this.f94593a, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(@SplitInstallErrorCode int i10) {
        zzx zzxVar = this.f94596d;
        zzxVar.f46375e.post(new y(zzxVar, this.f94593a, 6, i10));
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        Intent intent = this.f94594b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((zzs) this.f94596d).zza.zzb("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            this.f94595c.sendBroadcast(intent);
        }
    }
}
