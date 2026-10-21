package t9;

import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends Lambda implements Function1<SnackbarState, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93485p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LoginActivity loginActivity) {
        super(1);
        this.f93485p0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SnackbarState snackbarState) {
        SnackbarState snackbarState2 = snackbarState;
        Intrinsics.checkNotNull(snackbarState2);
        this.f93485p0.renderSnackbar(snackbarState2);
        return Unit.INSTANCE;
    }
}
