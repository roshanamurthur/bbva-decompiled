package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.TerminalSdk;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class se {
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        TerminalSdk.Configuration configuration = (TerminalSdk.Configuration) objArr[0];
        Intrinsics.checkNotNullParameter(configuration, "");
        return new sd(sh.setCompoundDrawableTintBlendMode(configuration.getPinPadConfiguration()), (Map) si.setY(new Object[]{configuration.getCurrencyCustomFormatting()}, -768936710, 768936710, (int) System.currentTimeMillis()), configuration.getHapticFeedbackEnabled(), configuration.getTotalElapsedTimeout(), configuration.getDiscoveryTimeout(), configuration.getProcessingTimeout(), configuration.getNetworkTimeout(), configuration.getBeepVolume(), configuration.getBeepOnSuccess(), configuration.getBeepOnFailure(), configuration.getEnableLocalAttestationForDebugBuilds());
    }

    @NotNull
    public static final sd setX(@NotNull TerminalSdk.Configuration configuration) {
        return (sd) setX(new Object[]{configuration}, -467698203, 467698203, (int) System.currentTimeMillis());
    }
}
