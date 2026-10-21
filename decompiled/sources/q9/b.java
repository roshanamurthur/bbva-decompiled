package q9;

import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.component.ui.login.model.RememberedUserType;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.model.CountryRememberedUserBiometricsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountryRememberedUserBiometricsViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RememberedUserType f92783p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CountryRememberedUserBiometricsViewState f92784q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RememberedUserType rememberedUserType, CountryRememberedUserBiometricsViewState countryRememberedUserBiometricsViewState) {
        super(1);
        this.f92783p0 = rememberedUserType;
        this.f92784q0 = countryRememberedUserBiometricsViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        textSettings2.setView(new ViewSettings((Resource) null, (ResourceId) null, Boolean.valueOf(RememberedUserType.BIOMETRICS == this.f92783p0), (Visibility) null, (String) null, 27, (DefaultConstructorMarker) null));
        textSettings2.setText(CountryRememberedUserBiometricsViewState.access$toResource(this.f92784q0, R.string.login_access_biometrics));
        return Unit.INSTANCE;
    }
}
