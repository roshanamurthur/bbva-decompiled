package pi;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleReadyListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CdpModuleInterface.kt */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a {
    public static void a(CdpModuleReadyListener cdpModuleReadyListener, @NotNull ModuleInterface module) {
        Intrinsics.checkNotNullParameter(module, "module");
        cdpModuleReadyListener.ready((CdpModuleInterface) module);
    }
}
