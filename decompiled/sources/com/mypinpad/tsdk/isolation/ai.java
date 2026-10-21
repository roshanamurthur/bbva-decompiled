package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ai extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f52739h = {i.d(ai.class, "date_B1B3", "getDate_B1B3()Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/EmvDate;", 0), i.d(ai.class, "dateNewCentury_B1B3", "getDateNewCentury_B1B3()Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/EmvDate;", 0)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f52740i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f52741j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final o f52742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final r f52743g;

    static {
        int i10 = f52740i;
        int i11 = (i10 & (-22)) | ((~i10) & 21);
        int i12 = (i10 & 21) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f52741j = i13 % 128;
        int i14 = i13 % 2;
    }

    public ai() {
        super(setAnimation.getSuppressed().setDividerPadding());
        this.f52742f = new o();
        this.f52743g = new r();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        Object x4;
        int i13 = ~i10;
        int i14 = (((~(i10 | i11)) | (~(i12 | i13))) * 433) + (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        KProperty<Object>[] kPropertyArr = f52739h;
        boolean z10 = false;
        if (i14 == 1) {
            ai aiVar = (ai) objArr[0];
            int i15 = f52741j;
            int i16 = ((((i15 ^ 5) | (i15 & 5)) << 1) - (~(-(((~i15) & 5) | (i15 & (-6)))))) - 1;
            f52740i = i16 % 128;
            if (i16 % 2 != 0) {
                r rVar = aiVar.f52743g;
                compoundDrawableTintBlendMode = r.setCompoundDrawableTintBlendMode(new Object[]{aiVar, kPropertyArr[1]}, -215137347, 215137347, (int) System.currentTimeMillis());
            } else {
                r rVar2 = aiVar.f52743g;
                compoundDrawableTintBlendMode = r.setCompoundDrawableTintBlendMode(new Object[]{aiVar, kPropertyArr[1]}, -215137347, 215137347, (int) System.currentTimeMillis());
            }
            TransactionCompleted transactionCompleted = (TransactionCompleted) compoundDrawableTintBlendMode;
            int i17 = f52740i;
            int i18 = i17 & 51;
            int i19 = (i18 - (~((i17 ^ 51) | i18))) - 1;
            f52741j = i19 % 128;
            int i20 = i19 % 2;
            return transactionCompleted;
        }
        if (i14 != 2) {
            ai aiVar2 = (ai) objArr[0];
            int i21 = f52740i;
            int i22 = ((i21 & 27) - (~(i21 | 27))) - 1;
            f52741j = i22 % 128;
            if (i22 % 2 == 0) {
                o oVar = aiVar2.f52742f;
                x4 = o.setX(new Object[]{aiVar2, kPropertyArr[0]}, 1838106620, -1838106620, (int) System.currentTimeMillis());
            } else {
                o oVar2 = aiVar2.f52742f;
                x4 = o.setX(new Object[]{aiVar2, kPropertyArr[0]}, 1838106620, -1838106620, (int) System.currentTimeMillis());
            }
            return (TransactionCompleted) x4;
        }
        ai aiVar3 = (ai) objArr[0];
        int i23 = f52740i;
        int i24 = (i23 & (-46)) | ((~i23) & 45);
        int i25 = -(-((i23 & 45) << 1));
        int i26 = (i24 & i25) + (i25 | i24);
        f52741j = i26 % 128;
        try {
            if (i26 % 2 == 0) {
            } else {
                z10 = true;
            }
        } catch (setScaleType unused) {
        }
        int i27 = f52741j;
        int i28 = ((i27 | 107) << 1) - (i27 ^ 107);
        f52740i = i28 % 128;
        int i29 = i28 % 2;
        return Boolean.valueOf(z10);
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1217367733, 1217367735, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final TransactionCompleted setLayoutAnimation() {
        return (TransactionCompleted) setDividerPadding(new Object[]{this}, 1434468776, -1434468775, System.identityHashCode(this));
    }

    @NotNull
    public final TransactionCompleted setNavigationOnClickListener() {
        return (TransactionCompleted) setDividerPadding(new Object[]{this}, 1408442774, -1408442774, System.identityHashCode(this));
    }
}
