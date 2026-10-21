package r5;

import com.bbva.component.ui.login.model.InputFieldData;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RememberedUserView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function1<CharSequence, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RememberedUserView f92935p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ InputFieldData f92936q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(RememberedUserView rememberedUserView, InputFieldData inputFieldData) {
        super(1);
        this.f92935p0 = rememberedUserView;
        this.f92936q0 = inputFieldData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence2, "char");
        RememberedUserView rememberedUserView = this.f92935p0;
        rememberedUserView.getViewModel().onTextChange(InputFieldData.copy$default(this.f92936q0, 0, null, charSequence2.toString(), null, null, 27, null));
        RememberedUserView.access$showPrimaryButton(rememberedUserView);
        return Unit.INSTANCE;
    }
}
