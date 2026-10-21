package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/ys;", "Lcom/mypinpad/tsdk/i/xo;", "Lcom/mypinpad/tsdk/i/yp;", "p0", "Lcom/mypinpad/tsdk/i/yr;", "p1", "Lcom/mypinpad/tsdk/i/yk;", "setY", "(Lcom/mypinpad/tsdk/i/yp;Lcom/mypinpad/tsdk/i/yr;)Lcom/mypinpad/tsdk/i/yk;"}, k = 1, mv = {1, 6, 0})
public final class ys implements xo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62200b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62201c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final xz f62202a;

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            setOnFocusChangeListener = iArr;
            int i10 = 49 << 1;
            int i11 = -49;
            int i12 = (i10 & i11) + (i11 | i10);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }
    }

    public ys(xz xzVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        xzVar = (i10 & 1) != 0 ? xz.setOnFocusChangeListener : xzVar;
        Intrinsics.checkNotNullParameter(xzVar, "");
        this.f62202a = xzVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0068 A[PHI: r11
      0x0068: PHI (r11v25 java.net.Proxy$Type) = (r11v24 java.net.Proxy$Type), (r11v28 java.net.Proxy$Type) binds: [B:10:0x0058, B:7:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0244  */
    /* JADX WARN: Code duplicated, block: B:45:0x0270  */
    /* JADX WARN: Code duplicated, block: B:47:0x0288  */
    /* JADX WARN: Code duplicated, block: B:52:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:63:0x030e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0314  */
    /* JADX WARN: Code duplicated, block: B:70:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x049e  */
    /* JADX WARN: Code duplicated, block: B:75:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:77:0x055a  */
    /* JADX WARN: Code duplicated, block: B:87:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0484 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r14v16, types: [int] */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        ?? r10;
        Proxy proxy;
        xv xvVar;
        xh xhVar;
        xz xzVar;
        int i13;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        int i14;
        String str;
        int i15;
        SocketAddress socketAddressAddress;
        int i16;
        Proxy.Type type;
        int i17;
        int i18;
        int i19 = ~((~i10) | (~i11));
        int i20 = ~i12;
        int i21 = i10 | i11;
        int i22 = 2;
        boolean z10 = false;
        int i23 = 1;
        if (((~i21) * 828) + ((i21 | i20) * (-828)) + ((i19 | (~(i20 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829) != 1) {
            Proxy proxy2 = (Proxy) objArr[0];
            yg ygVar = (yg) objArr[1];
            xz xzVar2 = (xz) objArr[2];
            int i24 = f62201c + 77;
            f62200b = i24 % 128;
            if (i24 % 2 != 0) {
                type = proxy2.type();
                int i25 = 52 / 0;
                if (type == null) {
                    int i26 = f62200b;
                    int i27 = i26 & 123;
                    int i28 = i27 + ((i26 ^ 123) | i27);
                    f62201c = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    i17 = setOnFocusChangeListener.setOnFocusChangeListener[type.ordinal()];
                    i18 = f62201c;
                    int i30 = (-2) - ((i18 + 110) ^ (-1));
                    f62200b = i30 % 128;
                    int i31 = i30 % 2;
                    if (i17 == 1) {
                        int i32 = (((i18 | 75) << 1) - (~(-((i18 & (-76)) | ((~i18) & 75))))) - 1;
                        f62200b = i32 % 128;
                        int i33 = i32 % 2;
                        InetAddress inetAddress = (InetAddress) CollectionsKt___CollectionsKt.first((List) xzVar2.setY((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar))));
                        int i34 = f62201c + 15;
                        f62200b = i34 % 128;
                        int i35 = i34 % 2;
                        return inetAddress;
                    }
                }
            } else {
                type = proxy2.type();
                if (type == null) {
                    int i210 = f62200b;
                    int i211 = i210 & 123;
                    int i212 = i211 + ((i210 ^ 123) | i211);
                    f62201c = i212 % 128;
                    int i213 = i212 % 2;
                } else {
                    i17 = setOnFocusChangeListener.setOnFocusChangeListener[type.ordinal()];
                    i18 = f62201c;
                    int i36 = (-2) - ((i18 + 110) ^ (-1));
                    f62200b = i36 % 128;
                    int i37 = i36 % 2;
                    if (i17 == 1) {
                        int i38 = (((i18 | 75) << 1) - (~(-((i18 & (-76)) | ((~i18) & 75))))) - 1;
                        f62200b = i38 % 128;
                        int i39 = i38 % 2;
                        InetAddress inetAddress2 = (InetAddress) CollectionsKt___CollectionsKt.first((List) xzVar2.setY((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar))));
                        int i310 = f62201c + 15;
                        f62200b = i310 % 128;
                        int i311 = i310 % 2;
                        return inetAddress2;
                    }
                }
            }
            SocketAddress socketAddressAddress2 = proxy2.address();
            if (socketAddressAddress2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
            }
            InetAddress address = ((InetSocketAddress) socketAddressAddress2).getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "");
            int i40 = f62200b;
            int i41 = i40 & 23;
            int i42 = (i40 | 23) & (~i41);
            int i43 = -(-(i41 << 1));
            int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
            f62201c = i44 % 128;
            int i45 = i44 % 2;
            return address;
        }
        ys ysVar = (ys) objArr[0];
        yp ypVar = (yp) objArr[1];
        yr yrVar = (yr) objArr[2];
        int i46 = f62201c;
        int i47 = ((i46 & (-20)) | ((~i46) & 19)) + ((i46 & 19) << 1);
        f62200b = i47 % 128;
        int i48 = i47 % 2;
        Intrinsics.checkNotNullParameter(yrVar, "");
        List list = (List) yr.setX(new Object[]{yrVar}, 1766995847, -1766995845, System.identityHashCode(yrVar));
        yk ykVar = (yk) yr.setX(new Object[]{yrVar}, -504719753, 504719763, System.identityHashCode(yrVar));
        yg ygVar2 = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar));
        if (((Integer) yr.setX(new Object[]{yrVar}, 151122101, -151122100, System.identityHashCode(yrVar))).intValue() == 407) {
            int i49 = f62201c;
            int i50 = (i49 ^ 27) + ((i49 & 27) << 1);
            f62200b = i50 % 128;
            int i51 = i50 % 2;
            int i52 = (i49 & 63) + (i49 | 63);
            f62200b = i52 % 128;
            int i53 = i52 % 2;
            r10 = true;
        } else {
            int i54 = f62200b;
            int i55 = i54 & 89;
            int i56 = -(-((i54 ^ 89) | i55));
            int i57 = (i55 & i56) + (i56 | i55);
            f62201c = i57 % 128;
            int i58 = i57 % 2;
            r10 = false;
        }
        if (ypVar == null) {
            int i59 = f62200b;
            int i60 = ((i59 | 57) << 1) - (i59 ^ 57);
            int i61 = i60 % 128;
            f62201c = i61;
            int i62 = i60 % 2;
            int i63 = ((i61 ^ 56) + ((i61 & 56) << 1)) - 1;
            f62200b = i63 % 128;
            int i64 = i63 % 2;
            proxy = null;
        } else {
            proxy = (Proxy) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 250524162, -250524162, System.identityHashCode(ypVar));
            int i65 = f62201c;
            int i66 = i65 & 27;
            int i67 = (((i65 ^ 27) | i66) << 1) - ((i65 | 27) & (~i66));
            f62200b = i67 % 128;
            int i68 = i67 % 2;
        }
        if (proxy == null) {
            int i69 = f62201c;
            int i70 = ((i69 | 35) << 1) - (i69 ^ 35);
            f62200b = i70 % 128;
            if (i70 % 2 != 0) {
                proxy = Proxy.NO_PROXY;
                int i71 = 51 / 0;
            } else {
                proxy = Proxy.NO_PROXY;
            }
        }
        Iterator it = list.iterator();
        int i72 = f62201c + 111;
        f62200b = i72 % 128;
        int i73 = i72 % 2;
        while (it.hasNext()) {
            int i74 = (-2) - ((f62200b + 58) ^ (-1));
            f62201c = i74 % 128;
            if (i74 % i22 == 0) {
                xvVar = (xv) it.next();
                Object[] objArr2 = new Object[i23];
                objArr2[z10 ? 1 : 0] = xvVar;
                i23 = 1;
                i23 = 1;
                if (!l.equals("Basic", (String) xv.setDividerPadding(objArr2, 1571571604, -1571571603, System.identityHashCode(xvVar)), z10)) {
                    i22 = 2;
                } else {
                    if (ypVar == null) {
                        int i75 = f62201c;
                        int i76 = (((i75 ^ 81) | (i75 & 81)) << i23) - (((~i75) & 81) | (i75 & (-82)));
                        int i77 = i76 % 128;
                        f62200b = i77;
                        int i78 = i76 % 2;
                        int i79 = i77 | 109;
                        int i80 = i79 << 1;
                        int i81 = -((~(i77 & 109)) & i79);
                        int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                        f62201c = i82 % 128;
                        int i83 = i82 % 2;
                    } else {
                        Object[] objArr3 = new Object[i23];
                        objArr3[0] = ypVar;
                        xhVar = (xh) yp.setCompoundDrawableTintBlendMode(objArr3, 204812250, -204812248, System.identityHashCode(ypVar));
                        if (xhVar == null) {
                            int i84 = f62200b;
                            int i85 = i84 & 119;
                            int i86 = -(-((i84 ^ 119) | i85));
                            i13 = ((i85 | i86) << 1) - (i86 ^ i85);
                            f62201c = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            xzVar = (xz) xh.setOnFocusChangeListener(new Object[]{xhVar}, 76592507, -76592504, System.identityHashCode(xhVar));
                            int i87 = f62201c;
                            int i88 = i87 & 107;
                            int i89 = ((i87 ^ 107) | i88) << 1;
                            int i90 = -((i87 | 107) & (~i88));
                            int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
                            f62200b = i91 % 128;
                            int i92 = i91 % 2;
                        }
                        if (xzVar == null) {
                            int i93 = f62201c;
                            i16 = ((i93 | 113) << 1) - (i93 ^ 113);
                            f62200b = i16 % 128;
                            if (i16 % 2 == 0) {
                                xz xzVar3 = ysVar.f62202a;
                                throw null;
                            }
                            xzVar = ysVar.f62202a;
                        }
                        if (r10 == true) {
                            int i94 = f62201c;
                            i15 = ((i94 & (-24)) | (23 & (~i94))) + ((i94 & 23) << 1);
                            f62200b = i15 % 128;
                            if (i15 % 2 == 0) {
                                proxy.address();
                                throw null;
                            }
                            socketAddressAddress = proxy.address();
                            if (socketAddressAddress != null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                            }
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                            String hostName = inetSocketAddress.getHostName();
                            Intrinsics.checkNotNullExpressionValue(proxy, "");
                            passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), inetSocketAddress.getPort(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.PROXY);
                            int i95 = f62201c;
                            int i96 = i95 | 7;
                            int i97 = (i96 << 1) - ((~(i95 & 7)) & i96);
                            f62200b = i97 % 128;
                            int i98 = i97 % 2;
                        } else {
                            String str2 = (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2));
                            Intrinsics.checkNotNullExpressionValue(proxy, "");
                            passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(str2, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.SERVER);
                            int i99 = f62201c;
                            int i100 = (-2) - (((i99 & 32) + (i99 | 32)) ^ (-1));
                            f62200b = i100 % 128;
                            int i101 = i100 % 2;
                        }
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            i14 = f62201c;
                            int i102 = i14 & 55;
                            int i103 = ((i14 ^ 55) | i102) << 1;
                            int i104 = -((~i102) & (i14 | 55));
                            int i105 = (i103 & i104) + (i103 | i104);
                            f62200b = i105 % 128;
                            int i106 = i105 % 2;
                            if (r10 == true) {
                                int i107 = i14 & 27;
                                int i108 = -(-(i14 | 27));
                                int i109 = (i107 ^ i108) + ((i107 & i108) << 1);
                                f62200b = i109 % 128;
                                int i110 = i109 % 2;
                                int i111 = i14 + 91;
                                f62200b = i111 % 128;
                                int i112 = i111 % 2;
                                str = "Proxy-Authorization";
                            } else {
                                int i113 = i14 + 55;
                                f62200b = i113 % 128;
                                int i114 = i113 % 2;
                                str = "Authorization";
                            }
                            String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                            Intrinsics.checkNotNullExpressionValue(userName, "");
                            char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                            Intrinsics.checkNotNullExpressionValue(password, "");
                            String str3 = (String) xy.setDividerPadding(new Object[]{userName, new String(password), (Charset) xv.setDividerPadding(new Object[]{xvVar}, 1989727062, -1989727062, System.identityHashCode(xvVar))}, -841362252, 841362252, (int) System.currentTimeMillis());
                            yk.setDividerPadding setdividerpadding = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
                            yk.setDividerPadding setdividerpadding2 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding, str, str3}, 730186305, -730186291, System.identityHashCode(setdividerpadding));
                            yk ykVar2 = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding2}, 721744858, -721744846, System.identityHashCode(setdividerpadding2));
                            int i115 = f62200b;
                            int i116 = (i115 ^ 117) + ((i115 & 117) << 1);
                            f62201c = i116 % 128;
                            int i117 = i116 % 2;
                            return ykVar2;
                        }
                        it = it;
                        i22 = 2;
                        z10 = false;
                        i23 = 1;
                    }
                    xzVar = null;
                    if (xzVar == null) {
                        int i910 = f62201c;
                        i16 = ((i910 | 113) << 1) - (i910 ^ 113);
                        f62200b = i16 % 128;
                        if (i16 % 2 == 0) {
                            xz xzVar4 = ysVar.f62202a;
                            throw null;
                        }
                        xzVar = ysVar.f62202a;
                    }
                    if (r10 == true) {
                        int i911 = f62201c;
                        i15 = ((i911 & (-24)) | (23 & (~i911))) + ((i911 & 23) << 1);
                        f62200b = i15 % 128;
                        if (i15 % 2 == 0) {
                            proxy.address();
                            throw null;
                        }
                        socketAddressAddress = proxy.address();
                        if (socketAddressAddress != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                        }
                        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) socketAddressAddress;
                        String hostName2 = inetSocketAddress2.getHostName();
                        Intrinsics.checkNotNullExpressionValue(proxy, "");
                        passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName2, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), inetSocketAddress2.getPort(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.PROXY);
                        int i912 = f62201c;
                        int i913 = i912 | 7;
                        int i914 = (i913 << 1) - ((~(i912 & 7)) & i913);
                        f62200b = i914 % 128;
                        int i915 = i914 % 2;
                    } else {
                        String str4 = (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2));
                        Intrinsics.checkNotNullExpressionValue(proxy, "");
                        passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(str4, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.SERVER);
                        int i916 = f62201c;
                        int i1010 = (-2) - (((i916 & 32) + (i916 | 32)) ^ (-1));
                        f62200b = i1010 % 128;
                        int i1011 = i1010 % 2;
                    }
                    if (passwordAuthenticationRequestPasswordAuthentication != null) {
                        i14 = f62201c;
                        int i1012 = i14 & 55;
                        int i1013 = ((i14 ^ 55) | i1012) << 1;
                        int i1014 = -((~i1012) & (i14 | 55));
                        int i1015 = (i1013 & i1014) + (i1013 | i1014);
                        f62200b = i1015 % 128;
                        int i1016 = i1015 % 2;
                        if (r10 == true) {
                            int i1017 = i14 & 27;
                            int i1018 = -(-(i14 | 27));
                            int i1019 = (i1017 ^ i1018) + ((i1017 & i1018) << 1);
                            f62200b = i1019 % 128;
                            int i118 = i1019 % 2;
                            int i119 = i14 + 91;
                            f62200b = i119 % 128;
                            int i1110 = i119 % 2;
                            str = "Proxy-Authorization";
                        } else {
                            int i1111 = i14 + 55;
                            f62200b = i1111 % 128;
                            int i1112 = i1111 % 2;
                            str = "Authorization";
                        }
                        String userName2 = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                        Intrinsics.checkNotNullExpressionValue(userName2, "");
                        char[] password2 = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                        Intrinsics.checkNotNullExpressionValue(password2, "");
                        String str5 = (String) xy.setDividerPadding(new Object[]{userName2, new String(password2), (Charset) xv.setDividerPadding(new Object[]{xvVar}, 1989727062, -1989727062, System.identityHashCode(xvVar))}, -841362252, 841362252, (int) System.currentTimeMillis());
                        yk.setDividerPadding setdividerpadding3 = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
                        yk.setDividerPadding setdividerpadding4 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding3, str, str5}, 730186305, -730186291, System.identityHashCode(setdividerpadding3));
                        yk ykVar3 = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding4}, 721744858, -721744846, System.identityHashCode(setdividerpadding4));
                        int i1113 = f62200b;
                        int i1114 = (i1113 ^ 117) + ((i1113 & 117) << 1);
                        f62201c = i1114 % 128;
                        int i1115 = i1114 % 2;
                        return ykVar3;
                    }
                    it = it;
                    i22 = 2;
                    z10 = false;
                    i23 = 1;
                }
            } else {
                xvVar = (xv) it.next();
                Object[] objArr4 = new Object[i23];
                objArr4[z10 ? 1 : 0] = xvVar;
                if (l.equals("Basic", (String) xv.setDividerPadding(objArr4, 1571571604, -1571571603, System.identityHashCode(xvVar)), i23)) {
                    if (ypVar == null) {
                        int i710 = f62201c;
                        int i711 = (((i710 ^ 81) | (i710 & 81)) << i23) - (((~i710) & 81) | (i710 & (-82)));
                        int i712 = i711 % 128;
                        f62200b = i712;
                        int i713 = i711 % 2;
                        int i714 = i712 | 109;
                        int i810 = i714 << 1;
                        int i811 = -((~(i712 & 109)) & i714);
                        int i812 = ((i810 | i811) << 1) - (i811 ^ i810);
                        f62201c = i812 % 128;
                        int i813 = i812 % 2;
                    } else {
                        Object[] objArr5 = new Object[i23];
                        objArr5[0] = ypVar;
                        xhVar = (xh) yp.setCompoundDrawableTintBlendMode(objArr5, 204812250, -204812248, System.identityHashCode(ypVar));
                        if (xhVar == null) {
                            int i814 = f62200b;
                            int i815 = i814 & 119;
                            int i816 = -(-((i814 ^ 119) | i815));
                            i13 = ((i815 | i816) << 1) - (i816 ^ i815);
                            f62201c = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            xzVar = (xz) xh.setOnFocusChangeListener(new Object[]{xhVar}, 76592507, -76592504, System.identityHashCode(xhVar));
                            int i817 = f62201c;
                            int i818 = i817 & 107;
                            int i819 = ((i817 ^ 107) | i818) << 1;
                            int i917 = -((i817 | 107) & (~i818));
                            int i918 = ((i819 | i917) << 1) - (i917 ^ i819);
                            f62200b = i918 % 128;
                            int i919 = i918 % 2;
                        }
                        if (xzVar == null) {
                            int i9110 = f62201c;
                            i16 = ((i9110 | 113) << 1) - (i9110 ^ 113);
                            f62200b = i16 % 128;
                            if (i16 % 2 == 0) {
                                xz xzVar5 = ysVar.f62202a;
                                throw null;
                            }
                            xzVar = ysVar.f62202a;
                        }
                        if (r10 == true) {
                            int i9111 = f62201c;
                            i15 = ((i9111 & (-24)) | (23 & (~i9111))) + ((i9111 & 23) << 1);
                            f62200b = i15 % 128;
                            if (i15 % 2 == 0) {
                                proxy.address();
                                throw null;
                            }
                            socketAddressAddress = proxy.address();
                            if (socketAddressAddress != null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                            }
                            InetSocketAddress inetSocketAddress3 = (InetSocketAddress) socketAddressAddress;
                            String hostName3 = inetSocketAddress3.getHostName();
                            Intrinsics.checkNotNullExpressionValue(proxy, "");
                            passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName3, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), inetSocketAddress3.getPort(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.PROXY);
                            int i9112 = f62201c;
                            int i9113 = i9112 | 7;
                            int i9114 = (i9113 << 1) - ((~(i9112 & 7)) & i9113);
                            f62200b = i9114 % 128;
                            int i9115 = i9114 % 2;
                        } else {
                            String str6 = (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2));
                            Intrinsics.checkNotNullExpressionValue(proxy, "");
                            passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(str6, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.SERVER);
                            int i9116 = f62201c;
                            int i10110 = (-2) - (((i9116 & 32) + (i9116 | 32)) ^ (-1));
                            f62200b = i10110 % 128;
                            int i10111 = i10110 % 2;
                        }
                        if (passwordAuthenticationRequestPasswordAuthentication != null) {
                            i14 = f62201c;
                            int i10112 = i14 & 55;
                            int i10113 = ((i14 ^ 55) | i10112) << 1;
                            int i10114 = -((~i10112) & (i14 | 55));
                            int i10115 = (i10113 & i10114) + (i10113 | i10114);
                            f62200b = i10115 % 128;
                            int i10116 = i10115 % 2;
                            if (r10 == true) {
                                int i10117 = i14 & 27;
                                int i10118 = -(-(i14 | 27));
                                int i10119 = (i10117 ^ i10118) + ((i10117 & i10118) << 1);
                                f62200b = i10119 % 128;
                                int i1116 = i10119 % 2;
                                int i1117 = i14 + 91;
                                f62200b = i1117 % 128;
                                int i1118 = i1117 % 2;
                                str = "Proxy-Authorization";
                            } else {
                                int i1119 = i14 + 55;
                                f62200b = i1119 % 128;
                                int i11110 = i1119 % 2;
                                str = "Authorization";
                            }
                            String userName3 = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                            Intrinsics.checkNotNullExpressionValue(userName3, "");
                            char[] password3 = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                            Intrinsics.checkNotNullExpressionValue(password3, "");
                            String str7 = (String) xy.setDividerPadding(new Object[]{userName3, new String(password3), (Charset) xv.setDividerPadding(new Object[]{xvVar}, 1989727062, -1989727062, System.identityHashCode(xvVar))}, -841362252, 841362252, (int) System.currentTimeMillis());
                            yk.setDividerPadding setdividerpadding5 = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
                            yk.setDividerPadding setdividerpadding6 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding5, str, str7}, 730186305, -730186291, System.identityHashCode(setdividerpadding5));
                            yk ykVar4 = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding6}, 721744858, -721744846, System.identityHashCode(setdividerpadding6));
                            int i11111 = f62200b;
                            int i11112 = (i11111 ^ 117) + ((i11111 & 117) << 1);
                            f62201c = i11112 % 128;
                            int i11113 = i11112 % 2;
                            return ykVar4;
                        }
                        it = it;
                        i22 = 2;
                        z10 = false;
                        i23 = 1;
                    }
                    xzVar = null;
                    if (xzVar == null) {
                        int i9117 = f62201c;
                        i16 = ((i9117 | 113) << 1) - (i9117 ^ 113);
                        f62200b = i16 % 128;
                        if (i16 % 2 == 0) {
                            xz xzVar6 = ysVar.f62202a;
                            throw null;
                        }
                        xzVar = ysVar.f62202a;
                    }
                    if (r10 == true) {
                        int i9118 = f62201c;
                        i15 = ((i9118 & (-24)) | (23 & (~i9118))) + ((i9118 & 23) << 1);
                        f62200b = i15 % 128;
                        if (i15 % 2 == 0) {
                            proxy.address();
                            throw null;
                        }
                        socketAddressAddress = proxy.address();
                        if (socketAddressAddress != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                        }
                        InetSocketAddress inetSocketAddress4 = (InetSocketAddress) socketAddressAddress;
                        String hostName4 = inetSocketAddress4.getHostName();
                        Intrinsics.checkNotNullExpressionValue(proxy, "");
                        passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName4, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), inetSocketAddress4.getPort(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.PROXY);
                        int i9119 = f62201c;
                        int i91110 = i9119 | 7;
                        int i91111 = (i91110 << 1) - ((~(i9119 & 7)) & i91110);
                        f62200b = i91111 % 128;
                        int i91112 = i91111 % 2;
                    } else {
                        String str8 = (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2));
                        Intrinsics.checkNotNullExpressionValue(proxy, "");
                        passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(str8, (InetAddress) setCompoundDrawableTintBlendMode(new Object[]{proxy, ygVar2, xzVar}, 1516135021, -1516135021, (int) System.currentTimeMillis()), ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue(), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1186564851, -1186564847, System.identityHashCode(xvVar)), (String) xv.setDividerPadding(new Object[]{xvVar}, 1571571604, -1571571603, System.identityHashCode(xvVar)), (URL) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -589980931, 589980935, System.identityHashCode(ygVar2)), Authenticator.RequestorType.SERVER);
                        int i91113 = f62201c;
                        int i101110 = (-2) - (((i91113 & 32) + (i91113 | 32)) ^ (-1));
                        f62200b = i101110 % 128;
                        int i101111 = i101110 % 2;
                    }
                    if (passwordAuthenticationRequestPasswordAuthentication != null) {
                        i14 = f62201c;
                        int i101112 = i14 & 55;
                        int i101113 = ((i14 ^ 55) | i101112) << 1;
                        int i101114 = -((~i101112) & (i14 | 55));
                        int i101115 = (i101113 & i101114) + (i101113 | i101114);
                        f62200b = i101115 % 128;
                        int i101116 = i101115 % 2;
                        if (r10 == true) {
                            int i101117 = i14 & 27;
                            int i101118 = -(-(i14 | 27));
                            int i101119 = (i101117 ^ i101118) + ((i101117 & i101118) << 1);
                            f62200b = i101119 % 128;
                            int i11114 = i101119 % 2;
                            int i11115 = i14 + 91;
                            f62200b = i11115 % 128;
                            int i11116 = i11115 % 2;
                            str = "Proxy-Authorization";
                        } else {
                            int i11117 = i14 + 55;
                            f62200b = i11117 % 128;
                            int i11118 = i11117 % 2;
                            str = "Authorization";
                        }
                        String userName4 = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                        Intrinsics.checkNotNullExpressionValue(userName4, "");
                        char[] password4 = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                        Intrinsics.checkNotNullExpressionValue(password4, "");
                        String str9 = (String) xy.setDividerPadding(new Object[]{userName4, new String(password4), (Charset) xv.setDividerPadding(new Object[]{xvVar}, 1989727062, -1989727062, System.identityHashCode(xvVar))}, -841362252, 841362252, (int) System.currentTimeMillis());
                        yk.setDividerPadding setdividerpadding7 = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
                        yk.setDividerPadding setdividerpadding8 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding7, str, str9}, 730186305, -730186291, System.identityHashCode(setdividerpadding7));
                        yk ykVar5 = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding8}, 721744858, -721744846, System.identityHashCode(setdividerpadding8));
                        int i11119 = f62200b;
                        int i111110 = (i11119 ^ 117) + ((i11119 & 117) << 1);
                        f62201c = i111110 % 128;
                        int i111111 = i111110 % 2;
                        return ykVar5;
                    }
                    it = it;
                    i22 = 2;
                    z10 = false;
                    i23 = 1;
                } else {
                    i22 = 2;
                    z10 = false;
                }
            }
        }
        int i120 = f62200b;
        int i121 = (i120 & 71) + (i120 | 71);
        f62201c = i121 % 128;
        if (i121 % 2 == 0) {
            int i122 = 15 / 0;
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.xo
    @Nullable
    public final yk setY(@Nullable yp p4, @NotNull yr p10) throws IOException {
        return (yk) setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, 836033785, -836033784, System.identityHashCode(this));
    }

    public ys() {
        this(null, 1, null);
    }
}
