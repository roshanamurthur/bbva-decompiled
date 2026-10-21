package androidx.camera.core.impl;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2120p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2121q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2122r0;

    public /* synthetic */ l(Object obj, Object obj2, int i10) {
        this.f2120p0 = i10;
        this.f2121q0 = obj;
        this.f2122r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2120p0) {
            case 0:
                ((CameraRepository) this.f2121q0).lambda$deinit$1((CameraInternal) this.f2122r0);
                return;
            case 1:
                MultiInstanceInvalidationClient this$0 = (MultiInstanceInvalidationClient) this.f2121q0;
                String[] tables = (String[]) this.f2122r0;
                int i10 = MultiInstanceInvalidationClient$callback$1.f23243f;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(tables, "$tables");
                this$0.getInvalidationTracker().notifyObserversByTableNames((String[]) Arrays.copyOf(tables, tables.length));
                return;
            case 2:
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = (DefaultFirebaseAppCheck) this.f2121q0;
                defaultFirebaseAppCheck.f47604e.saveAppCheckToken((AppCheckToken) this.f2122r0);
                return;
            case 3:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2121q0;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2122r0;
                String str = FirebaseMessaging.INSTANCE_ID_SCOPE;
                firebaseMessaging.getClass();
                try {
                    com.google.firebase.messaging.k kVar = firebaseMessaging.f48554e;
                    kVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(kVar.a(kVar.c(com.google.firebase.messaging.l.c(kVar.f48636a), ProxyConfig.MATCH_ALL_SCHEMES, bundle)));
                    com.google.firebase.messaging.p pVarC = FirebaseMessaging.c(firebaseMessaging.f48553d);
                    String strD = firebaseMessaging.d();
                    String strC = com.google.firebase.messaging.l.c(firebaseMessaging.f48550a);
                    synchronized (pVarC) {
                        String strA = com.google.firebase.messaging.p.a(strD, strC);
                        SharedPreferences.Editor editorEdit = pVarC.f48657a.edit();
                        editorEdit.remove(strA);
                        editorEdit.commit();
                    }
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                    return;
                }
            default:
                String tag = (String) this.f2121q0;
                String msg = (String) this.f2122r0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(msg, "$msg");
                return;
        }
    }
}
