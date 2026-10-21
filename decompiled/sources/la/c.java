package la;

import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: WelcomeActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ WelcomeActivity f83151p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WelcomeActivity welcomeActivity) {
        super(1);
        this.f83151p0 = welcomeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        LoaderSpinnerComponent loaderSpinnerComponent = WelcomeActivity.access$getBinding(this.f83151p0).welcomeSpinner;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            loaderSpinnerComponent.showSpinner();
        } else {
            loaderSpinnerComponent.hideSpinner();
        }
        return Unit.INSTANCE;
    }
}
