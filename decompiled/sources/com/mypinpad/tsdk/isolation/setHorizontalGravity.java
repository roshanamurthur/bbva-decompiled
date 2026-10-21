package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setHorizontalGravity;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p1", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setContentDescription;)Z", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class setHorizontalGravity {

    @NotNull
    public static final setHorizontalGravity INSTANCE = new setHorizontalGravity();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59803a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59804b = 1;

    static {
        int i10 = f59804b;
        int i11 = (((i10 | 79) << 1) - (~(-(((~i10) & 79) | (i10 & (-80)))))) - 1;
        f59803a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0776  */
    /* JADX WARN: Code duplicated, block: B:106:0x0785  */
    /* JADX WARN: Code duplicated, block: B:108:0x078b  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:27:0x0193  */
    /* JADX WARN: Code duplicated, block: B:42:0x02cb A[PHI: r13
      0x02cb: PHI (r13v26 boolean) = (r13v25 boolean), (r13v27 boolean) binds: [B:41:0x02c9, B:38:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x006f  */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0c04, code lost:
    
        if (r3 > ((r0 & r1) + (r0 | r1))) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setHorizontalGravity.a(java.lang.Object[]):java.lang.Boolean");
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull setContentDescription p10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4, p10}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0093  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:19:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:26:0x0168  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        di diVar;
        dg dgVar;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = i15 | i16;
        int i18 = ~(i17 | i12);
        int i19 = ~i12;
        if ((((~(i10 | i16 | i12)) | (~(i11 | i15 | i12)) | (~(i17 | i19))) * 920) + (((~i17) | (~(i15 | i19))) * 920) + ((i18 | (~(i16 | i19 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919)) != 1) {
            return a(objArr);
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i20 = f59804b;
        int i21 = (i20 ^ 7) + ((i20 & 7) << 1);
        int i22 = i21 % 128;
        f59803a = i22;
        int i23 = i21 % 2;
        if (getbeeponfailure != null) {
            int i24 = (i22 | 9) << 1;
            int i25 = -(i22 ^ 9);
            int i26 = (i24 & i25) + (i25 | i24);
            f59804b = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 47 / 0;
                if (!(!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 610902136, -610902111, System.identityHashCode(getbeeponfailure))).booleanValue())) {
                    i13 = f59804b + 25;
                    f59803a = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i28 = 64 / 0;
                        if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                            diVar = (di) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 974755449, -974755438, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                            if (diVar != null) {
                                int i29 = f59803a;
                                int i30 = (((i29 | 62) << 1) - (i29 ^ 62)) - 1;
                                f59804b = i30 % 128;
                                int i31 = i30 % 2;
                                setBackgroundTintList setbackgroundtintlist = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -296152793, 296152815, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                                dgVar = (dg) di.setDividerPadding(new Object[]{diVar, setscrollbardefaultdelaybeforefade, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist)), Byte.valueOf(ArraysKt___ArraysKt.first((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))))}, 1002023655, -1002023654, System.identityHashCode(diVar));
                                int i32 = f59804b;
                                int i33 = i32 & 31;
                                int i34 = (i32 ^ 31) | i33;
                                i14 = (i33 & i34) + (i34 | i33);
                                f59803a = i14 % 128;
                                if (i14 % 2 == 0) {
                                    return dgVar;
                                }
                                throw null;
                            }
                        }
                    } else if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                        diVar = (di) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 974755449, -974755438, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                        if (diVar != null) {
                            int i210 = f59803a;
                            int i35 = (((i210 | 62) << 1) - (i210 ^ 62)) - 1;
                            f59804b = i35 % 128;
                            int i36 = i35 % 2;
                            setBackgroundTintList setbackgroundtintlist2 = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -296152793, 296152815, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                            dgVar = (dg) di.setDividerPadding(new Object[]{diVar, setscrollbardefaultdelaybeforefade, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist2}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist2)), Byte.valueOf(ArraysKt___ArraysKt.first((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))))}, 1002023655, -1002023654, System.identityHashCode(diVar));
                            int i37 = f59804b;
                            int i38 = i37 & 31;
                            int i39 = (i37 ^ 31) | i38;
                            i14 = (i38 & i39) + (i39 | i38);
                            f59803a = i14 % 128;
                            if (i14 % 2 == 0) {
                                return dgVar;
                            }
                            throw null;
                        }
                    }
                }
            } else if (!(!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 610902136, -610902111, System.identityHashCode(getbeeponfailure))).booleanValue())) {
                i13 = f59804b + 25;
                f59803a = i13 % 128;
                if (i13 % 2 != 0) {
                    int i211 = 64 / 0;
                    if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                        diVar = (di) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 974755449, -974755438, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                        if (diVar != null) {
                            int i212 = f59803a;
                            int i310 = (((i212 | 62) << 1) - (i212 ^ 62)) - 1;
                            f59804b = i310 % 128;
                            int i311 = i310 % 2;
                            setBackgroundTintList setbackgroundtintlist3 = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -296152793, 296152815, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                            dgVar = (dg) di.setDividerPadding(new Object[]{diVar, setscrollbardefaultdelaybeforefade, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist3}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist3)), Byte.valueOf(ArraysKt___ArraysKt.first((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))))}, 1002023655, -1002023654, System.identityHashCode(diVar));
                            int i312 = f59804b;
                            int i313 = i312 & 31;
                            int i314 = (i312 ^ 31) | i313;
                            i14 = (i313 & i314) + (i314 | i313);
                            f59803a = i14 % 128;
                            if (i14 % 2 == 0) {
                                return dgVar;
                            }
                            throw null;
                        }
                    }
                } else if (((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -32940825, 32940851, System.identityHashCode(getbeeponfailure))).booleanValue()) {
                    diVar = (di) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 974755449, -974755438, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    if (diVar != null) {
                        int i213 = f59803a;
                        int i315 = (((i213 | 62) << 1) - (i213 ^ 62)) - 1;
                        f59804b = i315 % 128;
                        int i316 = i315 % 2;
                        setBackgroundTintList setbackgroundtintlist4 = (setBackgroundTintList) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, -296152793, 296152815, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                        dgVar = (dg) di.setDividerPadding(new Object[]{diVar, setscrollbardefaultdelaybeforefade, (byte[]) setBackgroundTintList.setX(new Object[]{setbackgroundtintlist4}, 1426653476, -1426653475, System.identityHashCode(setbackgroundtintlist4)), Byte.valueOf(ArraysKt___ArraysKt.first((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure))))}, 1002023655, -1002023654, System.identityHashCode(diVar));
                        int i317 = f59804b;
                        int i318 = i317 & 31;
                        int i319 = (i317 ^ 31) | i318;
                        i14 = (i318 & i319) + (i319 | i318);
                        f59803a = i14 % 128;
                        if (i14 % 2 == 0) {
                            return dgVar;
                        }
                        throw null;
                    }
                }
            }
        }
        int i40 = f59803a;
        int i41 = (i40 ^ 105) + ((i40 & 105) << 1);
        f59804b = i41 % 128;
        if (i41 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
