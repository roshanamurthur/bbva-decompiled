package la;

import com.bbva.glomohybrid.welcome.presentation.view.WelcomeDistributionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WelcomeDistributionActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class j extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ WelcomeDistributionActivity f83163p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(WelcomeDistributionActivity welcomeDistributionActivity) {
        super(1);
        this.f83163p0 = welcomeDistributionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        WelcomeDistributionActivity.access$getLoaderSpinnerViewModel(this.f83163p0).showSpinner(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
