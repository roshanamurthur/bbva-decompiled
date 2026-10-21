package com.bbva.ethermobilesdk.deviceinfo.component;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bbva.ethermobilesdk.deviceinfo.data.IpAddress;
import com.bbva.ethermobilesdk.deviceinfo.data.IpAddressSet;
import com.bbva.ethermobilesdk.deviceinfo.data.IpAddressVersion;
import com.bbva.ethermobilesdk.deviceinfo.data.NetworkConnection;
import com.bbva.ethermobilesdk.deviceinfo.data.NetworkTypeInfo;
import com.bbva.ethermobilesdk.deviceinfo.data.Proxy;
import com.bbva.ethermobilesdk.deviceinfo.utils.Connectivity;
import com.bbva.ethermobilesdk.deviceinfo.utils.NetworkType;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import java.net.SocketException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Network.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Network;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/NetworkTypeInfo;", "networkType", "", "isWifiSecure", "()Ljava/lang/Boolean;", "", "getProviderName", "()Ljava/lang/String;", InfoTable.AUTHORITY, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetwork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Network.kt\ncom/bbva/ethermobilesdk/deviceinfo/component/Network\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class Network {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29535a;

    public Network(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29535a = context;
    }

    @NotNull
    public final String getProviderName() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f29535a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(networkOperatorName, "it.networkOperatorName");
        return networkOperatorName;
    }

    @Nullable
    public final Boolean isWifiSecure() {
        return Connectivity.INSTANCE.checkWifiOpened$deviceinfo_release(this.f29535a);
    }

    @NotNull
    public final NetworkTypeInfo networkType() {
        IpAddressSet ipAddressSet;
        Connectivity connectivity = Connectivity.INSTANCE;
        Context context = this.f29535a;
        boolean zIsConnected$deviceinfo_release = connectivity.isConnected$deviceinfo_release(context);
        try {
            ipAddressSet = connectivity.getIPAddress$deviceinfo_release();
        } catch (SocketException unused) {
            IpAddressVersion ipAddressVersion = IpAddressVersion.UNKNOWN;
            ipAddressSet = new IpAddressSet(new IpAddress("", ipAddressVersion), new IpAddress("", ipAddressVersion));
        }
        Connectivity connectivity2 = Connectivity.INSTANCE;
        Integer signalStrength$deviceinfo_release = connectivity2.getSignalStrength$deviceinfo_release(context);
        Proxy proxy$deviceinfo_release = connectivity2.getProxy$deviceinfo_release(context);
        Proxy proxy = (proxy$deviceinfo_release == null || proxy$deviceinfo_release.getHost().length() <= 0) ? null : proxy$deviceinfo_release;
        NetworkType networkTypeFromCapabilities$deviceinfo_release = connectivity2.getNetworkTypeFromCapabilities$deviceinfo_release(context);
        return new NetworkTypeInfo(new NetworkConnection(networkTypeFromCapabilities$deviceinfo_release.name(), networkTypeFromCapabilities$deviceinfo_release.getId(), networkTypeFromCapabilities$deviceinfo_release.getDataType(), signalStrength$deviceinfo_release, proxy), ipAddressSet.getIpV4().getAddress(), ipAddressSet.getIpV6().getAddress(), zIsConnected$deviceinfo_release, connectivity2.isCaptivePortal$deviceinfo_release(context));
    }
}
