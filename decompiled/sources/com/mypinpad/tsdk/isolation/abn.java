package com.mypinpad.tsdk.isolation;

import bk.d;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/abn;", "Ljava/net/ProxySelector;", "Ljava/net/URI;", "p0", "Ljava/net/SocketAddress;", "p1", "Ljava/io/IOException;", "p2", "", "connectFailed", "(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V", "", "Ljava/net/Proxy;", "select", "(Ljava/net/URI;)Ljava/util/List;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class abn extends ProxySelector {

    @NotNull
    public static final abn INSTANCE = new abn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52323a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52324b = 1;

    static {
        int i10 = f52324b + 15;
        f52323a = i10 % 128;
        int i11 = i10 % 2;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (i13 * (-629)) + (i11 * (-628)) + (i10 * 630);
        int i15 = ~i10;
        if (((i15 | i11) * 629) + ((~(i13 | i15)) * (-629)) + i14 != 1) {
            int i16 = f52324b;
            int i17 = i16 & 49;
            int i18 = i17 + ((i16 ^ 49) | i17);
            f52323a = i18 % 128;
            if (i18 % 2 == 0) {
                return null;
            }
            int i19 = 83 / 0;
            return null;
        }
        URI uri = (URI) objArr[1];
        int i20 = f52324b;
        int i21 = i20 & 107;
        int i22 = (i21 - (~((i20 ^ 107) | i21))) - 1;
        f52323a = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null".toString());
        }
        List listListOf = d.listOf(Proxy.NO_PROXY);
        int i23 = f52323a;
        int i24 = (i23 & (-76)) | ((~i23) & 75);
        int i25 = (i23 & 75) << 1;
        int i26 = (i24 & i25) + (i25 | i24);
        f52324b = i26 % 128;
        int i27 = i26 % 2;
        return listListOf;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(@Nullable URI p4, @Nullable SocketAddress p10, @Nullable IOException p11) {
        setDividerPadding(new Object[]{this, p4, p10, p11}, 1859798965, -1859798965, System.identityHashCode(this));
    }

    @Override // java.net.ProxySelector
    @NotNull
    public final List<Proxy> select(@Nullable URI p4) {
        return (List) setDividerPadding(new Object[]{this, p4}, 923812800, -923812799, System.identityHashCode(this));
    }
}
