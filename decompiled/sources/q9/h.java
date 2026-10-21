package q9;

import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.model.RememberedUserBiometricsViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RememberedUserBiometricsViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RememberedUserBiometricsViewState f92793p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RememberedUserBiometricsViewState rememberedUserBiometricsViewState) {
        super(1);
        this.f92793p0 = rememberedUserBiometricsViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        textSettings2.setText(RememberedUserBiometricsViewState.access$toResource(this.f92793p0, R.string.login_accessing_biometrics));
        return Unit.INSTANCE;
    }
}
