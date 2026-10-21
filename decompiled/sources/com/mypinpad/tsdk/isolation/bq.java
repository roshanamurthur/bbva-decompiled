package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class bq extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f54718j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f54719k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f54720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f54721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f54722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54723i;

    public bq() {
        super(setAnimation.setHint().setDividerPadding());
        this.f54722h = new ArrayList();
        this.f54723i = true;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i12)) | (~(i11 | i15))) * 950) + (((~(i15 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i14 | i15)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949));
        if (i16 == 1) {
            bq bqVar = (bq) objArr[0];
            int i17 = f54718j;
            int i18 = (i17 ^ 25) + ((i17 & 25) << 1);
            f54719k = i18 % 128;
            int i19 = i18 % 2;
            long j10 = bqVar.f54721g;
            int i20 = i17 & 87;
            int i21 = (i17 ^ 87) | i20;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f54719k = i22 % 128;
            int i23 = i22 % 2;
            return Long.valueOf(j10);
        }
        if (i16 == 2) {
            bq bqVar2 = (bq) objArr[0];
            int i24 = f54718j;
            int i25 = ((i24 ^ 19) | (i24 & 19)) << 1;
            int i26 = -((i24 & (-20)) | ((~i24) & 19));
            int i27 = (i25 & i26) + (i25 | i26);
            f54719k = i27 % 128;
            if (i27 % 2 == 0) {
                long j11 = bqVar2.f54720f;
                throw null;
            }
            long j12 = bqVar2.f54720f;
            int i28 = ((i24 ^ 88) + ((i24 & 88) << 1)) - 1;
            f54719k = i28 % 128;
            if (i28 % 2 != 0) {
                return Long.valueOf(j12);
            }
            throw null;
        }
        if (i16 == 3) {
            bq bqVar3 = (bq) objArr[0];
            int i29 = f54719k;
            int i30 = (i29 ^ 87) + ((i29 & 87) << 1);
            f54718j = i30 % 128;
            int i31 = i30 % 2;
            ArrayList arrayList = bqVar3.f54722h;
            if (i31 == 0) {
                return arrayList;
            }
            throw null;
        }
        if (i16 == 4) {
            bq bqVar4 = (bq) objArr[0];
            int i32 = f54719k + 105;
            f54718j = i32 % 128;
            int i33 = i32 % 2;
            boolean z10 = bqVar4.f54723i;
            if (i33 != 0) {
                int i34 = 10 / 0;
            }
            return Boolean.valueOf(z10);
        }
        if (i16 == 5) {
            bq bqVar5 = (bq) objArr[0];
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((byte[]) setInputExtras.setDividerPadding(new Object[]{Long.valueOf(bqVar5.f54720f), 6}, 672373041, -672373041, 6));
            arrayList2.add((byte[]) setInputExtras.setDividerPadding(new Object[]{Long.valueOf(bqVar5.f54720f), 6}, 672373041, -672373041, 6));
            Iterator it = bqVar5.f54722h.iterator();
            int i35 = f54718j;
            int i36 = i35 & 39;
            int i37 = (i35 ^ 39) | i36;
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            f54719k = i38 % 128;
            int i39 = i38 % 2;
            while (it.hasNext()) {
                int i40 = f54719k;
                int i41 = i40 ^ 95;
                int i42 = (i40 & 95) << 1;
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f54718j = i43 % 128;
                if (i43 % 2 != 0) {
                    ca caVar = (ca) it.next();
                    arrayList2.add((byte[]) ca.setOnFocusChangeListener(new Object[]{caVar}, -750046195, 750046200, System.identityHashCode(caVar)));
                    throw null;
                }
                ca caVar2 = (ca) it.next();
                arrayList2.add((byte[]) ca.setOnFocusChangeListener(new Object[]{caVar2}, -750046195, 750046200, System.identityHashCode(caVar2)));
            }
            bqVar5.setX((byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList2}, -822524174, 822524177, (int) System.currentTimeMillis()));
            byte[] dividerPadding = super.setDividerPadding();
            int i44 = f54719k;
            int i45 = (-2) - (((i44 ^ 44) + ((i44 & 44) << 1)) ^ (-1));
            f54718j = i45 % 128;
            int i46 = i45 % 2;
            return dividerPadding;
        }
        bq bqVar6 = (bq) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        bqVar6.f54722h.clear();
        int onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        System.arraycopy(bqVar6.setCompoundDrawableTintBlendMode(), 0, bArr2, 0, 4);
        System.arraycopy(bqVar6.setCompoundDrawableTintBlendMode(), 4, bArr3, 0, 4);
        bqVar6.f54720f = ((Long) setInputExtras.setDividerPadding(new Object[]{bArr2}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
        bqVar6.f54721g = ((Long) setInputExtras.setDividerPadding(new Object[]{bArr3}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
        byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bqVar6.setCompoundDrawableTintBlendMode(), new IntRange(8, ArraysKt___ArraysKt.getIndices(bqVar6.setCompoundDrawableTintBlendMode()).getLast()));
        if (bArrSliceArray.length % 2 != 0) {
            int i47 = f54718j;
            int i48 = i47 + 69;
            f54719k = i48 % 128;
            int i49 = i48 % 2;
            bqVar6.f54723i = false;
            i13 = ((i47 | 5) << 1) - (i47 ^ 5);
            f54719k = i13 % 128;
        } else {
            ArrayList arrayList3 = bqVar6.f54722h;
            List list = (List) setInputExtras.setDividerPadding(new Object[]{bArrSliceArray}, 1021812284, -1021812267, (int) System.currentTimeMillis());
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            int i50 = f54718j + 121;
            f54719k = i50 % 128;
            int i51 = i50 % 2;
            while (it2.hasNext()) {
                arrayList4.add(new ca((byte[]) it2.next()));
                int i52 = f54719k;
                int i53 = i52 & 91;
                int i54 = (i52 | 91) & (~i53);
                int i55 = i53 << 1;
                int i56 = (i54 & i55) + (i54 | i55);
                f54718j = i56 % 128;
                int i57 = i56 % 2;
            }
            arrayList3.addAll(arrayList4);
            i13 = f54719k + 23;
            f54718j = i13 % 128;
        }
        int i58 = i13 % 2;
        int i59 = f54718j;
        int i60 = i59 & 49;
        int i61 = -(-((i59 ^ 49) | i60));
        int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
        f54719k = i62 % 128;
        int i63 = i62 % 2;
        return Integer.valueOf(onFocusChangeListener);
    }

    public final long getNavBarTitleString() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 319971081, -319971080, System.identityHashCode(this))).longValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 46873021, -46873017, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1635497484, -1635497479, System.identityHashCode(this));
    }

    @NotNull
    public final List<ca> setLayoutAnimation() {
        return (List) setOnFocusChangeListener(new Object[]{this}, -1483471994, 1483471997, System.identityHashCode(this));
    }

    public final long setNavigationOnClickListener() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, -1457120318, 1457120320, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, 1870608350, -1870608350, i10)).intValue();
    }
}
