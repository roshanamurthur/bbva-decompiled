package com.mypinpad.tsdk.isolation;

import bk.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class an extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53282i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f53283j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public List<av> f53284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f53285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public List<r1> f53286h;

    public an() {
        super(setAnimation.setMaxEms().setDividerPadding());
        this.f53284f = new ArrayList();
        this.f53285g = true;
        this.f53286h = CollectionsKt__CollectionsKt.emptyList();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        int i16 = 1;
        int i17 = 0;
        if (i15 == 1) {
            an anVar = (an) objArr[0];
            int i18 = f53283j;
            int i19 = (i18 ^ 115) + ((i18 & 115) << 1);
            f53282i = i19 % 128;
            int i20 = i19 % 2;
            List<av> list = anVar.f53284f;
            if (i20 == 0) {
                return list;
            }
            throw null;
        }
        int i21 = 10;
        if (i15 != 2) {
            if (i15 == 3) {
                an anVar2 = (an) objArr[0];
                int i22 = f53282i;
                int i23 = (i22 & 122) + (i22 | 122);
                int i24 = (i23 ^ (-1)) + (i23 << 1);
                int i25 = i24 % 128;
                f53283j = i25;
                int i26 = i24 % 2;
                boolean z10 = anVar2.f53285g;
                int i27 = ((i25 ^ 85) | (i25 & 85)) << 1;
                int i28 = -(((~i25) & 85) | (i25 & (-86)));
                int i29 = (i27 & i28) + (i27 | i28);
                f53282i = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(z10);
            }
            an anVar3 = (an) objArr[0];
            int onFocusChangeListener = super.setOnFocusChangeListener((byte[]) objArr[1], ((Number) objArr[2]).intValue());
            ArrayList<r1> arrayList = new ArrayList();
            int onFocusChangeListener2 = 0;
            while (onFocusChangeListener2 < anVar3.setCompoundDrawableTintBlendMode().length) {
                r1 r1Var = new r1();
                onFocusChangeListener2 = r1Var.setOnFocusChangeListener(anVar3.setCompoundDrawableTintBlendMode(), onFocusChangeListener2);
                if (!((Boolean) r1.b(new Object[]{r1Var}, -134313081, 134313082, System.identityHashCode(r1Var))).booleanValue()) {
                    anVar3.f53285g = false;
                    anVar3.f53286h = CollectionsKt__CollectionsKt.emptyList();
                    return Integer.valueOf(onFocusChangeListener);
                }
                arrayList.add(r1Var);
            }
            anVar3.f53286h = arrayList;
            ArrayList arrayList2 = new ArrayList();
            for (r1 r1Var2 : arrayList) {
                Object[] objArr2 = new Object[i16];
                objArr2[i17] = r1Var2;
                byte bByteValue = ((Byte) r1.b(objArr2, 1926213465, -1926213460, System.identityHashCode(r1Var2))).byteValue();
                Object[] objArr3 = new Object[i16];
                objArr3[i17] = r1Var2;
                IntRange intRange = new IntRange(bByteValue, ((Byte) r1.b(objArr3, 329588598, -329588594, System.identityHashCode(r1Var2))).byteValue());
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, i21));
                Iterator<Integer> it = intRange.iterator();
                int i31 = i17;
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    int i32 = i31 & 1;
                    int i33 = (i31 ^ 1) | i32;
                    int i34 = (i32 & i33) + (i32 | i33);
                    if (i31 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    byte b10 = (byte) iNextInt;
                    Object[] objArr4 = new Object[i16];
                    objArr4[i17] = r1Var2;
                    byte bByteValue2 = ((Byte) r1.b(objArr4, -1220788223, 1220788229, System.identityHashCode(r1Var2))).byteValue();
                    Object[] objArr5 = new Object[i16];
                    objArr5[0] = r1Var2;
                    arrayList3.add(new av(b10, bByteValue2, i31 < ((Byte) r1.b(objArr5, 1321673068, -1321673068, System.identityHashCode(r1Var2))).byteValue()));
                    i31 = i34;
                    i16 = 1;
                    i17 = 0;
                }
                g.addAll(arrayList2, arrayList3);
                i16 = 1;
                i17 = 0;
                i21 = 10;
            }
            anVar3.f53284f = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            return Integer.valueOf(onFocusChangeListener);
        }
        an anVar4 = (an) objArr[0];
        List<r1> list2 = anVar4.f53286h;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        int i35 = f53282i + 89;
        f53283j = i35 % 128;
        while (true) {
            int i36 = i35 % 2;
            if (!it2.hasNext()) {
                anVar4.setX((byte[]) setInputExtras.setDividerPadding(new Object[]{arrayList4}, -822524174, 822524177, (int) System.currentTimeMillis()));
                byte[] dividerPadding = super.setDividerPadding();
                int i37 = f53283j;
                int i38 = (i37 & (-8)) | ((~i37) & 7);
                int i39 = -(-((i37 & 7) << 1));
                int i40 = (i38 & i39) + (i39 | i38);
                f53282i = i40 % 128;
                if (i40 % 2 == 0) {
                    return dividerPadding;
                }
                throw null;
            }
            int i41 = f53283j;
            int i42 = (i41 & 91) + (i41 | 91);
            f53282i = i42 % 128;
            if (i42 % 2 != 0) {
                arrayList4.add(((r1) it2.next()).setDividerPadding());
                throw null;
            }
            arrayList4.add(((r1) it2.next()).setDividerPadding());
            i35 = f53282i + 69;
            f53283j = i35 % 128;
        }
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -2063594573, 2063594576, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final List<av> setNavigationOnClickListener() {
        return (List) setDividerPadding(new Object[]{this}, -1125953044, 1125953045, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 607676751, -607676751, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1164294205, -1164294203, System.identityHashCode(this));
    }
}
