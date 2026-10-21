package hb;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.plugin.media.capture.command.impl.GetVideoCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GetVideoCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends Lambda implements Function1<ActivityResult, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GetVideoCommand f69373p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GetVideoCommand getVideoCommand) {
        super(1);
        this.f69373p0 = getVideoCommand;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ActivityResult activityResult) {
        ActivityResult it = activityResult;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z10 = it instanceof ActivityResult.Success;
        GetVideoCommand getVideoCommand = this.f69373p0;
        if (z10) {
            GetVideoCommand.access$onSuccess(getVideoCommand);
        } else {
            GetVideoCommand.access$onCancel(getVideoCommand);
        }
        return Unit.INSTANCE;
    }
}
