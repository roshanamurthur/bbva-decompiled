package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.data.util.CommandConstants;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0017\u0012\u0006\u0010\t\u001a\u000206\u0012\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\bL\u0010MJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0005JE\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00152\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u0018\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0003¢\u0006\u0004\b \u0010\u0005J\u000f\u0010\"\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010$J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020%H\u0016¢\u0006\u0004\b\u0013\u0010&J\u001f\u0010)\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020'2\u0006\u0010\n\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0017¢\u0006\u0004\b,\u0010-J!\u0010\u0013\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020.2\b\u0010\n\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b\u0013\u00100J\u000f\u0010\u0018\u001a\u000201H\u0017¢\u0006\u0004\b\u0018\u00102J\u000f\u00104\u001a\u000203H\u0017¢\u0006\u0004\b4\u00105R\u0011\u0010\u0013\u001a\u000206X\u0007¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b\u0013\u0010;\"\u0004\b<\u0010\u0005R\u001a\u0010,\u001a\u00020\b8\u0001X\u0081\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b7\u0010?R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0A0@8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b)\u0010DR\"\u0010K\u001a\u00020E8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\b\u0018\u0010JR\u0014\u0010\u0004\u001a\u00020\r8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010;"}, d2 = {"Lcom/mypinpad/tsdk/i/zi;", "Lcom/mypinpad/tsdk/i/aah$setCompoundDrawableTintBlendMode;", "Lcom/mypinpad/tsdk/i/xx;", "", "setOnDragListener", "()V", "setOnLongClickListener", "setLayoutAnimation", "", "p0", "p1", "p2", "p3", "", "p4", "Lcom/mypinpad/tsdk/i/xp;", "p5", "Lcom/mypinpad/tsdk/i/yd;", "p6", "setDividerPadding", "(IIIIZLcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yd;)V", "Lcom/mypinpad/tsdk/i/xh;", "", "Lcom/mypinpad/tsdk/i/yp;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/xh;Ljava/util/List;)Z", "Lcom/mypinpad/tsdk/i/ym;", "Lcom/mypinpad/tsdk/i/zs;", "Lcom/mypinpad/tsdk/i/zu;", "(Lcom/mypinpad/tsdk/i/ym;Lcom/mypinpad/tsdk/i/zs;)Lcom/mypinpad/tsdk/i/zu;", "setIncludeFontPadding", "()Lcom/mypinpad/tsdk/i/yp;", "setTextAlignment", "Ljava/net/Socket;", "UiMessageCallbackKtWhenMappings", "()Ljava/net/Socket;", "(Z)Z", "Lcom/mypinpad/tsdk/i/aak;", "(Lcom/mypinpad/tsdk/i/aak;)V", "Lcom/mypinpad/tsdk/i/aah;", "Lcom/mypinpad/tsdk/i/aam;", "setX", "(Lcom/mypinpad/tsdk/i/aah;Lcom/mypinpad/tsdk/i/aam;)V", "Lcom/mypinpad/tsdk/i/yf;", "setZ", "()Lcom/mypinpad/tsdk/i/yf;", "Lcom/mypinpad/tsdk/i/zj;", "Ljava/io/IOException;", "(Lcom/mypinpad/tsdk/i/zj;Ljava/io/IOException;)V", "Lcom/mypinpad/tsdk/i/yi;", "()Lcom/mypinpad/tsdk/i/yi;", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/zl;", "setY", "Lcom/mypinpad/tsdk/i/zl;", "i", "Z", "()Z", "setOnFocusChangeListener", "k", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "()I", "", "Ljava/lang/ref/Reference;", "o", "Ljava/util/List;", "()Ljava/util/List;", "", "p", "J", "getNavBarTitleString", "()J", "(J)V", "setNavigationOnClickListener", "<init>", "(Lcom/mypinpad/tsdk/i/zl;Lcom/mypinpad/tsdk/i/yp;)V"}, k = 1, mv = {1, 6, 0})
public final class zi extends aah.setCompoundDrawableTintBlendMode implements xx {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f62360q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f62361r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final yp f62362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Socket f62363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Socket f62364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public yf f62365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public yi f62366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public aah f62367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public aby f62368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public abv f62369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean setLayoutAnimation;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int setZ;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f62373l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f62374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayList f62375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long setNavigationOnClickListener;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public zl setDividerPadding;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            setDividerPadding = iArr;
            int i10 = ((1 ^ 105) | (1 & 105)) << 1;
            int i11 = -((105 & (~1)) | (1 & (-106)));
            int i12 = (i10 & i11) + (i10 | i11);
            int i13 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i10 = f62361r + 43;
        f62360q = i10 % 128;
        int i11 = i10 % 2;
    }

    public zi(@NotNull zl zlVar, @NotNull yp ypVar) {
        Intrinsics.checkNotNullParameter(zlVar, "");
        Intrinsics.checkNotNullParameter(ypVar, "");
        this.setDividerPadding = zlVar;
        this.f62362a = ypVar;
        this.f62374n = 1;
        this.f62375o = new ArrayList();
        this.setNavigationOnClickListener = Long.MAX_VALUE;
    }

    public static /* synthetic */ yf a(Object[] objArr) {
        zi ziVar = (zi) objArr[0];
        int i10 = f62361r + 102;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        int i12 = i11 % 128;
        f62360q = i12;
        int i13 = i11 % 2;
        yf yfVar = ziVar.f62365d;
        if (i13 != 0) {
            throw null;
        }
        int i14 = i12 + 17;
        f62361r = i14 % 128;
        if (i14 % 2 != 0) {
            return yfVar;
        }
        throw null;
    }

    public static /* synthetic */ ArrayList b(Object[] objArr) {
        zi ziVar = (zi) objArr[0];
        int i10 = f62361r;
        int i11 = i10 + 95;
        f62360q = i11 % 128;
        int i12 = i11 % 2;
        ArrayList arrayList = ziVar.f62375o;
        int i13 = ((i10 ^ 119) | (i10 & 119)) << 1;
        int i14 = -(((~i10) & 119) | (i10 & (-120)));
        int i15 = (i13 & i14) + (i14 | i13);
        f62360q = i15 % 128;
        if (i15 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01f8, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(new java.lang.Object[]{r1}, -1474615858, 1474615886, java.lang.System.identityHashCode(r1))).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0211, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(new java.lang.Object[]{r1}, -1474615858, 1474615886, java.lang.System.identityHashCode(r1))).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0213, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.zi.f62361r;
        r1 = r0 & 25;
        r0 = r0 | 25;
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.zi.f62360q = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0225, code lost:
    
        if ((r2 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0227, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0228, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.yk c(java.lang.Object[] r16) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zi.c(java.lang.Object[]):com.mypinpad.tsdk.i.yk");
    }

    public static /* synthetic */ yk d(Object[] objArr) throws IOException {
        zi ziVar = (zi) objArr[0];
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        yp ypVar = ziVar.f62362a;
        xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
        yk.setDividerPadding setdividerpadding2 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar))}, -735097510, 735097513, System.identityHashCode(setdividerpadding));
        yk.setDividerPadding setdividerpadding3 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2, CommandConstants.CONNECT, null}, -426525578, 426525584, System.identityHashCode(setdividerpadding2));
        yp ypVar2 = ziVar.f62362a;
        xh xhVar2 = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
        yk.setDividerPadding setdividerpadding4 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding3, "Host", yt.setDividerPadding((yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2)), true)}, 730186305, -730186291, System.identityHashCode(setdividerpadding3));
        yk.setDividerPadding setdividerpadding5 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding4, "Proxy-Connection", "Keep-Alive"}, 730186305, -730186291, System.identityHashCode(setdividerpadding4));
        yk.setDividerPadding setdividerpadding6 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding5, "User-Agent", "okhttp/4.10.0"}, 730186305, -730186291, System.identityHashCode(setdividerpadding5));
        yk ykVar = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding6}, 721744858, -721744846, System.identityHashCode(setdividerpadding6));
        yr.setDividerPadding setdividerpadding7 = new yr.setDividerPadding();
        yr.setDividerPadding setdividerpadding8 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding7, ykVar}, 1035005502, -1035005479, System.identityHashCode(setdividerpadding7));
        yr.setDividerPadding setdividerpadding9 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{(yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding8, yi.setOnFocusChangeListener}, 1826457204, -1826457177, System.identityHashCode(setdividerpadding8)), 407}, 784510625, -784510596, 407);
        yr.setDividerPadding setdividerpadding10 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding9, "Preemptive Authenticate"}, 176587316, -176587297, System.identityHashCode(setdividerpadding9));
        yr.setDividerPadding setdividerpadding11 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding10, yt.setDividerPadding}, 637562883, -637562870, System.identityHashCode(setdividerpadding10));
        yr.setDividerPadding setdividerpadding12 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding11, -1L}, -790912778, 790912800, System.identityHashCode(setdividerpadding11));
        yr.setDividerPadding setdividerpadding13 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding12, -1L}, 485790072, -485790071, System.identityHashCode(setdividerpadding12));
        yr.setDividerPadding setdividerpadding14 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding13, "Proxy-Authenticate", "OkHttp-Preemptive"}, -979970500, 979970521, System.identityHashCode(setdividerpadding13));
        yr yrVar = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding14}, -92684172, 92684189, System.identityHashCode(setdividerpadding14));
        xh xhVar3 = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
        yk y7 = ((xo) xh.setOnFocusChangeListener(new Object[]{xhVar3}, -305101271, 305101284, System.identityHashCode(xhVar3))).setY(ypVar2, yrVar);
        if (y7 == null) {
            int i10 = f62360q + 37;
            int i11 = i10 % 128;
            f62361r = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            int i12 = ((i11 | 5) << 1) - (i11 ^ 5);
            f62360q = i12 % 128;
            int i13 = i12 % 2;
        } else {
            ykVar = y7;
        }
        int i14 = f62361r;
        int i15 = i14 ^ 67;
        int i16 = ((i14 & 67) | i15) << 1;
        int i17 = -i15;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f62360q = i18 % 128;
        int i19 = i18 % 2;
        return ykVar;
    }

    public static /* synthetic */ void e(Object[] objArr) throws IOException {
        Socket socketCreateSocket;
        zi ziVar = (zi) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        xp xpVar = (xp) objArr[3];
        int i10 = -1;
        int i11 = (-2) - ((f62361r + 104) ^ (-1));
        f62360q = i11 % 128;
        int i12 = i11 % 2;
        yp ypVar = ziVar.f62362a;
        Proxy proxy = (Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar));
        yp ypVar2 = ziVar.f62362a;
        xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
        Proxy.Type type = proxy.type();
        if (type == null) {
            int i13 = f62360q;
            int i14 = i13 ^ 51;
            int i15 = ((i13 & 51) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            f62361r = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 95 / 0;
            }
        } else {
            i10 = setY.setDividerPadding[type.ordinal()];
            int i19 = f62361r;
            int i20 = i19 & 59;
            int i21 = ((i19 ^ 59) | i20) << 1;
            int i22 = -((i19 | 59) & (~i20));
            int i23 = (i21 & i22) + (i22 | i21);
            f62360q = i23 % 128;
            int i24 = i23 % 2;
        }
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = ((SocketFactory) xh.setOnFocusChangeListener(new Object[]{xhVar}, -482771210, 482771215, System.identityHashCode(xhVar))).createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
            int i25 = f62361r;
            int i26 = i25 & 41;
            int i27 = (((i25 | 41) & (~i26)) - (~(-(-(i26 << 1))))) - 1;
            f62360q = i27 % 128;
            int i28 = i27 % 2;
        } else {
            socketCreateSocket = new Socket(proxy);
            int i29 = f62360q;
            int i30 = (((i29 ^ 113) | (i29 & 113)) << 1) - (((~i29) & 113) | (i29 & (-114)));
            f62361r = i30 % 128;
            int i31 = i30 % 2;
        }
        ziVar.f62363b = socketCreateSocket;
        yd.setCompoundDrawableTintBlendMode(new Object[]{xpVar, (InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, -1865027862, 1865027863, System.identityHashCode(ypVar2)), proxy}, -1995705726, 1995705748, (int) System.currentTimeMillis());
        socketCreateSocket.setSoTimeout(iIntValue2);
        try {
            aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
            ((aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis())).setY(socketCreateSocket, (InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, -1865027862, 1865027863, System.identityHashCode(ypVar2)), iIntValue);
            int i32 = f62361r;
            int i33 = (i32 & (-60)) | ((~i32) & 59);
            int i34 = -(-((i32 & 59) << 1));
            int i35 = (i33 & i34) + (i34 | i33);
            f62360q = i35 % 128;
            int i36 = i35 % 2;
            try {
                ziVar.f62368g = (aby) ach.setOnFocusChangeListener(new Object[]{(acp) ach.setOnFocusChangeListener(new Object[]{socketCreateSocket}, -1701685100, 1701685103, (int) System.currentTimeMillis())}, -878740537, 878740541, (int) System.currentTimeMillis());
                ziVar.f62369h = (abv) ach.setOnFocusChangeListener(new Object[]{(aco) ach.setOnFocusChangeListener(new Object[]{socketCreateSocket}, -85046677, 85046677, (int) System.currentTimeMillis())}, -678282231, 678282232, (int) System.currentTimeMillis());
                int i37 = f62361r;
                int i38 = ((i37 ^ 37) - (~(-(-((i37 & 37) << 1))))) - 1;
                f62360q = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 98 / 0;
                }
            } catch (NullPointerException e5) {
                if (Intrinsics.areEqual(e5.getMessage(), "throw with null exception")) {
                    throw new IOException(e5);
                }
                int i40 = f62361r;
                int i41 = i40 & 17;
                int i42 = ((i40 ^ 17) | i41) << 1;
                int i43 = -((i40 | 17) & (~i41));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f62360q = i44 % 128;
                if (i44 % 2 != 0) {
                    throw null;
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", ypVar2.setX()));
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public static /* synthetic */ String f(Object[] objArr) {
        zi ziVar = (zi) objArr[0];
        StringBuilder sb2 = new StringBuilder("Connection{");
        yp ypVar = ziVar.f62362a;
        xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
        yg ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
        sb2.append((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)));
        sb2.append(AbstractJsonLexerKt.COLON);
        yp ypVar2 = ziVar.f62362a;
        xh xhVar2 = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
        yg ygVar2 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
        sb2.append(((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue());
        sb2.append(", proxy=");
        sb2.append((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 250524162, -250524162, System.identityHashCode(ypVar2)));
        sb2.append(" hostAddress=");
        sb2.append((InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, -1865027862, 1865027863, System.identityHashCode(ypVar2)));
        sb2.append(" cipherSuite=");
        yf yfVar = ziVar.f62365d;
        Object obj = "none";
        if (yfVar == null) {
            int i10 = f62360q + 69;
            f62361r = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } else {
            xt xtVar = (xt) yf.setX(new Object[]{yfVar}, -718834590, 718834594, System.identityHashCode(yfVar));
            if (xtVar == null) {
                int i11 = f62361r;
                int i12 = ((i11 & 34) + (i11 | 34)) - 1;
                f62360q = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            } else {
                obj = xtVar;
            }
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(ziVar.f62366e);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        int i13 = f62360q + 73;
        f62361r = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }

    public static /* synthetic */ void g(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        zi ziVar = (zi) objArr[0];
        int i10 = f62360q;
        int i11 = ((i10 | 39) << 1) - (i10 ^ 39);
        f62361r = i11 % 128;
        if (i11 % 2 == 0) {
            Socket socket = ziVar.f62363b;
            throw null;
        }
        Socket socket2 = ziVar.f62363b;
        if (socket2 == null) {
            int i12 = i10 + 73;
            f62361r = i12 % 128;
            int i13 = i12 % 2;
        } else {
            yt.setX(socket2);
            int i14 = f62360q;
            int i15 = ((i14 & 70) + (i14 | 70)) - 1;
            f62361r = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x030d, code lost:
    
        if (r2.f62363b != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0312, code lost:
    
        if (r2.f62363b != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0321, code lost:
    
        throw new com.mypinpad.tsdk.isolation.zp(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(java.lang.Object[] r24) throws java.security.NoSuchAlgorithmException, java.io.IOException, java.lang.CloneNotSupportedException {
        /*
            Method dump skipped, instruction units count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zi.h(java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01a8, code lost:
    
        if (((java.lang.Boolean) setY(r4, 2049008521, -2049008520, java.lang.System.identityHashCode(r1))).booleanValue() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c1, code lost:
    
        if ((!((java.lang.Boolean) setY(new java.lang.Object[]{r1, r5}, 2049008521, -2049008520, java.lang.System.identityHashCode(r1))).booleanValue()) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01db, code lost:
    
        if (((javax.net.ssl.HostnameVerifier) com.mypinpad.tsdk.isolation.xh.setOnFocusChangeListener(new java.lang.Object[]{r3}, 1375506037, -1375506036, java.lang.System.identityHashCode(r3))) == com.mypinpad.tsdk.isolation.abs.INSTANCE) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01dd, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.zi.f62361r;
        r3 = r1 & 49;
        r1 = -(-(r1 | 49));
        r4 = (r3 ^ r1) + ((r1 & r3) << 1);
        com.mypinpad.tsdk.isolation.zi.f62360q = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f0, code lost:
    
        if ((r4 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f2, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f7, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0222, code lost:
    
        if ((!((java.lang.Boolean) setY(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.yg) com.mypinpad.tsdk.isolation.xh.setOnFocusChangeListener(new java.lang.Object[]{r3}, -66216281, 66216289, java.lang.System.identityHashCode(r3))}, -2088067202, 2088067208, java.lang.System.identityHashCode(r1))).booleanValue()) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0224, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.zi.f62361r;
        r1 = (r0 & (-56)) | ((~r0) & 55);
        r0 = -(-((r0 & 55) << 1));
        r3 = (r1 ^ r0) + ((r0 & r1) << 1);
        r0 = r3 % 128;
        com.mypinpad.tsdk.isolation.zi.f62360q = r0;
        r3 = r3 % 2;
        r2 = r0 & 9;
        r2 = r2 + ((r0 ^ 9) | r2);
        com.mypinpad.tsdk.isolation.zi.f62361r = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0249, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024a, code lost:
    
        r4 = (com.mypinpad.tsdk.isolation.xn) com.mypinpad.tsdk.isolation.xh.setOnFocusChangeListener(new java.lang.Object[]{r3}, 2008107448, -2008107444, java.lang.System.identityHashCode(r3));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r4);
        r3 = (com.mypinpad.tsdk.isolation.yg) com.mypinpad.tsdk.isolation.xh.setOnFocusChangeListener(new java.lang.Object[]{r3}, -66216281, 66216289, java.lang.System.identityHashCode(r3));
        r3 = (java.lang.String) com.mypinpad.tsdk.isolation.yg.setOnFocusChangeListener(new java.lang.Object[]{r3}, -1565741557, 1565741570, java.lang.System.identityHashCode(r3));
        r1 = (com.mypinpad.tsdk.isolation.yf) setY(new java.lang.Object[]{r1}, 785018576, -785018561, java.lang.System.identityHashCode(r1));
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1);
        com.mypinpad.tsdk.isolation.xn.setDividerPadding(new java.lang.Object[]{r4, r3, (java.util.List) com.mypinpad.tsdk.isolation.yf.setX(new java.lang.Object[]{r1}, 937432037, -937432031, java.lang.System.identityHashCode(r1))}, 1032966311, -1032966310, java.lang.System.identityHashCode(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02bf, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.zi.f62360q;
        r5 = ~r1;
        r3 = ((((r1 ^ 25) | (r1 & 25)) << 1) - (~(-((r1 & (-26)) | (25 & r5))))) - 1;
        com.mypinpad.tsdk.isolation.zi.f62361r = r3 % 128;
        r3 = r3 % 2;
        r3 = ((r1 & (-38)) | (r5 & 37)) + ((r1 & 37) << 1);
        r1 = r3 % 128;
        com.mypinpad.tsdk.isolation.zi.f62361r = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e7, code lost:
    
        if ((r3 % 2) != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02e9, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02eb, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02ec, code lost:
    
        r4 = ((r1 & 70) + (r1 | 70)) - 1;
        com.mypinpad.tsdk.isolation.zi.f62360q = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02f8, code lost:
    
        if ((r4 % 2) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02fa, code lost:
    
        r1 = 82 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0301, code lost:
    
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0306, code lost:
    
        return java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0309, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean i(java.lang.Object[] r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zi.i(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Boolean j(Object[] objArr) {
        long jLongValue;
        zi ziVar = (zi) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        if (yt.setOnFocusChangeListener && Thread.holdsLock(ziVar)) {
            StringBuilder sb2 = new StringBuilder("Thread ");
            sb2.append((Object) Thread.currentThread().getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(ziVar);
            throw new AssertionError(sb2.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = ziVar.f62363b;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = ziVar.f62364c;
        Intrinsics.checkNotNull(socket2);
        aby abyVar = ziVar.f62368g;
        Intrinsics.checkNotNull(abyVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return Boolean.FALSE;
        }
        aah aahVar = ziVar.f62367f;
        if (aahVar != null) {
            return Boolean.valueOf(aahVar.setY(jNanoTime));
        }
        synchronized (ziVar) {
            jLongValue = jNanoTime - ((Long) setY(new Object[]{ziVar}, 1566663103, -1566663076, System.identityHashCode(ziVar))).longValue();
        }
        return (jLongValue < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !zBooleanValue) ? Boolean.TRUE : Boolean.valueOf(yt.setX(socket2, abyVar));
    }

    public static /* synthetic */ void k(Object[] objArr) throws Throwable {
        SSLSocket sSLSocket;
        SSLSocket sSLSocket2;
        String x4;
        yi yiVar;
        zi ziVar = (zi) objArr[0];
        zf zfVar = (zf) objArr[1];
        int i10 = f62361r;
        int i11 = ((i10 & (-26)) | ((~i10) & 25)) + ((i10 & 25) << 1);
        f62360q = i11 % 128;
        int i12 = i11 % 2;
        yp ypVar = ziVar.f62362a;
        xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
        SSLSocketFactory sSLSocketFactory = (SSLSocketFactory) xh.setOnFocusChangeListener(new Object[]{xhVar}, -458389256, 458389268, System.identityHashCode(xhVar));
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = ziVar.f62363b;
            yg ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
            String str = (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar));
            yg ygVar2 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, str, ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue(), true);
            if (socketCreateSocket != null) {
                SSLSocket sSLSocket3 = (SSLSocket) socketCreateSocket;
                try {
                    xu xuVar = (xu) zf.setDividerPadding(new Object[]{zfVar, sSLSocket3}, -92737339, 92737340, System.identityHashCode(zfVar));
                    if (((Boolean) xu.setX(new Object[]{xuVar}, 1501770906, -1501770896, System.identityHashCode(xuVar))).booleanValue()) {
                        int i13 = f62360q;
                        int i14 = i13 & 55;
                        int i15 = -(-(i13 | 55));
                        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                        f62361r = i16 % 128;
                        int i17 = i16 % 2;
                        aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                        aaw aawVar = (aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis());
                        yg ygVar3 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
                        aawVar.setX(sSLSocket3, (String) yg.setOnFocusChangeListener(new Object[]{ygVar3}, -1565741557, 1565741570, System.identityHashCode(ygVar3)), (List) xh.setOnFocusChangeListener(new Object[]{xhVar}, -2119012112, 2119012112, System.identityHashCode(xhVar)));
                        int i18 = f62360q;
                        int i19 = ((i18 & (-36)) | ((~i18) & 35)) + ((i18 & 35) << 1);
                        f62361r = i19 % 128;
                        int i20 = i19 % 2;
                    }
                    sSLSocket3.startHandshake();
                    SSLSession session = sSLSocket3.getSession();
                    yf.Companion companion = yf.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(session, "");
                    yf yfVar = (yf) yf.Companion.setY(new Object[]{session}, -1237640709, 1237640709, (int) System.currentTimeMillis());
                    HostnameVerifier hostnameVerifier = (HostnameVerifier) xh.setOnFocusChangeListener(new Object[]{xhVar}, 1375506037, -1375506036, System.identityHashCode(xhVar));
                    Intrinsics.checkNotNull(hostnameVerifier);
                    yg ygVar4 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
                    if (!hostnameVerifier.verify((String) yg.setOnFocusChangeListener(new Object[]{ygVar4}, -1565741557, 1565741570, System.identityHashCode(ygVar4)), session)) {
                        int i21 = f62360q;
                        int i22 = i21 & 95;
                        int i23 = (((i21 ^ 95) | i22) << 1) - ((i21 | 95) & (~i22));
                        f62361r = i23 % 128;
                        int i24 = i23 % 2;
                        List list = (List) yf.setX(new Object[]{yfVar}, 937432037, -937432031, System.identityHashCode(yfVar));
                        if (list.isEmpty()) {
                            int i25 = f62361r + 55;
                            f62360q = i25 % 128;
                            int i26 = i25 % 2;
                        } else {
                            int i27 = f62360q;
                            int i28 = i27 & 67;
                            int i29 = ((((i27 ^ 67) | i28) << 1) - (~(-((i27 | 67) & (~i28))))) - 1;
                            f62361r = i29 % 128;
                            if (!(i29 % 2 == 0)) {
                                X509Certificate x509Certificate = (X509Certificate) list.get(0);
                                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                                sb2.append(xhVar.setNavigationOnClickListener().setX());
                                sb2.append(" not verified:\n              |    certificate: ");
                                xn.Companion companion2 = xn.INSTANCE;
                                sb2.append((String) xn.Companion.setCompoundDrawableTintBlendMode(new Object[]{x509Certificate}, -541422531, 541422531, (int) System.currentTimeMillis()));
                                sb2.append("\n              |    DN: ");
                                sb2.append((Object) x509Certificate.getSubjectDN().getName());
                                sb2.append("\n              |    subjectAltNames: ");
                                sb2.append(abs.setOnFocusChangeListener(x509Certificate));
                                sb2.append("\n              ");
                                throw new SSLPeerUnverifiedException(e.trimMargin$default(sb2.toString(), null, 1, null));
                            }
                        }
                        StringBuilder sb3 = new StringBuilder("Hostname ");
                        sb3.append(xhVar.setNavigationOnClickListener().setX());
                        sb3.append(" not verified (no certificates)");
                        throw new SSLPeerUnverifiedException(sb3.toString());
                    }
                    xn xnVar = (xn) xh.setOnFocusChangeListener(new Object[]{xhVar}, 2008107448, -2008107444, System.identityHashCode(xhVar));
                    Intrinsics.checkNotNull(xnVar);
                    ziVar.f62365d = new yf(yfVar.setCompoundDrawableTintBlendMode(), yfVar.setY(), yfVar.setOnFocusChangeListener(), new h10(xnVar, yfVar, xhVar));
                    yg ygVar5 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
                    xn.setDividerPadding(new Object[]{xnVar, (String) yg.setOnFocusChangeListener(new Object[]{ygVar5}, -1565741557, 1565741570, System.identityHashCode(ygVar5)), new i10(ziVar)}, -293371689, 293371694, System.identityHashCode(xnVar));
                    if (((Boolean) xu.setX(new Object[]{xuVar}, 1501770906, -1501770896, System.identityHashCode(xuVar))).booleanValue()) {
                        int i30 = f62360q;
                        int i31 = (i30 & 115) + (i30 | 115);
                        f62361r = i31 % 128;
                        int i32 = i31 % 2;
                        aaw.setOnFocusChangeListener setonfocuschangelistener2 = aaw.setCompoundDrawableTintBlendMode;
                        x4 = ((aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis())).setX(sSLSocket3);
                        int i33 = f62361r;
                        int i34 = ((i33 & (-90)) | ((~i33) & 89)) + ((i33 & 89) << 1);
                        f62360q = i34 % 128;
                        int i35 = i34 % 2;
                    } else {
                        int i36 = f62360q;
                        int i37 = ((i36 & (-50)) | ((~i36) & 49)) + ((i36 & 49) << 1);
                        f62361r = i37 % 128;
                        int i38 = i37 % 2;
                        x4 = null;
                    }
                    ziVar.f62364c = sSLSocket3;
                    ziVar.f62368g = (aby) ach.setOnFocusChangeListener(new Object[]{(acp) ach.setOnFocusChangeListener(new Object[]{sSLSocket3}, -1701685100, 1701685103, (int) System.currentTimeMillis())}, -878740537, 878740541, (int) System.currentTimeMillis());
                    ziVar.f62369h = (abv) ach.setOnFocusChangeListener(new Object[]{(aco) ach.setOnFocusChangeListener(new Object[]{sSLSocket3}, -85046677, 85046677, (int) System.currentTimeMillis())}, -678282231, 678282232, (int) System.currentTimeMillis());
                    if (x4 != null) {
                        int i39 = f62361r;
                        int i40 = ((i39 | 93) << 1) - (i39 ^ 93);
                        f62360q = i40 % 128;
                        int i41 = i40 % 2;
                        yi.Companion companion3 = yi.INSTANCE;
                        yiVar = (yi) yi.Companion.setCompoundDrawableTintBlendMode(new Object[]{x4}, -661410454, 661410454, (int) System.currentTimeMillis());
                        System.identityHashCode(ziVar);
                        System.identityHashCode(ziVar);
                    } else {
                        yiVar = yi.setOnFocusChangeListener;
                        int i42 = f62361r + 109;
                        f62360q = i42 % 128;
                        int i43 = i42 % 2;
                    }
                    ziVar.f62366e = yiVar;
                    aaw.setOnFocusChangeListener setonfocuschangelistener3 = aaw.setCompoundDrawableTintBlendMode;
                    ((aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(sSLSocket3);
                    int i44 = f62360q;
                    int i45 = i44 ^ 87;
                    int i46 = (((i44 & 87) | i45) << 1) - i45;
                    f62361r = i46 % 128;
                    int i47 = i46 % 2;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket2 = sSLSocket3;
                }
            } else {
                sSLSocket = null;
                try {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            sSLSocket = null;
        }
        sSLSocket2 = sSLSocket;
        if (sSLSocket2 != null) {
            aaw.setOnFocusChangeListener setonfocuschangelistener4 = aaw.setCompoundDrawableTintBlendMode;
            ((aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(sSLSocket2);
            int i48 = f62361r;
            int i49 = i48 | 121;
            int i50 = (i49 << 1) - ((~(i48 & 121)) & i49);
            f62360q = i50 % 128;
            int i51 = i50 % 2;
        }
        if (sSLSocket2 == null) {
            int i52 = f62360q;
            int i53 = i52 + 3;
            f62361r = i53 % 128;
            int i54 = i53 % 2;
            int i55 = (((i52 | 85) << 1) - (~(-(((~i52) & 85) | (i52 & (-86)))))) - 1;
            f62361r = i55 % 128;
            int i56 = i55 % 2;
        } else {
            yt.setX(sSLSocket2);
            int i57 = f62361r;
            int i58 = (i57 | 81) << 1;
            int i59 = -(i57 ^ 81);
            int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
            f62360q = i60 % 128;
            int i61 = i60 % 2;
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:30:0x011f  */
    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0193  */
    public static /* synthetic */ Boolean l(Object[] objArr) throws Throwable {
        yf yfVar;
        int i10;
        zi ziVar = (zi) objArr[0];
        yg ygVar = (yg) objArr[1];
        int i11 = f62360q;
        int i12 = i11 & 85;
        int i13 = ((i11 ^ 85) | i12) << 1;
        int i14 = -((i11 | 85) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f62361r = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 0 / 0;
            if (yt.setOnFocusChangeListener) {
                i10 = f62361r + 5;
                f62360q = i10 % 128;
                if (i10 % 2 == 0) {
                    Thread.holdsLock(ziVar);
                    throw null;
                }
                if (!Thread.holdsLock(ziVar)) {
                    StringBuilder sb2 = new StringBuilder("Thread ");
                    sb2.append((Object) Thread.currentThread().getName());
                    sb2.append(" MUST hold lock on ");
                    sb2.append(ziVar);
                    throw new AssertionError(sb2.toString());
                }
            }
        } else if (!(!yt.setOnFocusChangeListener)) {
            i10 = f62361r + 5;
            f62360q = i10 % 128;
            if (i10 % 2 == 0) {
                Thread.holdsLock(ziVar);
                throw null;
            }
            if (!Thread.holdsLock(ziVar)) {
                StringBuilder sb3 = new StringBuilder("Thread ");
                sb3.append((Object) Thread.currentThread().getName());
                sb3.append(" MUST hold lock on ");
                sb3.append(ziVar);
                throw new AssertionError(sb3.toString());
            }
        }
        yp ypVar = ziVar.f62362a;
        xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
        yg ygVar2 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
        if (((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue() != ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue()) {
            int i17 = f62361r + 41;
            int i18 = i17 % 128;
            f62360q = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 27;
            int i21 = (i18 | 27) & (~i20);
            int i22 = i20 << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f62361r = i23 % 128;
            int i24 = i23 % 2;
            return Boolean.FALSE;
        }
        if (!(!Intrinsics.areEqual((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2))))) {
            int i25 = f62360q;
            int i26 = i25 + 121;
            f62361r = i26 % 128;
            int i27 = i26 % 2;
            int i28 = (-2) - (((i25 ^ 66) + ((i25 & 66) << 1)) ^ (-1));
            f62361r = i28 % 128;
            if (i28 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (!ziVar.f62371j) {
            int i29 = f62361r;
            int i30 = i29 & 123;
            int i31 = i30 + ((i29 ^ 123) | i30);
            f62360q = i31 % 128;
            int i32 = i31 % 2;
            yf yfVar2 = ziVar.f62365d;
            if (i32 != 0) {
                int i33 = 48 / 0;
                if (yfVar2 != null) {
                    yfVar = ziVar.f62365d;
                    Intrinsics.checkNotNull(yfVar);
                    if (!(!((Boolean) setY(new Object[]{ygVar, yfVar}, -1795281425, 1795281425, (int) System.currentTimeMillis())).booleanValue())) {
                        int i34 = f62361r;
                        int i35 = i34 & 41;
                        int i36 = ((i34 ^ 41) | i35) << 1;
                        int i37 = -((i34 | 41) & (~i35));
                        int i38 = (i36 & i37) + (i37 | i36);
                        f62360q = i38 % 128;
                        int i39 = i38 % 2;
                        return Boolean.TRUE;
                    }
                }
            } else if (yfVar2 != null) {
                yfVar = ziVar.f62365d;
                Intrinsics.checkNotNull(yfVar);
                if (!(!((Boolean) setY(new Object[]{ygVar, yfVar}, -1795281425, 1795281425, (int) System.currentTimeMillis())).booleanValue())) {
                    int i310 = f62361r;
                    int i311 = i310 & 41;
                    int i312 = ((i310 ^ 41) | i311) << 1;
                    int i313 = -((i310 | 41) & (~i311));
                    int i314 = (i312 & i313) + (i313 | i312);
                    f62360q = i314 % 128;
                    int i315 = i314 % 2;
                    return Boolean.TRUE;
                }
            }
        }
        int i40 = f62360q;
        int i41 = i40 ^ 107;
        int i42 = -(-((i40 & 107) << 1));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        f62361r = i43 % 128;
        if (i43 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ zu m(Object[] objArr) throws Throwable {
        zi ziVar = (zi) objArr[0];
        ym ymVar = (ym) objArr[1];
        zs zsVar = (zs) objArr[2];
        int i10 = f62360q;
        int i11 = ((i10 & 115) - (~(-(-(i10 | 115))))) - 1;
        f62361r = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(ymVar, "");
        Intrinsics.checkNotNullParameter(zsVar, "");
        Socket socket = ziVar.f62364c;
        Intrinsics.checkNotNull(socket);
        aby abyVar = ziVar.f62368g;
        Intrinsics.checkNotNull(abyVar);
        abv abvVar = ziVar.f62369h;
        Intrinsics.checkNotNull(abvVar);
        aah aahVar = ziVar.f62367f;
        if (aahVar != null) {
            aaj aajVar = new aaj(ymVar, ziVar, zsVar, aahVar);
            int i13 = f62361r;
            int i14 = i13 & 77;
            int i15 = (i13 ^ 77) | i14;
            int i16 = (i14 & i15) + (i15 | i14);
            f62360q = i16 % 128;
            int i17 = i16 % 2;
            return aajVar;
        }
        socket.setSoTimeout(((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -579721864, 579721874, System.identityHashCode(zsVar))).intValue());
        acq y7 = abyVar.setY();
        long jIntValue = ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -71337801, 71337801, System.identityHashCode(zsVar))).intValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y7.setOnFocusChangeListener(jIntValue, timeUnit);
        abvVar.setY().setOnFocusChangeListener(((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, 1387657808, -1387657796, System.identityHashCode(zsVar))).intValue(), timeUnit);
        zw zwVar = new zw(ymVar, ziVar, abyVar, abvVar);
        int i18 = f62360q;
        int i19 = i18 & 29;
        int i20 = i18 | 29;
        int i21 = (i19 & i20) + (i20 | i19);
        f62361r = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 47 / 0;
        }
        return zwVar;
    }

    public static /* synthetic */ void n(Object[] objArr) throws Throwable {
        zi ziVar = (zi) objArr[0];
        zf zfVar = (zf) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        xp xpVar = (xp) objArr[3];
        yd ydVar = (yd) objArr[4];
        int i10 = f62360q + 85;
        f62361r = i10 % 128;
        int i11 = i10 % 2;
        yp ypVar = ziVar.f62362a;
        xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
        if (((SSLSocketFactory) xh.setOnFocusChangeListener(new Object[]{xhVar}, -458389256, 458389268, System.identityHashCode(xhVar))) != null) {
            yd.setCompoundDrawableTintBlendMode(new Object[]{xpVar}, -26706738, 26706752, (int) System.currentTimeMillis());
            setY(new Object[]{ziVar, zfVar}, 849964962, -849964942, System.identityHashCode(ziVar));
            ydVar.setDividerPadding(xpVar, ziVar.f62365d);
            if (ziVar.f62366e == yi.setY) {
                int i12 = f62361r;
                int i13 = ((i12 & 122) + (i12 | 122)) - 1;
                f62360q = i13 % 128;
                int i14 = i13 % 2;
                setY(new Object[]{ziVar, Integer.valueOf(iIntValue)}, 45432254, -45432252, iIntValue);
                int i15 = f62360q + 55;
                f62361r = i15 % 128;
                int i16 = i15 % 2;
            }
            int i17 = f62361r;
            int i18 = i17 & 117;
            int i19 = -(-((i17 ^ 117) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            f62360q = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 87 / 0;
                return;
            }
            return;
        }
        int i22 = f62360q;
        int i23 = i22 ^ 87;
        int i24 = (i22 & 87) << 1;
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        f62361r = i25 % 128;
        int i26 = i25 % 2;
        yp ypVar2 = ziVar.f62362a;
        if (i26 == 0) {
            xh xhVar2 = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
            ((List) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -2119012112, 2119012112, System.identityHashCode(xhVar2))).contains(yi.setLayoutAnimation);
            throw null;
        }
        xh xhVar3 = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
        List list = (List) xh.setOnFocusChangeListener(new Object[]{xhVar3}, -2119012112, 2119012112, System.identityHashCode(xhVar3));
        yi yiVar = yi.setLayoutAnimation;
        if (!list.contains(yiVar)) {
            ziVar.f62364c = ziVar.f62363b;
            ziVar.f62366e = yi.setOnFocusChangeListener;
            int i27 = f62361r + 22;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            f62360q = i28 % 128;
            if (i28 % 2 != 0) {
                throw null;
            }
            return;
        }
        ziVar.f62364c = ziVar.f62363b;
        ziVar.f62366e = yiVar;
        setY(new Object[]{ziVar, Integer.valueOf(iIntValue)}, 45432254, -45432252, iIntValue);
        int i29 = f62361r;
        int i30 = ((((i29 ^ 103) | (i29 & 103)) << 1) - (~(-(((~i29) & 103) | (i29 & (-104)))))) - 1;
        f62360q = i30 % 128;
        int i31 = i30 % 2;
    }

    public static /* synthetic */ Socket o(Object[] objArr) {
        zi ziVar = (zi) objArr[0];
        int i10 = f62361r;
        int i11 = i10 ^ 5;
        int i12 = ((i10 & 5) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f62360q = i14 % 128;
        int i15 = i14 % 2;
        Socket socket = ziVar.f62364c;
        Intrinsics.checkNotNull(socket);
        int i16 = f62360q + 49;
        f62361r = i16 % 128;
        if (i16 % 2 != 0) {
            return socket;
        }
        throw null;
    }

    public static /* synthetic */ Boolean p(Object[] objArr) {
        zi ziVar = (zi) objArr[0];
        int i10 = f62361r;
        int i11 = i10 & 123;
        int i12 = (i10 ^ 123) | i11;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        int i14 = i13 % 128;
        f62360q = i14;
        int i15 = i13 % 2;
        aah aahVar = ziVar.f62367f;
        if (i15 != 0) {
            throw null;
        }
        if (aahVar != null) {
            int i16 = i10 & 109;
            int i17 = (i10 | 109) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f62360q = i19 % 128;
            return Boolean.valueOf(i19 % 2 == 0);
        }
        int i20 = i14 + 69;
        f62361r = i20 % 128;
        if (i20 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i21 = 7 / 0;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006f  */
    /* JADX WARN: Code duplicated, block: B:13:0x008b  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:23:0x0126  */
    /* JADX WARN: Code duplicated, block: B:25:0x0129  */
    /* JADX WARN: Code duplicated, block: B:34:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:7:0x004e->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0055  */
    public static /* synthetic */ Boolean q(Object[] objArr) {
        Iterator it;
        int i10;
        yp ypVar;
        Proxy.Type type;
        Proxy.Type type2;
        boolean z10;
        int i11;
        yp ypVar2;
        yp ypVar3;
        zi ziVar = (zi) objArr[0];
        List list = (List) objArr[1];
        int i12 = f62360q;
        int i13 = i12 + 81;
        f62361r = i13 % 128;
        int i14 = i13 % 2;
        List list2 = list;
        if (list2 instanceof Collection) {
            int i15 = i12 & 103;
            int i16 = -(-(i12 | 103));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f62361r = i17 % 128;
            int i18 = i17 % 2;
            if (!list2.isEmpty()) {
                it = list2.iterator();
                int i19 = f62360q;
                int i20 = i19 & 73;
                int i21 = (i19 | 73) & (~i20);
                int i22 = -(-(i20 << 1));
                int i23 = (i21 & i22) + (i21 | i22);
                f62361r = i23 % 128;
                int i24 = i23 % 2;
                while (!(!it.hasNext())) {
                    int i25 = f62360q;
                    int i26 = ((i25 | 12) << 1) - (i25 ^ 12);
                    i10 = (i26 ^ (-1)) + (i26 << 1);
                    f62361r = i10 % 128;
                    if (i10 % 2 != 0) {
                        yp ypVar4 = (yp) it.next();
                        ((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar4}, 250524162, -250524162, System.identityHashCode(ypVar4))).type();
                        Proxy.Type type3 = Proxy.Type.DIRECT;
                        throw null;
                    }
                    ypVar = (yp) it.next();
                    type = ((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar))).type();
                    type2 = Proxy.Type.DIRECT;
                    if (type == type2) {
                        ypVar2 = ziVar.f62362a;
                        if (((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 250524162, -250524162, System.identityHashCode(ypVar2))).type() == type2) {
                            int i27 = f62360q;
                            int i28 = (i27 & 13) + (i27 | 13);
                            f62361r = i28 % 128;
                            int i29 = i28 % 2;
                            ypVar3 = ziVar.f62362a;
                            if (Intrinsics.areEqual((InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar3}, -1865027862, 1865027863, System.identityHashCode(ypVar3)), (InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, -1865027862, 1865027863, System.identityHashCode(ypVar)))) {
                                int i30 = f62361r;
                                int i31 = ((i30 | 82) << 1) - (i30 ^ 82);
                                int i32 = (i31 ^ (-1)) + (i31 << 1);
                                f62360q = i32 % 128;
                                int i33 = i32 % 2;
                                int i34 = i30 + 121;
                                f62360q = i34 % 128;
                                int i35 = i34 % 2;
                                z10 = true;
                            } else {
                                int i36 = f62361r;
                                int i37 = i36 | 101;
                                int i38 = i37 << 1;
                                int i39 = -((~(i36 & 101)) & i37);
                                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                                f62360q = i40 % 128;
                                int i41 = i40 % 2;
                                z10 = false;
                            }
                        } else {
                            int i310 = f62361r;
                            int i311 = i310 | 101;
                            int i312 = i311 << 1;
                            int i313 = -((~(i310 & 101)) & i311);
                            int i42 = (i312 ^ i313) + ((i313 & i312) << 1);
                            f62360q = i42 % 128;
                            int i43 = i42 % 2;
                            z10 = false;
                        }
                    } else {
                        int i314 = f62361r;
                        int i315 = i314 | 101;
                        int i316 = i315 << 1;
                        int i317 = -((~(i314 & 101)) & i315);
                        int i44 = (i316 ^ i317) + ((i317 & i316) << 1);
                        f62360q = i44 % 128;
                        int i45 = i44 % 2;
                        z10 = false;
                    }
                    if (!(!z10)) {
                        int i46 = f62360q;
                        int i47 = ((i46 | 75) << 1) - (i46 ^ 75);
                        int i48 = i47 % 128;
                        f62361r = i48;
                        int i49 = i47 % 2;
                        i11 = i48 + 121;
                        f62360q = i11 % 128;
                        if (i11 % 2 == 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                }
            }
        } else {
            it = list2.iterator();
            int i110 = f62360q;
            int i210 = i110 & 73;
            int i211 = (i110 | 73) & (~i210);
            int i212 = -(-(i210 << 1));
            int i213 = (i211 & i212) + (i211 | i212);
            f62361r = i213 % 128;
            int i214 = i213 % 2;
            while (!(!it.hasNext())) {
                int i215 = f62360q;
                int i216 = ((i215 | 12) << 1) - (i215 ^ 12);
                i10 = (i216 ^ (-1)) + (i216 << 1);
                f62361r = i10 % 128;
                if (i10 % 2 != 0) {
                    yp ypVar5 = (yp) it.next();
                    ((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar5}, 250524162, -250524162, System.identityHashCode(ypVar5))).type();
                    Proxy.Type type4 = Proxy.Type.DIRECT;
                    throw null;
                }
                ypVar = (yp) it.next();
                type = ((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar))).type();
                type2 = Proxy.Type.DIRECT;
                if (type == type2) {
                    ypVar2 = ziVar.f62362a;
                    if (((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 250524162, -250524162, System.identityHashCode(ypVar2))).type() == type2) {
                        int i217 = f62360q;
                        int i218 = (i217 & 13) + (i217 | 13);
                        f62361r = i218 % 128;
                        int i219 = i218 % 2;
                        ypVar3 = ziVar.f62362a;
                        if (Intrinsics.areEqual((InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar3}, -1865027862, 1865027863, System.identityHashCode(ypVar3)), (InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, -1865027862, 1865027863, System.identityHashCode(ypVar)))) {
                            int i318 = f62361r;
                            int i319 = ((i318 | 82) << 1) - (i318 ^ 82);
                            int i320 = (i319 ^ (-1)) + (i319 << 1);
                            f62360q = i320 % 128;
                            int i321 = i320 % 2;
                            int i322 = i318 + 121;
                            f62360q = i322 % 128;
                            int i323 = i322 % 2;
                            z10 = true;
                        } else {
                            int i3110 = f62361r;
                            int i3111 = i3110 | 101;
                            int i3112 = i3111 << 1;
                            int i3113 = -((~(i3110 & 101)) & i3111);
                            int i410 = (i3112 ^ i3113) + ((i3113 & i3112) << 1);
                            f62360q = i410 % 128;
                            int i411 = i410 % 2;
                            z10 = false;
                        }
                    } else {
                        int i3114 = f62361r;
                        int i3115 = i3114 | 101;
                        int i3116 = i3115 << 1;
                        int i3117 = -((~(i3114 & 101)) & i3115);
                        int i412 = (i3116 ^ i3117) + ((i3117 & i3116) << 1);
                        f62360q = i412 % 128;
                        int i413 = i412 % 2;
                        z10 = false;
                    }
                } else {
                    int i3118 = f62361r;
                    int i3119 = i3118 | 101;
                    int i31110 = i3119 << 1;
                    int i31111 = -((~(i3118 & 101)) & i3119);
                    int i414 = (i31110 ^ i31111) + ((i31111 & i31110) << 1);
                    f62360q = i414 % 128;
                    int i415 = i414 % 2;
                    z10 = false;
                }
                if (!(!z10)) {
                    int i416 = f62360q;
                    int i417 = ((i416 | 75) << 1) - (i416 ^ 75);
                    int i418 = i417 % 128;
                    f62361r = i418;
                    int i419 = i417 % 2;
                    i11 = i418 + 121;
                    f62360q = i11 % 128;
                    if (i11 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
            }
        }
        int i50 = f62361r;
        int i51 = i50 | 49;
        int i52 = (i51 << 1) - ((~(i50 & 49)) & i51);
        f62360q = i52 % 128;
        if (i52 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ void r(Object[] objArr) {
        aak aakVar = (aak) objArr[1];
        int i10 = f62360q + 95;
        f62361r = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aakVar, "");
            aak.setOnFocusChangeListener(new Object[]{aakVar, aac.REFUSED_STREAM, null}, 1944285140, -1944285130, System.identityHashCode(aakVar));
        } else {
            Intrinsics.checkNotNullParameter(aakVar, "");
            aak.setOnFocusChangeListener(new Object[]{aakVar, aac.REFUSED_STREAM, null}, 1944285140, -1944285130, System.identityHashCode(aakVar));
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:19:0x010a  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13;
        Object objValueOf;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i11 | i14;
        int i17 = 21;
        int i18 = 4;
        int i19 = 2;
        switch ((((~(i10 | i15)) | (~i16)) * 752) + ((~(i16 | i12)) * (-1504)) + (((~(i14 | i15)) | (~(i14 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751))) {
            case 1:
                return q(objArr);
            case 2:
                zi ziVar = (zi) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                Socket socket = ziVar.f62364c;
                Intrinsics.checkNotNull(socket);
                aby abyVar = ziVar.f62368g;
                Intrinsics.checkNotNull(abyVar);
                abv abvVar = ziVar.f62369h;
                Intrinsics.checkNotNull(abvVar);
                socket.setSoTimeout(0);
                aah.setOnFocusChangeListener setonfocuschangelistener = new aah.setOnFocusChangeListener(zd.setY);
                yp ypVar = ziVar.f62362a;
                xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
                yg ygVar = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar));
                aah.setOnFocusChangeListener setonfocuschangelistener2 = (aah.setOnFocusChangeListener) aah.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener, socket, (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)), abyVar, abvVar}, -2143266549, 2143266552, System.identityHashCode(setonfocuschangelistener));
                aah.setOnFocusChangeListener setonfocuschangelistener3 = (aah.setOnFocusChangeListener) aah.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{(aah.setOnFocusChangeListener) aah.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener2, ziVar}, 1187807895, -1187807888, System.identityHashCode(setonfocuschangelistener2)), Integer.valueOf(iIntValue)}, -1320113601, 1320113605, iIntValue);
                aah aahVar = (aah) aah.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener3}, -127846421, 127846438, System.identityHashCode(setonfocuschangelistener3));
                ziVar.f62367f = aahVar;
                aah.setY sety = aah.setX;
                aam aamVar = (aam) aah.setY.setDividerPadding(new Object[0], 791613011, -791613011, (int) System.currentTimeMillis());
                ziVar.f62374n = ((Integer) aam.setOnFocusChangeListener(new Object[]{aamVar}, 1983088750, -1983088742, System.identityHashCode(aamVar))).intValue();
                aah.setX(new Object[]{aahVar}, -1754387471, 1754387502, (int) System.currentTimeMillis());
                int i20 = f62360q;
                int i21 = i20 & 1;
                int i22 = -(-(i20 | 1));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f62361r = i23 % 128;
                int i24 = i23 % 2;
                return null;
            case 3:
                zi ziVar2 = (zi) objArr[0];
                int i25 = f62361r;
                int i26 = i25 ^ 83;
                int i27 = ((i25 & 83) | i26) << 1;
                int i28 = -i26;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                int i30 = i29 % 128;
                f62360q = i30;
                int i31 = i29 % 2;
                yf yfVar = ziVar2.f62365d;
                int i32 = i30 & 83;
                int i33 = (i30 | 83) & (~i32);
                int i34 = -(-(i32 << 1));
                int i35 = (i33 & i34) + (i34 | i33);
                f62361r = i35 % 128;
                int i36 = i35 % 2;
                return yfVar;
            case 4:
                return p(objArr);
            case 5:
                return d(objArr);
            case 6:
                return l(objArr);
            case 7:
                return b(objArr);
            case 8:
                return m(objArr);
            case 9:
                g(objArr);
                return null;
            case 10:
                return i(objArr);
            case 11:
                return j(objArr);
            case 12:
                r(objArr);
                return null;
            case 13:
                zi ziVar3 = (zi) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i37 = f62360q + 25;
                int i38 = i37 % 128;
                f62361r = i38;
                int i39 = i37 % 2;
                ziVar3.setNavigationOnClickListener = jLongValue;
                int i40 = ((i38 | 23) << 1) - (i38 ^ 23);
                f62360q = i40 % 128;
                int i41 = i40 % 2;
                return null;
            case 14:
                return f(objArr);
            case 15:
                return a(objArr);
            case 16:
                n(objArr);
                return null;
            case 17:
                return c(objArr);
            case 18:
                return o(objArr);
            case 19:
                ym ymVar = (ym) objArr[0];
                yp ypVar2 = (yp) objArr[1];
                IOException iOException = (IOException) objArr[2];
                int i42 = f62361r;
                int i43 = (i42 & 123) + (i42 | 123);
                f62360q = i43 % 128;
                int i44 = i43 % 2;
                Intrinsics.checkNotNullParameter(ymVar, "");
                Intrinsics.checkNotNullParameter(ypVar2, "");
                Intrinsics.checkNotNullParameter(iOException, "");
                if (((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 250524162, -250524162, System.identityHashCode(ypVar2))).type() != Proxy.Type.DIRECT) {
                    int i45 = f62360q;
                    int i46 = i45 & 23;
                    int i47 = -(-((i45 ^ 23) | i46));
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    f62361r = i48 % 128;
                    int i49 = i48 % 2;
                    xh xhVar2 = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 204812250, -204812248, System.identityHashCode(ypVar2));
                    ProxySelector proxySelector = (ProxySelector) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -38007021, 38007035, System.identityHashCode(xhVar2));
                    yg ygVar2 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                    proxySelector.connectFailed((URI) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1622510043, 1622510052, System.identityHashCode(ygVar2)), ((Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar2}, 250524162, -250524162, System.identityHashCode(ypVar2))).address(), iOException);
                    int i50 = f62360q;
                    int i51 = i50 ^ 63;
                    int i52 = ((i50 & 63) | i51) << 1;
                    int i53 = -i51;
                    int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                    f62361r = i54 % 128;
                    int i55 = i54 % 2;
                }
                ((zh) ym.setY(new Object[]{ymVar}, -2038724701, 2038724726, System.identityHashCode(ymVar))).setY(ypVar2);
                int i56 = f62360q;
                int i57 = (i56 & 66) + (i56 | 66);
                int i58 = (i57 ^ (-1)) + (i57 << 1);
                f62361r = i58 % 128;
                if (i58 % 2 == 0) {
                    int i59 = 61 / 0;
                }
                return null;
            case 20:
                k(objArr);
                return null;
            case 21:
                zi ziVar4 = (zi) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int iIntValue4 = ((Number) objArr[3]).intValue();
                xp xpVar = (xp) objArr[4];
                int i60 = f62361r;
                int i61 = (-2) - (((i60 & 36) + (i60 | 36)) ^ (-1));
                f62360q = i61 % 128;
                int i62 = i61 % 2;
                yk ykVar = (yk) setY(new Object[]{ziVar4}, -1252593377, 1252593382, System.identityHashCode(ziVar4));
                yg ygVar3 = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar));
                int i63 = f62361r;
                int i64 = i63 & 13;
                int i65 = -(-((i63 ^ 13) | i64));
                int i66 = (i64 & i65) + (i65 | i64);
                f62360q = i66 % 128;
                int i67 = i66 % 2;
                int i68 = 0;
                while (i68 < i17) {
                    int i69 = f62361r;
                    int i70 = i69 & 93;
                    int i71 = i69 | 93;
                    int i72 = (i70 & i71) + (i71 | i70);
                    f62360q = i72 % 128;
                    int i73 = i72 % i19;
                    int i74 = i68 & 106;
                    int i75 = (i68 | 106) & (~i74);
                    int i76 = i74 << 1;
                    int i77 = (i75 & i76) + (i75 | i76);
                    i68 = (((i77 ^ (-105)) | (i77 & (-105))) << 1) - ((i77 & 104) | ((-105) & (~i77)));
                    Object[] objArr2 = new Object[i18];
                    objArr2[0] = ziVar4;
                    objArr2[1] = Integer.valueOf(iIntValue2);
                    objArr2[i19] = Integer.valueOf(iIntValue3);
                    objArr2[3] = xpVar;
                    setY(objArr2, 1808108894, -1808108868, iIntValue2);
                    Object[] objArr3 = new Object[5];
                    objArr3[0] = ziVar4;
                    objArr3[1] = Integer.valueOf(iIntValue3);
                    objArr3[i19] = Integer.valueOf(iIntValue4);
                    objArr3[3] = ykVar;
                    objArr3[i18] = ygVar3;
                    ykVar = (yk) setY(objArr3, -288292628, 288292645, iIntValue3);
                    if (ykVar == null) {
                        int i78 = f62361r;
                        int i79 = i78 & 63;
                        int i80 = ((i78 ^ 63) | i79) << 1;
                        int i81 = -((i78 | 63) & (~i79));
                        int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                        f62360q = i82 % 128;
                        int i83 = i82 % 2;
                        return null;
                    }
                    int i84 = f62361r;
                    int i85 = ((i84 | 57) << 1) - (i84 ^ 57);
                    f62360q = i85 % 128;
                    int i86 = i85 % i19;
                    Socket socket2 = ziVar4.f62363b;
                    if (socket2 == null) {
                        int i87 = ((i84 ^ 100) + ((i84 & 100) << 1)) - 1;
                        f62360q = i87 % 128;
                        int i88 = i87 % i19;
                        i13 = (i84 & 15) + (i84 | 15);
                        f62360q = i13 % 128;
                    } else {
                        yt.setX(socket2);
                        int i89 = f62360q;
                        int i90 = i89 & 47;
                        i13 = (i90 - (~((i89 ^ 47) | i90))) - 1;
                        f62361r = i13 % 128;
                    }
                    int i91 = i13 % i19;
                    ziVar4.f62363b = null;
                    ziVar4.f62369h = null;
                    ziVar4.f62368g = null;
                    yp ypVar3 = ziVar4.f62362a;
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar3}, -1865027862, 1865027863, System.identityHashCode(ypVar3));
                    yp ypVar4 = ziVar4.f62362a;
                    yd.setCompoundDrawableTintBlendMode(new Object[]{xpVar, inetSocketAddress, (Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar4}, 250524162, -250524162, System.identityHashCode(ypVar4))}, 1373602495, -1373602472, (int) System.currentTimeMillis());
                    int i92 = f62360q + 125;
                    f62361r = i92 % 128;
                    int i93 = i92 % 2;
                    i17 = 21;
                    i18 = 4;
                    i19 = 2;
                }
                int i710 = f62361r;
                int i711 = i710 & 63;
                int i810 = ((i710 ^ 63) | i711) << 1;
                int i811 = -((i710 | 63) & (~i711));
                int i812 = (i810 ^ i811) + ((i811 & i810) << 1);
                f62360q = i812 % 128;
                int i813 = i812 % 2;
                return null;
            case 22:
                zi ziVar5 = (zi) objArr[0];
                int i94 = f62361r;
                int i95 = (i94 ^ 103) + ((i94 & 103) << 1);
                int i96 = i95 % 128;
                f62360q = i96;
                int i97 = i95 % 2;
                int i98 = ziVar5.setZ;
                int i99 = (i96 & 65) + (i96 | 65);
                f62361r = i99 % 128;
                if (i99 % 2 != 0) {
                    return Integer.valueOf(i98);
                }
                throw null;
            case 23:
                zi ziVar6 = (zi) objArr[0];
                int i100 = f62361r;
                int i101 = i100 & 107;
                int i102 = (((i100 | 107) & (~i101)) - (~(i101 << 1))) - 1;
                f62360q = i102 % 128;
                int i103 = i102 % 2;
                objValueOf = ziVar6.f62366e;
                Intrinsics.checkNotNull(objValueOf);
                int i104 = f62361r;
                int i105 = i104 & 87;
                int i106 = i105 + ((i104 ^ 87) | i105);
                f62360q = i106 % 128;
                if (i106 % 2 != 0) {
                    throw null;
                }
                return objValueOf;
            case 24:
                zi ziVar7 = (zi) objArr[0];
                int i107 = f62361r + 56;
                int i108 = (i107 ^ (-1)) + (i107 << 1);
                int i109 = i108 % 128;
                f62360q = i109;
                int i110 = i108 % 2;
                boolean z10 = ziVar7.setLayoutAnimation;
                if (i110 != 0) {
                    throw null;
                }
                int i111 = ((i109 ^ 21) | (i109 & 21)) << 1;
                int i112 = -(((~i109) & 21) | (i109 & (-22)));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                f62361r = i113 % 128;
                if (i113 % 2 == 0) {
                    int i114 = 63 / 0;
                }
                objValueOf = Boolean.valueOf(z10);
                return objValueOf;
            case 25:
                zi ziVar8 = (zi) objArr[0];
                int i115 = f62360q;
                int i116 = i115 & 57;
                int i117 = (((i115 ^ 57) | i116) << 1) - ((i115 | 57) & (~i116));
                f62361r = i117 % 128;
                if (i117 % 2 != 0) {
                    return ziVar8.f62362a;
                }
                yp ypVar5 = ziVar8.f62362a;
                throw null;
            case 26:
                e(objArr);
                return null;
            case 27:
                zi ziVar9 = (zi) objArr[0];
                int iIdentityHashCode = System.identityHashCode(ziVar9);
                int i118 = ~iIdentityHashCode;
                int i119 = (-1229109850) & i118;
                int i120 = (~i119) & ((-1229109850) | i118);
                int i121 = ~((i119 & i120) | (i120 ^ i119));
                int i122 = ((~i121) & (-1769140939)) | (1769140938 & i121);
                int i123 = i121 & (-1769140939);
                int i124 = ((i123 & i122) | (i122 ^ i123)) * (-865);
                int i125 = ((~i124) & (-272173230)) | (272173229 & i124);
                int i126 = (i124 & (-272173230)) << 1;
                int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                int i128 = 1229109849 & i118;
                int i129 = ((-1229109850) & iIdentityHashCode) | i128;
                int i130 = iIdentityHashCode & 1229109849;
                int i131 = -(-((~((i130 & i129) | (i129 ^ i130))) * 865));
                int i132 = ((~i131) & i127) | ((~i127) & i131);
                int i133 = (i131 & i127) << 1;
                int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                int i135 = ((-1769140939) ^ i118) | ((-1769140939) & i118);
                int i136 = ~i135;
                int i137 = (i135 | i136) & i136;
                int i138 = ~((i118 ^ 1229109849) | i128);
                int i139 = -(-(((i137 & i138) | (i137 ^ i138)) * 865));
                int i140 = i134 & i139;
                int i141 = ((i134 ^ i139) | i140) << 1;
                int i142 = -((i139 | i134) & (~i140));
                int i143 = (i141 & i142) + (i142 | i141);
                int iIdentityHashCode2 = System.identityHashCode(ziVar9);
                int i144 = ~((-1993790942) | iIdentityHashCode2);
                int i145 = ((~i144) & 1087689741) | ((-1087689742) & i144);
                int i146 = i144 & 1087689741;
                int i147 = (i146 & i145) | (i145 ^ i146);
                int i148 = ~iIdentityHashCode2;
                int i149 = i148 & (-925510641);
                int i150 = i149 | ((~i149) & (i148 | (-925510641)));
                int i151 = ~((i150 & 1993790941) | (i150 ^ 1993790941));
                int i152 = ((~i151) & i147) | ((~i147) & i151);
                int i153 = i147 & i151;
                int i154 = ((i153 & i152) | (i152 ^ i153)) * 886;
                int i155 = ((~i154) & 473716450) | ((-473716451) & i154);
                int i156 = (i154 & 473716450) << 1;
                int i157 = (i155 ^ i156) + ((i156 & i155) << 1);
                int i158 = i148 & 1993790941;
                int i159 = (~i158) & (1993790941 | i148);
                int i160 = (i158 & i159) | (i159 ^ i158);
                int i161 = ~i160;
                int i162 = (i160 | i161) & i161;
                int i163 = ((~i162) & (-925510641)) | (925510640 & i162);
                int i164 = i162 & (-925510641);
                int i165 = (i157 - (~(((i164 & i163) | (i163 ^ i164)) * (-1772)))) - 1;
                int i166 = (iIdentityHashCode2 | i148) & i148;
                int i167 = -(-((~((i166 & (-925510641)) | (i166 ^ (-925510641)))) * 886));
                int i168 = (i165 ^ i167) + ((i167 & i165) << 1);
                long j10 = ziVar9.setNavigationOnClickListener;
                if (i143 <= i168) {
                    return Long.valueOf(j10);
                }
                throw null;
            case 28:
                zi ziVar10 = (zi) objArr[0];
                int i169 = f62360q;
                int i170 = (i169 ^ 109) + ((i169 & 109) << 1);
                int i171 = i170 % 128;
                f62361r = i171;
                int i172 = i170 % 2;
                ziVar10.setLayoutAnimation = true;
                int i173 = i171 & 25;
                int i174 = (i173 - (~(-(-((i171 ^ 25) | i173))))) - 1;
                f62360q = i174 % 128;
                int i175 = i174 % 2;
                return null;
            case 29:
                h(objArr);
                return null;
            default:
                yg ygVar4 = (yg) objArr[0];
                yf yfVar2 = (yf) objArr[1];
                int i176 = f62360q;
                int i177 = (i176 | 23) << 1;
                int i178 = -((i176 & (-24)) | (23 & (~i176)));
                int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                f62361r = i179 % 128;
                if (i179 % 2 == 0) {
                    ((List) yf.setX(new Object[]{yfVar2}, 937432037, -937432031, System.identityHashCode(yfVar2))).isEmpty();
                    throw null;
                }
                List list = (List) yf.setX(new Object[]{yfVar2}, 937432037, -937432031, System.identityHashCode(yfVar2));
                if (!list.isEmpty()) {
                    int i180 = f62361r;
                    int i181 = i180 & 55;
                    int i182 = (~i181) & (i180 | 55);
                    int i183 = i181 << 1;
                    int i184 = (i182 & i183) + (i183 | i182);
                    f62360q = i184 % 128;
                    int i185 = i184 % 2;
                    int i186 = i180 & 5;
                    int i187 = i186 + ((5 ^ i180) | i186);
                    f62360q = i187 % 128;
                    if (i187 % 2 != 0) {
                        abs absVar = abs.INSTANCE;
                        if (((Boolean) abs.setDividerPadding(new Object[]{absVar, (String) yg.setOnFocusChangeListener(new Object[]{ygVar4}, -1565741557, 1565741570, System.identityHashCode(ygVar4)), (X509Certificate) list.get(1)}, -1687078922, 1687078927, System.identityHashCode(absVar))).booleanValue()) {
                            int i188 = f62361r;
                            int i189 = ((i188 & 4) + (i188 | 4)) - 1;
                            f62360q = i189 % 128;
                            objValueOf = Boolean.valueOf(i189 % 2 == 0);
                        }
                    } else {
                        abs absVar2 = abs.INSTANCE;
                        if (((Boolean) abs.setDividerPadding(new Object[]{absVar2, (String) yg.setOnFocusChangeListener(new Object[]{ygVar4}, -1565741557, 1565741570, System.identityHashCode(ygVar4)), (X509Certificate) list.get(0)}, -1687078922, 1687078927, System.identityHashCode(absVar2))).booleanValue()) {
                            int i1810 = f62361r;
                            int i1811 = ((i1810 & 4) + (i1810 | 4)) - 1;
                            f62360q = i1811 % 128;
                            objValueOf = Boolean.valueOf(i1811 % 2 == 0);
                        }
                    }
                    return objValueOf;
                }
                int i190 = f62360q;
                int i191 = ((i190 ^ 63) | (i190 & 63)) << 1;
                int i192 = -(((~i190) & 63) | (i190 & (-64)));
                int i193 = (i191 ^ i192) + ((i192 & i191) << 1);
                f62361r = i193 % 128;
                int i194 = i193 % 2;
                int i195 = f62360q;
                int i196 = (((i195 | 83) << 1) - (~(-(((~i195) & 83) | (i195 & (-84)))))) - 1;
                f62361r = i196 % 128;
                if (i196 % 2 == 0) {
                    int i197 = 3 / 0;
                }
                objValueOf = Boolean.FALSE;
                return objValueOf;
        }
    }

    @NotNull
    public final Socket UiMessageCallbackKtWhenMappings() {
        return (Socket) setY(new Object[]{this}, 326996816, -326996798, System.identityHashCode(this));
    }

    @JvmName(name = "getNavBarTitleString")
    public final long getNavBarTitleString() {
        return ((Long) setY(new Object[]{this}, 1566663103, -1566663076, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.xx
    @NotNull
    public final yi setCompoundDrawableTintBlendMode() {
        return (yi) setY(new Object[]{this}, -1164987203, 1164987226, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0071 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x008b A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0098 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x009e A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ee A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0105 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0154 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0175 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x017d A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0197 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x01b3 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:3:0x0001, B:5:0x0055, B:16:0x0071, B:18:0x008b, B:46:0x0266, B:53:0x0279, B:20:0x0098, B:22:0x009e, B:24:0x00ae, B:45:0x01da, B:25:0x00ee, B:27:0x0105, B:29:0x0154, B:30:0x0175, B:32:0x017d, B:34:0x0197, B:41:0x01b2, B:42:0x01b3, B:44:0x01c7, B:11:0x0064, B:14:0x0068, B:36:0x01ab, B:7:0x005e, B:51:0x0277), top: B:60:0x0001, inners: #0, #1, #3 }] */
    public final synchronized void setDividerPadding(@NotNull zj p4, @Nullable IOException p10) {
        int i10;
        int i11;
        int i12;
        try {
            System.identityHashCode(this);
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = ~iIdentityHashCode;
            int i14 = ((~i13) & (-1446783956)) | (1446783955 & i13);
            int i15 = i13 & (-1446783956);
            int i16 = ~((i15 & i14) | (i14 ^ i15));
            int i17 = -(-(((i16 & 1064735272) | (1064735272 ^ i16)) * (-983)));
            int i18 = 1454679526 & i17;
            int i19 = -(-((i17 ^ 1454679526) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            int i21 = ~iIdentityHashCode;
            int i22 = ~((i21 & 1064735272) | (1064735272 ^ i21));
            int i23 = (2139012091 & i22) | ((~i22) & (-2139012092));
            int i24 = i22 & (-2139012092);
            int i25 = ((i24 & i23) | (i23 ^ i24)) * 983;
            if (2045864280 <= (i20 & i25) + (i25 | i20)) {
                Intrinsics.checkNotNullParameter(p4, "");
                int i26 = 84 / 0;
                if (p10 instanceof aap) {
                    int i27 = ((-1) << 1) - ((f62360q + 16) ^ (-1));
                    f62361r = i27 % 128;
                    int i28 = i27 % 2;
                    if (((aap) p10).setY == aac.REFUSED_STREAM) {
                        int i29 = f62361r;
                        int i30 = ((i29 ^ 40) + ((i29 & 40) << 1)) - 1;
                        f62360q = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = this.m;
                        System.identityHashCode(this);
                        int i33 = -(-(i32 * (-676)));
                        int i34 = 678 & i33;
                        int i35 = -(-((i33 ^ 678) | i34));
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        int i37 = i36 & (-1354);
                        int i38 = (i37 - (~(-(-((i36 ^ (-1354)) | i37))))) - 1;
                        int i39 = ~i32;
                        int i40 = -(-(((i39 & (-2)) | ((-2) ^ i39)) * (-677)));
                        int i41 = ~i32;
                        int i42 = (i41 & 1) | (i41 & (-2)) | ((~i41) & 1);
                        i11 = (((i42 | (~i42)) & (~i42)) * 677) + (((i38 | i40) << 1) - (i38 ^ i40));
                        this.m = i11;
                        if (i11 > 1) {
                            int i43 = f62360q;
                            int i44 = i43 ^ 15;
                            int i45 = -(-((i43 & 15) << 1));
                            int i46 = (i44 & i45) + (i44 | i45);
                            f62361r = i46 % 128;
                            int i47 = i46 % 2;
                            this.setLayoutAnimation = true;
                            int i48 = ((i43 ^ 50) + ((i43 & 50) << 1)) - 1;
                            f62361r = i48 % 128;
                            int i49 = i48 % 2;
                            int i50 = this.setZ;
                            int iIdentityHashCode2 = System.identityHashCode(this);
                            int i51 = i50 * 881;
                            int i52 = (((~i51) & 881) | (i51 & (-882))) + ((i51 & 881) << 1);
                            int i53 = ~i50;
                            int i54 = ((~i53) & (-2)) | (i53 & 1);
                            int i55 = (-2) & i53;
                            int i56 = ~((i54 & i55) | (i54 ^ i55));
                            int i57 = ~iIdentityHashCode2;
                            int i58 = ((-2) & i57) | (iIdentityHashCode2 & 1);
                            int i59 = (-2) & iIdentityHashCode2;
                            int i60 = ~((i58 & i59) | (i58 ^ i59));
                            int i61 = (i56 & i60) | (i56 ^ i60);
                            int i62 = (i53 | i50) & (~i50);
                            int i63 = ~((i62 & iIdentityHashCode2) | (i62 ^ iIdentityHashCode2));
                            int i64 = ((~i63) & i61) | ((~i61) & i63);
                            int i65 = i63 & i61;
                            int i66 = ((i65 & i64) | (i64 ^ i65)) * (-880);
                            int i67 = ((((i52 ^ i66) | (i52 & i66)) << 1) - (~(-((i66 & (~i52)) | ((~i66) & i52))))) - 1;
                            int i68 = i50 | (~(((-2) ^ i57) | ((-2) & i57)));
                            int i69 = iIdentityHashCode2 & 1;
                            int i70 = ~((iIdentityHashCode2 ^ 1) | i69);
                            int i71 = -(~(((i68 & i70) | (i68 ^ i70)) * (-880)));
                            int i72 = ((-1) << 1) - (((i67 & i71) + (i71 | i67)) ^ (-1));
                            int i73 = (iIdentityHashCode2 & (-2)) | (i57 & 1);
                            int i74 = (~((i73 & i69) | (i73 ^ i69))) * 880;
                            int i75 = i72 & i74;
                            this.setZ = i75 + ((i72 ^ i74) | i75);
                            int i76 = f62361r + 109;
                            f62360q = i76 % 128;
                            int i77 = i76 % 2;
                        }
                        throw th;
                    }
                    if (((aap) p10).setY == aac.CANCEL) {
                        int i78 = f62361r;
                        int i79 = i78 & 93;
                        int i80 = -(-((i78 ^ 93) | i79));
                        i10 = (i79 & i80) + (i80 | i79);
                        f62360q = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (!((Boolean) zj.setDividerPadding(new Object[]{p4}, 1594554260, -1594554259, System.identityHashCode(p4))).booleanValue()) {
                            }
                            throw th;
                        }
                        int i81 = 71 / 0;
                        if (!(!((Boolean) zj.setDividerPadding(new Object[]{p4}, 1594554260, -1594554259, System.identityHashCode(p4))).booleanValue())) {
                        }
                        throw th;
                        int i510 = this.setZ;
                        int iIdentityHashCode3 = System.identityHashCode(this);
                        int i511 = i510 * 881;
                        int i512 = (((~i511) & 881) | (i511 & (-882))) + ((i511 & 881) << 1);
                        int i513 = ~i510;
                        int i514 = ((~i513) & (-2)) | (i513 & 1);
                        int i515 = (-2) & i513;
                        int i516 = ~((i514 & i515) | (i514 ^ i515));
                        int i517 = ~iIdentityHashCode3;
                        int i518 = ((-2) & i517) | (iIdentityHashCode3 & 1);
                        int i519 = (-2) & iIdentityHashCode3;
                        int i610 = ~((i518 & i519) | (i518 ^ i519));
                        int i611 = (i516 & i610) | (i516 ^ i610);
                        int i612 = (i513 | i510) & (~i510);
                        int i613 = ~((i612 & iIdentityHashCode3) | (i612 ^ iIdentityHashCode3));
                        int i614 = ((~i613) & i611) | ((~i611) & i613);
                        int i615 = i613 & i611;
                        int i616 = ((i615 & i614) | (i614 ^ i615)) * (-880);
                        int i617 = ((((i512 ^ i616) | (i512 & i616)) << 1) - (~(-((i616 & (~i512)) | ((~i616) & i512))))) - 1;
                        int i618 = i510 | (~(((-2) ^ i517) | ((-2) & i517)));
                        int i619 = iIdentityHashCode3 & 1;
                        int i710 = ~((iIdentityHashCode3 ^ 1) | i619);
                        int i711 = -(~(((i618 & i710) | (i618 ^ i710)) * (-880)));
                        int i712 = ((-1) << 1) - (((i617 & i711) + (i711 | i617)) ^ (-1));
                        int i713 = (iIdentityHashCode3 & (-2)) | (i517 & 1);
                        int i714 = (~((i713 & i619) | (i713 ^ i619))) * 880;
                        int i715 = i712 & i714;
                        this.setZ = i715 + ((i712 ^ i714) | i715);
                        int i716 = f62361r + 109;
                        f62360q = i716 % 128;
                        int i717 = i716 % 2;
                    }
                    this.setLayoutAnimation = true;
                    int i82 = f62360q;
                    int i83 = i82 & 89;
                    int i84 = (i82 ^ 89) | i83;
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    f62361r = i85 % 128;
                    int i86 = i85 % 2;
                    int i5110 = this.setZ;
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i5111 = i5110 * 881;
                    int i5112 = (((~i5111) & 881) | (i5111 & (-882))) + ((i5111 & 881) << 1);
                    int i5113 = ~i5110;
                    int i5114 = ((~i5113) & (-2)) | (i5113 & 1);
                    int i5115 = (-2) & i5113;
                    int i5116 = ~((i5114 & i5115) | (i5114 ^ i5115));
                    int i5117 = ~iIdentityHashCode4;
                    int i5118 = ((-2) & i5117) | (iIdentityHashCode4 & 1);
                    int i5119 = (-2) & iIdentityHashCode4;
                    int i6110 = ~((i5118 & i5119) | (i5118 ^ i5119));
                    int i6111 = (i5116 & i6110) | (i5116 ^ i6110);
                    int i6112 = (i5113 | i5110) & (~i5110);
                    int i6113 = ~((i6112 & iIdentityHashCode4) | (i6112 ^ iIdentityHashCode4));
                    int i6114 = ((~i6113) & i6111) | ((~i6111) & i6113);
                    int i6115 = i6113 & i6111;
                    int i6116 = ((i6115 & i6114) | (i6114 ^ i6115)) * (-880);
                    int i6117 = ((((i5112 ^ i6116) | (i5112 & i6116)) << 1) - (~(-((i6116 & (~i5112)) | ((~i6116) & i5112))))) - 1;
                    int i6118 = i5110 | (~(((-2) ^ i5117) | ((-2) & i5117)));
                    int i6119 = iIdentityHashCode4 & 1;
                    int i718 = ~((iIdentityHashCode4 ^ 1) | i6119);
                    int i719 = -(~(((i6118 & i718) | (i6118 ^ i718)) * (-880)));
                    int i7110 = ((-1) << 1) - (((i6117 & i719) + (i719 | i6117)) ^ (-1));
                    int i7111 = (iIdentityHashCode4 & (-2)) | (i5117 & 1);
                    int i7112 = (~((i7111 & i6119) | (i7111 ^ i6119))) * 880;
                    int i7113 = i7110 & i7112;
                    this.setZ = i7113 + ((i7110 ^ i7112) | i7113);
                    int i7114 = f62361r + 109;
                    f62360q = i7114 % 128;
                    int i7115 = i7114 % 2;
                } else {
                    if (((Boolean) setY(new Object[]{this}, 431803447, -431803443, System.identityHashCode(this))).booleanValue()) {
                        this.setLayoutAnimation = true;
                        if (this.f62373l == 0) {
                            i12 = f62360q;
                            int i87 = i12 ^ 73;
                            int i88 = (((i12 & 73) | i87) << 1) - i87;
                            f62361r = i88 % 128;
                            int i89 = i88 % 2;
                            if (p10 != null) {
                                int i90 = ((i12 | 69) << 1) - (i12 ^ 69);
                                f62361r = i90 % 128;
                                int i91 = i90 % 2;
                                setY(new Object[]{(ym) zj.setDividerPadding(new Object[]{p4}, 274554588, -274554585, System.identityHashCode(p4)), this.f62362a, p10}, 1552440225, -1552440206, (int) System.currentTimeMillis());
                                System.identityHashCode(this);
                                System.identityHashCode(this);
                            }
                            int i51110 = this.setZ;
                            int iIdentityHashCode5 = System.identityHashCode(this);
                            int i51111 = i51110 * 881;
                            int i51112 = (((~i51111) & 881) | (i51111 & (-882))) + ((i51111 & 881) << 1);
                            int i51113 = ~i51110;
                            int i51114 = ((~i51113) & (-2)) | (i51113 & 1);
                            int i51115 = (-2) & i51113;
                            int i51116 = ~((i51114 & i51115) | (i51114 ^ i51115));
                            int i51117 = ~iIdentityHashCode5;
                            int i51118 = ((-2) & i51117) | (iIdentityHashCode5 & 1);
                            int i51119 = (-2) & iIdentityHashCode5;
                            int i61110 = ~((i51118 & i51119) | (i51118 ^ i51119));
                            int i61111 = (i51116 & i61110) | (i51116 ^ i61110);
                            int i61112 = (i51113 | i51110) & (~i51110);
                            int i61113 = ~((i61112 & iIdentityHashCode5) | (i61112 ^ iIdentityHashCode5));
                            int i61114 = ((~i61113) & i61111) | ((~i61111) & i61113);
                            int i61115 = i61113 & i61111;
                            int i61116 = ((i61115 & i61114) | (i61114 ^ i61115)) * (-880);
                            int i61117 = ((((i51112 ^ i61116) | (i51112 & i61116)) << 1) - (~(-((i61116 & (~i51112)) | ((~i61116) & i51112))))) - 1;
                            int i61118 = i51110 | (~(((-2) ^ i51117) | ((-2) & i51117)));
                            int i61119 = iIdentityHashCode5 & 1;
                            int i7116 = ~((iIdentityHashCode5 ^ 1) | i61119);
                            int i7117 = -(~(((i61118 & i7116) | (i61118 ^ i7116)) * (-880)));
                            int i7118 = ((-1) << 1) - (((i61117 & i7117) + (i7117 | i61117)) ^ (-1));
                            int i7119 = (iIdentityHashCode5 & (-2)) | (i51117 & 1);
                            int i71110 = (~((i7119 & i61119) | (i7119 ^ i61119))) * 880;
                            int i71111 = i7118 & i71110;
                            this.setZ = i71111 + ((i7118 ^ i71110) | i71111);
                            int i71112 = f62361r + 109;
                            f62360q = i71112 % 128;
                            int i71113 = i71112 % 2;
                        }
                        throw th;
                    }
                    int i92 = f62360q + 33;
                    f62361r = i92 % 128;
                    int i93 = i92 % 2;
                    if (p10 instanceof aad) {
                        this.setLayoutAnimation = true;
                        if (this.f62373l == 0) {
                            i12 = f62360q;
                            int i810 = i12 ^ 73;
                            int i811 = (((i12 & 73) | i810) << 1) - i810;
                            f62361r = i811 % 128;
                            int i812 = i811 % 2;
                            if (p10 != null) {
                                int i94 = ((i12 | 69) << 1) - (i12 ^ 69);
                                f62361r = i94 % 128;
                                int i95 = i94 % 2;
                                setY(new Object[]{(ym) zj.setDividerPadding(new Object[]{p4}, 274554588, -274554585, System.identityHashCode(p4)), this.f62362a, p10}, 1552440225, -1552440206, (int) System.currentTimeMillis());
                                System.identityHashCode(this);
                                System.identityHashCode(this);
                            }
                            int i511110 = this.setZ;
                            int iIdentityHashCode6 = System.identityHashCode(this);
                            int i511111 = i511110 * 881;
                            int i511112 = (((~i511111) & 881) | (i511111 & (-882))) + ((i511111 & 881) << 1);
                            int i511113 = ~i511110;
                            int i511114 = ((~i511113) & (-2)) | (i511113 & 1);
                            int i511115 = (-2) & i511113;
                            int i511116 = ~((i511114 & i511115) | (i511114 ^ i511115));
                            int i511117 = ~iIdentityHashCode6;
                            int i511118 = ((-2) & i511117) | (iIdentityHashCode6 & 1);
                            int i511119 = (-2) & iIdentityHashCode6;
                            int i611110 = ~((i511118 & i511119) | (i511118 ^ i511119));
                            int i611111 = (i511116 & i611110) | (i511116 ^ i611110);
                            int i611112 = (i511113 | i511110) & (~i511110);
                            int i611113 = ~((i611112 & iIdentityHashCode6) | (i611112 ^ iIdentityHashCode6));
                            int i611114 = ((~i611113) & i611111) | ((~i611111) & i611113);
                            int i611115 = i611113 & i611111;
                            int i611116 = ((i611115 & i611114) | (i611114 ^ i611115)) * (-880);
                            int i611117 = ((((i511112 ^ i611116) | (i511112 & i611116)) << 1) - (~(-((i611116 & (~i511112)) | ((~i611116) & i511112))))) - 1;
                            int i611118 = i511110 | (~(((-2) ^ i511117) | ((-2) & i511117)));
                            int i611119 = iIdentityHashCode6 & 1;
                            int i71114 = ~((iIdentityHashCode6 ^ 1) | i611119);
                            int i71115 = -(~(((i611118 & i71114) | (i611118 ^ i71114)) * (-880)));
                            int i71116 = ((-1) << 1) - (((i611117 & i71115) + (i71115 | i611117)) ^ (-1));
                            int i71117 = (iIdentityHashCode6 & (-2)) | (i511117 & 1);
                            int i71118 = (~((i71117 & i611119) | (i71117 ^ i611119))) * 880;
                            int i71119 = i71116 & i71118;
                            this.setZ = i71119 + ((i71116 ^ i71118) | i71119);
                            int i711110 = f62361r + 109;
                            f62360q = i711110 % 128;
                            int i711111 = i711110 % 2;
                        }
                        throw th;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(p4, "");
                if (p10 instanceof aap) {
                    int i210 = ((-1) << 1) - ((f62360q + 16) ^ (-1));
                    f62361r = i210 % 128;
                    int i211 = i210 % 2;
                    if (((aap) p10).setY == aac.REFUSED_STREAM) {
                        int i212 = f62361r;
                        int i310 = ((i212 ^ 40) + ((i212 & 40) << 1)) - 1;
                        f62360q = i310 % 128;
                        int i311 = i310 % 2;
                        int i312 = this.m;
                        System.identityHashCode(this);
                        int i313 = -(-(i312 * (-676)));
                        int i314 = 678 & i313;
                        int i315 = -(-((i313 ^ 678) | i314));
                        int i316 = ((i314 | i315) << 1) - (i315 ^ i314);
                        int i317 = i316 & (-1354);
                        int i318 = (i317 - (~(-(-((i316 ^ (-1354)) | i317))))) - 1;
                        int i319 = ~i312;
                        int i410 = -(-(((i319 & (-2)) | ((-2) ^ i319)) * (-677)));
                        int i411 = ~i312;
                        int i412 = (i411 & 1) | (i411 & (-2)) | ((~i411) & 1);
                        i11 = (((i412 | (~i412)) & (~i412)) * 677) + (((i318 | i410) << 1) - (i318 ^ i410));
                        this.m = i11;
                        if (i11 > 1) {
                            int i413 = f62360q;
                            int i414 = i413 ^ 15;
                            int i415 = -(-((i413 & 15) << 1));
                            int i416 = (i414 & i415) + (i414 | i415);
                            f62361r = i416 % 128;
                            int i417 = i416 % 2;
                            this.setLayoutAnimation = true;
                            int i418 = ((i413 ^ 50) + ((i413 & 50) << 1)) - 1;
                            f62361r = i418 % 128;
                            int i419 = i418 % 2;
                            int i5111110 = this.setZ;
                            int iIdentityHashCode7 = System.identityHashCode(this);
                            int i5111111 = i5111110 * 881;
                            int i5111112 = (((~i5111111) & 881) | (i5111111 & (-882))) + ((i5111111 & 881) << 1);
                            int i5111113 = ~i5111110;
                            int i5111114 = ((~i5111113) & (-2)) | (i5111113 & 1);
                            int i5111115 = (-2) & i5111113;
                            int i5111116 = ~((i5111114 & i5111115) | (i5111114 ^ i5111115));
                            int i5111117 = ~iIdentityHashCode7;
                            int i5111118 = ((-2) & i5111117) | (iIdentityHashCode7 & 1);
                            int i5111119 = (-2) & iIdentityHashCode7;
                            int i6111110 = ~((i5111118 & i5111119) | (i5111118 ^ i5111119));
                            int i6111111 = (i5111116 & i6111110) | (i5111116 ^ i6111110);
                            int i6111112 = (i5111113 | i5111110) & (~i5111110);
                            int i6111113 = ~((i6111112 & iIdentityHashCode7) | (i6111112 ^ iIdentityHashCode7));
                            int i6111114 = ((~i6111113) & i6111111) | ((~i6111111) & i6111113);
                            int i6111115 = i6111113 & i6111111;
                            int i6111116 = ((i6111115 & i6111114) | (i6111114 ^ i6111115)) * (-880);
                            int i6111117 = ((((i5111112 ^ i6111116) | (i5111112 & i6111116)) << 1) - (~(-((i6111116 & (~i5111112)) | ((~i6111116) & i5111112))))) - 1;
                            int i6111118 = i5111110 | (~(((-2) ^ i5111117) | ((-2) & i5111117)));
                            int i6111119 = iIdentityHashCode7 & 1;
                            int i711112 = ~((iIdentityHashCode7 ^ 1) | i6111119);
                            int i711113 = -(~(((i6111118 & i711112) | (i6111118 ^ i711112)) * (-880)));
                            int i711114 = ((-1) << 1) - (((i6111117 & i711113) + (i711113 | i6111117)) ^ (-1));
                            int i711115 = (iIdentityHashCode7 & (-2)) | (i5111117 & 1);
                            int i711116 = (~((i711115 & i6111119) | (i711115 ^ i6111119))) * 880;
                            int i711117 = i711114 & i711116;
                            this.setZ = i711117 + ((i711114 ^ i711116) | i711117);
                            int i711118 = f62361r + 109;
                            f62360q = i711118 % 128;
                            int i711119 = i711118 % 2;
                        }
                        throw th;
                    }
                    if (((aap) p10).setY == aac.CANCEL) {
                        int i720 = f62361r;
                        int i721 = i720 & 93;
                        int i813 = -(-((i720 ^ 93) | i721));
                        i10 = (i721 & i813) + (i813 | i721);
                        f62360q = i10 % 128;
                        if (i10 % 2 != 0) {
                            if (!((Boolean) zj.setDividerPadding(new Object[]{p4}, 1594554260, -1594554259, System.identityHashCode(p4))).booleanValue()) {
                            }
                            throw th;
                        }
                        int i814 = 71 / 0;
                        if (!(!((Boolean) zj.setDividerPadding(new Object[]{p4}, 1594554260, -1594554259, System.identityHashCode(p4))).booleanValue())) {
                        }
                        throw th;
                        int i51111110 = this.setZ;
                        int iIdentityHashCode8 = System.identityHashCode(this);
                        int i51111111 = i51111110 * 881;
                        int i51111112 = (((~i51111111) & 881) | (i51111111 & (-882))) + ((i51111111 & 881) << 1);
                        int i51111113 = ~i51111110;
                        int i51111114 = ((~i51111113) & (-2)) | (i51111113 & 1);
                        int i51111115 = (-2) & i51111113;
                        int i51111116 = ~((i51111114 & i51111115) | (i51111114 ^ i51111115));
                        int i51111117 = ~iIdentityHashCode8;
                        int i51111118 = ((-2) & i51111117) | (iIdentityHashCode8 & 1);
                        int i51111119 = (-2) & iIdentityHashCode8;
                        int i61111110 = ~((i51111118 & i51111119) | (i51111118 ^ i51111119));
                        int i61111111 = (i51111116 & i61111110) | (i51111116 ^ i61111110);
                        int i61111112 = (i51111113 | i51111110) & (~i51111110);
                        int i61111113 = ~((i61111112 & iIdentityHashCode8) | (i61111112 ^ iIdentityHashCode8));
                        int i61111114 = ((~i61111113) & i61111111) | ((~i61111111) & i61111113);
                        int i61111115 = i61111113 & i61111111;
                        int i61111116 = ((i61111115 & i61111114) | (i61111114 ^ i61111115)) * (-880);
                        int i61111117 = ((((i51111112 ^ i61111116) | (i51111112 & i61111116)) << 1) - (~(-((i61111116 & (~i51111112)) | ((~i61111116) & i51111112))))) - 1;
                        int i61111118 = i51111110 | (~(((-2) ^ i51111117) | ((-2) & i51111117)));
                        int i61111119 = iIdentityHashCode8 & 1;
                        int i7111110 = ~((iIdentityHashCode8 ^ 1) | i61111119);
                        int i7111111 = -(~(((i61111118 & i7111110) | (i61111118 ^ i7111110)) * (-880)));
                        int i7111112 = ((-1) << 1) - (((i61111117 & i7111111) + (i7111111 | i61111117)) ^ (-1));
                        int i7111113 = (iIdentityHashCode8 & (-2)) | (i51111117 & 1);
                        int i7111114 = (~((i7111113 & i61111119) | (i7111113 ^ i61111119))) * 880;
                        int i7111115 = i7111112 & i7111114;
                        this.setZ = i7111115 + ((i7111112 ^ i7111114) | i7111115);
                        int i7111116 = f62361r + 109;
                        f62360q = i7111116 % 128;
                        int i7111117 = i7111116 % 2;
                    }
                    this.setLayoutAnimation = true;
                    int i815 = f62360q;
                    int i816 = i815 & 89;
                    int i817 = (i815 ^ 89) | i816;
                    int i818 = (i816 ^ i817) + ((i817 & i816) << 1);
                    f62361r = i818 % 128;
                    int i819 = i818 % 2;
                    int i511111110 = this.setZ;
                    int iIdentityHashCode9 = System.identityHashCode(this);
                    int i511111111 = i511111110 * 881;
                    int i511111112 = (((~i511111111) & 881) | (i511111111 & (-882))) + ((i511111111 & 881) << 1);
                    int i511111113 = ~i511111110;
                    int i511111114 = ((~i511111113) & (-2)) | (i511111113 & 1);
                    int i511111115 = (-2) & i511111113;
                    int i511111116 = ~((i511111114 & i511111115) | (i511111114 ^ i511111115));
                    int i511111117 = ~iIdentityHashCode9;
                    int i511111118 = ((-2) & i511111117) | (iIdentityHashCode9 & 1);
                    int i511111119 = (-2) & iIdentityHashCode9;
                    int i611111110 = ~((i511111118 & i511111119) | (i511111118 ^ i511111119));
                    int i611111111 = (i511111116 & i611111110) | (i511111116 ^ i611111110);
                    int i611111112 = (i511111113 | i511111110) & (~i511111110);
                    int i611111113 = ~((i611111112 & iIdentityHashCode9) | (i611111112 ^ iIdentityHashCode9));
                    int i611111114 = ((~i611111113) & i611111111) | ((~i611111111) & i611111113);
                    int i611111115 = i611111113 & i611111111;
                    int i611111116 = ((i611111115 & i611111114) | (i611111114 ^ i611111115)) * (-880);
                    int i611111117 = ((((i511111112 ^ i611111116) | (i511111112 & i611111116)) << 1) - (~(-((i611111116 & (~i511111112)) | ((~i611111116) & i511111112))))) - 1;
                    int i611111118 = i511111110 | (~(((-2) ^ i511111117) | ((-2) & i511111117)));
                    int i611111119 = iIdentityHashCode9 & 1;
                    int i7111118 = ~((iIdentityHashCode9 ^ 1) | i611111119);
                    int i7111119 = -(~(((i611111118 & i7111118) | (i611111118 ^ i7111118)) * (-880)));
                    int i71111110 = ((-1) << 1) - (((i611111117 & i7111119) + (i7111119 | i611111117)) ^ (-1));
                    int i71111111 = (iIdentityHashCode9 & (-2)) | (i511111117 & 1);
                    int i71111112 = (~((i71111111 & i611111119) | (i71111111 ^ i611111119))) * 880;
                    int i71111113 = i71111110 & i71111112;
                    this.setZ = i71111113 + ((i71111110 ^ i71111112) | i71111113);
                    int i71111114 = f62361r + 109;
                    f62360q = i71111114 % 128;
                    int i71111115 = i71111114 % 2;
                } else {
                    if (((Boolean) setY(new Object[]{this}, 431803447, -431803443, System.identityHashCode(this))).booleanValue()) {
                        this.setLayoutAnimation = true;
                        if (this.f62373l == 0) {
                            i12 = f62360q;
                            int i8110 = i12 ^ 73;
                            int i8111 = (((i12 & 73) | i8110) << 1) - i8110;
                            f62361r = i8111 % 128;
                            int i8112 = i8111 % 2;
                            if (p10 != null) {
                                int i96 = ((i12 | 69) << 1) - (i12 ^ 69);
                                f62361r = i96 % 128;
                                int i97 = i96 % 2;
                                setY(new Object[]{(ym) zj.setDividerPadding(new Object[]{p4}, 274554588, -274554585, System.identityHashCode(p4)), this.f62362a, p10}, 1552440225, -1552440206, (int) System.currentTimeMillis());
                                System.identityHashCode(this);
                                System.identityHashCode(this);
                            }
                            int i5111111110 = this.setZ;
                            int iIdentityHashCode10 = System.identityHashCode(this);
                            int i5111111111 = i5111111110 * 881;
                            int i5111111112 = (((~i5111111111) & 881) | (i5111111111 & (-882))) + ((i5111111111 & 881) << 1);
                            int i5111111113 = ~i5111111110;
                            int i5111111114 = ((~i5111111113) & (-2)) | (i5111111113 & 1);
                            int i5111111115 = (-2) & i5111111113;
                            int i5111111116 = ~((i5111111114 & i5111111115) | (i5111111114 ^ i5111111115));
                            int i5111111117 = ~iIdentityHashCode10;
                            int i5111111118 = ((-2) & i5111111117) | (iIdentityHashCode10 & 1);
                            int i5111111119 = (-2) & iIdentityHashCode10;
                            int i6111111110 = ~((i5111111118 & i5111111119) | (i5111111118 ^ i5111111119));
                            int i6111111111 = (i5111111116 & i6111111110) | (i5111111116 ^ i6111111110);
                            int i6111111112 = (i5111111113 | i5111111110) & (~i5111111110);
                            int i6111111113 = ~((i6111111112 & iIdentityHashCode10) | (i6111111112 ^ iIdentityHashCode10));
                            int i6111111114 = ((~i6111111113) & i6111111111) | ((~i6111111111) & i6111111113);
                            int i6111111115 = i6111111113 & i6111111111;
                            int i6111111116 = ((i6111111115 & i6111111114) | (i6111111114 ^ i6111111115)) * (-880);
                            int i6111111117 = ((((i5111111112 ^ i6111111116) | (i5111111112 & i6111111116)) << 1) - (~(-((i6111111116 & (~i5111111112)) | ((~i6111111116) & i5111111112))))) - 1;
                            int i6111111118 = i5111111110 | (~(((-2) ^ i5111111117) | ((-2) & i5111111117)));
                            int i6111111119 = iIdentityHashCode10 & 1;
                            int i71111116 = ~((iIdentityHashCode10 ^ 1) | i6111111119);
                            int i71111117 = -(~(((i6111111118 & i71111116) | (i6111111118 ^ i71111116)) * (-880)));
                            int i71111118 = ((-1) << 1) - (((i6111111117 & i71111117) + (i71111117 | i6111111117)) ^ (-1));
                            int i71111119 = (iIdentityHashCode10 & (-2)) | (i5111111117 & 1);
                            int i711111110 = (~((i71111119 & i6111111119) | (i71111119 ^ i6111111119))) * 880;
                            int i711111111 = i71111118 & i711111110;
                            this.setZ = i711111111 + ((i71111118 ^ i711111110) | i711111111);
                            int i711111112 = f62361r + 109;
                            f62360q = i711111112 % 128;
                            int i711111113 = i711111112 % 2;
                        }
                        throw th;
                    }
                    int i98 = f62360q + 33;
                    f62361r = i98 % 128;
                    int i99 = i98 % 2;
                    if (p10 instanceof aad) {
                        this.setLayoutAnimation = true;
                        if (this.f62373l == 0) {
                            i12 = f62360q;
                            int i8113 = i12 ^ 73;
                            int i8114 = (((i12 & 73) | i8113) << 1) - i8113;
                            f62361r = i8114 % 128;
                            int i8115 = i8114 % 2;
                            if (p10 != null) {
                                int i910 = ((i12 | 69) << 1) - (i12 ^ 69);
                                f62361r = i910 % 128;
                                int i911 = i910 % 2;
                                setY(new Object[]{(ym) zj.setDividerPadding(new Object[]{p4}, 274554588, -274554585, System.identityHashCode(p4)), this.f62362a, p10}, 1552440225, -1552440206, (int) System.currentTimeMillis());
                                System.identityHashCode(this);
                                System.identityHashCode(this);
                            }
                            int i51111111110 = this.setZ;
                            int iIdentityHashCode11 = System.identityHashCode(this);
                            int i51111111111 = i51111111110 * 881;
                            int i51111111112 = (((~i51111111111) & 881) | (i51111111111 & (-882))) + ((i51111111111 & 881) << 1);
                            int i51111111113 = ~i51111111110;
                            int i51111111114 = ((~i51111111113) & (-2)) | (i51111111113 & 1);
                            int i51111111115 = (-2) & i51111111113;
                            int i51111111116 = ~((i51111111114 & i51111111115) | (i51111111114 ^ i51111111115));
                            int i51111111117 = ~iIdentityHashCode11;
                            int i51111111118 = ((-2) & i51111111117) | (iIdentityHashCode11 & 1);
                            int i51111111119 = (-2) & iIdentityHashCode11;
                            int i61111111110 = ~((i51111111118 & i51111111119) | (i51111111118 ^ i51111111119));
                            int i61111111111 = (i51111111116 & i61111111110) | (i51111111116 ^ i61111111110);
                            int i61111111112 = (i51111111113 | i51111111110) & (~i51111111110);
                            int i61111111113 = ~((i61111111112 & iIdentityHashCode11) | (i61111111112 ^ iIdentityHashCode11));
                            int i61111111114 = ((~i61111111113) & i61111111111) | ((~i61111111111) & i61111111113);
                            int i61111111115 = i61111111113 & i61111111111;
                            int i61111111116 = ((i61111111115 & i61111111114) | (i61111111114 ^ i61111111115)) * (-880);
                            int i61111111117 = ((((i51111111112 ^ i61111111116) | (i51111111112 & i61111111116)) << 1) - (~(-((i61111111116 & (~i51111111112)) | ((~i61111111116) & i51111111112))))) - 1;
                            int i61111111118 = i51111111110 | (~(((-2) ^ i51111111117) | ((-2) & i51111111117)));
                            int i61111111119 = iIdentityHashCode11 & 1;
                            int i711111114 = ~((iIdentityHashCode11 ^ 1) | i61111111119);
                            int i711111115 = -(~(((i61111111118 & i711111114) | (i61111111118 ^ i711111114)) * (-880)));
                            int i711111116 = ((-1) << 1) - (((i61111111117 & i711111115) + (i711111115 | i61111111117)) ^ (-1));
                            int i711111117 = (iIdentityHashCode11 & (-2)) | (i51111111117 & 1);
                            int i711111118 = (~((i711111117 & i61111111119) | (i711111117 ^ i61111111119))) * 880;
                            int i711111119 = i711111116 & i711111118;
                            this.setZ = i711111119 + ((i711111116 ^ i711111118) | i711111119);
                            int i7111111110 = f62361r + 109;
                            f62360q = i7111111110 % 128;
                            int i7111111111 = i7111111110 % 2;
                        }
                        throw th;
                    }
                }
            }
            int i100 = f62360q;
            int i101 = (i100 & 19) + (i100 | 19);
            f62361r = i101 % 128;
            if (i101 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final yp setIncludeFontPadding() {
        return (yp) setY(new Object[]{this}, 2102358168, -2102358143, System.identityHashCode(this));
    }

    public final synchronized void setLayoutAnimation() {
        int i10 = f62360q;
        int i11 = ((i10 ^ 48) + ((i10 & 48) << 1)) - 1;
        f62361r = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.f62373l;
        System.identityHashCode(this);
        int i14 = i13 * (-623);
        int i15 = ((-623) ^ i14) + ((i14 & (-623)) << 1);
        int i16 = i15 & 1248;
        int i17 = (i15 ^ 1248) | i16;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        int i19 = i13 & (-2);
        int i20 = (i18 - (~(-(-((i19 | ((~i19) & (i13 | (-2)))) * 624))))) - 1;
        int i21 = -(~(-(-((i13 | 1) * 624))));
        this.f62373l = ((-1) << 1) - (((i20 ^ i21) + ((i21 & i20) << 1)) ^ (-1));
        int i22 = f62361r;
        int i23 = i22 ^ 81;
        int i24 = (i22 & 81) << 1;
        int i25 = (i23 & i24) + (i24 | i23);
        f62360q = i25 % 128;
        int i26 = i25 % 2;
    }

    @JvmName(name = "setNavigationOnClickListener")
    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setY(new Object[]{this}, 431803447, -431803443, System.identityHashCode(this))).booleanValue();
    }

    public final synchronized void setOnDragListener() {
        int i10 = f62360q;
        int i11 = ((i10 | 109) << 1) - (i10 ^ 109);
        f62361r = i11 % 128;
        int i12 = i11 % 2;
        this.setLayoutAnimation = true;
        int i13 = i10 & 81;
        int i14 = (i10 ^ 81) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        f62361r = i15 % 128;
        int i16 = i15 % 2;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final void setOnFocusChangeListener() throws Throwable {
        setY(new Object[]{this}, -1212665065, 1212665093, System.identityHashCode(this));
    }

    public final synchronized void setOnLongClickListener() {
        try {
            int i10 = f62360q;
            int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
            f62361r = i11 % 128;
            if (i11 % 2 == 0) {
                this.f62371j = false;
            } else {
                this.f62371j = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setTextAlignment() throws Throwable {
        setY(new Object[]{this}, -1983939424, 1983939433, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aah.setCompoundDrawableTintBlendMode
    public final synchronized void setX(@NotNull aah p4, @NotNull aam p10) {
        int i10 = f62360q;
        int i11 = ((-1) << 1) - (((i10 & 100) + (i10 | 100)) ^ (-1));
        f62361r = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            Intrinsics.checkNotNullParameter(p10, "");
            this.f62374n = ((Integer) aam.setOnFocusChangeListener(new Object[]{p10}, 1983088750, -1983088742, System.identityHashCode(p10))).intValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        this.f62374n = ((Integer) aam.setOnFocusChangeListener(new Object[]{p10}, 1983088750, -1983088742, System.identityHashCode(p10))).intValue();
        int i12 = f62361r;
        int i13 = i12 & 113;
        int i14 = -(-(i12 | 113));
        int i15 = (i13 & i14) + (i14 | i13);
        f62360q = i15 % 128;
        int i16 = i15 % 2;
    }

    @Nullable
    public final yf setZ() {
        return (yf) setY(new Object[]{this}, 785018576, -785018561, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, -320368228, 320368242, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(boolean p4) {
        return ((Boolean) setY(new Object[]{this, Boolean.valueOf(p4)}, -1129274435, 1129274446, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final zu setCompoundDrawableTintBlendMode(@NotNull ym p4, @NotNull zs p10) throws SocketException {
        return (zu) setY(new Object[]{this, p4, p10}, -439057157, 439057165, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull xh p4, @Nullable List<yp> p10) {
        return ((Boolean) setY(new Object[]{this, p4, p10}, 1488781649, -1488781639, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode(long j10) throws Throwable {
        setY(new Object[]{this, Long.valueOf(j10)}, 2039985364, -2039985351, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final List<Reference<zj>> setX() {
        return (List) setY(new Object[]{this}, 1220489272, -1220489265, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aah.setCompoundDrawableTintBlendMode
    public final void setDividerPadding(@NotNull aak p4) throws Throwable {
        setY(new Object[]{this, p4}, -1470357738, 1470357750, System.identityHashCode(this));
    }

    public final void setDividerPadding(int p4, int p10, int p11, int p12, boolean p13, @NotNull xp p14, @NotNull yd p15) throws Throwable {
        setY(new Object[]{this, Integer.valueOf(p4), Integer.valueOf(p10), Integer.valueOf(p11), Integer.valueOf(p12), Boolean.valueOf(p13), p14, p15}, 1447269411, -1447269382, p4);
    }

    @JvmName(name = "setDividerPadding")
    public final boolean setDividerPadding() {
        return ((Boolean) setY(new Object[]{this}, -1952685773, 1952685797, System.identityHashCode(this))).booleanValue();
    }

    public static final /* synthetic */ yf setY(zi ziVar) {
        return (yf) setY(new Object[]{ziVar}, -1529850706, 1529850709, (int) System.currentTimeMillis());
    }

    @JvmName(name = "setY")
    public final int setY() {
        return ((Integer) setY(new Object[]{this}, -1232914860, 1232914882, System.identityHashCode(this))).intValue();
    }
}
