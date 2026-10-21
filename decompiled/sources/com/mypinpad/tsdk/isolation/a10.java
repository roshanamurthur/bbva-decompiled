package com.mypinpad.tsdk.isolation;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class a10 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f51978q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f51979r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ xf f51980p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(xf xfVar) {
        super(0);
        this.f51980p0 = xfVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00b9  */
    public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Unit unit;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i10 | i11)) | (~(i13 | i15))) * 564) + ((~(i12 | i13 | i11)) * 1128) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563)) == 1) {
            a10 a10Var = (a10) objArr[0];
            int i16 = f51978q0;
            int i17 = i16 ^ 75;
            int i18 = (i16 & 75) << 1;
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f51979r0 = i19 % 128;
            Object[] objArr2 = new Object[1];
            if (i19 % 2 == 0) {
                objArr2[0] = a10Var;
                a(objArr2, 1513963566, -1513963566, System.identityHashCode(a10Var));
                unit = Unit.INSTANCE;
                int i20 = 19 / 0;
            } else {
                objArr2[0] = a10Var;
                a(objArr2, 1513963566, -1513963566, System.identityHashCode(a10Var));
                unit = Unit.INSTANCE;
            }
            int i21 = f51979r0;
            int i22 = i21 & 29;
            int i23 = i22 + ((i21 ^ 29) | i22);
            f51978q0 = i23 % 128;
            if (i23 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        a10 a10Var2 = (a10) objArr[0];
        int i24 = (-2) - ((f51979r0 + 74) ^ (-1));
        f51978q0 = i24 % 128;
        int i25 = i24 % 2;
        ((AtomicBoolean) xf.setCompoundDrawableTintBlendMode(new Object[]{a10Var2.f51980p0}, 193149737, -193149736, (int) System.currentTimeMillis())).set(true);
        xf xfVar = a10Var2.f51980p0;
        WeakReference weakReference = (WeakReference) xf.setCompoundDrawableTintBlendMode(new Object[]{xfVar}, -1685641773, 1685641775, (int) System.currentTimeMillis());
        if (weakReference != null) {
            int i26 = f51979r0 + 41;
            f51978q0 = i26 % 128;
            if (i26 % 2 != 0) {
                throw null;
            }
            xc xcVar = (xc) weakReference.get();
            if (xcVar != null) {
                int i27 = f51979r0;
                int i28 = i27 & 51;
                int i29 = (((i27 | 51) & (~i28)) - (~(i28 << 1))) - 1;
                f51978q0 = i29 % 128;
                if (i29 % 2 != 0) {
                    xc.setX(new Object[]{xcVar}, 1784869663, -1784869657, System.identityHashCode(xcVar));
                    int i30 = 62 / 0;
                } else {
                    xc.setX(new Object[]{xcVar}, 1784869663, -1784869657, System.identityHashCode(xcVar));
                }
            } else {
                int i31 = f51979r0;
                int i32 = i31 & 67;
                int i33 = (i32 - (~(-(-((i31 ^ 67) | i32))))) - 1;
                f51978q0 = i33 % 128;
                int i34 = i33 % 2;
            }
        } else {
            int i35 = f51979r0;
            int i36 = i35 & 67;
            int i37 = (i36 - (~(-(-((i35 ^ 67) | i36))))) - 1;
            f51978q0 = i37 % 128;
            int i38 = i37 % 2;
        }
        xf.setCompoundDrawableTintBlendMode(new Object[]{xfVar, null}, -72641444, 72641444, (int) System.currentTimeMillis());
        int i39 = f51978q0 + 33;
        f51979r0 = i39 % 128;
        int i40 = i39 % 2;
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return a(new Object[]{this}, -192627161, 192627162, System.identityHashCode(this));
    }
}
