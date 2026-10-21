package com.appsflyer.internal;

import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1eSDK {

    public enum AFa1vSDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);

        private int afErrorLog;

        AFa1vSDK(int i10) {
            this.afErrorLog = i10;
        }
    }

    public enum AFa1wSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");

        String valueOf;

        AFa1wSDK(String str) {
            this.valueOf = str;
        }
    }

    public enum AFa1zSDK {
        NONE,
        FIRST,
        ALL
    }

    @VisibleForTesting
    public static List<BigDecimal> AFKeystoreWrapper(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f6 = (Float) arrayList.get(0);
        Float f10 = (Float) arrayList.get(1);
        Float f11 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(f6.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(f10.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(f11.toString())));
        } catch (ParseException e5) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", e5);
        }
        return arrayList2;
    }
}
