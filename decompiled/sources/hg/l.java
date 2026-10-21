package hg;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements Continuation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final l f69441p0 = new l();

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return ((InstanceIdResult) task.getResult()).getToken();
    }
}
