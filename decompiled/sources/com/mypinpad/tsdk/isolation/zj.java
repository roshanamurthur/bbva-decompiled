package com.mypinpad.tsdk.isolation;

import bk.g;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class zj implements xp {
    public static int M0 = 0;
    public static int N0 = 1;
    public boolean E0;

    @Nullable
    public zg F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public volatile boolean J0;

    @Nullable
    public volatile zg K0;

    @Nullable
    public volatile zi L0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ym f62377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final yk f62378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f62379r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final zl f62380s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final yd f62381t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final setOnFocusChangeListener f62382u0;

    @NotNull
    public final AtomicBoolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public Object f62383w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public zk f62384x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public zi f62385y0;

    public static final class setCompoundDrawableTintBlendMode extends WeakReference<zj> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62386b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Object f62387a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setCompoundDrawableTintBlendMode(@NotNull zj zjVar, @Nullable Object obj) {
            super(zjVar);
            Intrinsics.checkNotNullParameter(zjVar, "");
            this.f62387a = obj;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            int i13 = f62386b;
            int i14 = ((i13 & 19) - (~(i13 | 19))) - 1;
            int i15 = i14 % 128;
            int i16 = i14 % 2;
            Object obj = setcompounddrawabletintblendmode.f62387a;
            if (i16 != 0) {
                int i17 = 66 / 0;
            }
            int i18 = (((i15 | 65) << 1) - (~(-(i15 ^ 65)))) - 1;
            f62386b = i18 % 128;
            int i19 = i18 % 2;
            return obj;
        }

        @Nullable
        public final Object setX() {
            return setOnFocusChangeListener(new Object[]{this}, -1316733665, 1316733665, System.identityHashCode(this));
        }
    }

    public static final class setOnFocusChangeListener extends abp {
        public setOnFocusChangeListener() {
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            zj zjVar = zj.this;
            zj.setDividerPadding(new Object[]{zjVar}, 179888853, -179888845, System.identityHashCode(zjVar));
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.abp
        public final void setDividerPadding() throws Throwable {
            setCompoundDrawableTintBlendMode(new Object[]{this}, -524702672, 524702672, System.identityHashCode(this));
        }
    }

    public final class setX implements Runnable {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
            if (i16 == 1) {
                ((setX) objArr[0]).getClass();
                throw null;
            }
            if (i16 != 2) {
                ((setX) objArr[0]).getClass();
                return null;
            }
            setX setx = (setX) objArr[0];
            Intrinsics.checkNotNullParameter((ExecutorService) objArr[1], "");
            setx.getClass();
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            setY(new Object[]{this}, -1019366531, 1019366532, System.identityHashCode(this));
        }

        public final void setOnFocusChangeListener(@NotNull ExecutorService executorService) {
            setY(new Object[]{this, executorService}, -1991988936, 1991988938, System.identityHashCode(this));
        }

        @NotNull
        public final AtomicInteger setX() {
            return (AtomicInteger) setY(new Object[]{this}, -326048689, 326048689, System.identityHashCode(this));
        }
    }

    public zj(@NotNull ym ymVar, @NotNull yk ykVar, boolean z10) {
        Intrinsics.checkNotNullParameter(ymVar, "");
        Intrinsics.checkNotNullParameter(ykVar, "");
        this.f62377p0 = ymVar;
        this.f62378q0 = ykVar;
        this.f62379r0 = z10;
        xw xwVar = (xw) ym.setY(new Object[]{ymVar}, -2095716679, 2095716680, System.identityHashCode(ymVar));
        this.f62380s0 = (zl) xw.setX(new Object[]{xwVar}, -225198590, 225198590, System.identityHashCode(xwVar));
        this.f62381t0 = ((yd.setX) ym.setY(new Object[]{ymVar}, 533873, -533873, System.identityHashCode(ymVar))).create(this);
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener();
        ym ymVar2 = (ym) setDividerPadding(new Object[]{this}, 274554588, -274554585, System.identityHashCode(this));
        setonfocuschangelistener.setOnFocusChangeListener(((Integer) ym.setY(new Object[]{ymVar2}, -1621896547, 1621896558, System.identityHashCode(ymVar2))).intValue(), TimeUnit.MILLISECONDS);
        this.f62382u0 = setonfocuschangelistener;
        this.v0 = new AtomicBoolean();
        this.I0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x013d  */
    public static /* synthetic */ yr a(Object[] objArr) throws Throwable {
        boolean z10;
        zj zjVar = (zj) objArr[0];
        ArrayList arrayList = new ArrayList();
        ym ymVar = zjVar.f62377p0;
        g.addAll(arrayList, (List) ym.setY(new Object[]{ymVar}, -1170442534, 1170442543, System.identityHashCode(ymVar)));
        ym ymVar2 = zjVar.f62377p0;
        arrayList.add(new zz(ymVar2));
        arrayList.add(new zq(ymVar2.setOnDragListener()));
        arrayList.add(new yv(ymVar2.setAlwaysDrawnWithCacheEnabled()));
        arrayList.add(zc.INSTANCE);
        boolean z11 = zjVar.f62379r0;
        if (!z11) {
            int i10 = N0;
            int i11 = i10 & 47;
            int i12 = i10 | 47;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            M0 = i13 % 128;
            int i14 = i13 % 2;
            g.addAll(arrayList, (List) ym.setY(new Object[]{ymVar2}, -771962759, 771962781, System.identityHashCode(ymVar2)));
            int i15 = N0;
            int i16 = i15 & 1;
            int i17 = (i15 | 1) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            M0 = i19 % 128;
            int i20 = i19 % 2;
        }
        arrayList.add(new zo(z11));
        zs zsVar = new zs(zjVar, arrayList, 0, null, zjVar.f62378q0, ymVar2.getSuppressed(), ymVar2.setMaxEms(), ymVar2.setImageResource());
        try {
            yr yrVar = (yr) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar, zjVar.f62378q0}, -173228024, 173228032, System.identityHashCode(zsVar));
            if (((Boolean) setDividerPadding(new Object[]{zjVar}, 1594554260, -1594554259, System.identityHashCode(zjVar))).booleanValue()) {
                yt.setDividerPadding(yrVar);
                throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
            }
            int i21 = M0;
            int i22 = i21 & 119;
            int i23 = ((i21 ^ 119) | i22) << 1;
            int i24 = -((i21 | 119) & (~i22));
            int i25 = (i23 & i24) + (i24 | i23);
            N0 = i25 % 128;
            int i26 = i25 % 2;
            return yrVar;
        } catch (IOException e5) {
            try {
                IOException iOException = (IOException) setDividerPadding(new Object[]{zjVar, e5}, 1558411227, -1558411208, System.identityHashCode(zjVar));
                if (iOException == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOException;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    int i27 = M0;
                    int i28 = ((i27 | 53) << 1) - (i27 ^ 53);
                    N0 = i28 % 128;
                    int i29 = i28 % 2;
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
            if (!z10) {
                int i210 = M0;
                int i211 = ((i210 | 53) << 1) - (i210 ^ 53);
                N0 = i211 % 128;
                int i212 = i211 % 2;
            }
            throw th;
        }
    }

    public static /* synthetic */ ym b(Object[] objArr) {
        zj zjVar = (zj) objArr[0];
        int i10 = M0;
        int i11 = ((i10 | 83) << 1) - (i10 ^ 83);
        int i12 = i11 % 128;
        N0 = i12;
        int i13 = i11 % 2;
        ym ymVar = zjVar.f62377p0;
        if (i13 == 0) {
            throw null;
        }
        int i14 = i12 + 84;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        M0 = i15 % 128;
        if (i15 % 2 == 0) {
            return ymVar;
        }
        throw null;
    }

    public static /* synthetic */ zg c(Object[] objArr) throws IOException {
        zj zjVar = (zj) objArr[0];
        zs zsVar = (zs) objArr[1];
        Intrinsics.checkNotNullParameter(zsVar, "");
        synchronized (zjVar) {
            if (!zjVar.I0) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!zjVar.H0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!zjVar.G0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        zk zkVar = zjVar.f62384x0;
        Intrinsics.checkNotNull(zkVar);
        zg zgVar = new zg(zjVar, zjVar.f62381t0, zkVar, (zu) zk.setCompoundDrawableTintBlendMode(new Object[]{zkVar, zjVar.f62377p0, zsVar}, -705604490, 705604494, System.identityHashCode(zkVar)));
        zjVar.F0 = zgVar;
        zjVar.K0 = zgVar;
        synchronized (zjVar) {
            zjVar.G0 = true;
            zjVar.H0 = true;
        }
        if (zjVar.J0) {
            throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
        }
        return zgVar;
    }

    public static /* synthetic */ void d(Object[] objArr) throws Throwable {
        zj zjVar = (zj) objArr[0];
        int i10 = M0;
        int i11 = i10 ^ 75;
        int i12 = ((i10 & 75) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        N0 = i14 % 128;
        int i15 = i14 % 2;
        if (zjVar.J0) {
            int i16 = (-2) - ((M0 + 16) ^ (-1));
            N0 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 39 / 0;
                return;
            }
            return;
        }
        zjVar.J0 = true;
        zg zgVar = zjVar.K0;
        if (zgVar == null) {
            int i18 = M0 + 97;
            int i19 = i18 % 128;
            N0 = i19;
            int i20 = i18 % 2;
            int i21 = i19 + 55;
            M0 = i21 % 128;
            int i22 = i21 % 2;
        } else {
            zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, 359803483, -359803480, System.identityHashCode(zgVar));
            int i23 = M0 + 123;
            N0 = i23 % 128;
            int i24 = i23 % 2;
        }
        zi ziVar = zjVar.L0;
        if (ziVar == null) {
            int i25 = M0;
            int i26 = (i25 ^ 93) + ((i25 & 93) << 1);
            int i27 = i26 % 128;
            N0 = i27;
            if (i26 % 2 == 0) {
                throw null;
            }
            int i28 = i27 & 85;
            int i29 = (i27 ^ 85) | i28;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            M0 = i30 % 128;
            int i31 = i30 % 2;
        } else {
            zi.setY(new Object[]{ziVar}, -1983939424, 1983939433, System.identityHashCode(ziVar));
            System.identityHashCode(zjVar);
            System.identityHashCode(zjVar);
        }
        yd.setCompoundDrawableTintBlendMode(new Object[]{zjVar}, 1190590264, -1190590255, (int) System.currentTimeMillis());
        int i32 = N0;
        int i33 = (((i32 | 34) << 1) - (i32 ^ 34)) - 1;
        M0 = i33 % 128;
        if (i33 % 2 != 0) {
            int i34 = 81 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    public static /* synthetic */ IOException e(Object[] objArr) throws Throwable {
        boolean z10;
        zj zjVar = (zj) objArr[0];
        IOException iOException = (IOException) objArr[1];
        synchronized (zjVar) {
            try {
                if (zjVar.I0) {
                    zjVar.I0 = false;
                    if (zjVar.G0 || zjVar.H0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? (IOException) setDividerPadding(new Object[]{zjVar, iOException}, -237568813, 237568837, System.identityHashCode(zjVar)) : iOException;
    }

    public static /* synthetic */ zj f(Object[] objArr) throws Throwable {
        zj zjVar = (zj) objArr[0];
        int i10 = N0;
        int i11 = (i10 ^ 5) + ((i10 & 5) << 1);
        M0 = i11 % 128;
        if (i11 % 2 == 0) {
            return (zj) setDividerPadding(new Object[]{zjVar}, 472588846, -472588844, System.identityHashCode(zjVar));
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:7:0x0032, B:16:0x0041, B:18:0x0045, B:19:0x0047, B:21:0x004b, B:26:0x0054, B:28:0x0058, B:33:0x0062, B:13:0x003b), top: B:45:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:7:0x0032, B:16:0x0041, B:18:0x0045, B:19:0x0047, B:21:0x004b, B:26:0x0054, B:28:0x0058, B:33:0x0062, B:13:0x003b), top: B:45:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    public static /* synthetic */ IOException g(Object[] objArr) throws Throwable {
        boolean z10;
        boolean z11;
        boolean z12;
        zj zjVar = (zj) objArr[0];
        zg zgVar = (zg) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        IOException iOException = (IOException) objArr[4];
        Intrinsics.checkNotNullParameter(zgVar, "");
        if (!Intrinsics.areEqual(zgVar, zjVar.K0)) {
            return iOException;
        }
        synchronized (zjVar) {
            if (zBooleanValue) {
                try {
                    if (zjVar.G0) {
                        if (zBooleanValue) {
                            zjVar.G0 = false;
                        }
                        if (zBooleanValue2) {
                            zjVar.H0 = false;
                        }
                        z12 = zjVar.G0;
                        if (z12) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z12) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                    } else if (zBooleanValue2 || !zjVar.H0) {
                        z11 = false;
                        z10 = false;
                    } else {
                        if (zBooleanValue) {
                            zjVar.G0 = false;
                        }
                        if (zBooleanValue2) {
                            zjVar.H0 = false;
                        }
                        z12 = zjVar.G0;
                        if (z12 || zjVar.H0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z12 || zjVar.H0 || zjVar.I0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                if (zBooleanValue2) {
                }
                z11 = false;
                z10 = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z10) {
            zjVar.K0 = null;
            zi ziVar = zjVar.f62385y0;
            if (ziVar != null) {
                ziVar.setLayoutAnimation();
            }
        }
        return z11 ? (IOException) setDividerPadding(new Object[]{zjVar, iOException}, -237568813, 237568837, System.identityHashCode(zjVar)) : iOException;
    }

    public static void h(Object[] objArr) throws Throwable {
        zj zjVar = (zj) objArr[0];
        yk ykVar = (yk) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        Intrinsics.checkNotNullParameter(ykVar, "");
        if (zjVar.F0 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        synchronized (zjVar) {
            if (!(!zjVar.H0)) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
            }
            if (!(!zjVar.G0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (zBooleanValue) {
            zjVar.f62384x0 = new zk(zjVar.f62380s0, (xh) setDividerPadding(new Object[]{zjVar, ykVar.setY()}, -1598468436, 1598468457, System.identityHashCode(zjVar)), zjVar, zjVar.f62381t0);
        }
    }

    public static /* synthetic */ Boolean i(Object[] objArr) {
        zj zjVar = (zj) objArr[0];
        int i10 = M0;
        int i11 = i10 & 49;
        int i12 = ((i10 | 49) & (~i11)) + (i11 << 1);
        N0 = i12 % 128;
        int i13 = i12 % 2;
        boolean z10 = zjVar.J0;
        int i14 = N0;
        int i15 = (i14 & 95) + (i14 | 95);
        M0 = i15 % 128;
        if (i15 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ void j(Object[] objArr) throws IOException {
        zg zgVar;
        zj zjVar = (zj) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        synchronized (zjVar) {
            if (!zjVar.I0) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (zBooleanValue && (zgVar = zjVar.K0) != null) {
            zg.setCompoundDrawableTintBlendMode(new Object[]{zgVar}, 1721893181, -1721893167, System.identityHashCode(zgVar));
        }
        zjVar.F0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x018d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0303  */
    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a7, code lost:
    
        if (java.lang.Thread.holdsLock(r1) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ae, code lost:
    
        if (java.lang.Thread.holdsLock(r1) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b1, code lost:
    
        r2 = new java.lang.StringBuilder("Thread ");
        r2.append((java.lang.Object) java.lang.Thread.currentThread().getName());
        r2.append(" MUST hold lock on ");
        r2.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d4, code lost:
    
        throw new java.lang.AssertionError(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0254, code lost:
    
        if ((!r0.E0) == true) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0259, code lost:
    
        if (r0.E0 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x025b, code lost:
    
        r2 = ((r6 & 70) + (r6 | 70)) - 1;
        com.mypinpad.tsdk.isolation.zj.M0 = r2 % 128;
        r2 = r2 % 2;
        r0.E0 = true;
        r0 = r0.f62382u0;
        ((java.lang.Boolean) com.mypinpad.tsdk.isolation.abp.setY(new java.lang.Object[]{r0}, -844782123, 844782128, java.lang.System.identityHashCode(r0))).booleanValue();
        r0 = com.mypinpad.tsdk.isolation.zj.N0;
        r1 = r0 & 29;
        r0 = -(-((r0 ^ 29) | r1));
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.zj.M0 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0291, code lost:
    
        if ((r2 % 2) != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0295, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0296, code lost:
    
        r0 = r2 & 77;
        r1 = (r2 ^ 77) | r0;
        r2 = ((r0 | r1) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.zj.N0 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b0, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r24, int r25, int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.zj.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final /* synthetic */ Object clone() {
        return setDividerPadding(new Object[]{this}, -1790640203, 1790640207, System.identityHashCode(this));
    }

    @Nullable
    public final Socket getNavBarTitleString() {
        return (Socket) setDividerPadding(new Object[]{this}, 1349461769, -1349461758, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.xp
    @NotNull
    public final yk setCompoundDrawableTintBlendMode() {
        return (yk) setDividerPadding(new Object[]{this}, 2084761454, -2084761448, System.identityHashCode(this));
    }

    @Nullable
    public final zg setLayoutAnimation() {
        return (zg) setDividerPadding(new Object[]{this}, -1953301162, 1953301175, System.identityHashCode(this));
    }

    public final void setNavigationOnClickListener() throws Throwable {
        setDividerPadding(new Object[]{this}, -1094292419, 1094292441, System.identityHashCode(this));
    }

    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1594554260, -1594554259, System.identityHashCode(this))).booleanValue();
    }

    public final <E extends IOException> E setOnFocusChangeListener(@NotNull zg zgVar, boolean z10, boolean z11, E e5) {
        return (E) setDividerPadding(new Object[]{this, zgVar, Boolean.valueOf(z10), Boolean.valueOf(z11), e5}, 1715022851, -1715022842, System.identityHashCode(this));
    }

    public final void setOnLongClickListener() throws Throwable {
        setDividerPadding(new Object[]{this}, 179888853, -179888845, System.identityHashCode(this));
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1192909483, 1192909501, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final zg setX(@NotNull zs zsVar) {
        return (zg) setDividerPadding(new Object[]{this, zsVar}, 1841712575, -1841712560, System.identityHashCode(this));
    }

    public final void setY(boolean z10) throws Throwable {
        setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1962710247, 1962710261, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull yk ykVar, boolean z10) throws Throwable {
        setDividerPadding(new Object[]{this, ykVar, Boolean.valueOf(z10)}, 44789820, -44789803, System.identityHashCode(this));
    }

    public final void setX(@Nullable zi ziVar) throws Throwable {
        setDividerPadding(new Object[]{this, ziVar}, -912912497, 912912509, System.identityHashCode(this));
    }

    public final void setY(@NotNull zi ziVar) throws Throwable {
        setDividerPadding(new Object[]{this, ziVar}, 529348108, -529348085, System.identityHashCode(this));
    }

    @NotNull
    public final yd setOnFocusChangeListener() {
        return (yd) setDividerPadding(new Object[]{this}, -2021984744, 2021984764, System.identityHashCode(this));
    }

    @NotNull
    public final ym setX() {
        return (ym) setDividerPadding(new Object[]{this}, 274554588, -274554585, System.identityHashCode(this));
    }

    @Nullable
    public final zi setY() {
        return (zi) setDividerPadding(new Object[]{this}, -1111096522, 1111096522, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.xp
    @NotNull
    public final yr setDividerPadding() {
        return (yr) setDividerPadding(new Object[]{this}, -1526483073, 1526483083, System.identityHashCode(this));
    }
}
