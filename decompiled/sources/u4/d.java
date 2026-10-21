package u4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.anonymous.AnonymousInterceptorDataManager;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.glomohybrid.infoscreen.biometric.BiometryAuthErrorActivity;
import com.bbva.glomohybrid.login.domain.model.CustomerIndicatorsLogins;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.logs.LoggerKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93723p0;

    public /* synthetic */ d(int i10) {
        this.f93723p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f93723p0) {
            case 0:
                ((AnonymousInterceptorDataManager) obj).cancel();
                LoggerKt.logCritical$default("anonymous-login-error", (LoginException) obj2, null, 4, null);
                break;
            case 1:
                ((BiometricAuthenticationDataManager) obj).setSkippedTimes(0);
                break;
            case 2:
                ((BiometryAuthErrorActivity) obj).finish();
                break;
            default:
                ((LoginGlobalViewModel) obj).onActionPerformed(GetCustomerLoginsUseCase.ACTION_GET_CUSTOMER_INDICATORS_LOGINS_SUCCESS, (CustomerIndicatorsLogins) obj2);
                break;
        }
    }
}
