package com.mypinpad.tsdk.isolation;

import android.content.ContentResolver;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class deactivate {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55140b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55141c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ContentResolver f55142a;

    public static final class setY {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55143b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55144a;

        public setY(@NotNull String str, int i10) {
            Intrinsics.checkNotNullParameter(str, "");
            this.f55144a = i10;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setY sety = (setY) objArr[0];
            int i13 = f55143b;
            int i14 = ((i13 | 67) << 1) - (i13 ^ 67);
            int i15 = i14 % 128;
            int i16 = i14 % 2;
            int i17 = sety.f55144a;
            int i18 = i15 & 5;
            int i19 = (i15 ^ 5) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f55143b = i20 % 128;
            int i21 = i20 % 2;
            return Integer.valueOf(i17);
        }

        public final int setCompoundDrawableTintBlendMode() {
            return ((Integer) setOnFocusChangeListener(new Object[]{this}, 770353159, -770353159, System.identityHashCode(this))).intValue();
        }
    }

    public deactivate(@NotNull ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(contentResolver, "");
        this.f55142a = contentResolver;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        deactivate deactivateVar = (deactivate) objArr[0];
        List list = (List) objArr[1];
        Intrinsics.checkNotNullParameter(list, "");
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i13 = f55141c;
        int i14 = ((i13 ^ 32) + ((i13 & 32) << 1)) - 1;
        f55140b = i14 % 128;
        int i15 = i14 % 2;
        for (String str : list2) {
            arrayList.add(new setY(str, Settings.Global.getInt(deactivateVar.f55142a, str, 0)));
            int i16 = f55141c + 105;
            f55140b = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = f55140b;
        int i19 = (((i18 | 96) << 1) - (i18 ^ 96)) - 1;
        f55141c = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 83 / 0;
        }
        return arrayList;
    }

    @NotNull
    public final List<setY> setY(@NotNull List<String> list) {
        return (List) setX(new Object[]{this, list}, -145326585, 145326585, System.identityHashCode(this));
    }
}
