package androidx.camera.view;

import android.location.Location;
import android.util.Log;
import androidx.camera.core.CameraSelector;
import androidx.core.location.LocationManagerCompat;
import androidx.core.util.Consumer;
import com.bbva.component.dm.akamai.interceptor.interceptors.AkamaiInterceptor;
import com.bbva.component.dm.akamai.interceptor.models.AkamaiErrorType;
import com.bbva.push.model.Push;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskState;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2298p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2299q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2300r0;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f2298p0 = i10;
        this.f2299q0 = obj;
        this.f2300r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2298p0;
        Object obj = this.f2300r0;
        Object obj2 = this.f2299q0;
        switch (i10) {
            case 0:
                ((CameraController) obj2).lambda$setCameraSelector$3((CameraSelector) obj);
                break;
            case 1:
                Class<?> cls = LocationManagerCompat.f19942a;
                ((Consumer) obj2).accept((Location) obj);
                break;
            case 2:
                AkamaiInterceptor this$0 = (AkamaiInterceptor) obj2;
                AkamaiErrorType akamaiErrorType = (AkamaiErrorType) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(akamaiErrorType, "$akamaiErrorType");
                this$0.getAkamaiListener().invoke(akamaiErrorType);
                break;
            case 3:
                List pushObservers = (List) obj2;
                Push push = (Push) obj;
                Intrinsics.checkNotNullParameter(pushObservers, "$pushObservers");
                Intrinsics.checkNotNullParameter(push, "$push");
                Iterator it = pushObservers.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(push);
                }
                break;
            case 4:
                ChannelsKt.trySendBlocking((ProducerScope) obj2, new TaskState.InProgress((StorageTask.SnapshotBase) obj));
                break;
            default:
                String tag = (String) obj2;
                Throwable tr = (Throwable) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(tr, "$tr");
                Log.wtf(tag, tr);
                break;
        }
    }
}
