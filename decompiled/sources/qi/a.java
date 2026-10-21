package qi;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PushModuleInterface.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a {
    public static void a(PushModuleReadyListener pushModuleReadyListener, @NotNull ModuleInterface module) {
        Intrinsics.checkNotNullParameter(module, "module");
        pushModuleReadyListener.ready((PushModuleInterface) module);
    }
}
