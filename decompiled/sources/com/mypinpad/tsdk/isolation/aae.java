package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/aae;", "", "", "p0", "", "p1", "p2", "p3", "p4", "", "setY", "(ZIIII)Ljava/lang/String;", "setDividerPadding", "(I)Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/abw;", "Lcom/mypinpad/tsdk/i/abw;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
public final class aae {

    @NotNull
    public static final aae INSTANCE = new aae();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String[] f52021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String[] f52022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[] f52023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52024d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52025e = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final abw setCompoundDrawableTintBlendMode;

    /* JADX WARN: Code duplicated, block: B:26:0x0272 A[PHI: r4
      0x0272: PHI (r4v21 int) = (r4v19 int), (r4v29 int) binds: [B:25:0x0270, B:21:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i10;
        abw.Companion companion = abw.INSTANCE;
        int i11 = 0;
        setCompoundDrawableTintBlendMode = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        f52021a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f52022b = new String[64];
        String[] strArr = new String[256];
        int i12 = f52025e;
        int i13 = (((i12 | 56) << 1) - (i12 ^ 56)) - 1;
        f52024d = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i15 < 256) {
            int i16 = f52024d;
            int i17 = ((-1) << 1) - (((i16 & 34) + (i16 | 34)) ^ (-1));
            f52025e = i17 % 128;
            int i18 = i17 % 2;
            String binaryString = Integer.toBinaryString(i15);
            Intrinsics.checkNotNullExpressionValue(binaryString, "");
            strArr[i15] = l.replace$default(yt.setOnFocusChangeListener("%8s", binaryString), ' ', '0', false, 4, (Object) null);
            System.currentTimeMillis();
            int i19 = -(-(i15 * 825));
            int i20 = ((1649 | i19) << 1) - (i19 ^ 1649);
            int i21 = ~i15;
            int i22 = -(-(((i21 & 1) | (i21 ^ 1)) * (-824)));
            int i23 = (i20 & i22) + (i22 | i20);
            int i24 = ~i15;
            int i25 = (i23 - (~((((i24 & 1) | (i15 & (-2))) | (i15 & 1)) * (-1648)))) - 1;
            int i26 = (i15 | i24) & (~i15);
            int i27 = ((~i26) & (-2)) | (i26 & 1);
            int i28 = i26 & (-2);
            int i29 = ((i28 & i27) | (i27 ^ i28)) * 824;
            int i30 = i25 & i29;
            int i31 = ((i25 ^ i29) | i30) << 1;
            int i32 = -((i29 | i25) & (~i30));
            i15 = (i32 | i31) + (i31 & i32);
            int i33 = f52025e;
            int i34 = i33 & 101;
            int i35 = ((i33 ^ 101) | i34) << 1;
            int i36 = -((i33 | 101) & (~i34));
            int i37 = (i35 & i36) + (i36 | i35);
            f52024d = i37 % 128;
            int i38 = i37 % 2;
        }
        f52023c = strArr;
        String[] strArr2 = f52022b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i39 = f52025e;
        int i40 = (i39 ^ 47) + ((i39 & 47) << 1);
        f52024d = i40 % 128;
        int i41 = i40 % 2;
        int i42 = 0;
        while (i42 <= 0) {
            int i43 = f52024d;
            int i44 = i43 & 5;
            int i45 = ((((i43 ^ 5) | i44) << 1) - (~(-((i43 | 5) & (~i44))))) - 1;
            f52025e = i45 % 128;
            int i46 = i45 % 2;
            int i47 = iArr[0];
            int i48 = (i42 ^ 127) + ((i42 & 127) << 1);
            i42 = (i48 & (-126)) + (i48 | (-126));
            String[] strArr3 = f52022b;
            int i49 = (i47 & (-9)) | ((~i47) & 8);
            int i50 = i47 & 8;
            strArr3[(i49 & i50) | (i49 ^ i50)] = Intrinsics.stringPlus(strArr3[i47], "|PADDED");
            int i51 = f52024d;
            int i52 = i51 | 53;
            int i53 = ((i52 << 1) - (~(-((~(i51 & 53)) & i52)))) - 1;
            f52025e = i53 % 128;
            int i54 = i53 % 2;
        }
        String[] strArr4 = f52022b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i55 = f52024d + 19;
        f52025e = i55 % 128;
        int i56 = i55 % 2;
        int i57 = 0;
        while (i57 < 3) {
            int i58 = f52024d + 38;
            int i59 = (i58 ^ (-1)) + (i58 << 1);
            int i60 = i59 % 128;
            f52025e = i60;
            int i61 = i59 % 2;
            int i62 = iArr2[i57];
            int i63 = i57 & (-106);
            int i64 = (i57 | (-106)) & (~i63);
            int i65 = i63 << 1;
            int i66 = (i64 & i65) + (i64 | i65);
            int i67 = i66 | 107;
            int i68 = i67 << 1;
            int i69 = -(i67 & (~(i66 & 107)));
            i57 = ((i69 & i68) << 1) + (i68 ^ i69);
            int i70 = i60 + 103;
            f52024d = i70 % 128;
            int i71 = i70 % 2;
            int i72 = i11;
            while (i72 <= 0) {
                int i73 = iArr[i72];
                i72++;
                String[] strArr5 = f52022b;
                int i74 = ((~i62) & i73) | ((~i73) & i62);
                int i75 = i73 & i62;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) strArr5[i73]);
                sb2.append('|');
                sb2.append((Object) strArr5[i62]);
                strArr5[(i74 ^ i75) | (i74 & i75)] = sb2.toString();
                int i76 = i74 | i75;
                int i77 = i76 & 8;
                int i78 = (i76 | 8) & (~i77);
                int i79 = (i78 & i77) | (i78 ^ i77);
                StringBuilder sb3 = new StringBuilder();
                sb3.append((Object) strArr5[i73]);
                sb3.append('|');
                sb3.append((Object) strArr5[i62]);
                sb3.append("|PADDED");
                strArr5[i79] = sb3.toString();
                int i80 = ((-1) << 1) - ((f52024d + 116) ^ (-1));
                f52025e = i80 % 128;
                int i81 = i80 % 2;
                i11 = 0;
            }
        }
        int length = f52022b.length;
        int i82 = f52025e;
        int i83 = (i82 ^ 95) + ((i82 & 95) << 1);
        f52024d = i83 % 128;
        int i84 = i83 % 2;
        int i85 = 0;
        while (i85 < length) {
            int i86 = f52025e;
            int i87 = ((i86 | 1) << 1) - (i86 ^ 1);
            int i88 = i87 % 128;
            f52024d = i88;
            if (i87 % 2 != 0) {
                int i89 = i85 ^ 51;
                int i90 = ((((i85 & 51) | i89) << 1) - (~(-i89))) - 1;
                int i91 = i90 | 20;
                i10 = ((i91 << 1) - (~(-(i91 & (~(i90 & 20)))))) - 1;
                if (f52022b[i85] == null) {
                    f52022b[i85] = f52023c[i85];
                    int i92 = (i88 & (-82)) | ((~i88) & 81);
                    int i93 = (i88 & 81) << 1;
                    int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                    f52025e = i94 % 128;
                    int i95 = i94 % 2;
                }
            } else {
                int i96 = (i85 | 1) << 1;
                int i97 = -((i85 & (-2)) | ((~i85) & 1));
                i10 = (i96 | i97) + (i96 & i97);
                if (f52022b[i85] == null) {
                    f52022b[i85] = f52023c[i85];
                    int i98 = (i88 & (-82)) | ((~i88) & 81);
                    int i99 = (i88 & 81) << 1;
                    int i910 = (i98 ^ i99) + ((i98 & i99) << 1);
                    f52025e = i910 % 128;
                    int i911 = i910 % 2;
                }
            }
            i85 = i10;
        }
        int i100 = f52025e;
        int i101 = i100 & 61;
        int i102 = ((i100 ^ 61) | i101) << 1;
        int i103 = -((i100 | 61) & (~i101));
        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
        f52024d = i104 % 128;
        int i105 = i104 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r8 == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r0 = ((r11 & 17) - (~(r11 | 17))) - 1;
        com.mypinpad.tsdk.isolation.aae.f52024d = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.aae.f52023c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r1 == 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r1 == 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r1 == 4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r1 == 6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r1 == 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r1 == 8) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aae.f52022b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r8 >= r0.length) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r3 = ((r9 | 35) << 1) - (r9 ^ 35);
        com.mypinpad.tsdk.isolation.aae.f52025e = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        if ((r3 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r0 = r0[r8];
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0[r8]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        r0 = r10[r8];
        r3 = (r11 & 34) + (r11 | 34);
        r5 = (r3 ^ (-1)) + (r3 << 1);
        com.mypinpad.tsdk.isolation.aae.f52024d = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r1 != 5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aae.f52024d + 105;
        r2 = r0 % 128;
        com.mypinpad.tsdk.isolation.aae.f52025e = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if ((r0 % 2) != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if ((r8 & 5) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if ((r8 & 4) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        r0 = r2 & 29;
        r0 = (r0 - (~(-(-((r2 ^ 29) | r0))))) - 1;
        com.mypinpad.tsdk.isolation.aae.f52024d = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if ((r0 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        r10 = "HEADERS";
        r11 = "PUSH_PROMISE";
        r12 = false;
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        r10 = "HEADERS";
        r11 = "PUSH_PROMISE";
        r12 = false;
        r13 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        if (r1 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aae.f52024d;
        r1 = r0 & 119;
        r0 = (r0 ^ 119) | r1;
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.aae.f52025e = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if ((r2 % 2) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
    
        if ((r8 & 52) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        if ((r8 & 32) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        r0 = kotlin.text.l.replace$default(r9, "PRIORITY", "COMPRESSED", false, 4, (java.lang.Object) null);
        r1 = com.mypinpad.tsdk.isolation.aae.f52024d;
        r2 = r1 & 35;
        r1 = (r1 ^ 35) | r2;
        r3 = (r2 & r1) + (r1 | r2);
        com.mypinpad.tsdk.isolation.aae.f52025e = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
    
        if ((r3 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.aae.f52025e;
        r1 = r0 & 27;
        r0 = (((r0 | 27) & (~r1)) - (~(r1 << 1))) - 1;
        com.mypinpad.tsdk.isolation.aae.f52024d = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        if ((r0 % 2) != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
    
        if (r8 != 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        r0 = r11 & 15;
        r0 = r0 + ((r11 ^ 15) | r0);
        r1 = r0 % 128;
        com.mypinpad.tsdk.isolation.aae.f52024d = r1;
        r0 = r0 % 2;
        r0 = r1 & 15;
        r1 = ((r1 | 15) & (~r0)) + (r0 << 1);
        com.mypinpad.tsdk.isolation.aae.f52025e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        if ((r1 % 2) != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
    
        r1 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        r0 = r10[r8];
        r1 = (r9 ^ 69) + ((r9 & 69) << 1);
        com.mypinpad.tsdk.isolation.aae.f52025e = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0169, code lost:
    
        r0 = r10[r8];
        r11 = r11 + 95;
        com.mypinpad.tsdk.isolation.aae.f52024d = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return kotlin.text.l.replace$default(r9, r10, r11, r12, r13, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r8 == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return mx.openpay.library.data.util.CommandConstants.COMMAND_ACK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return mx.openpay.library.data.util.CommandConstants.COMMAND_ACK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aae.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public static String setDividerPadding(int p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(p4)}, 582530844, -582530842, p4);
    }

    @NotNull
    public static String setY(boolean p4, int p10, int p11, int p12, int p13) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{Boolean.valueOf(p4), Integer.valueOf(p10), Integer.valueOf(p11), Integer.valueOf(p12), Integer.valueOf(p13)}, 1353828415, -1353828414, p10);
    }
}
