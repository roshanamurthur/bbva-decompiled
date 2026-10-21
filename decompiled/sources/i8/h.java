package i8;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.snackbar.SnackBarDelegate;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.glomohybrid.ui.snackbar.CountrySnackbarsFactory;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69525p0;

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f69525p0) {
            case 0:
                ((CellsWebViewModel) obj).initializeAppLifecycleObserver();
                break;
            default:
                ((SnackBarDelegate) obj).showSnackBar(CountrySnackbarsFactory.INSTANCE.sessionExpirationSnackbar());
                break;
        }
    }
}
