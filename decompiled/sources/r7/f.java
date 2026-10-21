package r7;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetRemainingTimeCommand;
import com.bbva.networkplugin.command.impl.CleanAllCookiesCommand;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import com.bbva.push.PushManager;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.securesharing.plugin.command.ContainsCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92959b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f92958a = i10;
        this.f92959b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f92958a;
        Object obj = this.f92959b;
        switch (i10) {
            case 0:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new GetRemainingTimeCommand(this_apply);
            case 1:
                EndPoint endPoint = (EndPoint) obj;
                Intrinsics.checkNotNullParameter(endPoint, "$endPoint");
                return new CleanAllCookiesCommand(endPoint);
            case 2:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new TrackMessageOpenedCommand(it);
            default:
                SecureSharing this_apply2 = (SecureSharing) obj;
                SecureSharingCommandFactory.Companion companion = SecureSharingCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                return new ContainsCommand(this_apply2);
        }
    }
}
