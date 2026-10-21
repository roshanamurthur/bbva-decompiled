package p5;

import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import com.bbva.component.ui.login.model.InputFieldData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Lambda implements Function1<CharSequence, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginCredentialsView f92574p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ InputFieldData f92575q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LoginCredentialsView loginCredentialsView, InputFieldData inputFieldData) {
        super(1);
        this.f92574p0 = loginCredentialsView;
        this.f92575q0 = inputFieldData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        Intrinsics.checkNotNullParameter(charSequence2, "char");
        LoginCredentialsView loginCredentialsView = this.f92574p0;
        loginCredentialsView.getViewModel().onTextChange(InputFieldData.copy$default(this.f92575q0, 0, null, charSequence2.toString(), null, null, 27, null));
        if (charSequence2.length() > 0) {
            loginCredentialsView.getLoginButton().setVisibility(0);
        }
        return Unit.INSTANCE;
    }
}
