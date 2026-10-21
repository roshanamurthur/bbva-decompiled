package com.facetec.sdk;

import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.animation.core.AnimationKt;
import java.lang.ref.Reference;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class kd {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Executor f42007e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), kz.b("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f42008i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ll f42010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Runnable f42011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Deque<lm> f42012d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f42013f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f42014j;

    public kd() {
        this(TimeUnit.MINUTES);
    }

    public final boolean b(lm lmVar) {
        if (!f42008i && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (lmVar.f42336i || this.f42014j == 0) {
            this.f42012d.remove(lmVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public final long d(long j10) {
        synchronized (this) {
            try {
                lm lmVar = null;
                long j11 = Long.MIN_VALUE;
                int i10 = 0;
                int i11 = 0;
                for (lm lmVar2 : this.f42012d) {
                    List<Reference<lj>> list = lmVar2.m;
                    int i12 = 0;
                    while (true) {
                        if (i12 < list.size()) {
                            Reference<lj> reference = list.get(i12);
                            if (reference.get() != null) {
                                i12++;
                            } else {
                                StringBuilder sb2 = new StringBuilder("A connection to ");
                                sb2.append(lmVar2.b().a().e());
                                sb2.append(" was leaked. Did you forget to close a response body?");
                                mu.i().a(sb2.toString(), ((lj.c) reference).f42313c);
                                list.remove(i12);
                                lmVar2.f42336i = true;
                                if (list.isEmpty()) {
                                    lmVar2.f42338k = j10 - this.f42013f;
                                }
                            }
                        } else if (list.size() > 0) {
                            i11++;
                        }
                        i10++;
                        long j12 = j10 - lmVar2.f42338k;
                        if (j12 > j11) {
                            lmVar = lmVar2;
                            j11 = j12;
                        }
                    }
                }
                long j13 = this.f42013f;
                if (j11 < j13 && i10 <= this.f42014j) {
                    if (i10 > 0) {
                        return j13 - j11;
                    }
                    if (i11 > 0) {
                        return j13;
                    }
                    this.f42009a = false;
                    return -1L;
                }
                this.f42012d.remove(lmVar);
                kz.d(lmVar.a());
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private kd(TimeUnit timeUnit) {
        this.f42011c = new Runnable() { // from class: com.facetec.sdk.kd.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static long f42015c = 145615113179973991L;

            /* JADX WARN: Code duplicated, block: B:35:0x014e  */
            /* JADX WARN: Code duplicated, block: B:36:0x014f  */
            private static void a(String str, int i10, Object[] objArr) throws Throwable {
                Throwable cause;
                char[] charArray = str != null ? str.toCharArray() : str;
                gw gwVar = new gw();
                gwVar.f41836e = i10;
                int length = charArray.length;
                long[] jArr = new long[length];
                gwVar.f41835a = 0;
                while (true) {
                    int i11 = gwVar.f41835a;
                    if (i11 >= charArray.length) {
                        break;
                    }
                    try {
                        Object[] objArr2 = {Integer.valueOf(charArray[i11]), gwVar, gwVar};
                        Map map = bp.f40694x;
                        Object method = map.get(346539884);
                        if (method == null) {
                            method = ((Class) bp.a(KeyEvent.getDeadChar(0, 0) + 24, (ViewConfiguration.getScrollBarSize() >> 8) + 245, (char) (ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                            map.put(346539884, method);
                        }
                        jArr[i11] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f42015c ^ (-4932774504156859221L));
                        Object[] objArr3 = {gwVar, gwVar};
                        Object method2 = map.get(593077425);
                        if (method2 == null) {
                            method2 = ((Class) bp.a(22 - TextUtils.lastIndexOf("", '0', 0), 149 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))).getMethod("q", Object.class, Object.class);
                            map.put(593077425, method2);
                        }
                        ((Method) method2).invoke(null, objArr3);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                char[] cArr = new char[length];
                gwVar.f41835a = 0;
                while (true) {
                    int i12 = gwVar.f41835a;
                    if (i12 >= charArray.length) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i12] = (char) jArr[i12];
                    Object[] objArr4 = {gwVar, gwVar};
                    Map map2 = bp.f40694x;
                    Object method3 = map2.get(593077425);
                    if (method3 == null) {
                        method3 = ((Class) bp.a(23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 150 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("q", Object.class, Object.class);
                        map2.put(593077425, method3);
                    }
                    ((Method) method3).invoke(null, objArr4);
                }
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                while (true) {
                    kd kdVar = kd.this;
                    try {
                        Object[] objArr = new Object[1];
                        a("㶦ﻈ뭰瞂ぶ\ued59꧳橡⚃\ue36f鱭壢ᔃ톙鈯佊", 50021 - KeyEvent.normalizeMetaState(0), objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a("㶢岤ﾰẸ림\ud888算骖", 24841 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                        long jD = kdVar.d(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue());
                        if (jD == -1) {
                            return;
                        }
                        if (jD > 0) {
                            long j10 = jD / AnimationKt.MillisToNanos;
                            long j11 = jD - (AnimationKt.MillisToNanos * j10);
                            synchronized (kd.this) {
                                try {
                                    kd.this.wait(j10, (int) j11);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
            }
        };
        this.f42012d = new ArrayDeque();
        this.f42010b = new ll();
        this.f42014j = 5;
        this.f42013f = timeUnit.toNanos(5L);
    }
}
