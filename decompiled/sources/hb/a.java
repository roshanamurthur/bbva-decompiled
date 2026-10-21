package hb;

import androidx.core.os.BundleKt;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.plugin.media.capture.command.impl.GetPictureCommand;
import com.bbva.plugin.media.capture.model.TempFile;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GetPictureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GetPictureCommand f69360p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GetPictureCommand getPictureCommand) {
        super(1);
        this.f69360p0 = getPictureCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResultRequest.Builder builder) {
        ActivityResultRequest.Builder receiver = builder;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.setAction("android.media.action.IMAGE_CAPTURE");
        Pair[] pairArr = new Pair[1];
        TempFile tempFile = this.f69360p0.f35817r0;
        pairArr[0] = TuplesKt.to("output", tempFile != null ? tempFile.getUri() : null);
        receiver.setExtras(BundleKt.bundleOf(pairArr));
        return Unit.INSTANCE;
    }
}
