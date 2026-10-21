package r7;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetTokenListCommand;
import com.bbva.networkplugin.command.connection.status.UnsubscribeConnectionStatusCommand;
import com.bbva.networkplugin.net.ConnectionStatusHandler;
import com.bbva.plugin.push.command.inbox.GetMessagesCommand;
import com.bbva.plugin.wearables.info.library.WearableDeviceInfo;
import com.bbva.plugin.wearables.info.plugin.commands.GetWearableConnectivityCommand;
import com.bbva.push.PushManager;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.securesharing.plugin.command.CleanAllCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92963b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f92962a = i10;
        this.f92963b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f92962a;
        Object obj = this.f92963b;
        switch (i10) {
            case 0:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new GetTokenListCommand(this_apply);
            case 1:
                ConnectionStatusHandler connectionStatusHandler = (ConnectionStatusHandler) obj;
                Intrinsics.checkNotNullParameter(connectionStatusHandler, "$connectionStatusHandler");
                return new UnsubscribeConnectionStatusCommand(connectionStatusHandler);
            case 2:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new GetMessagesCommand(it);
            case 3:
                WearableDeviceInfo wearableDeviceInfo = (WearableDeviceInfo) obj;
                Intrinsics.checkNotNullParameter(wearableDeviceInfo, "$wearableDeviceInfo");
                return new GetWearableConnectivityCommand(wearableDeviceInfo, null, 2, 0 == true ? 1 : 0);
            default:
                SecureSharing this_apply2 = (SecureSharing) obj;
                SecureSharingCommandFactory.Companion companion = SecureSharingCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                return new CleanAllCommand(this_apply2);
        }
    }
}
