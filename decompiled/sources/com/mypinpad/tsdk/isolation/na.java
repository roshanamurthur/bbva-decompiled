package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/na;", "Lcom/mypinpad/tsdk/i/mx;", "", "p0", "setDividerPadding", "([B)[B", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class na implements mx {

    @NotNull
    public static final na INSTANCE = new na();

    static {
        int i10 = 94 - 1;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr = (byte[]) objArr[1];
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr;
    }

    @Override // com.mypinpad.tsdk.isolation.mx
    @NotNull
    public final byte[] setDividerPadding(@NotNull byte[] p4) {
        return (byte[]) setOnFocusChangeListener(new Object[]{this, p4}, -562511544, 562511544, System.identityHashCode(this));
    }
}
