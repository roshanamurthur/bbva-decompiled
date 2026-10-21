package c8;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.filefetcher.data.model.FileFetchErrorResponse;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.logs.LoggerKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f25422p0;

    public /* synthetic */ b(int i10) {
        this.f25422p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f25422p0) {
            case 0:
                LoggerKt.logCritical$default("filefetcher-error", new Exception(((FileFetchErrorResponse) obj2).getMessage()), null, 4, null);
                break;
            case 1:
                ((WebController) obj).sendOnResume();
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginGlobalViewModel) obj).onActionPerformed(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS, (Customer) obj2);
                break;
        }
    }
}
