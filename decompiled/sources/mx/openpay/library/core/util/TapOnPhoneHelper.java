package mx.openpay.library.core.util;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"Lmx/openpay/library/core/util/TapOnPhoneHelper;", "", "", "isTapOnPhoneEnabled", "library_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhoneHelper {
    public static final int $stable = 0;

    @NotNull
    public static final TapOnPhoneHelper INSTANCE = new TapOnPhoneHelper();

    public final boolean isTapOnPhoneEnabled() {
        return true;
    }
}
