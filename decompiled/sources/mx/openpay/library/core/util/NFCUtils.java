package mx.openpay.library.core.util;

import android.content.Context;
import android.nfc.NfcAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/core/util/NFCUtils;", "", "Landroid/content/Context;", "context", "", "isNFCEnabled", "library_release"}, k = 1, mv = {1, 8, 0})
public final class NFCUtils {
    public static final int $stable = 0;

    @NotNull
    public static final NFCUtils INSTANCE = new NFCUtils();

    public final boolean isNFCEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }
}
