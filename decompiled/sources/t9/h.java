package t9;

import com.bbva.component.ui.loader.LoaderSpinnerViewModel;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93486p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoginActivity loginActivity) {
        super(1);
        this.f93486p0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        LoaderSpinnerViewModel loaderSpinnerViewModelAccess$getLoaderSpinnerViewModel = LoginActivity.access$getLoaderSpinnerViewModel(this.f93486p0);
        Intrinsics.checkNotNull(bool2);
        loaderSpinnerViewModelAccess$getLoaderSpinnerViewModel.showSpinner(bool2.booleanValue());
        return Unit.INSTANCE;
    }
}
