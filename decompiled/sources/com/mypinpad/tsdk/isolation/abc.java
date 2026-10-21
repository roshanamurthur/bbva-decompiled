package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/abc;", "Ljava/util/logging/Handler;", "", HearingDisabilitiesConstants.CLOSE_MODAL, "()V", "flush", "Ljava/util/logging/LogRecord;", "p0", "publish", "(Ljava/util/logging/LogRecord;)V", "<init>"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class abc extends Handler {

    @NotNull
    public static final abc INSTANCE = new abc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52270a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52271b = 1;

    static {
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~((~i12) | i13);
        int i15 = (((~(i10 | i11 | i12)) | i14) * 338) + ((~(i13 | i11)) * 338) + (((~((~i11) | i10)) | i14 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337));
        if (i15 == 1) {
            LogRecord logRecord = (LogRecord) objArr[1];
            int i16 = f52271b;
            int i17 = i16 & 41;
            int i18 = -(-((i16 ^ 41) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f52270a = i19 % 128;
            if (i19 % 2 != 0) {
                Intrinsics.checkNotNullParameter(logRecord, "");
                aba abaVar = aba.INSTANCE;
                String loggerName = logRecord.getLoggerName();
                Intrinsics.checkNotNullExpressionValue(loggerName, "");
                int iIntValue = ((Integer) abb.setOnFocusChangeListener(new Object[]{logRecord}, -850143233, 850143234, (int) System.currentTimeMillis())).intValue();
                String message = logRecord.getMessage();
                Intrinsics.checkNotNullExpressionValue(message, "");
                aba.setCompoundDrawableTintBlendMode(new Object[]{loggerName, Integer.valueOf(iIntValue), message, logRecord.getThrown()}, -1227449111, 1227449114, iIntValue);
                throw null;
            }
            Intrinsics.checkNotNullParameter(logRecord, "");
            aba abaVar2 = aba.INSTANCE;
            String loggerName2 = logRecord.getLoggerName();
            Intrinsics.checkNotNullExpressionValue(loggerName2, "");
            int iIntValue2 = ((Integer) abb.setOnFocusChangeListener(new Object[]{logRecord}, -850143233, 850143234, (int) System.currentTimeMillis())).intValue();
            String message2 = logRecord.getMessage();
            Intrinsics.checkNotNullExpressionValue(message2, "");
            aba.setCompoundDrawableTintBlendMode(new Object[]{loggerName2, Integer.valueOf(iIntValue2), message2, logRecord.getThrown()}, -1227449111, 1227449114, iIntValue2);
            int i20 = f52270a;
            int i21 = i20 & 119;
            int i22 = -(-(i20 | 119));
            int i23 = (i21 & i22) + (i22 | i21);
            f52271b = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
        } else if (i15 != 2) {
            int i24 = f52271b;
            int i25 = ((i24 & (-98)) | ((~i24) & 97)) + ((i24 & 97) << 1);
            f52270a = i25 % 128;
            if (i25 % 2 != 0) {
                int i26 = 68 / 0;
            }
        } else {
            int i27 = f52271b;
            int i28 = (i27 | 9) << 1;
            int i29 = -(((~i27) & 9) | (i27 & (-10)));
            int i30 = (i28 & i29) + (i29 | i28);
            f52270a = i30 % 128;
            if (i30 % 2 != 0) {
                throw null;
            }
        }
        return null;
    }

    @Override // java.util.logging.Handler
    public final void close() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 2080897667, -2080897665, System.identityHashCode(this));
    }

    @Override // java.util.logging.Handler
    public final void flush() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1641508491, 1641508491, System.identityHashCode(this));
    }

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord p4) {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 561810467, -561810466, System.identityHashCode(this));
    }
}
