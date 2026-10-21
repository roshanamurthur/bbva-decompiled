package i8;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.cells.channels.AppStartReadyChannel;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69523p0;

    public /* synthetic */ f(int i10) {
        this.f69523p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f69523p0) {
            case 0:
                ((CellsWebViewModel) obj).logoutSmartAssistance();
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginViewModel) obj).onActionPerformed(AppStartReadyChannel.INSTANCE.getACTION_APP_READY(), (AppStartReadyChannel.AppReadyParams) obj2);
                break;
        }
    }
}
