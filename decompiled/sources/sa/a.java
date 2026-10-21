package sa;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.networkplugin.command.impl.GetCommand;
import com.bbva.networkplugin.net.EndPoint;
import com.bbva.plugin.showinfo.ShowInfoPluginCommandFactory;
import com.bbva.plugin.showinfo.command.ToastCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93150b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f93149a = i10;
        this.f93150b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f93149a;
        Object obj = this.f93150b;
        switch (i10) {
            case 0:
                EndPoint endPoint = (EndPoint) obj;
                Intrinsics.checkNotNullParameter(endPoint, "$endPoint");
                return new GetCommand(endPoint);
            default:
                ShowInfoPluginCommandFactory this$0 = (ShowInfoPluginCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new ToastCommand(this$0.f35998b);
        }
    }
}
