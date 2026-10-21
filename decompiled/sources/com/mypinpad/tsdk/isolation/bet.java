package com.mypinpad.tsdk.isolation;

import java.security.PrivilegedAction;
import java.security.Security;

/* JADX INFO: loaded from: classes10.dex */
public final class bet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f54654a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54655b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54656c = 1;

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54657b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f54658c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f54659a;

        @Override // java.security.PrivilegedAction
        public final Object run() {
            System.identityHashCode(this);
            a aVar = (a) new Object[]{this}[0];
            int i10 = f54657b;
            int i11 = (i10 & (-100)) | ((~i10) & 99);
            int i12 = -(-((i10 & 99) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f54658c = i13 % 128;
            int i14 = i13 % 2;
            String property = System.getProperty(aVar.f54659a);
            if (i14 == 0) {
                int i15 = 12 / 0;
            }
            int i16 = f54658c;
            int i17 = ((i16 | 33) << 1) - (i16 ^ 33);
            f54657b = i17 % 128;
            int i18 = i17 % 2;
            return property;
        }
    }

    public static class b implements PrivilegedAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54660b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f54661c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f54662a;

        @Override // java.security.PrivilegedAction
        public final Object run() {
            System.identityHashCode(this);
            b bVar = (b) new Object[]{this}[0];
            int i10 = f54660b;
            int i11 = ((i10 | 23) << 1) - (i10 ^ 23);
            f54661c = i11 % 128;
            int i12 = i11 % 2;
            String property = Security.getProperty(bVar.f54662a);
            if (i12 == 0) {
                int i13 = 8 / 0;
            }
            int i14 = f54661c;
            int i15 = i14 | 25;
            int i16 = ((i15 << 1) - (~(-((~(i14 & 25)) & i15)))) - 1;
            f54660b = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 5 / 0;
            }
            return property;
        }
    }

    static {
        int i10 = f54655b;
        int i11 = ((i10 | 50) << 1) - (i10 ^ 50);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f54656c = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0494  */
    /* JADX WARN: Code duplicated, block: B:102:0x0498  */
    /* JADX WARN: Code duplicated, block: B:104:0x049a  */
    /* JADX WARN: Code duplicated, block: B:107:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:121:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:123:0x050a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0512  */
    /* JADX WARN: Code duplicated, block: B:127:0x052c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0535  */
    /* JADX WARN: Code duplicated, block: B:133:0x053e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0547  */
    /* JADX WARN: Code duplicated, block: B:138:0x055a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0562  */
    /* JADX WARN: Code duplicated, block: B:147:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0401  */
    /* JADX WARN: Code duplicated, block: B:74:0x0412  */
    /* JADX WARN: Code duplicated, block: B:76:0x041a  */
    /* JADX WARN: Code duplicated, block: B:78:0x042e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0436  */
    /* JADX WARN: Code duplicated, block: B:81:0x0438  */
    /* JADX WARN: Code duplicated, block: B:86:0x0447  */
    /* JADX WARN: Code duplicated, block: B:88:0x0459  */
    /* JADX WARN: Code duplicated, block: B:91:0x0463  */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x057b, code lost:
    
        if (r0.charAt(4) == 'E') goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bet.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static boolean setDividerPadding(String str, boolean z10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{str, Boolean.valueOf(z10)}, -1393729344, 1393729344, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setX(String str, int i10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{str, Integer.valueOf(i10)}, 1567609481, -1567609476, i10)).intValue();
    }

    public static String setY(String str) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{str}, -1392453576, 1392453580, (int) System.currentTimeMillis());
    }

    public static boolean setCompoundDrawableTintBlendMode(String str) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{str}, 1196176667, -1196176666, (int) System.currentTimeMillis())).booleanValue();
    }
}
