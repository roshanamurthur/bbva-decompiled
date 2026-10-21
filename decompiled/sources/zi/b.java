package zi;

import com.veridas.contextualdata.network.NetworkContextualDataProvider;
import java.math.BigInteger;
import java.net.InetAddress;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NetworkContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NetworkContextualDataProvider f95076p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NetworkContextualDataProvider networkContextualDataProvider) {
        super(0);
        this.f95076p0 = networkContextualDataProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(NetworkContextualDataProvider.access$getWifiManager(this.f95076p0).getConnectionInfo().getIpAddress());
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        byte[] byteArray = bigIntegerValueOf.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return InetAddress.getByAddress(ArraysKt___ArraysKt.reversedArray(byteArray)).getHostAddress();
    }
}
