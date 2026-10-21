package com.mypinpad.tsdk.isolation;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/xz;", "", "", "p0", "", "Ljava/net/InetAddress;", "setY", "(Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface xz {

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f61964a;

    @JvmField
    @NotNull
    public static final xz setOnFocusChangeListener = new Companion.a();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xz$setY, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f61964a = new Companion();

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xz$setY$a */
        public static final class a implements xz {
            @Override // com.mypinpad.tsdk.isolation.xz
            @NotNull
            public final List<InetAddress> setY(@NotNull String str) throws UnknownHostException {
                Object[] objArr = {this, str};
                System.identityHashCode(this);
                String str2 = (String) objArr[1];
                Intrinsics.checkNotNullParameter(str2, "");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str2);
                    Intrinsics.checkNotNullExpressionValue(allByName, "");
                    return ArraysKt___ArraysKt.toList(allByName);
                } catch (NullPointerException e5) {
                    UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", str2));
                    unknownHostException.initCause(e5);
                    throw unknownHostException;
                }
            }
        }

        static {
            int i10 = (1 - (-109)) - 2;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }
    }

    @NotNull
    List<InetAddress> setY(@NotNull String p4) throws UnknownHostException;
}
