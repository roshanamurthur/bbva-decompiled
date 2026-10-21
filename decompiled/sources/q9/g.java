package q9;

import android.content.Context;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.domain.model.CountryRememberedUserViewState;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountryRememberedUserViewState.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends Lambda implements Function1<TextSettings, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CountryRememberedUserViewState f92791p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RememberedUser f92792q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CountryRememberedUserViewState countryRememberedUserViewState, RememberedUser rememberedUser) {
        super(1);
        this.f92791p0 = countryRememberedUserViewState;
        this.f92792q0 = rememberedUser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextSettings textSettings) {
        String lowerCase;
        String username;
        TextSettings textSettings2 = textSettings;
        Intrinsics.checkNotNullParameter(textSettings2, "$this$textSettings");
        Context context = this.f92791p0.f33381a;
        int i10 = R.string.login_label_greeting_password;
        Object[] objArr = new Object[1];
        RememberedUser rememberedUser = this.f92792q0;
        if (rememberedUser == null || (username = rememberedUser.getUsername()) == null) {
            lowerCase = null;
        } else {
            lowerCase = username.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        objArr[0] = StringExtensionsKt.capitalizeSentence$default(lowerCase, null, 1, null);
        textSettings2.setText(new Resource(context.getString(i10, objArr), (ResourceId) null, 2, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
