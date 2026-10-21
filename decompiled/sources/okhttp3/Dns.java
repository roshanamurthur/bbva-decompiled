package okhttp3;

import androidx.camera.core.processing.f;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lokhttp3/Dns;", "", "lookup", "", "Ljava/net/InetAddress;", "hostname", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Dns {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f85537a;

    @JvmField
    @NotNull
    public static final Dns SYSTEM = new Companion.a();

    /* JADX INFO: compiled from: Dns.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lokhttp3/Dns$Companion;", "", "Lokhttp3/Dns;", "SYSTEM", "Lokhttp3/Dns;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f85537a = new Companion();

        /* JADX INFO: compiled from: Dns.kt */
        public static final class a implements Dns {
            @Override // okhttp3.Dns
            @NotNull
            public final List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return ArraysKt___ArraysKt.toList(allByName);
                } catch (NullPointerException e5) {
                    UnknownHostException unknownHostException = new UnknownHostException(f.d("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e5);
                    throw unknownHostException;
                }
            }
        }
    }

    @NotNull
    List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException;
}
