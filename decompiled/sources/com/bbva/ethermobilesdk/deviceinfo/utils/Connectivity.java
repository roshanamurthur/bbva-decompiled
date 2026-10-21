package com.bbva.ethermobilesdk.deviceinfo.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.deviceinfo.data.IpAddress;
import com.bbva.ethermobilesdk.deviceinfo.data.IpAddressSet;
import com.bbva.ethermobilesdk.deviceinfo.data.IpAddressVersion;
import com.bbva.ethermobilesdk.deviceinfo.data.Proxy;
import com.bbva.ethermobilesdk.deviceinfo.utils.extension.StringKt;
import com.bbva.nativesettings.common.Constants;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Conectivity.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010 J'\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0000¢\u0006\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/utils/Connectivity;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddressSet;", "getIPAddress$deviceinfo_release", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/IpAddressSet;", "getIPAddress", "Landroid/content/Context;", "context", "", "isConnected$deviceinfo_release", "(Landroid/content/Context;)Z", "isConnected", "isCaptivePortal$deviceinfo_release", "isCaptivePortal", "Lcom/bbva/ethermobilesdk/deviceinfo/utils/NetworkType;", "getNetworkTypeFromCapabilities$deviceinfo_release", "(Landroid/content/Context;)Lcom/bbva/ethermobilesdk/deviceinfo/utils/NetworkType;", "getNetworkTypeFromCapabilities", "", "getSignalStrength$deviceinfo_release", "(Landroid/content/Context;)Ljava/lang/Integer;", "getSignalStrength", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Proxy;", "getProxy$deviceinfo_release", "(Landroid/content/Context;)Lcom/bbva/ethermobilesdk/deviceinfo/data/Proxy;", "getProxy", "Landroid/net/NetworkCapabilities;", "capabilities", "getDataNetworkTypeFromCapabilities$deviceinfo_release", "(Landroid/content/Context;Landroid/net/NetworkCapabilities;)Lcom/bbva/ethermobilesdk/deviceinfo/utils/NetworkType;", "getDataNetworkTypeFromCapabilities", "checkWifiOpened$deviceinfo_release", "(Landroid/content/Context;)Ljava/lang/Boolean;", "checkWifiOpened", "", "ssid", "", "Landroid/net/wifi/ScanResult;", "wifiList", "getCapabilities$deviceinfo_release", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "getCapabilities", "<init>", "()V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConectivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Conectivity.kt\ncom/bbva/ethermobilesdk/deviceinfo/utils/Connectivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,298:1\n1549#2:299\n1620#2,2:300\n766#2:302\n857#2,2:303\n766#2:305\n857#2,2:306\n1549#2:308\n1620#2,3:309\n1622#2:312\n288#2,2:313\n288#2,2:315\n1#3:317\n12474#4,2:318\n*S KotlinDebug\n*F\n+ 1 Conectivity.kt\ncom/bbva/ethermobilesdk/deviceinfo/utils/Connectivity\n*L\n53#1:299\n53#1:300,2\n55#1:302\n55#1:303,2\n56#1:305\n56#1:306,2\n57#1:308\n57#1:309,3\n53#1:312\n69#1:313,2\n71#1:315,2\n237#1:318,2\n*E\n"})
public final class Connectivity {

    @NotNull
    public static final Connectivity INSTANCE = new Connectivity();

