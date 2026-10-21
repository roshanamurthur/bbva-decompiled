package com.veridas.contextualdata.network;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: NetworkType.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/veridas/contextualdata/network/NetworkType;", "", "DATA", "WIFI", "OTHER", ExpectedUserActionOnPoiTypes.NONE, "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType DATA;
    public static final NetworkType NONE;
    public static final NetworkType OTHER;
    public static final NetworkType WIFI;

    static {
        NetworkType networkType = new NetworkType("DATA", 0);
        DATA = networkType;
        NetworkType networkType2 = new NetworkType("WIFI", 1);
        WIFI = networkType2;
        NetworkType networkType3 = new NetworkType("OTHER", 2);
        OTHER = networkType3;
        NetworkType networkType4 = new NetworkType(ExpectedUserActionOnPoiTypes.NONE, 3);
        NONE = networkType4;
        NetworkType[] networkTypeArr = {networkType, networkType2, networkType3, networkType4};
        $VALUES = networkTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(networkTypeArr);
    }

    public NetworkType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<NetworkType> getEntries() {
        return $ENTRIES;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
