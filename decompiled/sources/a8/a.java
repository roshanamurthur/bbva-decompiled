package a8;

import android.os.Bundle;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannels;
import com.bbva.glomohybrid.base.file.receipts.model.Receipt;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Channel.BundleAdapter, SFMCSdkReadyListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f211p0;

    public /* synthetic */ a(String str) {
        this.f211p0 = str;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReadyListener
    public final void ready(SFMCSdk sdk) {
        final String notificationId = this.f211p0;
        Intrinsics.checkNotNullParameter(notificationId, "$notificationId");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        sdk.mp(new PushModuleReadyListener() { // from class: sb.a
            @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener, com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener
            public final /* synthetic */ void ready(ModuleInterface moduleInterface) {
                qi.a.a(this, moduleInterface);
            }

            @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener
            public final void ready(PushModuleInterface pushInterface) {
                Object next;
                String notificationId2 = notificationId;
                Intrinsics.checkNotNullParameter(notificationId2, "$notificationId");
                Intrinsics.checkNotNullParameter(pushInterface, "pushInterface");
                List<InboxMessage> messages = pushInterface.getInboxMessageManager().getMessages();
                Intrinsics.checkNotNullExpressionValue(messages, "getMessages(...)");
                Iterator<T> it = messages.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((InboxMessage) next).id(), notificationId2));
                InboxMessage inboxMessage = (InboxMessage) next;
                if (inboxMessage != null) {
                    pushInterface.getAnalyticsManager().trackInboxOpenEvent(inboxMessage);
                }
            }
        });
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
        String receiptName = this.f211p0;
        Intrinsics.checkNotNullParameter(receiptName, "$receiptName");
        String str = c.f84805j;
        String string = bundle.getString(c.f84805j);
        if (string != null) {
            str = string;
        }
        return new Receipt(receiptName, str);
    }
}
