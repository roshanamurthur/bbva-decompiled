package xe;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzn;
import com.google.android.play.core.splitinstall.internal.zzv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class c extends zzv {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Collection f94550q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Collection f94551r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ zzn f94552s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f94553t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ t f94554u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, TaskCompletionSource taskCompletionSource, List list, ArrayList arrayList, zzn zznVar, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f94554u0 = tVar;
        this.f94550q0 = list;
        this.f94551r0 = arrayList;
        this.f94552s0 = zznVar;
        this.f94553t0 = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.IInterface, com.google.android.play.core.splitinstall.internal.zzbo] */
    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        TaskCompletionSource taskCompletionSource = this.f94553t0;
        zzn zznVar = this.f94552s0;
        t tVar = this.f94554u0;
        Collection collection = this.f94550q0;
        ArrayList arrayListB = t.b(collection);
        Collection collection2 = this.f94551r0;
        arrayListB.addAll(t.a(collection2));
        try {
            zznVar.zzb(2);
            ?? Zze = tVar.f94580b.zze();
            String str = tVar.f94579a;
            Bundle bundleC = t.c();
            bundleC.putParcelableArrayList("event_timestamps", new ArrayList<>(zznVar.zza()));
            Zze.zzj(str, arrayListB, bundleC, new r(tVar, taskCompletionSource));
        } catch (RemoteException e5) {
            t.f94577c.zzc(e5, "startInstall(%s,%s)", collection, collection2);
            taskCompletionSource.trySetException(new RuntimeException(e5));
        }
    }
}
