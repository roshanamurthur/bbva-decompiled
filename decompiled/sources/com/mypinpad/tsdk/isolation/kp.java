package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kp extends ki {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56817l = 0;
    public static int m = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull kw kwVar, @NotNull getValue getvalue, @NotNull kb kbVar) {
        super(kaVar, settextkeepstate, kwVar, getvalue, kbVar);
        Intrinsics.checkNotNullParameter(kaVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kwVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(kbVar, "");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00aa A[PHI: r8
      0x00aa: PHI (r8v12 com.mypinpad.tsdk.i.av) = (r8v11 com.mypinpad.tsdk.i.av), (r8v25 com.mypinpad.tsdk.i.av) binds: [B:11:0x00a8, B:7:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x00de  */
    /* JADX WARN: Code duplicated, block: B:17:0x012f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0132  */
    /* JADX WARN: Code duplicated, block: B:20:0x017f A[PHI: r3
      0x017f: PHI (r3v34 com.mypinpad.tsdk.i.getBeepOnFailure) = (r3v33 com.mypinpad.tsdk.i.getBeepOnFailure), (r3v62 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:19:0x017d, B:15:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:24:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:25:0x020e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0244  */
    /* JADX WARN: Code duplicated, block: B:9:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v54, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    /* JADX WARN: Type inference failed for: r5v31, types: [com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk fkVar;
        av avVar;
        int i13;
        getBeepOnFailure getbeeponfailure;
        String str;
        TransactionFailed transactionFailed;
        int i14;
        int i15;
        String str2;
        TransactionFailed transactionFailed2;
        int i16 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i17 = ~i10;
        int i18 = ~i12;
        if (((i17 | (~(i11 | i18))) * 783) + ((~(i17 | i18 | i11)) * (-783)) + i16 == 1) {
            kp kpVar = (kp) objArr[0];
            setRotationX setrotationx = (setRotationX) objArr[1];
            int i19 = m;
            int i20 = i19 & 123;
            int i21 = i20 + ((i19 ^ 123) | i20);
            f56817l = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(setrotationx, "");
            if (!(!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue())) {
                byte[] bArr = (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx));
                if (bArr.length == 0) {
                    int i23 = f56817l + 117;
                    int i24 = i23 % 128;
                    m = i24;
                    int i25 = i23 % 2;
                    int i26 = i24 & 115;
                    int i27 = ((i24 ^ 115) | i26) << 1;
                    int i28 = -((i24 | 115) & (~i26));
                    int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                    f56817l = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    int i31 = f56817l;
                    int i32 = ((i31 ^ 79) | (i31 & 79)) << 1;
                    int i33 = -((i31 & (-80)) | ((~i31) & 79));
                    int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
                    m = i34 % 128;
                    int i35 = i34 % 2;
                    int i36 = i31 & 41;
                    int i37 = (i36 - (~(-(-((i31 ^ 41) | i36))))) - 1;
                    m = i37 % 128;
                    int i38 = i37 % 2;
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                    if (((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr, (byte[]) TransactionFailed.setX(new Object[]{transactionFailed3}, 2029048574, -2029048570, System.identityHashCode(transactionFailed3))}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue()) {
                        int i39 = f56817l;
                        int i40 = ((i39 ^ 41) - (~((i39 & 41) << 1))) - 1;
                        m = i40 % 128;
                        if (i40 % 2 == 0) {
                            ka kaVar = (ka) kpVar.setOnFocusChangeListener();
                            ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar, bArr, TerminalCreationFailure.setY}, -1215492211, 1215492218, System.identityHashCode(kaVar))).booleanValue();
                            throw null;
                        }
                        ka kaVar2 = (ka) kpVar.setOnFocusChangeListener();
                        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar2, bArr, TerminalCreationFailure.setY}, -1215492211, 1215492218, System.identityHashCode(kaVar2))).booleanValue()) {
                            setX(new Object[]{kpVar, setrotationx}, -1678553594, 1678553594, System.identityHashCode(kpVar));
                            kr krVar = kr.INSTANCE;
                            fkVar = (fk) kr.setX(new Object[]{(ka) kpVar.setOnFocusChangeListener(), kpVar.setCompoundDrawableTintBlendMode(), kpVar.setY(), (kw) kpVar.setX(), kpVar.setOnLongClickListener()}, -837179530, 837179530, (int) System.currentTimeMillis());
                            int i41 = f56817l;
                            int i42 = ((i41 ^ 61) | (i41 & 61)) << 1;
                            int i43 = -(((~i41) & 61) | (i41 & (-62)));
                            int i44 = (i42 & i43) + (i43 | i42);
                            m = i44 % 128;
                            if (i44 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                }
                kw kwVar = (kw) kpVar.setX();
                fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar, (ka) kpVar.setOnFocusChangeListener(), kpVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setOnLongClickListener}, 1530407395, -1530407393, System.identityHashCode(kwVar));
                int i45 = m;
                int i46 = i45 ^ 41;
                int i47 = ((i45 & 41) | i46) << 1;
                int i48 = -i46;
                int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                f56817l = i49 % 128;
                int i50 = i49 % 2;
            } else {
                int i51 = m;
                int i52 = ((i51 ^ 81) | (i51 & 81)) << 1;
                int i53 = -(((~i51) & 81) | (i51 & (-82)));
                int i54 = (i52 & i53) + (i53 | i52);
                f56817l = i54 % 128;
                int i55 = i54 % 2;
                kw kwVar2 = (kw) kpVar.setX();
                fkVar = (fk) kw.setCompoundDrawableTintBlendMode(new Object[]{kwVar2, (ka) kpVar.setOnFocusChangeListener(), kpVar.setCompoundDrawableTintBlendMode(), ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation}, 1530407395, -1530407393, System.identityHashCode(kwVar2));
                int i56 = m + 85;
                f56817l = i56 % 128;
                int i57 = i56 % 2;
            }
            return fkVar;
        }
        kp kpVar2 = (kp) objArr[0];
        setRotationX setrotationx2 = (setRotationX) objArr[1];
        int i58 = f56817l;
        int i59 = i58 & 75;
        int i60 = ((i58 | 75) & (~i59)) + (i59 << 1);
        m = i60 % 128;
        if (i60 % 2 == 0) {
            ka kaVar3 = (ka) kpVar2.setOnFocusChangeListener();
            avVar = (av) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar3}, 1774718002, -1774717938, System.identityHashCode(kaVar3));
            Intrinsics.checkNotNull(avVar);
            int i61 = 6 / 0;
            if (((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue()) {
                int i62 = f56817l;
                int i63 = ((i62 ^ 13) | (i62 & 13)) << 1;
                int i64 = -(((~i62) & 13) | (i62 & (-14)));
                i13 = ((i63 | i64) << 1) - (i64 ^ i63);
                m = i13 % 128;
                if (i13 % 2 == 0) {
                    getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                    int i65 = 83 / 0;
                    if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                        cy cyVar = new cy(kpVar2.setOnFocusChangeListener());
                        cz czVar = new cz(kpVar2.setOnFocusChangeListener());
                        int i66 = f56817l;
                        int i67 = i66 ^ 29;
                        int i68 = ((i66 & 29) | i67) << 1;
                        int i69 = -i67;
                        int i70 = ((i68 | i69) << 1) - (i68 ^ i69);
                        m = i70 % 128;
                        i14 = 2;
                        int i71 = i70 % 2;
                    } else if (((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue() < 11) {
                        int i72 = f56817l;
                        i15 = (i72 ^ 25) + ((i72 & 25) << 1);
                        m = i15 % 128;
                        if (i15 % 2 != 0) {
                            ka kaVar4 = (ka) kpVar2.setOnFocusChangeListener();
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar4, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar4}, -854811249, 854811301, System.identityHashCode(kaVar4)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar4));
                            throw null;
                        }
                        ka kaVar5 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar5, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar5}, -854811249, 854811301, System.identityHashCode(kaVar5)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar5));
                        int i73 = m;
                        int i74 = ((i73 ^ 45) | (i73 & 45)) << 1;
                        int i75 = -(((~i73) & 45) | (i73 & (-46)));
                        int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                        f56817l = i76 % 128;
                        int i77 = i76 % 2;
                        i14 = 2;
                    } else {
                        ka kaVar6 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar6, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar6}, -854811249, 854811301, System.identityHashCode(kaVar6)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar6));
                        int i78 = m;
                        int i79 = (i78 & (-112)) | ((~i78) & 111);
                        int i80 = (i78 & 111) << 1;
                        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                        f56817l = i81 % 128;
                        i14 = 2;
                        int i82 = i81 % 2;
                    }
                } else {
                    getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                    setAnimation setanimation3 = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                        cy cyVar2 = new cy(kpVar2.setOnFocusChangeListener());
                        cz czVar2 = new cz(kpVar2.setOnFocusChangeListener());
                        int i610 = f56817l;
                        int i611 = i610 ^ 29;
                        int i612 = ((i610 & 29) | i611) << 1;
                        int i613 = -i611;
                        int i710 = ((i612 | i613) << 1) - (i612 ^ i613);
                        m = i710 % 128;
                        i14 = 2;
                        int i711 = i710 % 2;
                    } else if (((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue() < 11) {
                        int i712 = f56817l;
                        i15 = (i712 ^ 25) + ((i712 & 25) << 1);
                        m = i15 % 128;
                        if (i15 % 2 != 0) {
                            ka kaVar7 = (ka) kpVar2.setOnFocusChangeListener();
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar7, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar7}, -854811249, 854811301, System.identityHashCode(kaVar7)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar7));
                            throw null;
                        }
                        ka kaVar8 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar8, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar8}, -854811249, 854811301, System.identityHashCode(kaVar8)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar8));
                        int i713 = m;
                        int i714 = ((i713 ^ 45) | (i713 & 45)) << 1;
                        int i715 = -(((~i713) & 45) | (i713 & (-46)));
                        int i716 = ((i714 | i715) << 1) - (i715 ^ i714);
                        f56817l = i716 % 128;
                        int i717 = i716 % 2;
                        i14 = 2;
                    } else {
                        ka kaVar9 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar9, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar9}, -854811249, 854811301, System.identityHashCode(kaVar9)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar9));
                        int i718 = m;
                        int i719 = (i718 & (-112)) | ((~i718) & 111);
                        int i83 = (i718 & 111) << 1;
                        int i84 = ((i719 | i83) << 1) - (i83 ^ i719);
                        f56817l = i84 % 128;
                        i14 = 2;
                        int i85 = i84 % 2;
                    }
                }
            } else {
                i14 = 2;
            }
        } else {
            ka kaVar10 = (ka) kpVar2.setOnFocusChangeListener();
            avVar = (av) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar10}, 1774718002, -1774717938, System.identityHashCode(kaVar10));
            Intrinsics.checkNotNull(avVar);
            if (((Boolean) av.setY(new Object[]{avVar}, -1890498550, 1890498551, System.identityHashCode(avVar))).booleanValue()) {
                int i614 = f56817l;
                int i615 = ((i614 ^ 13) | (i614 & 13)) << 1;
                int i616 = -(((~i614) & 13) | (i614 & (-14)));
                i13 = ((i615 | i616) << 1) - (i616 ^ i615);
                m = i13 % 128;
                if (i13 % 2 == 0) {
                    getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                    setAnimation setanimation4 = setAnimation.INSTANCE;
                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                    int i617 = 83 / 0;
                    if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                        cy cyVar3 = new cy(kpVar2.setOnFocusChangeListener());
                        cz czVar3 = new cz(kpVar2.setOnFocusChangeListener());
                        int i618 = f56817l;
                        int i619 = i618 ^ 29;
                        int i6110 = ((i618 & 29) | i619) << 1;
                        int i6111 = -i619;
                        int i7110 = ((i6110 | i6111) << 1) - (i6110 ^ i6111);
                        m = i7110 % 128;
                        i14 = 2;
                        int i7111 = i7110 % 2;
                    } else if (((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue() < 11) {
                        int i7112 = f56817l;
                        i15 = (i7112 ^ 25) + ((i7112 & 25) << 1);
                        m = i15 % 128;
                        if (i15 % 2 != 0) {
                            ka kaVar11 = (ka) kpVar2.setOnFocusChangeListener();
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar11, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar11}, -854811249, 854811301, System.identityHashCode(kaVar11)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar11));
                            throw null;
                        }
                        ka kaVar12 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar12, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar12}, -854811249, 854811301, System.identityHashCode(kaVar12)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar12));
                        int i7113 = m;
                        int i7114 = ((i7113 ^ 45) | (i7113 & 45)) << 1;
                        int i7115 = -(((~i7113) & 45) | (i7113 & (-46)));
                        int i7116 = ((i7114 | i7115) << 1) - (i7115 ^ i7114);
                        f56817l = i7116 % 128;
                        int i7117 = i7116 % 2;
                        i14 = 2;
                    } else {
                        ka kaVar13 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar13, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar13}, -854811249, 854811301, System.identityHashCode(kaVar13)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar13));
                        int i7118 = m;
                        int i7119 = (i7118 & (-112)) | ((~i7118) & 111);
                        int i86 = (i7118 & 111) << 1;
                        int i87 = ((i7119 | i86) << 1) - (i86 ^ i7119);
                        f56817l = i87 % 128;
                        i14 = 2;
                        int i88 = i87 % 2;
                    }
                } else {
                    getbeeponfailure = (getBeepOnFailure) setRotationX.setX(new Object[]{setrotationx2}, -707146526, 707146527, System.identityHashCode(setrotationx2));
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4));
                    setAnimation setanimation5 = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                        cy cyVar4 = new cy(kpVar2.setOnFocusChangeListener());
                        cz czVar4 = new cz(kpVar2.setOnFocusChangeListener());
                        int i6112 = f56817l;
                        int i6113 = i6112 ^ 29;
                        int i6114 = ((i6112 & 29) | i6113) << 1;
                        int i6115 = -i6113;
                        int i71110 = ((i6114 | i6115) << 1) - (i6114 ^ i6115);
                        m = i71110 % 128;
                        i14 = 2;
                        int i71111 = i71110 % 2;
                    } else if (((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue() < 11) {
                        int i71112 = f56817l;
                        i15 = (i71112 ^ 25) + ((i71112 & 25) << 1);
                        m = i15 % 128;
                        if (i15 % 2 != 0) {
                            ka kaVar14 = (ka) kpVar2.setOnFocusChangeListener();
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar14, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar14}, -854811249, 854811301, System.identityHashCode(kaVar14)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar14));
                            throw null;
                        }
                        ka kaVar15 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar15, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar15}, -854811249, 854811301, System.identityHashCode(kaVar15)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar15));
                        int i71113 = m;
                        int i71114 = ((i71113 ^ 45) | (i71113 & 45)) << 1;
                        int i71115 = -(((~i71113) & 45) | (i71113 & (-46)));
                        int i71116 = ((i71114 | i71115) << 1) - (i71115 ^ i71114);
                        f56817l = i71116 % 128;
                        int i71117 = i71116 % 2;
                        i14 = 2;
                    } else {
                        ka kaVar16 = (ka) kpVar2.setOnFocusChangeListener();
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar16, ArraysKt___ArraysJvmKt.plus((byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kaVar16}, -854811249, 854811301, System.identityHashCode(kaVar16)), (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure)))}, 1069122946, -1069122918, System.identityHashCode(kaVar16));
                        int i71118 = m;
                        int i71119 = (i71118 & (-112)) | ((~i71118) & 111);
                        int i89 = (i71118 & 111) << 1;
                        int i810 = ((i71119 | i89) << 1) - (i89 ^ i71119);
                        f56817l = i810 % 128;
                        i14 = 2;
                        int i811 = i810 % 2;
                    }
                }
            } else {
                i14 = 2;
            }
        }
        ka kaVar17 = (ka) kpVar2.setOnFocusChangeListener();
        Object[] objArr2 = new Object[i14];
        objArr2[0] = kaVar17;
        objArr2[1] = null;
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(objArr2, -1576428727, 1576428728, System.identityHashCode(kaVar17));
        int i90 = (-2) - ((f56817l + 74) ^ (-1));
        m = i90 % 128;
        if (i90 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 514012375, -514012374, System.identityHashCode(this));
    }
}
