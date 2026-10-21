package com.mypinpad.tsdk.isolation;

import bk.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class CancelPinPadLaunchRequest<I, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51748c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51749d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f51750a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f51751b = new LinkedHashMap();

    /* JADX WARN: Code duplicated, block: B:57:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0307 A[PHI: r1
      0x0307: PHI (r1v57 java.util.Set) = (r1v50 java.util.Set), (r1v62 java.util.Set) binds: [B:56:0x02e6, B:53:0x02b4] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Set linkedHashSet;
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~(i11 | i12);
        int i16 = (((~((~i10) | i13)) | i15) * 196) + ((i11 | i10) * 392) + ((i14 | i15) * (-196)) + (i11 * (-195)) + (i10 * (-391));
        if (i16 != 1) {
            int i17 = 33;
            if (i16 == 2) {
                CancelPinPadLaunchRequest cancelPinPadLaunchRequest = (CancelPinPadLaunchRequest) objArr[0];
                int i18 = f51749d;
                int i19 = (((i18 ^ 33) | (i18 & 33)) << 1) - (((~i18) & 33) | (i18 & (-34)));
                f51748c = i19 % 128;
                int i20 = i19 % 2;
                boolean zIsEmpty = cancelPinPadLaunchRequest.f51750a.isEmpty();
                int i21 = f51749d;
                int i22 = i21 & 91;
                int i23 = (i21 ^ 91) | i22;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f51748c = i24 % 128;
                int i25 = i24 % 2;
                return Boolean.valueOf(zIsEmpty);
            }
            if (i16 == 3) {
                Map map = (Map) objArr[0];
                Object obj = objArr[1];
                byte[] bArr = (byte[]) objArr[2];
                Object obj2 = objArr[3];
                int i26 = f51748c;
                int i27 = (-2) - ((((i26 | 42) << 1) - (i26 ^ 42)) ^ (-1));
                f51749d = i27 % 128;
                int i28 = i27 % 2;
                if (bArr != null) {
                    map.put(new z8(bArr, obj), obj2);
                    int i29 = f51749d;
                    int i30 = i29 & 125;
                    int i31 = (i30 - (~((i29 ^ 125) | i30))) - 1;
                    f51748c = i31 % 128;
                    int i32 = i31 % 2;
                }
                int i33 = f51748c;
                int i34 = (i33 & (-6)) | ((~i33) & 5);
                int i35 = (i33 & 5) << 1;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f51749d = i36 % 128;
                int i37 = i36 % 2;
            } else if (i16 == 4) {
                CancelPinPadLaunchRequest cancelPinPadLaunchRequest2 = (CancelPinPadLaunchRequest) objArr[0];
                Function1 function1 = (Function1) objArr[1];
                Intrinsics.checkNotNullParameter(function1, "");
                LinkedHashMap linkedHashMap = cancelPinPadLaunchRequest2.f51750a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
                Iterator<T> it = linkedHashMap.entrySet().iterator();
                int i38 = f51748c + 126;
                int i39 = i38 ^ (-1);
                while (true) {
                    int i40 = i39 + (i38 << 1);
                    f51749d = i40 % 128;
                    int i41 = i40 % 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i42 = f51749d;
                    int i43 = i42 & 11;
                    int i44 = ((i42 ^ 11) | i43) << 1;
                    int i45 = -((i42 | 11) & (~i43));
                    int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                    f51748c = i46 % 128;
                    int i47 = i46 % 2;
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap2.put(entry.getKey(), function1.invoke(entry.getValue()));
                    int i48 = f51748c;
                    i39 = i48 ^ 27;
                    i38 = i48 & 27;
                }
                LinkedHashMap linkedHashMap3 = cancelPinPadLaunchRequest2.f51750a;
                linkedHashMap3.clear();
                linkedHashMap3.putAll(linkedHashMap2);
                int i49 = f51748c;
                int i50 = ((i49 ^ 66) + ((i49 & 66) << 1)) - 1;
                f51749d = i50 % 128;
                int i51 = i50 % 2;
            } else {
                if (i16 != 5) {
                    CancelPinPadLaunchRequest cancelPinPadLaunchRequest3 = (CancelPinPadLaunchRequest) objArr[0];
                    Object obj3 = objArr[1];
                    setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) objArr[2];
                    int i52 = f51748c;
                    int i53 = (i52 ^ 83) + ((i52 & 83) << 1);
                    f51749d = i53 % 128;
                    if (i53 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
                    Set set = (Set) cancelPinPadLaunchRequest3.f51751b.get(obj3);
                    if (set == null) {
                        int i54 = (-2) - ((f51748c + 62) ^ (-1));
                        f51749d = i54 % 128;
                        int i55 = i54 % 2;
                        return null;
                    }
                    List listSortedDescending = CollectionsKt___CollectionsKt.sortedDescending(set);
                    if (listSortedDescending == null) {
                        int i56 = f51749d;
                        int i57 = i56 ^ 11;
                        int i58 = ((i56 & 11) | i57) << 1;
                        int i59 = -i57;
                        int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                        f51748c = i60 % 128;
                        if (i60 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = listSortedDescending.iterator();
                    int i61 = f51748c;
                    int i62 = (i61 ^ 87) + ((i61 & 87) << 1);
                    f51749d = i62 % 128;
                    int i63 = i62 % 2;
                    while (it2.hasNext()) {
                        int i64 = f51749d;
                        int i65 = i64 & 123;
                        int i66 = i65 + ((i64 ^ 123) | i65);
                        f51748c = i66 % 128;
                        if (i66 % 2 != 0) {
                            ((Number) it2.next()).intValue();
                            int length = ((byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist))).length;
                            throw null;
                        }
                        T next = it2.next();
                        if (((Number) next).intValue() <= ((byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist))).length) {
                            int i67 = f51749d;
                            int i68 = i67 ^ 13;
                            int i69 = ((i67 & 13) | i68) << 1;
                            int i70 = -i68;
                            int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                            int i72 = i71 % 128;
                            f51748c = i72;
                            int i73 = i71 % 2;
                            int i74 = i72 ^ 125;
                            int i75 = ((((i72 & 125) | i74) << 1) - (~(-i74))) - 1;
                            f51749d = i75 % 128;
                            int i76 = i75 % 2;
                            int i77 = i72 + 61;
                            f51749d = i77 % 128;
                            int i78 = i77 % 2;
                            arrayList.add(next);
                            int i79 = f51749d;
                            int i80 = i79 & 9;
                            int i81 = (i80 - (~(-(-((i79 ^ 9) | i80))))) - 1;
                            f51748c = i81 % 128;
                            int i82 = i81 % 2;
                        } else {
                            int i83 = f51749d;
                            int i84 = i83 & 105;
                            int i85 = ((i83 ^ 105) | i84) << 1;
                            int i86 = -((i83 | 105) & (~i84));
                            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                            f51748c = i87 % 128;
                            int i88 = i87 % 2;
                        }
                        i17 = 33;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    int i89 = f51748c;
                    int i90 = i89 & 87;
                    int i91 = (i90 - (~((i89 ^ 87) | i90))) - 1;
                    f51749d = i91 % 128;
                    int i92 = i91 % 2;
                    while (it3.hasNext()) {
                        int i93 = f51748c;
                        int i94 = (i93 | 33) << 1;
                        int i95 = -(i93 ^ i17);
                        int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                        f51749d = i96 % 128;
                        int i97 = i96 % 2;
                        LinkedHashMap linkedHashMap4 = cancelPinPadLaunchRequest3.f51750a;
                        if (i97 == 0) {
                            int iIntValue = ((Number) it3.next()).intValue();
                            setOnFocusChangeListener(new Object[]{linkedHashMap4, obj3, (byte[]) getPinPadType.setOnFocusChangeListener(new Object[]{(byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist)), Integer.valueOf(iIntValue)}, -68354525, 68354525, iIntValue)}, 287001677, -287001676, (int) System.currentTimeMillis());
                            throw null;
                        }
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        Object onFocusChangeListener = setOnFocusChangeListener(new Object[]{linkedHashMap4, obj3, (byte[]) getPinPadType.setOnFocusChangeListener(new Object[]{(byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist)), Integer.valueOf(iIntValue2)}, -68354525, 68354525, iIntValue2)}, 287001677, -287001676, (int) System.currentTimeMillis());
                        if (onFocusChangeListener != null) {
                            int i98 = f51749d + 117;
                            f51748c = i98 % 128;
                            int i99 = i98 % 2;
                            arrayList2.add(onFocusChangeListener);
                            int i100 = f51748c;
                            int i101 = (((i100 | 28) << 1) - (i100 ^ 28)) - 1;
                            f51749d = i101 % 128;
                            int i102 = i101 % 2;
                        } else {
                            int i103 = f51749d;
                            int i104 = i103 & 49;
                            int i105 = (i103 | 49) & (~i104);
                            int i106 = -(-(i104 << 1));
                            int i107 = (i105 & i106) + (i105 | i106);
                            f51748c = i107 % 128;
                            int i108 = i107 % 2;
                        }
                        i17 = 33;
                    }
                    Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                    int i109 = f51748c;
                    int i110 = ((i109 ^ 8) + ((i109 & 8) << 1)) - 1;
                    f51749d = i110 % 128;
                    int i111 = i110 % 2;
                    return objFirstOrNull;
                }
                CancelPinPadLaunchRequest cancelPinPadLaunchRequest4 = (CancelPinPadLaunchRequest) objArr[0];
                Object obj4 = objArr[1];
                setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) objArr[2];
                Object obj5 = objArr[3];
                int i112 = f51748c;
                int i113 = i112 ^ 109;
                int i114 = (i112 & 109) << 1;
                int i115 = (i113 & i114) + (i114 | i113);
                f51749d = i115 % 128;
                if (i115 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setbackgroundtintlist2, "");
                    setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest4.f51750a, obj4, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist2)), obj5}, 814065429, -814065426, (int) System.currentTimeMillis());
                    linkedHashSet = (Set) cancelPinPadLaunchRequest4.f51751b.get(obj4);
                    int i116 = 84 / 0;
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        int i117 = f51749d;
                        int i118 = ((i117 ^ 5) | (i117 & 5)) << 1;
                        int i119 = -(((~i117) & 5) | (i117 & (-6)));
                        int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                        f51748c = i120 % 128;
                        int i121 = i120 % 2;
                    } else {
                        System.identityHashCode(cancelPinPadLaunchRequest4);
                        System.identityHashCode(cancelPinPadLaunchRequest4);
                    }
                } else {
                    Intrinsics.checkNotNullParameter(setbackgroundtintlist2, "");
                    setOnFocusChangeListener(new Object[]{cancelPinPadLaunchRequest4.f51750a, obj4, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist2)), obj5}, 814065429, -814065426, (int) System.currentTimeMillis());
                    linkedHashSet = (Set) cancelPinPadLaunchRequest4.f51751b.get(obj4);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        int i1110 = f51749d;
                        int i1111 = ((i1110 ^ 5) | (i1110 & 5)) << 1;
                        int i1112 = -(((~i1110) & 5) | (i1110 & (-6)));
                        int i122 = (i1111 ^ i1112) + ((i1112 & i1111) << 1);
                        f51748c = i122 % 128;
                        int i123 = i122 % 2;
                    } else {
                        System.identityHashCode(cancelPinPadLaunchRequest4);
                        System.identityHashCode(cancelPinPadLaunchRequest4);
                    }
                }
                linkedHashSet.add(Integer.valueOf(((byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, -1453308222, 1453308224, System.identityHashCode(setbackgroundtintlist2))).length));
                cancelPinPadLaunchRequest4.f51751b.put(obj4, linkedHashSet);
                int i124 = f51749d;
                int i125 = (-2) - (((i124 ^ 116) + ((i124 & 116) << 1)) ^ (-1));
                f51748c = i125 % 128;
                int i126 = i125 % 2;
            }
        } else {
            Map map2 = (Map) objArr[0];
            Object obj6 = objArr[1];
            byte[] bArr2 = (byte[]) objArr[2];
            int i127 = f51748c;
            int i128 = (-2) - (((i127 & 2) + (i127 | 2)) ^ (-1));
            f51749d = i128 % 128;
            int i129 = i128 % 2;
            if (bArr2 != null) {
                Object obj7 = map2.get(new z8(bArr2, obj6));
                int i130 = f51749d;
                int i131 = ((i130 ^ 49) | (i130 & 49)) << 1;
                int i132 = -(((~i130) & 49) | (i130 & (-50)));
                int i133 = ((i131 | i132) << 1) - (i132 ^ i131);
                f51748c = i133 % 128;
                int i134 = i133 % 2;
                return obj7;
            }
            int i135 = ((i127 & 100) + (i127 | 100)) - 1;
            int i136 = i135 % 128;
            f51749d = i136;
            int i137 = i135 % 2;
            int i138 = ((i136 | 43) << 1) - (((~i136) & 43) | (i136 & (-44)));
            f51748c = i138 % 128;
            int i139 = i138 % 2;
        }
        return null;
    }

    public final void setDividerPadding(I i10, @NotNull setBackgroundTintList setbackgroundtintlist, T t10) {
        setOnFocusChangeListener(new Object[]{this, i10, setbackgroundtintlist, t10}, -235006928, 235006933, System.identityHashCode(this));
    }

    @Nullable
    public final T setY(I i10, @NotNull setBackgroundTintList setbackgroundtintlist) {
        return (T) setOnFocusChangeListener(new Object[]{this, i10, setbackgroundtintlist}, 1452864265, -1452864265, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull Function1<? super T, ? extends T> function1) {
        setOnFocusChangeListener(new Object[]{this, function1}, 1503856781, -1503856777, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1767569711, 1767569713, System.identityHashCode(this))).booleanValue();
    }
}
