package m9;

import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends Lambda implements Function1<ViewSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderState f83372p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LandingHeaderState landingHeaderState) {
        super(1);
        this.f83372p0 = landingHeaderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewSettings viewSettings) {
        ViewSettings viewSettings2 = viewSettings;
        Intrinsics.checkNotNullParameter(viewSettings2, "$this$viewSettings");
        Visibility visibility = Visibility.Gone;
        LandingHeaderState landingHeaderState = this.f83372p0;
        if (Intrinsics.areEqual(landingHeaderState.getType(), LandingHeaderState.Type.Enabled.INSTANCE)) {
            UserProfileConfiguration user = landingHeaderState.getUser();
            if ((user != null ? user.getRememberedUser() : null) != null) {
                visibility = null;
            }
        }
        viewSettings2.setVisibility(visibility);
        return Unit.INSTANCE;
    }
}
