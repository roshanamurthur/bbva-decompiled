package w4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94147p0;

    public /* synthetic */ l(int i10) {
        this.f94147p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f94147p0) {
            case 0:
                ((BiometricLoginViewModel) obj).retryBiometry();
                break;
            case 1:
                FileInteraction fileInteraction = (FileInteraction) obj2;
                Intrinsics.checkNotNull(fileInteraction, "null cannot be cast to non-null type com.bbva.glomohybrid.base.file.channels.FileInteraction.Monthly");
                ((FileManagerComponent) obj).downloadFile(FileActions.Monthly, ((FileInteraction.Monthly) fileInteraction).getPath());
                break;
            default:
                Map<String, ? extends Object> map = (Map) obj2;
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                Intrinsics.checkNotNull(map);
                ((LoginGlobalViewModel) obj).manageZipActionsError(map);
                break;
        }
    }
}
