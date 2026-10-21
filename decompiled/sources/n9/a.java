package n9;

import com.bbva.glomohybrid.landing.presentation.view.LandingChangeUserModalsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingChangeUserModalsView f84469p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LandingChangeUserModalsView landingChangeUserModalsView) {
        super(1);
        this.f84469p0 = landingChangeUserModalsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        LandingChangeUserModalsView.access$emitOpenLinkListener(this.f84469p0, it);
        return Unit.INSTANCE;
    }
}
