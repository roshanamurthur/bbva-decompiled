package r7;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetTokenCommand;
import com.bbva.networkplugin.command.connection.status.SubscribeConnectionStatusCommand;
import com.bbva.networkplugin.net.ConnectionStatusHandler;
import com.bbva.plugin.push.command.inbox.GetAllMessagesCountCommand;
import com.bbva.push.PushManager;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.securesharing.plugin.command.RemoveKeyCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92961b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f92960a = i10;
        this.f92961b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f92960a;
        Object obj = this.f92961b;
        switch (i10) {
            case 0:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new GetTokenCommand(this_apply);
            case 1:
                ConnectionStatusHandler connectionStatusHandler = (ConnectionStatusHandler) obj;
                Intrinsics.checkNotNullParameter(connectionStatusHandler, "$connectionStatusHandler");
                return new SubscribeConnectionStatusCommand(connectionStatusHandler);
            case 2:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new GetAllMessagesCountCommand(it);
            default:
                SecureSharing this_apply2 = (SecureSharing) obj;
                SecureSharingCommandFactory.Companion companion = SecureSharingCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                return new RemoveKeyCommand(this_apply2);
        }
    }
}
