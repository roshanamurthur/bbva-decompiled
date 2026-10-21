package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class amh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f53200a;

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        if ((((~(i10 | i15)) | (~(i11 | i14))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i13 | (~(i14 | i15))) * 1324) + (i11 * (-661)) + (i10 * (-661)) != 1) {
            ans ansVar = new ans(((amh) objArr[0]).f53200a);
            return new akj((anx) ans.setX(new Object[]{ansVar}, -1977001129, 1977001130, System.identityHashCode(ansVar)), ansVar);
        }
        amh amhVar = (amh) objArr[0];
        akw akwVar = (akw) objArr[1];
        amhVar.f53200a = (SecureRandom) akw.setY(new Object[]{akwVar}, 2046373563, -2046373563, System.identityHashCode(akwVar));
        new alo("X25519KeyGen", 128, null, akp.setOnFocusChangeListener);
        aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
        return null;
    }

    public final void setX(akw akwVar) {
        setDividerPadding(new Object[]{this, akwVar}, -1054919499, 1054919500, System.identityHashCode(this));
    }

    public final akj setY() {
        return (akj) setDividerPadding(new Object[]{this}, 1844319316, -1844319316, System.identityHashCode(this));
    }
}
