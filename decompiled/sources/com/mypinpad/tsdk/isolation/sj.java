package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.mypinpad.tsdk.api.models.Iso4217Currency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sj {
    @NotNull
    public static final sl setDividerPadding(@NotNull Iso4217Currency iso4217Currency) {
        return (sl) setOnFocusChangeListener(new Object[]{iso4217Currency}, 409825701, -409825701, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i13 | (~(i14 | i15));
        int i17 = ~(i10 | i11);
        if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) != 1) {
            Iso4217Currency iso4217Currency = (Iso4217Currency) objArr[0];
            Intrinsics.checkNotNullParameter(iso4217Currency, "");
            return new sl(iso4217Currency.getNumericCode());
        }
        sl slVar = (sl) objArr[0];
        Intrinsics.checkNotNullParameter(slVar, "");
        return new Iso4217Currency(((Integer) sl.setY(new Object[]{slVar}, -1433045547, 1433045547, System.identityHashCode(slVar))).intValue());
    }

    @NotNull
    public static final Iso4217Currency setX(@NotNull sl slVar) {
        return (Iso4217Currency) setOnFocusChangeListener(new Object[]{slVar}, -2099390860, 2099390861, (int) System.currentTimeMillis());
    }
}
