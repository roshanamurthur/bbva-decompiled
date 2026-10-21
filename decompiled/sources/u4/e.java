package u4;

import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.anonymous.AnonymousInterceptorDataManager;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.infoscreen.biometric.FriendlyFraudErrorActivity;
import com.bbva.glomohybrid.login.data.model.MagicLogData;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93724p0;

    public /* synthetic */ e(int i10) {
        this.f93724p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f93724p0) {
            case 0:
                AnonymousInterceptorDataManager anonymousInterceptorDataManager = (AnonymousInterceptorDataManager) obj;
                String token = ((AccessToken) obj2).getToken();
                if (token == null) {
                    token = "";
                }
                anonymousInterceptorDataManager.onTokenReceived(token);
                break;
            case 1:
                ((FriendlyFraudErrorActivity) obj).finish();
                break;
            default:
                MagicLogData magicLogData = (MagicLogData) obj2;
                Intrinsics.checkNotNull(magicLogData);
                ((LoginViewModel) obj).handleMagicLogLogin(magicLogData);
                break;
        }
    }
}
