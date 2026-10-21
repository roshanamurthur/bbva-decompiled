package com.mypinpad.tsdk.isolation;

import bk.d;
import bk.g;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/zn;", "", "", "setOnFocusChangeListener", "()Z", "Lcom/mypinpad/tsdk/i/zn$setX;", "setY", "()Lcom/mypinpad/tsdk/i/zn$setX;", "Lcom/mypinpad/tsdk/i/xh;", "p0", "Lcom/mypinpad/tsdk/i/zh;", "p1", "Lcom/mypinpad/tsdk/i/xp;", "p2", "Lcom/mypinpad/tsdk/i/yd;", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/xh;Lcom/mypinpad/tsdk/i/zh;Lcom/mypinpad/tsdk/i/xp;Lcom/mypinpad/tsdk/i/yd;)V", "setDividerPadding", "setX"}, k = 1, mv = {1, 6, 0})
public final class zn {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f62414i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f62415j = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xh f62416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final zh f62417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final xp f62418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final yd f62419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public List<? extends Proxy> f62420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public List<? extends InetSocketAddress> f62422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f62423h;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.zn$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/zn$setDividerPadding;", "", "Ljava/net/InetSocketAddress;", "", "setOnFocusChangeListener", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "setDividerPadding", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62424a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62425b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static String setOnFocusChangeListener(@NotNull InetSocketAddress inetSocketAddress) {
            return (String) setY(new Object[]{inetSocketAddress}, 383973853, -383973853, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004e  */
        /* JADX WARN: Code duplicated, block: B:13:0x004f A[PHI: r5
          0x004f: PHI (r5v6 java.net.InetAddress) = (r5v4 java.net.InetAddress), (r5v11 java.net.InetAddress) binds: [B:8:0x002d, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x0071  */
        /* JADX WARN: Code duplicated, block: B:9:0x002f  */
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            InetAddress address;
            String hostName;
            int i13;
            int i14;
            InetSocketAddress inetSocketAddress = (InetSocketAddress) objArr[0];
            int i15 = f62424a + 74;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f62425b = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.checkNotNullParameter(inetSocketAddress, "");
                address = inetSocketAddress.getAddress();
                int i17 = 64 / 0;
                if (address == null) {
                    hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(hostName, "");
                    int i18 = f62425b;
                    int i19 = i18 & 45;
                    int i20 = -(-((i18 ^ 45) | i19));
                    i13 = (i19 ^ i20) + ((i20 & i19) << 1);
                    f62424a = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    hostName = address.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(hostName, "");
                    int i21 = f62424a;
                    int i22 = i21 & 73;
                    int i23 = (i21 | 73) & (~i22);
                    int i24 = -(-(i22 << 1));
                    i14 = (i23 ^ i24) + ((i23 & i24) << 1);
                    f62425b = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(inetSocketAddress, "");
                address = inetSocketAddress.getAddress();
                if (address == null) {
                    hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(hostName, "");
                    int i110 = f62425b;
                    int i111 = i110 & 45;
                    int i25 = -(-((i110 ^ 45) | i111));
                    i13 = (i111 ^ i25) + ((i25 & i111) << 1);
                    f62424a = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    hostName = address.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(hostName, "");
                    int i26 = f62424a;
                    int i27 = i26 & 73;
                    int i28 = (i26 | 73) & (~i27);
                    int i29 = -(-(i27 << 1));
                    i14 = (i28 ^ i29) + ((i28 & i29) << 1);
                    f62425b = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                }
            }
            return hostName;
        }
    }

    static {
        int i10 = f62414i;
        int i11 = ((-1) << 1) - ((-1) ^ ((i10 & 120) + (i10 | 120)));
        f62415j = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public zn(@NotNull xh xhVar, @NotNull zh zhVar, @NotNull xp xpVar, @NotNull yd ydVar) throws SocketException, UnknownHostException {
        Intrinsics.checkNotNullParameter(xhVar, "");
        Intrinsics.checkNotNullParameter(zhVar, "");
        Intrinsics.checkNotNullParameter(xpVar, "");
        Intrinsics.checkNotNullParameter(ydVar, "");
        this.f62416a = xhVar;
        this.f62417b = zhVar;
        this.f62418c = xpVar;
        this.f62419d = ydVar;
        this.f62420e = CollectionsKt__CollectionsKt.emptyList();
        this.f62422g = CollectionsKt__CollectionsKt.emptyList();
        this.f62423h = new ArrayList();
        setOnFocusChangeListener(new Object[]{this, (yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar)), (Proxy) xh.setOnFocusChangeListener(new Object[]{xhVar}, 1929014817, -1929014810, System.identityHashCode(xhVar))}, 1863974389, -1863974384, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:101:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x007d  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:63:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0318  */
    /* JADX WARN: Code duplicated, block: B:98:0x0588  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws SocketException, UnknownHostException {
        Object onFocusChangeListener;
        Proxy proxy;
        Iterator<? extends InetSocketAddress> it;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        String str;
        int iIntValue;
        SocketAddress socketAddressAddress;
        int i17 = ~i11;
        int i18 = ~i12;
        switch ((((~(i10 | i12)) | (~(i11 | i18))) * 950) + (((~(i18 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i17 | i18)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949))) {
            case 1:
                zn znVar = (zn) objArr[0];
                int i19 = f62414i;
                int i20 = ((i19 ^ 112) + ((i19 & 112) << 1)) - 1;
                f62415j = i20 % 128;
                int i21 = i20 % 2;
                int i22 = znVar.f62421f;
                List<? extends Proxy> list = znVar.f62420e;
                if (i21 == 0) {
                    list.size();
                    throw null;
                }
                if (i22 < list.size()) {
                    int i23 = f62414i;
                    int i24 = (i23 & (-38)) | ((~i23) & 37);
                    int i25 = (i23 & 37) << 1;
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    f62415j = i26 % 128;
                    int i27 = i26 % 2;
                    onFocusChangeListener = Boolean.TRUE;
                } else {
                    int i28 = f62415j;
                    int i29 = (((i28 | 64) << 1) - (i28 ^ 64)) - 1;
                    f62414i = i29 % 128;
                    if (i29 % 2 != 0) {
                        throw null;
                    }
                    onFocusChangeListener = Boolean.FALSE;
                }
                break;
                break;
            case 2:
                zn znVar2 = (zn) objArr[0];
                int i30 = f62414i;
                int i31 = i30 & 27;
                int i32 = (i30 | 27) & (~i31);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                f62415j = i34 % 128;
                if (i34 % 2 == 0) {
                    ((Boolean) setOnFocusChangeListener(new Object[]{znVar2}, 2116206812, -2116206806, System.identityHashCode(znVar2))).booleanValue();
                    throw null;
                }
                if (!((Boolean) setOnFocusChangeListener(new Object[]{znVar2}, 2116206812, -2116206806, System.identityHashCode(znVar2))).booleanValue()) {
                    throw new NoSuchElementException();
                }
                ArrayList arrayList = new ArrayList();
                int i35 = (-2) - ((f62414i + 100) ^ (-1));
                f62415j = i35 % 128;
                while (true) {
                    int i36 = i35 % 2;
                    if (((Boolean) setOnFocusChangeListener(new Object[]{znVar2}, 120970691, -120970690, System.identityHashCode(znVar2))).booleanValue()) {
                        int i37 = f62414i;
                        int i38 = i37 & 11;
                        int i39 = i38 + ((i37 ^ 11) | i38);
                        f62415j = i39 % 128;
                        if (i39 % 2 == 0) {
                            proxy = (Proxy) setOnFocusChangeListener(new Object[]{znVar2}, -959029656, 959029659, System.identityHashCode(znVar2));
                            it = znVar2.f62422g.iterator();
                            int i40 = 93 / 0;
                        } else {
                            proxy = (Proxy) setOnFocusChangeListener(new Object[]{znVar2}, -959029656, 959029659, System.identityHashCode(znVar2));
                            it = znVar2.f62422g.iterator();
                        }
                        while (it.hasNext()) {
                            yp ypVar = new yp(znVar2.f62416a, proxy, it.next());
                            if (znVar2.f62417b.setCompoundDrawableTintBlendMode(ypVar)) {
                                int i41 = f62415j;
                                int i42 = (i41 & 16) + (i41 | 16);
                                int i43 = (i42 ^ (-1)) + (i42 << 1);
                                f62414i = i43 % 128;
                                int i44 = i43 % 2;
                                ArrayList arrayList2 = znVar2.f62423h;
                                if (i44 != 0) {
                                    arrayList2.add(ypVar);
                                    throw null;
                                }
                                arrayList2.add(ypVar);
                                int i45 = f62415j;
                                i13 = ((i45 | 9) << 1) - (i45 ^ 9);
                                f62414i = i13 % 128;
                            } else {
                                arrayList.add(ypVar);
                                int i46 = f62414i;
                                i13 = (((i46 | 8) << 1) - (i46 ^ 8)) - 1;
                                f62415j = i13 % 128;
                            }
                            int i47 = i13 % 2;
                        }
                        if (!(!arrayList.isEmpty())) {
                            i35 = f62415j + 81;
                            f62414i = i35 % 128;
                        } else {
                            int i48 = f62415j;
                            int i49 = (i48 ^ 59) + ((i48 & 59) << 1);
                            int i50 = i49 % 128;
                            f62414i = i50;
                            int i51 = i49 % 2;
                            int i52 = (i50 ^ 10) + ((i50 & 10) << 1);
                            int i53 = (i52 ^ (-1)) + (i52 << 1);
                            f62415j = i53 % 128;
                            int i54 = i53 % 2;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    int i55 = f62414i;
                    int i56 = (((i55 | 12) << 1) - (i55 ^ 12)) - 1;
                    f62415j = i56 % 128;
                    if (i56 % 2 == 0) {
                        g.addAll(arrayList, znVar2.f62423h);
                        znVar2.f62423h.clear();
                        throw null;
                    }
                    g.addAll(arrayList, znVar2.f62423h);
                    znVar2.f62423h.clear();
                }
                setX setx = new setX(arrayList);
                int i57 = f62414i;
                int i58 = (((i57 & (-58)) | ((~i57) & 57)) - (~((i57 & 57) << 1))) - 1;
                f62415j = i58 % 128;
                int i59 = i58 % 2;
                return setx;
            case 3:
                zn znVar3 = (zn) objArr[0];
                int i60 = f62415j;
                int i61 = i60 ^ 15;
                int i62 = -(-((i60 & 15) << 1));
                int i63 = (i61 & i62) + (i62 | i61);
                f62414i = i63 % 128;
                if (i63 % 2 != 0) {
                    ((Boolean) setOnFocusChangeListener(new Object[]{znVar3}, 120970691, -120970690, System.identityHashCode(znVar3))).booleanValue();
                    throw null;
                }
                if (!((Boolean) setOnFocusChangeListener(new Object[]{znVar3}, 120970691, -120970690, System.identityHashCode(znVar3))).booleanValue()) {
                    StringBuilder sb2 = new StringBuilder("No route to ");
                    sb2.append(znVar3.f62416a.setNavigationOnClickListener().setX());
                    sb2.append("; exhausted proxy configurations: ");
                    sb2.append(znVar3.f62420e);
                    throw new SocketException(sb2.toString());
                }
                List<? extends Proxy> list2 = znVar3.f62420e;
                int i64 = znVar3.f62421f;
                int i65 = i64 + 2;
                znVar3.f62421f = (i65 ^ (-1)) + (i65 << 1);
                Proxy proxy2 = list2.get(i64);
                setOnFocusChangeListener(new Object[]{znVar3, proxy2}, 1491269072, -1491269072, System.identityHashCode(znVar3));
                int i66 = f62414i;
                int i67 = i66 & 117;
                int i68 = ((i66 | 117) & (~i67)) + (i67 << 1);
                f62415j = i68 % 128;
                int i69 = i68 % 2;
                return proxy2;
            case 4:
                Proxy proxy3 = (Proxy) objArr[0];
                yg ygVar = (yg) objArr[1];
                zn znVar4 = (zn) objArr[2];
                int i70 = f62414i;
                int i71 = ((i70 | 20) << 1) - (i70 ^ 20);
                int i72 = (i71 ^ (-1)) + (i71 << 1);
                f62415j = i72 % 128;
                int i73 = i72 % 2;
                if (proxy3 == null) {
                    URI uri = (URI) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1622510043, 1622510052, System.identityHashCode(ygVar));
                    if (uri.getHost() != null) {
                        xh xhVar = znVar4.f62416a;
                        List<Proxy> listSelect = ((ProxySelector) xh.setOnFocusChangeListener(new Object[]{xhVar}, -38007021, 38007035, System.identityHashCode(xhVar))).select(uri);
                        List<Proxy> list3 = listSelect;
                        if (list3 != null) {
                            int iCurrentTimeMillis = (int) System.currentTimeMillis();
                            int i74 = (-2147263497) | iCurrentTimeMillis;
                            int i75 = ~i74;
                            int i76 = (-273504310) - (~(-(~(-(-((((i74 | i75) & i75) | (-1470578484)) * 262))))));
                            int i77 = i76 & 541517680;
                            int i78 = (((i76 ^ 541517680) | i77) << 1) - ((541517680 | i76) & (~i77));
                            int i79 = ~iCurrentTimeMillis;
                            int i80 = (iCurrentTimeMillis | i79) & i79;
                            int i81 = ((~i80) & (-2147263497)) | (2147263496 & i80);
                            int i82 = i80 & (-2147263497);
                            int i83 = ~((i82 & i81) | (i81 ^ i82));
                            int i84 = i78 - (~(-(-((((i83 & (-2147467068)) | (i83 ^ (-2147467068))) | 676888584) * 262))));
                            int i85 = (i84 ^ (-1)) + (i84 << 1);
                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                            int i86 = (-831802602) & iCurrentTimeMillis2;
                            int i87 = ~(((-831802602) ^ iCurrentTimeMillis2) | i86);
                            int i88 = ((~i87) & 1731948171) | ((-1731948172) & i87);
                            int i89 = i87 & 1731948171;
                            int i90 = -(~(((i89 & i88) | (i88 ^ i89)) * (-465)));
                            int i91 = ((115571434 & i90) + (i90 | 115571434)) - 1;
                            int i92 = 1731948171 & iCurrentTimeMillis2;
                            int i93 = ~(i92 | ((~i92) & (1731948171 | iCurrentTimeMillis2)));
                            int i94 = ((i93 & (-831802602)) | ((-831802602) ^ i93)) * 930;
                            int i95 = i91 & i94;
                            int i96 = (i94 | i91) & (~i95);
                            int i97 = i95 << 1;
                            int i98 = (i96 & i97) + (i96 | i97);
                            int i99 = (iCurrentTimeMillis2 & 831802601) | ((-831802602) & (~iCurrentTimeMillis2));
                            int i100 = -(-(((i99 & i86) | (i99 ^ i86) | 1731948171) * 465));
                            int i101 = i98 ^ i100;
                            if (i85 > (((i100 & i98) | i101) << 1) - i101) {
                                list3.isEmpty();
                                throw null;
                            }
                            if (!(!list3.isEmpty())) {
                                int i102 = f62415j + 77;
                                int i103 = i102 % 128;
                                f62414i = i103;
                                int i104 = i102 % 2;
                                int i105 = i103 & 85;
                                int i106 = ((i103 ^ 85) | i105) << 1;
                                int i107 = -((i103 | 85) & (~i105));
                                i14 = (i106 ^ i107) + ((i106 & i107) << 1);
                                f62415j = i14 % 128;
                                if (i14 % 2 == 0) {
                                    onFocusChangeListener = yt.setOnFocusChangeListener(Proxy.NO_PROXY);
                                } else {
                                    onFocusChangeListener = yt.setOnFocusChangeListener(Proxy.NO_PROXY);
                                }
                                i15 = f62414i + 85;
                            } else {
                                int i108 = f62414i;
                                int i109 = i108 & 99;
                                int i110 = i108 | 99;
                                int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
                                f62415j = i111 % 128;
                                int i112 = i111 % 2;
                                Intrinsics.checkNotNullExpressionValue(listSelect, "");
                                onFocusChangeListener = yt.setX(listSelect);
                                int i113 = f62414i;
                                i15 = (-2) - (((i113 ^ 4) + ((i113 & 4) << 1)) ^ (-1));
                            }
                        } else {
                            int i1010 = f62415j + 77;
                            int i1011 = i1010 % 128;
                            f62414i = i1011;
                            int i1012 = i1010 % 2;
                            int i1013 = i1011 & 85;
                            int i1014 = ((i1011 ^ 85) | i1013) << 1;
                            int i1015 = -((i1011 | 85) & (~i1013));
                            i14 = (i1014 ^ i1015) + ((i1014 & i1015) << 1);
                            f62415j = i14 % 128;
                            if (i14 % 2 == 0) {
                                onFocusChangeListener = yt.setOnFocusChangeListener(Proxy.NO_PROXY);
                            } else {
                                onFocusChangeListener = yt.setOnFocusChangeListener(Proxy.NO_PROXY);
                            }
                            i15 = f62414i + 85;
                        }
                        f62415j = i15 % 128;
                        int i114 = i15 % 2;
                    } else {
                        int i115 = f62414i;
                        int i116 = i115 & 39;
                        int i117 = ((((i115 ^ 39) | i116) << 1) - (~(-((i115 | 39) & (~i116))))) - 1;
                        f62415j = i117 % 128;
                        int i118 = i117 % 2;
                        onFocusChangeListener = yt.setOnFocusChangeListener(Proxy.NO_PROXY);
                        int i119 = f62414i;
                        int i120 = i119 & 63;
                        int i121 = (i119 ^ 63) | i120;
                        int i122 = (i120 & i121) + (i121 | i120);
                        f62415j = i122 % 128;
                        int i123 = i122 % 2;
                    }
                } else {
                    int i124 = i70 & 91;
                    int i125 = -(-(i70 | 91));
                    int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
                    f62415j = i126 % 128;
                    if (i126 % 2 == 0) {
                        d.listOf(proxy3);
                        throw null;
                    }
                    onFocusChangeListener = d.listOf(proxy3);
                }
                break;
            case 5:
                zn znVar5 = (zn) objArr[0];
                yg ygVar2 = (yg) objArr[1];
                Proxy proxy4 = (Proxy) objArr[2];
                int i127 = f62415j;
                int i128 = i127 & 65;
                int i129 = i127 | 65;
                int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                f62414i = i130 % 128;
                if (i130 % 2 != 0) {
                    yd ydVar = znVar5.f62419d;
                    yd.setCompoundDrawableTintBlendMode(new Object[]{znVar5.f62418c, ygVar2}, -175529290, 175529302, (int) System.currentTimeMillis());
                    List<? extends Proxy> list4 = (List) setOnFocusChangeListener(new Object[]{proxy4, ygVar2, znVar5}, -1839540985, 1839540989, (int) System.currentTimeMillis());
                    znVar5.f62420e = list4;
                    znVar5.f62421f = 0;
                    yd.setCompoundDrawableTintBlendMode(new Object[]{znVar5.f62418c, ygVar2, list4}, 1124862998, -1124862972, (int) System.currentTimeMillis());
                    return null;
                }
                yd ydVar2 = znVar5.f62419d;
                yd.setCompoundDrawableTintBlendMode(new Object[]{znVar5.f62418c, ygVar2}, -175529290, 175529302, (int) System.currentTimeMillis());
                List<? extends Proxy> list5 = (List) setOnFocusChangeListener(new Object[]{proxy4, ygVar2, znVar5}, -1839540985, 1839540989, (int) System.currentTimeMillis());
                znVar5.f62420e = list5;
                znVar5.f62421f = 0;
                yd.setCompoundDrawableTintBlendMode(new Object[]{znVar5.f62418c, ygVar2, list5}, 1124862998, -1124862972, (int) System.currentTimeMillis());
                return null;
            case 6:
                zn znVar6 = (zn) objArr[0];
                int i131 = f62414i;
                int i132 = ((i131 ^ 92) + ((i131 & 92) << 1)) - 1;
                f62415j = i132 % 128;
                Object[] objArr2 = new Object[1];
                if (i132 % 2 != 0) {
                    objArr2[0] = znVar6;
                    if (!((Boolean) setOnFocusChangeListener(objArr2, 120970691, -120970690, System.identityHashCode(znVar6))).booleanValue()) {
                        int i133 = f62415j + 15;
                        f62414i = i133 % 128;
                        int i134 = i133 % 2;
                        if (!znVar6.f62423h.isEmpty()) {
                            int i135 = f62414i;
                            int i136 = i135 & 13;
                            int i137 = -(-(i135 | 13));
                            i16 = (i136 & i137) + (i137 | i136);
                            int i138 = i16 % 128;
                            f62415j = i138;
                            if (i16 % 2 == 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            int i139 = i138 & 113;
                            int i140 = (i139 - (~((i138 ^ 113) | i139))) - 1;
                            f62414i = i140 % 128;
                            int i141 = i140 % 2;
                        } else {
                            int i142 = f62415j;
                            int i143 = (i142 | 27) << 1;
                            int i144 = -(((~i142) & 27) | (i142 & (-28)));
                            int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                            f62414i = i145 % 128;
                            int i146 = i145 % 2;
                            z10 = false;
                        }
                        if (!(!z10)) {
                            int i147 = f62414i;
                            int i148 = (i147 & (-124)) | ((~i147) & 123);
                            int i149 = -(-((i147 & 123) << 1));
                            int i150 = (i148 ^ i149) + ((i149 & i148) << 1);
                            f62415j = i150 % 128;
                            int i151 = i150 % 2;
                            onFocusChangeListener = Boolean.FALSE;
                            break;
                        }
                    }
                } else {
                    objArr2[0] = znVar6;
                    int i152 = 37 / 0;
                    if (!((Boolean) setOnFocusChangeListener(objArr2, 120970691, -120970690, System.identityHashCode(znVar6))).booleanValue()) {
                        int i1310 = f62415j + 15;
                        f62414i = i1310 % 128;
                        int i1311 = i1310 % 2;
                        if (!znVar6.f62423h.isEmpty()) {
                            int i1312 = f62414i;
                            int i1313 = i1312 & 13;
                            int i1314 = -(-(i1312 | 13));
                            i16 = (i1313 & i1314) + (i1314 | i1313);
                            int i1315 = i16 % 128;
                            f62415j = i1315;
                            if (i16 % 2 == 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            int i1316 = i1315 & 113;
                            int i1410 = (i1316 - (~((i1315 ^ 113) | i1316))) - 1;
                            f62414i = i1410 % 128;
                            int i1411 = i1410 % 2;
                        } else {
                            int i1412 = f62415j;
                            int i1413 = (i1412 | 27) << 1;
                            int i1414 = -(((~i1412) & 27) | (i1412 & (-28)));
                            int i1415 = (i1413 ^ i1414) + ((i1414 & i1413) << 1);
                            f62414i = i1415 % 128;
                            int i1416 = i1415 % 2;
                            z10 = false;
                        }
                        if (!(!z10)) {
                            int i1417 = f62414i;
                            int i1418 = (i1417 & (-124)) | ((~i1417) & 123);
                            int i1419 = -(-((i1417 & 123) << 1));
                            int i153 = (i1418 ^ i1419) + ((i1419 & i1418) << 1);
                            f62415j = i153 % 128;
                            int i154 = i153 % 2;
                            onFocusChangeListener = Boolean.FALSE;
                            break;
                        }
                    }
                }
                int i155 = f62414i;
                int i156 = ((i155 & 44) + (i155 | 44)) - 1;
                f62415j = i156 % 128;
                if (i156 % 2 == 0) {
                    int i157 = 30 / 0;
                }
                onFocusChangeListener = Boolean.TRUE;
                break;
            default:
                zn znVar7 = (zn) objArr[0];
                Proxy proxy5 = (Proxy) objArr[1];
                ArrayList arrayList3 = new ArrayList();
                znVar7.f62422g = arrayList3;
                Proxy.Type type = proxy5.type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                xh xhVar2 = znVar7.f62416a;
                if (type != type2) {
                    int i158 = f62414i;
                    int i159 = i158 ^ 31;
                    int i160 = ((i158 & 31) | i159) << 1;
                    int i161 = -i159;
                    int i162 = (i160 & i161) + (i160 | i161);
                    f62415j = i162 % 128;
                    if (i162 % 2 == 0) {
                        int i163 = 4 / 0;
                        if (proxy5.type() == Proxy.Type.SOCKS) {
                            yg ygVar3 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                            str = (String) yg.setOnFocusChangeListener(new Object[]{ygVar3}, -1565741557, 1565741570, System.identityHashCode(ygVar3));
                            yg ygVar4 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                            iIntValue = ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar4}, -2100304715, 2100304729, System.identityHashCode(ygVar4))).intValue();
                            int i164 = f62414i;
                            int i165 = ((((i164 ^ 15) | (i164 & 15)) << 1) - (~(-(((~i164) & 15) | (i164 & (-16)))))) - 1;
                            f62415j = i165 % 128;
                            int i166 = i165 % 2;
                        } else {
                            socketAddressAddress = proxy5.address();
                            if (socketAddressAddress instanceof InetSocketAddress) {
                                throw new IllegalArgumentException(Intrinsics.stringPlus("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass()).toString());
                            }
                            Intrinsics.checkNotNullExpressionValue(socketAddressAddress, "");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                            str = (String) Companion.setY(new Object[]{inetSocketAddress}, 383973853, -383973853, (int) System.currentTimeMillis());
                            iIntValue = inetSocketAddress.getPort();
                            int i167 = f62414i + 67;
                            f62415j = i167 % 128;
                            int i168 = i167 % 2;
                        }
                    } else if (proxy5.type() == Proxy.Type.SOCKS) {
                        yg ygVar5 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                        str = (String) yg.setOnFocusChangeListener(new Object[]{ygVar5}, -1565741557, 1565741570, System.identityHashCode(ygVar5));
                        yg ygVar6 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                        iIntValue = ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar6}, -2100304715, 2100304729, System.identityHashCode(ygVar6))).intValue();
                        int i169 = f62414i;
                        int i1610 = ((((i169 ^ 15) | (i169 & 15)) << 1) - (~(-(((~i169) & 15) | (i169 & (-16)))))) - 1;
                        f62415j = i1610 % 128;
                        int i1611 = i1610 % 2;
                    } else {
                        socketAddressAddress = proxy5.address();
                        if (socketAddressAddress instanceof InetSocketAddress) {
                            throw new IllegalArgumentException(Intrinsics.stringPlus("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass()).toString());
                        }
                        Intrinsics.checkNotNullExpressionValue(socketAddressAddress, "");
                        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddressAddress;
                        str = (String) Companion.setY(new Object[]{inetSocketAddress2}, 383973853, -383973853, (int) System.currentTimeMillis());
                        iIntValue = inetSocketAddress2.getPort();
                        int i1612 = f62414i + 67;
                        f62415j = i1612 % 128;
                        int i1613 = i1612 % 2;
                    }
                } else {
                    yg ygVar7 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                    str = (String) yg.setOnFocusChangeListener(new Object[]{ygVar7}, -1565741557, 1565741570, System.identityHashCode(ygVar7));
                    yg ygVar8 = (yg) xh.setOnFocusChangeListener(new Object[]{xhVar2}, -66216281, 66216289, System.identityHashCode(xhVar2));
                    iIntValue = ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar8}, -2100304715, 2100304729, System.identityHashCode(ygVar8))).intValue();
                    int i1614 = f62414i;
                    int i1615 = ((((i1614 ^ 15) | (i1614 & 15)) << 1) - (~(-(((~i1614) & 15) | (i1614 & (-16)))))) - 1;
                    f62415j = i1615 % 128;
                    int i1616 = i1615 % 2;
                }
                if (iIntValue > 0) {
                    int i170 = f62415j;
                    int i171 = i170 & 79;
                    int i172 = (~i171) & (i170 | 79);
                    int i173 = i171 << 1;
                    int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                    int i175 = i174 % 128;
                    f62414i = i175;
                    int i176 = i174 % 2;
                    if (iIntValue < 65536) {
                        int i177 = i175 & 5;
                        int i178 = (i177 - (~(-(-((i175 ^ 5) | i177))))) - 1;
                        f62415j = i178 % 128;
                        int i179 = i178 % 2;
                        int i180 = i175 & 77;
                        int i181 = i180 + ((i175 ^ 77) | i180);
                        f62415j = i181 % 128;
                        int i182 = i181 % 2;
                        if (proxy5.type() == Proxy.Type.SOCKS) {
                            int i183 = f62414i;
                            int i184 = i183 & 15;
                            int i185 = (i183 | 15) & (~i184);
                            int i186 = i184 << 1;
                            int i187 = (i185 & i186) + (i185 | i186);
                            f62415j = i187 % 128;
                            if (i187 % 2 == 0) {
                                arrayList3.add(InetSocketAddress.createUnresolved(str, iIntValue));
                                throw null;
                            }
                            arrayList3.add(InetSocketAddress.createUnresolved(str, iIntValue));
                            int i188 = f62414i + 71;
                            f62415j = i188 % 128;
                            if (i188 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        xp xpVar = znVar7.f62418c;
                        yd.setCompoundDrawableTintBlendMode(new Object[]{xpVar, str}, 1883231770, -1883231767, (int) System.currentTimeMillis());
                        List<InetAddress> y7 = ((xz) xh.setOnFocusChangeListener(new Object[]{xhVar2}, 76592507, -76592504, System.identityHashCode(xhVar2))).setY(str);
                        if (y7.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(xhVar2.setX());
                            sb3.append(" returned no addresses for ");
                            sb3.append(str);
                            throw new UnknownHostException(sb3.toString());
                        }
                        yd.setCompoundDrawableTintBlendMode(new Object[]{xpVar, str, y7}, 626425308, -626425308, (int) System.currentTimeMillis());
                        Iterator<InetAddress> it2 = y7.iterator();
                        int i189 = f62415j;
                        int i190 = i189 & 103;
                        int i191 = (i189 ^ 103) | i190;
                        int i192 = ((i190 | i191) << 1) - (i191 ^ i190);
                        f62414i = i192 % 128;
                        while (true) {
                            int i193 = i192 % 2;
                            if (!it2.hasNext()) {
                                int i194 = f62415j;
                                int i195 = (i194 & (-96)) | ((~i194) & 95);
                                int i196 = -(-((i194 & 95) << 1));
                                int i197 = (i195 ^ i196) + ((i196 & i195) << 1);
                                f62414i = i197 % 128;
                                if (i197 % 2 == 0) {
                                    return null;
                                }
                                throw null;
                            }
                            arrayList3.add(new InetSocketAddress(it2.next(), iIntValue));
                            int i198 = f62415j;
                            int i199 = i198 & 21;
                            int i200 = (i198 | 21) & (~i199);
                            int i201 = i199 << 1;
                            i192 = (i200 ^ i201) + ((i200 & i201) << 1);
                            f62414i = i192 % 128;
                        }
                    } else {
                        int i202 = i170 | 99;
                        int i203 = (i202 << 1) - (i202 & (~(i170 & 99)));
                        f62414i = i203 % 128;
                        int i204 = i203 % 2;
                    }
                } else {
                    int i205 = f62414i;
                    int i206 = ((i205 ^ 40) + ((i205 & 40) << 1)) - 1;
                    f62415j = i206 % 128;
                    int i207 = i206 % 2;
                }
                StringBuilder sb4 = new StringBuilder("No route to ");
                sb4.append(str);
                sb4.append(AbstractJsonLexerKt.COLON);
                sb4.append(iIntValue);
                sb4.append("; port is out of range");
                throw new SocketException(sb4.toString());
        }
        return onFocusChangeListener;
    }

    @NotNull
    public final setX setY() throws IOException {
        return (setX) setOnFocusChangeListener(new Object[]{this}, 1644762222, -1644762220, System.identityHashCode(this));
    }

    public static final class setX {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f62426c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f62427d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<yp> f62428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f62429b;

        public setX(@NotNull List<yp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.f62428a = list;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~i15;
            int i17 = ~i12;
            int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
            int i19 = i10 | i17;
            int i20 = (((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18;
            if (i20 != 1) {
                if (i20 != 2) {
                    setX setx = (setX) objArr[0];
                    int i21 = f62427d;
                    int i22 = (i21 & 63) + (i21 | 63);
                    f62426c = i22 % 128;
                    int i23 = i22 % 2;
                    List<yp> list = setx.f62428a;
                    if (i23 != 0) {
                        throw null;
                    }
                    int i24 = i21 & 99;
                    int i25 = i24 + ((i21 ^ 99) | i24);
                    f62426c = i25 % 128;
                    int i26 = i25 % 2;
                    return list;
                }
                setX setx2 = (setX) objArr[0];
                int i27 = f62426c;
                int i28 = (i27 ^ 59) + ((i27 & 59) << 1);
                f62427d = i28 % 128;
                int i29 = i28 % 2;
                int i30 = setx2.f62429b;
                List<yp> list2 = setx2.f62428a;
                if (i29 == 0) {
                    list2.size();
                    throw null;
                }
                if (i30 < list2.size()) {
                    int i31 = f62426c;
                    int i32 = i31 & 9;
                    int i33 = (((i31 ^ 9) | i32) << 1) - ((i31 | 9) & (~i32));
                    f62427d = i33 % 128;
                    return Boolean.valueOf(i33 % 2 != 0);
                }
                int i34 = f62427d;
                int i35 = i34 ^ 53;
                int i36 = (i34 & 53) << 1;
                int i37 = (i35 & i36) + (i36 | i35);
                f62426c = i37 % 128;
                int i38 = i37 % 2;
                return Boolean.FALSE;
            }
            setX setx3 = (setX) objArr[0];
            int i39 = f62426c;
            int i40 = (i39 ^ 71) + ((i39 & 71) << 1);
            f62427d = i40 % 128;
            int i41 = i40 % 2;
            if (!((Boolean) setOnFocusChangeListener(new Object[]{setx3}, 1465233870, -1465233868, System.identityHashCode(setx3))).booleanValue()) {
                throw new NoSuchElementException();
            }
            List<yp> list3 = setx3.f62428a;
            int i42 = setx3.f62429b;
            int iIdentityHashCode = System.identityHashCode(setx3);
            int i43 = -(-(i42 * 713));
            int i44 = (-711) & i43;
            int i45 = (((((-711) ^ i43) | i44) << 1) - (~(-((i43 | (-711)) & (~i44))))) - 1;
            int i46 = ~i42;
            int i47 = i46 & (i46 | i42);
            int i48 = i47 & 1;
            int i49 = ~(i48 | ((~i48) & (i47 | 1)));
            int i50 = ~iIdentityHashCode;
            int i51 = (i50 | iIdentityHashCode) & i50;
            int i52 = ~(i51 | 1);
            int i53 = i49 & i52;
            int i54 = (i49 | i52) & (~i53);
            int i55 = ((i54 & i53) | (i54 ^ i53)) * (-712);
            int i56 = (i45 & i55) + (i55 | i45);
            int i57 = (i47 ^ i51) | (i47 & i51);
            int i58 = (i57 & (-2)) | ((~i57) & 1);
            int i59 = i57 & 1;
            int i60 = ~((i59 & i58) | (i58 ^ i59));
            int i61 = (i42 ^ 1) | (i42 & 1);
            int i62 = i61 & iIdentityHashCode;
            int i63 = ~(((iIdentityHashCode | i61) & (~i62)) | i62);
            int i64 = -(-(((i63 & i60) | (i60 ^ i63)) * (-712)));
            int i65 = i56 & i64;
            int i66 = ((i56 ^ i64) | i65) << 1;
            int i67 = -((i64 | i56) & (~i65));
            int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
            int i69 = ~((i50 ^ 1) | (i50 & 1));
            int i70 = ((~i69) & i47) | ((~i47) & i69);
            int i71 = i69 & i47;
            int i72 = ((i71 & i70) | (i70 ^ i71)) * 712;
            int i73 = i68 & i72;
            int i74 = -(-((i72 ^ i68) | i73));
            setx3.f62429b = (i73 & i74) + (i74 | i73);
            yp ypVar = list3.get(i42);
            int i75 = f62427d;
            int i76 = ((i75 ^ 39) | (i75 & 39)) << 1;
            int i77 = -(((~i75) & 39) | (i75 & (-40)));
            int i78 = ((i76 | i77) << 1) - (i77 ^ i76);
            f62426c = i78 % 128;
            if (i78 % 2 == 0) {
                return ypVar;
            }
            throw null;
        }

        @NotNull
        public final List<yp> setCompoundDrawableTintBlendMode() {
            return (List) setOnFocusChangeListener(new Object[]{this}, -53093307, 53093307, System.identityHashCode(this));
        }

        public final boolean setX() {
            return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1465233870, -1465233868, System.identityHashCode(this))).booleanValue();
        }

        @NotNull
        public final yp setOnFocusChangeListener() {
            return (yp) setOnFocusChangeListener(new Object[]{this}, -943404049, 943404050, System.identityHashCode(this));
        }
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 2116206812, -2116206806, System.identityHashCode(this))).booleanValue();
    }
}
