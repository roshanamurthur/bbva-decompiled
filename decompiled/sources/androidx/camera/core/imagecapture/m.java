package androidx.camera.core.imagecapture;

import androidx.room.RoomTrackingLiveData;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2108p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2109q0;

    public /* synthetic */ m(Object obj, int i10) {
        this.f2108p0 = i10;
        this.f2109q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2108p0;
        Object obj = this.f2109q0;
        switch (i10) {
            case 0:
                ((TakePictureManager) obj).lambda$trackCurrentRequest$1();
                break;
            case 1:
                RoomTrackingLiveData this$0 = (RoomTrackingLiveData) obj;
                int i11 = RoomTrackingLiveData.f23331k;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean zHasActiveObservers = this$0.hasActiveObservers();
                if (this$0.f23337f.compareAndSet(false, true) && zHasActiveObservers) {
                    this$0.getQueryExecutor().execute(this$0.f23340i);
                    break;
                }
                break;
            case 2:
                DocumentFragment.c((DocumentFragment) obj);
                break;
            default:
                ((com.google.android.material.timepicker.d) obj).a();
                break;
        }
    }
}
