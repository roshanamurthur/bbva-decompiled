package c4;

import com.bbva.actionlauncher.plugin.commands.OpenMarketCommand;
import com.bbva.actionlauncher.plugin.factory.ActionLauncherCommandFactory;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.plugin.push.command.RequestServiceTokenCommand;
import com.bbva.push.PushManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements CommandProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25353b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f25352a = i10;
        this.f25353b = obj;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
    public final AbstractCommand create() {
        int i10 = this.f25352a;
        Object obj = this.f25353b;
        switch (i10) {
            case 0:
                ActionLauncherCommandFactory this$0 = (ActionLauncherCommandFactory) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return new OpenMarketCommand(this$0.f26467a, this$0.f26468b);
            default:
                PushManager it = (PushManager) obj;
                Intrinsics.checkNotNullParameter(it, "$it");
                return new RequestServiceTokenCommand(it);
        }
    }
}
