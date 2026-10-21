package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public class ayt extends amw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ayu f54174r0;

    public ayt(boolean z10, ayu ayuVar) {
        super(z10);
        this.f54174r0 = ayuVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((ayt) objArr[0]).f54174r0;
    }

    public final ayu setOnFocusChangeListener() {
        return (ayu) setCompoundDrawableTintBlendMode(new Object[]{this}, -1360106660, 1360106660, System.identityHashCode(this));
    }
}
