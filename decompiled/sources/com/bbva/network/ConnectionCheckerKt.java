package com.bbva.network;

import android.net.NetworkCapabilities;
import com.bbva.network.model.NetworkType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectionChecker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroid/net/NetworkCapabilities;", "", "hasConnectivity", "network_release"}, k = 2, mv = {1, 8, 0})
public final class ConnectionCheckerKt {
    public static final NetworkType access$toNetworkType(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.CELL_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.CELL_3G;
            case 13:
            case 18:
            case 19:
                return NetworkType.CELL_4G;
            case 20:
                return NetworkType.CELL_5G;
            default:
                return NetworkType.UNKNOWN;
        }
    }

    public static final boolean hasConnectivity(@NotNull NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
