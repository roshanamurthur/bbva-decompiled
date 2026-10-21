package q9;

import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.model.CountryRememberedUserBiometricsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountryRememberedUserBiometricsViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CountryRememberedUserBiometricsViewState f92782p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CountryRememberedUserBiometricsViewState countryRememberedUserBiometricsViewState) {
        super(1);
        this.f92782p0 = countryRememberedUserBiometricsViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        textSettings2.setText(CountryRememberedUserBiometricsViewState.access$toResource(this.f92782p0, R.string.login_accessing_biometrics));
        return Unit.INSTANCE;
    }
}
