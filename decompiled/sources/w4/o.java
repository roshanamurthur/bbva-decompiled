package w4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginReactions;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.cellsweb.presentation.reactions.CellsWebReaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94150p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94151q0;

    public /* synthetic */ o(Object obj, int i10) {
        this.f94150p0 = i10;
        this.f94151q0 = obj;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        int i10 = this.f94150p0;
        Object obj3 = this.f94151q0;
        switch (i10) {
            case 0:
                BiometricLoginReactions this$0 = (BiometricLoginReactions) obj3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((BiometricAuthenticationDataManager) obj).authenticate(this$0.f27502q0);
                break;
            default:
                CellsWebReaction.e((CellsWebReaction) obj3, (Router) obj, (String) obj2);
                break;
        }
    }
}
