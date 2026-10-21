package m9;

import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f83373p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderState f83374q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, LandingHeaderState landingHeaderState) {
        super(1);
        this.f83373p0 = str;
        this.f83374q0 = landingHeaderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        textSettings2.setText(new Resource(this.f83373p0, (ResourceId) null, 2, (DefaultConstructorMarker) null));
        textSettings2.setView(SettingsKt.viewSettings(new c(this.f83374q0)));
        return Unit.INSTANCE;
    }
}
