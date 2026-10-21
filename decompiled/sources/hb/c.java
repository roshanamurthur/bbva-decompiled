package hb;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.plugin.media.capture.util.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GetPictureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f69362p0 = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResultRequest.Builder builder) {
        ActivityResultRequest.Builder receiver = builder;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.setType(Constants.INTENT_TYPE);
        receiver.setAction("android.intent.action.GET_CONTENT");
        return Unit.INSTANCE;
    }
}
