package n6;

import com.bbva.discreetmode.camera.detector.DiscreetModeFacesDetector;
import com.bbva.discreetmode.camera.detector.OnFaceDetectorListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.v;
import com.google.mlkit.vision.face.Face;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84465b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f84464a = i10;
        this.f84465b = obj;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = this.f84464a;
        Object obj2 = this.f84465b;
        switch (i10) {
            case 0:
                DiscreetModeFacesDetector this$0 = (DiscreetModeFacesDetector) obj2;
                List<? extends Face> it = (List) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OnFaceDetectorListener onFaceDetectorListener = this$0.f29068a;
                if (onFaceDetectorListener != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    onFaceDetectorListener.onSuccessFacesDetection(it);
                    break;
                }
                break;
            default:
                v vVar = (v) obj;
                String str = FirebaseMessaging.INSTANCE_ID_SCOPE;
                if (((FirebaseMessaging) obj2).isAutoInitEnabled()) {
                    vVar.h();
                }
                break;
        }
    }
}
