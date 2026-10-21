package com.bbva.network.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ConnectionState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/network/model/NetworkType;", "", "WIFI", "CELL_2G", "CELL_3G", "CELL_4G", "CELL_5G", "VPN", "VPN_WIFI", "VPN_CELL", "ETHERNET", "UNKNOWN", ExpectedUserActionOnPoiTypes.NONE, "network_release"}, k = 1, mv = {1, 8, 0})
public final class NetworkType {
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType CELL_2G;
    public static final NetworkType CELL_3G;
    public static final NetworkType CELL_4G;
    public static final NetworkType CELL_5G;
    public static final NetworkType ETHERNET;
    public static final NetworkType NONE;
    public static final NetworkType UNKNOWN;
    public static final NetworkType VPN;
    public static final NetworkType VPN_CELL;
    public static final NetworkType VPN_WIFI;
    public static final NetworkType WIFI;

    static {
        NetworkType networkType = new NetworkType("WIFI", 0);
        WIFI = networkType;
        NetworkType networkType2 = new NetworkType("CELL_2G", 1);
        CELL_2G = networkType2;
        NetworkType networkType3 = new NetworkType("CELL_3G", 2);
        CELL_3G = networkType3;
        NetworkType networkType4 = new NetworkType("CELL_4G", 3);
        CELL_4G = networkType4;
        NetworkType networkType5 = new NetworkType("CELL_5G", 4);
        CELL_5G = networkType5;
        NetworkType networkType6 = new NetworkType("VPN", 5);
        VPN = networkType6;
        NetworkType networkType7 = new NetworkType("VPN_WIFI", 6);
        VPN_WIFI = networkType7;
        NetworkType networkType8 = new NetworkType("VPN_CELL", 7);
        VPN_CELL = networkType8;
        NetworkType networkType9 = new NetworkType("ETHERNET", 8);
        ETHERNET = networkType9;
        NetworkType networkType10 = new NetworkType("UNKNOWN", 9);
        UNKNOWN = networkType10;
        NetworkType networkType11 = new NetworkType(ExpectedUserActionOnPoiTypes.NONE, 10);
        NONE = networkType11;
        $VALUES = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6, networkType7, networkType8, networkType9, networkType10, networkType11};
    }

    public NetworkType() {
        throw null;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
