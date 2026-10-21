package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\b\b\u0000\u0010\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/ea;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/getValue;", "p1", "Lcom/mypinpad/tsdk/i/fk;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/getValue;)Lcom/mypinpad/tsdk/i/fk;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/setTextKeepState;", "Lcom/mypinpad/tsdk/i/ew;", "p2", "Lcom/mypinpad/tsdk/i/setRotationX;", "p3", "setY", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/setRotationX;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class ea {

    @NotNull
    public static final ea INSTANCE = new ea();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55333a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55334b = 1;

    static {
        int i10 = f55333a + 55;
        f55334b = i10 % 128;
        int i11 = i10 % 2;
    }

    @NotNull
    public static fk setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull getValue p10) {
        return (fk) setX(new Object[]{p4, p10}, -80979287, 80979290, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:21:0x015e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0160  */
    /* JADX WARN: Code duplicated, block: B:25:0x0195  */
    /* JADX WARN: Code duplicated, block: B:28:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x0226  */
    /* JADX WARN: Code duplicated, block: B:32:0x023b  */
    /* JADX WARN: Code duplicated, block: B:33:0x024c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0283  */
    /* JADX WARN: Code duplicated, block: B:39:0x029c  */
    /* JADX WARN: Code duplicated, block: B:40:0x029d  */
    /* JADX WARN: Code duplicated, block: B:42:0x029f  */
    /* JADX WARN: Code duplicated, block: B:45:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x0378  */
    /* JADX WARN: Code duplicated, block: B:65:0x0569 A[PHI: r2
      0x0569: PHI (r2v24 com.mypinpad.tsdk.i.getBeepOnFailure) = (r2v23 com.mypinpad.tsdk.i.getBeepOnFailure), (r2v37 com.mypinpad.tsdk.i.getBeepOnFailure) binds: [B:64:0x0567, B:61:0x04ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x058e  */
    /* JADX WARN: Code duplicated, block: B:76:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x070e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0746  */
    /* JADX WARN: Code duplicated, block: B:82:0x075f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0774  */
    /* JADX WARN: Code duplicated, block: B:85:0x078d  */
    /* JADX WARN: Code duplicated, block: B:87:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object dividerPadding;
        int i13;
        TransactionFailed transactionFailed;
        int i14;
        getBeepOnFailure getbeeponfailure;
        ew ewVar;
        int i15;
        ah ahVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = ~i10;
        int i24 = ~i11;
        int i25 = ((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i23 | i24)) | (~(i24 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103));
        if (i25 == 1) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i26 = ~iCurrentTimeMillis;
            int i27 = (-705110967) ^ i26;
            int i28 = (-705110967) & i26;
            int i29 = ~((i27 & i28) | (i27 ^ i28));
            int i30 = ((~i29) & (-1962664636)) | (1962664635 & i29);
            int i31 = i29 & (-1962664636);
            int i32 = 119345119 - (~(((i31 & i30) | (i30 ^ i31)) * (-602)));
            int i33 = (iCurrentTimeMillis & 705110966) | i28;
            int i34 = iCurrentTimeMillis & (-705110967);
            int i35 = (~((i34 & i33) | (i33 ^ i34))) | 168034564;
            int i36 = ((~i26) & 705110966) | i28;
            int i37 = 705110966 & i26;
            int i38 = (i36 & i37) | (i36 ^ i37);
            int i39 = ~((i38 & (-1962664636)) | (i38 ^ (-1962664636)));
            int i40 = ((~i39) & i35) | ((~i35) & i39);
            int i41 = i35 & i39;
            int i42 = (i32 - (~(-(-(((i41 & i40) | (i40 ^ i41)) * (-301)))))) - 1;
            int i43 = i26 ^ (-1962664636);
            int i44 = i26 & (-1962664636);
            int i45 = -(~(-(-((~((i43 & i44) | (i43 ^ i44))) * 301))));
            int i46 = ((i42 & i45) + (i45 | i42)) - 1;
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i47 = (-318783809) ^ iCurrentTimeMillis2;
            int i48 = (-318783809) & iCurrentTimeMillis2;
            int i49 = ((~((i47 & i48) | (i47 ^ i48))) | 1276776504) * (-756);
            int i50 = ((~i49) & 315779147) | ((-315779148) & i49);
            int i51 = (i49 & 315779147) << 1;
            int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
            int i53 = ~iCurrentTimeMillis2;
            int i54 = ((~i53) & (-318783809)) | (318783808 & i53);
            int i55 = i53 & (-318783809);
            int i56 = -(-(((i55 & i54) | (i54 ^ i55)) * 756));
            if (i46 > (i52 & i56) + (i56 | i52)) {
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                int i57 = 73 / 0;
                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                    int i58 = f55333a;
                    i13 = (i58 ^ 59) + ((i58 & 59) << 1);
                    f55334b = i13 % 128;
                    if (i13 % 2 != 0) {
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
                        throw null;
                    }
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                        int i59 = f55333a;
                        int i60 = (i59 ^ 82) + ((i59 & 82) << 1);
                        i14 = (i60 ^ (-1)) + (i60 << 1);
                        f55334b = i14 % 128;
                        if (i14 % 2 != 0) {
                            ((Boolean) setX(new Object[]{setscrollbardefaultdelaybeforefade}, -1630204503, 1630204505, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) setX(new Object[]{setscrollbardefaultdelaybeforefade}, -1630204503, 1630204505, (int) System.currentTimeMillis())).booleanValue()) {
                            int i61 = f55334b;
                            int i62 = (((i61 | 43) << 1) - (~(-(((~i61) & 43) | (i61 & (-44)))))) - 1;
                            f55333a = i62 % 128;
                            int i63 = i62 % 2;
                            dividerPadding = Boolean.TRUE;
                        }
                    }
                }
            } else {
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                    int i510 = f55333a;
                    i13 = (i510 ^ 59) + ((i510 & 59) << 1);
                    f55334b = i13 % 128;
                    if (i13 % 2 != 0) {
                        TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                        ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed5}, 1914607362, -1914607356, System.identityHashCode(transactionFailed5))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
                        throw null;
                    }
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1014467290, -1014467254, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                        int i511 = f55333a;
                        int i64 = (i511 ^ 82) + ((i511 & 82) << 1);
                        i14 = (i64 ^ (-1)) + (i64 << 1);
                        f55334b = i14 % 128;
                        if (i14 % 2 != 0) {
                            ((Boolean) setX(new Object[]{setscrollbardefaultdelaybeforefade}, -1630204503, 1630204505, (int) System.currentTimeMillis())).booleanValue();
                            throw null;
                        }
                        if (((Boolean) setX(new Object[]{setscrollbardefaultdelaybeforefade}, -1630204503, 1630204505, (int) System.currentTimeMillis())).booleanValue()) {
                            int i65 = f55334b;
                            int i66 = (((i65 | 43) << 1) - (~(-(((~i65) & 43) | (i65 & (-44)))))) - 1;
                            f55333a = i66 % 128;
                            int i67 = i66 % 2;
                            dividerPadding = Boolean.TRUE;
                        }
                    }
                }
            }
            int i68 = f55334b;
            int i69 = (i68 & 37) + (i68 | 37);
            f55333a = i69 % 128;
            int i70 = i69 % 2;
            dividerPadding = Boolean.FALSE;
        } else if (i25 == 2) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            int i71 = f55333a;
            int i72 = (i71 ^ 90) + ((i71 & 90) << 1);
            int i73 = (i72 ^ (-1)) + (i72 << 1);
            f55334b = i73 % 128;
            if (i73 % 2 == 0) {
                setAnimation setanimation3 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                if ((((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() << 3) == 0) {
                    if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, setscrollbardefaultdelaybeforefade2.setDividerPadding(), new setTextSize[0]}, 1850304748, -1850304736, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                        int i74 = f55333a;
                        int i75 = ((i74 | 27) << 1) - (i74 ^ 27);
                        f55334b = i75 % 128;
                        int i76 = i75 % 2;
                        int i77 = (i74 & 59) + (i74 | 59);
                        f55334b = i77 % 128;
                        int i78 = i77 % 2;
                        dividerPadding = true;
                    }
                }
            } else {
                setAnimation setanimation4 = setAnimation.INSTANCE;
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis())}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue() % 4 == 0) {
                    if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, setscrollbardefaultdelaybeforefade2.setDividerPadding(), new setTextSize[0]}, 1850304748, -1850304736, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                        int i79 = f55333a;
                        int i710 = ((i79 | 27) << 1) - (i79 ^ 27);
                        f55334b = i710 % 128;
                        int i711 = i710 % 2;
                        int i712 = (i79 & 59) + (i79 | 59);
                        f55334b = i712 % 128;
                        int i713 = i712 % 2;
                        dividerPadding = true;
                    }
                }
            }
            int i80 = f55333a;
            int i81 = ((i80 ^ 65) | (i80 & 65)) << 1;
            int i82 = -(((~i80) & 65) | (i80 & (-66)));
            int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
            f55334b = i83 % 128;
            int i84 = i83 % 2;
            dividerPadding = Boolean.FALSE;
        } else {
            if (i25 == 3) {
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                getValue getvalue = (getValue) objArr[1];
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade3, "");
                Intrinsics.checkNotNullParameter(getvalue, "");
                TransactionFailed importantForContentCapture = setAnimation.setImportantForContentCapture();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (String) TransactionFailed.setX(new Object[]{importantForContentCapture}, 1914607362, -1914607356, System.identityHashCode(importantForContentCapture))}, -1394735893, 1394735910, System.identityHashCode(setscrollbardefaultdelaybeforefade3));
                TransactionFailed transactionFailedTransactionErrorCause = setAnimation.TransactionErrorCause();
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (String) TransactionFailed.setX(new Object[]{transactionFailedTransactionErrorCause}, 1914607362, -1914607356, System.identityHashCode(transactionFailedTransactionErrorCause))}, -1394735893, 1394735910, System.identityHashCode(setscrollbardefaultdelaybeforefade3));
                bj bjVar = new bj(setscrollbardefaultdelaybeforefade3);
                bo boVar = (bo) ((setImageTintList) w.setX(new Object[]{bjVar}, 1693919772, -1693919769, System.identityHashCode(bjVar)));
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (List) bo.setY(new Object[]{boVar}, -1194860115, 1194860115, System.identityHashCode(boVar))}, 1048306138, -1048306100, (int) System.currentTimeMillis());
                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 252497730, -252497710, System.identityHashCode(getbeeponfailure4))}, 990442214, -990442189, System.identityHashCode(setscrollbardefaultdelaybeforefade3));
                getvalue.setOnFocusChangeListener(new setTitleTextAppearance(getbeeponfailure4));
                fk fkVar = fk.setDividerPadding;
                int i85 = f55334b;
                int i86 = i85 & 49;
                int i87 = (i85 ^ 49) | i86;
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                f55333a = i88 % 128;
                int i89 = i88 % 2;
                return fkVar;
            }
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
            ew ewVar2 = (ew) objArr[3];
            setRotationX setrotationx = (setRotationX) objArr[4];
            int i90 = (-2) - ((f55334b + 56) ^ (-1));
            f55333a = i90 % 128;
            if (i90 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(ewVar2, "");
                Intrinsics.checkNotNullParameter(setrotationx, "");
                setNextFocusLeftId setnextfocusleftid = setNextFocusLeftId.INSTANCE;
                int i91 = 21 / 0;
                if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    ewVar = ewVar2;
                    int i92 = f55333a;
                    int i93 = ((i92 ^ 59) | (i92 & 59)) << 1;
                    int i94 = -(((~i92) & 59) | (i92 & (-60)));
                    int i95 = (i93 & i94) + (i94 | i93);
                    f55334b = i95 % 128;
                    int i96 = i95 % 2;
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
                    dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)));
                    int i97 = f55334b;
                    int i98 = i97 & 51;
                    int i99 = -(-((i97 ^ 51) | i98));
                    i22 = ((i98 | i99) << 1) - (i99 ^ i98);
                    f55333a = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                } else {
                    ewVar = ewVar2;
                    if (((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
                        getNetworkTimeout getnetworktimeout = getNetworkTimeout.INSTANCE;
                        if (((Boolean) getNetworkTimeout.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), setscrollbardefaultdelaybeforefade4}, 803823515, -803823515, (int) System.currentTimeMillis())).booleanValue()) {
                            int i100 = f55333a;
                            int i101 = i100 & 5;
                            int i102 = (i100 ^ 5) | i101;
                            int i103 = (i101 & i102) + (i102 | i101);
                            f55334b = i103 % 128;
                            int i104 = i103 % 2;
                            if (((Boolean) setX(new Object[]{setscrollbardefaultdelaybeforefade4}, 1299575915, -1299575914, (int) System.currentTimeMillis())).booleanValue()) {
                                setAnimation setanimation5 = setAnimation.INSTANCE;
                                TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                                ahVar = new ah(((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6))}, 1249644233, -1249644202, System.identityHashCode(setscrollbardefaultdelaybeforefade4))).setNavigationOnClickListener());
                                if (((an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)))).getNavBarTitleString()) {
                                    i17 = (-2) - ((f55334b + 92) ^ (-1));
                                    f55333a = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, ahVar}, 2023572198, -2023572188, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                                        int i105 = 92 / 0;
                                    } else {
                                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, ahVar}, 2023572198, -2023572188, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                                    }
                                    int i106 = f55333a;
                                    int i107 = i106 & 41;
                                    int i108 = (((i106 ^ 41) | i107) << 1) - ((i106 | 41) & (~i107));
                                    int i109 = i108 % 128;
                                    f55334b = i109;
                                    int i110 = i108 % 2;
                                    int i111 = ((i109 ^ 107) | (i109 & 107)) << 1;
                                    int i112 = -(((~i109) & 107) | (i109 & (-108)));
                                    i18 = (i111 ^ i112) + ((i112 & i111) << 1);
                                    i19 = i18 % 128;
                                    f55333a = i19;
                                    if (i18 % 2 == 0) {
                                        throw null;
                                    }
                                    int i113 = (i19 | 111) << 1;
                                    int i114 = -(((~i19) & 111) | (i19 & (-112)));
                                    i20 = (i113 & i114) + (i114 | i113);
                                    f55334b = i20 % 128;
                                    if (i20 % 2 != 0) {
                                        return null;
                                    }
                                    throw null;
                                }
                                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                                SouthPacificEndpoint.setX(new Object[]{20006, null, 6}, 1336485880, -1336485874, 20006);
                                dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                                int i115 = f55333a;
                                i16 = ((i115 | 53) << 1) - (i115 ^ 53);
                                f55334b = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                            } else {
                                dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                                int i116 = f55333a;
                                int i117 = i116 & 107;
                                i15 = (i117 - (~((i116 ^ 107) | i117))) - 1;
                                f55334b = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                            }
                        } else {
                            dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                            int i118 = f55333a;
                            int i119 = i118 & 107;
                            i15 = (i119 - (~((i118 ^ 107) | i119))) - 1;
                            f55334b = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                        }
                    } else {
                        int i120 = f55333a;
                        int i121 = i120 & 33;
                        int i122 = -(-((i120 ^ 33) | i121));
                        int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                        f55334b = i123 % 128;
                        int i124 = i123 % 2;
                        SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                        SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
                        dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                        i21 = f55333a + 115;
                        f55334b = i21 % 128;
                        if (i21 % 2 == 0) {
                            throw null;
                        }
                    }
                }
            } else {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade4, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(ewVar2, "");
                Intrinsics.checkNotNullParameter(setrotationx, "");
                setNextFocusLeftId setnextfocusleftid2 = setNextFocusLeftId.INSTANCE;
                ewVar = ewVar2;
                if (((Boolean) setNextFocusLeftId.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)), getEmvLibVersion.setOnFocusChangeListener}, 177165021, -177165021, (int) System.currentTimeMillis())).booleanValue()) {
                    int i910 = f55333a;
                    int i911 = ((i910 ^ 59) | (i910 & 59)) << 1;
                    int i912 = -(((~i910) & 59) | (i910 & (-60)));
                    int i913 = (i911 & i912) + (i912 | i911);
                    f55334b = i913 % 128;
                    int i914 = i913 % 2;
                    SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
                    dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)));
                    int i915 = f55334b;
                    int i916 = i915 & 51;
                    int i917 = -(-((i915 ^ 51) | i916));
                    i22 = ((i916 | i917) << 1) - (i917 ^ i916);
                    f55333a = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                } else if (((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
                    int i125 = f55333a;
                    int i126 = i125 & 33;
                    int i127 = -(-((i125 ^ 33) | i126));
                    int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                    f55334b = i128 % 128;
                    int i129 = i128 % 2;
                    SouthPacificEndpoint southPacificEndpoint5 = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20002, (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx))}, -1588575357, 1588575372, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20002);
                    dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                    i21 = f55333a + 115;
                    f55334b = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                } else {
                    getNetworkTimeout getnetworktimeout2 = getNetworkTimeout.INSTANCE;
                    if (((Boolean) getNetworkTimeout.setDividerPadding(new Object[]{(byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx)), setscrollbardefaultdelaybeforefade4}, 803823515, -803823515, (int) System.currentTimeMillis())).booleanValue()) {
                        int i1010 = f55333a;
                        int i1011 = i1010 & 5;
                        int i1012 = (i1010 ^ 5) | i1011;
                        int i1013 = (i1011 & i1012) + (i1012 | i1011);
                        f55334b = i1013 % 128;
                        int i1014 = i1013 % 2;
                        if (((Boolean) setX(new Object[]{setscrollbardefaultdelaybeforefade4}, 1299575915, -1299575914, (int) System.currentTimeMillis())).booleanValue()) {
                            dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                            int i1110 = f55333a;
                            int i1111 = i1110 & 107;
                            i15 = (i1111 - (~((i1110 ^ 107) | i1111))) - 1;
                            f55334b = i15 % 128;
                            if (i15 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            setAnimation setanimation6 = setAnimation.INSTANCE;
                            TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                            ahVar = new ah(((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, (String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7))}, 1249644233, -1249644202, System.identityHashCode(setscrollbardefaultdelaybeforefade4))).setNavigationOnClickListener());
                            if (((an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)))).getNavBarTitleString()) {
                                i17 = (-2) - ((f55334b + 92) ^ (-1));
                                f55333a = i17 % 128;
                                if (i17 % 2 != 0) {
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, ahVar}, 2023572198, -2023572188, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                                    int i1015 = 92 / 0;
                                } else {
                                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, ahVar}, 2023572198, -2023572188, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                                }
                                int i1016 = f55333a;
                                int i1017 = i1016 & 41;
                                int i1018 = (((i1016 ^ 41) | i1017) << 1) - ((i1016 | 41) & (~i1017));
                                int i1019 = i1018 % 128;
                                f55334b = i1019;
                                int i1112 = i1018 % 2;
                                int i1113 = ((i1019 ^ 107) | (i1019 & 107)) << 1;
                                int i1114 = -(((~i1019) & 107) | (i1019 & (-108)));
                                i18 = (i1113 ^ i1114) + ((i1114 & i1113) << 1);
                                i19 = i18 % 128;
                                f55333a = i19;
                                if (i18 % 2 == 0) {
                                    throw null;
                                }
                                int i1115 = (i19 | 111) << 1;
                                int i1116 = -(((~i19) & 111) | (i19 & (-112)));
                                i20 = (i1115 & i1116) + (i1116 | i1115);
                                f55334b = i20 % 128;
                                if (i20 % 2 != 0) {
                                    return null;
                                }
                                throw null;
                            }
                            SouthPacificEndpoint southPacificEndpoint6 = SouthPacificEndpoint.setX;
                            SouthPacificEndpoint.setX(new Object[]{20006, null, 6}, 1336485880, -1336485874, 20006);
                            dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                            int i1117 = f55333a;
                            i16 = ((i1117 | 53) << 1) - (i1117 ^ 53);
                            f55334b = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                        }
                    } else {
                        dividerPadding = ewVar.setDividerPadding(setscrollbardefaultdelaybeforefade4, settextkeepstate);
                        int i1118 = f55333a;
                        int i1119 = i1118 & 107;
                        i15 = (i1119 - (~((i1118 ^ 107) | i1119))) - 1;
                        f55334b = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                    }
                }
            }
        }
        return dividerPadding;
    }

    @Nullable
    public final <T extends setScrollBarDefaultDelayBeforeFade> fk setY(@NotNull T p4, @NotNull setTextKeepState p10, @NotNull ew<T> p11, @NotNull setRotationX p12) {
        return (fk) setX(new Object[]{this, p4, p10, p11, p12}, -221571889, 221571889, System.identityHashCode(this));
    }
}
