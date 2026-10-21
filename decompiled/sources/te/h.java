package te;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.integrity.internal.k;
import com.google.android.play.integrity.internal.v;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends com.google.android.play.integrity.internal.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f93554e = new k("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TaskCompletionSource f93555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f93556g;

    public h(i iVar, TaskCompletionSource taskCompletionSource) {
        this.f93556g = iVar;
        this.f93555f = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.j
    public final void b(Bundle bundle) {
        v vVar = this.f93556g.f93559c;
        TaskCompletionSource taskCompletionSource = this.f93555f;
        vVar.r(taskCompletionSource);
        this.f93554e.d("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            taskCompletionSource.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            taskCompletionSource.trySetException(new IntegrityServiceException(-100, null));
        } else {
            taskCompletionSource.trySetResult(new b(string));
        }
    }
}
