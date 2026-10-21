package zi;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NetworkContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nNetworkContextualDataProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkContextualDataProvider.kt\ncom/veridas/contextualdata/network/NetworkContextualDataProvider$getNetworkInterfaceIpAddress$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1855#2:120\n1855#2,2:121\n1856#2:123\n*S KotlinDebug\n*F\n+ 1 NetworkContextualDataProvider.kt\ncom/veridas/contextualdata/network/NetworkContextualDataProvider$getNetworkInterfaceIpAddress$1\n*L\n45#1:120\n46#1:121,2\n45#1:123\n*E\n"})
public final class a extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f95075p0 = new a(0);

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        Intrinsics.checkNotNullExpressionValue(networkInterfaces, "getNetworkInterfaces(...)");
        ArrayList list = Collections.list(networkInterfaces);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Enumeration<InetAddress> inetAddresses = ((NetworkInterface) it.next()).getInetAddresses();
            Intrinsics.checkNotNullExpressionValue(inetAddresses, "getInetAddresses(...)");
            ArrayList<InetAddress> list2 = Collections.list(inetAddresses);
            Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
            for (InetAddress inetAddress : list2) {
                if (!inetAddress.isLoopbackAddress()) {
                    return inetAddress.getHostAddress();
                }
            }
        }
        return null;
    }
}
