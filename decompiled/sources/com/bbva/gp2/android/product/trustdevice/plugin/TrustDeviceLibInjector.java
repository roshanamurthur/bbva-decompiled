package com.bbva.gp2.android.product.trustdevice.plugin;

import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustDeviceLibInjector.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/plugin/TrustDeviceLibInjector;", "", "()V", "trustDevice", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;", "getTrustDevice", "()Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;", "setTrustDevice", "(Lcom/bbva/gp2/android/product/trustdevice/library/TrustDeviceLib;)V", "initialize", "", "payments-trustdevice-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class TrustDeviceLibInjector {
    public static final TrustDeviceLibInjector INSTANCE = new TrustDeviceLibInjector();

    @NotNull
    public static TrustDeviceLib trustDevice;

    private TrustDeviceLibInjector() {
    }

    @NotNull
    public final TrustDeviceLib getTrustDevice() {
        TrustDeviceLib trustDeviceLib = trustDevice;
        if (trustDeviceLib == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trustDevice");
        }
        return trustDeviceLib;
    }

    public final void initialize(@NotNull TrustDeviceLib trustDevice2) {
        trustDevice = trustDevice2;
    }

    public final void setTrustDevice(@NotNull TrustDeviceLib trustDeviceLib) {
        trustDevice = trustDeviceLib;
    }
}
