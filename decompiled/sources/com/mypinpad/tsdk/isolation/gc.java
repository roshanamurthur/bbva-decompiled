package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/gc;", "", "Lcom/mypinpad/tsdk/i/fi;", "p0", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p1", "Lcom/mypinpad/tsdk/i/getValue;", "p2", "Lcom/mypinpad/tsdk/i/fk;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/fi;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/getValue;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class gc {

    @NotNull
    public static final gc INSTANCE = new gc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55653a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55654b = 1;

    static {
        int i10 = f55653a;
        int i11 = i10 & 1;
        int i12 = (i10 | 1) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f55654b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        fi fiVar = (fi) objArr[0];
        setContentDescription setcontentdescription = (setContentDescription) objArr[1];
        getValue getvalue = (getValue) objArr[2];
        int i13 = f55653a;
        int i14 = (((i13 | 109) << 1) - (~(-(((~i13) & 109) | (i13 & (-110)))))) - 1;
        f55654b = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fiVar, "");
            Intrinsics.checkNotNullParameter(setcontentdescription, "");
            Intrinsics.checkNotNullParameter(getvalue, "");
            ef efVar = ef.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        ef efVar2 = ef.INSTANCE;
        fk fkVar = (fk) ef.setY(new Object[]{fiVar, setcontentdescription, getvalue}, 327425298, -327425297, (int) System.currentTimeMillis());
        int i15 = f55654b + 115;
        f55653a = i15 % 128;
        if (i15 % 2 == 0) {
            return fkVar;
        }
        throw null;
    }

    @NotNull
    public static fk setDividerPadding(@NotNull fi p4, @NotNull setContentDescription p10, @NotNull getValue p11) {
        return (fk) setDividerPadding(new Object[]{p4, p10, p11}, 117891719, -117891719, (int) System.currentTimeMillis());
    }
}
