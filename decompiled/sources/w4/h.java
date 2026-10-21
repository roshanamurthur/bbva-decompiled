package w4;

import com.bbva.bridge.WebAwareComponentKt;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginReactions;
import com.bbva.glomohybrid.AppReaction;
import com.bbva.glomohybrid.logs.LoggerKt;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94142p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94143q0;

    public /* synthetic */ h(Object obj, int i10) {
        this.f94142p0 = i10;
        this.f94143q0 = obj;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        int i10 = this.f94142p0;
        Object obj3 = this.f94143q0;
        switch (i10) {
            case 0:
                BiometricLoginReactions this$0 = (BiometricLoginReactions) obj3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((BiometricAuthenticationDataManager) obj).deleteAuthenticators(this$0.f27502q0);
                break;
            default:
                AppReaction this$1 = (AppReaction) obj3;
                String str = (String) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ArrayList arrayList = this$1.K0;
                Intrinsics.checkNotNull(str);
                arrayList.add(str);
                ArrayList arrayList2 = this$1.K0;
                this$1.H0.setCustomKey("cellsNavStack", arrayList2.toString());
                LoggerKt.logVerbose$default("[NavigationStack] " + arrayList2, null, 2, null);
                WebAwareComponentKt.propagatePageLoaded(this$1.G0, str);
                break;
        }
    }
}
