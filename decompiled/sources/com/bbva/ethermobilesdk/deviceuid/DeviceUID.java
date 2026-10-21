package com.bbva.ethermobilesdk.deviceuid;

import com.bbva.ethermobile.help.kit.result.Result;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceUID.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/DeviceUID;", "", "uid", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "shortened", "", "deviceuid_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DeviceUID {

    /* JADX INFO: compiled from: DeviceUID.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Result uid$default(DeviceUID deviceUID, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uid");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return deviceUID.uid(z10);
        }
    }

    @NotNull
    Result<String> uid(boolean shortened);
}
