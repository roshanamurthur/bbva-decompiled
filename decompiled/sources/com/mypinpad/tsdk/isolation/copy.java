package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0007\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0013\u0010\f\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\f\u0010\u0015J\u0013\u0010\u0011\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/copy;", "", "", "p0", "p1", "p2", "", "setOnFocusChangeListener", "(III)V", "", "Lcom/mypinpad/tsdk/i/TransactionCompleted;", "([B)Lcom/mypinpad/tsdk/i/TransactionCompleted;", "setCompoundDrawableTintBlendMode", "Ljava/util/Date;", "setY", "(Ljava/util/Date;)Lcom/mypinpad/tsdk/i/TransactionCompleted;", "Lcom/mypinpad/tsdk/i/setOnCreateContextMenuListener;", "setDividerPadding", "(Ljava/util/Date;)Lcom/mypinpad/tsdk/i/setOnCreateContextMenuListener;", "", "p3", "(IIIZ)V", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class copy {

    @NotNull
    public static final copy INSTANCE = new copy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f54999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final int[] f55000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55001c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55002d = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x005f A[PHI: r9 r10
      0x005f: PHI (r9v3 int) = (r9v2 int), (r9v12 int) binds: [B:10:0x005d, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x005f: PHI (r10v4 int) = (r10v3 int), (r10v43 int) binds: [B:10:0x005d, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0083 A[PHI: r9 r10
      0x0083: PHI (r9v11 int) = (r9v2 int), (r9v12 int) binds: [B:10:0x005d, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0083: PHI (r10v38 int) = (r10v3 int), (r10v43 int) binds: [B:10:0x005d, B:7:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int i10;
        int i11;
        int i12;
        int[] iArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        f54999a = iArr;
        ArrayList arrayList = new ArrayList(12);
        int i13 = f55001c;
        int i14 = ((-1) << 1) - (((i13 ^ 2) + ((i13 & 2) << 1)) ^ (-1));
        f55002d = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        int i17 = 0;
        while (i16 < 12) {
            int i18 = f55001c;
            int i19 = (i18 | 79) << 1;
            int i20 = -(i18 ^ 79);
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            int i22 = i21 % 128;
            f55002d = i22;
            if (i21 % 2 == 0) {
                i10 = iArr[i16];
                int i23 = i17 & 142;
                int i24 = -(-((i17 ^ 142) | i23));
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                i11 = (i25 & (-44)) + (i25 | (-44));
                if (i17 == 1) {
                    int i26 = ((i22 ^ 101) | (i22 & 101)) << 1;
                    int i27 = -((i22 & (-102)) | ((~i22) & 101));
                    int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                    f55001c = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = i22 + 75;
                    f55001c = i30 % 128;
                    int i31 = i30 % 2;
                    i12 = 1;
                } else {
                    int i32 = (i18 & 93) + (i18 | 93);
                    f55002d = i32 % 128;
                    int i33 = i32 % 2;
                    i12 = 0;
                }
            } else {
                i10 = iArr[i16];
                i11 = i17 + 1;
                if (i17 == 1) {
                    int i210 = ((i22 ^ 101) | (i22 & 101)) << 1;
                    int i211 = -((i22 & (-102)) | ((~i22) & 101));
                    int i212 = ((i210 | i211) << 1) - (i210 ^ i211);
                    f55001c = i212 % 128;
                    int i213 = i212 % 2;
                    int i34 = i22 + 75;
                    f55001c = i34 % 128;
                    int i35 = i34 % 2;
                    i12 = 1;
                } else {
                    int i36 = (i18 & 93) + (i18 | 93);
                    f55002d = i36 % 128;
                    int i37 = i36 % 2;
                    i12 = 0;
                }
            }
            i17 = i11;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i38 = i12 * 217;
            int i39 = i10 * (-215);
            int i40 = i38 & i39;
            int i41 = -(-((i38 ^ i39) | i40));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            int i43 = i12 & iCurrentTimeMillis;
            int i44 = (~i43) & (i12 | iCurrentTimeMillis);
            int i45 = -(~(-(-((~((i43 & i44) | (i44 ^ i43))) * 216))));
            int i46 = ((i42 & i45) + (i45 | i42)) - 1;
            int i47 = ~i10;
            int i48 = i12 & i47;
            int i49 = ((i47 | i12) & (~i48)) | i48;
            int i50 = ~iCurrentTimeMillis;
            int i51 = -(~(((i49 & i50) | (i49 ^ i50)) * (-216)));
            int i52 = ((i46 ^ i51) + ((i51 & i46) << 1)) - 1;
            int i53 = i50 & i12;
            int i54 = (i12 | i50) & (~i53);
            int i55 = (i54 & i53) | (i54 ^ i53);
            int i56 = (i55 | (~i55)) & (~i55);
            int i57 = i10 & i56;
            int i58 = (i56 | i10) & (~i57);
            arrayList.add(Integer.valueOf((((i58 & i57) | (i58 ^ i57)) * 216) + i52));
            i16 = ((i16 ^ 2) + ((i16 & 2) << 1)) - 1;
            int i59 = f55001c;
            int i60 = (i59 & (-122)) | ((~i59) & 121);
            int i61 = (i59 & 121) << 1;
            int i62 = (i60 & i61) + (i61 | i60);
            f55002d = i62 % 128;
            int i63 = i62 % 2;
        }
        f55000b = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        int i64 = f55002d;
        int i65 = i64 & 27;
        int i66 = (i64 | 27) & (~i65);
        int i67 = i65 << 1;
        int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
        f55001c = i68 % 128;
        int i69 = i68 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if ((r6 % 2) == 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(java.lang.Object[] r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.copy.a(java.lang.Object[]):void");
    }

    @NotNull
    public static TransactionCompleted setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        return (TransactionCompleted) setOnFocusChangeListener(new Object[]{bArr}, 111012111, -111012107, (int) System.currentTimeMillis());
    }

    @NotNull
    public static setOnCreateContextMenuListener setDividerPadding(@NotNull Date date) {
        return (setOnCreateContextMenuListener) setOnFocusChangeListener(new Object[]{date}, -1928661311, 1928661312, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0118  */
    /* JADX WARN: Code duplicated, block: B:20:0x011c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0130  */
    /* JADX WARN: Code duplicated, block: B:24:0x0139  */
    /* JADX WARN: Code duplicated, block: B:25:0x013d  */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0431, code lost:
    
        if (r15.length == 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0438, code lost:
    
        if (r15.length == 3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x043a, code lost:
    
        r9 = new com.mypinpad.tsdk.isolation.TransactionCompleted(((java.lang.Integer) com.mypinpad.tsdk.isolation.setLogo.setY(new java.lang.Object[]{java.lang.Byte.valueOf(r15[0])}, 1173040333, -1173040326, (int) java.lang.System.currentTimeMillis())).intValue(), ((java.lang.Integer) com.mypinpad.tsdk.isolation.setLogo.setY(new java.lang.Object[]{java.lang.Byte.valueOf(r15[1])}, 1173040333, -1173040326, (int) java.lang.System.currentTimeMillis())).intValue(), ((java.lang.Integer) com.mypinpad.tsdk.isolation.setLogo.setY(new java.lang.Object[]{java.lang.Byte.valueOf(r15[2])}, 1173040333, -1173040326, (int) java.lang.System.currentTimeMillis())).intValue(), true);
        r0 = com.mypinpad.tsdk.isolation.copy.f55002d;
        r1 = (r0 ^ 110) + ((r0 & 110) << 1);
        r0 = (r1 ^ (-1)) + (r1 << 1);
        com.mypinpad.tsdk.isolation.copy.f55001c = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04b6, code lost:
    
        throw new com.mypinpad.tsdk.isolation.setScaleType(androidx.core.view.PointerIconCompat.TYPE_ALIAS, kotlin.collections.ArraysKt___ArraysKt.joinToString$default(r15, (java.lang.CharSequence) ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r24, int r25, int r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.copy.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @NotNull
    public static TransactionCompleted setY(@NotNull Date date) {
        return (TransactionCompleted) setOnFocusChangeListener(new Object[]{date}, -1349205615, 1349205621, (int) System.currentTimeMillis());
    }

    public final void setCompoundDrawableTintBlendMode(int p4, int p10, int p11, boolean p12) throws IOException {
        setOnFocusChangeListener(new Object[]{this, Integer.valueOf(p4), Integer.valueOf(p10), Integer.valueOf(p11), Boolean.valueOf(p12)}, 544582491, -544582488, p4);
    }

    @NotNull
    public final TransactionCompleted setDividerPadding(@NotNull byte[] bArr) {
        return (TransactionCompleted) setOnFocusChangeListener(new Object[]{this, bArr}, 1554010462, -1554010453, System.identityHashCode(this));
    }

    @NotNull
    public final TransactionCompleted setY(@NotNull byte[] bArr) {
        return (TransactionCompleted) setOnFocusChangeListener(new Object[]{this, bArr}, -1611367294, 1611367299, System.identityHashCode(this));
    }

    @NotNull
    public static TransactionCompleted setOnFocusChangeListener(@NotNull byte[] bArr) {
        return (TransactionCompleted) setOnFocusChangeListener(new Object[]{bArr}, 743521406, -743521406, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int p4, int p10, int p11) throws IOException {
        setOnFocusChangeListener(new Object[]{Integer.valueOf(p4), Integer.valueOf(p10), Integer.valueOf(p11)}, -821968662, 821968664, p4);
    }
}
