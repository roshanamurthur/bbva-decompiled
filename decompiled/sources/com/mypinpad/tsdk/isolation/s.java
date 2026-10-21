package com.mypinpad.tsdk.isolation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f58174g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f58175h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f58176f;

    public s() {
        super(setAnimation.setOnTouchListener().setDividerPadding());
        this.f58176f = new LinkedHashSet();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] dividerPadding;
        int i13 = ~i10;
        int i14 = (i13 * 677) + (i11 * (-676)) + (i10 * 678);
        int i15 = ~i11;
        int i16 = ((~(i10 | i15)) * 677) + ((i13 | i15) * (-677)) + i14;
        if (i16 == 1) {
            s sVar = (s) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i17 = f58175h;
            int i18 = (i17 ^ 3) + ((3 & i17) << 1);
            f58174g = i18 % 128;
            int i19 = i18 % 2;
            int onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
            int i20 = f58175h;
            int i21 = i20 ^ 33;
            int i22 = ((i20 & 33) | i21) << 1;
            int i23 = -i21;
            int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
            f58174g = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (i26 < sVar.setCompoundDrawableTintBlendMode().length) {
                int i27 = f58175h;
                int i28 = ((i27 & 30) + (i27 | 30)) - 1;
                f58174g = i28 % 128;
                int i29 = i28 % 2;
                setScrollContainer.Companion companion = setScrollContainer.INSTANCE;
                Pair pair = (Pair) setScrollContainer.Companion.setDividerPadding(new Object[]{sVar.setCompoundDrawableTintBlendMode(), Integer.valueOf(i26)}, -388954655, 388954655, i26);
                int iIntValue2 = ((Number) pair.getSecond()).intValue();
                setScrollContainer setscrollcontainer = (setScrollContainer) pair.getFirst();
                String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                if (!Intrinsics.areEqual(str, "00")) {
                    int i30 = f58175h;
                    int i31 = (((i30 & (-24)) | ((~i30) & 23)) - (~((i30 & 23) << 1))) - 1;
                    f58174g = i31 % 128;
                    int i32 = i31 % 2;
                    LinkedHashSet linkedHashSet = sVar.f58176f;
                    if (i32 != 0) {
                        linkedHashSet.add(str);
                        throw null;
                    }
                    linkedHashSet.add(str);
                }
                i26 = iIntValue2;
            }
            int i33 = f58175h;
            int i34 = i33 & 109;
            int i35 = (((i33 | 109) & (~i34)) - (~(i34 << 1))) - 1;
            f58174g = i35 % 128;
            int i36 = i35 % 2;
            return Integer.valueOf(onFocusChangeListener);
        }
        if (i16 == 2) {
            s sVar2 = (s) objArr[0];
            String str2 = (String) objArr[1];
            int i37 = f58174g;
            int i38 = i37 & 101;
            int i39 = -(-((i37 ^ 101) | i38));
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            f58175h = i40 % 128;
            int i41 = i40 % 2;
            Intrinsics.checkNotNullParameter(str2, "");
            sVar2.f58176f.add(str2);
            int i42 = f58175h;
            int i43 = (i42 & 109) + (i42 | 109);
            f58174g = i43 % 128;
            int i44 = i43 % 2;
            return null;
        }
        if (i16 == 3) {
            s sVar3 = (s) objArr[0];
            TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
            int i45 = f58175h;
            int i46 = i45 & 113;
            int i47 = -(-(i45 | 113));
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            f58174g = i48 % 128;
            int i49 = i48 % 2;
            Intrinsics.checkNotNullParameter(transactionFailed, "");
            setDividerPadding(new Object[]{sVar3, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1528300875, -1528300873, System.identityHashCode(sVar3));
            int i50 = f58174g;
            int i51 = (-2) - ((((i50 | 40) << 1) - (i50 ^ 40)) ^ (-1));
            f58175h = i51 % 128;
            if (i51 % 2 != 0) {
                return null;
            }
            int i52 = 53 / 0;
            return null;
        }
        if (i16 == 4) {
            s sVar4 = (s) objArr[0];
            String str3 = (String) objArr[1];
            int i53 = f58174g + 99;
            f58175h = i53 % 128;
            if (i53 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str3, "");
                sVar4.f58176f.remove(str3);
                return null;
            }
            Intrinsics.checkNotNullParameter(str3, "");
            sVar4.f58176f.remove(str3);
            throw null;
        }
        s sVar5 = (s) objArr[0];
        int i54 = f58174g;
        int i55 = ((i54 ^ 33) | (i54 & 33)) << 1;
        int i56 = -(((~i54) & 33) | (i54 & (-34)));
        int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
        f58175h = i57 % 128;
        int i58 = i57 % 2;
        if (!sVar5.f58176f.isEmpty()) {
            Iterator it = sVar5.f58176f.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            int i59 = f58175h;
            int i60 = i59 & 3;
            int i61 = ((i59 ^ 3) | i60) << 1;
            int i62 = -((3 | i59) & (~i60));
            int i63 = (i61 & i62) + (i62 | i61);
            f58174g = i63 % 128;
            int i64 = i63 % 2;
            while (it.hasNext()) {
                int i65 = f58174g;
                int i66 = i65 & 111;
                int i67 = (i65 ^ 111) | i66;
                int i68 = (i66 & i67) + (i67 | i66);
                f58175h = i68 % 128;
                if (i68 % 2 == 0) {
                    Intrinsics.stringPlus((String) next, (String) it.next());
                    throw null;
                }
                next = Intrinsics.stringPlus((String) next, (String) it.next());
            }
            sVar5.setX((byte[]) setInputExtras.setDividerPadding(new Object[]{(String) next}, -1768743273, 1768743278, (int) System.currentTimeMillis()));
            dividerPadding = super.setDividerPadding();
            int i69 = f58174g;
            int i70 = (i69 & 115) + (i69 | 115);
            f58175h = i70 % 128;
            int i71 = i70 % 2;
        } else {
            System.identityHashCode(sVar5);
            System.identityHashCode(sVar5);
            dividerPadding = new byte[]{0};
            int i72 = f58174g + 113;
            f58175h = i72 % 128;
            int i73 = i72 % 2;
        }
        return dividerPadding;
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 976066429, -976066428, i10)).intValue();
    }

    public final void setX(@NotNull String str) {
        setDividerPadding(new Object[]{this, str}, 946922932, -946922928, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull String str) {
        setDividerPadding(new Object[]{this, str}, 1528300875, -1528300873, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull TransactionFailed transactionFailed) {
        setDividerPadding(new Object[]{this, transactionFailed}, -1134783533, 1134783536, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1637742546, -1637742546, System.identityHashCode(this));
    }
}
