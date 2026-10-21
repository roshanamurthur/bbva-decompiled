package com.bbva.ethermobilesdk.deviceinfo.utils;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Conectivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/utils/NetworkType;", "", "", "id", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "androidType", "Ljava/lang/Integer;", "getAndroidType", "()Ljava/lang/Integer;", "", "dataType", "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", "NOT_CONNECTED", "UNKNOWN", "WIFI", "GPRS", "EDGE", "HSDPA", "HSUPA", "CDMA", "EVDO_0", "EVDO_A", "EVDO_B", "LTE", "RTT", "HSPA", "UMTS", "GSM", "TD_SCDMA", "IWLAN", "EHRPD", "HSPAP", "IDEN", "NR", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public enum NetworkType {
    NOT_CONNECTED(-1, (Integer) null, 6),
    UNKNOWN(0, (Integer) 0, 4),
    WIFI(1, (Integer) null, 6),
    GPRS(2, (Integer) 1, "2G"),
    EDGE(3, (Integer) 2, "2G"),
    HSDPA(4, (Integer) 8, "3G"),
    HSUPA(5, (Integer) 9, "3G"),
    CDMA(6, (Integer) 4, "2G"),
    EVDO_0(7, (Integer) 5, "3G"),
    EVDO_A(8, (Integer) 6, "3G"),
    EVDO_B(9, (Integer) 12, "3G"),
    LTE(10, (Integer) 13, "4G"),
    RTT(11, (Integer) 7, "2G"),
    HSPA(12, (Integer) 10, "3G"),
    UMTS(13, (Integer) 3, "3G"),
    GSM(14, (Integer) 16, "2G"),
    TD_SCDMA(15, (Integer) 17, "3G"),
    IWLAN(16, (Integer) 18, "4G"),
    EHRPD(17, (Integer) 14, "3G"),
    HSPAP(18, (Integer) 15, "3G"),
    IDEN(19, (Integer) 11, "2G"),
    NR(20, (Integer) 20, "5G");


    @Nullable
    private final Integer androidType;

    @Nullable
    private final String dataType;
    private final int id;

    /* synthetic */ NetworkType(int i10, Integer num, int i11) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? "" : null);
    }

    @Nullable
    public final Integer getAndroidType() {
        return this.androidType;
    }

    @Nullable
    public final String getDataType() {
        return this.dataType;
    }

    public final int getId() {
        return this.id;
    }

    NetworkType(int i10, Integer num, String str) {
        this.id = i10;
        this.androidType = num;
        this.dataType = str;
    }
}
