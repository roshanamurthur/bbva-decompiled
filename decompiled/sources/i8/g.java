package i8;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.snackbar.SnackBarDelegate;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.smartassistance.flags.SmartAssistanceFlag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69524p0;

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f69524p0) {
            case 0:
                CellsWebViewModel cellsWebViewModel = (CellsWebViewModel) obj;
                SmartAssistanceFlag smartAssistanceFlag = (SmartAssistanceFlag) obj2;
                if (smartAssistanceFlag != null) {
                    cellsWebViewModel.reloadFlagsSmartAssistance(smartAssistanceFlag);
                }
                break;
            default:
                SnackbarSpec snackbarSpec = (SnackbarSpec) obj2;
                Intrinsics.checkNotNull(snackbarSpec);
                ((SnackBarDelegate) obj).showSnackBar(snackbarSpec);
                break;
        }
    }
}
