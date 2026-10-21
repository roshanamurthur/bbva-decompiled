package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final class xf$2$setY implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Function0<Unit> f61816p0;

    public xf$2$setY() {
        throw null;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i10;
        if ((((~(i10 | i12)) | (~(i13 | i12)) | (~(i16 | i14))) * 959) + ((~(i11 | i10)) * (-959)) + ((i15 | (~(i16 | i12)) | (~(i14 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958)) == 1) {
            xf$2$setY xf_2_sety = (xf$2$setY) objArr[0];
            setDividerPadding(new Object[]{xf_2_sety}, 1643526706, -1643526706, System.identityHashCode(xf_2_sety));
            return Unit.INSTANCE;
        }
        xf$2$setY xf_2_sety2 = (xf$2$setY) objArr[0];
        vd vdVar = vd.INSTANCE;
        vd.setDividerPadding(new Object[]{new z00(xf_2_sety2.f61816p0)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Unit] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return setDividerPadding(new Object[]{this}, 1328654016, -1328654015, System.identityHashCode(this));
    }
}
