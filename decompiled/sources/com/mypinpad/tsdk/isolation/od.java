package com.mypinpad.tsdk.isolation;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nAndroidHostNetworkStateProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHostNetworkStateProvider.kt\ncom/mypinpad/tsdk/internal/host/android/AndroidHostNetworkStateProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1747#2,3:28\n*S KotlinDebug\n*F\n+ 1 AndroidHostNetworkStateProvider.kt\ncom/mypinpad/tsdk/internal/host/android/AndroidHostNetworkStateProvider\n*L\n26#1:28,3\n*E\n"})
public final class od implements nr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57448b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57449c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConnectivityManager f57450a;

    public od(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "");
        this.f57450a = connectivityManager;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:16:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:17:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:27:0x013b A[PHI: r4
      0x013b: PHI (r4v13 android.net.NetworkCapabilities) = (r4v12 android.net.NetworkCapabilities), (r4v29 android.net.NetworkCapabilities) binds: [B:26:0x0139, B:23:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0167  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:9:0x0087->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0076  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        NetworkCapabilities networkCapabilities;
        Boolean boolValueOf;
        Iterator it;
        int i13;
        int i14 = ~i12;
        int i15 = i14 | i10;
        int i16 = ((~(i15 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
        int i17 = ~i11;
        int i18 = (((~i15) | (~(i17 | i10)) | (~(i17 | i14))) * (-52)) + i16;
        int i19 = ~i10;
        if ((((~(i19 | i11)) | (~(i14 | i19))) * 52) + i18 == 1) {
            od odVar = (od) objArr[0];
            int i20 = f57448b;
            int i21 = i20 ^ 121;
            int i22 = -(-((i20 & 121) << 1));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f57449c = i23 % 128;
            int i24 = i23 % 2;
            Network activeNetwork = odVar.f57450a.getActiveNetwork();
            if (activeNetwork != null) {
                int i25 = f57449c;
                int i26 = i25 & 67;
                int i27 = i26 + ((i25 ^ 67) | i26);
                f57448b = i27 % 128;
                int i28 = i27 % 2;
                ConnectivityManager connectivityManager = odVar.f57450a;
                if (i28 != 0) {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    int i29 = 43 / 0;
                    if (networkCapabilities != null) {
                        Intrinsics.checkNotNullExpressionValue(networkCapabilities, "");
                        boolValueOf = Boolean.valueOf(((Boolean) setCompoundDrawableTintBlendMode(new Object[]{networkCapabilities}, -1330755333, 1330755333, (int) System.currentTimeMillis())).booleanValue());
                        int i30 = f57448b + 43;
                        f57449c = i30 % 128;
                        int i31 = i30 % 2;
                    } else {
                        int i32 = f57448b;
                        int i33 = (-2) - (((i32 ^ 100) + ((i32 & 100) << 1)) ^ (-1));
                        f57449c = i33 % 128;
                        int i34 = i33 % 2;
                        boolValueOf = null;
                    }
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (networkCapabilities != null) {
                        Intrinsics.checkNotNullExpressionValue(networkCapabilities, "");
                        boolValueOf = Boolean.valueOf(((Boolean) setCompoundDrawableTintBlendMode(new Object[]{networkCapabilities}, -1330755333, 1330755333, (int) System.currentTimeMillis())).booleanValue());
                        int i35 = f57448b + 43;
                        f57449c = i35 % 128;
                        int i36 = i35 % 2;
                    } else {
                        int i37 = f57448b;
                        int i38 = (-2) - (((i37 ^ 100) + ((i37 & 100) << 1)) ^ (-1));
                        f57449c = i38 % 128;
                        int i39 = i38 % 2;
                        boolValueOf = null;
                    }
                }
                if (boolValueOf != null) {
                    int i40 = f57448b;
                    int i41 = ((i40 & 102) + (i40 | 102)) - 1;
                    f57449c = i41 % 128;
                    if (i41 % 2 != 0) {
                        return Boolean.valueOf(boolValueOf.booleanValue());
                    }
                    boolValueOf.booleanValue();
                    throw null;
                }
            }
            int i42 = f57448b;
            int i43 = i42 & 11;
            int i44 = i43 + ((i42 ^ 11) | i43);
            f57449c = i44 % 128;
            if (i44 % 2 != 0) {
                return Boolean.FALSE;
            }
            int i45 = 45 / 0;
            return Boolean.FALSE;
        }
        NetworkCapabilities networkCapabilities2 = (NetworkCapabilities) objArr[0];
        int i46 = f57448b;
        int i47 = (i46 ^ 81) + ((i46 & 81) << 1);
        f57449c = i47 % 128;
        int i48 = i47 % 2;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 0, 3, 2});
        if (listListOf instanceof Collection) {
            int i49 = f57449c;
            int i50 = (i49 & 7) + (i49 | 7);
            f57448b = i50 % 128;
            int i51 = i50 % 2;
            if (!listListOf.isEmpty()) {
                it = listListOf.iterator();
                int i52 = f57448b;
                int i53 = ((i52 | 31) << 1) - (i52 ^ 31);
                f57449c = i53 % 128;
                int i54 = i53 % 2;
                while (!(!it.hasNext())) {
                    int i55 = f57448b;
                    int i56 = i55 & 105;
                    int i57 = (i55 | 105) & (~i56);
                    int i58 = i56 << 1;
                    int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                    f57449c = i59 % 128;
                    int i60 = i59 % 2;
                    if (networkCapabilities2.hasTransport(((Number) it.next()).intValue())) {
                        int i61 = f57449c;
                        int i62 = ((i61 | 50) << 1) - (i61 ^ 50);
                        int i63 = (i62 ^ (-1)) + (i62 << 1);
                        f57448b = i63 % 128;
                        int i64 = i63 % 2;
                        int i65 = ((i61 ^ 107) | (i61 & 107)) << 1;
                        int i66 = -(((~i61) & 107) | (i61 & (-108)));
                        i13 = (i65 ^ i66) + ((i66 & i65) << 1);
                        f57448b = i13 % 128;
                        if (i13 % 2 == 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                }
            }
        } else {
            it = listListOf.iterator();
            int i510 = f57448b;
            int i511 = ((i510 | 31) << 1) - (i510 ^ 31);
            f57449c = i511 % 128;
            int i512 = i511 % 2;
            while (!(!it.hasNext())) {
                int i513 = f57448b;
                int i514 = i513 & 105;
                int i515 = (i513 | 105) & (~i514);
                int i516 = i514 << 1;
                int i517 = ((i515 | i516) << 1) - (i515 ^ i516);
                f57449c = i517 % 128;
                int i67 = i517 % 2;
                if (networkCapabilities2.hasTransport(((Number) it.next()).intValue())) {
                    int i68 = f57449c;
                    int i69 = ((i68 | 50) << 1) - (i68 ^ 50);
                    int i610 = (i69 ^ (-1)) + (i69 << 1);
                    f57448b = i610 % 128;
                    int i611 = i610 % 2;
                    int i612 = ((i68 ^ 107) | (i68 & 107)) << 1;
                    int i613 = -(((~i68) & 107) | (i68 & (-108)));
                    i13 = (i612 ^ i613) + ((i613 & i612) << 1);
                    f57448b = i13 % 128;
                    if (i13 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
            }
        }
        int i70 = f57449c;
        int i71 = ((((i70 ^ 41) | (i70 & 41)) << 1) - (~(-(((~i70) & 41) | (i70 & (-42)))))) - 1;
        f57448b = i71 % 128;
        int i72 = i71 % 2;
        return Boolean.FALSE;
    }

    @Override // com.mypinpad.tsdk.isolation.nr
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -926285198, 926285199, System.identityHashCode(this))).booleanValue();
    }
}
