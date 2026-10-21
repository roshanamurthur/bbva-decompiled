package u4;

import com.bbva.bridge.navigate.WebNavigateDispatcher;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93722p0;

    public /* synthetic */ c(int i10) {
        this.f93722p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        switch (this.f93722p0) {
            case 0:
                ((LoginDataManager) obj).fetchAnonymousLogin();
                break;
            default:
                WebNavigateDispatcher webNavigateDispatcher = (WebNavigateDispatcher) obj;
                CellsMessage cellsMessage = (CellsMessage) obj2;
                if (cellsMessage.channelMessage().size() > 0 && Intrinsics.areEqual(cellsMessage.channelMessage().get(0).channelName(), "loading_page_ready")) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new t7.f(webNavigateDispatcher, null), 3, null);
                    break;
                }
                break;
        }
    }
}
