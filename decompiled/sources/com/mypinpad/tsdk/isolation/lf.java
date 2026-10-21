package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/lf;", "", "Lcom/mypinpad/tsdk/i/kz;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/getValue;", "p2", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p3", "Lcom/mypinpad/tsdk/i/lj;", "p4", "Lcom/mypinpad/tsdk/i/fk;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/kz;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/getValue;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/lj;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class lf {

    @NotNull
    public static final lf INSTANCE = new lf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f56933a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f56934b = 1;

    static {
        int i10 = f56934b;
        int i11 = i10 & 77;
        int i12 = (i10 | 77) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f56933a = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        kz kzVar = (kz) objArr[0];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
        int i10 = f56934b;
        int i11 = i10 ^ 99;
        int i12 = ((i10 & 99) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f56933a = i14 % 128;
        int i15 = i14 % 2;
        if (!(!((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, -232375606, 232375652, System.identityHashCode(kzVar))).booleanValue())) {
            int i16 = f56934b + 112;
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            f56933a = i17 % 128;
            int i18 = i17 % 2;
            if (((Boolean) setY(new Object[]{(getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{kzVar, transactionFailed}, 1431838387, -1431838363, System.identityHashCode(kzVar))}, -451622030, 451622031, (int) System.currentTimeMillis())).booleanValue()) {
                int i19 = f56933a;
                int i20 = i19 + 1;
                f56934b = i20 % 128;
                int i21 = i20 % 2;
                int i22 = i19 + 9;
                f56934b = i22 % 128;
                if (i22 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        int i23 = f56933a;
        int i24 = i23 ^ 71;
        int i25 = (i23 & 71) << 1;
        int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
        f56934b = i26 % 128;
        int i27 = i26 % 2;
        return Boolean.FALSE;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[0];
        int i10 = f56934b;
        int i11 = i10 & 23;
        int i12 = (i11 - (~((i10 ^ 23) | i11))) - 1;
        f56933a = i12 % 128;
        if (i12 % 2 != 0) {
            setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
            ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue();
            throw null;
        }
        setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
        if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue() > 0 && ((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 610902136, -610902111, System.identityHashCode(getbeeponfailure))).booleanValue()) {
            int i13 = f56934b;
            int i14 = (((i13 ^ 95) | (i13 & 95)) << 1) - (((~i13) & 95) | (i13 & (-96)));
            f56933a = i14 % 128;
            int i15 = i14 % 2;
            if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                int i16 = f56934b;
                int i17 = (((i16 & (-86)) | ((~i16) & 85)) - (~(-(-((i16 & 85) << 1))))) - 1;
                f56933a = i17 % 128;
                int i18 = i17 % 2;
                int i19 = ((i16 & 121) - (~(i16 | 121))) - 1;
                f56933a = i19 % 128;
                if (i19 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        int i20 = f56933a;
        int i21 = i20 & 53;
        int i22 = (i20 | 53) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 & i23) + (i22 | i23);
        f56934b = i24 % 128;
        int i25 = i24 % 2;
        return Boolean.FALSE;
    }

    @NotNull
    public static fk setCompoundDrawableTintBlendMode(@NotNull kz p4, @NotNull setTextKeepState p10, @NotNull getValue p11, @NotNull setContentDescription p12, @NotNull lj p13) {
        return (fk) setY(new Object[]{p4, p10, p11, p12, p13}, -2123977884, 2123977884, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0255  */
    /* JADX WARN: Code duplicated, block: B:38:0x027a  */
    /* JADX WARN: Code duplicated, block: B:40:0x027f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0281  */
    /* JADX WARN: Code duplicated, block: B:44:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x02ef A[LOOP:0: B:34:0x026a->B:48:0x02ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0340  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ec, code lost:
    
        if (((java.lang.Boolean) setY(new java.lang.Object[]{r0}, 801841319, -801841315, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 2419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.lf.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }
}
