package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setCertificate;", "", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/getBeepOnFailure;)[B", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setCertificate {

    @NotNull
    public static final setCertificate INSTANCE = new setCertificate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59540a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59541b = 1;

    static {
        int i10 = f59541b;
        int i11 = i10 & 13;
        int i12 = (i10 | 13) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f59540a = i14 % 128;
        int i15 = i14 % 2;
    }

    @NotNull
    public static byte[] setX(@Nullable getBeepOnFailure p4) {
        return (byte[]) setY(new Object[]{p4}, 1252819044, -1252819044, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i13 = f59540a + 43;
        f59541b = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (getbeeponfailure == null) {
            throw new fh(6, null, 2, null);
        }
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -308641137, 308641263, (int) System.currentTimeMillis());
        if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) ((Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))}, 2119034130, -2119034129, (int) System.currentTimeMillis())).getFirst();
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 243863605, -243863605, System.identityHashCode(getbeeponfailure2));
            int i14 = (-2) - ((f59540a + 116) ^ (-1));
            f59541b = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 10 / 0;
            }
        } else {
            int i16 = f59541b;
            int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
            f59540a = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 243863605, -243863605, System.identityHashCode(getbeeponfailure));
            int i18 = f59541b;
            int i19 = (((i18 | 126) << 1) - (i18 ^ 126)) - 1;
            f59540a = i19 % 128;
            if (i19 % 2 != 0) {
                throw null;
            }
        }
        return bArr;
    }
}
