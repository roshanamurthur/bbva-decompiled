package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/nz;", "Lcom/mypinpad/tsdk/i/no;", "", "p0", "", "setX", "([B)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class nz implements no {

    @NotNull
    public static final nz INSTANCE = new nz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57377b = 1;

    static {
        int i10 = f57377b;
        int i11 = i10 ^ 11;
        int i12 = -(-((i10 & 11) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f57376a = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr = (byte[]) objArr[1];
        int i13 = f57376a;
        int i14 = ((i13 & 58) + (i13 | 58)) - 1;
        f57377b = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            ss ssVar = ss.setCompoundDrawableTintBlendMode;
            int length = bArr.length;
            ArraysKt___ArraysJvmKt.copyInto$default((byte[]) ss.setX(new Object[]{Integer.valueOf(length)}, 1397235306, -1397235297, length), bArr, 0, 1, 0, 2, (Object) null);
            return null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        ss ssVar2 = ss.setCompoundDrawableTintBlendMode;
        int length2 = bArr.length;
        ArraysKt___ArraysJvmKt.copyInto$default((byte[]) ss.setX(new Object[]{Integer.valueOf(length2)}, 1397235306, -1397235297, length2), bArr, 0, 0, 0, 14, (Object) null);
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.no
    public final void setX(@NotNull byte[] p4) {
        setY(new Object[]{this, p4}, -1274132526, 1274132526, System.identityHashCode(this));
    }
}
