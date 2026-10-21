package com.mypinpad.tsdk.isolation;

import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/nx;", "Lcom/mypinpad/tsdk/i/np;", "Ljava/util/Date;", "setDividerPadding", "()Ljava/util/Date;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class nx implements np {

    @NotNull
    public static final nx INSTANCE = new nx();

    static {
        int i10 = 1 & 99;
        int i11 = (1 ^ 99) | i10;
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        int i14 = i12 % 2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return new Date();
    }

    @Override // com.mypinpad.tsdk.isolation.component18
    @NotNull
    public final Date setDividerPadding() {
        return (Date) setY(new Object[]{this}, 2098183372, -2098183372, System.identityHashCode(this));
    }
}
