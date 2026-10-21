package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setSystemUiVisibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60626a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60627b = 1;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        applicationCreated applicationcreated = (applicationCreated) objArr[0];
        Intrinsics.checkNotNullParameter(applicationcreated, "");
        List list = (List) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreated}, 601619422, -601619421, System.identityHashCode(applicationcreated));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        int i13 = f60626a;
        int i14 = i13 & 47;
        int i15 = ((((i13 ^ 47) | i14) << 1) - (~(-((i13 | 47) & (~i14))))) - 1;
        f60627b = i15 % 128;
        int i16 = i15 % 2;
        while (it.hasNext()) {
            int i17 = f60626a;
            int i18 = (i17 & 59) + (i17 | 59);
            f60627b = i18 % 128;
            if (i18 % 2 == 0) {
                String str = (String) it.next();
                setAccessibilityTraversalAfter.Companion companion = setAccessibilityTraversalAfter.INSTANCE;
                arrayList.add((setAccessibilityTraversalAfter) setAccessibilityTraversalAfter.Companion.setX(new Object[]{str}, 647307087, -647307087, (int) System.currentTimeMillis()));
                throw null;
            }
            String str2 = (String) it.next();
            setAccessibilityTraversalAfter.Companion companion2 = setAccessibilityTraversalAfter.INSTANCE;
            arrayList.add((setAccessibilityTraversalAfter) setAccessibilityTraversalAfter.Companion.setX(new Object[]{str2}, 647307087, -647307087, (int) System.currentTimeMillis()));
        }
        int i19 = f60627b;
        int i20 = i19 & 97;
        int i21 = (i20 - (~(-(-((i19 ^ 97) | i20))))) - 1;
        f60626a = i21 % 128;
        if (i21 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    @NotNull
    public static final List<setAccessibilityTraversalAfter> setY(@NotNull applicationCreated applicationcreated) {
        return (List) setDividerPadding(new Object[]{applicationcreated}, 688141689, -688141689, (int) System.currentTimeMillis());
    }
}
