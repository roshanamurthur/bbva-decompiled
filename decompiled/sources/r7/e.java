package r7;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GenerateOtpCommand;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.securesharing.plugin.command.PutValueCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92957b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f92956a = i10;
        this.f92957b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f92956a;
        Object obj = this.f92957b;
        switch (i10) {
            case 0:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new GenerateOtpCommand(this_apply);
            case 1:
                EndPoint endPoint = (EndPoint) obj;
                Intrinsics.checkNotNullParameter(endPoint, "$endPoint");
                return new PatchCommand(endPoint);
            default:
                SecureSharing this_apply2 = (SecureSharing) obj;
                SecureSharingCommandFactory.Companion companion = SecureSharingCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                return new PutValueCommand(this_apply2);
        }
    }
}
