package ye;

import com.google.android.play.core.splitinstall.testing.FakeSplitInstallManager;
import com.google.android.play.core.splitinstall.zzf;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f94790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f94791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f94792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f94793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f94794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FakeSplitInstallManager f94795f;

    public c(long j10, FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, List list3, boolean z10) {
        this.f94795f = fakeSplitInstallManager;
        this.f94790a = list;
        this.f94791b = list2;
        this.f94792c = j10;
        this.f94793d = z10;
        this.f94794e = list3;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        int i10 = FakeSplitInstallManager.zza;
        FakeSplitInstallManager fakeSplitInstallManager = this.f94795f;
        fakeSplitInstallManager.f46339l.addAll(this.f94790a);
        fakeSplitInstallManager.m.addAll(this.f94791b);
        Long lValueOf = Long.valueOf(this.f94792c);
        fakeSplitInstallManager.d(null, 5, 0, lValueOf, lValueOf, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i10) {
        FakeSplitInstallManager fakeSplitInstallManager = this.f94795f;
        int i11 = FakeSplitInstallManager.zza;
        fakeSplitInstallManager.d(null, 6, i10, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        if (this.f94793d) {
            return;
        }
        List list = this.f94794e;
        List list2 = this.f94790a;
        List list3 = this.f94791b;
        long j10 = this.f94792c;
        int i10 = FakeSplitInstallManager.zza;
        FakeSplitInstallManager fakeSplitInstallManager = this.f94795f;
        fakeSplitInstallManager.f46336i.zza().zzd(list, new c(j10, fakeSplitInstallManager, list2, list3, list, true));
    }
}
