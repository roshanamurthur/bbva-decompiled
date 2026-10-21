package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setAnimationCacheEnabled implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59457d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f59458e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setScrollBarDefaultDelayBeforeFade f59459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<TransactionFailed> f59460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Pair<TransactionFailed, Integer>> f59461c;

    public setAnimationCacheEnabled(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        this.f59459a = setscrollbardefaultdelaybeforefade;
        this.f59460b = CollectionsKt__CollectionsKt.listOf((Object[]) new TransactionFailed[]{setAnimation.setMinHeight(), (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis()), setAnimation.TransactionErrorCause(), (TransactionFailed) setAnimation.setY(new Object[0], -362991580, 362991736, (int) System.currentTimeMillis()), (TransactionFailed) setAnimation.setY(new Object[0], 1440069230, -1440069166, (int) System.currentTimeMillis())});
        this.f59461c = d.listOf(new Pair(setAnimation.setTextSelectHandleRight(), 12));
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        String str;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp;
        Object obj;
        getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2;
        if ((((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS != 1) {
            setAnimationCacheEnabled setanimationcacheenabled = (setAnimationCacheEnabled) objArr[0];
            List<Pair<TransactionFailed, Integer>> list = setanimationcacheenabled.f59461c;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            int i13 = f59458e;
            int i14 = i13 & 75;
            int i15 = (((i13 ^ 75) | i14) << 1) - ((i13 | 75) & (~i14));
            f59457d = i15 % 128;
            int i16 = i15 % 2;
            while (it.hasNext()) {
                int i17 = f59457d;
                int i18 = (i17 & 7) + (i17 | 7);
                f59458e = i18 % 128;
                int i19 = i18 % 2;
                Pair pair = (Pair) it.next();
                TransactionFailed transactionFailed = (TransactionFailed) pair.component1();
                int iIntValue = ((Number) pair.component2()).intValue();
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = setanimationcacheenabled.f59459a;
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, transactionFailed}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure == null) {
                    int i20 = f59457d;
                    int i21 = i20 & 27;
                    int i22 = ((((i20 ^ 27) | i21) << 1) - (~(-((i20 | 27) & (~i21))))) - 1;
                    int i23 = i22 % 128;
                    f59458e = i23;
                    int i24 = i22 % 2;
                    int i25 = i23 & 115;
                    int i26 = (i23 ^ 115) | i25;
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    f59457d = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure));
                    if (bArr == null) {
                        int i29 = f59458e;
                        int i30 = ((i29 | 97) << 1) - (i29 ^ 97);
                        f59457d = i30 % 128;
                        int i31 = i30 % 2;
                        int i32 = i29 + 59;
                        f59457d = i32 % 128;
                        int i33 = i32 % 2;
                    } else {
                        getdetailsfieldtextsizesp2 = (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue)}, 1296567195, -1296567194, iIntValue);
                        int i34 = f59457d;
                        int i35 = i34 ^ 33;
                        int i36 = ((((i34 & 33) | i35) << 1) - (~(-i35))) - 1;
                        f59458e = i36 % 128;
                        int i37 = i36 % 2;
                    }
                    arrayList.add(getdetailsfieldtextsizesp2);
                    int i38 = f59457d;
                    int i39 = i38 & 59;
                    int i40 = (((i38 | 59) & (~i39)) - (~(-(-(i39 << 1))))) - 1;
                    f59458e = i40 % 128;
                    int i41 = i40 % 2;
                }
                getdetailsfieldtextsizesp2 = null;
                arrayList.add(getdetailsfieldtextsizesp2);
                int i310 = f59457d;
                int i311 = i310 & 59;
                int i42 = (((i310 | 59) & (~i311)) - (~(-(-(i311 << 1))))) - 1;
                f59458e = i42 % 128;
                int i43 = i42 % 2;
            }
            int i44 = f59458e;
            int i45 = i44 & 1;
            int i46 = (i44 ^ 1) | i45;
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            f59457d = i47 % 128;
            int i48 = i47 % 2;
            obj = arrayList;
        } else {
            setAnimationCacheEnabled setanimationcacheenabled2 = (setAnimationCacheEnabled) objArr[0];
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            List<TransactionFailed> list2 = setanimationcacheenabled2.f59460b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            int i49 = f59457d;
            int i50 = ((i49 ^ 13) | (i49 & 13)) << 1;
            int i51 = -(((~i49) & 13) | (i49 & (-14)));
            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
            f59458e = i52 % 128;
            int i53 = i52 % 2;
            while (it2.hasNext()) {
                int i54 = f59458e;
                int i55 = ((i54 | 49) << 1) - (i54 ^ 49);
                f59457d = i55 % 128;
                int i56 = i55 % 2;
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = setanimationcacheenabled2.f59459a;
                if (i56 != 0) {
                    throw null;
                }
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, (TransactionFailed) it2.next()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                if (getbeeponfailure2 == null) {
                    int i57 = f59458e;
                    int i58 = i57 | 77;
                    int i59 = (i58 << 1) - ((~(i57 & 77)) & i58);
                    f59457d = i59 % 128;
                    if (i59 % 2 != 0) {
                        int i60 = 43 / 0;
                    }
                } else {
                    byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 243863605, -243863605, System.identityHashCode(getbeeponfailure2));
                    if (bArr2 == null) {
                        int i61 = f59457d;
                        int i62 = ((i61 | 123) << 1) - (i61 ^ 123);
                        f59458e = i62 % 128;
                        int i63 = i62 % 2;
                        int i64 = ((i61 ^ 37) | (i61 & 37)) << 1;
                        int i65 = -(((~i61) & 37) | (i61 & (-38)));
                        int i66 = (i64 & i65) + (i65 | i64);
                        f59458e = i66 % 128;
                        int i67 = i66 % 2;
                    } else {
                        getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) setInputExtras.setDividerPadding(new Object[]{bArr2}, -1588575357, 1588575372, (int) System.currentTimeMillis());
                        int i68 = f59458e;
                        int i69 = (i68 & 17) + (i68 | 17);
                        f59457d = i69 % 128;
                        int i70 = i69 % 2;
                    }
                    arrayList2.add(getdetailsfieldtextsizesp);
                    int i71 = f59457d;
                    int i72 = i71 & 21;
                    int i73 = (i72 - (~(-(-((i71 ^ 21) | i72))))) - 1;
                    f59458e = i73 % 128;
                    int i74 = i73 % 2;
                }
                getdetailsfieldtextsizesp = null;
                arrayList2.add(getdetailsfieldtextsizesp);
                int i75 = f59457d;
                int i76 = i75 & 21;
                int i77 = (i76 - (~(-(-((i75 ^ 21) | i76))))) - 1;
                f59458e = i77 % 128;
                int i78 = i77 % 2;
            }
            Object[] array = arrayList2.toArray(new getDetailsFieldTextSizeSp[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            spreadBuilder.addSpread(array);
            Object[] array2 = ((List) setDividerPadding(new Object[]{setanimationcacheenabled2}, 625470399, -625470399, System.identityHashCode(setanimationcacheenabled2))).toArray(new getDetailsFieldTextSizeSp[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            spreadBuilder.addSpread(array2);
            TerminalLogger terminalLogger = new TerminalLogger((getDetailsFieldTextSizeSp[]) spreadBuilder.toArray(new getDetailsFieldTextSizeSp[spreadBuilder.size()]), null, 2, null);
            str = (String) TerminalLogger.setOnFocusChangeListener(new Object[]{terminalLogger}, -1352067446, 1352067446, System.identityHashCode(terminalLogger));
            int i79 = f59458e + 39;
            f59457d = i79 % 128;
            if (i79 % 2 != 0) {
                obj = str;
                throw null;
            }
        }
        obj = str;
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setDividerPadding(new Object[]{this}, 1797200452, -1797200451, System.identityHashCode(this));
    }
}
