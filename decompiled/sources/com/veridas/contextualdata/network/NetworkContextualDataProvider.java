package com.veridas.contextualdata.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bbva.nativesettings.common.Constants;
import com.veridas.contextualdata.ContextualDataUtil;
import com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider;
import com.veridas.contextualdata.network.wifi.WifiContextualDataProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zi.b;

/* JADX INFO: compiled from: NetworkContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0096\u0001¢\u0006\u0004\b\b\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/veridas/contextualdata/network/NetworkContextualDataProvider;", "Lcom/veridas/contextualdata/network/INetworkContextualDataProvider;", "Lcom/veridas/contextualdata/network/wifi/IWifiContextualDataProvider;", "", "getWifiBssid", "", "getWifiRssi", "()Ljava/lang/Integer;", "getWifiSignalLevel", "getWifiSsid", "", "isWifiEnabled", "()Ljava/lang/Boolean;", "getIpAddress", "Lcom/veridas/contextualdata/network/NetworkType;", "getNetworkConnectionType", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkContextualDataProvider implements INetworkContextualDataProvider, IWifiContextualDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WifiContextualDataProvider f66721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f66722c;

    /* JADX INFO: compiled from: NetworkContextualDataProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: NetworkContextualDataProvider.kt */
    public static final class a extends Lambda implements Function0<NetworkType> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NetworkType invoke() {
            ConnectivityManager connectivityManagerAccess$getConnectivityManager = NetworkContextualDataProvider.access$getConnectivityManager(NetworkContextualDataProvider.this);
            if (Build.VERSION.SDK_INT >= 24) {
                NetworkCapabilities networkCapabilities = connectivityManagerAccess$getConnectivityManager.getNetworkCapabilities(connectivityManagerAccess$getConnectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return NetworkType.NONE;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return NetworkType.WIFI;
                }
                return networkCapabilities.hasTransport(0) ? NetworkType.DATA : NetworkType.OTHER;
            }
            NetworkInfo activeNetworkInfo = connectivityManagerAccess$getConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                return NetworkType.NONE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return type != 1 ? NetworkType.OTHER : NetworkType.WIFI;
            }
            return NetworkType.DATA;
        }
    }

    public NetworkContextualDataProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.f66721b = new WifiContextualDataProvider(context);
        this.f66722c = context.getApplicationContext();
    }

    public static final ConnectivityManager access$getConnectivityManager(NetworkContextualDataProvider networkContextualDataProvider) {
        Object systemService = networkContextualDataProvider.f66722c.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }

    public static final WifiManager access$getWifiManager(NetworkContextualDataProvider networkContextualDataProvider) {
        Object systemService = networkContextualDataProvider.f66722c.getSystemService(Constants.WIFI);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.veridas.contextualdata.network.INetworkContextualDataProvider
    @Nullable
    public String getIpAddress() {
        NetworkType networkConnectionType = getNetworkConnectionType();
        int i10 = networkConnectionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkConnectionType.ordinal()];
        if (i10 != -1) {
            Context context = this.context;
            if (i10 == 1) {
                return (String) ContextualDataUtil.INSTANCE.requiresPermission(context, "android.permission.ACCESS_WIFI_STATE", new b(this));
            }
            if (i10 == 2 || i10 == 3) {
                return (String) ContextualDataUtil.INSTANCE.requiresPermission(context, MagiskApp.INTERNET, zi.a.f95075p0);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // com.veridas.contextualdata.network.INetworkContextualDataProvider
    @SuppressLint({"MissingPermission"})
    @Nullable
    public NetworkType getNetworkConnectionType() {
        return (NetworkType) ContextualDataUtil.INSTANCE.requiresPermission(this.context, MagiskApp.ACCESS_NETWORK_STATE, new a());
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public String getWifiBssid() {
        return this.f66721b.getWifiBssid();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Integer getWifiRssi() {
        return this.f66721b.getWifiRssi();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Integer getWifiSignalLevel() {
        return this.f66721b.getWifiSignalLevel();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public String getWifiSsid() {
        return this.f66721b.getWifiSsid();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Boolean isWifiEnabled() {
        return this.f66721b.isWifiEnabled();
    }
}
