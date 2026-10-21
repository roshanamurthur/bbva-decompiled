package w4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94146p0;

    public /* synthetic */ k(int i10) {
        this.f94146p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f94146p0) {
            case 0:
                BiometricLoginViewModel biometricLoginViewModel = (BiometricLoginViewModel) obj;
                biometricLoginViewModel.setBiometricUser("");
                biometricLoginViewModel.updateBiometricAuthentication(new BiometryAuthState.NotAvailable(null, 1, null), null);
                break;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                ((LoginDataManager) obj).fetchLogout();
                break;
        }
    }
}
