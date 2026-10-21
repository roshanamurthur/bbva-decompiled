package m9;

import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LandingHeaderStateExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f83370p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(1);
        this.f83370p0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        textSettings2.setText(new Resource(StringExtensionsKt.capitalizeSentence$default(this.f83370p0, null, 1, null), (ResourceId) null, 2, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
