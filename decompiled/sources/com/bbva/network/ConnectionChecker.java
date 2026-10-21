package com.bbva.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.network.model.NetworkType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionChecker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/bbva/network/ConnectionChecker;", "", "isNetworkAvailable", "", "()Z", "getNetworkCapabilities", "Landroid/net/NetworkCapabilities;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "Landroid/net/Network;", "getNetworkType", "Lcom/bbva/network/model/NetworkType;", "capabilities", "isNetworkConnected", "networkCapabilities", "registerNetworkCallback", "", "callback", "Landroid/net/ConnectivityManager$NetworkCallback;", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ConnectionChecker {

    /* JADX INFO: compiled from: ConnectionChecker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static NetworkCapabilities getNetworkCapabilities(@NotNull ConnectionChecker connectionChecker, @NotNull Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            return null;
        }

        @NotNull
        public static NetworkType getNetworkType(@NotNull ConnectionChecker connectionChecker, @Nullable NetworkCapabilities networkCapabilities) {
            return NetworkType.UNKNOWN;
        }

        public static boolean isNetworkConnected(@NotNull ConnectionChecker connectionChecker, @Nullable NetworkCapabilities networkCapabilities) {
            return false;
        }

        public static /* synthetic */ boolean isNetworkConnected$default(ConnectionChecker connectionChecker, NetworkCapabilities networkCapabilities, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isNetworkConnected");
            }
            if ((i10 & 1) != 0) {
                networkCapabilities = null;
            }
            return connectionChecker.isNetworkConnected(networkCapabilities);
        }

        public static void registerNetworkCallback(@NotNull ConnectionChecker connectionChecker, @NotNull ConnectivityManager.NetworkCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    @Nullable
    NetworkCapabilities getNetworkCapabilities(@NotNull Network network);

    @NotNull
    NetworkType getNetworkType(@Nullable NetworkCapabilities capabilities);

    boolean isNetworkAvailable();

    boolean isNetworkConnected(@Nullable NetworkCapabilities networkCapabilities);

    void registerNetworkCallback(@NotNull ConnectivityManager.NetworkCallback callback);
}
