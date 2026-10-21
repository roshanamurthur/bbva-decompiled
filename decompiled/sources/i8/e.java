package i8;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69522p0;

    public /* synthetic */ e(int i10) {
        this.f69522p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f69522p0) {
            case 0:
                ((CellsWebViewModel) obj).initializeSmartAssistance();
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginActivity) obj).rateApp();
                break;
        }
    }
}
