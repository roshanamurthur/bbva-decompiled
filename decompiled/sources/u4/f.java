package u4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93725p0;

    public /* synthetic */ f(int i10) {
        this.f93725p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f93725p0) {
            case 0:
                HeadersInterceptorDataManager headersInterceptorDataManager = (HeadersInterceptorDataManager) obj;
                headersInterceptorDataManager.setToken("", AuthTokenInterceptorsIds.GLOMO.toString());
                headersInterceptorDataManager.setToken("", AuthTokenInterceptorsIds.TENANT.toString());
                break;
            case 1:
                BiometryAuthResult biometryAuthResult = (BiometryAuthResult) obj2;
                Intrinsics.checkNotNull(biometryAuthResult, "null cannot be cast to non-null type com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult.Success");
                ((BiometricLoginViewModel) obj).onBiometryAuthenticationSuccess((BiometryAuthResult.Success) biometryAuthResult);
                break;
            case 2:
                ((AnalyticsManager) obj).trackEvent(AnalyticsEvent.LOGIN_BIOMETRIC_FRIENDLY_FRAUD_ERROR);
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginGlobalViewModel) obj).onActionPerformed(ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED(), (RememberedUser) obj2);
                break;
        }
    }
}
