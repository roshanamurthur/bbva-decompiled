package c4;

import com.bbva.actionlauncher.plugin.commands.CanOpenUriCommand;
import com.bbva.actionlauncher.plugin.factory.ActionLauncherCommandFactory;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.plugin.digipassmanager.DigipassManagerPlugin;
import com.bbva.plugin.digipassmanager.commands.ActivateTokenCommand;
import com.bbva.plugin.push.command.RegisterCommand;
import com.bbva.push.PushManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25349b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f25348a = i10;
        this.f25349b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f25348a;
        Object obj = this.f25349b;
        switch (i10) {
            case 0:
                ActionLauncherCommandFactory this$0 = (ActionLauncherCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new CanOpenUriCommand(this$0.f26467a);
            case 1:
                DigipassManagerPlugin this$1 = (DigipassManagerPlugin) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                return new ActivateTokenCommand(this$1.f35623a);
            default:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new RegisterCommand(it);
        }
    }
}