    @SuppressLint({"MissingPermission"})
    @Nullable
    public final Boolean checkWifiOpened$deviceinfo_release(@NotNull Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            boolean z10 = true;
            if (networkCapabilities.hasTransport(1)) {
                NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork);
                Connectivity connectivity = INSTANCE;
                connectivity.getClass();
                boolean z11 = false;
                if (Build.VERSION.SDK_INT >= 31) {
                    if (networkCapabilities2 != null) {
                        connectivity.getClass();
                        if (!networkCapabilities2.hasTransport(1) || !networkCapabilities2.hasCapability(13) || networkCapabilities2.hasCapability(17)) {
                            z10 = false;
                            break;
                        }
                        z11 = z10;
                    }
                } else if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    Object systemService2 = context.getApplicationContext().getSystemService(Constants.WIFI);
                    Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
                    WifiManager wifiManager = (WifiManager) systemService2;
                    List<ScanResult> wifiList = wifiManager.getScanResults();
                    String ssid = wifiManager.getConnectionInfo().getSSID();
                    Intrinsics.checkNotNullExpressionValue(ssid, "ssid");
                    Intrinsics.checkNotNullExpressionValue(wifiList, "wifiList");
                    String capabilities$deviceinfo_release = connectivity.getCapabilities$deviceinfo_release(ssid, wifiList);
                    if (capabilities$deviceinfo_release != null) {
                        connectivity.getClass();
                        String[] strArr = {"WEP", "WPA", "PSK", "WPA3"};
                        int i10 = 0;
                        while (true) {
                            if (i10 >= 4) {
                                z10 = false;
                                break;
                            }
                            if (StringsKt__StringsKt.contains$default((CharSequence) capabilities$deviceinfo_release, (CharSequence) strArr[i10], false, 2, (Object) null)) {
                                break;
                            }
                            i10++;
                        }
                        z11 = z10;
                    }
                }
                return Boolean.valueOf(z11);
            }
        }
        return null;
    }

    @Nullable
    public final String getCapabilities$deviceinfo_release(@NotNull String ssid, @NotNull List<ScanResult> wifiList) {
        Object next;
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(wifiList, "wifiList");
        Iterator<T> it = wifiList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual("\"" + ((ScanResult) next).SSID + "\"", ssid));
        ScanResult scanResult = (ScanResult) next;
        if (scanResult != null) {
            return scanResult.capabilities;
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final NetworkType getDataNetworkTypeFromCapabilities$deviceinfo_release(@NotNull Context context, @NotNull NetworkCapabilities capabilities) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        if (capabilities.hasTransport(1)) {
            return NetworkType.WIFI;
        }
        if (!capabilities.hasTransport(0)) {
            return NetworkType.UNKNOWN;
        }
        Connectivity connectivity = INSTANCE;
        connectivity.getClass();
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            return NetworkType.UNKNOWN;
        }
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        connectivity.getClass();
        int dataNetworkType = Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
        connectivity.getClass();
        switch (dataNetworkType) {
            case 1:
                return NetworkType.GPRS;
            case 2:
                return NetworkType.EDGE;
            case 3:
                return NetworkType.UMTS;
            case 4:
                return NetworkType.CDMA;
            case 5:
                return NetworkType.EVDO_0;
            case 6:
                return NetworkType.EVDO_A;
            case 7:
                return NetworkType.RTT;
            case 8:
                return NetworkType.HSDPA;
            case 9:
                return NetworkType.HSUPA;
            case 10:
                return NetworkType.HSPA;
            case 11:
                return NetworkType.IDEN;
            case 12:
                return NetworkType.EVDO_B;
            case 13:
                return NetworkType.LTE;
            case 14:
                return NetworkType.EHRPD;
            case 15:
                return NetworkType.HSPAP;
            case 16:
                return NetworkType.GSM;
            case 17:
                return NetworkType.TD_SCDMA;
            case 18:
                return NetworkType.IWLAN;
            case 19:
            default:
                return NetworkType.UNKNOWN;
            case 20:
                return NetworkType.NR;
        }
    }

    @NotNull
    public final IpAddressSet getIPAddress$deviceinfo_release() throws SocketException {
        Object obj;
        Object next;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces()");
        ArrayList list = Collections.list(networkInterfaces);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
            Intrinsics.checkNotNullExpressionValue(inetAddresses, "it.inetAddresses");
            ArrayList list2 = Collections.list(inetAddresses);
            Intrinsics.checkNotNullExpressionValue(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!((InetAddress) obj2).isLoopbackAddress()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((InetAddress) obj3).getHostAddress() != null) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String hostAddress = ((InetAddress) it2.next()).getHostAddress();
                Intrinsics.checkNotNull(hostAddress);
                arrayList4.add(InetAddressToolsKt.isIPv4Address(hostAddress) ? new IpAddress(hostAddress, IpAddressVersion.IPv4) : (InetAddressToolsKt.isIPv6Address(hostAddress) || InetAddressToolsKt.isIPv4MappedIPv6Address(hostAddress)) ? new IpAddress(StringKt.normaliseIPV6Address(hostAddress), IpAddressVersion.IPv6) : new IpAddress("", IpAddressVersion.UNKNOWN));
            }
            arrayList.add(arrayList4);
        }
        List listFlatten = CollectionsKt__IterablesKt.flatten(arrayList);
        Iterator it3 = listFlatten.iterator();
        do {
            obj = null;
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((IpAddress) next).getVersion() != IpAddressVersion.IPv4);
        IpAddress ipAddress = (IpAddress) next;
        if (ipAddress == null) {
            ipAddress = new IpAddress("", IpAddressVersion.UNKNOWN);
        }
        for (Object obj4 : listFlatten) {
            if (((IpAddress) obj4).getVersion() == IpAddressVersion.IPv6) {
                obj = obj4;
                break;
            }
        }
        IpAddress ipAddress2 = (IpAddress) obj;
        if (ipAddress2 == null) {
            ipAddress2 = new IpAddress("", IpAddressVersion.UNKNOWN);
        }
        return new IpAddressSet(ipAddress, ipAddress2);
    }

    @SuppressLint({"MissingPermission"})
    @NotNull
    public final NetworkType getNetworkTypeFromCapabilities$deviceinfo_release(@NotNull Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return NetworkType.NOT_CONNECTED;
        }
        Connectivity connectivity = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(networkCapabilities, "this");
        return connectivity.getDataNetworkTypeFromCapabilities$deviceinfo_release(context, networkCapabilities);
    }

    @Nullable
    public final Proxy getProxy$deviceinfo_release(@NotNull Context context) {
        Object objM5535constructorimpl;
        int i10;
        ProxyInfo defaultProxy;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null && (defaultProxy = connectivityManager.getDefaultProxy()) != null) {
            String host = defaultProxy.getHost();
            Intrinsics.checkNotNullExpressionValue(host, "it.host");
            return new Proxy(host, defaultProxy.getPort());
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String property = System.getProperty("http.proxyHost");
            if (property == null) {
                property = "";
            }
            String property2 = System.getProperty("http.proxyPort");
            if (property2 != null) {
                Intrinsics.checkNotNullExpressionValue(property2, "getProperty(\"http.proxyPort\")");
                i10 = Integer.parseInt(property2);
            } else {
                i10 = 0;
            }
            objM5535constructorimpl = Result.m5535constructorimpl(new Proxy(property, i10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (Proxy) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @Nullable
    public final Integer getSignalStrength$deviceinfo_release(@NotNull Context context) {
        SignalStrength signalStrength;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null || (signalStrength = telephonyManager.getSignalStrength()) == null) {
            return null;
        }
        return Integer.valueOf(signalStrength.getLevel());
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isCaptivePortal$deviceinfo_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(Constants.WIFI);
            Intrinsics.checkNotNull(wifiManager);
            List<ScanResult> scanResults = wifiManager.getScanResults();
            Intrinsics.checkNotNullExpressionValue(scanResults, "wifiManager!!.scanResults");
            for (ScanResult scanResult : scanResults) {
                String str = scanResult.capabilities;
                Intrinsics.checkNotNullExpressionValue(str, "network.capabilities");
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "WEP", false, 2, (Object) null)) {
                    String str2 = scanResult.capabilities;
                    Intrinsics.checkNotNullExpressionValue(str2, "network.capabilities");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "PSK", false, 2, (Object) null)) {
                        String str3 = scanResult.capabilities;
                        Intrinsics.checkNotNullExpressionValue(str3, "network.capabilities");
                        StringsKt__StringsKt.contains$default((CharSequence) str3, (CharSequence) "EAP", false, 2, (Object) null);
                    }
                }
            }
        }
        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities2 != null) {
            return networkCapabilities2.hasCapability(17);
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isConnected$deviceinfo_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return ((ConnectivityManager) systemService).getActiveNetwork() != null;
    }
}
