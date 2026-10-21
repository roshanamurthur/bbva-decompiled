package com.veridas.contextualdata.network.wifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.bbva.nativesettings.common.Constants;
import com.veridas.contextualdata.ContextualDataUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WifiContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/veridas/contextualdata/network/wifi/WifiContextualDataProvider;", "Lcom/veridas/contextualdata/network/wifi/IWifiContextualDataProvider;", "", "getWifiSsid", "getWifiBssid", "", "getWifiRssi", "()Ljava/lang/Integer;", "", "isWifiEnabled", "()Ljava/lang/Boolean;", "getWifiSignalLevel", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class WifiContextualDataProvider implements IWifiContextualDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66724a;

    /* JADX INFO: compiled from: WifiContextualDataProvider.kt */
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return WifiContextualDataProvider.access$getWifiManager(WifiContextualDataProvider.this).getConnectionInfo().getBSSID();
        }
    }

    /* JADX INFO: compiled from: WifiContextualDataProvider.kt */
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(WifiContextualDataProvider.access$getWifiManager(WifiContextualDataProvider.this).getConnectionInfo().getRssi());
        }
    }

    /* JADX INFO: compiled from: WifiContextualDataProvider.kt */
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(WifiManager.calculateSignalLevel(WifiContextualDataProvider.access$getWifiManager(WifiContextualDataProvider.this).getConnectionInfo().getRssi(), 5));
        }
    }

    /* JADX INFO: compiled from: WifiContextualDataProvider.kt */
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return WifiContextualDataProvider.access$getWifiManager(WifiContextualDataProvider.this).getConnectionInfo().getSSID();
        }
    }

    /* JADX INFO: compiled from: WifiContextualDataProvider.kt */
    public static final class e extends Lambda implements Function0<Boolean> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(WifiContextualDataProvider.access$getWifiManager(WifiContextualDataProvider.this).isWifiEnabled());
        }
    }

    public WifiContextualDataProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66724a = context.getApplicationContext();
    }

    public static final WifiManager access$getWifiManager(WifiContextualDataProvider wifiContextualDataProvider) {
        Object systemService = wifiContextualDataProvider.f66724a.getSystemService(Constants.WIFI);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (WifiManager) systemService;
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public String getWifiBssid() {
        ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
        Context appContext = this.f66724a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return (String) contextualDataUtil.requiresPermission(appContext, "android.permission.ACCESS_WIFI_STATE", new a());
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Integer getWifiRssi() {
        ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
        Context appContext = this.f66724a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return (Integer) contextualDataUtil.requiresPermission(appContext, "android.permission.ACCESS_WIFI_STATE", new b());
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Integer getWifiSignalLevel() {
        ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
        Context appContext = this.f66724a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return (Integer) contextualDataUtil.requiresPermission(appContext, "android.permission.ACCESS_WIFI_STATE", new c());
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public String getWifiSsid() {
        ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
        Context appContext = this.f66724a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return (String) contextualDataUtil.requiresPermission(appContext, "android.permission.ACCESS_WIFI_STATE", new d());
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Boolean isWifiEnabled() {
        ContextualDataUtil contextualDataUtil = ContextualDataUtil.INSTANCE;
        Context appContext = this.f66724a;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return (Boolean) contextualDataUtil.requiresPermission(appContext, "android.permission.ACCESS_WIFI_STATE", new e());
    }
}
