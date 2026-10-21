package androidx.lifecycle;

import android.database.SQLException;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.embedding.SplitInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f22171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f22172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f22173r0;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f22171p0 = i10;
        this.f22172q0 = obj;
        this.f22173r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22171p0;
        Object obj = this.f22173r0;
        Object obj2 = this.f22172q0;
        switch (i10) {
            case 0:
                DispatchQueue this$0 = (DispatchQueue) obj2;
                Runnable runnable = (Runnable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(runnable, "$runnable");
                this$0.a(runnable);
                break;
            case 1:
                ExtensionEmbeddingBackend.SplitListenerWrapper this$1 = (ExtensionEmbeddingBackend.SplitListenerWrapper) obj2;
                List<SplitInfo> splitsWithActivity = (List) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(splitsWithActivity, "$splitsWithActivity");
                this$1.f24140c.accept(splitsWithActivity);
                break;
            case 2:
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = (DefaultFirebaseAppCheck) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                AppCheckToken appCheckTokenRetrieveAppCheckToken = defaultFirebaseAppCheck.f47604e.retrieveAppCheckToken();
                if (appCheckTokenRetrieveAppCheckToken != null) {
                    defaultFirebaseAppCheck.f47612n = appCheckTokenRetrieveAppCheckToken;
                }
                taskCompletionSource.setResult(null);
                break;
            default:
                ag.b bVar = (ag.b) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                bVar.getClass();
                try {
                    ForcedSender.sendBlocking(bVar.f238h, Priority.HIGHEST);
                    break;
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                break;
        }
    }
}
