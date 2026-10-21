package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class setScrollBarDefaultDelayBeforeFade implements PinPadType, getRrn {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f60451v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static int f60452w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setBackgroundTintList f60453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final di f60454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public setMaxWidth f60455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<TransactionFailed> f60456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setBackground f60457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ah f60458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public byte[] f60459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public byte[] f60460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public setSupportBackgroundTintMode f60461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList f60462j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public setTransitionVisibility f60463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TransactionProcessingResult f60464l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public dg f60465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public dj f60466o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public df f60467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f60468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f60469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f60470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public av f60471t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public setMaxWidth f60472u;

    public setScrollBarDefaultDelayBeforeFade(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar) {
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        this.f60453a = setbackgroundtintlist;
        this.f60454b = diVar;
        this.f60455c = new setMaxWidth();
        this.f60456d = CollectionsKt__CollectionsKt.emptyList();
        this.f60457e = new setBackground();
        this.f60459g = new byte[0];
        this.f60460h = new byte[0];
        this.f60462j = new ArrayList();
        this.f60463k = setTransitionVisibility.setOnDragListener;
        this.f60468q = 200000L;
        this.f60472u = new setMaxWidth();
        getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[]{this}, 1708259647, -1708259646, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        throw new com.mypinpad.tsdk.isolation.fh(33, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60451v;
        r0 = (r8 & 95) + (r8 | 95);
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.mypinpad.tsdk.isolation.getBeepOnFailure A(java.lang.Object[] r8) throws java.lang.Exception {
        /*
            r0 = 0
            r1 = r8[r0]
            com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade r1 = (com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade) r1
            r2 = 1
            r8 = r8[r2]
            java.lang.String r8 = (java.lang.String) r8
            int r3 = com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60451v
            r4 = r3 & 63
            int r5 = ~r4
            r3 = r3 | 63
            r3 = r3 & r5
            int r4 = r4 << r2
            int r3 = r3 + r4
            int r4 = r3 % 128
            com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r4
            r4 = 2
            int r3 = r3 % r4
            r5 = 1511355624(0x5a1574e8, float:1.0517078E16)
            r6 = -1511355589(0xffffffffa5ea8b3b, float:-4.0686876E-16)
            java.lang.String r7 = ""
            if (r3 != 0) goto L3d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r0] = r1
            r3[r2] = r8
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.Object r1 = setDividerPadding(r3, r6, r5, r1)
            com.mypinpad.tsdk.i.getBeepOnFailure r1 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) r1
            r2 = 17
            int r2 = r2 / r0
            if (r1 == 0) goto L64
            goto L53
        L3d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r0] = r1
            r3[r2] = r8
            int r0 = java.lang.System.identityHashCode(r1)
            java.lang.Object r0 = setDividerPadding(r3, r6, r5, r0)
            r1 = r0
            com.mypinpad.tsdk.i.getBeepOnFailure r1 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) r1
            if (r1 == 0) goto L64
        L53:
            int r8 = com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60451v
            r0 = r8 & 95
            r8 = r8 | 95
            int r0 = r0 + r8
            int r8 = r0 % 128
            com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r8
            int r0 = r0 % r4
            if (r0 == 0) goto L62
            return r1
        L62:
            r8 = 0
            throw r8
        L64:
            com.mypinpad.tsdk.i.fh r0 = new com.mypinpad.tsdk.i.fh
            r1 = 33
            r0.<init>(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.A(java.lang.Object[]):com.mypinpad.tsdk.i.getBeepOnFailure");
    }

    public static /* synthetic */ void B(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        df dfVar = (df) objArr[1];
        int i10 = f60451v;
        int i11 = i10 & 97;
        int i12 = (i10 ^ 97) | i11;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f60452w = i13 % 128;
        int i14 = i13 % 2;
        setscrollbardefaultdelaybeforefade.f60467p = dfVar;
        int i15 = (i10 ^ 17) + ((i10 & 17) << 1);
        f60452w = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 60 / 0;
        }
    }

    public static /* synthetic */ Integer C(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = i10 & 51;
        int i12 = i10 | 51;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f60452w = i13 % 128;
        int i14 = i13 % 2;
        int i15 = setscrollbardefaultdelaybeforefade.m;
        int i16 = i10 & 1;
        int i17 = -(-((i10 ^ 1) | i16));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f60452w = i18 % 128;
        if (i18 % 2 != 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static /* synthetic */ void D(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        ah ahVar = (ah) objArr[1];
        int i10 = f60452w;
        int i11 = (((i10 | 46) << 1) - (i10 ^ 46)) - 1;
        int i12 = i11 % 128;
        f60451v = i12;
        int i13 = i11 % 2;
        setscrollbardefaultdelaybeforefade.f60458f = ahVar;
        if (i13 != 0) {
            int i14 = 11 / 0;
        }
        int i15 = ((((i12 ^ 43) | (i12 & 43)) << 1) - (~(-((i12 & (-44)) | ((~i12) & 43))))) - 1;
        f60452w = i15 % 128;
        int i16 = i15 % 2;
    }

    public static /* synthetic */ void E(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f60452w;
        int i11 = i10 ^ 35;
        int i12 = (i10 & 35) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f60451v = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        setscrollbardefaultdelaybeforefade.f60459g = bArr;
        int i15 = f60452w + 115;
        f60451v = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object F(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = ((i10 & 79) - (~(i10 | 79))) - 1;
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = setscrollbardefaultdelaybeforefade.f60460h;
        if (i12 == 0) {
            int i13 = 11 / 0;
        }
        return bArr;
    }

    public static /* synthetic */ void G(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        dj djVar = (dj) objArr[1];
        int i10 = f60451v;
        int i11 = (((i10 | 47) << 1) - (~(-((i10 & (-48)) | ((~i10) & 47))))) - 1;
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        setscrollbardefaultdelaybeforefade.f60466o = djVar;
        int i13 = (i10 ^ 81) + ((i10 & 81) << 1);
        f60452w = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean H(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        TerminalCreationFailure terminalCreationFailure = (TerminalCreationFailure) objArr[2];
        int i10 = f60451v + 65;
        f60452w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setDividerPadding(new Object[]{bArr}, 88526997, -88526995, (int) System.currentTimeMillis());
        if (getbeeponfailure == null) {
            int i11 = f60451v;
            int i12 = (i11 & (-66)) | ((~i11) & 65);
            int i13 = (i11 & 65) << 1;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            f60452w = i14 % 128;
            int i15 = i14 % 2;
            return Boolean.FALSE;
        }
        setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure}, -283067867, 283067887, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        boolean dividerPadding = setscrollbardefaultdelaybeforefade.setDividerPadding(getbeeponfailure, terminalCreationFailure);
        int i16 = f60451v;
        int i17 = i16 & 81;
        int i18 = -(-(i16 | 81));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f60452w = i19 % 128;
        if (i19 % 2 != 0) {
            return Boolean.valueOf(dividerPadding);
        }
        throw null;
    }

    public static /* synthetic */ Boolean I(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        List list = (List) objArr[1];
        int i10 = f60451v;
        int i11 = ((((i10 ^ 105) | (i10 & 105)) << 1) - (~(-(((~i10) & 105) | (i10 & (-106)))))) - 1;
        f60452w = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            boolean z10 = list instanceof Collection;
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            int i12 = f60451v;
            int i13 = i12 & 1;
            int i14 = (i13 - (~(-(-((i12 ^ 1) | i13))))) - 1;
            f60452w = i14 % 128;
            int i15 = i14 % 2;
            while (it.hasNext()) {
                int i16 = f60452w;
                int i17 = i16 & 81;
                int i18 = (i16 ^ 81) | i17;
                int i19 = (i17 & i18) + (i18 | i17);
                f60451v = i19 % 128;
                int i20 = i19 % 2;
                if (!((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) it.next()}, -232375606, 232375652, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                    int i21 = f60451v;
                    int i22 = ((i21 | 55) << 1) - (i21 ^ 55);
                    f60452w = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = i21 & 119;
                    int i25 = (i21 | 119) & (~i24);
                    int i26 = -(-(i24 << 1));
                    int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                    f60452w = i27 % 128;
                    if (i27 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
            }
        }
        int i28 = f60451v;
        int i29 = i28 ^ 59;
        int i30 = (i28 & 59) << 1;
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        f60452w = i31 % 128;
        if (i31 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ void J(Object[] objArr) throws Exception {
        Iterator it;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60452w;
        int i11 = i10 & 33;
        int i12 = ((i10 ^ 33) | i11) << 1;
        int i13 = -((i10 | 33) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f60451v = i14 % 128;
        if (i14 % 2 != 0) {
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            ((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -927948209, 927948212, System.identityHashCode(setscrollcontainer))).booleanValue();
            throw null;
        }
        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        if (!((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -927948209, 927948212, System.identityHashCode(setscrollcontainer2))).booleanValue()) {
            setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, -422205110, 422205136, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                int i15 = f60451v;
                int i16 = (i15 | 27) << 1;
                int i17 = -(((~i15) & 27) | (i15 & (-28)));
                int i18 = (i16 & i17) + (i17 | i16);
                f60452w = i18 % 128;
                if (i18 % 2 == 0) {
                    ArrayList arrayList = setscrollbardefaultdelaybeforefade.f60462j;
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    arrayList.add((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)));
                    throw null;
                }
                ArrayList arrayList2 = setscrollbardefaultdelaybeforefade.f60462j;
                setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                arrayList2.add((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)));
            }
            int i19 = f60452w;
            int i20 = i19 & 37;
            int i21 = ((i19 ^ 37) | i20) << 1;
            int i22 = -((i19 | 37) & (~i20));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f60451v = i23 % 128;
            int i24 = i23 % 2;
            return;
        }
        int i25 = f60452w;
        int i26 = (((i25 & (-8)) | ((~i25) & 7)) - (~((i25 & 7) << 1))) - 1;
        f60451v = i26 % 128;
        if (i26 % 2 != 0) {
            it = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).iterator();
            int i27 = 43 / 0;
        } else {
            it = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).iterator();
        }
        Iterator it2 = it;
        int i28 = f60452w;
        int i29 = (-2) - (((i28 & 14) + (i28 | 14)) ^ (-1));
        f60451v = i29 % 128;
        int i30 = i29 % 2;
        while (it2.hasNext()) {
            int i31 = f60451v;
            int i32 = i31 & 39;
            int i33 = (i31 ^ 39) | i32;
            int i34 = (i32 & i33) + (i33 | i32);
            f60452w = i34 % 128;
            int i35 = i34 % 2;
            setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) it2.next()}, -283067867, 283067887, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i36 = f60451v;
            int i37 = ((i36 ^ 94) + ((i36 & 94) << 1)) - 1;
            f60452w = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = f60451v;
        int i40 = i39 ^ 63;
        int i41 = (i39 & 63) << 1;
        int i42 = (i40 & i41) + (i41 | i40);
        f60452w = i42 % 128;
        if (i42 % 2 == 0) {
            int i43 = 43 / 0;
        }
    }

    public static /* synthetic */ setSupportBackgroundTintMode K(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w;
        int i11 = i10 + 53;
        f60451v = i11 % 128;
        int i12 = i11 % 2;
        setSupportBackgroundTintMode setsupportbackgroundtintmode = setscrollbardefaultdelaybeforefade.f60461i;
        if (i12 != 0) {
            throw null;
        }
        int i13 = ((i10 | 53) << 1) - (i10 ^ 53);
        f60451v = i13 % 128;
        if (i13 % 2 == 0) {
            return setsupportbackgroundtintmode;
        }
        throw null;
    }

    public static /* synthetic */ Boolean L(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        TerminalCreationFailure terminalCreationFailure = (TerminalCreationFailure) objArr[2];
        int i10 = f60451v;
        int i11 = ((i10 ^ 23) | (i10 & 23)) << 1;
        int i12 = -(((~i10) & 23) | (i10 & (-24)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f60452w = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setDividerPadding(new Object[]{bArr}, 88526997, -88526995, (int) System.currentTimeMillis());
        if (getbeeponfailure != null) {
            boolean dividerPadding = setscrollbardefaultdelaybeforefade.setDividerPadding(getbeeponfailure, terminalCreationFailure);
            int i15 = f60452w;
            int i16 = i15 & 29;
            int i17 = ((i15 ^ 29) | i16) << 1;
            int i18 = -((i15 | 29) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            f60451v = i19 % 128;
            int i20 = i19 % 2;
            return Boolean.valueOf(dividerPadding);
        }
        int i21 = f60452w + 12;
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        int i23 = i22 % 128;
        f60451v = i23;
        int i24 = i22 % 2;
        int i25 = ((i23 | 75) << 1) - (i23 ^ 75);
        f60452w = i25 % 128;
        if (i25 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0089  */
    /* JADX WARN: Code duplicated, block: B:16:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:20:0x00da  */
    /* JADX WARN: Code duplicated, block: B:23:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:25:0x0107  */
    /* JADX WARN: Code duplicated, block: B:26:0x0150  */
    /* JADX WARN: Code duplicated, block: B:28:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x01af  */
    /* JADX WARN: Code duplicated, block: B:31:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0216  */
    /* JADX WARN: Code duplicated, block: B:36:0x021f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0234  */
    /* JADX WARN: Code duplicated, block: B:42:0x0251  */
    /* JADX WARN: Code duplicated, block: B:44:0x02af  */
    /* JADX WARN: Code duplicated, block: B:46:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x0317  */
    /* JADX WARN: Code duplicated, block: B:53:0x0352  */
    /* JADX WARN: Code duplicated, block: B:55:0x036a  */
    /* JADX WARN: Code duplicated, block: B:56:0x036e  */
    /* JADX WARN: Code duplicated, block: B:59:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x042f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    public static /* synthetic */ Object M(Object[] objArr) throws Exception {
        List listEmptyList;
        Iterator it;
        int i10;
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        getBeepOnFailure navigationOnClickListener;
        getBeepOnFailure getbeeponfailure3;
        Object[] objArr2;
        int iIntValue;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        setScrollContainer setscrollcontainer;
        boolean zBooleanValue;
        int i14;
        int i15;
        String str;
        int iIntValue2;
        byte[] bArr2;
        int i16;
        int i17;
        int i18;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        List list = (List) objArr[1];
        int i19 = 2;
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        Function1 function1 = (Function1) objArr[3];
        int i20 = f60451v + 63;
        int i21 = i20 % 128;
        f60452w = i21;
        if (i20 % 2 == 0) {
            int i22 = 61 / 0;
            if (list == null) {
                int i23 = ((-1) << 1) - (((i21 ^ 70) + ((i21 & 70) << 1)) ^ (-1));
                f60451v = i23 % 128;
                int i24 = i23 % 2;
                listEmptyList = null;
            } else {
                List list2 = list;
                listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                int i25 = f60451v;
                int i26 = i25 & 121;
                int i27 = ((i25 ^ 121) | i26) << 1;
                int i28 = -((i25 | 121) & (~i26));
                int i29 = (i27 & i28) + (i28 | i27);
                f60452w = i29 % 128;
                int i30 = i29 % 2;
                while (it.hasNext()) {
                    int i31 = f60452w;
                    int i32 = i31 & 67;
                    i10 = i32 + ((i31 ^ 67) | i32);
                    f60451v = i10 % 128;
                    if (i10 % i19 == 0) {
                        getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) it.next();
                        setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, 865402441, -865402437, System.identityHashCode(getbeeponfailure4));
                        throw null;
                    }
                    getbeeponfailure = (getBeepOnFailure) it.next();
                    setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
                    Object[] objArr3 = new Object[i19];
                    objArr3[0] = setscrollbardefaultdelaybeforefade;
                    objArr3[1] = str2;
                    getbeeponfailure2 = (getBeepOnFailure) setDividerPadding(objArr3, -1511355589, 1511355624, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    if (getbeeponfailure2 == null) {
                        int i33 = f60451v;
                        int i34 = i33 & 59;
                        int i35 = (i33 | 59) & (~i34);
                        int i36 = -(-(i34 << 1));
                        i18 = ((i35 | i36) << 1) - (i35 ^ i36);
                        f60452w = i18 % 128;
                        navigationOnClickListener = null;
                        if (i18 % i19 == 0) {
                            throw null;
                        }
                    } else {
                        navigationOnClickListener = getbeeponfailure2.setNavigationOnClickListener();
                        int i37 = f60451v;
                        int i38 = i37 & 93;
                        int i39 = (i37 ^ 93) | i38;
                        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                        f60452w = i40 % 128;
                        int i41 = i40 % i19;
                    }
                    if (navigationOnClickListener == null) {
                        int i42 = f60451v;
                        i15 = (i42 ^ 119) + ((i42 & 119) << 1);
                        f60452w = i15 % 128;
                        if (i15 % i19 == 0) {
                            setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4));
                            setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                            iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue();
                            bArr2 = new byte[iIntValue2];
                            i16 = 1;
                        } else {
                            setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                            str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5));
                            setImageTintList setimagetintlist2 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                            iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist2}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist2))).intValue();
                            bArr2 = new byte[iIntValue2];
                            i16 = 0;
                        }
                        while (i16 < iIntValue2) {
                            i17 = f60451v + 63;
                            int i43 = i17 % 128;
                            f60452w = i43;
                            if (i17 % 2 == 0) {
                                bArr2[i16] = 1;
                            } else {
                                bArr2[i16] = 0;
                                i16 = (((~i16) & 1) | (i16 & (-2))) + ((i16 & 1) << 1);
                            }
                            int i44 = i43 & 29;
                            int i45 = ((((i43 ^ 29) | i44) << 1) - (~(-((~i44) & (i43 | 29))))) - 1;
                            f60451v = i45 % 128;
                            int i46 = i45 % 2;
                        }
                        navigationOnClickListener = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr2, null, Boolean.FALSE, 12}, -976227287, 976227290, 12);
                        int i47 = f60452w;
                        int i48 = i47 & 93;
                        int i49 = (i47 | 93) & (~i48);
                        int i50 = -(-(i48 << 1));
                        int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                        f60451v = i51 % 128;
                        int i52 = i51 % 2;
                    } else {
                        System.identityHashCode(setscrollbardefaultdelaybeforefade);
                        System.identityHashCode(setscrollbardefaultdelaybeforefade);
                    }
                    if (function1 != null) {
                        int i53 = f60452w;
                        int i54 = (i53 | 39) << 1;
                        int i55 = -(i53 ^ 39);
                        i14 = ((i54 | i55) << 1) - (i55 ^ i54);
                        f60451v = i14 % 128;
                        if (i14 % 2 == 0) {
                            function1.invoke(navigationOnClickListener);
                            throw null;
                        }
                        function1.invoke(navigationOnClickListener);
                        int i56 = f60451v;
                        int i57 = i56 ^ 97;
                        int i58 = ((((i56 & 97) | i57) << 1) - (~(-i57))) - 1;
                        f60452w = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    if (zBooleanValue2) {
                        int i60 = f60451v;
                        int i61 = i60 ^ 109;
                        int i62 = ((((i60 & 109) | i61) << 1) - (~(-i61))) - 1;
                        f60452w = i62 % 128;
                        int i63 = i62 % 2;
                        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        setScrollContainer setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 865402441, -865402437, System.identityHashCode(navigationOnClickListener));
                        objArr2 = new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6)), setscrollbardefaultdelaybeforefade.setDividerPadding()};
                        getbeeponfailure3 = getbeeponfailure;
                        if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(objArr2, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue())) {
                            int i64 = f60452w;
                            int i65 = (i64 | 125) << 1;
                            int i66 = -(i64 ^ 125);
                            i13 = (i65 & i66) + (i66 | i65);
                            f60451v = i13 % 128;
                            if (i13 % 2 != 0) {
                                setScrollContainer setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 865402441, -865402437, System.identityHashCode(navigationOnClickListener));
                                zBooleanValue = ((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -927948209, 927948212, System.identityHashCode(setscrollcontainer7))).booleanValue();
                                int i67 = 50 / 0;
                                if (zBooleanValue) {
                                    setImageTintList setimagetintlist3 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                                    iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist3}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist3))).intValue();
                                    bArr = new byte[iIntValue];
                                    int i68 = f60452w + 27;
                                    f60451v = i68 % 128;
                                    int i69 = i68 % 2;
                                    i11 = 0;
                                    while (i11 < iIntValue) {
                                        int i70 = f60452w;
                                        int i71 = i70 & 109;
                                        int i72 = (~i71) & (i70 | 109);
                                        int i73 = -(-(i71 << 1));
                                        i12 = (i72 ^ i73) + ((i73 & i72) << 1);
                                        f60451v = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            bArr[i11] = 0;
                                            i11 = 0;
                                        } else {
                                            bArr[i11] = 0;
                                            i11++;
                                        }
                                        int i74 = i70 & 79;
                                        int i75 = -(-((i70 ^ 79) | i74));
                                        int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                                        f60451v = i76 % 128;
                                        int i77 = i76 % 2;
                                    }
                                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArr}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                    int i78 = f60452w;
                                    int i79 = (((i78 ^ 101) | (i78 & 101)) << 1) - (((~i78) & 101) | (i78 & (-102)));
                                    f60451v = i79 % 128;
                                    int i80 = i79 % 2;
                                }
                            } else {
                                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 865402441, -865402437, System.identityHashCode(navigationOnClickListener));
                                if (((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -927948209, 927948212, System.identityHashCode(setscrollcontainer))).booleanValue()) {
                                    setImageTintList setimagetintlist4 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                                    iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist4}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist4))).intValue();
                                    bArr = new byte[iIntValue];
                                    int i610 = f60452w + 27;
                                    f60451v = i610 % 128;
                                    int i611 = i610 % 2;
                                    i11 = 0;
                                    while (i11 < iIntValue) {
                                        int i710 = f60452w;
                                        int i711 = i710 & 109;
                                        int i712 = (~i711) & (i710 | 109);
                                        int i713 = -(-(i711 << 1));
                                        i12 = (i712 ^ i713) + ((i713 & i712) << 1);
                                        f60451v = i12 % 128;
                                        if (i12 % 2 != 0) {
                                            bArr[i11] = 0;
                                            i11 = 0;
                                        } else {
                                            bArr[i11] = 0;
                                            i11++;
                                        }
                                        int i714 = i710 & 79;
                                        int i715 = -(-((i710 ^ 79) | i714));
                                        int i716 = (i714 ^ i715) + ((i715 & i714) << 1);
                                        f60451v = i716 % 128;
                                        int i717 = i716 % 2;
                                    }
                                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArr}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                    int i718 = f60452w;
                                    int i719 = (((i718 ^ 101) | (i718 & 101)) << 1) - (((~i718) & 101) | (i718 & (-102)));
                                    f60451v = i719 % 128;
                                    int i81 = i719 % 2;
                                }
                            }
                        } else {
                            setImageTintList setimagetintlist5 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                            iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist5}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist5))).intValue();
                            bArr = new byte[iIntValue];
                            int i612 = f60452w + 27;
                            f60451v = i612 % 128;
                            int i613 = i612 % 2;
                            i11 = 0;
                            while (i11 < iIntValue) {
                                int i7110 = f60452w;
                                int i7111 = i7110 & 109;
                                int i7112 = (~i7111) & (i7110 | 109);
                                int i7113 = -(-(i7111 << 1));
                                i12 = (i7112 ^ i7113) + ((i7113 & i7112) << 1);
                                f60451v = i12 % 128;
                                if (i12 % 2 != 0) {
                                    bArr[i11] = 0;
                                    i11 = 0;
                                } else {
                                    bArr[i11] = 0;
                                    i11++;
                                }
                                int i7114 = i7110 & 79;
                                int i7115 = -(-((i7110 ^ 79) | i7114));
                                int i7116 = (i7114 ^ i7115) + ((i7115 & i7114) << 1);
                                f60451v = i7116 % 128;
                                int i7117 = i7116 % 2;
                            }
                            getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArr}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                            int i7118 = f60452w;
                            int i7119 = (((i7118 ^ 101) | (i7118 & 101)) << 1) - (((~i7118) & 101) | (i7118 & (-102)));
                            f60451v = i7119 % 128;
                            int i82 = i7119 % 2;
                        }
                    } else {
                        getbeeponfailure3 = getbeeponfailure;
                    }
                    setImageTintList setimagetintlist6 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 1115257939, -1115257923, System.identityHashCode(navigationOnClickListener));
                    setImageTintList setimagetintlist7 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                    int iIntValue3 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist7}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist7))).intValue();
                    setImageTintList.setX(new Object[]{setimagetintlist6, Integer.valueOf(iIntValue3)}, -2003004454, 2003004454, iIntValue3);
                    listEmptyList.add((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 252497730, -252497710, System.identityHashCode(navigationOnClickListener)));
                    int i83 = f60452w;
                    int i84 = (i83 & (-22)) | ((~i83) & 21);
                    int i85 = (i83 & 21) << 1;
                    int i86 = (i84 & i85) + (i85 | i84);
                    f60451v = i86 % 128;
                    int i87 = i86 % 2;
                    i19 = 2;
                }
                int i88 = f60451v;
                int i89 = i88 & 65;
                int i90 = -(-((i88 ^ 65) | i89));
                int i91 = (i89 & i90) + (i90 | i89);
                f60452w = i91 % 128;
                int i92 = i91 % 2;
            }
        } else if (list == null) {
            int i210 = ((-1) << 1) - (((i21 ^ 70) + ((i21 & 70) << 1)) ^ (-1));
            f60451v = i210 % 128;
            int i211 = i210 % 2;
            listEmptyList = null;
        } else {
            List list3 = list;
            listEmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            it = list3.iterator();
            int i212 = f60451v;
            int i213 = i212 & 121;
            int i214 = ((i212 ^ 121) | i213) << 1;
            int i215 = -((i212 | 121) & (~i213));
            int i216 = (i214 & i215) + (i215 | i214);
            f60452w = i216 % 128;
            int i310 = i216 % 2;
            while (it.hasNext()) {
                int i311 = f60452w;
                int i312 = i311 & 67;
                i10 = i312 + ((i311 ^ 67) | i312);
                f60451v = i10 % 128;
                if (i10 % i19 == 0) {
                    getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) it.next();
                    setScrollContainer setscrollcontainer8 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, 865402441, -865402437, System.identityHashCode(getbeeponfailure5));
                    throw null;
                }
                getbeeponfailure = (getBeepOnFailure) it.next();
                setScrollContainer setscrollcontainer9 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                String str3 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer9}, -888877733, 888877739, System.identityHashCode(setscrollcontainer9));
                Object[] objArr4 = new Object[i19];
                objArr4[0] = setscrollbardefaultdelaybeforefade;
                objArr4[1] = str3;
                getbeeponfailure2 = (getBeepOnFailure) setDividerPadding(objArr4, -1511355589, 1511355624, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                if (getbeeponfailure2 == null) {
                    int i313 = f60451v;
                    int i314 = i313 & 59;
                    int i315 = (i313 | 59) & (~i314);
                    int i316 = -(-(i314 << 1));
                    i18 = ((i315 | i316) << 1) - (i315 ^ i316);
                    f60452w = i18 % 128;
                    navigationOnClickListener = null;
                    if (i18 % i19 == 0) {
                        throw null;
                    }
                } else {
                    navigationOnClickListener = getbeeponfailure2.setNavigationOnClickListener();
                    int i317 = f60451v;
                    int i318 = i317 & 93;
                    int i319 = (i317 ^ 93) | i318;
                    int i410 = (i318 ^ i319) + ((i319 & i318) << 1);
                    f60452w = i410 % 128;
                    int i411 = i410 % i19;
                }
                if (navigationOnClickListener == null) {
                    int i412 = f60451v;
                    i15 = (i412 ^ 119) + ((i412 & 119) << 1);
                    f60452w = i15 % 128;
                    if (i15 % i19 == 0) {
                        setScrollContainer setscrollcontainer10 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer10}, -888877733, 888877739, System.identityHashCode(setscrollcontainer10));
                        setImageTintList setimagetintlist8 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist8}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist8))).intValue();
                        bArr2 = new byte[iIntValue2];
                        i16 = 1;
                    } else {
                        setScrollContainer setscrollcontainer11 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer11}, -888877733, 888877739, System.identityHashCode(setscrollcontainer11));
                        setImageTintList setimagetintlist9 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
                        iIntValue2 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist9}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist9))).intValue();
                        bArr2 = new byte[iIntValue2];
                        i16 = 0;
                    }
                    while (i16 < iIntValue2) {
                        i17 = f60451v + 63;
                        int i413 = i17 % 128;
                        f60452w = i413;
                        if (i17 % 2 == 0) {
                            bArr2[i16] = 1;
                        } else {
                            bArr2[i16] = 0;
                            i16 = (((~i16) & 1) | (i16 & (-2))) + ((i16 & 1) << 1);
                        }
                        int i414 = i413 & 29;
                        int i415 = ((((i413 ^ 29) | i414) << 1) - (~(-((~i414) & (i413 | 29))))) - 1;
                        f60451v = i415 % 128;
                        int i416 = i415 % 2;
                    }
                    navigationOnClickListener = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, bArr2, null, Boolean.FALSE, 12}, -976227287, 976227290, 12);
                    int i417 = f60452w;
                    int i418 = i417 & 93;
                    int i419 = (i417 | 93) & (~i418);
                    int i510 = -(-(i418 << 1));
                    int i511 = ((i419 | i510) << 1) - (i419 ^ i510);
                    f60451v = i511 % 128;
                    int i512 = i511 % 2;
                } else {
                    System.identityHashCode(setscrollbardefaultdelaybeforefade);
                    System.identityHashCode(setscrollbardefaultdelaybeforefade);
                }
                if (function1 != null) {
                    int i513 = f60452w;
                    int i514 = (i513 | 39) << 1;
                    int i515 = -(i513 ^ 39);
                    i14 = ((i514 | i515) << 1) - (i515 ^ i514);
                    f60451v = i14 % 128;
                    if (i14 % 2 == 0) {
                        function1.invoke(navigationOnClickListener);
                        throw null;
                    }
                    function1.invoke(navigationOnClickListener);
                    int i516 = f60451v;
                    int i517 = i516 ^ 97;
                    int i518 = ((((i516 & 97) | i517) << 1) - (~(-i517))) - 1;
                    f60452w = i518 % 128;
                    int i519 = i518 % 2;
                }
                if (zBooleanValue2) {
                    int i614 = f60451v;
                    int i615 = i614 ^ 109;
                    int i616 = ((((i614 & 109) | i615) << 1) - (~(-i615))) - 1;
                    f60452w = i616 % 128;
                    int i617 = i616 % 2;
                    setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setScrollContainer setscrollcontainer12 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 865402441, -865402437, System.identityHashCode(navigationOnClickListener));
                    objArr2 = new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer12}, -888877733, 888877739, System.identityHashCode(setscrollcontainer12)), setscrollbardefaultdelaybeforefade.setDividerPadding()};
                    getbeeponfailure3 = getbeeponfailure;
                    if (!(!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(objArr2, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue())) {
                        int i618 = f60452w;
                        int i619 = (i618 | 125) << 1;
                        int i620 = -(i618 ^ 125);
                        i13 = (i619 & i620) + (i620 | i619);
                        f60451v = i13 % 128;
                        if (i13 % 2 != 0) {
                            setScrollContainer setscrollcontainer13 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 865402441, -865402437, System.identityHashCode(navigationOnClickListener));
                            zBooleanValue = ((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer13}, -927948209, 927948212, System.identityHashCode(setscrollcontainer13))).booleanValue();
                            int i621 = 50 / 0;
                            if (zBooleanValue) {
                                setImageTintList setimagetintlist10 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                                iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist10}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist10))).intValue();
                                bArr = new byte[iIntValue];
                                int i6110 = f60452w + 27;
                                f60451v = i6110 % 128;
                                int i6111 = i6110 % 2;
                                i11 = 0;
                                while (i11 < iIntValue) {
                                    int i71110 = f60452w;
                                    int i71111 = i71110 & 109;
                                    int i71112 = (~i71111) & (i71110 | 109);
                                    int i71113 = -(-(i71111 << 1));
                                    i12 = (i71112 ^ i71113) + ((i71113 & i71112) << 1);
                                    f60451v = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        bArr[i11] = 0;
                                        i11 = 0;
                                    } else {
                                        bArr[i11] = 0;
                                        i11++;
                                    }
                                    int i71114 = i71110 & 79;
                                    int i71115 = -(-((i71110 ^ 79) | i71114));
                                    int i71116 = (i71114 ^ i71115) + ((i71115 & i71114) << 1);
                                    f60451v = i71116 % 128;
                                    int i71117 = i71116 % 2;
                                }
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArr}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                int i71118 = f60452w;
                                int i71119 = (((i71118 ^ 101) | (i71118 & 101)) << 1) - (((~i71118) & 101) | (i71118 & (-102)));
                                f60451v = i71119 % 128;
                                int i810 = i71119 % 2;
                            }
                        } else {
                            setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 865402441, -865402437, System.identityHashCode(navigationOnClickListener));
                            if (((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -927948209, 927948212, System.identityHashCode(setscrollcontainer))).booleanValue()) {
                                setImageTintList setimagetintlist11 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                                iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist11}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist11))).intValue();
                                bArr = new byte[iIntValue];
                                int i6112 = f60452w + 27;
                                f60451v = i6112 % 128;
                                int i6113 = i6112 % 2;
                                i11 = 0;
                                while (i11 < iIntValue) {
                                    int i711110 = f60452w;
                                    int i711111 = i711110 & 109;
                                    int i711112 = (~i711111) & (i711110 | 109);
                                    int i711113 = -(-(i711111 << 1));
                                    i12 = (i711112 ^ i711113) + ((i711113 & i711112) << 1);
                                    f60451v = i12 % 128;
                                    if (i12 % 2 != 0) {
                                        bArr[i11] = 0;
                                        i11 = 0;
                                    } else {
                                        bArr[i11] = 0;
                                        i11++;
                                    }
                                    int i711114 = i711110 & 79;
                                    int i711115 = -(-((i711110 ^ 79) | i711114));
                                    int i711116 = (i711114 ^ i711115) + ((i711115 & i711114) << 1);
                                    f60451v = i711116 % 128;
                                    int i711117 = i711116 % 2;
                                }
                                getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArr}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                                int i711118 = f60452w;
                                int i711119 = (((i711118 ^ 101) | (i711118 & 101)) << 1) - (((~i711118) & 101) | (i711118 & (-102)));
                                f60451v = i711119 % 128;
                                int i811 = i711119 % 2;
                            }
                        }
                    } else {
                        setImageTintList setimagetintlist12 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                        iIntValue = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist12}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist12))).intValue();
                        bArr = new byte[iIntValue];
                        int i6114 = f60452w + 27;
                        f60451v = i6114 % 128;
                        int i6115 = i6114 % 2;
                        i11 = 0;
                        while (i11 < iIntValue) {
                            int i7111110 = f60452w;
                            int i7111111 = i7111110 & 109;
                            int i7111112 = (~i7111111) & (i7111110 | 109);
                            int i7111113 = -(-(i7111111 << 1));
                            i12 = (i7111112 ^ i7111113) + ((i7111113 & i7111112) << 1);
                            f60451v = i12 % 128;
                            if (i12 % 2 != 0) {
                                bArr[i11] = 0;
                                i11 = 0;
                            } else {
                                bArr[i11] = 0;
                                i11++;
                            }
                            int i7111114 = i7111110 & 79;
                            int i7111115 = -(-((i7111110 ^ 79) | i7111114));
                            int i7111116 = (i7111114 ^ i7111115) + ((i7111115 & i7111114) << 1);
                            f60451v = i7111116 % 128;
                            int i7111117 = i7111116 % 2;
                        }
                        getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener, bArr}, 1851855986, -1851855964, System.identityHashCode(navigationOnClickListener));
                        int i7111118 = f60452w;
                        int i7111119 = (((i7111118 ^ 101) | (i7111118 & 101)) << 1) - (((~i7111118) & 101) | (i7111118 & (-102)));
                        f60451v = i7111119 % 128;
                        int i812 = i7111119 % 2;
                    }
                } else {
                    getbeeponfailure3 = getbeeponfailure;
                }
                setImageTintList setimagetintlist13 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 1115257939, -1115257923, System.identityHashCode(navigationOnClickListener));
                setImageTintList setimagetintlist14 = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure3));
                int iIntValue4 = ((Integer) setImageTintList.setX(new Object[]{setimagetintlist14}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist14))).intValue();
                setImageTintList.setX(new Object[]{setimagetintlist13, Integer.valueOf(iIntValue4)}, -2003004454, 2003004454, iIntValue4);
                listEmptyList.add((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{navigationOnClickListener}, 252497730, -252497710, System.identityHashCode(navigationOnClickListener)));
                int i813 = f60452w;
                int i814 = (i813 & (-22)) | ((~i813) & 21);
                int i815 = (i813 & 21) << 1;
                int i816 = (i814 & i815) + (i815 | i814);
                f60451v = i816 % 128;
                int i817 = i816 % 2;
                i19 = 2;
            }
            int i818 = f60451v;
            int i819 = i818 & 65;
            int i93 = -(-((i818 ^ 65) | i819));
            int i94 = (i819 & i93) + (i93 | i819);
            f60452w = i94 % 128;
            int i95 = i94 % 2;
        }
        if (listEmptyList == null) {
            int i96 = f60451v;
            int i97 = i96 & 65;
            int i98 = (((i96 | 65) & (~i97)) - (~(i97 << 1))) - 1;
            f60452w = i98 % 128;
            int i99 = i98 % 2;
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            int i100 = f60452w;
            int i101 = i100 & 1;
            int i102 = ((i100 ^ 1) | i101) << 1;
            int i103 = -((i100 | 1) & (~i101));
            int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
            f60451v = i104 % 128;
            int i105 = i104 % 2;
        } else {
            int i106 = f60452w + 35;
            f60451v = i106 % 128;
            int i107 = i106 % 2;
        }
        byte[] bArr3 = (byte[]) setInputExtras.setDividerPadding(new Object[]{listEmptyList}, -822524174, 822524177, (int) System.currentTimeMillis());
        int i108 = f60452w;
        int i109 = ((i108 ^ 109) | (i108 & 109)) << 1;
        int i110 = -(((~i108) & 109) | (i108 & (-110)));
        int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
        f60451v = i111 % 128;
        if (i111 % 2 == 0) {
            return bArr3;
        }
        throw null;
    }

    public static /* synthetic */ Boolean N(Object[] objArr) throws Exception {
        boolean zBooleanValue;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60452w;
        int i11 = (i10 & (-84)) | ((~i10) & 83);
        int i12 = (i10 & 83) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f60451v = i13 % 128;
        if (i13 % 2 != 0) {
            zBooleanValue = ((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, 2064855914, -2064855856, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
            int i14 = 26 / 0;
        } else {
            zBooleanValue = ((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, 2064855914, -2064855856, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
        }
        int i15 = (-2) - ((f60451v + 34) ^ (-1));
        f60452w = i15 % 128;
        int i16 = i15 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ void O(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        setMaxWidth setmaxwidth = (setMaxWidth) objArr[1];
        int iIdentityHashCode = System.identityHashCode(setscrollbardefaultdelaybeforefade);
        int i10 = 1013691379 & iIdentityHashCode;
        int i11 = (1013691379 | iIdentityHashCode) & (~i10);
        int i12 = ~iIdentityHashCode;
        int i13 = i11 | i10;
        int i14 = ~i13;
        int i15 = ((i13 | i14) & i14) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
        int i16 = 815510114 ^ i15;
        int i17 = (i15 & 815510114) << 1;
        int i18 = (i16 & i17) + (i17 | i16);
        int i19 = (723570623 & i18) | ((~i18) & (-723570624));
        int i20 = -(-((i18 & (-723570624)) << 1));
        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
        int i22 = (i12 & 342467314) | (342467314 ^ i12);
        int i23 = (i22 & 943960545) | (i22 ^ 943960545);
        int i24 = ~i23;
        int i25 = (i23 | i24) & i24;
        int i26 = -(-(((i25 & 272736480) | (272736480 ^ i25)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        int i27 = ((i21 | i26) << 1) - (i26 ^ i21);
        int iIdentityHashCode2 = System.identityHashCode(setscrollbardefaultdelaybeforefade);
        int i28 = ~iIdentityHashCode2;
        int i29 = i28 & (i28 | iIdentityHashCode2);
        int i30 = ~i29;
        int i31 = ((-1071659879) & i29) | ((-1071659879) & i30) | (1071659878 & i29);
        int i32 = ~i31;
        int i33 = (i31 | i32) & i32;
        int i34 = i33 ^ 809502788;
        int i35 = i33 & 809502788;
        int i36 = (i35 & i34) | (i34 ^ i35);
        int i37 = (i30 & 264205226) | ((-264205227) & i29);
        int i38 = i29 & 264205226;
        int i39 = ~((i38 & i37) | (i37 ^ i38));
        int i40 = ((~i39) & i36) | ((~i36) & i39);
        int i41 = i39 & i36;
        int i42 = ((i41 & i40) | (i40 ^ i41)) * (-397);
        int i43 = (((~i42) & (-227185252)) | (227185251 & i42)) + ((i42 & (-227185252)) << 1);
        int i44 = ((-749940365) & i43) | ((~i43) & 749940364);
        int i45 = (i43 & 749940364) << 1;
        int i46 = (i44 & i45) + (i44 | i45);
        int i47 = iIdentityHashCode2 & 809502788;
        int i48 = (iIdentityHashCode2 | 809502788) & (~i47);
        int i49 = (i48 & i47) | (i48 ^ i47);
        int i50 = i49 & 2048136;
        int i51 = (i49 | 2048136) & (~i50);
        int i52 = -(-(((i51 & i50) | (i51 ^ i50)) * 397));
        int i53 = i46 & i52;
        int i54 = (i52 ^ i46) | i53;
        if (i27 > (i53 ^ i54) + ((i54 & i53) << 1)) {
            Intrinsics.checkNotNullParameter(setmaxwidth, "");
            setmaxwidth.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setmaxwidth, "");
        Iterator<getBeepOnFailure> it = setmaxwidth.iterator();
        int i55 = f60452w;
        int i56 = i55 & 31;
        int i57 = -(-(i55 | 31));
        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
        f60451v = i58 % 128;
        int i59 = i58 % 2;
        while (it.hasNext()) {
            int i60 = f60451v;
            int i61 = (i60 & 39) + (i60 | 39);
            f60452w = i61 % 128;
            if (i61 % 2 == 0) {
                setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, it.next()}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                int i62 = 87 / 0;
            } else {
                setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, it.next()}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            }
        }
        int i63 = f60451v;
        int i64 = (-2) - (((i63 & 122) + (i63 | 122)) ^ (-1));
        f60452w = i64 % 128;
        if (i64 % 2 == 0) {
            int i65 = 60 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:? A[LOOP:0: B:8:0x003e->B:22:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    public static /* synthetic */ Boolean P(Object[] objArr) {
        Iterator it;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = setscrollbardefaultdelaybeforefade.f60462j;
        if (arrayList instanceof Collection) {
            int i10 = f60452w;
            int i11 = i10 ^ 49;
            int i12 = -(-((i10 & 49) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f60451v = i13 % 128;
            int i14 = i13 % 2;
            if (!arrayList.isEmpty()) {
                it = arrayList.iterator();
                int i15 = f60451v;
                int i16 = (i15 ^ 23) + ((i15 & 23) << 1);
                f60452w = i16 % 128;
                int i17 = i16 % 2;
                while (it.hasNext()) {
                    int i18 = f60451v;
                    int i19 = (((i18 | 20) << 1) - (i18 ^ 20)) - 1;
                    f60452w = i19 % 128;
                    int i20 = i19 % 2;
                    if (!linkedHashSet.add((String) it.next())) {
                        int i21 = f60452w;
                        int i22 = i21 & 23;
                        int i23 = ((~i22) & (i21 | 23)) + (i22 << 1);
                        f60451v = i23 % 128;
                        int i24 = i23 % 2;
                        int i25 = i21 + 1;
                        f60451v = i25 % 128;
                        int i26 = i25 % 2;
                        return Boolean.FALSE;
                    }
                }
            }
        } else {
            it = arrayList.iterator();
            int i110 = f60451v;
            int i111 = (i110 ^ 23) + ((i110 & 23) << 1);
            f60452w = i111 % 128;
            int i112 = i111 % 2;
            while (it.hasNext()) {
                int i113 = f60451v;
                int i114 = (((i113 | 20) << 1) - (i113 ^ 20)) - 1;
                f60452w = i114 % 128;
                int i27 = i114 % 2;
                if (!linkedHashSet.add((String) it.next())) {
                    int i28 = f60452w;
                    int i29 = i28 & 23;
                    int i210 = ((~i29) & (i28 | 23)) + (i29 << 1);
                    f60451v = i210 % 128;
                    int i211 = i210 % 2;
                    int i212 = i28 + 1;
                    f60451v = i212 % 128;
                    int i213 = i212 % 2;
                    return Boolean.FALSE;
                }
            }
        }
        int i30 = f60451v;
        int i31 = i30 & 83;
        int i32 = (((i30 ^ 83) | i31) << 1) - ((i30 | 83) & (~i31));
        f60452w = i32 % 128;
        if (i32 % 2 != 0) {
            return Boolean.TRUE;
        }
        int i33 = 74 / 0;
        return Boolean.TRUE;
    }

    public static /* synthetic */ void Q(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[1];
        System.identityHashCode(setscrollbardefaultdelaybeforefade);
        System.identityHashCode(setscrollbardefaultdelaybeforefade);
        Intrinsics.checkNotNullParameter(settransitionvisibility, "");
        setscrollbardefaultdelaybeforefade.f60463k = settransitionvisibility;
        int i10 = f60451v;
        int i11 = ((i10 | 17) << 1) - (i10 ^ 17);
        f60452w = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean R(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
        int i10 = f60451v;
        int i11 = i10 & 111;
        int i12 = (i10 | 111) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f60452w = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(transactionFailed, "");
            setMaxWidth setmaxwidth = setscrollbardefaultdelaybeforefade.f60455c;
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1949712751, -1949712727, System.identityHashCode(setmaxwidth))).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(transactionFailed, "");
        setMaxWidth setmaxwidth2 = setscrollbardefaultdelaybeforefade.f60455c;
        boolean zBooleanValue = ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth2, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 1949712751, -1949712727, System.identityHashCode(setmaxwidth2))).booleanValue();
        int i15 = f60451v;
        int i16 = i15 | 23;
        int i17 = i16 << 1;
        int i18 = -((~(i15 & 23)) & i16);
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f60452w = i19 % 128;
        int i20 = i19 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ Long S(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w + 93;
        int i11 = i10 % 128;
        f60451v = i11;
        if (i10 % 2 != 0) {
            long j10 = setscrollbardefaultdelaybeforefade.f60468q;
            throw null;
        }
        long j11 = setscrollbardefaultdelaybeforefade.f60468q;
        int i12 = i11 + 29;
        f60452w = i12 % 128;
        if (i12 % 2 != 0) {
            return Long.valueOf(j11);
        }
        int i13 = 23 / 0;
        return Long.valueOf(j11);
    }

    public static /* synthetic */ Boolean T(Object[] objArr) throws Exception {
        Object next;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        List list = (List) objArr[1];
        int i10 = f60452w;
        int i11 = ((i10 ^ 1) | (i10 & 1)) << 1;
        int i12 = -(((~i10) & 1) | (i10 & (-2)));
        int i13 = (i11 & i12) + (i12 | i11);
        f60451v = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Iterator it = list.iterator();
        int i15 = f60452w + 109;
        f60451v = i15 % 128;
        int i16 = i15 % 2;
        while (true) {
            if (!it.hasNext()) {
                int i17 = f60451v;
                int i18 = i17 ^ 83;
                int i19 = (i17 & 83) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f60452w = i20 % 128;
                int i21 = i20 % 2;
                next = null;
                break;
            }
            int i22 = f60452w + 9;
            f60451v = i22 % 128;
            int i23 = i22 % 2;
            next = it.next();
            if (!((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (String) next}, 2064855914, -2064855856, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                int i24 = f60451v;
                int i25 = ((i24 ^ 15) | (i24 & 15)) << 1;
                int i26 = -((i24 & (-16)) | ((~i24) & 15));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                f60452w = i27 % 128;
                int i28 = i27 % 2;
                int i29 = (i24 ^ 95) + ((i24 & 95) << 1);
                f60452w = i29 % 128;
                int i30 = i29 % 2;
                int i31 = i24 & 57;
                int i32 = i31 + ((i24 ^ 57) | i31);
                f60452w = i32 % 128;
                if (i32 % 2 != 0) {
                    break;
                }
                int i33 = 73 / 0;
                break;
            }
            int i34 = f60451v;
            int i35 = (i34 ^ 107) + ((i34 & 107) << 1);
            f60452w = i35 % 128;
            int i36 = i35 % 2;
        }
        int i37 = f60451v;
        if (next != null) {
            int i38 = ((i37 ^ 50) + ((i37 & 50) << 1)) - 1;
            f60452w = i38 % 128;
            if (i38 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i39 = (i37 & 27) + (i37 | 27);
        f60452w = i39 % 128;
        int i40 = i39 % 2;
        int i41 = ((i37 & 87) - (~(i37 | 87))) - 1;
        f60452w = i41 % 128;
        if (i41 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ void U(Object[] objArr) throws Exception {
        Iterator<getBeepOnFailure> it;
        getBeepOnFailure next;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60451v + 13;
        f60452w = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            it = setscrollbardefaultdelaybeforefade.f60455c.iterator();
            int i11 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            it = setscrollbardefaultdelaybeforefade.f60455c.iterator();
        }
        while (true) {
            next = null;
            if (!it.hasNext()) {
                int i12 = f60452w + 83;
                f60451v = i12 % 128;
                int i13 = i12 % 2;
                break;
            }
            int i14 = f60451v;
            int i15 = i14 ^ 81;
            int i16 = ((i14 & 81) | i15) << 1;
            int i17 = -i15;
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f60452w = i18 % 128;
            if (i18 % 2 == 0) {
                getBeepOnFailure next2 = it.next();
                setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{next2}, 865402441, -865402437, System.identityHashCode(next2));
                String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                Intrinsics.areEqual(str, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)));
                throw null;
            }
            next = it.next();
            getBeepOnFailure getbeeponfailure2 = next;
            setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
            String str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3));
            setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (Intrinsics.areEqual(str2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4)))) {
                int i19 = f60452w;
                int i20 = ((i19 & (-32)) | ((~i19) & 31)) + ((i19 & 31) << 1);
                f60451v = i20 % 128;
                int i21 = i20 % 2;
                break;
            }
        }
        getBeepOnFailure getbeeponfailure3 = next;
        if (getbeeponfailure3 == null) {
            setMaxWidth setmaxwidth = setscrollbardefaultdelaybeforefade.f60455c;
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, getbeeponfailure}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
            int i22 = f60452w;
            int i23 = (i22 & 35) + (i22 | 35);
            f60451v = i23 % 128;
            int i24 = i23 % 2;
            return;
        }
        int i25 = f60451v;
        int i26 = i25 & 115;
        int i27 = (i26 - (~(-(-((i25 ^ 115) | i26))))) - 1;
        f60452w = i27 % 128;
        int i28 = i27 % 2;
        getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3, (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure))}, -1015234117, 1015234131, System.identityHashCode(getbeeponfailure3));
        int i29 = f60451v + 92;
        int i30 = (i29 ^ (-1)) + (i29 << 1);
        f60452w = i30 % 128;
        int i31 = i30 % 2;
    }

    public static /* synthetic */ void V(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        setSupportBackgroundTintMode setsupportbackgroundtintmode = (setSupportBackgroundTintMode) objArr[1];
        int iIdentityHashCode = System.identityHashCode(setscrollbardefaultdelaybeforefade);
        int i10 = ~iIdentityHashCode;
        int i11 = i10 ^ 70712487;
        int i12 = i10 & 70712487;
        int i13 = -(-(((~(i11 | i12)) | (-368508656)) * 529));
        int i14 = (-2036391148) & i13;
        int i15 = (((i13 | (-2036391148)) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        int i16 = i12 | ((-70712488) & iIdentityHashCode);
        int i17 = iIdentityHashCode & 70712487;
        int i18 = ~((i17 & i16) | (i16 ^ i17));
        int i19 = (-298216011) ^ i18;
        int i20 = i18 & (-298216011);
        int i21 = -(-(((i20 & i19) | (i19 ^ i20)) * 529));
        int i22 = ((i15 ^ i21) | (i15 & i21)) << 1;
        int i23 = -((i21 & (~i15)) | ((~i21) & i15));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        int iIdentityHashCode2 = System.identityHashCode(setscrollbardefaultdelaybeforefade);
        int i25 = ~iIdentityHashCode2;
        int i26 = i25 ^ (-413361165);
        int i27 = i25 & (-413361165);
        int i28 = ~((i26 ^ i27) | (i26 & i27));
        int i29 = -(-(((i28 & 144711680) | (144711680 ^ i28)) * (-712)));
        int i30 = (((-475686042) | i29) << 1) - (i29 ^ (-475686042));
        int i31 = i25 & (i25 | iIdentityHashCode2);
        int i32 = ((~i31) & (-1303913332)) | (1303913331 & i31);
        int i33 = i31 & (-1303913332);
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = (413361164 & i34) | ((~i34) & (-413361165));
        int i36 = i34 & (-413361165);
        int i37 = ~((i36 & i35) | (i35 ^ i36));
        int i38 = (-268649485) & iIdentityHashCode2;
        int i39 = (iIdentityHashCode2 | (-268649485)) & (~i38);
        int i40 = ~((i39 & i38) | (i39 ^ i38));
        int i41 = i37 ^ i40;
        int i42 = i40 & i37;
        int i43 = -(-(((i42 & i41) | (i41 ^ i42)) * (-712)));
        int i44 = ((i30 | i43) << 1) - (i43 ^ i30);
        int i45 = ~(i26 | i27);
        int i46 = (-1303913332) & i45;
        int i47 = -(-((((i45 | (-1303913332)) & (~i46)) | i46) * 712));
        int i48 = ((i44 | i47) << 1) - (i47 ^ i44);
        setscrollbardefaultdelaybeforefade.f60461i = setsupportbackgroundtintmode;
        if (i24 > i48) {
            throw null;
        }
        int i49 = f60451v;
        int i50 = i49 & 87;
        int i51 = -(-((i49 ^ 87) | i50));
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        f60452w = i52 % 128;
        if (i52 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r2 = 23 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r2 = ((-1) << 1) - ((-1) ^ (r1 + 18));
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r6 = com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60451v;
        r0 = r6 & 57;
        r6 = (r6 | 57) & (~r0);
        r0 = -(-(r0 << 1));
        r1 = ((r6 | r0) << 1) - (r6 ^ r0);
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r2 = r1 & 63;
        r4 = -(-((r1 ^ 63) | r2));
        r5 = (r2 ^ r4) + ((r2 & r4) << 1);
        com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if ((r5 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object W(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            com.mypinpad.tsdk.i.setScrollBarDefaultDelayBeforeFade r6 = (com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade) r6
            int r1 = com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w
            r2 = r1 & 51
            r1 = r1 | 51
            int r2 = r2 + r1
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60451v = r1
            int r2 = r2 % 2
            r3 = 0
            byte[] r6 = r6.f60469r
            if (r2 == 0) goto L1d
            r2 = 85
            int r2 = r2 / r0
            if (r6 == 0) goto L48
            goto L1f
        L1d:
            if (r6 == 0) goto L48
        L1f:
            r2 = r1 & 63
            r4 = r1 ^ 63
            r4 = r4 | r2
            int r4 = -r4
            int r4 = -r4
            r5 = r2 ^ r4
            r2 = r2 & r4
            int r2 = r2 << 1
            int r5 = r5 + r2
            int r2 = r5 % 128
            com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r2
            int r5 = r5 % 2
            if (r5 != 0) goto L37
            r2 = 23
            int r2 = r2 / r0
        L37:
            int r1 = r1 + 18
            r0 = -1
            int r2 = r0 << 1
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r0
            int r2 = r2 % 2
            if (r2 == 0) goto L47
            return r6
        L47:
            throw r3
        L48:
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            int r6 = com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60451v
            r0 = r6 & 57
            int r1 = ~r0
            r6 = r6 | 57
            r6 = r6 & r1
            int r0 = r0 << 1
            int r0 = -r0
            int r0 = -r0
            r1 = r6 | r0
            int r1 = r1 << 1
            r6 = r6 ^ r0
            int r1 = r1 - r6
            int r6 = r1 % 128
            com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.f60452w = r6
            int r1 = r1 % 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.W(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ getBeepOnFailure X(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60451v;
        int i11 = (i10 & 99) + (i10 | 99);
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        setMaxWidth setmaxwidth = setscrollbardefaultdelaybeforefade.f60455c;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, str}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
        int i13 = f60452w;
        int i14 = i13 & 23;
        int i15 = -(-(i13 | 23));
        int i16 = (i14 & i15) + (i15 | i14);
        f60451v = i16 % 128;
        if (i16 % 2 == 0) {
            return getbeeponfailure;
        }
        throw null;
    }

    public static /* synthetic */ ah Y(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = ((((i10 ^ 97) | (i10 & 97)) << 1) - (~(-(((~i10) & 97) | (i10 & (-98)))))) - 1;
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        ah ahVar = setscrollbardefaultdelaybeforefade.f60458f;
        if (i12 == 0) {
            int i13 = 42 / 0;
        }
        return ahVar;
    }

    public static /* synthetic */ Boolean Z(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        Boolean bool = Boolean.TRUE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60452w + 11;
        f60451v = i10 % 128;
        int i11 = i10 % 2;
        setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
        setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
        TransactionFailed transactionFailed = (TransactionFailed) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)), setscrollbardefaultdelaybeforefade.setDividerPadding()}, 1668702711, -1668702709, (int) System.currentTimeMillis());
        if (transactionFailed == null) {
            int i12 = f60451v;
            int i13 = (((i12 ^ 109) | (i12 & 109)) << 1) - (((~i12) & 109) | (i12 & (-110)));
            int i14 = i13 % 128;
            f60452w = i14;
            int i15 = i13 % 2;
            int i16 = i14 & 113;
            int i17 = (i16 - (~(-(-((i14 ^ 113) | i16))))) - 1;
            f60451v = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 24 / 0;
            }
            return bool;
        }
        setTextSize[] settextsizeArr = (setTextSize[]) TransactionFailed.setX(new Object[]{transactionFailed}, -1568503950, 1568503957, System.identityHashCode(transactionFailed));
        if (settextsizeArr == null) {
            int i19 = f60451v;
            int i20 = (i19 & (-76)) | ((~i19) & 75);
            int i21 = (i19 & 75) << 1;
            int i22 = (i20 & i21) + (i21 | i20);
            f60452w = i22 % 128;
            int i23 = i22 % 2;
            return bool;
        }
        boolean zContains = ArraysKt___ArraysKt.contains(settextsizeArr, setTextSize.setOnLongClickListener);
        int i24 = f60452w;
        int i25 = i24 ^ 9;
        int i26 = (((i24 & 9) | i25) << 1) - i25;
        f60451v = i26 % 128;
        if (i26 % 2 == 0) {
            return Boolean.valueOf(zContains);
        }
        throw null;
    }

    public static /* synthetic */ Object a(Object[] objArr) throws Exception {
        byte[] bArr;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i10 = f60451v;
        int i11 = i10 & 125;
        int i12 = (i11 - (~(-(-((i10 ^ 125) | i11))))) - 1;
        f60452w = i12 % 128;
        if (i12 % 2 == 0) {
            bArr = (byte[]) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list, Boolean.valueOf(zBooleanValue), null}, 976496526, -976496475, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i13 = 91 / 0;
        } else {
            bArr = (byte[]) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list, Boolean.valueOf(zBooleanValue), null}, 976496526, -976496475, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        }
        int i14 = f60452w;
        int i15 = i14 & 45;
        int i16 = (i14 ^ 45) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f60451v = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 87 / 0;
        }
        return bArr;
    }

    public static /* synthetic */ getBeepOnFailure a0(Object[] objArr) {
        getBeepOnFailure getbeeponfailure;
        byte[] bArr = (byte[]) objArr[0];
        try {
            setMaxWidth setmaxwidth = new setMaxWidth();
            setMaxWidth.setX(new Object[]{setmaxwidth, bArr}, -494144192, 494144193, (int) System.currentTimeMillis());
            getbeeponfailure = (getBeepOnFailure) CollectionsKt___CollectionsKt.first((List) setmaxwidth);
            int i10 = f60452w;
            int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
            f60451v = i11 % 128;
            int i12 = i11 % 2;
        } catch (Exception unused) {
            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("Failed to parse tlv from ", (String) setInputExtras.setDividerPadding(new Object[]{bArr}, 1609250238, -1609250236, (int) System.currentTimeMillis()))}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            getbeeponfailure = null;
        }
        int i13 = f60451v;
        int i14 = (((i13 ^ 95) | (i13 & 95)) << 1) - (((~i13) & 95) | (i13 & (-96)));
        f60452w = i14 % 128;
        if (i14 % 2 != 0) {
            return getbeeponfailure;
        }
        throw null;
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w;
        int i11 = i10 & 83;
        int i12 = i11 + ((i10 ^ 83) | i11);
        f60451v = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArr = setscrollbardefaultdelaybeforefade.f60459g;
        int i14 = ((i10 & 97) - (~(-(-(i10 | 97))))) - 1;
        f60451v = i14 % 128;
        if (i14 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public static /* synthetic */ List b0(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w;
        int i11 = (((i10 | 34) << 1) - (i10 ^ 34)) - 1;
        int i12 = i11 % 128;
        f60451v = i12;
        int i13 = i11 % 2;
        List<TransactionFailed> list = setscrollbardefaultdelaybeforefade.f60456d;
        int i14 = i12 & 5;
        int i15 = ((i12 ^ 5) | i14) << 1;
        int i16 = -((i12 | 5) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f60452w = i17 % 128;
        if (i17 % 2 != 0) {
            return list;
        }
        int i18 = 93 / 0;
        return list;
    }

    public static /* synthetic */ Boolean c(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = (-2) - ((f60451v + 74) ^ (-1));
        f60452w = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, -1511355589, 1511355624, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure != null) {
            setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure));
            if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() > 0) {
                int i11 = f60452w;
                int i12 = (((i11 ^ 43) | (i11 & 43)) << 1) - (((~i11) & 43) | (i11 & (-44)));
                f60451v = i12 % 128;
                return Boolean.valueOf(i12 % 2 == 0);
            }
        }
        int i13 = f60451v;
        int i14 = ((i13 | 91) << 1) - (i13 ^ 91);
        f60452w = i14 % 128;
        if (i14 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i15 = 59 / 0;
        return Boolean.FALSE;
    }

    public static /* synthetic */ di d(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w;
        int i11 = (i10 & 119) + (i10 | 119);
        int i12 = i11 % 128;
        f60451v = i12;
        int i13 = i11 % 2;
        di diVar = setscrollbardefaultdelaybeforefade.f60454b;
        int i14 = i12 & 113;
        int i15 = (i12 ^ 113) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f60452w = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 81 / 0;
        }
        return diVar;
    }

    public static /* synthetic */ void e(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        md mdVar = (md) objArr[1];
        setTop settop = (setTop) objArr[2];
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(settop, "");
        setscrollbardefaultdelaybeforefade.f60455c = new setMaxWidth();
        setscrollbardefaultdelaybeforefade.f60456d = settop.setDividerPadding(setscrollbardefaultdelaybeforefade.setDividerPadding());
        setscrollbardefaultdelaybeforefade.setOnFocusChangeListener(mdVar, settop);
        setBackground setbackground = setscrollbardefaultdelaybeforefade.f60457e;
        setMaxWidth setmaxwidth = (setMaxWidth) setBackground.setX(new Object[]{setbackground, mdVar}, -1192893685, 1192893685, System.identityHashCode(setbackground));
        setscrollbardefaultdelaybeforefade.f60472u = setmaxwidth;
        ArrayList arrayList = new ArrayList();
        int i10 = f60452w + 19;
        f60451v = i10 % 128;
        int i11 = i10 % 2;
        for (getBeepOnFailure getbeeponfailure : setmaxwidth) {
            int i12 = f60451v;
            int i13 = i12 ^ 57;
            int i14 = (((i12 & 57) | i13) << 1) - i13;
            f60452w = i14 % 128;
            int i15 = i14 % 2;
            if (!(!((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, getbeeponfailure}, -1512138205, 1512138205, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue())) {
                int i16 = f60451v;
                int i17 = (i16 & (-30)) | ((~i16) & 29);
                int i18 = (i16 & 29) << 1;
                int i19 = (i17 & i18) + (i18 | i17);
                f60452w = i19 % 128;
                if (i19 % 2 == 0) {
                    arrayList.add(getbeeponfailure);
                    throw null;
                }
                arrayList.add(getbeeponfailure);
            }
        }
        Iterator it = arrayList.iterator();
        int i20 = f60452w;
        int i21 = (i20 & (-40)) | ((~i20) & 39);
        int i22 = -(-((i20 & 39) << 1));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        while (true) {
            f60451v = i23 % 128;
            int i24 = i23 % 2;
            if (!it.hasNext()) {
                break;
            }
            int i25 = f60451v;
            int i26 = (i25 & 73) + (i25 | 73);
            f60452w = i26 % 128;
            int i27 = i26 % 2;
            setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, ((getBeepOnFailure) it.next()).setNavigationOnClickListener()}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i28 = f60452w;
            int i29 = i28 ^ 105;
            int i30 = -(-((i28 & 105) << 1));
            i23 = (i29 & i30) + (i30 | i29);
        }
        setscrollbardefaultdelaybeforefade.f60458f = new ah(setscrollbardefaultdelaybeforefade);
        int i31 = f60452w;
        int i32 = i31 & 71;
        int i33 = (((i31 | 71) & (~i32)) - (~(-(-(i32 << 1))))) - 1;
        f60451v = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 28 / 0;
        }
    }

    public static /* synthetic */ setBackgroundTintList f(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = i10 ^ 65;
        int i12 = ((((i10 & 65) | i11) << 1) - (~(-i11))) - 1;
        f60452w = i12 % 128;
        int i13 = i12 % 2;
        setBackgroundTintList setbackgroundtintlist = setscrollbardefaultdelaybeforefade.f60453a;
        int i14 = i10 + 75;
        f60452w = i14 % 128;
        if (i14 % 2 != 0) {
            return setbackgroundtintlist;
        }
        throw null;
    }

    public static /* synthetic */ Boolean g(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60451v;
        int i11 = (((i10 ^ 97) | (i10 & 97)) << 1) - (((~i10) & 97) | (i10 & (-98)));
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        if (((getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, -1511355589, 1511355624, System.identityHashCode(setscrollbardefaultdelaybeforefade))) == null) {
            int i13 = f60452w;
            int i14 = i13 & 41;
            int i15 = -(-(i13 | 41));
            int i16 = (i14 & i15) + (i15 | i14);
            f60451v = i16 % 128;
            int i17 = i16 % 2;
            return Boolean.FALSE;
        }
        int i18 = f60451v;
        int i19 = (((i18 | 17) << 1) - (~(-(i18 ^ 17)))) - 1;
        int i20 = i19 % 128;
        f60452w = i20;
        boolean z10 = i19 % 2 != 0;
        int i21 = (-2) - ((((i20 | 18) << 1) - (i20 ^ 18)) ^ (-1));
        f60451v = i21 % 128;
        if (i21 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ Object h(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = i10 & 15;
        int i12 = (((i10 ^ 15) | i11) << 1) - ((~i11) & (i10 | 15));
        f60452w = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArr = setscrollbardefaultdelaybeforefade.f60470s;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i14 = f60451v;
            int i15 = i14 & 31;
            int i16 = i15 + ((i14 ^ 31) | i15);
            f60452w = i16 % 128;
            int i17 = i16 % 2;
            return null;
        }
        int i18 = i10 & 69;
        int i19 = (i18 - (~((i10 ^ 69) | i18))) - 1;
        f60452w = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
        int i20 = i10 & 121;
        int i21 = -(-((i10 ^ 121) | i20));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        f60452w = i22 % 128;
        int i23 = i22 % 2;
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:14:0x0076  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:24:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x005f A[PHI: r5
      0x005f: PHI (r5v9 int A[IMMUTABLE_TYPE]) = (r5v8 int), (r5v32 int) binds: [B:8:0x005d, B:5:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ void i(Object[] objArr) throws Exception {
        int onFocusChangeListener;
        int i10;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        TransactionFailed transactionFailed = (TransactionFailed) objArr[1];
        int i14 = f60452w;
        int i15 = (i14 & (-114)) | ((~i14) & 113);
        int i16 = (i14 & 113) << 1;
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f60451v = i17 % 128;
        if (i17 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transactionFailed, "");
            onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setOnFocusChangeListener();
            int i18 = 50 / 0;
            if (onFocusChangeListener != -1) {
                int i19 = f60452w;
                int i20 = i19 & 5;
                i10 = i20 + ((i19 ^ 5) | i20);
                f60451v = i10 % 128;
                if (i10 % 2 != 0) {
                    bArr = new byte[onFocusChangeListener];
                    i11 = 1;
                } else {
                    bArr = new byte[onFocusChangeListener];
                    i11 = 0;
                }
                while (i11 < onFocusChangeListener) {
                    int i21 = f60451v;
                    i13 = (i21 & 91) + (i21 | 91);
                    f60452w = i13 % 128;
                    if (i13 % 2 == 0) {
                        bArr[i11] = 0;
                    } else {
                        bArr[i11] = 0;
                        int i22 = ((i11 | 2) << 1) - (i11 ^ 2);
                        i11 = (i22 ^ (-1)) + (i22 << 1);
                    }
                }
                int i23 = f60452w;
                int i24 = ((i23 ^ 3) | (i23 & 3)) << 1;
                int i25 = -(((~i23) & 3) | (i23 & (-4)));
                i12 = ((i24 | i25) << 1) - (i25 ^ i24);
                f60451v = i12 % 128;
            } else {
                bArr = new byte[0];
                int i26 = f60451v;
                int i27 = ((i26 ^ 57) | (i26 & 57)) << 1;
                int i28 = -(((~i26) & 57) | (i26 & (-58)));
                i12 = (i27 & i28) + (i28 | i27);
                f60452w = i12 % 128;
            }
        } else {
            Intrinsics.checkNotNullParameter(transactionFailed, "");
            onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setOnFocusChangeListener();
            if (onFocusChangeListener != -1) {
                int i110 = f60452w;
                int i29 = i110 & 5;
                i10 = i29 + ((i110 ^ 5) | i29);
                f60451v = i10 % 128;
                if (i10 % 2 != 0) {
                    bArr = new byte[onFocusChangeListener];
                    i11 = 1;
                } else {
                    bArr = new byte[onFocusChangeListener];
                    i11 = 0;
                }
                while (i11 < onFocusChangeListener) {
                    int i210 = f60451v;
                    i13 = (i210 & 91) + (i210 | 91);
                    f60452w = i13 % 128;
                    if (i13 % 2 == 0) {
                        bArr[i11] = 0;
                    } else {
                        bArr[i11] = 0;
                        int i211 = ((i11 | 2) << 1) - (i11 ^ 2);
                        i11 = (i211 ^ (-1)) + (i211 << 1);
                    }
                }
                int i212 = f60452w;
                int i213 = ((i212 ^ 3) | (i212 & 3)) << 1;
                int i214 = -(((~i212) & 3) | (i212 & (-4)));
                i12 = ((i213 | i214) << 1) - (i214 ^ i213);
                f60451v = i12 % 128;
            } else {
                bArr = new byte[0];
                int i215 = f60451v;
                int i216 = ((i215 ^ 57) | (i215 & 57)) << 1;
                int i217 = -(((~i215) & 57) | (i215 & (-58)));
                i12 = (i216 & i217) + (i217 | i216);
                f60452w = i12 % 128;
            }
        }
        int i30 = i12 % 2;
        getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
        setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), bArr, setscrollbardefaultdelaybeforefade.setDividerPadding(), Boolean.FALSE, 24}, -976227287, 976227290, 24)}, 2008358388, -2008358355, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        int i31 = f60452w;
        int i32 = i31 & 41;
        int i33 = ((i31 ^ 41) | i32) << 1;
        int i34 = -((i31 | 41) & (~i32));
        int i35 = (i33 & i34) + (i34 | i33);
        f60451v = i35 % 128;
        int i36 = i35 % 2;
    }

    public static /* synthetic */ void j(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f60451v;
        int i11 = ((i10 & 44) + (i10 | 44)) - 1;
        f60452w = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            setscrollbardefaultdelaybeforefade.f60470s = bArr;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            setscrollbardefaultdelaybeforefade.f60470s = bArr;
            throw null;
        }
    }

    public static /* synthetic */ dj k(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = i10 & 121;
        int i12 = i10 | 121;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f60452w = i14;
        int i15 = i13 % 2;
        dj djVar = setscrollbardefaultdelaybeforefade.f60466o;
        int i16 = i14 & 41;
        int i17 = -(-((i14 ^ 41) | i16));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f60451v = i18 % 128;
        if (i18 % 2 == 0) {
            return djVar;
        }
        throw null;
    }

    public static /* synthetic */ getBeepOnFailure l(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60452w;
        int i11 = ((i10 & 30) + (i10 | 30)) - 1;
        f60451v = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        setMaxWidth setmaxwidth = setscrollbardefaultdelaybeforefade.f60472u;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, str}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
        int i13 = f60452w + 25;
        f60451v = i13 % 128;
        if (i13 % 2 == 0) {
            return getbeeponfailure;
        }
        throw null;
    }

    public static /* synthetic */ Boolean m(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60452w + 73;
        f60451v = i10 % 128;
        int i11 = i10 % 2;
        if (!((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, -578266812, 578266824, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
            int i12 = f60452w + 113;
            f60451v = i12 % 128;
            int i13 = i12 % 2;
            if (!((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, -203580470, 203580510, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                int i14 = f60451v;
                int i15 = (-2) - (((i14 & 62) + (i14 | 62)) ^ (-1));
                f60452w = i15 % 128;
                int i16 = i15 % 2;
                return Boolean.FALSE;
            }
        }
        int i17 = f60452w;
        int i18 = i17 & 73;
        int i19 = i18 + ((i17 ^ 73) | i18);
        f60451v = i19 % 128;
        if (i19 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ getBeepOnFailure n(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        List list = (List) objArr[1];
        int i10 = f60451v + 73;
        f60452w = i10 % 128;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) (i10 % 2 == 0 ? setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list, Boolean.FALSE}, 997839361, -997839358, System.identityHashCode(setscrollbardefaultdelaybeforefade)) : setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list, Boolean.TRUE}, 997839361, -997839358, System.identityHashCode(setscrollbardefaultdelaybeforefade)));
        int i11 = f60452w;
        int i12 = i11 & 45;
        int i13 = (i11 | 45) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        f60451v = i15 % 128;
        if (i15 % 2 == 0) {
            return getbeeponfailure;
        }
        throw null;
    }

    public static /* synthetic */ df o(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w + 15;
        int i11 = i10 % 128;
        f60451v = i11;
        int i12 = i10 % 2;
        df dfVar = setscrollbardefaultdelaybeforefade.f60467p;
        if (i12 != 0) {
            throw null;
        }
        int i13 = ((i11 | 39) << 1) - (((~i11) & 39) | (i11 & (-40)));
        f60452w = i13 % 128;
        int i14 = i13 % 2;
        return dfVar;
    }

    public static /* synthetic */ Boolean p(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60451v;
        int i11 = ((i10 & 118) + (i10 | 118)) - 1;
        f60452w = i11 % 128;
        if (i11 % 2 == 0) {
            ((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, -232375606, 232375652, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
            throw null;
        }
        if (((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, str}, -232375606, 232375652, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
            int i12 = f60451v;
            int i13 = (i12 & 65) + (i12 | 65);
            f60452w = i13 % 128;
            if (i13 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i14 = f60452w;
        int i15 = ((i14 & (-108)) | ((~i14) & 107)) + ((i14 & 107) << 1);
        f60451v = i15 % 128;
        if (i15 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ TransactionProcessingResult q(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60452w;
        int i11 = i10 | 15;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 15)) & i11);
        int i14 = (i12 & i13) + (i13 | i12);
        f60451v = i14 % 128;
        int i15 = i14 % 2;
        TransactionProcessingResult transactionProcessingResult = setscrollbardefaultdelaybeforefade.f60464l;
        if (i15 == 0) {
            return transactionProcessingResult;
        }
        throw null;
    }

    public static /* synthetic */ void r(Object[] objArr) throws Exception {
        Unit unit;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        String str = (String) objArr[1];
        int i10 = f60451v;
        int i11 = (-2) - (((i10 ^ 104) + ((i10 & 104) << 1)) ^ (-1));
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        setMaxWidth setmaxwidth = setscrollbardefaultdelaybeforefade.f60455c;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, str}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
        if (getbeeponfailure == null) {
            int i13 = f60452w;
            int i14 = ((i13 & (-112)) | ((~i13) & 111)) + ((i13 & 111) << 1);
            f60451v = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            int i15 = i13 & 47;
            int i16 = -(-((i13 ^ 47) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f60451v = i17 % 128;
            int i18 = i17 % 2;
            unit = null;
        } else {
            getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -838244475, 838244486, System.identityHashCode(getbeeponfailure));
            unit = Unit.INSTANCE;
            int i19 = f60451v;
            int i20 = (i19 & (-28)) | ((~i19) & 27);
            int i21 = (i19 & 27) << 1;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f60452w = i22 % 128;
            int i23 = i22 % 2;
        }
        if (unit == null) {
            int i24 = f60451v;
            int i25 = (i24 ^ 43) + ((i24 & 43) << 1);
            f60452w = i25 % 128;
            int i26 = i25 % 2;
            setMaxWidth setmaxwidth2 = setscrollbardefaultdelaybeforefade.f60455c;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth2, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth2))).booleanValue();
            int i27 = f60452w;
            int i28 = (i27 & (-50)) | ((~i27) & 49);
            int i29 = -(-((i27 & 49) << 1));
            int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
            f60451v = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = f60451v + 99;
        f60452w = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 49 / 0;
        }
    }

    public static /* synthetic */ void s(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        av avVar = (av) objArr[1];
        int i10 = f60451v;
        int i11 = ((i10 ^ 19) | (i10 & 19)) << 1;
        int i12 = -(((~i10) & 19) | (i10 & (-20)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f60452w = i14;
        int i15 = i13 % 2;
        setscrollbardefaultdelaybeforefade.f60471t = avVar;
        int i16 = (i14 & 25) + (i14 | 25);
        f60451v = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x03dc  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Boolean boolValueOf;
        int i13 = (i11 * (-712)) + (i10 * 714);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = (~(i14 | i11)) | (~(i14 | i15));
        int i17 = ~i11;
        int i18 = ~(i10 | i17 | i12);
        switch (((~(i17 | i15)) * 713) + (i18 * 1426) + ((i16 | i18) * (-713)) + i13) {
            case 1:
                s(objArr);
                return null;
            case 2:
                return a0(objArr);
            case 3:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                List list = (List) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i19 = f60451v;
                int i20 = ((i19 ^ 103) | (i19 & 103)) << 1;
                int i21 = -(((~i19) & 103) | (i19 & (-104)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f60452w = i22 % 128;
                int i23 = i22 % 2;
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -308641137, 308641263, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), (byte[]) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list, Boolean.valueOf(zBooleanValue)}, 1486465621, -1486465589, (int) System.currentTimeMillis()), null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
                int i24 = f60451v;
                int i25 = ((((i24 ^ 111) | (i24 & 111)) << 1) - (~(-(((~i24) & 111) | (i24 & (-112)))))) - 1;
                f60452w = i25 % 128;
                int i26 = i25 % 2;
                return getbeeponfailure;
            case 4:
                u(objArr);
                return null;
            case 5:
                return K(objArr);
            case 6:
                return h(objArr);
            case 7:
                return L(objArr);
            case 8:
                return I(objArr);
            case 9:
                return H(objArr);
            case 10:
                D(objArr);
                return null;
            case 11:
                return d(objArr);
            case 12:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                String str = (String) objArr[1];
                int i27 = f60451v + 79;
                f60452w = i27 % 128;
                int i28 = i27 % 2;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, str}, -1511355589, 1511355624, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                if (getbeeponfailure2 != null) {
                    int i29 = f60451v;
                    int i30 = ((i29 & 11) - (~(i29 | 11))) - 1;
                    f60452w = i30 % 128;
                    int i31 = i30 % 2;
                    setImageTintList setimagetintlist = (setImageTintList) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1115257939, -1115257923, System.identityHashCode(getbeeponfailure2));
                    if (((Integer) setImageTintList.setX(new Object[]{setimagetintlist}, 1174276769, -1174276767, System.identityHashCode(setimagetintlist))).intValue() == 0) {
                        int i32 = f60452w;
                        int i33 = i32 ^ 29;
                        int i34 = ((((i32 & 29) | i33) << 1) - (~(-i33))) - 1;
                        f60451v = i34 % 128;
                        boolValueOf = Boolean.valueOf(i34 % 2 == 0);
                    } else {
                        int i35 = f60452w;
                        int i36 = (i35 & (-106)) | ((~i35) & 105);
                        int i37 = (i35 & 105) << 1;
                        int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                        f60451v = i38 % 128;
                        int i39 = i38 % 2;
                        boolValueOf = Boolean.FALSE;
                    }
                } else {
                    int i310 = f60452w;
                    int i311 = (i310 & (-106)) | ((~i310) & 105);
                    int i312 = (i310 & 105) << 1;
                    int i313 = (i311 ^ i312) + ((i312 & i311) << 1);
                    f60451v = i313 % 128;
                    int i314 = i313 % 2;
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            case 13:
                return C(objArr);
            case 14:
                return o(objArr);
            case 15:
                return b0(objArr);
            case 16:
                return S(objArr);
            case 17:
                r(objArr);
                return null;
            case 18:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) objArr[1];
                System.identityHashCode(setscrollbardefaultdelaybeforefade3);
                System.identityHashCode(setscrollbardefaultdelaybeforefade3);
                setscrollbardefaultdelaybeforefade3.f60464l = transactionProcessingResult;
                int i40 = f60451v;
                int i41 = i40 & 91;
                int i42 = -(-((i40 ^ 91) | i41));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f60452w = i43 % 128;
                int i44 = i43 % 2;
                return null;
            case 19:
                return q(objArr);
            case 20:
                J(objArr);
                return null;
            case 21:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                TransactionFailed transactionFailed2 = (TransactionFailed) objArr[1];
                int i45 = f60451v;
                int i46 = (i45 ^ 109) + ((i45 & 109) << 1);
                f60452w = i46 % 128;
                int i47 = i46 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed2, "");
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade4, transactionFailed2}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade4));
                byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                int i48 = f60451v;
                int i49 = i48 ^ 79;
                int i50 = ((i48 & 79) | i49) << 1;
                int i51 = -i49;
                int i52 = (i50 & i51) + (i50 | i51);
                f60452w = i52 % 128;
                int i53 = i52 % 2;
                return bArr;
            case 22:
                return f(objArr);
            case 23:
                return T(objArr);
            case 24:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                TransactionFailed transactionFailed3 = (TransactionFailed) objArr[1];
                int i54 = f60452w;
                int i55 = (i54 & (-28)) | ((~i54) & 27);
                int i56 = (i54 & 27) << 1;
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                f60451v = i57 % 128;
                int i58 = i57 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed3, "");
                getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade5, transactionFailed3}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade5));
                if (getbeeponfailure4 == null) {
                    throw new fh(33, transactionFailed3.setOnFocusChangeListener());
                }
                int i59 = f60452w;
                int i60 = (i59 & (-98)) | ((~i59) & 97);
                int i61 = (i59 & 97) << 1;
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                f60451v = i62 % 128;
                int i63 = i62 % 2;
                return getbeeponfailure4;
            case 25:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade6 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i64 = f60452w;
                int i65 = i64 & 101;
                int i66 = (i64 | 101) & (~i65);
                int i67 = i65 << 1;
                int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                f60451v = i68 % 128;
                int i69 = i68 % 2;
                Intrinsics.checkNotNullParameter(bArr2, "");
                setscrollbardefaultdelaybeforefade6.f60469r = bArr2;
                int i70 = f60451v;
                int i71 = (i70 ^ 53) + ((i70 & 53) << 1);
                f60452w = i71 % 128;
                int i72 = i71 % 2;
                return null;
            case 26:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade7 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                String str2 = (String) objArr[1];
                int i73 = f60452w;
                int i74 = (i73 ^ 78) + ((i73 & 78) << 1);
                int i75 = (i74 ^ (-1)) + (i74 << 1);
                f60451v = i75 % 128;
                int i76 = i75 % 2;
                setOnGenericMotionListener setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                boolean zBooleanValue2 = ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{str2, setscrollbardefaultdelaybeforefade7.setDividerPadding()}, 1118214839, -1118214838, (int) System.currentTimeMillis())).booleanValue();
                int i77 = f60451v + 69;
                f60452w = i77 % 128;
                int i78 = i77 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 27:
                j(objArr);
                return null;
            case 28:
                E(objArr);
                return null;
            case 29:
                G(objArr);
                return null;
            case 30:
                return F(objArr);
            case 31:
                return A(objArr);
            case 32:
                return a(objArr);
            case 33:
                U(objArr);
                return null;
            case 34:
                return t(objArr);
            case 35:
                return X(objArr);
            case 36:
                return m(objArr);
            case 37:
                return v(objArr);
            case 38:
                return n(objArr);
            case 39:
                O(objArr);
                return null;
            case 40:
                return p(objArr);
            case 41:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade8 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                int i79 = f60452w;
                int i80 = ((i79 | 40) << 1) - (i79 ^ 40);
                int i81 = (i80 ^ (-1)) + (i80 << 1);
                f60451v = i81 % 128;
                int i82 = i81 % 2;
                setBackground setbackground = setscrollbardefaultdelaybeforefade8.f60457e;
                int i83 = (-2) - ((((i79 | 48) << 1) - (i79 ^ 48)) ^ (-1));
                f60451v = i83 % 128;
                int i84 = i83 % 2;
                return setbackground;
            case 42:
                Q(objArr);
                return null;
            case 43:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade9 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                TransactionFailed transactionFailed4 = (TransactionFailed) objArr[1];
                int i85 = f60451v;
                int i86 = ((i85 | 89) << 1) - (i85 ^ 89);
                f60452w = i86 % 128;
                int i87 = i86 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed4, "");
                setMaxWidth setmaxwidth = setscrollbardefaultdelaybeforefade9.f60455c;
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, -480651882, 480651889, System.identityHashCode(setmaxwidth));
                int i88 = f60451v;
                int i89 = (((i88 ^ 27) | (i88 & 27)) << 1) - (((~i88) & 27) | (i88 & (-28)));
                f60452w = i89 % 128;
                int i90 = i89 % 2;
                return getbeeponfailure5;
            case 44:
                i(objArr);
                return null;
            case 45:
                return y(objArr);
            case 46:
                return g(objArr);
            case 47:
                B(objArr);
                return null;
            case 48:
                return P(objArr);
            case 49:
                return k(objArr);
            case 50:
                return N(objArr);
            case 51:
                return M(objArr);
            case 52:
                return b(objArr);
            case 53:
                x(objArr);
                return null;
            case 54:
                return Y(objArr);
            case 55:
                return z(objArr);
            case 56:
                return W(objArr);
            case 57:
                V(objArr);
                return null;
            case 58:
                return c(objArr);
            case 59:
                e(objArr);
                return null;
            case 60:
                w(objArr);
                return null;
            case 61:
                return R(objArr);
            case 62:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade10 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                TransactionFailed transactionFailed5 = (TransactionFailed) objArr[1];
                int i91 = f60451v + 103;
                f60452w = i91 % 128;
                int i92 = i91 % 2;
                Intrinsics.checkNotNullParameter(transactionFailed5, "");
                getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade10, transactionFailed5}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade10));
                int i93 = f60451v;
                int i94 = i93 ^ 11;
                int i95 = -(-((i93 & 11) << 1));
                int i96 = (i94 & i95) + (i95 | i94);
                f60452w = i96 % 128;
                int i97 = i96 % 2;
                return getbeeponfailure6;
            case 63:
                return l(objArr);
            case 64:
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade11 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
                int i98 = f60452w;
                int i99 = i98 & 27;
                int i100 = ((((i98 ^ 27) | i99) << 1) - (~(-((~i99) & (i98 | 27))))) - 1;
                f60451v = i100 % 128;
                int i101 = i100 % 2;
                av avVar = setscrollbardefaultdelaybeforefade11.f60471t;
                int i102 = i98 & 13;
                int i103 = (i98 | 13) & (~i102);
                int i104 = -(-(i102 << 1));
                int i105 = (i103 & i104) + (i104 | i103);
                f60451v = i105 % 128;
                int i106 = i105 % 2;
                return avVar;
            default:
                return Z(objArr);
        }
    }

    public static /* synthetic */ byte[] setX(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, List list, boolean z10) {
        return (byte[]) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list, Boolean.valueOf(z10)}, 1486465621, -1486465589, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ setTransitionVisibility t(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = i10 & 111;
        int i12 = ((i10 ^ 111) | i11) << 1;
        int i13 = -((~i11) & (i10 | 111));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f60452w = i14 % 128;
        int i15 = i14 % 2;
        setTransitionVisibility settransitionvisibility = setscrollbardefaultdelaybeforefade.f60463k;
        int i16 = i10 & 39;
        int i17 = i10 | 39;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f60452w = i18 % 128;
        if (i18 % 2 != 0) {
            return settransitionvisibility;
        }
        throw null;
    }

    public static /* synthetic */ void u(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        dg dgVar = (dg) objArr[1];
        int i10 = f60451v;
        int i11 = (((i10 | 46) << 1) - (i10 ^ 46)) - 1;
        f60452w = i11 % 128;
        int i12 = i11 % 2;
        setscrollbardefaultdelaybeforefade.f60465n = dgVar;
        int i13 = (i10 & 117) + (i10 | 117);
        f60452w = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 12 / 0;
        }
    }

    public static /* synthetic */ Boolean v(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
        int i10 = f60451v;
        int i11 = ((i10 | 95) << 1) - (((~i10) & 95) | (i10 & (-96)));
        f60452w = i11 % 128;
        if (i11 % 2 == 0) {
            setscrollbardefaultdelaybeforefade.setDividerPadding(getbeeponfailure, (TerminalCreationFailure) null);
            throw null;
        }
        boolean dividerPadding = setscrollbardefaultdelaybeforefade.setDividerPadding(getbeeponfailure, (TerminalCreationFailure) null);
        int i12 = f60451v;
        int i13 = i12 & 103;
        int i14 = -(-((i12 ^ 103) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        f60452w = i15 % 128;
        int i16 = i15 % 2;
        return Boolean.valueOf(dividerPadding);
    }

    public static /* synthetic */ void w(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f60451v;
        int i11 = (i10 & 35) + (i10 | 35);
        int i12 = i11 % 128;
        f60452w = i12;
        int i13 = i11 % 2;
        setscrollbardefaultdelaybeforefade.m = iIntValue;
        int i14 = (-2) - (((i12 & 98) + (i12 | 98)) ^ (-1));
        f60451v = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void x(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f60452w;
        int i11 = (i10 & 54) + (i10 | 54);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f60451v = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            setscrollbardefaultdelaybeforefade.f60460h = bArr;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            setscrollbardefaultdelaybeforefade.f60460h = bArr;
            int i13 = 12 / 0;
        }
    }

    public static /* synthetic */ Boolean y(Object[] objArr) throws Exception {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f60451v;
        int i11 = (((i10 & (-90)) | ((~i10) & 89)) - (~(-(-((i10 & 89) << 1))))) - 1;
        f60452w = i11 % 128;
        if (i11 % 2 == 0) {
            ((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, bArr, null}, -1215492211, 1215492218, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, bArr, null}, -1215492211, 1215492218, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
        int i12 = f60451v;
        int i13 = ((i12 | 31) << 1) - (i12 ^ 31);
        f60452w = i13 % 128;
        if (i13 % 2 != 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    public static /* synthetic */ dg z(Object[] objArr) {
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i10 = f60451v;
        int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
        int i12 = i11 % 128;
        f60452w = i12;
        int i13 = i11 % 2;
        dg dgVar = setscrollbardefaultdelaybeforefade.f60465n;
        if (i13 == 0) {
            throw null;
        }
        int i14 = i12 & 121;
        int i15 = (i12 ^ 121) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        f60451v = i16 % 128;
        int i17 = i16 % 2;
        return dgVar;
    }

    public final boolean UiMessageCallbackKtWhenMappings(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, -203580470, 203580510, System.identityHashCode(this))).booleanValue();
    }

    public final long getAmountFieldTextColor() {
        return ((Long) setDividerPadding(new Object[]{this}, -784757618, 784757634, System.identityHashCode(this))).longValue();
    }

    public final boolean getNavBarTitleString(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, -578266812, 578266824, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final TransactionProcessingResult setAlwaysDrawnWithCacheEnabled() {
        return (TransactionProcessingResult) setDividerPadding(new Object[]{this}, 85781969, -85781950, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setChildDivider() {
        return (byte[]) setDividerPadding(new Object[]{this}, 644962865, -644962859, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setCompoundDrawablePadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 553421671, -553421615, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:13:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0159  */
    /* JADX WARN: Code duplicated, block: B:16:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x015d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0172  */
    /* JADX WARN: Code duplicated, block: B:22:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:24:0x020c  */
    /* JADX WARN: Code duplicated, block: B:9:0x009a  */
    public boolean setCompoundDrawableTintBlendMode(@NotNull getBeepOnFailure getbeeponfailure, @Nullable TerminalCreationFailure terminalCreationFailure) throws Exception {
        setScrollContainer setscrollcontainer;
        int i10;
        setOnGenericMotionListener setongenericmotionlistener;
        setScrollContainer setscrollcontainer2;
        int i11;
        int i12 = f60451v;
        int i13 = (i12 ^ 50) + ((i12 & 50) << 1);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        f60452w = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            int i15 = 99 / 0;
            if (((Boolean) setDividerPadding(new Object[]{this, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, -888877733, 888877739, System.identityHashCode(setscrollcontainer3))}, -422205110, 422205136, System.identityHashCode(this))).booleanValue()) {
                int i16 = f60451v;
                int i17 = i16 & 25;
                int i18 = i17 + ((i16 ^ 25) | i17);
                f60452w = i18 % 128;
                int i19 = i18 % 2;
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (((Boolean) setDividerPadding(new Object[]{this, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -232375606, 232375652, System.identityHashCode(this))).booleanValue()) {
                    int i20 = f60451v;
                    int i21 = i20 & 87;
                    int i22 = (i21 - (~((i20 ^ 87) | i21))) - 1;
                    f60452w = i22 % 128;
                    int i23 = i22 % 2;
                    SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20033, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, -888877733, 888877739, System.identityHashCode(setscrollcontainer4))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20033);
                    int i24 = f60452w;
                    int i25 = i24 | 33;
                    int i26 = i25 << 1;
                    int i27 = -((~(i24 & 33)) & i25);
                    i11 = ((i26 | i27) << 1) - (i27 ^ i26);
                    f60451v = i11 % 128;
                    if (i11 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (terminalCreationFailure != null) {
                    int i28 = f60451v;
                    int i29 = i28 & 65;
                    i10 = i29 + ((i28 ^ 65) | i29);
                    f60452w = i10 % 128;
                    if (i10 % 2 != 0) {
                        setOnGenericMotionListener setongenericmotionlistener2 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        setScrollContainer setscrollcontainer5 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener2, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer5}, -888877733, 888877739, System.identityHashCode(setscrollcontainer5)), terminalCreationFailure, setDividerPadding()}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener2))).booleanValue();
                        throw null;
                    }
                    setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), terminalCreationFailure, setDividerPadding()}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener))).booleanValue()) {
                        SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer6 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer6}, -888877733, 888877739, System.identityHashCode(setscrollcontainer6))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                        int i30 = f60451v;
                        int i31 = ((i30 & 22) + (i30 | 22)) - 1;
                        f60452w = i31 % 128;
                        int i32 = i31 % 2;
                        return false;
                    }
                }
                setDividerPadding(new Object[]{this, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(this));
                int i33 = f60451v;
                int i34 = i33 | 23;
                int i35 = ((i34 << 1) - (~(-((~(i33 & 23)) & i34)))) - 1;
                f60452w = i35 % 128;
                int i36 = i35 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            setScrollContainer setscrollcontainer7 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (((Boolean) setDividerPadding(new Object[]{this, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer7}, -888877733, 888877739, System.identityHashCode(setscrollcontainer7))}, -422205110, 422205136, System.identityHashCode(this))).booleanValue()) {
                int i110 = f60451v;
                int i111 = i110 & 25;
                int i112 = i111 + ((i110 ^ 25) | i111);
                f60452w = i112 % 128;
                int i113 = i112 % 2;
                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                if (((Boolean) setDividerPadding(new Object[]{this, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer))}, -232375606, 232375652, System.identityHashCode(this))).booleanValue()) {
                    int i210 = f60451v;
                    int i211 = i210 & 87;
                    int i212 = (i211 - (~((i210 ^ 87) | i211))) - 1;
                    f60452w = i212 % 128;
                    int i213 = i212 % 2;
                    SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                    setScrollContainer setscrollcontainer8 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    SouthPacificEndpoint.setX(new Object[]{20033, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer8}, -888877733, 888877739, System.identityHashCode(setscrollcontainer8))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20033);
                    int i214 = f60452w;
                    int i215 = i214 | 33;
                    int i216 = i215 << 1;
                    int i217 = -((~(i214 & 33)) & i215);
                    i11 = ((i216 | i217) << 1) - (i217 ^ i216);
                    f60451v = i11 % 128;
                    if (i11 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                if (terminalCreationFailure != null) {
                    int i218 = f60451v;
                    int i219 = i218 & 65;
                    i10 = i219 + ((i218 ^ 65) | i219);
                    f60452w = i10 % 128;
                    if (i10 % 2 != 0) {
                        setOnGenericMotionListener setongenericmotionlistener3 = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                        setScrollContainer setscrollcontainer9 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        ((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener3, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer9}, -888877733, 888877739, System.identityHashCode(setscrollcontainer9)), terminalCreationFailure, setDividerPadding()}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener3))).booleanValue();
                        throw null;
                    }
                    setongenericmotionlistener = setOnGenericMotionListener.setCompoundDrawableTintBlendMode;
                    setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                    if (!((Boolean) setOnGenericMotionListener.setCompoundDrawableTintBlendMode(new Object[]{setongenericmotionlistener, (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2)), terminalCreationFailure, setDividerPadding()}, 1653596604, -1653596598, System.identityHashCode(setongenericmotionlistener))).booleanValue()) {
                        SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                        setScrollContainer setscrollcontainer10 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
                        SouthPacificEndpoint.setX(new Object[]{20034, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer10}, -888877733, 888877739, System.identityHashCode(setscrollcontainer10))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20034);
                        int i37 = f60451v;
                        int i38 = ((i37 & 22) + (i37 | 22)) - 1;
                        f60452w = i38 % 128;
                        int i39 = i38 % 2;
                        return false;
                    }
                }
                setDividerPadding(new Object[]{this, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(this));
                int i310 = f60451v;
                int i311 = i310 | 23;
                int i312 = ((i311 << 1) - (~(-((~(i310 & 23)) & i311)))) - 1;
                f60452w = i312 % 128;
                int i313 = i312 % 2;
            }
        }
        int i40 = f60452w;
        int i41 = i40 & 25;
        int i42 = (i40 | 25) & (~i41);
        int i43 = -(-(i41 << 1));
        int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
        f60451v = i44 % 128;
        int i45 = i44 % 2;
        return true;
    }

    @NotNull
    public abstract Terminal setDividerPadding();

    @Nullable
    public byte[] setImageResource() throws Exception {
        int i10 = f60452w;
        int i11 = i10 ^ 13;
        int i12 = ((i10 & 13) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f60451v = i14 % 128;
        int i15 = i14 % 2;
        setAnimation setanimation = setAnimation.INSTANCE;
        getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setDividerPadding(new Object[]{this, (TransactionFailed) setAnimation.setY(new Object[0], 1260159524, -1260159512, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(this));
        if (getbeeponfailure != null) {
            byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
            int i16 = f60451v + 65;
            f60452w = i16 % 128;
            if (i16 % 2 != 0) {
                return bArr;
            }
            throw null;
        }
        int i17 = f60452w;
        int i18 = i17 + 113;
        f60451v = i18 % 128;
        int i19 = i18 % 2;
        int i20 = (i17 & (-52)) | ((~i17) & 51);
        int i21 = -(-((i17 & 51) << 1));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        f60451v = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    @Nullable
    public final setSupportBackgroundTintMode setIncludeFontPadding() {
        return (setSupportBackgroundTintMode) setDividerPadding(new Object[]{this}, 568936545, -568936540, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    /* JADX WARN: Code duplicated, block: B:12:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x0045 A[PHI: r0
      0x0045: PHI (r0v7 com.mypinpad.tsdk.i.ah) = (r0v6 com.mypinpad.tsdk.i.ah), (r0v31 com.mypinpad.tsdk.i.ah) binds: [B:8:0x0043, B:5:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public void setLayoutAnimation() throws Exception {
        ah ahVar;
        int i10;
        int i11 = f60451v;
        int i12 = (((i11 ^ 79) | (i11 & 79)) << 1) - (((~i11) & 79) | (i11 & (-80)));
        f60452w = i12 % 128;
        if (i12 % 2 == 0) {
            setMaxWidth setmaxwidth = this.f60455c;
            setMaxWidth.setX(new Object[]{setmaxwidth}, 1900601062, -1900601058, System.identityHashCode(setmaxwidth));
            ahVar = this.f60458f;
            int i13 = 7 / 0;
            if (ahVar != null) {
                int i14 = f60451v;
                int i15 = i14 & 117;
                int i16 = ((i14 ^ 117) | i15) << 1;
                int i17 = -((i14 | 117) & (~i15));
                i10 = (i16 & i17) + (i17 | i16);
                f60452w = i10 % 128;
                if (i10 % 2 == 0) {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1006797251, -1006797224, System.identityHashCode(ahVar));
                    int i18 = 53 / 0;
                } else {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1006797251, -1006797224, System.identityHashCode(ahVar));
                }
                int i19 = f60452w;
                int i20 = i19 & 35;
                int i21 = (i19 ^ 35) | i20;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f60451v = i22 % 128;
                int i23 = i22 % 2;
            }
        } else {
            setMaxWidth setmaxwidth2 = this.f60455c;
            setMaxWidth.setX(new Object[]{setmaxwidth2}, 1900601062, -1900601058, System.identityHashCode(setmaxwidth2));
            ahVar = this.f60458f;
            if (ahVar != null) {
                int i110 = f60451v;
                int i111 = i110 & 117;
                int i112 = ((i110 ^ 117) | i111) << 1;
                int i113 = -((i110 | 117) & (~i111));
                i10 = (i112 & i113) + (i113 | i112);
                f60452w = i10 % 128;
                if (i10 % 2 == 0) {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1006797251, -1006797224, System.identityHashCode(ahVar));
                    int i114 = 53 / 0;
                } else {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{ahVar}, 1006797251, -1006797224, System.identityHashCode(ahVar));
                }
                int i115 = f60452w;
                int i24 = i115 & 35;
                int i25 = (i115 ^ 35) | i24;
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f60451v = i26 % 128;
                int i27 = i26 % 2;
            }
        }
        setRemoteViewsAdapter.setX(new Object[]{(byte[]) setDividerPadding(new Object[]{this}, -854811249, 854811301, System.identityHashCode(this))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
        setRemoteViewsAdapter.setX(new Object[]{this.f60460h}, 1811924153, -1811924153, (int) System.currentTimeMillis());
        this.m = new SecureRandom().nextInt();
        int i28 = f60451v + 49;
        f60452w = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 57 / 0;
        }
    }

    public final boolean setLayoutDirection() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 910478205, -910478157, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final av setMinHeight() {
        return (av) setDividerPadding(new Object[]{this}, 1774718002, -1774717938, System.identityHashCode(this));
    }

    public final boolean setNavigationOnClickListener(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, -1557508936, 1557508986, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final getBeepOnFailure setOnDragListener(@NotNull TransactionFailed transactionFailed) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, transactionFailed}, 1509579822, -1509579760, System.identityHashCode(this));
    }

    @Nullable
    public final dj setOnEditorActionListener() {
        return (dj) setDividerPadding(new Object[]{this}, 1462944051, -1462944002, System.identityHashCode(this));
    }

    public void setOnFocusChangeListener(@NotNull md mdVar, @NotNull setTop settop) {
        Intrinsics.checkNotNullParameter(mdVar, "");
        Intrinsics.checkNotNullParameter(settop, "");
        setOnHoverListener setonhoverlistener = new setOnHoverListener(mdVar, settop.setCompoundDrawableTintBlendMode());
        setBackground setbackground = this.f60457e;
        setBackground.setX(new Object[]{setbackground, setonhoverlistener}, 154663697, -154663696, System.identityHashCode(setbackground));
        int i10 = f60452w;
        int i11 = i10 ^ 75;
        int i12 = (((i10 & 75) | i11) << 1) - i11;
        f60451v = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final boolean setOnLongClickListener(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, 1014467290, -1014467254, System.identityHashCode(this))).booleanValue();
    }

    public final int setTextAlignment() {
        return ((Integer) setDividerPadding(new Object[]{this}, -491694089, 491694102, System.identityHashCode(this))).intValue();
    }

    @Nullable
    public final df setTextScaleX() {
        return (df) setDividerPadding(new Object[]{this}, -566041279, 566041293, System.identityHashCode(this));
    }

    @NotNull
    public final getBeepOnFailure setY(@Nullable List<? extends getBeepOnFailure> list, boolean z10) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, list, Boolean.valueOf(z10)}, 997839361, -997839358, System.identityHashCode(this));
    }

    @Nullable
    public final dg setZ() {
        return (dg) setDividerPadding(new Object[]{this}, -1099465569, 1099465624, System.identityHashCode(this));
    }

    @NotNull
    public final setTransitionVisibility UiMessageCallbackKtWhenMappings() {
        return (setTransitionVisibility) setDividerPadding(new Object[]{this}, -672536244, 672536278, System.identityHashCode(this));
    }

    @NotNull
    public final setBackground getNavBarTitleString() {
        return (setBackground) setDividerPadding(new Object[]{this}, -686851354, 686851395, System.identityHashCode(this));
    }

    @Nullable
    public final ah setNavigationOnClickListener() {
        return (ah) setDividerPadding(new Object[]{this}, 1437547358, -1437547304, System.identityHashCode(this));
    }

    public final boolean setOnDragListener(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, 2064855914, -2064855856, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final byte[] setOnLongClickListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -854811249, 854811301, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setX(@Nullable List<? extends getBeepOnFailure> list, boolean z10, @Nullable Function1<? super getBeepOnFailure, Unit> function1) {
        return (byte[]) setDividerPadding(new Object[]{this, list, Boolean.valueOf(z10), function1}, 976496526, -976496475, System.identityHashCode(this));
    }

    public final boolean setY(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, -232375606, 232375652, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -310536083, 310536113, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setX(@NotNull String str) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, str}, -874272392, 874272455, System.identityHashCode(this));
    }

    public final void setY(@NotNull md mdVar, @NotNull setTop settop) throws Exception {
        setDividerPadding(new Object[]{this, mdVar, settop}, -919932723, 919932782, System.identityHashCode(this));
    }

    public final void setX(@NotNull TransactionFailed transactionFailed) throws Exception {
        setDividerPadding(new Object[]{this, transactionFailed}, 42652451, -42652407, System.identityHashCode(this));
    }

    public final boolean setY(@NotNull TransactionFailed transactionFailed) {
        return ((Boolean) setDividerPadding(new Object[]{this, transactionFailed}, -1124769376, 1124769437, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(@NotNull byte[] bArr) throws Exception {
        setDividerPadding(new Object[]{this, bArr}, 990442214, -990442189, System.identityHashCode(this));
    }

    public final void setY(@NotNull byte[] bArr) throws Exception {
        setDividerPadding(new Object[]{this, bArr}, 740692591, -740692564, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(@NotNull List<String> list) {
        return ((Boolean) setDividerPadding(new Object[]{this, list}, 1649211393, -1649211385, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(int i10) throws Exception {
        setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -1854381040, 1854381100, i10);
    }

    public final void setY(@NotNull setTransitionVisibility settransitionvisibility) throws Exception {
        setDividerPadding(new Object[]{this, settransitionvisibility}, -1167051031, 1167051073, System.identityHashCode(this));
    }

    public final void setY(@Nullable ah ahVar) throws Exception {
        setDividerPadding(new Object[]{this, ahVar}, 2023572198, -2023572188, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(@NotNull byte[] bArr, @Nullable TerminalCreationFailure terminalCreationFailure) {
        return ((Boolean) setDividerPadding(new Object[]{this, bArr, terminalCreationFailure}, -1215492211, 1215492218, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final List<TransactionFailed> setY() {
        return (List) setDividerPadding(new Object[]{this}, -1161703492, 1161703507, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull setMaxWidth setmaxwidth) throws Exception {
        setDividerPadding(new Object[]{this, setmaxwidth}, 1060813790, -1060813751, System.identityHashCode(this));
    }

    @NotNull
    public final getBeepOnFailure setOnFocusChangeListener(@NotNull String str) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, str}, 1249644233, -1249644202, System.identityHashCode(this));
    }

    @NotNull
    public final getBeepOnFailure setOnFocusChangeListener(@NotNull TransactionFailed transactionFailed) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, transactionFailed}, 1431838387, -1431838363, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@Nullable av avVar) throws Exception {
        setDividerPadding(new Object[]{this, avVar}, -1576428727, 1576428728, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@Nullable df dfVar) throws Exception {
        setDividerPadding(new Object[]{this, dfVar}, -1414515296, 1414515343, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.PinPadType
    @Nullable
    public final getBeepOnFailure setLayoutAnimation(@Nullable String str) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, str}, -1511355589, 1511355624, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@Nullable dj djVar) throws Exception {
        setDividerPadding(new Object[]{this, djVar}, -834780049, 834780078, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@Nullable TransactionProcessingResult transactionProcessingResult) throws Exception {
        setDividerPadding(new Object[]{this, transactionProcessingResult}, 1881890266, -1881890248, System.identityHashCode(this));
    }

    @Nullable
    public final di setOnFocusChangeListener() {
        return (di) setDividerPadding(new Object[]{this}, 974755449, -974755438, System.identityHashCode(this));
    }

    public static /* synthetic */ getBeepOnFailure setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, List list) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, list}, 1048306138, -1048306100, (int) System.currentTimeMillis());
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable String str) throws Exception {
        setDividerPadding(new Object[]{this, str}, -1394735893, 1394735910, System.identityHashCode(this));
    }

    public final boolean setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @Nullable TerminalCreationFailure terminalCreationFailure) {
        return ((Boolean) setDividerPadding(new Object[]{this, bArr, terminalCreationFailure}, 1799308265, -1799308256, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull getBeepOnFailure getbeeponfailure) throws Exception {
        setDividerPadding(new Object[]{this, getbeeponfailure}, 2008358388, -2008358355, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(@NotNull TransactionFailed transactionFailed) {
        return (byte[]) setDividerPadding(new Object[]{this, transactionFailed}, -1344789201, 1344789222, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable dg dgVar) throws Exception {
        setDividerPadding(new Object[]{this, dgVar}, -1787697419, 1787697423, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) throws Exception {
        setDividerPadding(new Object[]{this, bArr}, 55385802, -55385749, System.identityHashCode(this));
    }

    @NotNull
    public final setBackgroundTintList setCompoundDrawableTintBlendMode() {
        return (setBackgroundTintList) setDividerPadding(new Object[]{this}, -296152793, 296152815, System.identityHashCode(this));
    }

    public boolean setDividerPadding(@NotNull getBeepOnFailure getbeeponfailure, @Nullable TerminalCreationFailure terminalCreationFailure) {
        int i10 = f60452w;
        int i11 = ((-1) << 1) - ((((i10 | 70) << 1) - (i10 ^ 70)) ^ (-1));
        f60451v = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(getbeeponfailure, "");
        try {
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            if (!(!((Boolean) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -927948209, 927948212, System.identityHashCode(setscrollcontainer))).booleanValue())) {
                int i13 = f60451v + 9;
                f60452w = i13 % 128;
                int i14 = i13 % 2;
                if (((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).isEmpty()) {
                    int i15 = f60451v;
                    int i16 = i15 & 15;
                    int i17 = -(-((i15 ^ 15) | i16));
                    int i18 = (i16 & i17) + (i17 | i16);
                    int i19 = i18 % 128;
                    f60452w = i19;
                    int i20 = i18 % 2;
                    int i21 = (i19 & (-2)) | ((~i19) & 1);
                    int i22 = -(-((i19 & 1) << 1));
                    int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                    f60451v = i23 % 128;
                    int i24 = i23 % 2;
                    return true;
                }
                Iterator it = ((List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure))).iterator();
                int i25 = f60452w;
                int i26 = i25 & 23;
                int i27 = (((i25 ^ 23) | i26) << 1) - ((i25 | 23) & (~i26));
                f60451v = i27 % 128;
                int i28 = i27 % 2;
                boolean z10 = false;
                while (it.hasNext()) {
                    int i29 = f60451v;
                    int i30 = (i29 & (-108)) | (107 & (~i29));
                    int i31 = -(-((i29 & 107) << 1));
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    f60452w = i32 % 128;
                    if (i32 % 2 != 0) {
                        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) it.next();
                        boolean dividerPadding = setDividerPadding(getbeeponfailure2, terminalCreationFailure);
                        if (!dividerPadding) {
                            int i33 = f60451v;
                            int i34 = i33 & 85;
                            int i35 = -(-((i33 ^ 85) | i34));
                            int i36 = (i34 & i35) + (i35 | i34);
                            f60452w = i36 % 128;
                            int i37 = i36 % 2;
                            SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                            setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 865402441, -865402437, System.identityHashCode(getbeeponfailure2));
                            SouthPacificEndpoint.setX(new Object[]{20031, (getDetailsFieldTextSizeSp) setOnMenuItemClickListener.setOnFocusChangeListener(new Object[]{(String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2))}, 1240364979, -1240364979, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20031);
                            int i38 = ((-1) << 1) - ((f60452w + 54) ^ (-1));
                            f60451v = i38 % 128;
                            int i39 = i38 % 2;
                            return dividerPadding;
                        }
                        int i40 = f60452w;
                        int i41 = i40 & 87;
                        int i42 = ((~i41) & (i40 | 87)) + (i41 << 1);
                        f60451v = i42 % 128;
                        int i43 = i42 % 2;
                        z10 = dividerPadding;
                    } else {
                        setDividerPadding((getBeepOnFailure) it.next(), terminalCreationFailure);
                        throw null;
                    }
                }
                int i44 = f60451v;
                int i45 = ((((i44 ^ 109) | (i44 & 109)) << 1) - (~(-(((~i44) & 109) | (i44 & (-110)))))) - 1;
                f60452w = i45 % 128;
                if (i45 % 2 != 0) {
                    return z10;
                }
                throw null;
            }
            boolean compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(getbeeponfailure, terminalCreationFailure);
            int i46 = f60451v;
            int i47 = i46 & 91;
            int i48 = (i47 - (~(-(-((i46 ^ 91) | i47))))) - 1;
            f60452w = i48 % 128;
            int i49 = i48 % 2;
            return compoundDrawableTintBlendMode;
        } catch (Exception e5) {
            SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
            SouthPacificEndpoint.setX(new Object[]{"Failed to parse and store card response"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
            SouthPacificEndpoint.setX(new Object[]{20032, (getDetailsFieldTextSizeSp) Iso4217Currency.setCompoundDrawableTintBlendMode(new Object[]{e5}, 940749687, -940749687, (int) System.currentTimeMillis()), 4}, 1336485880, -1336485874, 20032);
            return false;
        }
    }

    public final boolean setDividerPadding(@NotNull List<String> list) {
        return ((Boolean) setDividerPadding(new Object[]{this, list}, 318904434, -318904411, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setDividerPadding(@Nullable String str) {
        return ((Boolean) setDividerPadding(new Object[]{this, str}, -422205110, 422205136, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding(@NotNull TransactionFailed transactionFailed) {
        return (getBeepOnFailure) setDividerPadding(new Object[]{this, transactionFailed}, -1593889019, 1593889062, System.identityHashCode(this));
    }

    public final void setDividerPadding(@Nullable setSupportBackgroundTintMode setsupportbackgroundtintmode) throws Exception {
        setDividerPadding(new Object[]{this, setsupportbackgroundtintmode}, 346983986, -346983929, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull byte[] bArr) throws Exception {
        setDividerPadding(new Object[]{this, bArr}, 1069122946, -1069122918, System.identityHashCode(this));
    }
}
