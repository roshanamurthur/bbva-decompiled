package com.mypinpad.tsdk.isolation;

import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class any {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53363a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53364b = 1;

    public static class a {
    }

    public static class b {
    }

    public static class c {
    }

    public static class d {
    }

    public static class e {
    }

    public static class f {
    }

    public static class g {
    }

    public static class h {
    }

    public static class i {
    }

    public static class j {
    }

    public static class k {
    }

    public static class l {
    }

    static {
        HashMap map = new HashMap();
        map.put(((aky) setX(new Object[0], -398026687, 398026689, (int) System.currentTimeMillis())).setX(), new e());
        map.put(((aky) setX(new Object[0], -1399732116, 1399732119, (int) System.currentTimeMillis())).setX(), new f());
        map.put(((aky) setX(new Object[0], 1812294717, -1812294709, (int) System.currentTimeMillis())).setX(), new i());
        map.put(((aky) setX(new Object[0], -2105153225, 2105153234, (int) System.currentTimeMillis())).setX(), new a());
        map.put(((aky) setX(new Object[0], -1343443136, 1343443142, (int) System.currentTimeMillis())).setX(), new l());
        map.put(((aky) setX(new Object[0], -1799885678, 1799885688, (int) System.currentTimeMillis())).setX(), new j());
        map.put(((aky) setX(new Object[0], -1749926050, 1749926057, (int) System.currentTimeMillis())).setX(), new k());
        map.put(((aky) setX(new Object[0], 600776450, -600776445, (int) System.currentTimeMillis())).setX(), new b());
        map.put(((aky) setX(new Object[0], 846870902, -846870891, (int) System.currentTimeMillis())).setX(), new c());
        map.put(((aky) setX(new Object[0], 681252122, -681252118, (int) System.currentTimeMillis())).setX(), new g());
        map.put(((aky) setX(new Object[0], 282043307, -282043306, (int) System.currentTimeMillis())).setX(), new d());
        map.put(((aky) setX(new Object[0], -1304633678, 1304633678, (int) System.currentTimeMillis())).setX(), new h());
        int i10 = f53363a;
        int i11 = (i10 & (-20)) | ((~i10) & 19);
        int i12 = -(-((i10 & 19) << 1));
        int i13 = (i11 & i12) + (i12 | i11);
        f53364b = i13 % 128;
        int i14 = i13 % 2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        switch (((i13 | (~(i12 | (~i10))) | (~(i10 | i14))) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46)) {
            case 1:
                alx alxVar = new alx(128);
                int i15 = f53364b;
                int i16 = (((i15 ^ 97) | (i15 & 97)) << 1) - (((~i15) & 97) | (i15 & (-98)));
                f53363a = i16 % 128;
                int i17 = i16 % 2;
                return alxVar;
            case 2:
                alt altVar = new alt();
                int i18 = f53363a;
                int i19 = i18 & 45;
                int i20 = -(-(i18 | 45));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f53364b = i21 % 128;
                int i22 = i21 % 2;
                return altVar;
            case 3:
                als alsVar = new als();
                int i23 = f53363a + 79;
                f53364b = i23 % 128;
                if (i23 % 2 != 0) {
                    return alsVar;
                }
                throw null;
            case 4:
                alu aluVar = new alu(512);
                int i24 = f53363a;
                int i25 = (i24 & (-56)) | ((~i24) & 55);
                int i26 = -(-((i24 & 55) << 1));
                int i27 = (i25 & i26) + (i26 | i25);
                f53364b = i27 % 128;
                int i28 = i27 % 2;
                return aluVar;
            case 5:
                alu aluVar2 = new alu(256);
                int i29 = f53364b + 99;
                f53363a = i29 % 128;
                int i30 = i29 % 2;
                return aluVar2;
            case 6:
                aly alyVar = new aly();
                int i31 = f53363a;
                int i32 = i31 & 97;
                int i33 = i32 + ((i31 ^ 97) | i32);
                f53364b = i33 % 128;
                if (i33 % 2 != 0) {
                    return alyVar;
                }
                throw null;
            case 7:
                alu aluVar3 = new alu(224);
                int i34 = f53364b;
                int i35 = i34 ^ 97;
                int i36 = (i34 & 97) << 1;
                int i37 = (i35 & i36) + (i36 | i35);
                f53363a = i37 % 128;
                if (i37 % 2 == 0) {
                    return aluVar3;
                }
                int i38 = 30 / 0;
                return aluVar3;
            case 8:
                alr alrVar = new alr();
                int i39 = f53363a;
                int i40 = (i39 ^ 5) + ((i39 & 5) << 1);
                f53364b = i40 % 128;
                if (i40 % 2 != 0) {
                    return alrVar;
                }
                int i41 = 81 / 0;
                return alrVar;
            case 9:
                int i42 = f53364b;
                int i43 = i42 ^ 43;
                int i44 = (((i42 & 43) | i43) << 1) - i43;
                f53363a = i44 % 128;
                int i45 = i44 % 2;
                ale navBarTitleString = alp.getNavBarTitleString();
                int i46 = f53364b;
                int i47 = i46 ^ 93;
                int i48 = -(-((i46 & 93) << 1));
                int i49 = (i47 & i48) + (i48 | i47);
                f53363a = i49 % 128;
                if (i49 % 2 == 0) {
                    return navBarTitleString;
                }
                throw null;
            case 10:
                alw alwVar = new alw();
                int i50 = f53364b;
                int i51 = ((((i50 ^ 97) | (i50 & 97)) << 1) - (~(-(((~i50) & 97) | (i50 & (-98)))))) - 1;
                f53363a = i51 % 128;
                int i52 = i51 % 2;
                return alwVar;
            case 11:
                alu aluVar4 = new alu(BluetoothState.REQUEST_CONNECT_DEVICE);
                int i53 = f53363a;
                int i54 = ((i53 | 35) << 1) - (i53 ^ 35);
                f53364b = i54 % 128;
                if (i54 % 2 != 0) {
                    return aluVar4;
                }
                int i55 = 8 / 0;
                return aluVar4;
            default:
                alx alxVar2 = new alx(256);
                int i56 = f53363a;
                int i57 = i56 & 1;
                int i58 = (i56 | 1) & (~i57);
                int i59 = -(-(i57 << 1));
                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                f53364b = i60 % 128;
                if (i60 % 2 != 0) {
                    return alxVar2;
                }
                throw null;
        }
    }

    public static aky setY() {
        return (aky) setX(new Object[0], -2105153225, 2105153234, (int) System.currentTimeMillis());
    }
}
