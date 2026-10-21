package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.location.LocationManagerCompat;
import androidx.room.QueryInterceptorDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;
import com.google.firebase.storage.t;
import com.mypinpad.tsdk.isolation.setVisibility;
import com.mypinpad.tsdk.isolation.vh;
import com.noknok.android.client.utils.BaseTask;
import com.visa.internal.LogoElement;
import com.visa.internal.mam5;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2027p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2028q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2029r0;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f2027p0 = i10;
        this.f2028q0 = obj;
        this.f2029r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2027p0) {
            case 0:
                ((Camera2CameraControl) this.f2028q0).lambda$addCaptureRequestOptions$3((CallbackToFutureAdapter.Completer) this.f2029r0);
                break;
            case 1:
                LocationManagerCompat.n nVar = (LocationManagerCompat.n) this.f2028q0;
                if (nVar.f19970b == ((Executor) this.f2029r0)) {
                    nVar.f19969a.onStarted();
                    break;
                }
                break;
            case 2:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) this.f2028q0;
                String query = (String) this.f2029r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(query, "$query");
                this$0.f23255r0.onQuery(query, CollectionsKt__CollectionsKt.emptyList());
                break;
            case 3:
                ImageDownload imageDownload = (ImageDownload) this.f2028q0;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2029r0;
                imageDownload.getClass();
                try {
                    taskCompletionSource.setResult(imageDownload.blockingDownload());
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                    return;
                }
                break;
            case 4:
                ((t) this.f2028q0).c(this.f2029r0);
                break;
            case 5:
                vh.setCompoundDrawableTintBlendMode(new Object[]{(setVisibility) this.f2028q0, (Function0) this.f2029r0}, -234774682, 234774683, (int) System.currentTimeMillis());
                break;
            case 6:
                ((BaseTask) this.f2028q0).a((Object[]) this.f2029r0);
                break;
            default:
                mam5.a((LogoElement) this.f2028q0, (Function0) this.f2029r0);
                break;
        }
    }
}
