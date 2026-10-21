package c4;

import com.bbva.actionlauncher.plugin.commands.ShareCommand;
import com.bbva.actionlauncher.plugin.factory.ActionLauncherCommandFactory;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.discreetmode.DiscreetMode;
import com.bbva.discreetmode.plugin.commands.StopMonitoringCommand;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.PushManager;
import com.bbva.qrcreatorplugin.CodeGenerator;
import com.bbva.qrcreatorplugin.command.GenerateCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25357b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f25356a = i10;
        this.f25357b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f25356a;
        Object obj = this.f25357b;
        switch (i10) {
            case 0:
                ActionLauncherCommandFactory this$0 = (ActionLauncherCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new ShareCommand(this$0.f26467a);
            case 1:
                DiscreetMode discreetMode = (DiscreetMode) obj;
                Intrinsics.checkNotNullParameter(discreetMode, "$discreetMode");
                return new StopMonitoringCommand(discreetMode);
            case 2:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new UnregisterCommand(it);
            default:
                CodeGenerator codeGenerator = (CodeGenerator) obj;
                Intrinsics.checkNotNullParameter(codeGenerator, "$codeGenerator");
                return new GenerateCommand(codeGenerator);
        }
    }
}
