package x8;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94492p0;

    public /* synthetic */ c(int i10) {
        this.f94492p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f94492p0) {
            case 0:
                ((AnalyticsManager) obj).trackEvent(AnalyticsEvent.LOGIN_BIOMETRIC_DEFAULT_ERROR);
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginGlobalViewModel) obj).setIntent(LoginContract.Intent.LoadUserRememberedCredentials.INSTANCE);
                break;
        }
    }
}
