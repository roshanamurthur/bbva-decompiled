package c4;

import com.bbva.actionlauncher.plugin.commands.LaunchMapsCommand;
import com.bbva.actionlauncher.plugin.factory.ActionLauncherCommandFactory;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.plugin.push.command.GetOptionsCommand;
import com.bbva.push.PushManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25347b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f25346a = i10;
        this.f25347b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f25346a;
        Object obj = this.f25347b;
        switch (i10) {
            case 0:
                ActionLauncherCommandFactory this$0 = (ActionLauncherCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new LaunchMapsCommand(this$0.f26467a);
            default:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new GetOptionsCommand(it);
        }
    }
}
