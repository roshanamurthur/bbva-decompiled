package hb;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.plugin.media.capture.command.impl.GetPictureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GetPictureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends Lambda implements Function1<ActivityResult, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GetPictureCommand f69363p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GetPictureCommand getPictureCommand) {
        super(1);
        this.f69363p0 = getPictureCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResult activityResult) {
        ActivityResult it = activityResult;
        Intrinsics.checkNotNullParameter(it, "it");
        GetPictureCommand.access$dispatchResult(this.f69363p0, it);
        return Unit.INSTANCE;
    }
}
