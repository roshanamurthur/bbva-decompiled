package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class kl extends kj {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56800h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56801i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kb f56802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component17 f56803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar, @NotNull kb kbVar, @NotNull component17 component17Var) {
        super(kaVar, settextkeepstate, kwVar);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56802f = kbVar;
        this.f56803g = component17Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:13:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:15:0x0131  */
    /* JADX WARN: Code duplicated, block: B:17:0x013e  */
    /* JADX WARN: Code duplicated, block: B:19:0x015b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0182  */
    /* JADX WARN: Code duplicated, block: B:23:0x0199  */
    /* JADX WARN: Code duplicated, block: B:26:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x01e6  */
    public static /* synthetic */ void a(Object[] objArr) throws Exception {
        ka onFocusChangeListener;
        TransactionFailed transactionFailed;
        byte[] bArr;
        jy jyVar;
        ka onFocusChangeListener2;
        int i10;
        ke keVar;
        ke keVar2;
        kl klVar = (kl) objArr[0];
        int i11 = f56801i;
        int i12 = i11 & 109;
        int i13 = ((i11 | 109) & (~i12)) + (i12 << 1);
        f56800h = i13 % 128;
        int i14 = i13 % 2;
        ka onFocusChangeListener3 = klVar.setOnFocusChangeListener();
        if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener3}, 1525191230, -1525191215, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
            int i15 = f56801i + 15;
            f56800h = i15 % 128;
            if (i15 % 2 != 0) {
                ka onFocusChangeListener4 = klVar.setOnFocusChangeListener();
                TransactionFailed progressTintBlendMode = setAnimation.setProgressTintBlendMode();
                Object[] objArr2 = {onFocusChangeListener4, (String) TransactionFailed.setX(new Object[]{progressTintBlendMode}, 1914607362, -1914607356, System.identityHashCode(progressTintBlendMode))};
                int i16 = 20 / 0;
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr2, -232375606, 232375652, System.identityHashCode(onFocusChangeListener4))).booleanValue()) {
                    onFocusChangeListener = klVar.setOnFocusChangeListener();
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1717172174, 1717172411, (int) System.currentTimeMillis());
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        int i17 = f56801i;
                        int i18 = ((i17 & 27) - (~(-(-(i17 | 27))))) - 1;
                        f56800h = i18 % 128;
                        int i19 = i18 % 2;
                        ka onFocusChangeListener5 = klVar.setOnFocusChangeListener();
                        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, setAnimation.setProgressTintBlendMode()}, 1431838387, -1431838363, System.identityHashCode(onFocusChangeListener5));
                        bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                        if (bArr.length == 1) {
                            int i20 = f56801i + 121;
                            f56800h = i20 % 128;
                            int i21 = i20 % 2;
                            if (bArr[0] == 2) {
                                jyVar = new jy(klVar.setOnFocusChangeListener());
                                if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{jyVar}, 252497730, -252497710, System.identityHashCode(jyVar))).length > 3) {
                                    int i22 = f56800h;
                                    int i23 = ((i22 | 67) << 1) - (i22 ^ 67);
                                    f56801i = i23 % 128;
                                    int i24 = i23 % 2;
                                    onFocusChangeListener2 = klVar.setOnFocusChangeListener();
                                    if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener2}, 1525191230, -1525191215, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                                        i10 = f56801i + 85;
                                        f56800h = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            keVar2 = (ke) ((setImageTintList) w.setX(new Object[]{jyVar}, 1693919772, -1693919769, System.identityHashCode(jyVar)));
                                            int i25 = 69 / 0;
                                            if (((Boolean) ke.setY(new Object[]{keVar2}, -256456682, 256456682, System.identityHashCode(keVar2))).booleanValue()) {
                                                ka onFocusChangeListener6 = klVar.setOnFocusChangeListener();
                                                ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener6, Boolean.TRUE}, 165395401, -165395399, System.identityHashCode(onFocusChangeListener6));
                                                int i26 = f56801i;
                                                int i27 = i26 & 93;
                                                int i28 = i27 + ((i26 ^ 93) | i27);
                                                f56800h = i28 % 128;
                                                int i29 = i28 % 2;
                                            }
                                        } else {
                                            keVar = (ke) ((setImageTintList) w.setX(new Object[]{jyVar}, 1693919772, -1693919769, System.identityHashCode(jyVar)));
                                            if (!(!((Boolean) ke.setY(new Object[]{keVar}, -256456682, 256456682, System.identityHashCode(keVar))).booleanValue())) {
                                                ka onFocusChangeListener7 = klVar.setOnFocusChangeListener();
                                                ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener7, Boolean.TRUE}, 165395401, -165395399, System.identityHashCode(onFocusChangeListener7));
                                                int i210 = f56801i;
                                                int i211 = i210 & 93;
                                                int i212 = i211 + ((i210 ^ 93) | i211);
                                                f56800h = i212 % 128;
                                                int i213 = i212 % 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                ka onFocusChangeListener8 = klVar.setOnFocusChangeListener();
                TransactionFailed progressTintBlendMode2 = setAnimation.setProgressTintBlendMode();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener8, (String) TransactionFailed.setX(new Object[]{progressTintBlendMode2}, 1914607362, -1914607356, System.identityHashCode(progressTintBlendMode2))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener8))).booleanValue()) {
                    onFocusChangeListener = klVar.setOnFocusChangeListener();
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1717172174, 1717172411, (int) System.currentTimeMillis());
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        int i110 = f56801i;
                        int i111 = ((i110 & 27) - (~(-(-(i110 | 27))))) - 1;
                        f56800h = i111 % 128;
                        int i112 = i111 % 2;
                        ka onFocusChangeListener9 = klVar.setOnFocusChangeListener();
                        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, setAnimation.setProgressTintBlendMode()}, 1431838387, -1431838363, System.identityHashCode(onFocusChangeListener9));
                        bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                        if (bArr.length == 1) {
                            int i214 = f56801i + 121;
                            f56800h = i214 % 128;
                            int i215 = i214 % 2;
                            if (bArr[0] == 2) {
                                jyVar = new jy(klVar.setOnFocusChangeListener());
                                if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{jyVar}, 252497730, -252497710, System.identityHashCode(jyVar))).length > 3) {
                                    int i216 = f56800h;
                                    int i217 = ((i216 | 67) << 1) - (i216 ^ 67);
                                    f56801i = i217 % 128;
                                    int i218 = i217 % 2;
                                    onFocusChangeListener2 = klVar.setOnFocusChangeListener();
                                    if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener2}, 1525191230, -1525191215, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                                        i10 = f56801i + 85;
                                        f56800h = i10 % 128;
                                        if (i10 % 2 != 0) {
                                            keVar2 = (ke) ((setImageTintList) w.setX(new Object[]{jyVar}, 1693919772, -1693919769, System.identityHashCode(jyVar)));
                                            int i219 = 69 / 0;
                                            if (((Boolean) ke.setY(new Object[]{keVar2}, -256456682, 256456682, System.identityHashCode(keVar2))).booleanValue()) {
                                                ka onFocusChangeListener10 = klVar.setOnFocusChangeListener();
                                                ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener10, Boolean.TRUE}, 165395401, -165395399, System.identityHashCode(onFocusChangeListener10));
                                                int i2110 = f56801i;
                                                int i2111 = i2110 & 93;
                                                int i2112 = i2111 + ((i2110 ^ 93) | i2111);
                                                f56800h = i2112 % 128;
                                                int i2113 = i2112 % 2;
                                            }
                                        } else {
                                            keVar = (ke) ((setImageTintList) w.setX(new Object[]{jyVar}, 1693919772, -1693919769, System.identityHashCode(jyVar)));
                                            if (!(!((Boolean) ke.setY(new Object[]{keVar}, -256456682, 256456682, System.identityHashCode(keVar))).booleanValue())) {
                                                ka onFocusChangeListener11 = klVar.setOnFocusChangeListener();
                                                ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener11, Boolean.TRUE}, 165395401, -165395399, System.identityHashCode(onFocusChangeListener11));
                                                int i2114 = f56801i;
                                                int i2115 = i2114 & 93;
                                                int i2116 = i2115 + ((i2114 ^ 93) | i2115);
                                                f56800h = i2116 % 128;
                                                int i2117 = i2116 % 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i30 = f56801i;
        int i31 = (i30 ^ 125) + ((i30 & 125) << 1);
        f56800h = i31 % 128;
        int i32 = i31 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00de A[PHI: r5 r7
      0x00de: PHI (r5v23 java.lang.String) = (r5v15 java.lang.String), (r5v66 java.lang.String) binds: [B:11:0x00dc, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r7v18 com.mypinpad.tsdk.i.getBeepOnFailure) = (r7v6 com.mypinpad.tsdk.i.getBeepOnFailure), (r7v31 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:11:0x00dc, B:8:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0166  */
    /* JADX WARN: Code duplicated, block: B:18:0x018c  */
    /* JADX WARN: Code duplicated, block: B:20:0x019a  */
    /* JADX WARN: Code duplicated, block: B:22:0x020a  */
    /* JADX WARN: Code duplicated, block: B:36:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0102 A[SYNTHETIC] */
    public static /* synthetic */ void b(Object[] objArr) throws Exception {
        getBeepOnFailure next;
        String str;
        ka onFocusChangeListener;
        getBeepOnFailure getbeeponfailure;
        int iIntValue;
        int iIntValue2;
        getBeepOnFailure navigationOnClickListener;
        int i10;
        kl klVar = (kl) objArr[0];
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[1];
        int i11 = f56800h;
        int i12 = i11 & 53;
        int i13 = ((i11 ^ 53) | i12) << 1;
        int i14 = -((i11 | 53) & (~i12));
        int i15 = (i13 & i14) + (i14 | i13);
        f56801i = i15 % 128;
        int i16 = i15 % 2;
        Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
        int i17 = f56801i + 125;
        f56800h = i17 % 128;
        int i18 = i17 % 2;
        while (it.hasNext()) {
            int i19 = f56801i;
            int i20 = (((i19 | 18) << 1) - (i19 ^ 18)) - 1;
            f56800h = i20 % 128;
            if (i20 % 2 != 0) {
                next = it.next();
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                ka onFocusChangeListener2 = klVar.setOnFocusChangeListener();
                int i21 = 96 / 0;
                if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, str}, -422205110, 422205136, System.identityHashCode(onFocusChangeListener2))).booleanValue())) {
                    onFocusChangeListener = klVar.setOnFocusChangeListener();
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, str}, 1014467290, -1014467254, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        ka onFocusChangeListener3 = klVar.setOnFocusChangeListener();
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, str}, 1249644233, -1249644202, System.identityHashCode(onFocusChangeListener3));
                        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
                        iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue();
                        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue();
                        if (iIntValue == iIntValue2) {
                            int i22 = f56801i;
                            int i23 = (((i22 ^ 115) | (i22 & 115)) << 1) - (((~i22) & 115) | (i22 & (-116)));
                            int i24 = i23 % 128;
                            f56800h = i24;
                            int i25 = i23 % 2;
                            int i26 = i24 ^ 49;
                            int i27 = ((i24 & 49) | i26) << 1;
                            int i28 = -i26;
                            int i29 = (i27 & i28) + (i27 | i28);
                            f56801i = i29 % 128;
                            int i30 = i29 % 2;
                        } else {
                            if (iIntValue > iIntValue2) {
                                int i31 = f56800h;
                                int i32 = ((~i31) & 9) | (i31 & (-10));
                                int i33 = -(-((i31 & 9) << 1));
                                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                                f56801i = i34 % 128;
                                int i35 = i34 % 2;
                                navigationOnClickListener = next.setNavigationOnClickListener();
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, (byte[]) ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).clone()}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                setImageTintList.setX(new Object[]{(setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 1115257939, -1115257923, System.identityHashCode(navigationOnClickListener)), Integer.valueOf(iIntValue)}, -2003004454, 2003004454, iIntValue);
                                int i36 = f56800h;
                                i10 = ((i36 ^ 42) + ((i36 & 42) << 1)) - 1;
                                f56801i = i10 % 128;
                            } else {
                                navigationOnClickListener = next.setNavigationOnClickListener();
                                byte[] bArrCopyOf = Arrays.copyOf((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), iIntValue);
                                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArrCopyOf}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                int i37 = f56801i;
                                int i38 = i37 & 117;
                                i10 = (i38 - (~(-(-((i37 ^ 117) | i38))))) - 1;
                                f56800h = i10 % 128;
                            }
                            int i39 = i10 % 2;
                            getbeeponfailure = navigationOnClickListener;
                        }
                        ka onFocusChangeListener4 = klVar.setOnFocusChangeListener();
                        ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener4, getbeeponfailure}, -1412399391, 1412399402, System.identityHashCode(onFocusChangeListener4));
                        int i40 = f56801i;
                        int i41 = ((i40 ^ 15) - (~((i40 & 15) << 1))) - 1;
                        f56800h = i41 % 128;
                        int i42 = i41 % 2;
                    }
                }
            } else {
                next = it.next();
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                ka onFocusChangeListener5 = klVar.setOnFocusChangeListener();
                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, str}, -422205110, 422205136, System.identityHashCode(onFocusChangeListener5))).booleanValue()) {
                    onFocusChangeListener = klVar.setOnFocusChangeListener();
                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener, str}, 1014467290, -1014467254, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                        ka onFocusChangeListener6 = klVar.setOnFocusChangeListener();
                        getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, str}, 1249644233, -1249644202, System.identityHashCode(onFocusChangeListener6));
                        setImageTintList setimagetintlist3 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
                        iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist3}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist3))).intValue();
                        setImageTintList setimagetintlist4 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist4}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist4))).intValue();
                        if (iIntValue == iIntValue2) {
                            int i210 = f56801i;
                            int i211 = (((i210 ^ 115) | (i210 & 115)) << 1) - (((~i210) & 115) | (i210 & (-116)));
                            int i212 = i211 % 128;
                            f56800h = i212;
                            int i213 = i211 % 2;
                            int i214 = i212 ^ 49;
                            int i215 = ((i212 & 49) | i214) << 1;
                            int i216 = -i214;
                            int i217 = (i215 & i216) + (i215 | i216);
                            f56801i = i217 % 128;
                            int i310 = i217 % 2;
                        } else {
                            if (iIntValue > iIntValue2) {
                                int i311 = f56800h;
                                int i312 = ((~i311) & 9) | (i311 & (-10));
                                int i313 = -(-((i311 & 9) << 1));
                                int i314 = (i312 ^ i313) + ((i313 & i312) << 1);
                                f56801i = i314 % 128;
                                int i315 = i314 % 2;
                                navigationOnClickListener = next.setNavigationOnClickListener();
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, (byte[]) ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))).clone()}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                setImageTintList.setX(new Object[]{(setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 1115257939, -1115257923, System.identityHashCode(navigationOnClickListener)), Integer.valueOf(iIntValue)}, -2003004454, 2003004454, iIntValue);
                                int i316 = f56800h;
                                i10 = ((i316 ^ 42) + ((i316 & 42) << 1)) - 1;
                                f56801i = i10 % 128;
                            } else {
                                navigationOnClickListener = next.setNavigationOnClickListener();
                                byte[] bArrCopyOf2 = Arrays.copyOf((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)), iIntValue);
                                Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "");
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArrCopyOf2}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                int i317 = f56801i;
                                int i318 = i317 & 117;
                                i10 = (i318 - (~(-(-((i317 ^ 117) | i318))))) - 1;
                                f56800h = i10 % 128;
                            }
                            int i319 = i10 % 2;
                            getbeeponfailure = navigationOnClickListener;
                        }
                        ka onFocusChangeListener7 = klVar.setOnFocusChangeListener();
                        ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener7, getbeeponfailure}, -1412399391, 1412399402, System.identityHashCode(onFocusChangeListener7));
                        int i43 = f56801i;
                        int i44 = ((i43 ^ 15) - (~((i43 & 15) << 1))) - 1;
                        f56800h = i44 % 128;
                        int i45 = i44 % 2;
                    }
                }
            }
            ka onFocusChangeListener8 = klVar.setOnFocusChangeListener();
            setImageTintList setimagetintlist5 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 1115257939, -1115257923, System.identityHashCode(next));
            int iIntValue3 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist5}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist5))).intValue();
            byte[] bArr = new byte[iIntValue3];
            int i46 = f56800h;
            int i47 = ((i46 & 74) + (i46 | 74)) - 1;
            f56801i = i47 % 128;
            int i48 = i47 % 2;
            int i49 = 0;
            while (i49 < iIntValue3) {
                int i50 = f56801i;
                int i51 = (i50 & 25) + (i50 | 25);
                f56800h = i51 % 128;
                int i52 = i51 % 2;
                bArr[i49] = 0;
                System.identityHashCode(klVar);
                int i53 = -(-(i49 * 825));
                int i54 = 1649 ^ i53;
                int i55 = (i53 & 1649) << 1;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                int i57 = ~i49;
                int i58 = i57 & 1;
                int i59 = ((i57 ^ 1) | i58) * (-824);
                int i60 = (i56 ^ i59) + ((i56 & i59) << 1);
                int i61 = i49 ^ 1;
                int i62 = i49 & 1;
                int i63 = ((i62 & i61) | (i61 ^ i62)) * (-1648);
                int i64 = i60 ^ i63;
                int i65 = ((i63 & i60) | i64) << 1;
                int i66 = -i64;
                int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                int i68 = ((~i57) & (-2)) | i58;
                int i69 = i57 & (-2);
                int i70 = -(-(((i68 & i69) | (i68 ^ i69)) * 824));
                int i71 = i67 & i70;
                int i72 = i70 | i67;
                i49 = (i72 | i71) + (i71 & i72);
                int i73 = f56801i;
                int i74 = i73 | 61;
                int i75 = i74 << 1;
                int i76 = -((~(i73 & 61)) & i74);
                int i77 = (i75 & i76) + (i76 | i75);
                f56800h = i77 % 128;
                int i78 = i77 % 2;
            }
            ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener8, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1412399391, 1412399402, System.identityHashCode(onFocusChangeListener8));
            System.identityHashCode(klVar);
            System.identityHashCode(klVar);
        }
        int i79 = f56800h;
        int i80 = ((i79 | 123) << 1) - (((~i79) & 123) | (i79 & (-124)));
        f56801i = i80 % 128;
        if (i80 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0174  */
    /* JADX WARN: Code duplicated, block: B:25:0x0179  */
    public static /* synthetic */ Boolean c(Object[] objArr) {
        int i10;
        boolean z10 = false;
        kl klVar = (kl) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i11 = f56800h;
        int i12 = ((i11 | 75) << 1) - (i11 ^ 75);
        f56801i = i12 % 128;
        int i13 = i12 % 2;
        try {
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (!((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -927948209, 927948212, System.identityHashCode(setscrollcontainer))).booleanValue()) {
                if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                    int i14 = f56801i;
                    int i15 = i14 ^ 123;
                    int i16 = ((i14 & 123) | i15) << 1;
                    int i17 = -i15;
                    int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                    f56800h = i18 % 128;
                    if (i18 % 2 != 0) {
                        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        ((Boolean) setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2))}, 648080960, -648080950, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (((Boolean) setDividerPadding(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, 648080960, -648080950, (int) System.currentTimeMillis())).booleanValue()) {
                        int i19 = f56800h;
                        int i20 = ((i19 | 115) << 1) - (i19 ^ 115);
                        f56801i = i20 % 128;
                        int i21 = i20 % 2;
                        z10 = true;
                    }
                }
                int i22 = f56800h;
                int i23 = ((i22 ^ 3) | (i22 & 3)) << 1;
                int i24 = -(((~i22) & 3) | (i22 & (-4)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f56801i = i25 % 128;
                int i26 = i25 % 2;
                int i27 = f56801i;
                int i28 = i27 & 71;
                i10 = ((i27 | 71) & (~i28)) + (i28 << 1);
                f56800h = i10 % 128;
                if (i10 % 2 == 0) {
                    return Boolean.valueOf(z10);
                }
                throw null;
            }
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, new n6(klVar)}, -2036793125, 2036793133, System.identityHashCode(getbeeponfailure));
            int i29 = f56801i;
            int i30 = i29 & 21;
            int i31 = (i29 | 21) & (~i30);
            int i32 = i30 << 1;
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            f56800h = i33 % 128;
            int i34 = i33 % 2;
            int i35 = f56800h;
            int i36 = i35 & 61;
            int i37 = -(-((i35 ^ 61) | i36));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            f56801i = i38 % 128;
            int i39 = i38 % 2;
            int i210 = f56800h;
            int i211 = ((i210 ^ 3) | (i210 & 3)) << 1;
            int i212 = -(((~i210) & 3) | (i210 & (-4)));
            int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
            f56801i = i213 % 128;
            int i214 = i213 % 2;
        } catch (Exception unused) {
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"Failed to parse and store card response"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
        }
        int i215 = f56801i;
        int i216 = i215 & 71;
        i10 = ((i215 | 71) & (~i216)) + (i216 << 1);
        f56800h = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        if ((r0 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], 2083840602, -2083840519, (int) java.lang.System.currentTimeMillis()), 6}, -217763358, 217763369, 6)).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56801i;
        r0 = r13 & 89;
        r13 = -(-((r13 ^ 89) | r0));
        r2 = (r0 & r13) + (r13 | r0);
        r13 = r2 % 128;
        com.mypinpad.tsdk.isolation.kl.f56800h = r13;
        r2 = r2 % 2;
        r0 = (r13 ^ 13) + ((r13 & 13) << 1);
        com.mypinpad.tsdk.isolation.kl.f56801i = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        if ((r0 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d7, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -1343436064, 1343436342, (int) java.lang.System.currentTimeMillis()), 6}, -217763358, 217763369, 6)).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0104, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56800h + 75;
        r2 = r13 % 128;
        com.mypinpad.tsdk.isolation.kl.f56801i = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010d, code lost:
    
        if ((r13 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
    
        r13 = (r2 ^ 97) + ((r2 & 97) << 1);
        com.mypinpad.tsdk.isolation.kl.f56800h = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011b, code lost:
    
        if ((r13 % 2) != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0121, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0122, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013d, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, com.mypinpad.tsdk.isolation.setAnimation.setOnCapturedPointerListener(), 2}, -217763358, 217763369, 2)).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015a, code lost:
    
        if ((!((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, com.mypinpad.tsdk.isolation.setAnimation.setPersistentDrawingCache(), 2}, -217763358, 217763369, 2)).booleanValue()) == true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0186, code lost:
    
        if ((!((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], 249426741, -249426566, (int) java.lang.System.currentTimeMillis()), 3}, -217763358, 217763369, 3)).booleanValue()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0188, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56800h + 14;
        r0 = (r13 ^ (-1)) + (r13 << 1);
        r13 = r0 % 128;
        com.mypinpad.tsdk.isolation.kl.f56801i = r13;
        r0 = r0 % 2;
        r2 = r13 & 25;
        r0 = ((((r13 ^ 25) | r2) << 1) - (~(-((r13 | 25) & (~r2))))) - 1;
        com.mypinpad.tsdk.isolation.kl.f56800h = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a8, code lost:
    
        if ((r0 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ac, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d7, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -705722506, 705722524, (int) java.lang.System.currentTimeMillis()), 1}, -217763358, 217763369, 1)).booleanValue() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01d9, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56801i;
        r0 = ((r13 | 47) << 1) - (r13 ^ 47);
        com.mypinpad.tsdk.isolation.kl.f56800h = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e8, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0212, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -249361593, 249361770, (int) java.lang.System.currentTimeMillis()), 4}, -217763358, 217763369, 4)).booleanValue() == true) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0214, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56800h;
        r0 = ((r13 & 2) + (r13 | 2)) - 1;
        com.mypinpad.tsdk.isolation.kl.f56801i = r0 % 128;
        r0 = r0 % 2;
        r0 = r13 & 29;
        r13 = ((r13 | 29) & (~r0)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.kl.f56801i = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x022e, code lost:
    
        if ((r13 % 2) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0232, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0233, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0234, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56800h;
        r0 = r13 ^ 5;
        r13 = -(-((r13 & 5) << 1));
        r2 = (r0 ^ r13) + ((r13 & r0) << 1);
        com.mypinpad.tsdk.isolation.kl.f56801i = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0249, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x024a, code lost:
    
        r13 = (int) java.lang.System.currentTimeMillis();
        r1 = ~r13;
        r4 = (-729514646) ^ r1;
        r2 = (-729514646) & r1;
        r2 = ~((r2 & r4) | (r4 ^ r2));
        r5 = r2 & 672367104;
        r2 = (r2 | 672367104) & (~r5);
        r2 = (r2 & r5) | (r2 ^ r5);
        r1 = ~((r1 & (-2081672811)) | ((2081672810 & r1) | ((~r1) & (-2081672811))));
        r1 = ((r1 & r2) | (r2 ^ r1)) * (-397);
        r5 = (-2002235094) & r1;
        r5 = (r5 - (~(-(-((r1 ^ (-2002235094)) | r5))))) - 1;
        r2 = (r5 & (-641767936)) + ((-641767936) | r5);
        r13 = (r13 & 672367104) | (r13 ^ 672367104);
        r1 = (2138820351 & r13) | ((~r13) & (-2138820352));
        r13 = r13 & (-2138820352);
        r13 = ((r13 & r1) | (r1 ^ r13)) * 397;
        r1 = (r2 & r13) + (r13 | r2);
        r13 = (int) java.lang.System.currentTimeMillis();
        r4 = 2072960072 ^ r13;
        r5 = ~r13;
        r6 = 2072960072 & r13;
        r4 = (r4 & r6) | (r4 ^ r6);
        r6 = ~r4;
        r4 = (r4 | r6) & r6;
        r4 = ((r4 & 4194583) | (((~r4) & 4194583) | ((-4194584) & r4))) * 576;
        r7 = (-1807405746) ^ r4;
        r4 = (r4 & (-1807405746)) << 1;
        r6 = (r7 & r4) + (r4 | r7);
        r13 = (r13 | r5) & r5;
        r4 = ((~r13) & 2072960072) | ((-2072960073) & r13);
        r13 = r13 & 2072960072;
        r13 = (r13 & r4) | (r4 ^ r13);
        r13 = (r13 & 2068633879) | (((-2068633880) & r13) | ((~r13) & 2068633879));
        r2 = ~r13;
        r13 = (r13 | r2) & r2;
        r2 = ((~r13) & 2064439296) | ((-2064439297) & r13);
        r13 = r13 & 2064439296;
        r13 = -(-(((r13 & r2) | (r2 ^ r13)) * 576));
        r2 = r6 ^ r13;
        r13 = (r13 & r6) << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0310, code lost:
    
        if (r1 <= ((((r2 | r13) << 1) - (r13 ^ r2)) - 1878887488)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0312, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0317, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004d, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -692948779, 692948802, (int) java.lang.System.currentTimeMillis()), 2}, -217763358, 217763369, 2)).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0318, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56801i;
        r2 = r13 & 31;
        r0 = ((r13 ^ 31) | r2) << 1;
        r13 = -((r13 | 31) & (~r2));
        r2 = (r0 & r13) + (r13 | r0);
        r13 = r2 % 128;
        com.mypinpad.tsdk.isolation.kl.f56800h = r13;
        r2 = r2 % 2;
        r0 = ((r13 | 119) << 1) - (r13 ^ 119);
        com.mypinpad.tsdk.isolation.kl.f56801i = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0339, code lost:
    
        if ((r0 % 2) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x033d, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x033e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r13, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -692948779, 692948802, (int) java.lang.System.currentTimeMillis()), 4}, -217763358, 217763369, 4)).booleanValue() != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        r13 = com.mypinpad.tsdk.isolation.kl.f56801i;
        r0 = r13 & 77;
        r0 = r0 + ((r13 ^ 77) | r0);
        com.mypinpad.tsdk.isolation.kl.f56800h = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean d(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.kl.d(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        int i10;
        Object next;
        kl klVar = (kl) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[2];
        int i11 = f56801i + 111;
        f56800h = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)));
            throw null;
        }
        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (!(!Intrinsics.areEqual((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))))) {
            int i12 = f56801i;
            int i13 = i12 ^ 47;
            int i14 = ((i12 & 47) | i13) << 1;
            int i15 = -i13;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            f56800h = i16 % 128;
            int i17 = i16 % 2;
            return Boolean.TRUE;
        }
        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -927948209, 927948212, System.identityHashCode(setscrollcontainer3))).booleanValue()) {
            int i18 = f56800h;
            int i19 = ((i18 ^ 90) + ((i18 & 90) << 1)) - 1;
            f56801i = i19 % 128;
            if (i19 % 2 == 0) {
                ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).iterator();
                throw null;
            }
            Iterator it = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).iterator();
            int i20 = f56800h;
            int i21 = i20 & 87;
            int i22 = -(-((i20 ^ 87) | i21));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f56801i = i23 % 128;
            int i24 = i23 % 2;
            while (true) {
                if (it.hasNext()) {
                    int i25 = f56800h + 118;
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    f56801i = i26 % 128;
                    if (i26 % 2 == 0) {
                        next = it.next();
                        int i27 = 97 / 0;
                        if (((Boolean) setDividerPadding(new Object[]{klVar, (getBeepOnFailure) next, transactionFailed}, 607603957, -607603951, System.identityHashCode(klVar))).booleanValue()) {
                            obj = next;
                            int i28 = f56801i;
                            int i29 = i28 & 43;
                            int i30 = ((i28 | 43) & (~i29)) + (i29 << 1);
                            int i31 = i30 % 128;
                            f56800h = i31;
                            int i32 = i30 % 2;
                            i10 = ((i31 | 9) << 1) - (i31 ^ 9);
                        }
                    } else {
                        next = it.next();
                        if (((Boolean) setDividerPadding(new Object[]{klVar, (getBeepOnFailure) next, transactionFailed}, 607603957, -607603951, System.identityHashCode(klVar))).booleanValue()) {
                            obj = next;
                            int i210 = f56801i;
                            int i211 = i210 & 43;
                            int i33 = ((i210 | 43) & (~i211)) + (i211 << 1);
                            int i34 = i33 % 128;
                            f56800h = i34;
                            int i35 = i33 % 2;
                            i10 = ((i34 | 9) << 1) - (i34 ^ 9);
                        }
                    }
                } else {
                    int i36 = f56800h;
                    int i37 = i36 & 117;
                    i10 = ((i36 | 117) & (~i37)) + (i37 << 1);
                }
                f56801i = i10 % 128;
                int i38 = i10 % 2;
                if (((getBeepOnFailure) obj) != null) {
                    int i39 = f56800h;
                    int i40 = ((i39 ^ 74) + ((i39 & 74) << 1)) - 1;
                    f56801i = i40 % 128;
                    return Boolean.valueOf(i40 % 2 != 0);
                }
            }
        }
        int i41 = f56801i + 90;
        int i42 = (i41 ^ (-1)) + (i41 << 1);
        f56800h = i42 % 128;
        if (i42 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i43 = 79 / 0;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0142, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0144, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0146, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0161, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r1, r3}, 1149014806, -1149014806, java.lang.System.identityHashCode(r1))).booleanValue() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0163, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.dz.INSTANCE;
        com.mypinpad.tsdk.isolation.dz.setX(new java.lang.Object[]{r1.setOnFocusChangeListener(), r1.f56803g}, 1266288380, -1266288380, (int) java.lang.System.currentTimeMillis());
        r3 = new com.mypinpad.tsdk.isolation.bj(r1.setOnFocusChangeListener());
        r3 = (com.mypinpad.tsdk.isolation.bo) ((com.mypinpad.tsdk.isolation.setImageTintList) com.mypinpad.tsdk.isolation.w.setX(new java.lang.Object[]{r3}, 1693919772, -1693919769, java.lang.System.identityHashCode(r3)));
        r3 = (com.mypinpad.tsdk.isolation.setMaxWidth) ((java.util.List) com.mypinpad.tsdk.isolation.bo.setY(new java.lang.Object[]{r3}, -1194860115, 1194860115, java.lang.System.identityHashCode(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01cd, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r3}, -1728104287, 1728104296, (int) java.lang.System.currentTimeMillis())).booleanValue() == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01cf, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.kl.f56800h;
        r5 = (r3 ^ 123) + ((r3 & 123) << 1);
        com.mypinpad.tsdk.isolation.kl.f56801i = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01dc, code lost:
    
        if ((r5 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01f2, code lost:
    
        return (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1344952794, 1344952799, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01f3, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1344952794, 1344952799, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0208, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0209, code lost:
    
        setDividerPadding(new java.lang.Object[]{r1, r3}, -1137240260, 1137240262, java.lang.System.identityHashCode(r1));
        setDividerPadding(new java.lang.Object[]{r1}, -796466622, 796466623, java.lang.System.identityHashCode(r1));
        setDividerPadding(new java.lang.Object[]{r1}, 2109083101, -2109083097, java.lang.System.identityHashCode(r1));
        setDividerPadding(new java.lang.Object[]{r1}, -457732109, 457732122, java.lang.System.identityHashCode(r1));
        r0 = com.mypinpad.tsdk.isolation.fk.setChildDivider;
        r1 = com.mypinpad.tsdk.isolation.kl.f56800h;
        r3 = r1 & 61;
        r1 = ((r1 | 61) & (~r3)) + (r3 << 1);
        com.mypinpad.tsdk.isolation.kl.f56801i = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0261, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0262, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.kl.f56801i;
        r5 = (r3 ^ 103) + ((r3 & 103) << 1);
        com.mypinpad.tsdk.isolation.kl.f56800h = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x026f, code lost:
    
        if ((r5 % 2) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0271, code lost:
    
        r2 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x029e, code lost:
    
        return (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1344952794, 1344952799, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1344952794, 1344952799, java.lang.System.identityHashCode(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00a2, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.isolation.setMaxWidth.setX(new java.lang.Object[]{r5, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r6}, 1914607362, -1914607356, java.lang.System.identityHashCode(r6))}, -480651882, 480651889, java.lang.System.identityHashCode(r5))}, -1908235233, 1908235241, java.lang.System.identityHashCode(r1))).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0112, code lost:
    
        if (((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r1, (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.isolation.setMaxWidth.setX(new java.lang.Object[]{r5, (java.lang.String) com.mypinpad.tsdk.isolation.TransactionFailed.setX(new java.lang.Object[]{r6}, 1914607362, -1914607356, java.lang.System.identityHashCode(r6))}, -480651882, 480651889, java.lang.System.identityHashCode(r5))}, -1908235233, 1908235241, java.lang.System.identityHashCode(r1))).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0114, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.kl.f56800h;
        r5 = r3 & 89;
        r3 = (r3 ^ 89) | r5;
        r6 = (r5 ^ r3) + ((r3 & r5) << 1);
        com.mypinpad.tsdk.isolation.kl.f56801i = r6 % 128;
        r6 = r6 % 2;
        r0 = (com.mypinpad.tsdk.isolation.fk) setDividerPadding(new java.lang.Object[]{r1}, -1344952794, 1344952799, java.lang.System.identityHashCode(r1));
        r1 = com.mypinpad.tsdk.isolation.kl.f56801i + 71;
        com.mypinpad.tsdk.isolation.kl.f56800h = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.fk f(java.lang.Object[] r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.kl.f(java.lang.Object[]):com.mypinpad.tsdk.i.fk");
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        Boolean bool = Boolean.FALSE;
        kl klVar = (kl) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f56801i;
        int i11 = (i10 ^ 61) + ((i10 & 61) << 1);
        int i12 = i11 % 128;
        f56800h = i12;
        int i13 = i11 % 2;
        if (getbeeponfailure == null) {
            int i14 = i12 + 51;
            f56801i = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((i12 ^ 42) + ((i12 & 42) << 1)) - 1;
            f56801i = i16 % 128;
            int i17 = i16 % 2;
            return bool;
        }
        setAnimation setanimation = setAnimation.INSTANCE;
        if (!((Boolean) setDividerPadding(new Object[]{klVar, getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis())}, 607603957, -607603951, System.identityHashCode(klVar))).booleanValue()) {
            int i18 = f56800h;
            int i19 = (i18 ^ 95) + ((i18 & 95) << 1);
            int i20 = i19 % 128;
            f56801i = i20;
            boolean z10 = !(i19 % 2 != 0);
            int i21 = (i20 & 123) + (i20 | 123);
            f56800h = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.valueOf(z10);
        }
        if (!((Boolean) setDividerPadding(new Object[]{klVar, getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis())}, 607603957, -607603951, System.identityHashCode(klVar))).booleanValue()) {
            int i23 = f56800h;
            int i24 = i23 & 121;
            int i25 = (i23 | 121) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = i27 % 128;
            f56801i = i28;
            int i29 = i27 % 2;
            int i30 = ((i28 | 31) << 1) - (i28 ^ 31);
            f56800h = i30 % 128;
            if (i30 % 2 == 0) {
                return bool;
            }
            throw null;
        }
        if (!((Boolean) setDividerPadding(new Object[]{klVar, getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], 1723373489, -1723373305, (int) System.currentTimeMillis())}, 607603957, -607603951, System.identityHashCode(klVar))).booleanValue()) {
            int i31 = f56800h;
            int i32 = i31 & 77;
            int i33 = -(-((i31 ^ 77) | i32));
            int i34 = (i32 & i33) + (i32 | i33);
            f56801i = i34 % 128;
            int i35 = i34 % 2;
            int i36 = (-2) - (((i31 & 56) + (i31 | 56)) ^ (-1));
            f56801i = i36 % 128;
            if (i36 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        if (((Boolean) setDividerPadding(new Object[]{klVar, getbeeponfailure, (TransactionFailed) setAnimation.setY(new Object[0], -2052046062, 2052046231, (int) System.currentTimeMillis())}, 607603957, -607603951, System.identityHashCode(klVar))).booleanValue()) {
            int i37 = f56800h;
            int i38 = i37 & 61;
            int i39 = (i38 - (~((i37 ^ 61) | i38))) - 1;
            f56801i = i39 % 128;
            int i40 = i39 % 2;
            return Boolean.TRUE;
        }
        int i41 = f56801i;
        int i42 = i41 + 69;
        f56800h = i42 % 128;
        int i43 = i42 % 2;
        int i44 = i41 & 45;
        int i45 = ((i41 ^ 45) | i44) << 1;
        int i46 = -((i41 | 45) & (~i44));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        f56800h = i47 % 128;
        int i48 = i47 % 2;
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:22:0x0200  */
    /* JADX WARN: Code duplicated, block: B:37:0x0327  */
    /* JADX WARN: Code duplicated, block: B:38:0x0346  */
    /* JADX WARN: Code duplicated, block: B:41:0x0368  */
    /* JADX WARN: Code duplicated, block: B:43:0x037f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0393  */
    /* JADX WARN: Code duplicated, block: B:47:0x041b  */
    /* JADX WARN: Code duplicated, block: B:48:0x046b  */
    /* JADX WARN: Code duplicated, block: B:51:0x048c  */
    /* JADX WARN: Code duplicated, block: B:64:0x055d  */
    /* JADX WARN: Code duplicated, block: B:66:0x057e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0582  */
    /* JADX WARN: Code duplicated, block: B:68:0x0583  */
    /* JADX WARN: Code duplicated, block: B:70:0x0592  */
    /* JADX WARN: Code duplicated, block: B:71:0x0596  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Boolean bool;
        int i13;
        int i14;
        ka onFocusChangeListener;
        int i15;
        kb kbVar;
        getBeepOnFailure getbeeponfailure;
        int i16;
        int i17;
        ka onFocusChangeListener2;
        setScrollContainer setscrollcontainer;
        int i18 = ~i11;
        int i19 = ~(i18 | i12);
        int i20 = ~i12;
        switch ((((~((~i10) | i12)) | (~(i11 | i20))) * 406) + ((~(i18 | i20 | i10)) * (-406)) + ((i19 | (~(i20 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405))) {
            case 1:
                kl klVar = (kl) objArr[0];
                int i21 = f56801i;
                int i22 = i21 & 35;
                int i23 = -(-((i21 ^ 35) | i22));
                int i24 = (i22 & i23) + (i23 | i22);
                f56800h = i24 % 128;
                if (i24 % 2 == 0) {
                    ka onFocusChangeListener3 = klVar.setOnFocusChangeListener();
                    TransactionFailed transactionFailedTransactionErrorCause = setAnimation.TransactionErrorCause();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (String) TransactionFailed.setX(new Object[]{transactionFailedTransactionErrorCause}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTransactionErrorCause))}, -1394735893, 1394735910, System.identityHashCode(onFocusChangeListener3));
                    ka onFocusChangeListener4 = klVar.setOnFocusChangeListener();
                    TransactionFailed importantForContentCapture = setAnimation.setImportantForContentCapture();
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (String) TransactionFailed.setX(new Object[]{importantForContentCapture}, 1914607362, -1914607356, System.identityHashCode(importantForContentCapture))}, -1394735893, 1394735910, System.identityHashCode(onFocusChangeListener4));
                    return null;
                }
                ka onFocusChangeListener5 = klVar.setOnFocusChangeListener();
                TransactionFailed transactionFailedTransactionErrorCause2 = setAnimation.TransactionErrorCause();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, (String) TransactionFailed.setX(new Object[]{transactionFailedTransactionErrorCause2}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTransactionErrorCause2))}, -1394735893, 1394735910, System.identityHashCode(onFocusChangeListener5));
                ka onFocusChangeListener6 = klVar.setOnFocusChangeListener();
                TransactionFailed importantForContentCapture2 = setAnimation.setImportantForContentCapture();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, (String) TransactionFailed.setX(new Object[]{importantForContentCapture2}, 1914607362, -1914607356, System.identityHashCode(importantForContentCapture2))}, -1394735893, 1394735910, System.identityHashCode(onFocusChangeListener6));
                int i25 = 92 / 0;
                return null;
            case 2:
                b(objArr);
                return null;
            case 3:
                return f(objArr);
            case 4:
                a(objArr);
                return null;
            case 5:
                kl klVar2 = (kl) objArr[0];
                int i26 = f56801i;
                int i27 = i26 & 107;
                int i28 = ((i26 | 107) & (~i27)) + (i27 << 1);
                f56800h = i28 % 128;
                int i29 = i28 % 2;
                kw x4 = klVar2.setX();
                fk fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{x4, klVar2.setOnFocusChangeListener(), klVar2.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setOnFocusChangeListener}, 1530407395, -1530407393, System.identityHashCode(x4));
                int i30 = f56800h;
                int i31 = i30 & 53;
                int i32 = ((i30 ^ 53) | i31) << 1;
                int i33 = -((i30 | 53) & (~i31));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f56801i = i34 % 128;
                int i35 = i34 % 2;
                return fkVar;
            case 6:
                return e(objArr);
            case 7:
                return c(objArr);
            case 8:
                return g(objArr);
            case 9:
                return d(objArr);
            case 10:
                String str = (String) objArr[0];
                int i36 = f56801i + 55;
                f56800h = i36 % 128;
                int i37 = i36 % 2;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -817759528, 817759728, (int) System.currentTimeMillis());
                if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1711803826, 1711803947, (int) System.currentTimeMillis());
                    boolean zAreEqual = Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)));
                    int i38 = f56801i;
                    int i39 = i38 & 15;
                    int i40 = i38 | 15;
                    int i41 = (i39 & i40) + (i40 | i39);
                    f56800h = i41 % 128;
                    int i42 = i41 % 2;
                    if (!zAreEqual) {
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1333173903, 1333173904, (int) System.currentTimeMillis());
                        boolean zAreEqual2 = Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)));
                        int i43 = f56800h;
                        int i44 = i43 ^ 35;
                        int i45 = ((i43 & 35) | i44) << 1;
                        int i46 = -i44;
                        int i47 = (i45 & i46) + (i45 | i46);
                        f56801i = i47 % 128;
                        int i48 = i47 % 2;
                        if (!zAreEqual2) {
                            TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1532855682, 1532855827, (int) System.currentTimeMillis());
                            boolean zAreEqual3 = Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)));
                            int i49 = f56800h;
                            int i50 = (i49 ^ 45) + ((i49 & 45) << 1);
                            f56801i = i50 % 128;
                            int i51 = i50 % 2;
                            if (!zAreEqual3) {
                                int i52 = ((i49 & 68) + (i49 | 68)) - 1;
                                f56801i = i52 % 128;
                                int i53 = i52 % 2;
                                bool = Boolean.FALSE;
                                break;
                            }
                        }
                        int i54 = f56801i;
                        int i55 = i54 & 17;
                        int i56 = (i54 | 17) & (~i55);
                        int i57 = -(-(i55 << 1));
                        int i58 = (i56 & i57) + (i56 | i57);
                        f56800h = i58 % 128;
                        int i59 = i58 % 2;
                        bool = Boolean.TRUE;
                        break;
                    }
                    int i60 = f56800h;
                    int i61 = i60 + 1;
                    f56801i = i61 % 128;
                    int i62 = i61 % 2;
                    int i63 = i60 + 105;
                    f56801i = i63 % 128;
                    int i64 = i63 % 2;
                    int i510 = f56801i;
                    int i511 = i510 & 17;
                    int i512 = (i510 | 17) & (~i511);
                    int i513 = -(-(i511 << 1));
                    int i514 = (i512 & i513) + (i512 | i513);
                    f56800h = i514 % 128;
                    int i515 = i514 % 2;
                    bool = Boolean.TRUE;
                } else {
                    int i65 = f56800h + 63;
                    int i66 = i65 % 128;
                    f56801i = i66;
                    int i67 = i65 % 2;
                    int i68 = i66 + 125;
                    f56800h = i68 % 128;
                    int i69 = i68 % 2;
                }
                int i70 = f56800h;
                int i71 = (i70 ^ 117) + ((i70 & 117) << 1);
                f56801i = i71 % 128;
                int i72 = i71 % 2;
                int i73 = ((i70 | 93) << 1) - (i70 ^ 93);
                f56801i = i73 % 128;
                int i74 = i73 % 2;
                int i610 = f56800h;
                int i611 = i610 + 1;
                f56801i = i611 % 128;
                int i612 = i611 % 2;
                int i613 = i610 + 105;
                f56801i = i613 % 128;
                int i614 = i613 % 2;
                int i516 = f56801i;
                int i517 = i516 & 17;
                int i518 = (i516 | 17) & (~i517);
                int i519 = -(-(i517 << 1));
                int i5110 = (i518 & i519) + (i518 | i519);
                f56800h = i5110 % 128;
                int i5111 = i5110 % 2;
                bool = Boolean.TRUE;
                break;
            case 11:
                setMaxWidth setmaxwidth = (setMaxWidth) objArr[0];
                TransactionFailed transactionFailed5 = (TransactionFailed) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i75 = f56800h;
                int i76 = (i75 & (-100)) | ((~i75) & 99);
                int i77 = (i75 & 99) << 1;
                int i78 = (i76 & i77) + (i77 | i76);
                f56801i = i78 % 128;
                int i79 = i78 % 2;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
                if (getbeeponfailure2 != null) {
                    int i80 = f56801i;
                    int i81 = ((i80 ^ 73) - (~((i80 & 73) << 1))) - 1;
                    f56800h = i81 % 128;
                    if (i81 % 2 != 0) {
                        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                        int i82 = 12 / 0;
                        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() == iIntValue) {
                            int i83 = f56800h;
                            int i84 = i83 & 5;
                            int i85 = ((i83 | 5) & (~i84)) + (i84 << 1);
                            int i86 = i85 % 128;
                            f56801i = i86;
                            int i87 = i85 % 2;
                            int i88 = i86 ^ 41;
                            int i89 = -(-((i86 & 41) << 1));
                            i14 = ((i88 | i89) << 1) - (i88 ^ i89);
                            f56800h = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            bool = Boolean.TRUE;
                        } else {
                            int i90 = f56801i;
                            int i91 = i90 & 67;
                            i13 = i91 + ((i90 ^ 67) | i91);
                            f56800h = i13 % 128;
                            if (i13 % 2 != 0) {
                                throw null;
                            }
                            bool = Boolean.FALSE;
                        }
                    } else {
                        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue() == iIntValue) {
                            int i810 = f56800h;
                            int i811 = i810 & 5;
                            int i812 = ((i810 | 5) & (~i811)) + (i811 << 1);
                            int i813 = i812 % 128;
                            f56801i = i813;
                            int i814 = i812 % 2;
                            int i815 = i813 ^ 41;
                            int i816 = -(-((i813 & 41) << 1));
                            i14 = ((i815 | i816) << 1) - (i815 ^ i816);
                            f56800h = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            bool = Boolean.TRUE;
                        } else {
                            int i92 = f56801i;
                            int i93 = i92 & 67;
                            i13 = i93 + ((i92 ^ 67) | i93);
                            f56800h = i13 % 128;
                            if (i13 % 2 != 0) {
                                throw null;
                            }
                            bool = Boolean.FALSE;
                        }
                    }
                } else {
                    int i94 = f56801i;
                    int i95 = i94 & 67;
                    i13 = i95 + ((i94 ^ 67) | i95);
                    f56800h = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    bool = Boolean.FALSE;
                }
                break;
            case 12:
                throw new fh(32, null);
            case 13:
                kl klVar3 = (kl) objArr[0];
                int i96 = f56800h;
                int i97 = ((((i96 ^ 109) | (i96 & 109)) << 1) - (~(-(((~i96) & 109) | (i96 & (-110)))))) - 1;
                f56801i = i97 % 128;
                if (i97 % 2 == 0) {
                    ka onFocusChangeListener7 = klVar3.setOnFocusChangeListener();
                    ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener7, Boolean.FALSE}, -1254059264, 1254059264, System.identityHashCode(onFocusChangeListener7));
                    ka onFocusChangeListener8 = klVar3.setOnFocusChangeListener();
                    if (((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener8}, 1525191230, -1525191215, System.identityHashCode(onFocusChangeListener8))).booleanValue()) {
                        onFocusChangeListener = klVar3.setOnFocusChangeListener();
                        if (!((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener}, -411478475, 411478481, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                            int i98 = f56801i;
                            int i99 = ((i98 | 17) << 1) - (i98 ^ 17);
                            f56800h = i99 % 128;
                            i15 = i99 % 2;
                            kbVar = klVar3.f56802f;
                            if (i15 == 0) {
                                ((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue();
                                throw null;
                            }
                            if (!((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue()) {
                                int i100 = f56801i;
                                int i101 = (((i100 | 36) << 1) - (i100 ^ 36)) - 1;
                                f56800h = i101 % 128;
                                int i102 = i101 % 2;
                                ka onFocusChangeListener9 = klVar3.setOnFocusChangeListener();
                                setAnimation setanimation2 = setAnimation.INSTANCE;
                                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener9, (TransactionFailed) setAnimation.setY(new Object[0], -1717172174, 1717172411, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener9));
                                ka onFocusChangeListener10 = klVar3.setOnFocusChangeListener();
                                setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener10}, -296152793, 296152815, System.identityHashCode(onFocusChangeListener10));
                                getbeeponfailure = (getBeepOnFailure) kb.setX(new Object[]{kbVar, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist)), getbeeponfailure3}, -769591334, 769591335, System.identityHashCode(kbVar));
                                if (getbeeponfailure != null) {
                                    int i103 = f56800h;
                                    int i104 = i103 & 49;
                                    int i105 = (i103 ^ 49) | i104;
                                    int i106 = (i104 & i105) + (i105 | i104);
                                    f56801i = i106 % 128;
                                    int i107 = i106 % 2;
                                    ka onFocusChangeListener11 = klVar3.setOnFocusChangeListener();
                                    ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener11, getbeeponfailure}, -1982343417, 1982343427, System.identityHashCode(onFocusChangeListener11));
                                    ka onFocusChangeListener12 = klVar3.setOnFocusChangeListener();
                                    ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener12, Boolean.TRUE}, -1254059264, 1254059264, System.identityHashCode(onFocusChangeListener12));
                                    int i108 = f56801i;
                                    int i109 = i108 & 53;
                                    int i110 = i108 | 53;
                                    int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
                                    f56800h = i111 % 128;
                                    int i112 = i111 % 2;
                                    return null;
                                }
                                kb.setX(new Object[]{kbVar}, -998431871, 998431874, System.identityHashCode(kbVar));
                                int i113 = f56800h;
                                i16 = i113 ^ 51;
                                i17 = i113 & 51;
                            }
                        }
                    } else {
                        kb kbVar2 = klVar3.f56802f;
                        kb.setX(new Object[]{kbVar2}, -998431871, 998431874, System.identityHashCode(kbVar2));
                        int i114 = f56801i;
                        int i115 = (-2) - (((i114 & 36) + (i114 | 36)) ^ (-1));
                        f56800h = i115 % 128;
                        int i116 = i115 % 2;
                    }
                    int i117 = f56800h;
                    i16 = i117 ^ 73;
                    i17 = i117 & 73;
                } else {
                    ka onFocusChangeListener13 = klVar3.setOnFocusChangeListener();
                    ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener13, Boolean.FALSE}, -1254059264, 1254059264, System.identityHashCode(onFocusChangeListener13));
                    ka onFocusChangeListener14 = klVar3.setOnFocusChangeListener();
                    if (!((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener14}, 1525191230, -1525191215, System.identityHashCode(onFocusChangeListener14))).booleanValue()) {
                        kb kbVar3 = klVar3.f56802f;
                        kb.setX(new Object[]{kbVar3}, -998431871, 998431874, System.identityHashCode(kbVar3));
                        int i118 = f56801i;
                        int i119 = (-2) - (((i118 & 36) + (i118 | 36)) ^ (-1));
                        f56800h = i119 % 128;
                        int i1110 = i119 % 2;
                    } else {
                        onFocusChangeListener = klVar3.setOnFocusChangeListener();
                        if (!((Boolean) ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener}, -411478475, 411478481, System.identityHashCode(onFocusChangeListener))).booleanValue()) {
                            int i910 = f56801i;
                            int i911 = ((i910 | 17) << 1) - (i910 ^ 17);
                            f56800h = i911 % 128;
                            i15 = i911 % 2;
                            kbVar = klVar3.f56802f;
                            if (i15 == 0) {
                                ((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue();
                                throw null;
                            }
                            if (!((Boolean) kb.setX(new Object[]{kbVar}, -1837987600, 1837987604, System.identityHashCode(kbVar))).booleanValue()) {
                                int i1010 = f56801i;
                                int i1011 = (((i1010 | 36) << 1) - (i1010 ^ 36)) - 1;
                                f56800h = i1011 % 128;
                                int i1012 = i1011 % 2;
                                ka onFocusChangeListener15 = klVar3.setOnFocusChangeListener();
                                setAnimation setanimation3 = setAnimation.INSTANCE;
                                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener15, (TransactionFailed) setAnimation.setY(new Object[0], -1717172174, 1717172411, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(onFocusChangeListener15));
                                ka onFocusChangeListener16 = klVar3.setOnFocusChangeListener();
                                setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener16}, -296152793, 296152815, System.identityHashCode(onFocusChangeListener16));
                                getbeeponfailure = (getBeepOnFailure) kb.setX(new Object[]{kbVar, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist2)), getbeeponfailure4}, -769591334, 769591335, System.identityHashCode(kbVar));
                                if (getbeeponfailure != null) {
                                    int i1013 = f56800h;
                                    int i1014 = i1013 & 49;
                                    int i1015 = (i1013 ^ 49) | i1014;
                                    int i1016 = (i1014 & i1015) + (i1015 | i1014);
                                    f56801i = i1016 % 128;
                                    int i1017 = i1016 % 2;
                                    ka onFocusChangeListener17 = klVar3.setOnFocusChangeListener();
                                    ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener17, getbeeponfailure}, -1982343417, 1982343427, System.identityHashCode(onFocusChangeListener17));
                                    ka onFocusChangeListener18 = klVar3.setOnFocusChangeListener();
                                    ka.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener18, Boolean.TRUE}, -1254059264, 1254059264, System.identityHashCode(onFocusChangeListener18));
                                    int i1018 = f56801i;
                                    int i1019 = i1018 & 53;
                                    int i1111 = i1018 | 53;
                                    int i1112 = (i1019 ^ i1111) + ((i1111 & i1019) << 1);
                                    f56800h = i1112 % 128;
                                    int i1113 = i1112 % 2;
                                    return null;
                                }
                                kb.setX(new Object[]{kbVar}, -998431871, 998431874, System.identityHashCode(kbVar));
                                int i1114 = f56800h;
                                i16 = i1114 ^ 51;
                                i17 = i1114 & 51;
                            }
                        }
                    }
                    int i1115 = f56800h;
                    i16 = i1115 ^ 73;
                    i17 = i1115 & 73;
                }
                int i120 = i16 + (i17 << 1);
                f56801i = i120 % 128;
                int i121 = i120 % 2;
                return null;
            case 14:
                kl klVar4 = (kl) objArr[0];
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) objArr[1];
                int i122 = f56800h + 115;
                f56801i = i122 % 128;
                if (i122 % 2 == 0) {
                    ((Boolean) setDividerPadding(new Object[]{klVar4, getbeeponfailure5}, -1939031461, 1939031468, System.identityHashCode(klVar4))).booleanValue();
                    throw null;
                }
                boolean zBooleanValue = ((Boolean) setDividerPadding(new Object[]{klVar4, getbeeponfailure5}, -1939031461, 1939031468, System.identityHashCode(klVar4))).booleanValue();
                int i123 = f56801i;
                int i124 = (((i123 ^ 121) | (i123 & 121)) << 1) - (((~i123) & 121) | (i123 & (-122)));
                f56800h = i124 % 128;
                int i125 = i124 % 2;
                return Boolean.valueOf(zBooleanValue);
            default:
                kl klVar5 = (kl) objArr[0];
                a aVar = (a) objArr[1];
                int i126 = f56801i;
                int i127 = ((i126 | 79) << 1) - (i126 ^ 79);
                f56800h = i127 % 128;
                int i128 = i127 % 2;
                Iterator<getBeepOnFailure> it = ((setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))).iterator();
                int i129 = f56800h;
                int i130 = ((i129 | 11) << 1) - (i129 ^ 11);
                f56801i = i130 % 128;
                while (true) {
                    int i131 = i130 % 2;
                    if (!it.hasNext()) {
                        int i132 = f56801i;
                        int i133 = (i132 & 7) + (i132 | 7);
                        f56800h = i133 % 128;
                        int i134 = i133 % 2;
                        bool = Boolean.TRUE;
                    } else {
                        int i135 = f56801i;
                        int i136 = ((i135 & 49) - (~(-(-(i135 | 49))))) - 1;
                        f56800h = i136 % 128;
                        int i137 = i136 % 2;
                        getBeepOnFailure next = it.next();
                        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                        String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                        setAnimation setanimation4 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                        if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6)))) {
                            int i138 = f56800h + 95;
                            f56801i = i138 % 128;
                            int i139 = i138 % 2;
                            ((Boolean) setDividerPadding(new Object[]{klVar5, next}, -1939031461, 1939031468, System.identityHashCode(klVar5))).booleanValue();
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{klVar5.setOnFocusChangeListener(), next}, 2094047793, -2094047756, (int) System.currentTimeMillis())).booleanValue()) {
                                int i140 = f56801i;
                                int i141 = i140 & 45;
                                int i142 = (i140 ^ 45) | i141;
                                int i143 = ((i141 | i142) << 1) - (i142 ^ i141);
                                int i144 = i143 % 128;
                                f56800h = i144;
                                int i145 = i143 % 2;
                                int i146 = (i144 ^ 19) + ((i144 & 19) << 1);
                                f56801i = i146 % 128;
                                if (i146 % 2 == 0) {
                                    throw null;
                                }
                                bool = Boolean.FALSE;
                                break;
                            }
                        } else {
                            ka onFocusChangeListener19 = klVar5.setOnFocusChangeListener();
                            setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                            if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener19, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, -422205110, 422205136, System.identityHashCode(onFocusChangeListener19))).booleanValue()) {
                                int i147 = f56801i;
                                int i148 = (i147 ^ 81) + ((i147 & 81) << 1);
                                f56800h = i148 % 128;
                                int i149 = i148 % 2;
                                if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, -32940825, 32940851, System.identityHashCode(next))).booleanValue()) {
                                    onFocusChangeListener2 = klVar5.setOnFocusChangeListener();
                                    setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                                    if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                                        ka onFocusChangeListener20 = klVar5.setOnFocusChangeListener();
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener20, next}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener20));
                                        int i150 = f56800h + 93;
                                        f56801i = i150 % 128;
                                        int i151 = i150 % 2;
                                    }
                                } else {
                                    ka onFocusChangeListener21 = klVar5.setOnFocusChangeListener();
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener21, next}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener21));
                                    int i152 = f56800h + 93;
                                    f56801i = i152 % 128;
                                    int i153 = i152 % 2;
                                }
                            } else {
                                onFocusChangeListener2 = klVar5.setOnFocusChangeListener();
                                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                                if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener2))).booleanValue()) {
                                    ka onFocusChangeListener22 = klVar5.setOnFocusChangeListener();
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener22, next}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener22));
                                    int i154 = f56800h + 93;
                                    f56801i = i154 % 128;
                                    int i155 = i154 % 2;
                                }
                            }
                        }
                        int i156 = f56801i;
                        int i157 = i156 & 79;
                        i130 = (i157 - (~(-(-((i156 ^ 79) | i157))))) - 1;
                        f56800h = i130 % 128;
                    }
                    break;
                }
                break;
        }
        return bool;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setDividerPadding(new Object[]{this, aVar}, -1656860248, 1656860251, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, 754895573, -754895561, System.identityHashCode(this));
    }
}
