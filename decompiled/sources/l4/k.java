package l4;

import android.app.Activity;
import com.bbva.cellscore.pubsub.PubSubController;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.data.component.ChannelMessage;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.cellscore.web.navigation.actions.NavigationAction;

/* JADX INFO: compiled from: NavigationUpdate.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements NavigationAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PubSubController f83091a;

    public k(PubSubController pubSubController) {
        this.f83091a = pubSubController;
    }

    @Override // com.bbva.cellscore.web.navigation.actions.NavigationAction
    public final void execute(Activity activity, CellsMessage cellsMessage, Route route) {
        for (ChannelMessage channelMessage : cellsMessage.channelMessage()) {
            this.f83091a.sendRawMessageToChannel(channelMessage.channelName(), channelMessage.values());
        }
    }
}
