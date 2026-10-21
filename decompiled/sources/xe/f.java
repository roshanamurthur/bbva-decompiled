package xe;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class f extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List f94561q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f94562r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ t f94563s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, TaskCompletionSource taskCompletionSource, ArrayList arrayList, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f94563s0 = tVar;
        this.f94561q0 = arrayList;
        this.f94562r0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        TaskCompletionSource taskCompletionSource = this.f94562r0;
        List list = this.f94561q0;
        t tVar = this.f94563s0;
        try {
            tVar.f94580b.zze().zze(tVar.f94579a, t.a(list), t.c(), new m(tVar, taskCompletionSource));
        } catch (RemoteException e5) {
            t.f94577c.zzc(e5, "deferredLanguageInstall(%s)", list);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}
