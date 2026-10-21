package k9;

import com.bbva.glomohybrid.landing.presentation.LandingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingActivity f79274p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LandingActivity landingActivity) {
        super(0);
        this.f79274p0 = landingActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LandingActivity landingActivity = this.f79274p0;
        if (!landingActivity.i().slideMenuView.isOpen()) {
            landingActivity.i().slideMenuView.open();
        }
        return Unit.INSTANCE;
    }
}
