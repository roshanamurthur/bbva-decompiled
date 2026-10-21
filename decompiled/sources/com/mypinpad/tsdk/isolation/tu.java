package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/tu;", "", "", "p0", "", "setX", "(I)Z", "setOnFocusChangeListener", "()I", "<init>", "(I)V", "setDividerPadding"}, k = 1, mv = {1, 8, 0})
public final class tu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61199b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61200c = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61201a;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.tu$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/tu$setDividerPadding;", "", "", "p0", "setY", "(I)I", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61202a;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i13 = f61202a;
            int i14 = i13 & 55;
            int i15 = -(-(i13 | 55));
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = i16 % 128;
            int i18 = i16 % 2;
            int i19 = -(~(iIntValue * (-858)));
            int i20 = (-2) - ((((103200000 | i19) << 1) - (i19 ^ 103200000)) ^ (-1));
            int i21 = (iIntValue | 120000) * (-859);
            int i22 = i20 & i21;
            int i23 = ((i20 ^ i21) | i22) << 1;
            int i24 = -((i20 | i21) & (~i22));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = ~iIntValue;
            int i27 = i26 ^ 120000;
            int i28 = i26 & 120000;
            int i29 = ~((i27 & i28) | (i27 ^ i28));
            int i30 = (i26 | iIntValue) & i26;
            int i31 = (-120001) ^ i30;
            int i32 = i30 & (-120001);
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = (iIntValue & i33) | (i33 ^ iIntValue);
            int i35 = ~i34;
            int i36 = (i34 | i35) & i35;
            int i37 = ((~i36) & i29) | ((~i29) & i36);
            int i38 = i36 & i29;
            int i39 = ((i38 & i37) | (i37 ^ i38)) * 859;
            int i40 = i25 & i39;
            int i41 = -(-((i39 ^ i25) | i40));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            int i43 = i26 & i26;
            int i44 = (~i43) & (i26 | i26);
            int i45 = ~((i43 & i44) | (i44 ^ i43));
            int i46 = (i26 | 120000) & (~i28);
            int i47 = (i46 & i28) | (i46 ^ i28);
            int i48 = ~i47;
            int i49 = (i47 | i48) & i48;
            int i50 = ((~i49) & i45) | ((~i45) & i49);
            int i51 = i45 & i49;
            int i52 = -(~(((i51 & i50) | (i50 ^ i51)) * 859));
            int i53 = ((i42 ^ i52) + ((i52 & i42) << 1)) - 1;
            int i54 = i17 & 3;
            int i55 = -(-((i17 ^ 3) | i54));
            int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
            f61202a = i56 % 128;
            int i57 = i56 % 2;
            return Integer.valueOf(i53);
        }

        public static int setY(int p4) {
            return ((Integer) setX(new Object[]{Integer.valueOf(p4)}, -2028730183, 2028730183, p4)).intValue();
        }
    }

    static {
        int i10 = f61200c;
        int i11 = i10 & 73;
        int i12 = (i10 ^ 73) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f61199b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public tu(int i10) {
        this.f61201a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r9 >= 120000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r9 = (r10 ^ 111) + ((r10 & 111) << 1);
        com.mypinpad.tsdk.isolation.tu.f61199b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        r9 = r10 & 125;
        r9 = (r9 - (~(-(-((r10 ^ 125) | r9))))) - 1;
        com.mypinpad.tsdk.isolation.tu.f61199b = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (r9 >= 120000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tu.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setX(new Object[]{this}, -7553507, 7553509, System.identityHashCode(this))).intValue();
    }

    public static boolean setX(int p4) {
        return ((Boolean) setX(new Object[]{Integer.valueOf(p4)}, 1021254792, -1021254792, p4)).booleanValue();
    }
}
