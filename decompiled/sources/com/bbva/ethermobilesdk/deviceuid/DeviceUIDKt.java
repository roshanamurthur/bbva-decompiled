package com.bbva.ethermobilesdk.deviceuid;

import android.accounts.Account;
import android.app.Application;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceUID.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"DeviceUID", "Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;", Constants.APPLICATION, "Landroid/app/Application;", "share", "", "account", "Landroid/accounts/Account;", "sharingGroup", "", "doSync", "deviceuid_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DeviceUIDKt {
    @NotNull
    public static final DeviceUID DeviceUID(@NotNull Application application, boolean z10, @Nullable Account account, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(application, "application");
        MultiStoreDeviceUID multiStoreDeviceUID = MultiStoreDeviceUID.INSTANCE;
        synchronized (multiStoreDeviceUID) {
            try {
                if (!multiStoreDeviceUID.isInitialized$deviceuid_release()) {
                    multiStoreDeviceUID.initialize$deviceuid_release(application, z10, account, str, z11);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return multiStoreDeviceUID;
    }

    public static /* synthetic */ DeviceUID DeviceUID$default(Application application, boolean z10, Account account, String str, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            account = null;
        }
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        return DeviceUID(application, z10, account, str, z11);
    }
}
