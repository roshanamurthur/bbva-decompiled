package ej;

import androidx.annotation.NonNull;
import com.bbva.ethermobilesdk.cipher.keystore.ConstantsKt;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: compiled from: UtilsBluetooth.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static boolean a(@NonNull String str) {
        return str.contains("PAX") || str.contains(EglobalUtils.DEVICE_PAX) || str.contains(ConstantsKt.ORGANIZATION) || str.contains("Openpay") || str.contains(EglobalUtils.DEVICE_OPENPAY) || str.contains("OPENPAY") || str.contains("Vierge") || str.contains("Inbursa");
    }
}
