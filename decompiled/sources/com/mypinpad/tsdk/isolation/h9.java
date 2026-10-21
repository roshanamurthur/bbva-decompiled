package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class h9 extends Lambda implements Function1<getBeepOnFailure, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h9 f56164p0 = new h9();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f56165q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56166r0 = 1;

    static {
        int i10 = f56166r0 + 15;
        f56165q0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public h9() {
        super(1);
    }

    public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i13 | (~(i14 | i15));
        int i17 = ~(i10 | i11);
        int i18 = (((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721));
        int i19 = f56165q0;
        boolean z10 = false;
        if (i18 == 1) {
            Object obj = objArr[1];
            int i20 = i19 & 49;
            int i21 = (i19 ^ 49) | i20;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            f56166r0 = i22 % 128;
            int i23 = i22 % 2;
            Boolean boolA = a(new Object[]{(getBeepOnFailure) obj}, -1338599290, 1338599290, (int) System.currentTimeMillis());
            int i24 = (i19 ^ 93) + ((i19 & 93) << 1);
            f56166r0 = i24 % 128;
            if (i24 % 2 != 0) {
                return boolA;
            }
            throw null;
        }
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i25 = i19 + 105;
        f56166r0 = i25 % 128;
        int i26 = i25 % 2;
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        setAnimation setanimation = setAnimation.INSTANCE;
        TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
        String str = (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed));
        TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -1633092668, 1633092819, (int) System.currentTimeMillis());
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2))});
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (listListOf.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
            int i27 = i19 & 23;
            int i28 = i27 + ((i19 ^ 23) | i27);
            f56166r0 = i28 % 128;
            int i29 = i28 % 2;
        } else {
            int i30 = ((i19 ^ 83) - (~(-(-((i19 & 83) << 1))))) - 1;
            f56166r0 = i30 % 128;
            int i31 = i30 % 2;
            int i32 = i19 & 7;
            int i33 = (i32 - (~((i19 ^ 7) | i32))) - 1;
            f56166r0 = i33 % 128;
            int i34 = i33 % 2;
            z10 = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i35 = i19 + 111;
        f56166r0 = i35 % 128;
        int i36 = i35 % 2;
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(getBeepOnFailure getbeeponfailure) {
        return a(new Object[]{this, getbeeponfailure}, -1943600797, 1943600798, System.identityHashCode(this));
    }
}
