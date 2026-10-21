package com.bbva.networkmonitor.lib;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import bk.d;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\t\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0006\u001a\u0018\u0010\u000b\u001a\u00020\u0001*\u0004\u0018\u00010\b2\n\u0010\n\u001a\u00020\t\"\u00020\u0004\"\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/net/ConnectivityManager;", "", "isInternetConnected", "", "", "getUnavailableCapabilities", "Landroid/content/Context;", "connectivityManager", "Landroid/net/NetworkCapabilities;", "", "capabilities", "hasCapabilities", "a", "[I", "getCapabilities", "()[I", "NET_NOT_AVAILABLE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "cmp-dp-network_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkExtensions.kt\ncom/bbva/networkmonitor/lib/NetworkExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,44:1\n3819#2:45\n4337#2,2:46\n12313#2,2:48\n*S KotlinDebug\n*F\n+ 1 NetworkExtensions.kt\ncom/bbva/networkmonitor/lib/NetworkExtensionsKt\n*L\n28#1:45\n28#1:46,2\n42#1:48,2\n*E\n"})
public final class NetworkExtensionsKt {
    public static final int NET_NOT_AVAILABLE = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f35203a = {12, 13, 14};

    @NotNull
    public static final ConnectivityManager connectivityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    @NotNull
    public static final int[] getCapabilities() {
        return f35203a;
    }

    @NotNull
    public static final List<Integer> getUnavailableCapabilities(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return d.listOf(-1);
        }
        int[] iArr = f35203a;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            if (!networkCapabilities.hasCapability(i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return arrayList;
    }

    public static final boolean hasCapabilities(@Nullable NetworkCapabilities networkCapabilities, @NotNull int... capabilities) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        if (networkCapabilities == null) {
            return false;
        }
        for (int i10 : capabilities) {
            if (!networkCapabilities.hasCapability(i10)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isInternetConnected(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        return hasCapabilities(connectivityManager.getNetworkCapabilities(activeNetwork), Arrays.copyOf(f35203a, 3));
    }
}
