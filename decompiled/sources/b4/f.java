package b4;

import android.util.Log;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import kotlin.UShort;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static void a(Exception exc) {
        try {
            if (e.f24786b.length() < 10000) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e.f24786b);
                sb2.append(ReplenishLogic.ID_SEPARATOR);
                String stackTraceString = Log.getStackTraceString(exc);
                if (stackTraceString != null && stackTraceString.length() > 500) {
                    stackTraceString = stackTraceString.substring(0, 500);
                }
                sb2.append(o.b(stackTraceString));
                e.f24786b = sb2.toString();
            }
        } catch (Exception unused) {
        }
    }

    public static short b(short s4) {
        int i10 = s4 & UShort.MAX_VALUE;
        return (short) (i10 - (((i10 * 5) >>> 16) * 12289));
    }

    public static short c(int i10) {
        return (short) (((((i10 * 12287) & 262143) * 12289) + i10) >>> 18);
    }
}
