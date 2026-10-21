package r7;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.contacts.ContactAccessor;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GenerateNextOtpCommand;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.plugin.contacts.ContactCommandFactory;
import com.bbva.plugin.contacts.command.impl.PickContactCommand;
import com.bbva.plugin.showinfo.ShowInfoPluginCommandFactory;
import com.bbva.plugin.showinfo.command.HideCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92955b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f92954a = i10;
        this.f92955b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f92954a;
        Object obj = this.f92955b;
        switch (i10) {
            case 0:
                TokenCompat this_apply = (TokenCompat) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new GenerateNextOtpCommand(this_apply);
            case 1:
                EndPoint endPoint = (EndPoint) obj;
                Intrinsics.checkNotNullParameter(endPoint, "$endPoint");
                return new HeadCommand(endPoint);
            case 2:
                ContactAccessor contactAccessor = (ContactAccessor) obj;
                ContactCommandFactory.Companion companion = ContactCommandFactory.INSTANCE;
                Intrinsics.checkNotNullParameter(contactAccessor, "$contactAccessor");
                return new PickContactCommand(contactAccessor);
            default:
                ShowInfoPluginCommandFactory this$0 = (ShowInfoPluginCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new HideCommand(this$0.f35998b);
        }
    }
}
