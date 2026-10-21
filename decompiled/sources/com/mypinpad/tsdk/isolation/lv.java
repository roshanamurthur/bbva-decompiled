package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/lv;", "", "Lcom/mypinpad/tsdk/i/lq;", "p0", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p1", "Lcom/mypinpad/tsdk/i/getValue;", "p2", "Lcom/mypinpad/tsdk/i/fk;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/lq;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/getValue;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class lv {

    @NotNull
    public static final lv INSTANCE = new lv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57004a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57005b = 1;

    static {
        int i10 = f57005b;
        int i11 = i10 & 83;
        int i12 = ((i10 ^ 83) | i11) << 1;
        int i13 = -((i10 | 83) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f57004a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 6 / 0;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        lq lqVar = (lq) objArr[0];
        setContentDescription setcontentdescription = (setContentDescription) objArr[1];
        getValue getvalue = (getValue) objArr[2];
        int i13 = f57004a;
        int i14 = (i13 ^ 117) + ((i13 & 117) << 1);
        f57005b = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(lqVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        ef efVar = ef.INSTANCE;
        fk fkVar = (fk) ef.setY(new Object[]{lqVar, setcontentdescription, getvalue}, 327425298, -327425297, (int) System.currentTimeMillis());
        int i16 = f57005b;
        int i17 = i16 ^ 65;
        int i18 = ((i16 & 65) | i17) << 1;
        int i19 = -i17;
        int i20 = (i18 & i19) + (i18 | i19);
        f57004a = i20 % 128;
        int i21 = i20 % 2;
        return fkVar;
    }

    @NotNull
    public static fk setOnFocusChangeListener(@NotNull lq p4, @NotNull setContentDescription p10, @NotNull getValue p11) {
        return (fk) setDividerPadding(new Object[]{p4, p10, p11}, -382258194, 382258194, (int) System.currentTimeMillis());
    }
}
