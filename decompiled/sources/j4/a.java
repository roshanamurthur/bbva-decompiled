package j4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f78766p0;

    public /* synthetic */ a(int i10) {
        this.f78766p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f78766p0) {
            case 0:
                ((WebController) obj).sendOnResume();
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginGlobalViewModel) obj).setIntent(LoginContract.Intent.LoadUserRememberedBiometrics.INSTANCE);
                break;
        }
    }
}
