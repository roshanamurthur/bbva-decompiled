package hg;

import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final FirebaseInstanceId f69424p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f69425q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f69426r0;

    public b(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f69424p0 = firebaseInstanceId;
        this.f69425q0 = str;
        this.f69426r0 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        final FirebaseInstanceId firebaseInstanceId = this.f69424p0;
        final String str = this.f69425q0;
        final String str2 = this.f69426r0;
        final String strE = firebaseInstanceId.e();
        final com.google.firebase.iid.a.C0211a c0211aG = firebaseInstanceId.g(str, str2);
        if (!firebaseInstanceId.j(c0211aG)) {
            return Tasks.forResult(new i(strE, c0211aG.f48433a));
        }
        m mVar = firebaseInstanceId.f48410e;
        synchronized (mVar) {
            Pair pair = new Pair(str, str2);
            Task task2 = (Task) mVar.f69443b.get(pair);
            if (task2 != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    new StringBuilder(String.valueOf(pair).length() + 29);
                }
                return task2;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                new StringBuilder(String.valueOf(pair).length() + 24);
            }
            Task taskAddOnSuccessListener = firebaseInstanceId.f48409d.getToken(strE, str, str2).onSuccessTask(firebaseInstanceId.f48406a, new SuccessContinuation(firebaseInstanceId, str, str2, strE) { // from class: hg.e

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final FirebaseInstanceId f69429p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final String f69430q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final String f69431r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final String f69432s0;

                {
                    this.f69429p0 = firebaseInstanceId;
                    this.f69430q0 = str;
                    this.f69431r0 = str2;
                    this.f69432s0 = strE;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    FirebaseInstanceId firebaseInstanceId2 = this.f69429p0;
                    String str3 = this.f69430q0;
                    String str4 = this.f69431r0;
                    String str5 = this.f69432s0;
                    String str6 = (String) obj;
                    com.google.firebase.iid.a aVar = FirebaseInstanceId.f48403j;
                    String strF = firebaseInstanceId2.f();
                    String appVersionCode = firebaseInstanceId2.f48408c.getAppVersionCode();
                    synchronized (aVar) {
                        String strA = com.google.firebase.iid.a.C0211a.a(System.currentTimeMillis(), str6, appVersionCode);
                        if (strA != null) {
                            SharedPreferences.Editor editorEdit = aVar.f48429a.edit();
                            editorEdit.putString(com.google.firebase.iid.a.b(strF, str3, str4), strA);
                            editorEdit.commit();
                        }
                    }
                    return Tasks.forResult(new i(str5, str6));
                }
            }).addOnSuccessListener(f.f69433p0, (OnSuccessListener<? super TContinuationResult>) new OnSuccessListener(firebaseInstanceId, c0211aG) { // from class: hg.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FirebaseInstanceId f69434a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.google.firebase.iid.a.C0211a f69435b;

                {
                    this.f69434a = firebaseInstanceId;
                    this.f69435b = c0211aG;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    FirebaseInstanceId firebaseInstanceId2 = this.f69434a;
                    firebaseInstanceId2.getClass();
                    String token = ((InstanceIdResult) obj).getToken();
                    com.google.firebase.iid.a.C0211a c0211a = this.f69435b;
                    if (c0211a == null || !token.equals(c0211a.f48433a)) {
                        Iterator it = firebaseInstanceId2.f48413h.iterator();
                        while (it.hasNext()) {
                            ((FirebaseInstanceIdInternal.NewTokenListener) it.next()).onNewToken(token);
                        }
                    }
                }
            });
            Executor executor = mVar.f69442a;
            re.a aVar = new re.a();
            aVar.f92992p0 = mVar;
            aVar.f92993q0 = pair;
            Task taskContinueWithTask = taskAddOnSuccessListener.continueWithTask(executor, aVar);
            mVar.f69443b.put(pair, taskContinueWithTask);
            return taskContinueWithTask;
        }
    }
}
