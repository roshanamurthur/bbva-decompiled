package o9;

import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: LandingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends Lambda implements Function0<ParametersHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingViewModel f85357p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(LandingViewModel landingViewModel) {
        super(0);
        this.f85357p0 = landingViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(this.f85357p0.c().getRememberedUser());
    }
}
