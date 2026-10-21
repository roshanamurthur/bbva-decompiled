package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class qb implements qq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public qx f57836a;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-667)) + (i10 * (-1335));
        int i14 = ~i11;
        int i15 = i10 | i12;
        if (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13 != 1) {
            return ((qb) objArr[0]).f57836a;
        }
        ((qb) objArr[0]).f57836a = (qx) objArr[1];
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.qq
    public final void setCompoundDrawableTintBlendMode(@Nullable qx qxVar) {
        setX(new Object[]{this, qxVar}, 2069762456, -2069762455, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.qq
    @Nullable
    public final qx setX() {
        return (qx) setX(new Object[]{this}, -1769842555, 1769842555, System.identityHashCode(this));
    }
}
