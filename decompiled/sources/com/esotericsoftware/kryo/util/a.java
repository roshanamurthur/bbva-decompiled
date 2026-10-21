package com.esotericsoftware.kryo.util;

import com.mypinpad.tsdk.isolation.ca;
import com.mypinpad.tsdk.isolation.gk;
import java.lang.ref.SoftReference;
import java.util.function.Predicate;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40059a;

    public /* synthetic */ a(int i10) {
        this.f40059a = i10;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f40059a) {
            case 0:
                return ((SoftReference) obj).get() == null;
            default:
                return ((Boolean) gk.setY(new Object[]{(ca) obj}, -736417647, 736417649, (int) System.currentTimeMillis())).booleanValue();
        }
    }
}
