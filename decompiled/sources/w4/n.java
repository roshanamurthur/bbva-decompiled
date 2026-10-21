package w4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94149p0;

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f94149p0) {
            case 0:
                ((BiometricAuthenticationDataManager) obj).setBiometricAvailable(BiometryAuthState.Cancelled.INSTANCE);
                break;
            default:
                FileInteraction fileInteraction = (FileInteraction) obj2;
                Intrinsics.checkNotNull(fileInteraction, "null cannot be cast to non-null type com.bbva.glomohybrid.base.file.channels.FileInteraction.PdfDocument");
                ((FileManagerComponent) obj).downloadFile(FileActions.PdfDocument, ((FileInteraction.PdfDocument) fileInteraction).getPath());
                break;
        }
    }
}
