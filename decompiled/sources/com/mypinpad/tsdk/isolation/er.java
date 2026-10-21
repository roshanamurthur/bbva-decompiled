package com.mypinpad.tsdk.isolation;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class er {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55403a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55404b = 1;

    /* JADX WARN: Code duplicated, block: B:37:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x03cc  */
    public void setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull a aVar) throws Exception {
        char c10;
        byte b10;
        char c11;
        char c12;
        boolean z10;
        int i10;
        boolean z11;
        Object y7;
        int i11 = f55404b;
        int i12 = 1;
        int i13 = ((i11 | 9) << 1) - (i11 ^ 9);
        f55403a = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(euVar, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        int i16 = 0;
        setMaxWidth setmaxwidth = (setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar));
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
        if (!((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 2135130751, -2135130733, System.identityHashCode(setmaxwidth))).booleanValue()) {
            int i17 = f55403a;
            int i18 = (i17 & 23) + (i17 | 23);
            f55404b = i18 % 128;
            if (i18 % 2 == 0) {
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{12706, null, 70}, 1336485880, -1336485874, 12706);
                y7 = eu.setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, setDrawSelectorOnTop.setLayoutAnimation}, -234839837, 234839850, System.identityHashCode(euVar));
            } else {
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{30005, null, 6}, 1336485880, -1336485874, 30005);
                y7 = eu.setY(new Object[]{euVar, setscrollbardefaultdelaybeforefade, settextkeepstate, setDrawSelectorOnTop.setLayoutAnimation}, -234839837, 234839850, System.identityHashCode(euVar));
            }
            int i19 = f55403a;
            int i20 = ((i19 | 9) << 1) - (i19 ^ 9);
            f55404b = i20 % 128;
            int i21 = i20 % 2;
            return;
        }
        Iterator<getBeepOnFailure> it = ((setMaxWidth) a.setX(new Object[]{aVar}, -917873151, 917873153, System.identityHashCode(aVar))).iterator();
        int i22 = f55404b;
        int i23 = i22 & 35;
        int i24 = -(-((i22 ^ 35) | i23));
        int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
        f55403a = i25 % 128;
        int i26 = i25 % 2;
        while (it.hasNext()) {
            int i27 = f55403a;
            int i28 = (i27 & 43) + (i27 | 43);
            f55404b = i28 % 128;
            if (i28 % i14 == 0) {
                int i29 = i12;
                getBeepOnFailure next = it.next();
                Object[] objArr = new Object[i29];
                objArr[0] = next;
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(objArr, 865402441, -865402437, System.identityHashCode(next));
                Object[] objArr2 = new Object[i29];
                objArr2[0] = setscrollcontainer;
                String str = (String) setScrollContainer.setOnFocusChangeListener(objArr2, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[i29];
                objArr3[0] = transactionFailed2;
                Intrinsics.areEqual(str, (String) TransactionFailed.setX(objArr3, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)));
                throw null;
            }
            getBeepOnFailure next2 = it.next();
            Object[] objArr4 = new Object[i12];
            objArr4[i16] = next2;
            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(objArr4, 865402441, -865402437, System.identityHashCode(next2));
            Object[] objArr5 = new Object[i12];
            objArr5[i16] = setscrollcontainer2;
            String str2 = (String) setScrollContainer.setOnFocusChangeListener(objArr5, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
            setAnimation setanimation3 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[i16], 2019562047, -2019561898, (int) System.currentTimeMillis());
            Object[] objArr6 = new Object[i12];
            objArr6[i16] = transactionFailed3;
            if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(objArr6, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                Object[] objArr7 = new Object[i12];
                objArr7[i16] = next2;
                String str3 = new String((byte[]) getBeepOnFailure.setOnFocusChangeListener(objArr7, 252497730, -252497710, System.identityHashCode(next2)), Charsets.UTF_8);
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                StringBuilder sb2 = new StringBuilder("handleOnlineResponse ARC: ");
                Object[] objArr8 = new Object[i12];
                objArr8[i16] = next2;
                byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(objArr8, 252497730, -252497710, System.identityHashCode(next2));
                Object[] objArr9 = new Object[i12];
                objArr9[i16] = bArr;
                sb2.append((String) setInputExtras.setDividerPadding(objArr9, 1609250238, -1609250236, (int) System.currentTimeMillis()));
                sb2.append(" - ");
                sb2.append(str3);
                SouthPacificEndpoint.setX(new Object[]{sb2.toString()}, 818541572, -818541572, (int) System.currentTimeMillis());
                SouthPacificEndpoint.setX(new Object[]{30003, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{str3}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 30003);
                if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 610902136, -610902111, System.identityHashCode(next2))).booleanValue()) {
                    int i30 = f55404b;
                    int i31 = (((i30 & (-42)) | ((~i30) & 41)) - (~((i30 & 41) << 1))) - 1;
                    f55403a = i31 % 128;
                    if (i31 % 2 != 0) {
                        setX().setY(setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, str3);
                        throw null;
                    }
                    setX().setY(setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, str3);
                    int i32 = f55403a;
                    int i33 = (i32 & 115) + (i32 | 115);
                    f55404b = i33 % 128;
                    int i34 = i33 % 2;
                    i14 = 2;
                    i12 = 1;
                    i16 = 0;
                } else {
                    SouthPacificEndpoint.setX(new Object[]{30005, null, 6}, 1336485880, -1336485874, 30005);
                    int i35 = f55403a;
                    int i36 = i35 ^ 125;
                    int i37 = -(-((i35 & 125) << 1));
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    f55404b = i38 % 128;
                    int i39 = i38 % 2;
                    i14 = 2;
                    i16 = 0;
                    i12 = 1;
                }
            } else {
                TransactionFailed designatorAfterValue = setAnimation.getDesignatorAfterValue();
                Object[] objArr10 = new Object[i12];
                objArr10[0] = designatorAfterValue;
                if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(objArr10, 1914607362, -1914607356, System.identityHashCode(designatorAfterValue)))) {
                    int i40 = f55403a;
                    int i41 = i40 ^ 51;
                    int i42 = ((i40 & 51) | i41) << 1;
                    int i43 = -i41;
                    int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                    f55404b = i44 % 128;
                    int i45 = i44 % 2;
                    SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("nothing to do with IAD: ", (String) setInputExtras.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 252497730, -252497710, System.identityHashCode(next2))}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, 818541572, -818541572, (int) System.currentTimeMillis());
                    if (((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 252497730, -252497710, System.identityHashCode(next2))).length == 0) {
                        int i46 = f55404b;
                        int i47 = i46 & 99;
                        int i48 = -(-((i46 ^ 99) | i47));
                        int i49 = (i47 & i48) + (i48 | i47);
                        f55403a = i49 % 128;
                        if (i49 % 2 == 0) {
                            z10 = true;
                        }
                        if (z10) {
                            int i50 = f55403a;
                            int i51 = i50 & 49;
                            int i52 = ((i50 ^ 49) | i51) << 1;
                            int i53 = -((i50 | 49) & (~i51));
                            int i54 = (i52 & i53) + (i53 | i52);
                            f55404b = i54 % 128;
                            int i55 = i54 % 2;
                            z11 = false;
                            i10 = 1;
                        } else {
                            int i56 = f55404b;
                            int i57 = i56 & 15;
                            int i58 = (~i57) & (i56 | 15);
                            i10 = 1;
                            int i59 = i57 << 1;
                            int i60 = (i58 ^ i59) + ((i59 & i58) << 1);
                            f55403a = i60 % 128;
                            int i61 = i60 % 2;
                            int i62 = (i56 ^ 65) + ((i56 & 65) << 1);
                            f55403a = i62 % 128;
                            int i63 = i62 % 2;
                            z11 = true;
                        }
                        Object[] objArr11 = new Object[i10];
                        objArr11[0] = Boolean.valueOf(z11);
                        c11 = 3;
                        c10 = 4;
                        Object[] objArr12 = {30004, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(objArr11, -772901588, 772901588, (int) System.currentTimeMillis()), 4};
                        b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                        c12 = 10232;
                        SouthPacificEndpoint.setX(objArr12, 1336485880, -1336485874, 30004);
                        int i64 = f55403a;
                        int i65 = i64 & 115;
                        int i66 = i65 + ((i64 ^ 115) | i65);
                        f55404b = i66 % 128;
                        int i67 = i66 % 2;
                    } else {
                        int i68 = f55403a;
                        int i69 = i68 ^ 87;
                        int i70 = ((i68 & 87) | i69) << 1;
                        int i71 = -i69;
                        int i72 = (i70 & i71) + (i70 | i71);
                        f55404b = i72 % 128;
                        int i73 = i72 % 2;
                    }
                    z10 = false;
                    if (z10) {
                        int i510 = f55403a;
                        int i511 = i510 & 49;
                        int i512 = ((i510 ^ 49) | i511) << 1;
                        int i513 = -((i510 | 49) & (~i511));
                        int i514 = (i512 & i513) + (i513 | i512);
                        f55404b = i514 % 128;
                        int i515 = i514 % 2;
                        z11 = false;
                        i10 = 1;
                    } else {
                        int i516 = f55404b;
                        int i517 = i516 & 15;
                        int i518 = (~i517) & (i516 | 15);
                        i10 = 1;
                        int i519 = i517 << 1;
                        int i610 = (i518 ^ i519) + ((i519 & i518) << 1);
                        f55403a = i610 % 128;
                        int i611 = i610 % 2;
                        int i612 = (i516 ^ 65) + ((i516 & 65) << 1);
                        f55403a = i612 % 128;
                        int i613 = i612 % 2;
                        z11 = true;
                    }
                    Object[] objArr13 = new Object[i10];
                    objArr13[0] = Boolean.valueOf(z11);
                    c11 = 3;
                    c10 = 4;
                    Object[] objArr14 = {30004, (getDetailsFieldTextSizeSp) initialisedefault.setCompoundDrawableTintBlendMode(objArr13, -772901588, 772901588, (int) System.currentTimeMillis()), 4};
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                    c12 = 10232;
                    SouthPacificEndpoint.setX(objArr14, 1336485880, -1336485874, 30004);
                    int i614 = f55403a;
                    int i615 = i614 & 115;
                    int i616 = i615 + ((i614 ^ 115) | i615);
                    f55404b = i616 % 128;
                    int i617 = i616 % 2;
                } else {
                    c10 = 4;
                    b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                    c11 = 3;
                    c12 = 10232;
                }
                int i74 = f55404b;
                int i75 = i74 & 109;
                int i76 = ((i74 | 109) & (~i75)) + (i75 << 1);
                f55403a = i76 % 128;
                int i77 = i76 % 2;
                i12 = 1;
                i16 = 0;
                i14 = 2;
            }
        }
        int i78 = f55403a + 36;
        int i79 = (i78 ^ (-1)) + (i78 << 1);
        f55404b = i79 % 128;
        int i80 = i79 % 2;
    }

    @NotNull
    public abstract ei setX();
}
