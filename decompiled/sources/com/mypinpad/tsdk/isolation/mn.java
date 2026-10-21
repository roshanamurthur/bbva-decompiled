package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\ncom/mypinpad/tsdk/internal/common/json/JsonArray\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n11335#2:107\n11670#2,3:108\n1549#3:111\n1620#3,3:112\n*S KotlinDebug\n*F\n+ 1 Json.kt\ncom/mypinpad/tsdk/internal/common/json/JsonArray\n*L\n100#1:107\n100#1:108,3\n100#1:111\n100#1:112,3\n*E\n"})
public final class mn<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57121b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57122c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JSONArray f57123a;

    /* JADX WARN: Multi-variable type inference failed */
    public mn(@NotNull T[] tArr, @NotNull Function1<? super T, mo> function1) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList<mo> arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i10 = 0;
        while (i10 < length) {
            arrayList.add(function1.invoke(tArr[i10]));
            int i11 = i10 & 1;
            i10 = ((((i10 ^ 1) | i11) << 1) - (~(-((i10 | 1) & (~i11))))) - 1;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (mo moVar : arrayList) {
            arrayList2.add((JSONObject) mo.setY(new Object[]{moVar}, -378484831, 378484834, System.identityHashCode(moVar)));
        }
        this.f57123a = new JSONArray((Collection) arrayList2);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        if ((((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317)) == 1) {
            mn mnVar = (mn) objArr[0];
            int i15 = f57122c;
            int i16 = ((-1) << 1) - ((((i15 | 44) << 1) - (i15 ^ 44)) ^ (-1));
            int i17 = i16 % 128;
            f57121b = i17;
            int i18 = i16 % 2;
            JSONArray jSONArray = mnVar.f57123a;
            int i19 = ((i17 & (-16)) | ((~i17) & 15)) + ((i17 & 15) << 1);
            f57122c = i19 % 128;
            int i20 = i19 % 2;
            return jSONArray;
        }
        mn mnVar2 = (mn) objArr[0];
        int i21 = f57122c;
        int i22 = (i21 & (-58)) | ((~i21) & 57);
        int i23 = -(-((i21 & 57) << 1));
        int i24 = (i22 & i23) + (i23 | i22);
        f57121b = i24 % 128;
        int i25 = i24 % 2;
        String string = mnVar2.f57123a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (i25 != 0) {
            throw null;
        }
        int i26 = f57121b;
        int i27 = i26 & 99;
        int i28 = i26 | 99;
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        f57122c = i29 % 128;
        if (i29 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @NotNull
    public final JSONArray setX() {
        return (JSONArray) setCompoundDrawableTintBlendMode(new Object[]{this}, -406704089, 406704090, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1606115070, 1606115070, System.identityHashCode(this));
    }
}
