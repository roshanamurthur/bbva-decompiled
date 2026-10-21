package m9;

import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingShortcutItemModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends Lambda implements Function1<ImageSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LandingShortcutItemModel f83375p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LandingShortcutItemModel landingShortcutItemModel) {
        super(1);
        this.f83375p0 = landingShortcutItemModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ImageSettings imageSettings) {
        ImageSettings imageSettings2 = imageSettings;
        Intrinsics.checkNotNullParameter(imageSettings2, "$this$imageSettings");
        imageSettings2.setUrl(this.f83375p0.getImage());
        return Unit.INSTANCE;
    }
}
