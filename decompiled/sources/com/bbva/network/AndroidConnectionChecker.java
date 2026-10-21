package com.bbva.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.RequiresPermission;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.network.model.NetworkType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConnectionChecker.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/bbva/network/AndroidConnectionChecker;", "Lcom/bbva/network/ConnectionChecker;", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "isNetworkConnected", "Landroid/net/ConnectivityManager$NetworkCallback;", "callback", "", "registerNetworkCallback", "Landroid/net/Network;", DeepLinkListenerAdapter.Constants.ERROR_NETWORK, "getNetworkCapabilities", "Lcom/bbva/network/model/NetworkType;", "getNetworkType", "isNetworkAvailable", "()Z", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "network_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"MissingPermission"})
public final class AndroidConnectionChecker implements ConnectionChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f35061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f35062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f35063c;

    /* JADX INFO: compiled from: ConnectionChecker.kt */
    public static final class a extends Lambda implements Function0<ConnectivityManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ConnectivityManager invoke() {
            Object systemService = AndroidConnectionChecker.this.f35061a.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            return (ConnectivityManager) systemService;
        }
    }

    /* JADX INFO: compiled from: ConnectionChecker.kt */
    public static final class b extends Lambda implements Function0<TelephonyManager> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TelephonyManager invoke() {
            Object systemService = AndroidConnectionChecker.this.f35061a.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return (TelephonyManager) systemService;
        }
    }

    public AndroidConnectionChecker(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35061a = context;
        this.f35062b = LazyKt__LazyJVMKt.lazy(new b());
        this.f35063c = LazyKt__LazyJVMKt.lazy(new a());
    }

    public final ConnectivityManager a() {
        return (ConnectivityManager) this.f35063c.getValue();
    }

    @Override // com.bbva.network.ConnectionChecker
    @Nullable
    public NetworkCapabilities getNetworkCapabilities(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        return a().getNetworkCapabilities(network);
    }

    @Override // com.bbva.network.ConnectionChecker
    @NotNull
    public NetworkType getNetworkType(@Nullable NetworkCapabilities networkCapabilities) {
        NetworkType networkTypeAccess$toNetworkType;
        if (networkCapabilities == null) {
            return NetworkType.NONE;
        }
        if (networkCapabilities.hasTransport(1)) {
            return networkCapabilities.hasTransport(4) ? NetworkType.VPN_WIFI : NetworkType.WIFI;
        }
        if (!networkCapabilities.hasTransport(0)) {
            if (networkCapabilities.hasTransport(4)) {
                return NetworkType.VPN;
            }
            return networkCapabilities.hasTransport(3) ? NetworkType.ETHERNET : NetworkType.UNKNOWN;
        }
        if (networkCapabilities.hasTransport(4)) {
            return NetworkType.VPN_CELL;
        }
        if (Build.VERSION.SDK_INT >= 24 && this.f35061a.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            return ConnectionCheckerKt.access$toNetworkType(((TelephonyManager) this.f35062b.getValue()).getDataNetworkType());
        }
        NetworkInfo activeNetworkInfo = a().getActiveNetworkInfo();
        return (activeNetworkInfo == null || (networkTypeAccess$toNetworkType = ConnectionCheckerKt.access$toNetworkType(activeNetworkInfo.getSubtype())) == null) ? NetworkType.UNKNOWN : networkTypeAccess$toNetworkType;
    }

    @Override // com.bbva.network.ConnectionChecker
    @RequiresPermission(MagiskApp.ACCESS_NETWORK_STATE)
    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = a().getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    @Override // com.bbva.network.ConnectionChecker
    public boolean isNetworkConnected(@Nullable NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            networkCapabilities = a().getNetworkCapabilities(a().getActiveNetwork());
        }
        if (networkCapabilities != null) {
            return ConnectionCheckerKt.hasConnectivity(networkCapabilities);
        }
        return false;
    }

    @Override // com.bbva.network.ConnectionChecker
    public void registerNetworkCallback(@NotNull ConnectivityManager.NetworkCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        a().registerNetworkCallback(new NetworkRequest.Builder().build(), callback);
    }
}
