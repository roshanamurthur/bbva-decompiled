package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class bcb extends Provider {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String[] f54444p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54445q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54446r0 = 1;

    public class a implements PrivilegedAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54447b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f54448c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ bcb f54449a;

        @Override // java.security.PrivilegedAction
        public final Object run() {
            System.identityHashCode(this);
            a aVar = (a) new Object[]{this}[0];
            int i10 = f54447b;
            int i11 = i10 & 63;
            int i12 = ((i10 | 63) & (~i11)) + (i11 << 1);
            f54448c = i12 % 128;
            int i13 = i12 % 2;
            bcb.setX(new Object[]{aVar.f54449a}, 1705851948, -1705851945, (int) System.currentTimeMillis());
            int i14 = f54448c;
            int i15 = i14 & 81;
            int i16 = i15 + ((i14 ^ 81) | i15);
            f54447b = i16 % 128;
            if (i16 % 2 == 0) {
                return null;
            }
            int i17 = 36 / 0;
            return null;
        }
    }

    static {
        new HashMap();
        f54444p0 = new String[]{"SPHINCS", "LMS", "NH", "XMSS", "SPHINCSPlus", "CMCE", "Frodo", "SABER", "Picnic", "NTRU", "Falcon", "Kyber", "Dilithium", "NTRUPrime", "BIKE", "HQC", "Rainbow"};
        int i10 = f54445q0 + 85;
        f54446r0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public bcb() {
        super("BCPQC", 1.75d, "BouncyCastle Post-Quantum Security Provider v1.75");
        a aVar = new a();
        aVar.f54449a = this;
        AccessController.doPrivileged(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054 A[Catch: ClassNotFoundException -> 0x01db, PHI: r8
      0x0054: PHI (r8v33 java.lang.ClassLoader) = (r8v32 java.lang.ClassLoader), (r8v41 java.lang.ClassLoader) binds: [B:17:0x0052, B:12:0x0049] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {ClassNotFoundException -> 0x01db, blocks: (B:10:0x0044, B:11:0x0048, B:23:0x0067, B:18:0x0054, B:16:0x004e), top: B:55:0x0042 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[Catch: ClassNotFoundException -> 0x01db, TRY_ENTER, TRY_LEAVE, TryCatch #2 {ClassNotFoundException -> 0x01db, blocks: (B:10:0x0044, B:11:0x0048, B:23:0x0067, B:18:0x0054, B:16:0x004e), top: B:55:0x0042 }] */
    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        ClassLoader classLoader;
        Class<?> clsLoadClass;
        int i13;
        int i14 = ~i12;
        int i15 = (~i10) | i14;
        int i16 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i15))) * 369) + (((~i15) | i11) * (-369)) + ((i10 | i11 | i14) * (-369)) + (i11 * 370) + (i10 * 370);
        if (i16 == 1) {
            String str = (String) objArr[0];
            String[] strArr = (String[]) objArr[1];
            int i17 = f54446r0;
            int i18 = (-2) - (((i17 ^ 116) + ((i17 & 116) << 1)) ^ (-1));
            f54445q0 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((((i17 ^ 99) | (i17 & 99)) << 1) - (~(-(((~i17) & 99) | (i17 & (-100)))))) - 1;
            f54445q0 = i20 % 128;
            int i21 = i20 % 2;
            int i22 = 0;
            while (i22 != strArr.length) {
                StringBuilder sbD = c.d(str);
                sbD.append(strArr[i22]);
                sbD.append("$Mappings");
                Class cls = (Class) setX(new Object[]{bcb.class, sbD.toString()}, 473497356, -473497356, (int) System.currentTimeMillis());
                if (cls != null) {
                    int i23 = f54445q0;
                    int i24 = i23 & 85;
                    int i25 = -(-((i23 ^ 85) | i24));
                    int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                    f54446r0 = i26 % 128;
                    int i27 = i26 % 2;
                    try {
                        int i28 = f54446r0;
                        int i29 = (((i28 & (-52)) | ((~i28) & 51)) - (~((i28 & 51) << 1))) - 1;
                        f54445q0 = i29 % 128;
                        int i30 = i29 % 2;
                    } catch (Exception e5) {
                        StringBuilder sb2 = new StringBuilder("cannot create instance of ");
                        sb2.append(str);
                        sb2.append(strArr[i22]);
                        sb2.append("$Mappings : ");
                        sb2.append(e5);
                        throw new InternalError(sb2.toString());
                    }
                }
                i22 = ((i22 & 1) << 1) + (i22 ^ 1);
                int i31 = f54445q0;
                int i32 = i31 & 43;
                int i33 = -(-((i31 ^ 43) | i32));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f54446r0 = i34 % 128;
                int i35 = i34 % 2;
            }
            int i36 = f54446r0;
            int i37 = i36 & 47;
            int i38 = (i36 ^ 47) | i37;
            int i39 = (i37 & i38) + (i38 | i37);
            f54445q0 = i39 % 128;
            if (i39 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i16 == 2) {
            int i40 = f54446r0;
            int i41 = i40 & 61;
            int i42 = (i41 - (~((i40 ^ 61) | i41))) - 1;
            f54445q0 = i42 % 128;
            int i43 = i42 % 2;
            setX(new Object[]{"org.bouncycastle.pqc.jcajce.provider.", f54444p0}, 282405188, -282405187, (int) System.currentTimeMillis());
            int i44 = f54446r0;
            int i45 = (i44 & 17) + (i44 | 17);
            f54445q0 = i45 % 128;
            int i46 = i45 % 2;
            return null;
        }
        if (i16 == 3) {
            bcb bcbVar = (bcb) objArr[0];
            int i47 = f54445q0;
            int i48 = ((i47 | 111) << 1) - (i47 ^ 111);
            f54446r0 = i48 % 128;
            if (i48 % 2 == 0) {
                setX(new Object[]{bcbVar}, -89982539, 89982541, System.identityHashCode(bcbVar));
                int i49 = 86 / 0;
            } else {
                setX(new Object[]{bcbVar}, -89982539, 89982541, System.identityHashCode(bcbVar));
            }
            int i50 = f54445q0;
            int i51 = i50 & 85;
            int i52 = (((i50 ^ 85) | i51) << 1) - ((i50 | 85) & (~i51));
            f54446r0 = i52 % 128;
            if (i52 % 2 != 0) {
                return null;
            }
            throw null;
        }
        Class cls2 = (Class) objArr[0];
        String str2 = (String) objArr[1];
        int i53 = f54446r0;
        int i54 = i53 & 1;
        int i55 = (i54 - (~((i53 ^ 1) | i54))) - 1;
        f54445q0 = i55 % 128;
        try {
            if (i55 % 2 != 0) {
                classLoader = cls2.getClassLoader();
                int i56 = 61 / 0;
                if (classLoader != null) {
                    clsLoadClass = classLoader.loadClass(str2);
                    i13 = f54446r0 + 3;
                    f54445q0 = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    h3 h3Var = new h3();
                    h3Var.f56136a = str2;
                    clsLoadClass = (Class) AccessController.doPrivileged(h3Var);
                    int i57 = f54446r0 + 123;
                    f54445q0 = i57 % 128;
                    int i58 = i57 % 2;
                }
            } else {
                classLoader = cls2.getClassLoader();
                if (classLoader != null) {
                    clsLoadClass = classLoader.loadClass(str2);
                    i13 = f54446r0 + 3;
                    f54445q0 = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                } else {
                    h3 h3Var2 = new h3();
                    h3Var2.f56136a = str2;
                    clsLoadClass = (Class) AccessController.doPrivileged(h3Var2);
                    int i59 = f54446r0 + 123;
                    f54445q0 = i59 % 128;
                    int i510 = i59 % 2;
                }
            }
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
