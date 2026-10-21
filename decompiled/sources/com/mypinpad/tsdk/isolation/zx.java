package com.mypinpad.tsdk.isolation;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/zx;", "", "Lcom/mypinpad/tsdk/i/yk;", "p0", "Ljava/net/Proxy$Type;", "p1", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/yk;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/yg;", "(Lcom/mypinpad/tsdk/i/yg;)Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class zx {

    @NotNull
    public static final zx INSTANCE = new zx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62492a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62493b = 1;

    static {
        int i10 = f62492a + 85;
        f62493b = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0125  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object string;
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        int i18 = ((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15;
        if (i18 == 1) {
            yk ykVar = (yk) objArr[0];
            Proxy.Type type = (Proxy.Type) objArr[1];
            Intrinsics.checkNotNullParameter(ykVar, "");
            Intrinsics.checkNotNullParameter(type, "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -441618648, 441618657, System.identityHashCode(ykVar)));
            sb2.append(' ');
            if (!((Boolean) setDividerPadding(new Object[]{ykVar, type}, -974910429, 974910431, (int) System.currentTimeMillis())).booleanValue()) {
                sb2.append((String) setDividerPadding(new Object[]{(yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar))}, -1315614297, 1315614297, (int) System.currentTimeMillis()));
                int i19 = f62492a;
                int i20 = (i19 ^ 45) + ((i19 & 45) << 1);
                f62493b = i20 % 128;
                int i21 = i20 % 2;
            } else {
                int i22 = f62493b;
                int i23 = i22 & 105;
                int i24 = (i22 | 105) & (~i23);
                int i25 = i23 << 1;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f62492a = i26 % 128;
                if (i26 % 2 != 0) {
                    sb2.append((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar)));
                    throw null;
                }
                sb2.append((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar)));
            }
            sb2.append(" HTTP/1.1");
            string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i27 = f62492a;
            int i28 = (i27 & 77) + (i27 | 77);
            f62493b = i28 % 128;
            int i29 = i28 % 2;
        } else {
            if (i18 != 2) {
                yg ygVar = (yg) objArr[0];
                int i30 = f62492a;
                int i31 = i30 & 21;
                int i32 = (i31 - (~(-(-((i30 ^ 21) | i31))))) - 1;
                f62493b = i32 % 128;
                if (i32 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(ygVar, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(ygVar, "");
                String str = (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, 145484652, -145484636, System.identityHashCode(ygVar));
                String str2 = (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -237364540, 237364560, System.identityHashCode(ygVar));
                if (str2 == null) {
                    int i33 = f62493b + 99;
                    f62492a = i33 % 128;
                    if (i33 % 2 == 0) {
                        return str;
                    }
                    int i34 = 62 / 0;
                    return str;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('?');
                sb3.append((Object) str2);
                String string2 = sb3.toString();
                int i35 = f62492a;
                int i36 = ((i35 & 29) - (~(i35 | 29))) - 1;
                f62493b = i36 % 128;
                int i37 = i36 % 2;
                return string2;
            }
            yk ykVar2 = (yk) objArr[0];
            Proxy.Type type2 = (Proxy.Type) objArr[1];
            int i38 = f62493b;
            int i39 = ((i38 & 72) + (i38 | 72)) - 1;
            f62492a = i39 % 128;
            int i40 = i39 % 2;
            if (((Boolean) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2}, 570787113, -570787106, System.identityHashCode(ykVar2))).booleanValue()) {
                int i41 = f62492a;
                int i42 = (i41 | 9) << 1;
                int i43 = -(((~i41) & 9) | (i41 & (-10)));
                int i44 = (i42 & i43) + (i43 | i42);
                f62493b = i44 % 128;
                int i45 = i44 % 2;
                string = Boolean.FALSE;
            } else {
                int i46 = f62493b;
                int i47 = ((i46 ^ 93) - (~(-(-((i46 & 93) << 1))))) - 1;
                f62492a = i47 % 128;
                if (i47 % 2 != 0) {
                    Proxy.Type type3 = Proxy.Type.HTTP;
                    throw null;
                }
                if (type2 == Proxy.Type.HTTP) {
                    int i48 = f62493b;
                    int i49 = i48 & 65;
                    int i50 = -(-((i48 ^ 65) | i49));
                    int i51 = (i49 & i50) + (i50 | i49);
                    f62492a = i51 % 128;
                    int i52 = i51 % 2;
                    string = Boolean.TRUE;
                } else {
                    int i410 = f62492a;
                    int i411 = (i410 | 9) << 1;
                    int i412 = -(((~i410) & 9) | (i410 & (-10)));
                    int i413 = (i411 & i412) + (i412 | i411);
                    f62493b = i413 % 128;
                    int i414 = i413 % 2;
                    string = Boolean.FALSE;
                }
            }
        }
        return string;
    }

    @NotNull
    public static String setOnFocusChangeListener(@NotNull yg p4) {
        return (String) setDividerPadding(new Object[]{p4}, -1315614297, 1315614297, (int) System.currentTimeMillis());
    }

    @NotNull
    public static String setOnFocusChangeListener(@NotNull yk p4, @NotNull Proxy.Type p10) {
        return (String) setDividerPadding(new Object[]{p4, p10}, -36192596, 36192597, (int) System.currentTimeMillis());
    }
}
