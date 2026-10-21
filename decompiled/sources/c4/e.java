package c4;

import com.bbva.actionlauncher.plugin.commands.LaunchDialerCommand;
import com.bbva.actionlauncher.plugin.factory.ActionLauncherCommandFactory;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.plugin.commands.StartMonitoringCommand;
import com.bbva.plugin.push.command.SetOptionsCommand;
import com.bbva.push.PushManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25355b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f25354a = i10;
        this.f25355b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f25354a;
        Object obj = this.f25355b;
        switch (i10) {
            case 0:
                ActionLauncherCommandFactory this$0 = (ActionLauncherCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new LaunchDialerCommand(this$0.f26467a);
            case 1:
                DiscreetMode discreetMode = (DiscreetMode) obj;
                Intrinsics.checkNotNullParameter(discreetMode, "$discreetMode");
                return new StartMonitoringCommand(discreetMode);
            default:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new SetOptionsCommand(it);
        }
    }
}
