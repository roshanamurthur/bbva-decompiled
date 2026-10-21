package sa;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.networkplugin.command.impl.DeleteCommand;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.plugin.showinfo.ShowInfoPluginCommandFactory;
import com.bbva.plugin.showinfo.command.TooltipCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.securesharing.plugin.command.GetValueCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93156b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f93155a = i10;
        this.f93156b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f93155a;
        Object obj = this.f93156b;
        switch (i10) {
            case 0:
                EndPoint endPoint = (EndPoint) obj;
                Intrinsics.checkNotNullParameter(endPoint, "$endPoint");
                return new DeleteCommand(endPoint);
            case 1:
                ShowInfoPluginCommandFactory this$0 = (ShowInfoPluginCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new TooltipCommand(this$0.f35998b);
            default:
                SecureSharing this_apply = (SecureSharing) obj;
                SecureSharingCommandFactory.Companion companion = SecureSharingCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new GetValueCommand(this_apply);
        }
    }
}
