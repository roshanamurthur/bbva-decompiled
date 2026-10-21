package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class kw extends ez implements fb<ka> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56864k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56865l = 1;

    /* JADX WARN: Code duplicated, block: B:12:0x0097  */
    /* JADX WARN: Code duplicated, block: B:13:0x00bb A[PHI: r11
      0x00bb: PHI (r11v28 com.mypinpad.tsdk.i.getBeepOnFailure) = (r11v12 com.mypinpad.tsdk.i.getBeepOnFailure), (r11v36 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:11:0x0095, B:8:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ String b(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        Pair pair;
        kw kwVar = (kw) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        j jVar = (j) objArr[2];
        f fVar = (f) objArr[3];
        l lVar = (l) objArr[4];
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[5];
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{setAnimation.TransactionErrorCause(), setAnimation.setImportantForContentCapture()});
        ArrayList arrayList = new ArrayList();
        Iterator it = listListOf.iterator();
        int i10 = f56864k + 73;
        f56865l = i10 % 128;
        int i11 = i10 % 2;
        while (it.hasNext()) {
            int i12 = f56865l + 29;
            f56864k = i12 % 128;
            if (i12 % 2 != 0) {
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) it.next()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                int i13 = 72 / 0;
                if (getbeeponfailure == null) {
                    int i14 = f56865l;
                    int i15 = ((i14 & (-62)) | ((~i14) & 61)) + ((i14 & 61) << 1);
                    f56864k = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = (-2) - (((i14 ^ 34) + ((i14 & 34) << 1)) ^ (-1));
                    f56864k = i17 % 128;
                    int i18 = i17 % 2;
                    pair = null;
                } else {
                    pair = (Pair) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1674109266, 1674109269, (int) System.currentTimeMillis());
                    int i19 = f56865l;
                    int i20 = i19 & 119;
                    int i21 = (((i19 | 119) & (~i20)) - (~(i20 << 1))) - 1;
                    f56864k = i21 % 128;
                    int i22 = i21 % 2;
                }
            } else {
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) it.next()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure == null) {
                    int i110 = f56865l;
                    int i111 = ((i110 & (-62)) | ((~i110) & 61)) + ((i110 & 61) << 1);
                    f56864k = i111 % 128;
                    int i112 = i111 % 2;
                    int i113 = (-2) - (((i110 ^ 34) + ((i110 & 34) << 1)) ^ (-1));
                    f56864k = i113 % 128;
                    int i114 = i113 % 2;
                    pair = null;
                } else {
                    pair = (Pair) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1674109266, 1674109269, (int) System.currentTimeMillis());
                    int i115 = f56865l;
                    int i23 = i115 & 119;
                    int i24 = (((i115 | 119) & (~i23)) - (~(i23 << 1))) - 1;
                    f56864k = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            if (pair != null) {
                int i26 = f56865l;
                int i27 = (i26 & (-92)) | ((~i26) & 91);
                int i28 = -(-((i26 & 91) << 1));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                f56864k = i29 % 128;
                if (i29 % 2 != 0) {
                    arrayList.add(pair);
                    throw null;
                }
                arrayList.add(pair);
            } else {
                int i30 = f56865l;
                int i31 = ((((i30 ^ 65) | (i30 & 65)) << 1) - (~(-(((~i30) & 65) | (i30 & (-66)))))) - 1;
                f56864k = i31 % 128;
                int i32 = i31 % 2;
            }
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, RootService.LINE_BREAK, null, null, 0, null, null, 62, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure2));
        sb2.append("\n\nDiscretionary tags\n");
        sb2.append(strJoinToString$default);
        String string = sb2.toString();
        int i33 = f56864k;
        int i34 = i33 & 45;
        int i35 = (i34 - (~((i33 ^ 45) | i34))) - 1;
        f56865l = i35 % 128;
        if (i35 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk onFocusChangeListener;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        switch (((~(i15 | i12)) * 345) + (((~(i10 | i14)) | (~(i13 | (~i12)))) * 345) + (((~i15) | (~(i13 | i12))) * 345) + (i11 * (-344)) + (i10 * (-344))) {
            case 1:
                kw kwVar = (kw) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                int i16 = f56865l;
                int i17 = i16 ^ 89;
                int i18 = (((i16 & 89) | i17) << 1) - i17;
                f56864k = i18 % 128;
                ka kaVar = (ka) setscrollbardefaultdelaybeforefade;
                if (i18 % 2 != 0) {
                    throw null;
                }
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{kwVar, kaVar, settextkeepstate}, -1409352621, 1409352628, System.identityHashCode(kwVar));
                int i19 = f56864k;
                int i20 = i19 & 77;
                int i21 = i20 + ((i19 ^ 77) | i20);
                f56865l = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 60 / 0;
                }
                break;
                break;
            case 2:
                kw kwVar2 = (kw) objArr[0];
                ka kaVar2 = (ka) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[4];
                int i23 = f56864k;
                int i24 = ((~i23) & 1) | (i23 & (-2));
                int i25 = (i23 & 1) << 1;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f56865l = i26 % 128;
                int i27 = i26 % 2;
                Intrinsics.checkNotNullParameter(kaVar2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                Intrinsics.checkNotNullParameter(valueQualifier, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                fk fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{kwVar2, activateSession.ERROR_OTHER_CARD, fd.END_APPLICATION, kaVar2, settextkeepstate2, valueQualifier, setcontentcapturesession}, 555235832, -555235824, System.identityHashCode(kwVar2));
                int i28 = f56864k + 71;
                f56865l = i28 % 128;
                int i29 = i28 % 2;
                return fkVar;
            case 3:
                return b(objArr);
            case 4:
                kw kwVar3 = (kw) objArr[0];
                ka kaVar3 = (ka) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(kaVar3, "");
                Intrinsics.checkNotNullParameter(settextkeepstate3, "");
                fk onFocusChangeListener2 = ez.setOnFocusChangeListener(kwVar3, kaVar3, settextkeepstate3, null, ez.setY(fd.END_APPLICATION, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, null, null, null, null, null, 192), ez.setY(kaVar3, (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], 689677017, -689677017, (int) System.currentTimeMillis()), ValueQualifier.setY, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())), new f(activateSession.ERROR_OTHER_CARD, setItemChecked.setX, ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                System.identityHashCode(kwVar3);
                System.identityHashCode(kwVar3);
                return onFocusChangeListener2;
            case 5:
                kw kwVar4 = (kw) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                int i30 = f56865l;
                int i31 = i30 & 69;
                int i32 = -(-(i30 | 69));
                int i33 = (i31 & i32) + (i32 | i31);
                f56864k = i33 % 128;
                ka kaVar4 = (ka) setscrollbardefaultdelaybeforefade2;
                if (i33 % 2 == 0) {
                    return (fk) setCompoundDrawableTintBlendMode(new Object[]{kwVar4, kaVar4, settextkeepstate4}, -1515791855, 1515791859, System.identityHashCode(kwVar4));
                }
                throw null;
            case 6:
                kw kwVar5 = (kw) objArr[0];
                ka kaVar5 = (ka) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                activateSession activatesession = (activateSession) objArr[3];
                fd fdVar = (fd) objArr[4];
                setSelector setselector = (setSelector) objArr[5];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[6];
                Intrinsics.checkNotNullParameter(kaVar5, "");
                Intrinsics.checkNotNullParameter(settextkeepstate5, "");
                Intrinsics.checkNotNullParameter(activatesession, "");
                Intrinsics.checkNotNullParameter(fdVar, "");
                Intrinsics.checkNotNullParameter(setselector, "");
                Intrinsics.checkNotNullParameter(settransitionvisibility, "");
                f fVar = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
                l y7 = ez.setY(kaVar5, activatesession, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis()));
                j y10 = ez.setY(fdVar, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, Boolean.FALSE, null, settransitionvisibility, null, null, 192);
                ey eyVar = ey.INSTANCE;
                fk onFocusChangeListener3 = ez.setOnFocusChangeListener(kwVar5, kaVar5, settextkeepstate5, (getBeepOnFailure) ey.setY(new Object[]{kaVar5}, 1660534021, -1660534020, (int) System.currentTimeMillis()), y10, y7, fVar);
                int i34 = f56865l;
                int i35 = (i34 & 51) + (i34 | 51);
                f56864k = i35 % 128;
                int i36 = i35 % 2;
                return onFocusChangeListener3;
            case 7:
                kw kwVar6 = (kw) objArr[0];
                ka kaVar6 = (ka) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(kaVar6, "");
                Intrinsics.checkNotNullParameter(settextkeepstate6, "");
                onFocusChangeListener = ez.setOnFocusChangeListener(kwVar6, kaVar6, settextkeepstate6, null, ez.setY(fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192), null, new f(activateSession.N_A, ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), setDrawSelectorOnTop.setOnFocusChangeListener, ez.setY.setOnFocusChangeListener()));
                int i37 = f56864k;
                int i38 = i37 & 57;
                int i39 = i37 | 57;
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f56865l = i40 % 128;
                if (i40 % 2 == 0) {
                    int i41 = 31 / 0;
                }
                break;
            case 8:
                kw kwVar7 = (kw) objArr[0];
                activateSession activatesession2 = (activateSession) objArr[1];
                fd fdVar2 = (fd) objArr[2];
                ka kaVar7 = (ka) objArr[3];
                onFocusChangeListener = ez.setOnFocusChangeListener(kwVar7, kaVar7, (setTextKeepState) objArr[4], null, ez.setY(fdVar2, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, null, null, null, null, null, 192), ez.setY(kaVar7, activatesession2, (ValueQualifier) objArr[5], (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())), new f(activatesession2, ez.setY.setNavigationOnClickListener(), (setContentCaptureSession) objArr[6], ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                int i42 = f56865l + 111;
                f56864k = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = 67 / 0;
                }
                break;
            case 9:
                ka kaVar8 = (ka) objArr[1];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[2];
                int i44 = f56864k;
                int i45 = i44 & 13;
                int i46 = (i45 - (~((i44 ^ 13) | i45))) - 1;
                f56865l = i46 % 128;
                int i47 = i46 % 2;
                Intrinsics.checkNotNullParameter(kaVar8, "");
                Intrinsics.checkNotNullParameter(settextkeepstate7, "");
                activateSession activatesession3 = activateSession.CLEAR_DISPLAY;
                ValueQualifier valueQualifier2 = ValueQualifier.setCompoundDrawableTintBlendMode;
                byte[] bArr = new byte[3];
                int i48 = f56865l + 89;
                f56864k = i48 % 128;
                int i49 = i48 % 2;
                int i50 = 0;
                while (i50 < 3) {
                    int i51 = f56865l + 112;
                    int i52 = (i51 ^ (-1)) + (i51 << 1);
                    f56864k = i52 % 128;
                    if (i52 % 2 != 0) {
                        bArr[i50] = 1;
                        i50 %= 0;
                    } else {
                        bArr[i50] = 0;
                        i50++;
                    }
                }
                ez.setX(kaVar8, settextkeepstate7, activatesession3, valueQualifier2, bArr, null);
                int i53 = f56864k + 49;
                f56865l = i53 % 128;
                int i54 = i53 % 2;
                return null;
            case 10:
                kw kwVar8 = (kw) objArr[0];
                ka kaVar9 = (ka) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier3 = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession2 = (setContentCaptureSession) objArr[4];
                int i55 = f56864k;
                int i56 = (i55 ^ 77) + ((i55 & 77) << 1);
                f56865l = i56 % 128;
                if (i56 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(kaVar9, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                    Intrinsics.checkNotNullParameter(valueQualifier3, "");
                    Intrinsics.checkNotNullParameter(setcontentcapturesession2, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(kaVar9, "");
                Intrinsics.checkNotNullParameter(settextkeepstate8, "");
                Intrinsics.checkNotNullParameter(valueQualifier3, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession2, "");
                fk fkVar2 = (fk) setCompoundDrawableTintBlendMode(new Object[]{kwVar8, activateSession.ERROR_OTHER_CARD, fd.END_APPLICATION, kaVar9, settextkeepstate8, valueQualifier3, setcontentcapturesession2}, 555235832, -555235824, System.identityHashCode(kwVar8));
                int i57 = f56864k;
                int i58 = (i57 & (-62)) | ((~i57) & 61);
                int i59 = -(-((i57 & 61) << 1));
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f56865l = i60 % 128;
                int i61 = i60 % 2;
                return fkVar2;
            case 11:
                kw kwVar9 = (kw) objArr[0];
                ka kaVar10 = (ka) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                byte[] bArr2 = (byte[]) objArr[3];
                Intrinsics.checkNotNullParameter(kaVar10, "");
                Intrinsics.checkNotNullParameter(settextkeepstate9, "");
                Intrinsics.checkNotNullParameter(bArr2, "");
                activateSession activatesession4 = activateSession.SEE_PHONE;
                fk onFocusChangeListener4 = ez.setOnFocusChangeListener(kwVar9, kaVar10, settextkeepstate9, null, ez.setY(fd.END_APPLICATION, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(kaVar10, activatesession4, ValueQualifier.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())), new f(activatesession4, ez.setY.setNavigationOnClickListener(), setContentCaptureSession.setLayoutAnimation, ez.setY.setLayoutAnimation(), bArr2));
                int i62 = f56865l;
                int i63 = ((i62 | 27) << 1) - (i62 ^ 27);
                f56864k = i63 % 128;
                int i64 = i63 % 2;
                return onFocusChangeListener4;
            default:
                kw kwVar10 = (kw) objArr[0];
                ka kaVar11 = (ka) objArr[1];
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[2];
                setRotationX setrotationx = (setRotationX) objArr[3];
                Intrinsics.checkNotNullParameter(kaVar11, "");
                Intrinsics.checkNotNullParameter(settextkeepstate10, "");
                Intrinsics.checkNotNullParameter(setrotationx, "");
                fk onFocusChangeListener5 = ez.setOnFocusChangeListener(kwVar10, kaVar11, settextkeepstate10, null, ez.setY(fd.TRY_AGAIN, getY.setOnFocusChangeListener, Boolean.TRUE, null, null, null, null, null, 192), ez.setY(kaVar11, (activateSession) activateSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], 689677017, -689677017, (int) System.currentTimeMillis()), ValueQualifier.setOnFocusChangeListener, (byte[]) ez.setY.setX(new Object[0], -1446138994, 1446139003, (int) System.currentTimeMillis())), new f(activateSession.N_A, setrotationx.setDividerPadding(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                int i65 = f56865l;
                int i66 = ((((i65 ^ 77) | (i65 & 77)) << 1) - (~(-(((~i65) & 77) | (i65 & (-78)))))) - 1;
                f56864k = i66 % 128;
                int i67 = i66 % 2;
                return onFocusChangeListener5;
        }
        return onFocusChangeListener;
    }

    public final void setDividerPadding(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate}, 1615351699, -1615351690, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1697692968, 1697692969, System.identityHashCode(this));
    }

    @NotNull
    public final fk setY(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull byte[] bArr) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate, bArr}, -961968564, 961968575, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull ValueQualifier valueQualifier, @NotNull setContentCaptureSession setcontentcapturesession) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate, valueQualifier, setcontentcapturesession}, -331699183, 331699193, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull setRotationX setrotationx) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate, setrotationx}, -1478600848, 1478600848, System.identityHashCode(this));
    }

    @NotNull
    public final fk setOnFocusChangeListener(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull fd fdVar, @NotNull setSelector setselector, @NotNull setTransitionVisibility settransitionvisibility) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate, activatesession, fdVar, setselector, settransitionvisibility}, 1060517325, -1060517319, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1174235227, -1174235222, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ez
    @NotNull
    public final String setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @Nullable j jVar, @Nullable f fVar, @Nullable l lVar, @Nullable getBeepOnFailure getbeeponfailure) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, jVar, fVar, lVar, getbeeponfailure}, 1562500881, -1562500878, System.identityHashCode(this));
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate}, -1515791855, 1515791859, System.identityHashCode(this));
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull ka kaVar, @NotNull setTextKeepState settextkeepstate, @NotNull ValueQualifier valueQualifier, @NotNull setContentCaptureSession setcontentcapturesession) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, kaVar, settextkeepstate, valueQualifier, setcontentcapturesession}, 1530407395, -1530407393, System.identityHashCode(this));
    }
}
