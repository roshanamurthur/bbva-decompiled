package com.akamai.botman;

import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.util.Pair;
import b4.l;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f26372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26374c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Future<aq<Pair<String, String>, Long, Long>> f26377f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final af f26380i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b4.k> f26375d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<Pair<Integer, Long>> f26376e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f26378g = new AtomicBoolean(false);

    public class a implements Callable<aq<Pair<String, String>, Long, Long>> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ aq<Pair<String, String>, Long, Long> call() throws Exception {
            return r.this.e();
        }
    }

    public r(Application application, af afVar) {
        ap.a("OrientationManager", "Initializing orientation manager", new Throwable[0]);
        this.f26374c = SystemClock.uptimeMillis();
        l lVar = new l();
        lVar.f24824u0 = false;
        lVar.v0 = false;
        lVar.f24825w0 = false;
        lVar.f24826x0 = false;
        lVar.f24827y0 = false;
        lVar.E0 = false;
        lVar.F0 = 0L;
        lVar.G0 = new float[3];
        lVar.H0 = new float[3];
        lVar.I0 = true;
        try {
            lVar.f24819p0 = (SensorManager) application.getSystemService("sensor");
        } catch (NullPointerException e5) {
            ap.c("OrientationListener", "Exception on getting sensor service", e5);
            b4.f.a(e5);
        }
        this.f26372a = lVar;
        this.f26380i = afVar;
    }

    public final void a() throws Exception {
        l lVar = this.f26372a;
        lVar.a();
        lVar.deleteObservers();
    }

    public final long b() {
        return this.f26375d.size();
    }

    public final String c() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (Pair<Integer, Long> pair : this.f26376e) {
                sb2.append(pair.first);
                sb2.append(",");
                sb2.append(pair.second);
                sb2.append(ReplenishLogic.ID_SEPARATOR);
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Exception e5) {
            ap.c("OrientationManager", "Exception in getBackgroundEvent", e5);
            b4.f.a(e5);
            return "";
        }
    }

    public final aq<Pair<String, String>, Long, Long> d() {
        Future<aq<Pair<String, String>, Long, Long>> future;
        aq<Pair<String, String>, Long, Long> aqVar = new aq<>(new Pair("", ""), 0L, 0L);
        try {
            Future<aq<Pair<String, String>, Long, Long>> future2 = this.f26377f;
            if (future2 != null) {
                try {
                    aqVar = future2.get();
                } catch (InterruptedException e5) {
                    ap.b("OrientationManager", "Failed to get orientation data: " + e5.getMessage(), new Throwable[0]);
                } catch (ExecutionException e7) {
                    ap.b("OrientationManager", "Failed to get orientation data: " + e7.getMessage(), new Throwable[0]);
                }
            }
            if (aqVar != null) {
                return aqVar;
            }
            a();
            aqVar = e();
            if (aqVar != null || (future = this.f26377f) == null) {
                return aqVar;
            }
            try {
                return future.get();
            } catch (InterruptedException e10) {
                ap.b("OrientationManager", "Failed to get orientation data: " + e10.getMessage(), new Throwable[0]);
                return aqVar;
            } catch (ExecutionException e11) {
                ap.b("OrientationManager", "Failed to get orientation data: " + e11.getMessage(), new Throwable[0]);
                return aqVar;
            }
        } catch (Exception e12) {
            ap.c("OrientationManager", "Exception in OrientationManager", e12);
            b4.f.a(e12);
            return aqVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0121 A[LOOP:0: B:12:0x004b->B:65:0x0121, LOOP_END] */
    public final aq<Pair<String, String>, Long, Long> e() throws Throwable {
        String str;
        String str2;
        Long l6;
        AtomicBoolean atomicBoolean;
        boolean z10;
        ArrayList<b4.k> arrayList;
        AtomicBoolean atomicBoolean2;
        long j10;
        r rVar;
        int i10;
        r rVar2 = this;
        String str3 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
        String str4 = "OrientationManager";
        ArrayList<b4.k> arrayList2 = rVar2.f26375d;
        String str5 = "";
        Long l7 = 0L;
        if (arrayList2.size() <= 1) {
            return new aq<>(new Pair("", ""), l7, l7);
        }
        AtomicBoolean atomicBoolean3 = rVar2.f26378g;
        if (!atomicBoolean3.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iA = (int) ao.a(arrayList2.size());
                float[] fArr = new float[iA];
                float[] fArr2 = new float[iA];
                float[] fArr3 = new float[iA];
                float[] fArr4 = new float[iA];
                try {
                    long j11 = rVar2.f26374c;
                    Iterator<b4.k> it = arrayList2.iterator();
                    int i11 = 0;
                    while (true) {
                        l6 = l7;
                        if (!it.hasNext()) {
                            str3 = str3;
                            arrayList = arrayList2;
                            atomicBoolean2 = atomicBoolean3;
                            str2 = str5;
                            j10 = jUptimeMillis;
                            str = str4;
                            break;
                        }
                        try {
                            b4.k next = it.next();
                            str2 = str5;
                            atomicBoolean2 = atomicBoolean3;
                            try {
                                try {
                                    float[] fArr5 = new float[9];
                                    arrayList = arrayList2;
                                    j10 = jUptimeMillis;
                                    boolean rotationMatrix = SensorManager.getRotationMatrix(fArr5, new float[9], next.f24814a, next.f24815b);
                                    long j12 = next.f24816c;
                                    if (rotationMatrix) {
                                        float[] fArr6 = new float[3];
                                        SensorManager.getOrientation(fArr5, fArr6);
                                        try {
                                            float degrees = (float) Math.toDegrees(fArr6[0]);
                                            try {
                                                try {
                                                    float degrees2 = (float) Math.toDegrees(fArr6[1]);
                                                    float f6 = fArr6[2];
                                                    str = str4;
                                                    try {
                                                        float degrees3 = (float) Math.toDegrees(f6);
                                                        float f10 = degrees * (-1.0f);
                                                        if (f10 < 0.0f) {
                                                            f10 += 360.0f;
                                                        }
                                                        fArr[i11] = f10;
                                                        fArr2[i11] = degrees2 * (-1.0f);
                                                        fArr3[i11] = degrees3;
                                                        long jMax = Math.max(0L, j12 - j11);
                                                        if (!next.f24817d || i11 == 0) {
                                                            rVar = this;
                                                        } else {
                                                            jMax = Math.max(0L, next.f24818e);
                                                            rVar = this;
                                                            try {
                                                                try {
                                                                    rVar.f26376e.add(new Pair<>(Integer.valueOf(i11), Long.valueOf(j12 - j11)));
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    atomicBoolean = atomicBoolean2;
                                                                    try {
                                                                        Throwable[] thArr = new Throwable[1];
                                                                        try {
                                                                            thArr[0] = e;
                                                                            ap.b(str, "Exception in getting orientation events", thArr);
                                                                            b4.f.a(e);
                                                                            atomicBoolean.set(false);
                                                                            String str6 = str2;
                                                                            Pair pair = new Pair(str6, str6);
                                                                            Long l10 = l6;
                                                                            return new aq<>(pair, l10, l10);
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            z10 = false;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        z10 = false;
                                                                    }
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                atomicBoolean = atomicBoolean2;
                                                                z10 = false;
                                                            }
                                                        }
                                                        fArr4[i11] = jMax;
                                                        SystemClock.uptimeMillis();
                                                        float f11 = fArr[i11];
                                                        float f12 = fArr2[i11];
                                                        float f13 = fArr3[i11];
                                                        i10 = i11 + 1;
                                                        if (i10 >= iA) {
                                                            break;
                                                        }
                                                        i11 = i10;
                                                        rVar2 = rVar;
                                                        str4 = str;
                                                        j11 = j12;
                                                        str5 = str2;
                                                        l7 = l6;
                                                        atomicBoolean3 = atomicBoolean2;
                                                        arrayList2 = arrayList;
                                                        jUptimeMillis = j10;
                                                        str3 = str3;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        atomicBoolean = atomicBoolean2;
                                                        Throwable[] thArr2 = new Throwable[1];
                                                        thArr2[0] = e;
                                                        ap.b(str, "Exception in getting orientation events", thArr2);
                                                        b4.f.a(e);
                                                        atomicBoolean.set(false);
                                                        String str7 = str2;
                                                        Pair pair2 = new Pair(str7, str7);
                                                        Long l11 = l6;
                                                        return new aq<>(pair2, l11, l11);
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    atomicBoolean = atomicBoolean2;
                                                    z10 = false;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                str = str4;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            z10 = false;
                                            atomicBoolean = atomicBoolean2;
                                        }
                                    } else {
                                        str = str4;
                                        rVar = rVar2;
                                        fArr[i11] = 0.0f;
                                        fArr2[i11] = 0.0f;
                                        fArr3[i11] = 0.0f;
                                        try {
                                            ap.b(str, "Failed to get rotation matrix", new Throwable[0]);
                                            i10 = i11 + 1;
                                            if (i10 >= iA) {
                                                break;
                                                break;
                                            }
                                            i11 = i10;
                                            rVar2 = rVar;
                                            str4 = str;
                                            j11 = j12;
                                            str5 = str2;
                                            l7 = l6;
                                            atomicBoolean3 = atomicBoolean2;
                                            arrayList2 = arrayList;
                                            jUptimeMillis = j10;
                                            str3 = str3;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            z10 = false;
                                            atomicBoolean = atomicBoolean2;
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    str = str4;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = str4;
                            str2 = str5;
                            atomicBoolean = atomicBoolean3;
                            Throwable[] thArr3 = new Throwable[1];
                            thArr3[0] = e;
                            ap.b(str, "Exception in getting orientation events", thArr3);
                            b4.f.a(e);
                            atomicBoolean.set(false);
                            String str8 = str2;
                            Pair pair3 = new Pair(str8, str8);
                            Long l12 = l6;
                            return new aq<>(pair3, l12, l12);
                        }
                        atomicBoolean.set(z10);
                        throw th;
                    }
                    Pair<String, Long> pairA = al.a(fArr, 0.6f);
                    Pair<String, Long> pairA2 = al.a(fArr2, 0.6f);
                    Pair<String, Long> pairA3 = al.a(fArr3, 0.6f);
                    Pair<String, Long> pairA4 = al.a(fArr4, 0.0f);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) pairA.first);
                    String str9 = str3;
                    sb2.append(str9);
                    sb2.append((String) pairA2.first);
                    sb2.append(str9);
                    sb2.append((String) pairA3.first);
                    Pair pair4 = new Pair(sb2.toString(), pairA4.first);
                    long jLongValue = ((Long) pairA.second).longValue() + ((Long) pairA2.second).longValue() + ((Long) pairA3.second).longValue();
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - j10;
                    try {
                        ap.a(str, "Orientation Event Count: " + iA + "/" + arrayList.size(), new Throwable[0]);
                        ap.a(str, "Orientation SDCalc-Time: " + jUptimeMillis2 + "ms", new Throwable[0]);
                        aq<Pair<String, String>, Long, Long> aqVar = new aq<>(pair4, Long.valueOf(jLongValue), Long.valueOf((long) iA));
                        atomicBoolean2.set(false);
                        return aqVar;
                    } catch (Throwable th9) {
                        th = th9;
                        atomicBoolean = atomicBoolean2;
                        z10 = false;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    atomicBoolean = atomicBoolean3;
                }
            } catch (Throwable th11) {
                th = th11;
                atomicBoolean = atomicBoolean3;
                z10 = false;
            }
        } catch (Exception e13) {
            e = e13;
            str = str4;
            str2 = str5;
            l6 = l7;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList<b4.k> arrayList = this.f26375d;
        try {
            if (arrayList.size() < 128) {
                if (arrayList.size() >= 32 && !this.f26379h) {
                    this.f26379h = true;
                    this.f26380i.i();
                }
                arrayList.add((b4.k) obj);
                return;
            }
            a();
            Future<aq<Pair<String, String>, Long, Long>> future = this.f26377f;
            if (future != null && !future.isCancelled() && !this.f26377f.isDone()) {
                return;
            }
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
            this.f26377f = executorServiceNewFixedThreadPool.submit(new a());
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception e5) {
            ap.b("OrientationManager", "Exception in processing orientation event", e5);
            b4.f.a(e5);
        }
    }
}
