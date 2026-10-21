package t9;

import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93480p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoginActivity loginActivity) {
        super(0);
        this.f93480p0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LoginActivity loginActivity = this.f93480p0;
        loginActivity.j().openWebDeviceActivation();
        loginActivity.j().trackEvent$Login_mexicoGoogleRelease(AnalyticsEvent.LOGIN_NEEDS_DIGITAL_ACTIVATION_BUTTON_PRESSED);
        return Unit.INSTANCE;
    }
}
