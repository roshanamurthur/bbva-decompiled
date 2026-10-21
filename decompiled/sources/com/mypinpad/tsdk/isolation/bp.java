package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class bp extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f54715g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f54716h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f54717f;

    public bp() {
        super(setAnimation.TransactionNotAuthorised().setDividerPadding());
        this.f54717f = new ArrayList();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = (((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        int length = 0;
        if (i14 != 1) {
            bp bpVar = (bp) objArr[0];
            int i15 = f54715g;
            int i16 = i15 & 113;
            int i17 = -(-((i15 ^ 113) | i16));
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            f54716h = i18 % 128;
            int i19 = i18 % 2;
            ArrayList arrayList = bpVar.f54717f;
            if (i19 != 0) {
                return arrayList;
            }
            int i20 = 92 / 0;
            return arrayList;
        }
        bp bpVar2 = (bp) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i21 = f54716h;
        int i22 = i21 & 61;
        int i23 = -(-((i21 ^ 61) | i22));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        f54715g = i24 % 128;
        int i25 = i24 % 2;
        int onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
        int i26 = f54715g;
        int i27 = i26 & 99;
        int i28 = (i26 | 99) & (~i27);
        int i29 = i27 << 1;
        int i30 = i28 ^ i29;
        int i31 = (i28 & i29) << 1;
        while (true) {
            int i32 = i30 + i31;
            f54716h = i32 % 128;
            int i33 = i32 % 2;
            if (length + 1 >= bpVar2.setCompoundDrawableTintBlendMode().length) {
                int i34 = f54715g;
                int i35 = ((i34 | 53) << 1) - (i34 ^ 53);
                f54716h = i35 % 128;
                int i36 = i35 % 2;
                return Integer.valueOf(onFocusChangeListener);
            }
            int i37 = length ^ 1;
            int i38 = (length & 1) << 1;
            byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(bpVar2.setCompoundDrawableTintBlendMode(), new IntRange(length, ((i37 | i38) << 1) - (i37 ^ i38))));
            length += byteArray.length;
            bpVar2.f54717f.add(byteArray);
            int i39 = f54715g;
            int i40 = i39 & 85;
            int i41 = -(-(i39 | 85));
            i30 = i40 & i41;
            i31 = i41 | i40;
        }
    }

    @NotNull
    public final List<byte[]> getNavBarTitleString() {
        return (List) setDividerPadding(new Object[]{this}, -845224615, 845224615, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 1279508450, -1279508449, i10)).intValue();
    }
}
