package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gg extends fy {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56014i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56015j = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar, @NotNull getValue getvalue) {
        super(fiVar, settextkeepstate, grVar, getvalue);
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0346  */
    /* JADX WARN: Code duplicated, block: B:41:0x0383  */
    /* JADX WARN: Code duplicated, block: B:43:0x0385  */
    /* JADX WARN: Code duplicated, block: B:45:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x03da  */
    /* JADX WARN: Code duplicated, block: B:49:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0404  */
    /* JADX WARN: Code duplicated, block: B:53:0x0407  */
    /* JADX WARN: Code duplicated, block: B:56:0x041d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0462  */
    /* JADX WARN: Code duplicated, block: B:59:0x0480  */
    /* JADX WARN: Code duplicated, block: B:62:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x051d  */
    /* JADX WARN: Code duplicated, block: B:70:0x054d  */
    /* JADX WARN: Code duplicated, block: B:72:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x060e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk fkVar;
        int i13;
        fk fkVar2;
        int i14;
        int i15;
        byte[] bArr;
        getBeepOnFailure getbeeponfailure;
        byte[] bArr2;
        fo foVar;
        fp fpVar;
        int i16;
        int i17;
        int i18 = ~i11;
        int i19 = ~i10;
        int i20 = ~i12;
        int i21 = (((~(i19 | i11)) | (~(i20 | i19))) * 983) + (((~(i18 | i20)) | i19) * (-983)) + ((i10 | i18) * 983) + (i11 * 984) + (i10 * (-1965));
        if (i21 != 1) {
            if (i21 == 2) {
                fi fiVar = (fi) objArr[0];
                int i22 = f56015j;
                int i23 = (((i22 | 12) << 1) - (i22 ^ 12)) - 1;
                f56014i = i23 % 128;
                int i24 = i23 % 2;
                setAnimation setanimation = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(fiVar));
                setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() % 4 != 0) {
                    int i25 = f56014i + 35;
                    f56015j = i25 % 128;
                    int i26 = i25 % 2;
                    return Boolean.FALSE;
                }
                int i27 = f56015j;
                int i28 = i27 + 69;
                f56014i = i28 % 128;
                boolean z10 = i28 % 2 == 0;
                int i29 = i27 + 26;
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                f56014i = i30 % 128;
                int i31 = i30 % 2;
                return Boolean.valueOf(z10);
            }
            if (i21 != 3) {
                if (i21 != 4) {
                    gg ggVar = (gg) objArr[0];
                    int i32 = f56015j;
                    int i33 = ((i32 ^ 117) - (~(-(-((i32 & 117) << 1))))) - 1;
                    f56014i = i33 % 128;
                    int i34 = i33 % 2;
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 634564037, -634564032, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1272420639, -1272420489, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 300582665, -300582602, (int) System.currentTimeMillis())}).iterator();
                    int i35 = f56015j;
                    int i36 = i35 ^ 39;
                    int i37 = ((i35 & 39) | i36) << 1;
                    int i38 = -i36;
                    int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                    while (true) {
                        f56014i = i39 % 128;
                        int i40 = i39 % 2;
                        if (!it.hasNext()) {
                            break;
                        }
                        int i41 = f56015j;
                        int i42 = ((i41 & 100) + (i41 | 100)) - 1;
                        f56014i = i42 % 128;
                        int i43 = i42 % 2;
                        TransactionFailed transactionFailed = (TransactionFailed) it.next();
                        fi fiVar2 = (fi) ggVar.setOnFocusChangeListener();
                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar2, transactionFailed}, -1124769376, 1124769437, System.identityHashCode(fiVar2))).booleanValue();
                        int i44 = f56015j;
                        int i45 = i44 ^ 63;
                        int i46 = (i44 & 63) << 1;
                        i39 = ((i45 | i46) << 1) - (i46 ^ i45);
                    }
                    setEms setems = new setEms(setFitsSystemWindows.setOnFocusChangeListener, false);
                    ee eeVar = ee.setDividerPadding;
                    fk fkVar3 = (fk) ee.setOnFocusChangeListener(new Object[]{ggVar.setOnFocusChangeListener(), ggVar.setY(), setems}, 1044341421, -1044341412, (int) System.currentTimeMillis());
                    int i47 = f56014i + 44;
                    int i48 = (i47 ^ (-1)) + (i47 << 1);
                    f56015j = i48 % 128;
                    if (i48 % 2 != 0) {
                        return fkVar3;
                    }
                    throw null;
                }
                fi fiVar3 = (fi) objArr[0];
                int i49 = f56015j;
                int i50 = (i49 ^ 74) + ((i49 & 74) << 1);
                int i51 = (i50 ^ (-1)) + (i50 << 1);
                f56014i = i51 % 128;
                int i52 = i51 % 2;
                setAnimation setanimation3 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, 1014467290, -1014467254, System.identityHashCode(fiVar3))).booleanValue()) {
                    int i53 = f56014i;
                    int i54 = (((i53 | 100) << 1) - (i53 ^ 100)) - 1;
                    f56015j = i54 % 128;
                    int i55 = i54 % 2;
                    TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, 1014467290, -1014467254, System.identityHashCode(fiVar3))).booleanValue()) {
                        int i56 = f56015j;
                        int i57 = (((i56 | 78) << 1) - (i56 ^ 78)) - 1;
                        f56014i = i57 % 128;
                        int i58 = i57 % 2;
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 623032086, -623031889, (int) System.currentTimeMillis());
                        if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 1014467290, -1014467254, System.identityHashCode(fiVar3))).booleanValue()) {
                            int i59 = f56015j;
                            int i60 = i59 & 121;
                            int i61 = (((i59 ^ 121) | i60) << 1) - ((i59 | 121) & (~i60));
                            f56014i = i61 % 128;
                            int i62 = i61 % 2;
                            TransactionFailed transactionFailedIntegrationEndpoint = setAnimation.IntegrationEndpoint();
                            if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar3, (String) TransactionFailed.setX(new Object[]{transactionFailedIntegrationEndpoint}, 1914607362, -1914607356, System.identityHashCode(transactionFailedIntegrationEndpoint))}, 1014467290, -1014467254, System.identityHashCode(fiVar3))).booleanValue()) {
                                int i63 = f56014i + 7;
                                f56015j = i63 % 128;
                                int i64 = i63 % 2;
                                if (((Boolean) setX(new Object[]{fiVar3}, -935742966, 935742968, (int) System.currentTimeMillis())).booleanValue()) {
                                    int i65 = f56015j;
                                    int i66 = (i65 & (-106)) | ((~i65) & 105);
                                    int i67 = (i65 & 105) << 1;
                                    int i68 = (i66 ^ i67) + ((i66 & i67) << 1);
                                    f56014i = i68 % 128;
                                    int i69 = i68 % 2;
                                    int i70 = ((i65 & 117) - (~(i65 | 117))) - 1;
                                    f56014i = i70 % 128;
                                    int i71 = i70 % 2;
                                    return Boolean.TRUE;
                                }
                            }
                        }
                    }
                }
                int i72 = f56014i;
                int i73 = i72 | 69;
                int i74 = ((i73 << 1) - (~(-((~(i72 & 69)) & i73)))) - 1;
                f56015j = i74 % 128;
                if (i74 % 2 == 0) {
                    int i75 = 68 / 0;
                }
                return Boolean.FALSE;
            }
            fi fiVar4 = (fi) objArr[1];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
            gr grVar = (gr) objArr[3];
            setRotationX setrotationx = (setRotationX) objArr[4];
            int i76 = f56014i;
            int i77 = ((i76 | 77) << 1) - (i76 ^ 77);
            f56015j = i77 % 128;
            if (i77 % 2 == 0) {
                setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
                int i78 = 12 / 0;
                if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -618713615, 618713615, System.identityHashCode(grVar));
                    int i79 = f56015j;
                    i13 = ((i79 & 100) + (i79 | 100)) - 1;
                    f56014i = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else if (!(!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue())) {
                    getNetworkTimeout getnetworktimeout = getNetworkTimeout.INSTANCE;
                    if (!(!((Boolean) getNetworkTimeout.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), fiVar4}, 803823515, -803823515, (int) System.currentTimeMillis())).booleanValue())) {
                        i15 = f56014i + 39;
                        f56015j = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i80 = 82 / 0;
                            if (((Boolean) setX(new Object[]{fiVar4}, 1421536925, -1421536921, (int) System.currentTimeMillis())).booleanValue()) {
                                bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, setAnimation.IntegrationEndpoint()}, -1344789201, 1344789222, System.identityHashCode(fiVar4));
                                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], 609943876, -609943849, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(fiVar4));
                                if (getbeeponfailure == null) {
                                    int i81 = f56015j;
                                    int i82 = (i81 | 37) << 1;
                                    int i83 = -(i81 ^ 37);
                                    int i84 = (i82 & i83) + (i83 | i82);
                                    int i85 = i84 % 128;
                                    f56014i = i85;
                                    int i86 = i84 % 2;
                                    int i87 = ((i85 & 70) + (i85 | 70)) - 1;
                                    f56015j = i87 % 128;
                                    int i88 = i87 % 2;
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                                    int i89 = f56014i;
                                    int i90 = ((i89 | 17) << 1) - (i89 ^ 17);
                                    f56015j = i90 % 128;
                                    int i91 = i90 % 2;
                                }
                                if (!Arrays.equals(bArr, bArr2)) {
                                    int i92 = f56015j;
                                    i17 = (((i92 | 9) << 1) - (~(-(((~i92) & 9) | (i92 & (-10)))))) - 1;
                                    f56014i = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                    fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                } else {
                                    foVar = new fo(fiVar4);
                                    fpVar = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                    if (((fw) fp.setOnFocusChangeListener(new Object[]{fpVar}, -160229187, 160229189, System.identityHashCode(fpVar))) != fw.setY) {
                                        int i93 = f56014i;
                                        int i94 = i93 ^ 93;
                                        int i95 = (i93 & 93) << 1;
                                        int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                                        f56015j = i96 % 128;
                                        int i97 = i96 % 2;
                                        fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                        int i98 = f56014i + 95;
                                        f56015j = i98 % 128;
                                        int i99 = i98 % 2;
                                    } else {
                                        fp fpVar2 = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, new av(fpVar2.setNavigationOnClickListener(), fpVar2.getNavBarTitleString(), false)}, -1576428727, 1576428728, System.identityHashCode(fiVar4));
                                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis())}, -1124769376, 1124769437, System.identityHashCode(fiVar4))).booleanValue();
                                        int i100 = f56014i;
                                        i16 = (i100 & 39) + (i100 | 39);
                                        f56015j = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            throw null;
                                        }
                                        fkVar2 = null;
                                    }
                                }
                            } else {
                                fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                int i101 = f56015j;
                                int i102 = ((i101 ^ 56) + ((i101 & 56) << 1)) - 1;
                                f56014i = i102 % 128;
                                int i103 = i102 % 2;
                            }
                        } else if (((Boolean) setX(new Object[]{fiVar4}, 1421536925, -1421536921, (int) System.currentTimeMillis())).booleanValue()) {
                            bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, setAnimation.IntegrationEndpoint()}, -1344789201, 1344789222, System.identityHashCode(fiVar4));
                            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], 609943876, -609943849, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(fiVar4));
                            if (getbeeponfailure == null) {
                                int i810 = f56015j;
                                int i811 = (i810 | 37) << 1;
                                int i812 = -(i810 ^ 37);
                                int i813 = (i811 & i812) + (i812 | i811);
                                int i814 = i813 % 128;
                                f56014i = i814;
                                int i815 = i813 % 2;
                                int i816 = ((i814 & 70) + (i814 | 70)) - 1;
                                f56015j = i816 % 128;
                                int i817 = i816 % 2;
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                                int i818 = f56014i;
                                int i910 = ((i818 | 17) << 1) - (i818 ^ 17);
                                f56015j = i910 % 128;
                                int i911 = i910 % 2;
                            }
                            if (!Arrays.equals(bArr, bArr2)) {
                                int i912 = f56015j;
                                i17 = (((i912 | 9) << 1) - (~(-(((~i912) & 9) | (i912 & (-10)))))) - 1;
                                f56014i = i17 % 128;
                                if (i17 % 2 == 0) {
                                    throw null;
                                }
                                fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                            } else {
                                foVar = new fo(fiVar4);
                                fpVar = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                if (((fw) fp.setOnFocusChangeListener(new Object[]{fpVar}, -160229187, 160229189, System.identityHashCode(fpVar))) != fw.setY) {
                                    int i913 = f56014i;
                                    int i914 = i913 ^ 93;
                                    int i915 = (i913 & 93) << 1;
                                    int i916 = (i914 ^ i915) + ((i915 & i914) << 1);
                                    f56015j = i916 % 128;
                                    int i917 = i916 % 2;
                                    fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                    int i918 = f56014i + 95;
                                    f56015j = i918 % 128;
                                    int i919 = i918 % 2;
                                } else {
                                    fp fpVar3 = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, new av(fpVar3.setNavigationOnClickListener(), fpVar3.getNavBarTitleString(), false)}, -1576428727, 1576428728, System.identityHashCode(fiVar4));
                                    ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis())}, -1124769376, 1124769437, System.identityHashCode(fiVar4))).booleanValue();
                                    int i104 = f56014i;
                                    i16 = (i104 & 39) + (i104 | 39);
                                    f56015j = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        throw null;
                                    }
                                    fkVar2 = null;
                                }
                            }
                        } else {
                            fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                            int i105 = f56015j;
                            int i106 = ((i105 ^ 56) + ((i105 & 56) << 1)) - 1;
                            f56014i = i106 % 128;
                            int i107 = i106 % 2;
                        }
                    } else {
                        fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                        int i108 = f56015j;
                        int i109 = ((i108 ^ 56) + ((i108 & 56) << 1)) - 1;
                        f56014i = i109 % 128;
                        int i1010 = i109 % 2;
                    }
                } else {
                    int i110 = f56015j;
                    int i111 = (i110 | 23) << 1;
                    int i112 = -(((~i110) & 23) | (i110 & (-24)));
                    i14 = (i111 ^ i112) + ((i112 & i111) << 1);
                    f56014i = i14 % 128;
                    if (i14 % 2 != 0) {
                        fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                        int i113 = 79 / 0;
                    } else {
                        fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                    }
                }
                fkVar2 = fkVar;
            } else {
                setNextFocusLeftId setnextfocusleftid2 = setNextFocusLeftId.INSTANCE;
                if (!(!((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue())) {
                    fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -618713615, 618713615, System.identityHashCode(grVar));
                    int i710 = f56015j;
                    i13 = ((i710 & 100) + (i710 | 100)) - 1;
                    f56014i = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else if (!(!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue())) {
                    getNetworkTimeout getnetworktimeout2 = getNetworkTimeout.INSTANCE;
                    if (!(!((Boolean) getNetworkTimeout.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), fiVar4}, 803823515, -803823515, (int) System.currentTimeMillis())).booleanValue())) {
                        i15 = f56014i + 39;
                        f56015j = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i819 = 82 / 0;
                            if (((Boolean) setX(new Object[]{fiVar4}, 1421536925, -1421536921, (int) System.currentTimeMillis())).booleanValue()) {
                                bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, setAnimation.IntegrationEndpoint()}, -1344789201, 1344789222, System.identityHashCode(fiVar4));
                                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], 609943876, -609943849, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(fiVar4));
                                if (getbeeponfailure == null) {
                                    int i8110 = f56015j;
                                    int i8111 = (i8110 | 37) << 1;
                                    int i8112 = -(i8110 ^ 37);
                                    int i8113 = (i8111 & i8112) + (i8112 | i8111);
                                    int i8114 = i8113 % 128;
                                    f56014i = i8114;
                                    int i8115 = i8113 % 2;
                                    int i8116 = ((i8114 & 70) + (i8114 | 70)) - 1;
                                    f56015j = i8116 % 128;
                                    int i8117 = i8116 % 2;
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                                    int i8118 = f56014i;
                                    int i9110 = ((i8118 | 17) << 1) - (i8118 ^ 17);
                                    f56015j = i9110 % 128;
                                    int i9111 = i9110 % 2;
                                }
                                if (!Arrays.equals(bArr, bArr2)) {
                                    int i9112 = f56015j;
                                    i17 = (((i9112 | 9) << 1) - (~(-(((~i9112) & 9) | (i9112 & (-10)))))) - 1;
                                    f56014i = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                    fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                } else {
                                    foVar = new fo(fiVar4);
                                    fpVar = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                    if (((fw) fp.setOnFocusChangeListener(new Object[]{fpVar}, -160229187, 160229189, System.identityHashCode(fpVar))) != fw.setY) {
                                        int i9113 = f56014i;
                                        int i9114 = i9113 ^ 93;
                                        int i9115 = (i9113 & 93) << 1;
                                        int i9116 = (i9114 ^ i9115) + ((i9115 & i9114) << 1);
                                        f56015j = i9116 % 128;
                                        int i9117 = i9116 % 2;
                                        fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                        int i9118 = f56014i + 95;
                                        f56015j = i9118 % 128;
                                        int i9119 = i9118 % 2;
                                    } else {
                                        fp fpVar4 = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, new av(fpVar4.setNavigationOnClickListener(), fpVar4.getNavBarTitleString(), false)}, -1576428727, 1576428728, System.identityHashCode(fiVar4));
                                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis())}, -1124769376, 1124769437, System.identityHashCode(fiVar4))).booleanValue();
                                        int i1011 = f56014i;
                                        i16 = (i1011 & 39) + (i1011 | 39);
                                        f56015j = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            throw null;
                                        }
                                        fkVar2 = null;
                                    }
                                }
                            } else {
                                fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                int i1012 = f56015j;
                                int i1013 = ((i1012 ^ 56) + ((i1012 & 56) << 1)) - 1;
                                f56014i = i1013 % 128;
                                int i1014 = i1013 % 2;
                            }
                        } else if (((Boolean) setX(new Object[]{fiVar4}, 1421536925, -1421536921, (int) System.currentTimeMillis())).booleanValue()) {
                            fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                            int i1015 = f56015j;
                            int i1016 = ((i1015 ^ 56) + ((i1015 & 56) << 1)) - 1;
                            f56014i = i1016 % 128;
                            int i1017 = i1016 % 2;
                        } else {
                            bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, setAnimation.IntegrationEndpoint()}, -1344789201, 1344789222, System.identityHashCode(fiVar4));
                            getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], 609943876, -609943849, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(fiVar4));
                            if (getbeeponfailure == null) {
                                int i8119 = f56015j;
                                int i81110 = (i8119 | 37) << 1;
                                int i81111 = -(i8119 ^ 37);
                                int i81112 = (i81110 & i81111) + (i81111 | i81110);
                                int i81113 = i81112 % 128;
                                f56014i = i81113;
                                int i81114 = i81112 % 2;
                                int i81115 = ((i81113 & 70) + (i81113 | 70)) - 1;
                                f56015j = i81115 % 128;
                                int i81116 = i81115 % 2;
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                                int i81117 = f56014i;
                                int i91110 = ((i81117 | 17) << 1) - (i81117 ^ 17);
                                f56015j = i91110 % 128;
                                int i91111 = i91110 % 2;
                            }
                            if (!Arrays.equals(bArr, bArr2)) {
                                int i91112 = f56015j;
                                i17 = (((i91112 | 9) << 1) - (~(-(((~i91112) & 9) | (i91112 & (-10)))))) - 1;
                                f56014i = i17 % 128;
                                if (i17 % 2 == 0) {
                                    throw null;
                                }
                                fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                            } else {
                                foVar = new fo(fiVar4);
                                fpVar = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                if (((fw) fp.setOnFocusChangeListener(new Object[]{fpVar}, -160229187, 160229189, System.identityHashCode(fpVar))) != fw.setY) {
                                    int i91113 = f56014i;
                                    int i91114 = i91113 ^ 93;
                                    int i91115 = (i91113 & 93) << 1;
                                    int i91116 = (i91114 ^ i91115) + ((i91115 & i91114) << 1);
                                    f56015j = i91116 % 128;
                                    int i91117 = i91116 % 2;
                                    fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                                    int i91118 = f56014i + 95;
                                    f56015j = i91118 % 128;
                                    int i91119 = i91118 % 2;
                                } else {
                                    fp fpVar5 = (fp) ((setImageTintList) w.setX(new Object[]{foVar}, 1693919772, -1693919769, System.identityHashCode(foVar)));
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, new av(fpVar5.setNavigationOnClickListener(), fpVar5.getNavBarTitleString(), false)}, -1576428727, 1576428728, System.identityHashCode(fiVar4));
                                    ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar4, (TransactionFailed) setAnimation.setY(new Object[0], -1554496015, 1554496070, (int) System.currentTimeMillis())}, -1124769376, 1124769437, System.identityHashCode(fiVar4))).booleanValue();
                                    int i1018 = f56014i;
                                    i16 = (i1018 & 39) + (i1018 | 39);
                                    f56015j = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        throw null;
                                    }
                                    fkVar2 = null;
                                }
                            }
                        }
                    } else {
                        fkVar2 = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                        int i1019 = f56015j;
                        int i10110 = ((i1019 ^ 56) + ((i1019 & 56) << 1)) - 1;
                        f56014i = i10110 % 128;
                        int i10111 = i10110 % 2;
                    }
                } else {
                    int i114 = f56015j;
                    int i115 = (i114 | 23) << 1;
                    int i116 = -(((~i114) & 23) | (i114 & (-24)));
                    i14 = (i115 ^ i116) + ((i116 & i115) << 1);
                    f56014i = i14 % 128;
                    if (i14 % 2 != 0) {
                        fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                        int i117 = 79 / 0;
                    } else {
                        fkVar = (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar4, settextkeepstate}, 1239397712, -1239397695, System.identityHashCode(grVar));
                    }
                }
                fkVar2 = fkVar;
            }
            return fkVar2;
        }
        gg ggVar2 = (gg) objArr[0];
        setRotationX setrotationx2 = (setRotationX) objArr[1];
        int i118 = f56015j;
        int i119 = i118 & 113;
        int i120 = -(-((i118 ^ 113) | i119));
        int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
        f56014i = i121 % 128;
        int i122 = i121 % 2;
        Intrinsics.checkNotNullParameter(setrotationx2, "");
        setAnimation setanimation4 = setAnimation.INSTANCE;
        Iterator it2 = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{(TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}).iterator();
        int i123 = f56015j + 89;
        while (true) {
            f56014i = i123 % 128;
            int i124 = i123 % 2;
            if (!it2.hasNext()) {
                fk fkVar4 = (fk) setX(new Object[]{ggVar2, (fi) ggVar2.setOnFocusChangeListener(), ggVar2.setCompoundDrawableTintBlendMode(), (gr) ggVar2.setX(), setrotationx2}, 1099811310, -1099811307, System.identityHashCode(ggVar2));
                if (fkVar4 != null) {
                    System.identityHashCode(ggVar2);
                    System.identityHashCode(ggVar2);
                    int i125 = f56014i;
                    int i126 = ((i125 ^ 39) - (~((i125 & 39) << 1))) - 1;
                    f56015j = i126 % 128;
                    if (i126 % 2 == 0) {
                        throw null;
                    }
                } else {
                    fi fiVar5 = (fi) ggVar2.setOnFocusChangeListener();
                    av avVar = (av) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar5}, 1774718002, -1774717938, System.identityHashCode(fiVar5));
                    if (avVar == null) {
                        int i127 = f56014i;
                        int i128 = i127 & 35;
                        int i129 = ((i127 ^ 35) | i128) << 1;
                        int i130 = -((~i128) & (i127 | 35));
                        int i131 = (i129 & i130) + (i129 | i130);
                        f56015j = i131 % 128;
                        int i132 = i131 % 2;
                        int i133 = (i127 ^ 99) + ((i127 & 99) << 1);
                        f56015j = i133 % 128;
                        int i134 = i133 % 2;
                        fkVar4 = null;
                    } else {
                        ggVar2.setY().setOnFocusChangeListener(new setText(((Byte) av.setY(new Object[]{avVar}, -888174800, 888174800, System.identityHashCode(avVar))).byteValue(), ((Byte) av.setY(new Object[]{avVar}, 1262930435, -1262930433, System.identityHashCode(avVar))).byteValue()));
                        fkVar4 = fk.setMinHeight;
                        int i135 = f56015j;
                        int i136 = i135 & 61;
                        int i137 = ((i135 ^ 61) | i136) << 1;
                        int i138 = -((i135 | 61) & (~i136));
                        int i139 = (i137 & i138) + (i138 | i137);
                        f56014i = i139 % 128;
                        int i140 = i139 % 2;
                    }
                    if (fkVar4 == null) {
                        int i141 = f56015j;
                        int i142 = i141 & 47;
                        int i143 = ((i141 | 47) & (~i142)) + (i142 << 1);
                        f56014i = i143 % 128;
                        if (i143 % 2 == 0) {
                            return (fk) setX(new Object[]{ggVar2}, 604722749, -604722749, System.identityHashCode(ggVar2));
                        }
                        throw null;
                    }
                    int i144 = f56015j + 117;
                    f56014i = i144 % 128;
                    if (i144 % 2 != 0) {
                        throw null;
                    }
                }
                return fkVar4;
            }
            int i145 = f56015j + 121;
            f56014i = i145 % 128;
            if (i145 % 2 != 0) {
                TransactionFailed transactionFailed5 = (TransactionFailed) it2.next();
                fi fiVar6 = (fi) ggVar2.setOnFocusChangeListener();
                ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar6, transactionFailed5}, -1124769376, 1124769437, System.identityHashCode(fiVar6))).booleanValue();
                throw null;
            }
            TransactionFailed transactionFailed6 = (TransactionFailed) it2.next();
            fi fiVar7 = (fi) ggVar2.setOnFocusChangeListener();
            ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar7, transactionFailed6}, -1124769376, 1124769437, System.identityHashCode(fiVar7))).booleanValue();
            int i146 = f56015j;
            int i147 = i146 & 73;
            i123 = (((i146 | 73) & (~i147)) - (~(-(-(i147 << 1))))) - 1;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setX(new Object[]{this, setrotationx}, 1593828866, -1593828865, System.identityHashCode(this));
    }
}
