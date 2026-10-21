package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/setDataDirectorySuffix;", "", "", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p0", "Lkotlin/Function1;", "", "p1", "", "setDividerPadding", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)[B", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setDataDirectorySuffix {

    @NotNull
    public static final setDataDirectorySuffix INSTANCE = new setDataDirectorySuffix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59615a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59616b = 1;

    static {
        int i10 = f59616b;
        int i11 = (i10 & 23) + (i10 | 23);
        f59615a = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        String str;
        int iIntValue;
        byte[] bArr;
        int i13;
        ArrayList arrayList;
        List listEmptyList;
        List list = (List) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i14 = f59615a;
        int i15 = i14 & 49;
        int i16 = (i14 | 49) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = (i16 & i17) + (i16 | i17);
        f59616b = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        if (list == null) {
            int i20 = f59615a;
            int i21 = i20 & 75;
            int i22 = -(-((i20 ^ 75) | i21));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            int i24 = i23 % 128;
            f59616b = i24;
            if (i23 % 2 == 0) {
                throw null;
            }
            int i25 = (i24 ^ 66) + ((i24 & 66) << 1);
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            f59615a = i26 % 128;
            int i27 = i26 % 2;
            arrayList = null;
        } else {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            int i28 = f59616b;
            int i29 = ((i28 ^ 67) | (i28 & 67)) << 1;
            int i30 = -(((~i28) & 67) | (i28 & (-68)));
            int i31 = (i29 & i30) + (i30 | i29);
            f59615a = i31 % 128;
            int i32 = i31 % 2;
            while (it.hasNext()) {
                int i33 = f59616b;
                int i34 = i33 ^ 113;
                int i35 = ((((i33 & 113) | i34) << 1) - (~(-i34))) - 1;
                f59615a = i35 % 128;
                if (i35 % 2 != 0) {
                    getBeepOnFailure getbeeponfailure = (getBeepOnFailure) it.next();
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    throw null;
                }
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) it.next();
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) function1.invoke((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)));
                if (getbeeponfailure3 == null) {
                    int i36 = f59615a;
                    int i37 = ((i36 | 33) << 1) - (i36 ^ 33);
                    f59616b = i37 % 128;
                    if (i37 % 2 == 0) {
                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                        str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                        setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                        iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue();
                        bArr = new byte[iIntValue];
                        i13 = 1;
                    } else {
                        setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                        str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4));
                        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                        iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue();
                        bArr = new byte[iIntValue];
                        i13 = 0;
                    }
                    while (i13 < iIntValue) {
                        int i38 = f59615a;
                        int i39 = ((i38 ^ 109) | (i38 & 109)) << 1;
                        int i40 = -((i38 & (-110)) | (109 & (~i38)));
                        int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                        f59616b = i41 % 128;
                        int i42 = i41 % 2;
                        bArr[i13] = 0;
                        i13++;
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                    getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr, null, Boolean.FALSE, 12}, -976227287, 976227290, 12);
                    int i43 = f59616b;
                    int i44 = (i43 & (-54)) | ((~i43) & 53);
                    int i45 = (i43 & 53) << 1;
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    f59615a = i46 % 128;
                    int i47 = i46 % 2;
                } else {
                    int i48 = f59616b;
                    int i49 = i48 ^ 97;
                    int i50 = (((i48 & 97) | i49) << 1) - i49;
                    f59615a = i50 % 128;
                    int i51 = i50 % 2;
                }
                setImageTintList setimagetintlist3 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                setImageTintList setimagetintlist4 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                int iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist4}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist4))).intValue();
                setImageTintList.setX(new Object[]{setimagetintlist3, Integer.valueOf(iIntValue2)}, -2003004454, 2003004454, iIntValue2);
                arrayList2.add((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3)));
                int i52 = f59615a + 27;
                f59616b = i52 % 128;
                int i53 = i52 % 2;
            }
            int i54 = f59615a;
            int i55 = i54 & 87;
            int i56 = (i54 ^ 87) | i55;
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            f59616b = i57 % 128;
            int i58 = i57 % 2;
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            int i59 = f59615a;
            int i60 = (-2) - ((((i59 | 70) << 1) - (i59 ^ 70)) ^ (-1));
            f59616b = i60 % 128;
            if (i60 % 2 == 0) {
                CollectionsKt__CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            int i61 = f59615a + 49;
            f59616b = i61 % 128;
            int i62 = i61 % 2;
            listEmptyList = arrayList;
        }
        byte[] bArr2 = (byte[]) setInputExtras.setDividerPadding(new Object[]{listEmptyList}, -822524174, 822524177, (int) System.currentTimeMillis());
        int i63 = f59616b;
        int i64 = i63 & 53;
        int i65 = ((((i63 ^ 53) | i64) << 1) - (~(-((i63 | 53) & (~i64))))) - 1;
        f59615a = i65 % 128;
        if (i65 % 2 == 0) {
            return bArr2;
        }
        throw null;
    }

    @NotNull
    public static byte[] setDividerPadding(@Nullable List<? extends getBeepOnFailure> p4, @NotNull Function1<? super String, ? extends getBeepOnFailure> p10) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -980462587, 980462587, (int) System.currentTimeMillis());
    }
}
