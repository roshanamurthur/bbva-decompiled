package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/mj;", "", "Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;", "p0", "", "p1", "", "p2", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;Ljava/lang/String;)V", "", "setY", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "", "", "Lcom/mypinpad/tsdk/i/setLinksClickable;", "Lcom/mypinpad/tsdk/i/component27;", "setDividerPadding", "([BJLcom/mypinpad/tsdk/i/setLinksClickable;)Lcom/mypinpad/tsdk/i/component27;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class mj {

    @NotNull
    public static final mj INSTANCE = new mj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57088a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57089b = 1;

    static {
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = 1486151969 ^ iCurrentTimeMillis;
        int i11 = ~iCurrentTimeMillis;
        int i12 = 1486151969 & iCurrentTimeMillis;
        int i13 = -(-(((i10 & i12) | (i10 ^ i12)) * (-50)));
        int i14 = (-2016069911) ^ i13;
        int i15 = (i13 & (-2016069911)) << 1;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = ~((iCurrentTimeMillis & (-268443649)) | ((-268443649) ^ iCurrentTimeMillis));
        int i18 = (-273169611) & i11;
        int i19 = (~i18) & ((-273169611) | i11);
        int i20 = (i18 & i19) | (i19 ^ i18);
        int i21 = ((-1486151970) & i20) | ((~i20) & 1486151969);
        int i22 = i20 & 1486151969;
        int i23 = ~((i22 & i21) | (i21 ^ i22));
        int i24 = -(-(((i17 & i23) | (i17 ^ i23)) * 50));
        int i25 = i16 & i24;
        int i26 = (i24 ^ i16) | i25;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        int i28 = ~(((-273169611) ^ i11) | ((-273169611) & i11));
        int i29 = i28 ^ 4725962;
        int i30 = i28 & 4725962;
        int i31 = (i30 & i29) | (i29 ^ i30);
        int i32 = i11 ^ 1486151969;
        int i33 = 1486151969 & i11;
        int i34 = ~((i33 & i32) | (i32 ^ i33));
        int i35 = ((~i34) & i31) | ((~i31) & i34);
        int i36 = i31 & i34;
        int i37 = ((i36 & i35) | (i35 ^ i36)) * 50;
        int i38 = i27 ^ i37;
        int i39 = ((i37 & i27) | i38) << 1;
        int i40 = -i38;
        int i41 = (i39 & i40) + (i39 | i40);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i42 = ~iCurrentTimeMillis2;
        int i43 = ((-87166139) & i42) | (87166138 & iCurrentTimeMillis2);
        int i44 = (-87166139) & iCurrentTimeMillis2;
        int i45 = ((-1) << 1) - (((-1302529769) - (~(-(~(((i43 & i44) | (i43 ^ i44)) * (-859)))))) ^ (-1));
        int i46 = ~((i42 & (-87166139)) | (i42 ^ (-87166139)));
        int i47 = ~(2101325311 | iCurrentTimeMillis2);
        int i48 = i46 & i47;
        int i49 = (i46 | i47) & (~i48);
        int i50 = ((-1) << 1) - ((i45 - (~(-(-(((i49 & i48) | (i49 ^ i48)) * 859))))) ^ (-1));
        int i51 = ~iCurrentTimeMillis2;
        int i52 = (i51 & 2098178557) | (2098178557 ^ i51);
        int i53 = (i52 | (~i52)) & (~i52);
        int i54 = i53 ^ 3146754;
        int i55 = i53 & 3146754;
        int i56 = ((i55 & i54) | (i54 ^ i55)) * 859;
        if (i41 > ((((i50 ^ i56) | (i50 & i56)) << 1) - (~(-((i56 & (~i50)) | ((~i56) & i50))))) - 1) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, @NotNull String str) {
        setX(new Object[]{sethorizontalscrollbaroverlay, str}, 1742438991, -1742438990, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) != 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            String str = (String) objArr[1];
            Throwable th2 = (Throwable) objArr[2];
            int i18 = ((-1) << 1) - ((f57088a + 70) ^ (-1));
            f57089b = i18 % 128;
            if (i18 % 2 == 0) {
                mq.INSTANCE.setY(iIntValue / 119000, str, th2);
                return null;
            }
            mq.INSTANCE.setY(((((iIntValue ^ 119000) | (iIntValue & 119000)) << 1) - (~(-(((~iIntValue) & 119000) | ((-119001) & iIntValue))))) - 1, str, th2);
            return null;
        }
        setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = (setHorizontalScrollbarOverlay) objArr[0];
        String str2 = (String) objArr[1];
        int i19 = f57088a;
        int i20 = (i19 & 3) + (i19 | 3);
        f57089b = i20 % 128;
        int i21 = i20 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ms msVar = ms.INSTANCE;
        mr mrVar = mr.setOnFocusChangeListener;
        msVar.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str2);
        int i22 = f57088a;
        int i23 = (i22 ^ 63) + ((i22 & 63) << 1);
        f57089b = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public static void setY(int p4, @Nullable String p10, @Nullable Throwable p11) {
        setX(new Object[]{Integer.valueOf(p4), p10, p11}, 1488875720, -1488875720, p4);
    }

    @Nullable
    public final synchronized component27 setDividerPadding(@NotNull byte[] p4, long p10, @NotNull setLinksClickable p11) {
        int i10 = f57088a + 77;
        f57089b = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p11, "");
        nf nfVar = nf.setOnFocusChangeListener;
        setSecondaryProgress setsecondaryprogress = (setSecondaryProgress) nf.setCompoundDrawableTintBlendMode(new Object[0], 1091921433, -1091921433, (int) System.currentTimeMillis());
        if (setsecondaryprogress == null) {
            int i12 = f57089b;
            int i13 = ((i12 & (-108)) | ((~i12) & 107)) + ((i12 & 107) << 1);
            f57088a = i13 % 128;
            int i14 = i13 % 2;
            return null;
        }
        int i15 = f57089b;
        int i16 = (i15 & 63) + (i15 | 63);
        f57088a = i16 % 128;
        int i17 = i16 % 2;
        component27 compoundDrawableTintBlendMode = setsecondaryprogress.setCompoundDrawableTintBlendMode(p4, p10, p11);
        int i18 = f57089b + 77;
        f57088a = i18 % 128;
        int i19 = i18 % 2;
        return compoundDrawableTintBlendMode;
    }
}
