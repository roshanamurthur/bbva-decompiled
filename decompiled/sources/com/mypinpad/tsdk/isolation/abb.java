package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes10.dex */
public final class abb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52268a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52269b = 1;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i13 | (~(i14 | i15));
        int i17 = ~(i10 | i11);
        if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) == 1) {
            LogRecord logRecord = (LogRecord) objArr[0];
            int i18 = f52268a;
            int i19 = ((i18 ^ 116) + ((i18 & 116) << 1)) - 1;
            f52269b = i19 % 128;
            int i20 = i19 % 2;
            int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{logRecord}, 578714923, -578714923, (int) System.currentTimeMillis())).intValue();
            int i21 = f52269b;
            int i22 = i21 & 109;
            int i23 = (i21 ^ 109) | i22;
            int i24 = (i22 & i23) + (i23 | i22);
            f52268a = i24 % 128;
            int i25 = i24 % 2;
            return Integer.valueOf(iIntValue);
        }
        LogRecord logRecord2 = (LogRecord) objArr[0];
        int i26 = f52269b;
        int i27 = i26 & 57;
        int i28 = ((i26 ^ 57) | i27) << 1;
        int i29 = -((i26 | 57) & (~i27));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        f52268a = i30 % 128;
        int i31 = i30 % 2;
        int iIntValue2 = logRecord2.getLevel().intValue();
        Level level = Level.INFO;
        int i32 = 5;
        if (iIntValue2 > level.intValue()) {
            int i33 = f52268a;
            int i34 = ((i33 | 111) << 1) - (i33 ^ 111);
            f52269b = i34 % 128;
            int i35 = i34 % 2;
            int i36 = (i33 & (-58)) | ((~i33) & 57);
            int i37 = -(-((i33 & 57) << 1));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            f52269b = i38 % 128;
            int i39 = i38 % 2;
        } else {
            if (logRecord2.getLevel().intValue() != level.intValue()) {
                int i40 = f52268a;
                int i41 = (i40 & 24) + (i40 | 24);
                int i42 = (i41 ^ (-1)) + (i41 << 1);
                f52269b = i42 % 128;
                if (i42 % 2 != 0) {
                    return 3;
                }
                throw null;
            }
            int i43 = f52268a;
            int i44 = ((i43 ^ 61) - (~(-(-((i43 & 61) << 1))))) - 1;
            f52269b = i44 % 128;
            if (i44 % 2 != 0) {
                i32 = 4;
            }
        }
        return Integer.valueOf(i32);
    }
}
