package i8;

import bk.p;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.cellsweb.channels.SettingsDialogChannel;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69516p0;

    public /* synthetic */ a(int i10) {
        this.f69516p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f69516p0) {
            case 0:
                ((MessageDispatcher) obj).sendMessage(SettingsDialogChannel.CANCEL_SETTINGS_MODAL_CHANNEL, p.mapOf(TuplesKt.to("type", (String) obj2)));
                break;
            default:
                Map<String, ? extends Object> map = (Map) obj2;
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                Intrinsics.checkNotNull(map);
                ((LoginGlobalViewModel) obj).manageZipActionsCompleted(map);
                break;
        }
    }
}
