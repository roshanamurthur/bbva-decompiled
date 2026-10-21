package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ip extends is {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56509h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56510i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final getValue f56511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final component17 f56512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(@NotNull im imVar, @NotNull setTextKeepState settextkeepstate, @NotNull iu iuVar, @NotNull getValue getvalue, @NotNull component17 component17Var) {
        super(imVar, settextkeepstate, iuVar);
        Intrinsics.checkNotNullParameter(imVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(iuVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(component17Var, "");
        this.f56511f = getvalue;
        this.f56512g = component17Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0185  */
    /* JADX WARN: Code duplicated, block: B:23:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0342  */
    /* JADX WARN: Code duplicated, block: B:46:0x038a  */
    /* JADX WARN: Code duplicated, block: B:49:0x040e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0264 A[SYNTHETIC] */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        int i13;
        Iterator<getBeepOnFailure> it;
        setOnGenericMotionListener setongenericmotionlistener;
        im onFocusChangeListener;
        setScrollContainer setscrollcontainer;
        int i14 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i15 = ~i10;
        int i16 = (((~(i15 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i15) * (-420)) + i14;
        int i17 = 2;
        if (i16 == 1) {
            ip ipVar = (ip) objArr[0];
            im onFocusChangeListener2 = ipVar.setOnFocusChangeListener();
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -249361593, 249361770, (int) System.currentTimeMillis());
            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener2, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), (byte[]) component17.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{ipVar.f56512g}, -811017857, 811017857, (int) System.currentTimeMillis()), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener2));
            cz czVar = new cz(ipVar.setOnFocusChangeListener());
            int i18 = f56509h;
            int i19 = ((i18 ^ 9) | (i18 & 9)) << 1;
            int i20 = -(((~i18) & 9) | (i18 & (-10)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f56510i = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        if (i16 == 2) {
            ip ipVar2 = (ip) objArr[0];
            a aVar = (a) objArr[1];
            int i23 = f56510i;
            int i24 = (((i23 ^ 77) | (i23 & 77)) << 1) - (((~i23) & 77) | (i23 & (-78)));
            f56509h = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 1 / 0;
                if (((Boolean) setY(new Object[]{ipVar2, aVar}, 1807842191, -1807842188, System.identityHashCode(ipVar2))).booleanValue()) {
                    setY(new Object[]{ipVar2}, -911128578, 911128579, System.identityHashCode(ipVar2));
                    bj bjVar = new bj(ipVar2.setOnFocusChangeListener());
                    bo boVar = (bo) ((setImageTintList) w.setX(new Object[]{bjVar}, 1693919772, -1693919769, System.identityHashCode(bjVar)));
                    ipVar2.f56511f.setOnFocusChangeListener(new setTitleTextAppearance((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ipVar2.setOnFocusChangeListener(), (List) bo.setY(new Object[]{boVar}, -1194860115, 1194860115, System.identityHashCode(boVar))}, 1048306138, -1048306100, (int) System.currentTimeMillis())));
                    obj = fk.setDividerPadding;
                    int i26 = f56509h;
                    int i27 = i26 ^ 99;
                    int i28 = -(-((i26 & 99) << 1));
                    i13 = ((i27 | i28) << 1) - (i28 ^ i27);
                    f56510i = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                } else {
                    obj = (fk) iu.setX(new Object[]{ipVar2.setX(), ipVar2.setOnFocusChangeListener(), ipVar2.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setNavigationOnClickListener}, -1309170137, 1309170141, (int) System.currentTimeMillis());
                    int i29 = f56510i;
                    int i30 = i29 & 67;
                    int i31 = ((((i29 ^ 67) | i30) << 1) - (~(-((i29 | 67) & (~i30))))) - 1;
                    f56509h = i31 % 128;
                    int i32 = i31 % 2;
                }
            } else if (((Boolean) setY(new Object[]{ipVar2, aVar}, 1807842191, -1807842188, System.identityHashCode(ipVar2))).booleanValue()) {
                setY(new Object[]{ipVar2}, -911128578, 911128579, System.identityHashCode(ipVar2));
                bj bjVar2 = new bj(ipVar2.setOnFocusChangeListener());
                bo boVar2 = (bo) ((setImageTintList) w.setX(new Object[]{bjVar2}, 1693919772, -1693919769, System.identityHashCode(bjVar2)));
                ipVar2.f56511f.setOnFocusChangeListener(new setTitleTextAppearance((getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ipVar2.setOnFocusChangeListener(), (List) bo.setY(new Object[]{boVar2}, -1194860115, 1194860115, System.identityHashCode(boVar2))}, 1048306138, -1048306100, (int) System.currentTimeMillis())));
                obj = fk.setDividerPadding;
                int i210 = f56509h;
                int i211 = i210 ^ 99;
                int i212 = -(-((i210 & 99) << 1));
                i13 = ((i211 | i212) << 1) - (i212 ^ i211);
                f56510i = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            } else {
                obj = (fk) iu.setX(new Object[]{ipVar2.setX(), ipVar2.setOnFocusChangeListener(), ipVar2.setCompoundDrawableTintBlendMode(), setContentCaptureSession.setNavigationOnClickListener}, -1309170137, 1309170141, (int) System.currentTimeMillis());
                int i213 = f56510i;
                int i33 = i213 & 67;
                int i34 = ((((i213 ^ 67) | i33) << 1) - (~(-((i213 | 67) & (~i33))))) - 1;
                f56509h = i34 % 128;
                int i35 = i34 % 2;
            }
        } else {
            if (i16 != 3) {
                throw new fh(32, null);
            }
            ip ipVar3 = (ip) objArr[0];
            a aVar2 = (a) objArr[1];
            int i36 = f56510i;
            int i37 = ((i36 | 109) << 1) - (i36 ^ 109);
            f56509h = i37 % 128;
            if (i37 % 2 != 0) {
                it = ((setMaxWidth) a.setX(new Object[]{aVar2}, -917873151, 917873153, System.identityHashCode(aVar2))).iterator();
                int i38 = 73 / 0;
            } else {
                it = ((setMaxWidth) a.setX(new Object[]{aVar2}, -917873151, 917873153, System.identityHashCode(aVar2))).iterator();
            }
            int i39 = f56509h + 83;
            f56510i = i39 % 128;
            int i40 = i39 % 2;
            while (it.hasNext()) {
                int i41 = f56510i;
                int i42 = i41 & 25;
                int i43 = ((i41 ^ 25) | i42) << 1;
                int i44 = -((i41 | 25) & (~i42));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f56509h = i45 % 128;
                if (i45 % i17 != 0) {
                    getBeepOnFailure next = it.next();
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next}, 865402441, -865402437, System.identityHashCode(next));
                    String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                    setAnimation setanimation2 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                    Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)));
                    throw null;
                }
                getBeepOnFailure next2 = it.next();
                setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                setAnimation setanimation3 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                if (!Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                    im onFocusChangeListener3 = ipVar3.setOnFocusChangeListener();
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                    if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener3, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4))}, -422205110, 422205136, System.identityHashCode(onFocusChangeListener3))).booleanValue()) {
                        int i46 = f56509h + 29;
                        f56510i = i46 % 128;
                        int i47 = i46 % 2;
                        im onFocusChangeListener4 = ipVar3.setOnFocusChangeListener();
                        setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                        if (((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener4, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5))}, -232375606, 232375652, System.identityHashCode(onFocusChangeListener4))).booleanValue()) {
                            setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                            onFocusChangeListener = ipVar3.setOnFocusChangeListener();
                            setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                            if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, onFocusChangeListener, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), setTextSize.setX}, 676404020, -676404015, (int) System.currentTimeMillis())).booleanValue())) {
                                int i48 = f56509h + 51;
                                f56510i = i48 % 128;
                                int i49 = i48 % 2;
                                im onFocusChangeListener5 = ipVar3.setOnFocusChangeListener();
                                setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener5, next2}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener5));
                                int i50 = f56510i;
                                int i51 = i50 & 83;
                                int i52 = (i50 ^ 83) | i51;
                                int i53 = (i51 & i52) + (i52 | i51);
                                f56509h = i53 % 128;
                                int i54 = i53 % 2;
                            }
                        }
                    } else {
                        setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        onFocusChangeListener = ipVar3.setOnFocusChangeListener();
                        setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                        if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, onFocusChangeListener, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), setTextSize.setX}, 676404020, -676404015, (int) System.currentTimeMillis())).booleanValue())) {
                            int i410 = f56509h + 51;
                            f56510i = i410 % 128;
                            int i411 = i410 % 2;
                            im onFocusChangeListener6 = ipVar3.setOnFocusChangeListener();
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{onFocusChangeListener6, next2}, 2008358388, -2008358355, System.identityHashCode(onFocusChangeListener6));
                            int i55 = f56510i;
                            int i56 = i55 & 83;
                            int i57 = (i55 ^ 83) | i56;
                            int i58 = (i56 & i57) + (i57 | i56);
                            f56509h = i58 % 128;
                            int i59 = i58 % 2;
                        }
                    }
                } else if (!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ipVar3.setOnFocusChangeListener(), next2}, 2094047793, -2094047756, (int) System.currentTimeMillis())).booleanValue()) {
                    int i60 = f56509h;
                    int i61 = (i60 ^ 49) + ((i60 & 49) << 1);
                    f56510i = i61 % 128;
                    int i62 = i61 % 2;
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    SouthPacificEndpoint.setX(new Object[]{20001, null, 6}, 1336485880, -1336485874, 20001);
                    int i63 = f56510i + 43;
                    f56509h = i63 % 128;
                    int i64 = i63 % 2;
                    obj = Boolean.FALSE;
                }
                int i65 = f56509h;
                int i66 = ((((i65 ^ 21) | (i65 & 21)) << 1) - (~(-(((~i65) & 21) | (i65 & (-22)))))) - 1;
                f56510i = i66 % 128;
                int i67 = i66 % 2;
                i17 = 2;
            }
            int i68 = f56509h;
            int i69 = ((i68 | 47) << 1) - (i68 ^ 47);
            f56510i = i69 % 128;
            if (i69 % 2 == 0) {
                throw null;
            }
            obj = Boolean.TRUE;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setY(new Object[]{this, continuation}, 514745393, -514745393, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setX(@NotNull a aVar) {
        return setY(new Object[]{this, aVar}, -429070292, 429070294, System.identityHashCode(this));
    }
}
