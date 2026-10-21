package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/setCompoundDrawablesWithIntrinsicBounds;", "Lcom/mypinpad/tsdk/i/component31;", "Lcom/mypinpad/tsdk/i/getCode;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/getCode;)V", "", "setY", "(Ljava/util/List;)V", "", "()I", "", "setOnFocusChangeListener", "(Ljava/lang/Long;)Ljava/util/List;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class setCompoundDrawablesWithIntrinsicBounds implements component31 {

    @NotNull
    public static final setCompoundDrawablesWithIntrinsicBounds INSTANCE = new setCompoundDrawablesWithIntrinsicBounds();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayList f59571a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59572b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59573c = 1;

    static {
        int i10 = f59573c;
        int i11 = i10 & 119;
        int i12 = -(-(i10 | 119));
        int i13 = (i11 & i12) + (i12 | i11);
        f59572b = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 75 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ce  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        List list;
        int i13;
        int i14 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        ArrayList arrayList = f59571a;
        if (i14 == 1) {
            setCompoundDrawablesWithIntrinsicBounds setcompounddrawableswithintrinsicbounds = (setCompoundDrawablesWithIntrinsicBounds) objArr[0];
            getCode getcode = (getCode) objArr[1];
            System.identityHashCode(setcompounddrawableswithintrinsicbounds);
            System.identityHashCode(setcompounddrawableswithintrinsicbounds);
            Intrinsics.checkNotNullParameter(getcode, "");
            arrayList.add(getcode);
            int i15 = f59573c + 37;
            f59572b = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i14 == 2) {
            List list2 = (List) objArr[1];
            int i16 = f59573c;
            int i17 = (i16 ^ 61) + ((i16 & 61) << 1);
            f59572b = i17 % 128;
            if (i17 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list2, "");
                arrayList.addAll(list2);
                return null;
            }
            Intrinsics.checkNotNullParameter(list2, "");
            arrayList.addAll(list2);
            throw null;
        }
        if (i14 != 3) {
            int i18 = f59572b;
            int i19 = (i18 | 85) << 1;
            int i20 = -(i18 ^ 85);
            int i21 = (i19 & i20) + (i20 | i19);
            f59573c = i21 % 128;
            if (i21 % 2 == 0) {
                arrayList.size();
                throw null;
            }
            int size = arrayList.size();
            int i22 = f59573c;
            int i23 = (i22 & 31) + (i22 | 31);
            f59572b = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(size);
        }
        Long l6 = (Long) objArr[1];
        int i25 = f59573c;
        int i26 = i25 & 29;
        int i27 = ((i25 ^ 29) | i26) << 1;
        int i28 = -((i25 | 29) & (~i26));
        int i29 = (i27 & i28) + (i28 | i27);
        f59572b = i29 % 128;
        if (i29 % 2 == 0) {
            if (l6 != null) {
                if (l6.longValue() >= arrayList.size()) {
                    Object objCollect = arrayList.stream().limit(l6.longValue()).collect(Collectors.toList());
                    Intrinsics.checkNotNullExpressionValue(objCollect, "");
                    list = CollectionsKt___CollectionsKt.toList((Iterable) objCollect);
                    arrayList.removeAll(list);
                    int i30 = f59572b;
                    int i31 = ((i30 ^ 61) | (i30 & 61)) << 1;
                    int i32 = -(((~i30) & 61) | (i30 & (-62)));
                    i13 = (i31 & i32) + (i32 | i31);
                    f59573c = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }
            }
            return list;
        }
        int i33 = 68 / 0;
        if (l6 != null) {
            if (l6.longValue() >= arrayList.size()) {
                Object objCollect2 = arrayList.stream().limit(l6.longValue()).collect(Collectors.toList());
                Intrinsics.checkNotNullExpressionValue(objCollect2, "");
                list = CollectionsKt___CollectionsKt.toList((Iterable) objCollect2);
                arrayList.removeAll(list);
                int i34 = f59572b;
                int i35 = ((i34 ^ 61) | (i34 & 61)) << 1;
                int i36 = -(((~i34) & 61) | (i34 & (-62)));
                i13 = (i35 & i36) + (i36 | i35);
                f59573c = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }
        }
        return list;
        list = CollectionsKt___CollectionsKt.toList(arrayList);
        arrayList.clear();
        int i37 = f59573c;
        int i38 = i37 & 121;
        int i39 = (((i37 | 121) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
        f59572b = i39 % 128;
        int i40 = i39 % 2;
        return list;
    }

    @Override // com.mypinpad.tsdk.isolation.component31
    @NotNull
    public final List<getCode> setOnFocusChangeListener(@Nullable Long p4) {
        return (List) setDividerPadding(new Object[]{this, p4}, -184894336, 184894339, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component31
    public final void setY(@NotNull List<? extends getCode> p4) {
        setDividerPadding(new Object[]{this, p4}, 930494172, -930494170, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.component31
    public final int setDividerPadding() {
        return ((Integer) setDividerPadding(new Object[]{this}, 1160976909, -1160976909, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.component31
    public final void setDividerPadding(@NotNull getCode p4) {
        setDividerPadding(new Object[]{this, p4}, -428804946, 428804947, System.identityHashCode(this));
    }
}
