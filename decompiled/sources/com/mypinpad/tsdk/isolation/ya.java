package com.mypinpad.tsdk.isolation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class ya {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f62012g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f62013h = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ThreadPoolExecutor f62016c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62014a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62015b = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<zj.setX> f62017d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<zj.setX> f62018e = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<zj> f62019f = new ArrayDeque<>();

    public static /* synthetic */ void b(Object[] objArr) {
        ya yaVar = (ya) objArr[0];
        Deque deque = (Deque) objArr[1];
        Object obj = objArr[2];
        synchronized (yaVar) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            yaVar.d();
            Unit unit = Unit.INSTANCE;
        }
        ((Boolean) setOnFocusChangeListener(new Object[]{yaVar}, 1491901750, -1491901748, System.identityHashCode(yaVar))).booleanValue();
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int i13 = ~((~i10) | (~i11));
        int i14 = ~i12;
        int i15 = ((i13 | (~(i14 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829);
        int i16 = i10 | i11;
        int i17 = ((~i16) * 828) + ((i16 | i14) * (-828)) + i15;
        if (i17 == 1) {
            b(objArr);
            return null;
        }
        if (i17 != 2) {
            ya yaVar = (ya) objArr[0];
            zj zjVar = (zj) objArr[1];
            int i18 = f62012g;
            int i19 = i18 & 93;
            int i20 = i18 | 93;
            int i21 = (i19 & i20) + (i20 | i19);
            f62013h = i21 % 128;
            if (i21 % 2 == 0) {
                Intrinsics.checkNotNullParameter(zjVar, "");
                setOnFocusChangeListener(new Object[]{yaVar, yaVar.f62019f, zjVar}, -36717618, 36717619, System.identityHashCode(yaVar));
                throw null;
            }
            Intrinsics.checkNotNullParameter(zjVar, "");
            setOnFocusChangeListener(new Object[]{yaVar, yaVar.f62019f, zjVar}, -36717618, 36717619, System.identityHashCode(yaVar));
            int i22 = f62013h + 55;
            f62012g = i22 % 128;
            if (i22 % 2 == 0) {
                return null;
            }
            int i23 = 20 / 0;
            return null;
        }
        ya yaVar2 = (ya) objArr[0];
        if (yt.setOnFocusChangeListener && Thread.holdsLock(yaVar2)) {
            StringBuilder sb2 = new StringBuilder("Thread ");
            sb2.append((Object) Thread.currentThread().getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(yaVar2);
            throw new AssertionError(sb2.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (yaVar2) {
            try {
                Iterator<zj.setX> it = yaVar2.f62017d.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "");
                while (it.hasNext()) {
                    zj.setX next = it.next();
                    if (yaVar2.f62018e.size() >= yaVar2.f()) {
                        break;
                    }
                    if (((AtomicInteger) zj.setX.setY(new Object[]{next}, -326048689, 326048689, System.identityHashCode(next))).get() < yaVar2.e()) {
                        it.remove();
                        ((AtomicInteger) zj.setX.setY(new Object[]{next}, -326048689, 326048689, System.identityHashCode(next))).incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(next, "");
                        arrayList.add(next);
                        yaVar2.f62018e.add(next);
                    }
                }
                z10 = yaVar2.c() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        int i24 = 0;
        while (i24 < size) {
            int i25 = i24 - 106;
            zj.setX setx = (zj.setX) arrayList.get(i24);
            zj.setX.setY(new Object[]{setx, yaVar2.a()}, -1991988936, 1991988938, System.identityHashCode(setx));
            i24 = (-2) - ((((i25 ^ (-1)) + (i25 << 1)) + 109) ^ (-1));
        }
        return Boolean.valueOf(z10);
    }

    @JvmName(name = "executorService")
    @NotNull
    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            int i10 = f62012g;
            int i11 = i10 & 51;
            int i12 = (i10 ^ 51) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f62013h = i13 % 128;
            int i14 = i13 % 2;
            if (this.f62016c == null) {
                this.f62016c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), (ThreadFactory) yt.setY(new Object[]{Intrinsics.stringPlus(yt.setOnDragListener, " Dispatcher"), Boolean.FALSE}, 776175602, -776175568, (int) System.currentTimeMillis()));
                int i15 = f62013h;
                int i16 = (i15 ^ 121) + ((i15 & 121) << 1);
                f62012g = i16 % 128;
                int i17 = i16 % 2;
            }
            threadPoolExecutor = this.f62016c;
            Intrinsics.checkNotNull(threadPoolExecutor);
            int i18 = f62012g;
            int i19 = (i18 & (-104)) | ((~i18) & 103);
            int i20 = (i18 & 103) << 1;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f62013h = i21 % 128;
            int i22 = i21 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public final synchronized int c() {
        int i10;
        int i11 = f62012g;
        int i12 = (i11 ^ 1) + ((i11 & 1) << 1);
        f62013h = i12 % 128;
        int i13 = i12 % 2;
        int size = this.f62018e.size();
        int size2 = this.f62019f.size();
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = size2 * 477;
        int i15 = size * (-475);
        int i16 = ((i14 & i15) - (~(i14 | i15))) - 1;
        int i17 = (~size2) & ((~size2) | size2);
        int i18 = i17 & size;
        int i19 = (i17 | size) & (~i18);
        int i20 = ~size;
        int i21 = i19 | i18;
        int i22 = (i21 | (~i21)) & (~i21);
        int i23 = (i20 ^ size2) | (i20 & size2);
        int i24 = ~((i23 & iIdentityHashCode) | (i23 ^ iIdentityHashCode));
        int i25 = -(-(((i22 & i24) | (i22 ^ i24)) * (-476)));
        int i26 = i16 & i25;
        int i27 = -(-((i25 ^ i16) | i26));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        int i29 = ~size;
        int i30 = i29 ^ size2;
        int i31 = i29 & size2;
        int i32 = (i30 & i31) | (i30 ^ i31);
        int i33 = i32 ^ iIdentityHashCode;
        int i34 = ~iIdentityHashCode;
        int i35 = i32 & iIdentityHashCode;
        int i36 = -(~((~((i35 & i33) | (i33 ^ i35))) * 952));
        int i37 = ((-1) << 1) - (((i28 & i36) + (i36 | i28)) ^ (-1));
        int i38 = (iIdentityHashCode | i34) & (~iIdentityHashCode);
        int i39 = i29 & i38;
        int i40 = ((i29 | i38) & (~i39)) | i39;
        int i41 = (~((i40 & size2) | (i40 ^ size2))) * 476;
        i10 = (i37 ^ i41) + ((i41 & i37) << 1);
        int i42 = f62012g;
        int i43 = ((i42 & (-118)) | ((~i42) & 117)) + ((i42 & 117) << 1);
        f62013h = i43 % 128;
        int i44 = i43 % 2;
        return i10;
    }

    @Nullable
    public final synchronized void d() {
        int i10 = f62013h;
        int i11 = (((i10 | 72) << 1) - (i10 ^ 72)) - 1;
        int i12 = i11 % 128;
        f62012g = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i13 = ((((i12 ^ 65) | (i12 & 65)) << 1) - (~(-(((~i12) & 65) | (i12 & (-66)))))) - 1;
        f62013h = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 40 / 0;
            return;
        }
        return;
        throw th;
    }

    public final synchronized int e() {
        int i10;
        int i11 = f62012g + 19;
        int i12 = i11 % 128;
        f62013h = i12;
        int i13 = i11 % 2;
        i10 = this.f62015b;
        int i14 = i12 + 69;
        f62012g = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        return i10;
    }

    public final synchronized int f() {
        int i10;
        int i11 = f62012g;
        int i12 = i11 ^ 19;
        int i13 = (i11 & 19) << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        int i15 = i14 % 128;
        f62013h = i15;
        int i16 = i14 % 2;
        i10 = this.f62014a;
        int i17 = (i15 & 113) + (i15 | 113);
        f62012g = i17 % 128;
        int i18 = i17 % 2;
        return i10;
    }

    public final synchronized void setDividerPadding(@NotNull zj zjVar) {
        int i10 = f62013h;
        int i11 = ((i10 ^ 18) + ((i10 & 18) << 1)) - 1;
        f62012g = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(zjVar, "");
        this.f62019f.add(zjVar);
        int i13 = f62013h;
        int i14 = ((i13 & (-14)) | ((~i13) & 13)) + ((i13 & 13) << 1);
        f62012g = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnFocusChangeListener(@NotNull zj zjVar) {
        setOnFocusChangeListener(new Object[]{this, zjVar}, 2056459602, -2056459602, System.identityHashCode(this));
    }
}
