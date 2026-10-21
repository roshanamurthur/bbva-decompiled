package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes10.dex */
public final class bez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f54671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54672b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54673c = 1;

    public static class a implements PrivilegedAction<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54674a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54675b = 1;

        public static /* synthetic */ String a(Object[] objArr, int i10, int i11, int i12) {
            String strA;
            int i13 = ~i10;
            int i14 = ~i11;
            if ((((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317)) != 1) {
                int i15 = f54674a;
                int i16 = ((i15 ^ 14) + ((i15 & 14) << 1)) - 1;
                f54675b = i16 % 128;
                int i17 = i16 % 2;
                String property = System.getProperty("line.separator");
                int i18 = f54675b;
                int i19 = i18 & 87;
                int i20 = ((i18 ^ 87) | i19) << 1;
                int i21 = -((i18 | 87) & (~i19));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f54674a = i22 % 128;
                int i23 = i22 % 2;
                return property;
            }
            int i24 = f54674a;
            int i25 = (i24 & 17) + (i24 | 17);
            f54675b = i25 % 128;
            if (i25 % 2 == 0) {
                strA = a(new Object[0], 1767014260, -1767014260, (int) System.currentTimeMillis());
                int i26 = 23 / 0;
            } else {
                strA = a(new Object[0], 1767014260, -1767014260, (int) System.currentTimeMillis());
            }
            int i27 = f54675b;
            int i28 = (i27 & (-50)) | ((~i27) & 49);
            int i29 = (i27 & 49) << 1;
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f54674a = i30 % 128;
            int i31 = i30 % 2;
            return strA;
        }

        @Override // java.security.PrivilegedAction
        public final /* synthetic */ String run() {
            return a(new Object[]{this}, -551420426, 551420427, System.identityHashCode(this));
        }
    }

    static {
        try {
            try {
                f54671a = (String) AccessController.doPrivileged(new a());
                int i10 = f54672b;
                int i11 = i10 & 5;
                int i12 = (i11 - (~((i10 ^ 5) | i11))) - 1;
                f54673c = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            } catch (Exception unused) {
                f54671a = RootService.LINE_BREAK;
            }
        } catch (Exception unused2) {
            f54671a = String.format("%n", new Object[0]);
        }
    }

    public static String setCompoundDrawableTintBlendMode(byte[] bArr) {
        return (String) setX(new Object[]{bArr}, -288715044, 288715047, (int) System.currentTimeMillis());
    }

    public static String setDividerPadding(String str) {
        return (String) setX(new Object[]{str}, 2131988623, -2131988618, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0119 A[PHI: r11
      0x0119: PHI (r11v20 char) = (r11v19 char), (r11v21 char) binds: [B:22:0x0117, B:19:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0288 A[PHI: r8
      0x0288: PHI (r8v10 char) = (r8v6 char), (r8v23 char) binds: [B:45:0x0286, B:42:0x0281] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x028c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03b3, code lost:
    
        if (r0 >= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03cf, code lost:
    
        if (r0 >= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03d1, code lost:
    
        r1 = new java.lang.String(r3, r7, r0);
        r0 = com.mypinpad.tsdk.isolation.bez.f54672b;
        r2 = r0 & 23;
        r0 = (((r0 | 23) & (~r2)) - (~(r2 << 1))) - 1;
        com.mypinpad.tsdk.isolation.bez.f54673c = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x03e7, code lost:
    
        if ((r0 % 2) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03ed, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03f5, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid UTF-8 input");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setX(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bez.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static String setY() {
        return (String) setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
    }

    public static byte[] setY(String str) {
        return (byte[]) setX(new Object[]{str}, -491566229, 491566235, (int) System.currentTimeMillis());
    }

    public static String setX(byte[] bArr) {
        return (String) setX(new Object[]{bArr}, -1321203111, 1321203112, (int) System.currentTimeMillis());
    }

    public static String setX(String str) {
        return (String) setX(new Object[]{str}, -925397906, 925397910, (int) System.currentTimeMillis());
    }
}
