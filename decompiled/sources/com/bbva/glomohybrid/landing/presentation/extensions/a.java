package com.bbva.glomohybrid.landing.presentation.extensions;

import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.Visibility;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingHeaderStateExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingHeaderStateExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingHeaderStateExtensionsKt$mapToAccessButton$labelSettings$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class a extends Lambda implements Function1<ViewSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderState f33050p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LandingHeaderState landingHeaderState) {
        super(1);
        this.f33050p0 = landingHeaderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ViewSettings viewSettings) {
        ViewSettings viewSettings2 = viewSettings;
        Intrinsics.checkNotNullParameter(viewSettings2, "$this$viewSettings");
        Visibility visibility = Visibility.Gone;
        if (!(!Intrinsics.areEqual(this.f33050p0.getType(), LandingHeaderState.Type.Enabled.INSTANCE))) {
            visibility = null;
        }
        viewSettings2.setVisibility(visibility);
        return Unit.INSTANCE;
    }
}
