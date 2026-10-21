package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\tB\u0007¢\u0006\u0004\b.\u0010/J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ1\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010\u0019J'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0007\u0010\u001cJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u000f\u0010\u001cJ2\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001d2\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u001f¢\u0006\u0002\b 0\u001eH\u0016¢\u0006\u0004\b\u001a\u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0007\u0010\"J2\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020#2\u0011\u0010\u0013\u001a\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b 0\u001eH\u0016¢\u0006\u0004\b\t\u0010$J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020#H\u0016¢\u0006\u0004\b\u001a\u0010%J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020&H\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020'H\u0016¢\u0006\u0004\b\u000f\u0010(J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010\u000bJ\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u000bJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010\u000bJ\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\bJ!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b\u001a\u0010-J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/yd;", "", "Lcom/mypinpad/tsdk/i/xp;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "p1", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yr;)V", "setX", "setZ", "(Lcom/mypinpad/tsdk/i/xp;)V", "setNavigationOnClickListener", "Ljava/io/IOException;", "(Lcom/mypinpad/tsdk/i/xp;Ljava/io/IOException;)V", "setY", "getNavBarTitleString", "Ljava/net/InetSocketAddress;", "Ljava/net/Proxy;", "p2", "Lcom/mypinpad/tsdk/i/yi;", "p3", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/xp;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "p4", "(Lcom/mypinpad/tsdk/i/xp;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Ljava/io/IOException;)V", "setDividerPadding", "Lcom/mypinpad/tsdk/i/xx;", "(Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/xx;)V", "", "", "Ljava/net/InetAddress;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Lcom/mypinpad/tsdk/i/xp;Ljava/lang/String;Ljava/util/List;)V", "(Lcom/mypinpad/tsdk/i/xp;Ljava/lang/String;)V", "Lcom/mypinpad/tsdk/i/yg;", "(Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yg;Ljava/util/List;)V", "(Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yg;)V", "", "Lcom/mypinpad/tsdk/i/yk;", "(Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yk;)V", "setOnLongClickListener", "setLayoutAnimation", "setOnDragListener", "Lcom/mypinpad/tsdk/i/yf;", "(Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yf;)V", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class yd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62039a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62040b = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final yd setX = new setOnFocusChangeListener();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yd$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/yd$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/yd;", "setX", "Lcom/mypinpad/tsdk/i/yd;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class setOnFocusChangeListener extends yd {
    }

    public interface setX {
        @NotNull
        yd create(@NotNull xp xpVar);
    }

    static {
        int i10 = f62039a;
        int i11 = i10 & 5;
        int i12 = -(-((i10 ^ 5) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f62040b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 62 / 0;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62039a;
        int i11 = i10 & 121;
        int i12 = (i10 | 121) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f62040b = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
        } else {
            Intrinsics.checkNotNullParameter(xpVar, "");
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62039a + 78;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f62040b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(xpVar, "");
        int i13 = f62039a;
        int i14 = (i13 ^ 38) + ((i13 & 38) << 1);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f62040b = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62040b;
        int i11 = i10 & 25;
        int i12 = ((i10 | 25) & (~i11)) + (i11 << 1);
        f62039a = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
        } else {
            Intrinsics.checkNotNullParameter(xpVar, "");
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        IOException iOException = (IOException) objArr[1];
        int i10 = f62040b;
        int i11 = (((i10 ^ 19) | (i10 & 19)) << 1) - (((~i10) & 19) | (i10 & (-20)));
        f62039a = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(xpVar, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        int i13 = f62039a;
        int i14 = (((i13 | 20) << 1) - (i13 ^ 20)) - 1;
        f62040b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        IOException iOException = (IOException) objArr[1];
        int i10 = f62040b;
        int i11 = ((i10 | 55) << 1) - (i10 ^ 55);
        f62039a = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(xpVar, "");
        Intrinsics.checkNotNullParameter(iOException, "");
        int i13 = f62039a + 11;
        f62040b = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62039a;
        int i11 = i10 | 27;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 27)) & i11);
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f62040b = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
        } else {
            Intrinsics.checkNotNullParameter(xpVar, "");
            int i15 = 5 / 0;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        yr yrVar = (yr) objArr[1];
        int i10 = f62039a + 113;
        f62040b = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
            Intrinsics.checkNotNullParameter(yrVar, "");
        } else {
            Intrinsics.checkNotNullParameter(xpVar, "");
            Intrinsics.checkNotNullParameter(yrVar, "");
            throw null;
        }
    }

    public static void getNavBarTitleString(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, 1190590264, -1190590255, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62039a;
        int i11 = i10 & 25;
        int i12 = (i10 | 25) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f62040b = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(xpVar, "");
        int i16 = f62039a + 123;
        f62040b = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 57 / 0;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        xx xxVar = (xx) objArr[1];
        int i10 = f62039a;
        int i11 = ((i10 & 66) + (i10 | 66)) - 1;
        f62040b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(xpVar, "");
        Intrinsics.checkNotNullParameter(xxVar, "");
        int i13 = f62039a;
        int i14 = i13 & 1;
        int i15 = i14 + ((i13 ^ 1) | i14);
        f62040b = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 13 / 0;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        yr yrVar = (yr) objArr[1];
        int i10 = f62039a + 29;
        f62040b = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
            Intrinsics.checkNotNullParameter(yrVar, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(xpVar, "");
        Intrinsics.checkNotNullParameter(yrVar, "");
        int i11 = f62039a;
        int i12 = i11 & 101;
        int i13 = i11 | 101;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f62040b = i14 % 128;
        int i15 = i14 % 2;
    }

    public static /* synthetic */ void k(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62039a;
        int i11 = i10 & 25;
        int i12 = ((i10 ^ 25) | i11) << 1;
        int i13 = -((i10 | 25) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f62040b = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
        } else {
            Intrinsics.checkNotNullParameter(xpVar, "");
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        int i10 = f62040b;
        int i11 = (((i10 ^ 77) | (i10 & 77)) << 1) - (((~i10) & 77) | (i10 & (-78)));
        f62039a = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(xpVar, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(xpVar, "");
        int i12 = f62040b + 15;
        f62039a = i12 % 128;
        int i13 = i12 % 2;
    }

    public static /* synthetic */ void m(Object[] objArr) {
        xp xpVar = (xp) objArr[0];
        yk ykVar = (yk) objArr[1];
        int i10 = f62039a;
        int i11 = i10 ^ 81;
        int i12 = ((i10 & 81) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f62040b = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(xpVar, "");
        Intrinsics.checkNotNullParameter(ykVar, "");
        int i16 = f62040b;
        int i17 = (i16 ^ 109) + ((i16 & 109) << 1);
        f62039a = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
        int i14 = ~i11;
        switch ((((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13) {
            case 1:
                xp xpVar = (xp) objArr[0];
                InetSocketAddress inetSocketAddress = (InetSocketAddress) objArr[1];
                Proxy proxy = (Proxy) objArr[2];
                IOException iOException = (IOException) objArr[3];
                int i15 = f62040b;
                int i16 = i15 & 63;
                int i17 = ((i15 ^ 63) | i16) << 1;
                int i18 = -((i15 | 63) & (~i16));
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                f62039a = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(xpVar, "");
                Intrinsics.checkNotNullParameter(inetSocketAddress, "");
                Intrinsics.checkNotNullParameter(proxy, "");
                Intrinsics.checkNotNullParameter(iOException, "");
                int i21 = f62039a + 57;
                f62040b = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 2:
                c(objArr);
                return null;
            case 3:
                xp xpVar2 = (xp) objArr[0];
                String str = (String) objArr[1];
                int i23 = f62039a;
                int i24 = (i23 & 75) + (i23 | 75);
                f62040b = i24 % 128;
                int i25 = i24 % 2;
                Intrinsics.checkNotNullParameter(xpVar2, "");
                Intrinsics.checkNotNullParameter(str, "");
                int i26 = (-2) - ((f62039a + 80) ^ (-1));
                f62040b = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 4:
                xp xpVar3 = (xp) objArr[0];
                int i28 = f62039a + 119;
                f62040b = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(xpVar3, "");
                System.currentTimeMillis();
                System.currentTimeMillis();
                return null;
            case 5:
                k(objArr);
                return null;
            case 6:
                l(objArr);
                return null;
            case 7:
                i(objArr);
                return null;
            case 8:
                d(objArr);
                return null;
            case 9:
                b(objArr);
                return null;
            case 10:
                f(objArr);
                return null;
            case 11:
                j(objArr);
                return null;
            case 12:
                xp xpVar4 = (xp) objArr[0];
                yg ygVar = (yg) objArr[1];
                int i30 = f62040b + 65;
                f62039a = i30 % 128;
                int i31 = i30 % 2;
                Intrinsics.checkNotNullParameter(xpVar4, "");
                Intrinsics.checkNotNullParameter(ygVar, "");
                int i32 = f62039a;
                int i33 = (i32 & 99) + (i32 | 99);
                f62040b = i33 % 128;
                int i34 = i33 % 2;
                return null;
            case 13:
                g(objArr);
                return null;
            case 14:
                h(objArr);
                return null;
            case 15:
                a(objArr);
                return null;
            case 16:
                e(objArr);
                return null;
            case 17:
                m(objArr);
                return null;
            case 18:
                xp xpVar5 = (xp) objArr[0];
                yr yrVar = (yr) objArr[1];
                int i35 = f62040b + 3;
                f62039a = i35 % 128;
                int i36 = i35 % 2;
                Intrinsics.checkNotNullParameter(xpVar5, "");
                Intrinsics.checkNotNullParameter(yrVar, "");
                int i37 = f62039a;
                int i38 = i37 & 37;
                int i39 = i38 + ((i37 ^ 37) | i38);
                f62040b = i39 % 128;
                int i40 = i39 % 2;
                return null;
            case 19:
                xp xpVar6 = (xp) objArr[0];
                IOException iOException2 = (IOException) objArr[1];
                int i41 = f62039a;
                int i42 = (((i41 ^ 73) | (i41 & 73)) << 1) - (((~i41) & 73) | (i41 & (-74)));
                f62040b = i42 % 128;
                if (i42 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(xpVar6, "");
                    Intrinsics.checkNotNullParameter(iOException2, "");
                    return null;
                }
                Intrinsics.checkNotNullParameter(xpVar6, "");
                Intrinsics.checkNotNullParameter(iOException2, "");
                throw null;
            case 20:
                xp xpVar7 = (xp) objArr[0];
                int i43 = f62040b;
                int i44 = i43 & 3;
                int i45 = i43 | 3;
                int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                f62039a = i46 % 128;
                int i47 = i46 % 2;
                Intrinsics.checkNotNullParameter(xpVar7, "");
                int i48 = f62039a;
                int i49 = i48 ^ 23;
                int i50 = (((i48 & 23) | i49) << 1) - i49;
                f62040b = i50 % 128;
                int i51 = i50 % 2;
                return null;
            case 21:
                xp xpVar8 = (xp) objArr[0];
                int i52 = f62040b;
                int i53 = (i52 ^ 55) + ((i52 & 55) << 1);
                f62039a = i53 % 128;
                int i54 = i53 % 2;
                Intrinsics.checkNotNullParameter(xpVar8, "");
                int i55 = f62040b;
                int i56 = i55 & 51;
                int i57 = ((((i55 ^ 51) | i56) << 1) - (~(-((i55 | 51) & (~i56))))) - 1;
                f62039a = i57 % 128;
                int i58 = i57 % 2;
                return null;
            case 22:
                xp xpVar9 = (xp) objArr[0];
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) objArr[1];
                Proxy proxy2 = (Proxy) objArr[2];
                int i59 = f62039a;
                int i60 = i59 & 59;
                int i61 = (((i59 ^ 59) | i60) << 1) - ((i59 | 59) & (~i60));
                f62040b = i61 % 128;
                int i62 = i61 % 2;
                Intrinsics.checkNotNullParameter(xpVar9, "");
                Intrinsics.checkNotNullParameter(inetSocketAddress2, "");
                Intrinsics.checkNotNullParameter(proxy2, "");
                int i63 = f62039a;
                int i64 = (((i63 & (-42)) | ((~i63) & 41)) - (~((i63 & 41) << 1))) - 1;
                f62040b = i64 % 128;
                int i65 = i64 % 2;
                return null;
            case 23:
                xp xpVar10 = (xp) objArr[0];
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) objArr[1];
                Proxy proxy3 = (Proxy) objArr[2];
                int i66 = f62040b;
                int i67 = (-2) - (((i66 ^ 26) + ((i66 & 26) << 1)) ^ (-1));
                f62039a = i67 % 128;
                int i68 = i67 % 2;
                Intrinsics.checkNotNullParameter(xpVar10, "");
                Intrinsics.checkNotNullParameter(inetSocketAddress3, "");
                Intrinsics.checkNotNullParameter(proxy3, "");
                int i69 = f62040b;
                int i70 = i69 & 53;
                int i71 = (i69 | 53) & (~i70);
                int i72 = -(-(i70 << 1));
                int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
                f62039a = i73 % 128;
                int i74 = i73 % 2;
                return null;
            case 24:
                xp xpVar11 = (xp) objArr[0];
                yr yrVar2 = (yr) objArr[1];
                int i75 = f62039a;
                int i76 = i75 & 95;
                int i77 = (i76 - (~(-(-((i75 ^ 95) | i76))))) - 1;
                f62040b = i77 % 128;
                if (i77 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(xpVar11, "");
                    Intrinsics.checkNotNullParameter(yrVar2, "");
                    return null;
                }
                Intrinsics.checkNotNullParameter(xpVar11, "");
                Intrinsics.checkNotNullParameter(yrVar2, "");
                throw null;
            case 25:
                xp xpVar12 = (xp) objArr[0];
                xx xxVar = (xx) objArr[1];
                int i78 = f62039a;
                int i79 = i78 ^ 13;
                int i80 = ((i78 & 13) | i79) << 1;
                int i81 = -i79;
                int i82 = ((i80 | i81) << 1) - (i80 ^ i81);
                f62040b = i82 % 128;
                if (i82 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(xpVar12, "");
                    Intrinsics.checkNotNullParameter(xxVar, "");
                    return null;
                }
                Intrinsics.checkNotNullParameter(xpVar12, "");
                Intrinsics.checkNotNullParameter(xxVar, "");
                throw null;
            case 26:
                xp xpVar13 = (xp) objArr[0];
                yg ygVar2 = (yg) objArr[1];
                List list = (List) objArr[2];
                int i83 = f62040b;
                int i84 = ((i83 & 27) - (~(i83 | 27))) - 1;
                f62039a = i84 % 128;
                int i85 = i84 % 2;
                Intrinsics.checkNotNullParameter(xpVar13, "");
                Intrinsics.checkNotNullParameter(ygVar2, "");
                Intrinsics.checkNotNullParameter(list, "");
                int i86 = f62040b;
                int i87 = i86 & 35;
                int i88 = (i87 - (~(-(-((i86 ^ 35) | i87))))) - 1;
                f62039a = i88 % 128;
                int i89 = i88 % 2;
                return null;
            case 27:
                xp xpVar14 = (xp) objArr[0];
                int i90 = f62040b;
                int i91 = ((i90 ^ 95) - (~(-(-((i90 & 95) << 1))))) - 1;
                f62039a = i91 % 128;
                int i92 = i91 % 2;
                Intrinsics.checkNotNullParameter(xpVar14, "");
                int i93 = f62039a;
                int i94 = i93 & 61;
                int i95 = (i93 | 61) & (~i94);
                int i96 = -(-(i94 << 1));
                int i97 = (i95 ^ i96) + ((i95 & i96) << 1);
                f62040b = i97 % 128;
                int i98 = i97 % 2;
                return null;
            default:
                xp xpVar15 = (xp) objArr[0];
                String str2 = (String) objArr[1];
                List list2 = (List) objArr[2];
                int i99 = f62039a;
                int i100 = ((i99 & 80) + (i99 | 80)) - 1;
                f62040b = i100 % 128;
                int i101 = i100 % 2;
                Intrinsics.checkNotNullParameter(xpVar15, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(list2, "");
                int i102 = f62039a;
                int i103 = i102 & 95;
                int i104 = (i102 | 95) & (~i103);
                int i105 = i103 << 1;
                int i106 = (i104 & i105) + (i104 | i105);
                f62040b = i106 % 128;
                int i107 = i106 % 2;
                return null;
        }
    }

    public static void setLayoutAnimation(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, 1549597330, -1549597326, (int) System.currentTimeMillis());
    }

    public static void setNavigationOnClickListener(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, 1033720133, -1033720112, (int) System.currentTimeMillis());
    }

    public static void setOnDragListener(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, 883582440, -883582425, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(@NotNull xp p4, @NotNull yr p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 330169765, -330169741, (int) System.currentTimeMillis());
    }

    public static void setOnLongClickListener(@NotNull xp xpVar) {
        setCompoundDrawableTintBlendMode(new Object[]{xpVar}, 1547987810, -1547987808, (int) System.currentTimeMillis());
    }

    public static void setX(@NotNull xp p4, @NotNull yr p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 555885383, -555885372, (int) System.currentTimeMillis());
    }

    public static void setY(@NotNull xp p4, @NotNull yk p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 513193632, -513193615, (int) System.currentTimeMillis());
    }

    public static void setZ(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, -47610669, 47610689, (int) System.currentTimeMillis());
    }

    public void setDividerPadding(@NotNull xp p4, @Nullable yf p10) {
        int i10 = f62039a;
        int i11 = i10 & 95;
        int i12 = (((i10 ^ 95) | i11) << 1) - ((i10 | 95) & (~i11));
        f62040b = i12 % 128;
        if (i12 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p4, "");
        } else {
            Intrinsics.checkNotNullParameter(p4, "");
            throw null;
        }
    }

    public static void setOnFocusChangeListener(@NotNull xp xpVar, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        setCompoundDrawableTintBlendMode(new Object[]{xpVar, inetSocketAddress, proxy}, 1373602495, -1373602472, (int) System.currentTimeMillis());
    }

    public static void setX(@NotNull xp p4, @NotNull IOException p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -1785273983, 1785273999, (int) System.currentTimeMillis());
    }

    public static void setY(@NotNull xp p4, @NotNull xx p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -1070751559, 1070751584, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, -26706738, 26706752, (int) System.currentTimeMillis());
    }

    public static void setX(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, -956834125, 956834135, (int) System.currentTimeMillis());
    }

    public static void setY(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, 227307049, -227307022, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull xp p4, @NotNull IOException p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 418874566, -418874547, (int) System.currentTimeMillis());
    }

    public static void setX(@NotNull xp p4, @NotNull yg p10, @NotNull List<Proxy> p11) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10, p11}, 1124862998, -1124862972, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull xp p4, @NotNull yr p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -1472860653, 1472860666, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull xp p4) {
        setCompoundDrawableTintBlendMode(new Object[]{p4}, 586749255, -586749249, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull xp p4, @NotNull InetSocketAddress p10, @NotNull Proxy p11) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10, p11}, -1995705726, 1995705748, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull xp p4, @NotNull String p10, @NotNull List<InetAddress> p11) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10, p11}, 626425308, -626425308, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(@NotNull xp p4, @NotNull yg p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -175529290, 175529302, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull xp p4, @NotNull yr p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -1784443573, 1784443591, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull xp p4, @NotNull IOException p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 1625955890, -1625955882, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull xp xpVar) {
        setCompoundDrawableTintBlendMode(new Object[]{xpVar}, 729723225, -729723220, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull xp p4, @NotNull xx p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 412276872, -412276865, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull xp xpVar, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @NotNull IOException iOException) {
        setCompoundDrawableTintBlendMode(new Object[]{xpVar, inetSocketAddress, proxy, iOException}, -212916460, 212916461, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull xp p4, @NotNull String p10) {
        setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, 1883231770, -1883231767, (int) System.currentTimeMillis());
    }
}
