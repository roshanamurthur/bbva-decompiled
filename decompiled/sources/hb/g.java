package hb;

import android.net.Uri;
import androidx.core.os.BundleKt;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GetVideoCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Uri f69372p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Uri uri) {
        super(1);
        this.f69372p0 = uri;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResultRequest.Builder builder) {
        ActivityResultRequest.Builder receiver = builder;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.setAction("android.media.action.VIDEO_CAPTURE");
        receiver.setExtras(BundleKt.bundleOf(TuplesKt.to("output", this.f69372p0)));
        return Unit.INSTANCE;
    }
}
