package q9;

import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RememberedUserViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RememberedUser f92801p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RememberedUser rememberedUser) {
        super(1);
        this.f92801p0 = rememberedUser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        RememberedUser rememberedUser = this.f92801p0;
        textSettings2.setText(new Resource(StringExtensionsKt.capitalizeSentence$default(rememberedUser != null ? rememberedUser.getUsername() : null, null, 1, null), (ResourceId) null, 2, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
