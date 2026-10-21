package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class o1 implements apo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57385c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57386d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f57387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ apl f57388b;

    /* JADX WARN: Code duplicated, block: B:34:0x0152  */
    /* JADX WARN: Code duplicated, block: B:37:0x0166  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e  */
    /* JADX WARN: Code duplicated, block: B:41:0x017f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0196  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d8  */
    @Override // com.mypinpad.tsdk.isolation.apo
    public final apu setOnFocusChangeListener(apu apuVar) {
        q1 q1Var;
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        Object[] objArr2 = {this, apuVar};
        System.identityHashCode(this);
        o1 o1Var = (o1) objArr2[0];
        apu apuVar2 = (apu) objArr2[1];
        int i13 = f57386d;
        int i14 = i13 & 85;
        int i15 = -(-((i13 ^ 85) | i14));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        int i17 = i16 % 128;
        f57385c = i17;
        if (i16 % 2 != 0) {
            boolean z10 = apuVar2 instanceof q1;
            throw null;
        }
        if (!(apuVar2 instanceof q1)) {
            int i18 = (-2) - ((((i17 | 122) << 1) - (i17 ^ 122)) ^ (-1));
            f57386d = i18 % 128;
            int i19 = i18 % 2;
            q1Var = null;
        } else {
            q1Var = (q1) apuVar2;
            int i20 = i13 & 93;
            int i21 = (i20 - (~((i13 ^ 93) | i20))) - 1;
            f57385c = i21 % 128;
            int i22 = i21 % 2;
        }
        if (q1Var == null) {
            q1Var = new q1();
            int i23 = f57386d;
            int i24 = i23 & 27;
            int i25 = (i24 - (~((i23 ^ 27) | i24))) - 1;
            f57385c = i25 % 128;
            int i26 = i25 % 2;
        }
        if (!q1.a(new Object[]{q1Var}, -1556613181, 1556613185, System.identityHashCode(q1Var)).booleanValue()) {
            if (!q1.a(new Object[]{q1Var}, -837635880, 837635885, System.identityHashCode(q1Var)).booleanValue()) {
                int i27 = f57385c;
                int i28 = i27 ^ 21;
                int i29 = ((((i27 & 21) | i28) << 1) - (~(-i28))) - 1;
                int i30 = i29 % 128;
                f57386d = i30;
                int i31 = i29 % 2;
                if (!o1Var.f57387a) {
                    int i32 = i30 & 1;
                    int i33 = i32 + ((i30 ^ 1) | i32);
                    f57385c = i33 % 128;
                    int i34 = i33 % 2;
                    apl aplVar = o1Var.f57388b;
                    if (i34 != 0) {
                        aplVar.setDividerPadding();
                        throw null;
                    }
                    if (!aplVar.setDividerPadding()) {
                        int i35 = f57386d;
                        int i36 = i35 & 113;
                        int i37 = (i35 ^ 113) | i36;
                        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                        f57385c = i38 % 128;
                        Object[] objArr3 = new Object[1];
                        if (i38 % 2 != 0) {
                            objArr3[0] = q1Var;
                            q1.a(objArr3, 1902410304, -1902410302, System.identityHashCode(q1Var));
                            int i39 = 49 / 0;
                        } else {
                            objArr3[0] = q1Var;
                            q1.a(objArr3, 1902410304, -1902410302, System.identityHashCode(q1Var));
                        }
                    }
                }
                q1.a(new Object[]{q1Var}, 831608358, -831608357, System.identityHashCode(q1Var));
                int i40 = f57386d + 13;
                f57385c = i40 % 128;
                int i41 = i40 % 2;
                o1Var.getClass();
                int i42 = f57386d;
                int i43 = i42 & 97;
                int i44 = -(-((i42 ^ 97) | i43));
                i10 = ((i43 | i44) << 1) - (i44 ^ i43);
                f57385c = i10 % 128;
                if (i10 % 2 == 0) {
                    q1.a(new Object[]{q1Var}, 400062448, -400062445, System.identityHashCode(q1Var)).booleanValue();
                    throw null;
                }
                if (!q1.a(new Object[]{q1Var}, 400062448, -400062445, System.identityHashCode(q1Var)).booleanValue()) {
                    if (!o1Var.f57388b.setY()) {
                        int i45 = f57385c;
                        i11 = ((i45 | 41) << 1) - (i45 ^ 41);
                        f57386d = i11 % 128;
                        objArr = new Object[1];
                        if (i11 % 2 != 0) {
                            objArr[0] = q1Var;
                            q1.a(objArr, 1902410304, -1902410302, System.identityHashCode(q1Var));
                            throw null;
                        }
                        objArr[0] = q1Var;
                        q1.a(objArr, 1902410304, -1902410302, System.identityHashCode(q1Var));
                        int i46 = f57385c;
                        int i47 = i46 ^ 113;
                        i12 = ((((i46 & 113) | i47) << 1) - (~(-i47))) - 1;
                    } else {
                        q1.a(new Object[]{q1Var}, 64457369, -64457369, System.identityHashCode(q1Var));
                        int i48 = f57386d;
                        int i49 = i48 & 27;
                        int i50 = -(-(i48 | 27));
                        int i51 = (i49 & i50) + (i50 | i49);
                        f57385c = i51 % 128;
                        int i52 = i51 % 2;
                    }
                }
                int i53 = f57385c;
                int i54 = (((i53 ^ 79) | (i53 & 79)) << 1) - (((~i53) & 79) | (i53 & (-80)));
                f57386d = i54 % 128;
                int i55 = i54 % 2;
            } else {
                o1Var.getClass();
                int i410 = f57386d;
                int i411 = i410 & 97;
                int i412 = -(-((i410 ^ 97) | i411));
                i10 = ((i411 | i412) << 1) - (i412 ^ i411);
                f57385c = i10 % 128;
                if (i10 % 2 == 0) {
                    q1.a(new Object[]{q1Var}, 400062448, -400062445, System.identityHashCode(q1Var)).booleanValue();
                    throw null;
                }
                if (!q1.a(new Object[]{q1Var}, 400062448, -400062445, System.identityHashCode(q1Var)).booleanValue()) {
                    if (!o1Var.f57388b.setY()) {
                        int i413 = f57385c;
                        i11 = ((i413 | 41) << 1) - (i413 ^ 41);
                        f57386d = i11 % 128;
                        objArr = new Object[1];
                        if (i11 % 2 != 0) {
                            objArr[0] = q1Var;
                            q1.a(objArr, 1902410304, -1902410302, System.identityHashCode(q1Var));
                            throw null;
                        }
                        objArr[0] = q1Var;
                        q1.a(objArr, 1902410304, -1902410302, System.identityHashCode(q1Var));
                        int i414 = f57385c;
                        int i415 = i414 ^ 113;
                        i12 = ((((i414 & 113) | i415) << 1) - (~(-i415))) - 1;
                    } else {
                        q1.a(new Object[]{q1Var}, 64457369, -64457369, System.identityHashCode(q1Var));
                        int i416 = f57386d;
                        int i417 = i416 & 27;
                        int i56 = -(-(i416 | 27));
                        int i57 = (i417 & i56) + (i56 | i417);
                        f57385c = i57 % 128;
                        int i58 = i57 % 2;
                    }
                }
                int i59 = f57385c;
                int i510 = (((i59 ^ 79) | (i59 & 79)) << 1) - (((~i59) & 79) | (i59 & (-80)));
                f57386d = i510 % 128;
                int i511 = i510 % 2;
            }
            return q1Var;
        }
        int i60 = f57385c;
        int i61 = i60 & 45;
        int i62 = ((i60 ^ 45) | i61) << 1;
        int i63 = -((~i61) & (i60 | 45));
        int i64 = ((i62 | i63) << 1) - (i62 ^ i63);
        f57386d = i64 % 128;
        if (i64 % 2 == 0) {
            throw null;
        }
        i12 = i60 + 13;
        f57386d = i12 % 128;
        int i65 = i12 % 2;
        return q1Var;
    }
}
