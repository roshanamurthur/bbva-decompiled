package kb;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.rateapp.command.InAppReviewCommand;
import com.bbva.rateapp.InAppReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: InAppReviewCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class c extends Lambda implements Function1<InAppReview, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ InAppReviewCommand f79283p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Activity f79284q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f79285r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InAppReviewCommand inAppReviewCommand, CommandCallback commandCallback, Activity activity) {
        super(1);
        this.f79283p0 = inAppReviewCommand;
        this.f79284q0 = activity;
        this.f79285r0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InAppReview inAppReview) {
        InAppReview it = inAppReview;
        Intrinsics.checkNotNullParameter(it, "it");
        InAppReviewCommand inAppReviewCommand = this.f79283p0;
        BuildersKt__Builders_commonKt.launch$default(inAppReviewCommand, null, null, new b(it, this.f79284q0, this.f79285r0, inAppReviewCommand, null), 3, null);
        return Unit.INSTANCE;
    }
}
