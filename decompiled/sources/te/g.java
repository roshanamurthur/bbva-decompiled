package te;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.integrity.internal.l;
import com.google.android.play.integrity.internal.w;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends l {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ byte[] f93549q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Long f93550r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f93551s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f93552t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ i f93553u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l6, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f93553u0 = iVar;
        this.f93549q0 = bArr;
        this.f93550r0 = l6;
        this.f93551s0 = taskCompletionSource2;
        this.f93552t0 = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.l
    public final void a(Exception exc) {
        if (exc instanceof w) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, com.google.android.play.integrity.internal.h] */
    @Override // com.google.android.play.integrity.internal.l
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.f93551s0;
        i iVar = this.f93553u0;
        try {
            iVar.f93559c.e().c(i.a(iVar, this.f93549q0, this.f93550r0), new h(iVar, taskCompletionSource));
        } catch (RemoteException e5) {
            iVar.f93557a.c(e5, "requestIntegrityToken(%s)", this.f93552t0);
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, e5));
        }
    }
}
