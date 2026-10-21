package f7;

import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LoggerKt.logError("Activity update request failure", it);
    }
}
