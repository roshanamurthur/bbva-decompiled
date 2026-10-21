package com.mypinpad.tsdk.isolation;

import androidx.appcompat.app.i;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class aj extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f52846h = {i.d(aj.class, "date_B1B3", "getDate_B1B3()Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/EmvDate;", 0), i.d(aj.class, "dateNewCentury_B1B3", "getDateNewCentury_B1B3()Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/EmvDate;", 0)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f52847i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f52848j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final o f52849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final r f52850g;

    static {
        int i10 = f52848j + 83;
        f52847i = i10 % 128;
        int i11 = i10 % 2;
    }

    public aj() {
        super(setAnimation.setImageResource().setDividerPadding());
        this.f52849f = new o();
        this.f52850g = new r();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object x4;
        int i13 = ~i11;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = (((~((~i10) | i12)) | (~(i11 | i15))) * 406) + ((~(i13 | i15 | i10)) * (-406)) + ((i14 | (~(i15 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405));
        boolean z10 = false;
        if (i16 == 1) {
            aj ajVar = (aj) objArr[0];
            int i17 = f52847i;
            int i18 = (i17 ^ 65) + ((i17 & 65) << 1);
            f52848j = i18 % 128;
            int i19 = i18 % 2;
            try {
                int i20 = f52848j + 53;
                f52847i = i20 % 128;
                int i21 = i20 % 2;
                z10 = true;
            } catch (setScaleType unused) {
            }
            int i22 = f52847i;
            int i23 = ((i22 ^ 69) | (i22 & 69)) << 1;
            int i24 = -(((~i22) & 69) | (i22 & (-70)));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f52848j = i25 % 128;
            int i26 = i25 % 2;
            return Boolean.valueOf(z10);
        }
        KProperty<Object>[] kPropertyArr = f52846h;
        if (i16 != 2) {
            aj ajVar2 = (aj) objArr[0];
            int i27 = f52848j;
            int i28 = ((i27 ^ 33) - (~((i27 & 33) << 1))) - 1;
            f52847i = i28 % 128;
            if (i28 % 2 != 0) {
                o oVar = ajVar2.f52849f;
                x4 = o.setX(new Object[]{ajVar2, kPropertyArr[0]}, 1838106620, -1838106620, (int) System.currentTimeMillis());
            } else {
                o oVar2 = ajVar2.f52849f;
                x4 = o.setX(new Object[]{ajVar2, kPropertyArr[0]}, 1838106620, -1838106620, (int) System.currentTimeMillis());
            }
            return (TransactionCompleted) x4;
        }
        aj ajVar3 = (aj) objArr[0];
        int i29 = f52848j;
        int i30 = ((-1) << 1) - ((((i29 | 14) << 1) - (i29 ^ 14)) ^ (-1));
        f52847i = i30 % 128;
        int i31 = i30 % 2;
        r rVar = ajVar3.f52850g;
        TransactionCompleted transactionCompleted = (TransactionCompleted) r.setCompoundDrawableTintBlendMode(new Object[]{ajVar3, kPropertyArr[1]}, -215137347, 215137347, (int) System.currentTimeMillis());
        int i32 = ((-1) << 1) - ((f52847i + 86) ^ (-1));
        f52848j = i32 % 128;
        int i33 = i32 % 2;
        return transactionCompleted;
    }

    @NotNull
    public final TransactionCompleted getNavBarTitleString() {
        return (TransactionCompleted) setY(new Object[]{this}, 1395639146, -1395639144, System.identityHashCode(this));
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setY(new Object[]{this}, 1460369001, -1460369000, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final TransactionCompleted setNavigationOnClickListener() {
        return (TransactionCompleted) setY(new Object[]{this}, 919185106, -919185106, System.identityHashCode(this));
    }
}
