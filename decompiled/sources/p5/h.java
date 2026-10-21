package p5;

import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends Lambda implements Function3<String, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginCredentialsView f92576p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoginCredentialsView loginCredentialsView) {
        super(3);
        this.f92576p0 = loginCredentialsView;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, Integer num, Integer num2) {
        num.intValue();
        this.f92576p0.getViewModel().onDataInsertedLengthChange(num2.intValue());
        return Unit.INSTANCE;
    }
}
