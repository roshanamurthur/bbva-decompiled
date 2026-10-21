package t9;

import android.os.Bundle;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.login.domain.mapper.CountryErrorModals;
import com.bbva.glomohybrid.login.model.constants.ExpiredPasswordConstants;
import com.bbva.glomohybrid.login.presentation.reactions.LoginModals;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends Lambda implements Function1<ModalType, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93479p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LoginActivity loginActivity) {
        super(1);
        this.f93479p0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ModalType modalType) {
        ModalType modalType2 = modalType;
        LoginActivity loginActivity = this.f93479p0;
        CountryErrorModals countryErrorModals = (CountryErrorModals) ComponentManager.get(loginActivity.hashCode(), LoginModals.ID);
        if (Intrinsics.areEqual(modalType2, ModalType.ErrorGeneric.INSTANCE)) {
            countryErrorModals.showGenericError(loginActivity);
        } else if (modalType2 instanceof ModalType.ErrorExpiredPassword) {
            Bundle bundle = new Bundle();
            ModalType.ErrorExpiredPassword errorExpiredPassword = (ModalType.ErrorExpiredPassword) modalType2;
            bundle.putString(ExpiredPasswordConstants.USER_INFO, errorExpiredPassword.getUser());
            countryErrorModals.show(loginActivity, errorExpiredPassword.getId(), bundle);
        } else if (modalType2 instanceof ModalType.ErrorById) {
            Intrinsics.checkNotNull(countryErrorModals);
            LoginModals.show$default(countryErrorModals, this.f93479p0, ((ModalType.ErrorById) modalType2).getId(), (Bundle) null, 4, (Object) null);
        } else if (modalType2 instanceof ModalType.StandIn) {
            Intrinsics.checkNotNull(countryErrorModals);
            LoginModals.show$default(countryErrorModals, this.f93479p0, ((ModalType.StandIn) modalType2).getId(), (Bundle) null, 4, (Object) null);
            LoginActivity.access$getAnalyticsManager(loginActivity).trackEvent(AnalyticsEvent.LOGIN_STANDIN_ACTIVATION_ERROR);
        } else if (modalType2 instanceof ModalType.Kne0116Error) {
            Intrinsics.checkNotNull(countryErrorModals);
            LoginModals.show$default(countryErrorModals, this.f93479p0, ((ModalType.Kne0116Error) modalType2).getId(), (Bundle) null, 4, (Object) null);
        } else if (modalType2 instanceof ModalType.AkamaiError) {
            Intrinsics.checkNotNull(countryErrorModals);
            LoginModals.show$default(countryErrorModals, this.f93479p0, ((ModalType.AkamaiError) modalType2).getId(), (Bundle) null, 4, (Object) null);
        } else if (modalType2 instanceof ModalType.DeviceActivation) {
            LoginActivity.access$displayFragmentModal(loginActivity);
            LoginActivity.access$getAnalyticsManager(loginActivity).trackEvent(AnalyticsEvent.LOGIN_NEEDS_DIGITAL_ACTIVATION_ERROR);
        }
        return Unit.INSTANCE;
    }
}
