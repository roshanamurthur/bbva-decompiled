package com.bbva.ethermobilesdk;

import android.content.Context;
import com.bbva.ethermobilesdk.pinning.SiteManager;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningConfig;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import com.bbva.ethermobilesdk.pinning.verifier.PinningVerifier;
import com.bbva.ethermobilesdk.pinning.work.UpdateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherPinningFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/EtherPinningFactory;", "", "Lcom/bbva/ethermobilesdk/pinning/verifier/PinningVerifier;", "createPinningVerifier", "Lcom/bbva/ethermobilesdk/pinning/work/UpdateManager;", "a", "Lcom/bbva/ethermobilesdk/pinning/work/UpdateManager;", "getUpdateManager", "()Lcom/bbva/ethermobilesdk/pinning/work/UpdateManager;", "updateManager", "Landroid/content/Context;", "context", "", "configId", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;", "mode", "", "fallbackFile", "", "resetCatalog", "<init>", "(Landroid/content/Context;ILcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;Ljava/lang/String;Z)V", "pinning_release"}, k = 1, mv = {1, 8, 0})
public final class EtherPinningFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UpdateManager updateManager;

    public EtherPinningFactory(@NotNull Context context, int i10, @NotNull PinningGlobalEnvironment mode, @NotNull String fallbackFile, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(fallbackFile, "fallbackFile");
        this.updateManager = new UpdateManager(context, new PinningConfig(i10, fallbackFile, false, mode, 4, null));
        SiteManager.INSTANCE.init(context, new PinningConfig(i10, fallbackFile, z10, mode));
        LoggerKt.log$default(null, "Initializing Ether Pinning version 2.3.2 with config file [" + i10 + "] fallback file [" + fallbackFile + "] reset catalog is [" + z10 + Constant.BRACKET_CLOSE, 1, null);
    }

    @NotNull
    public final PinningVerifier createPinningVerifier() {
        return new PinningVerifier();
    }

    @NotNull
    public final UpdateManager getUpdateManager() {
        return this.updateManager;
    }

    public /* synthetic */ EtherPinningFactory(Context context, int i10, PinningGlobalEnvironment pinningGlobalEnvironment, String str, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i10, pinningGlobalEnvironment, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? false : z10);
    }
}
