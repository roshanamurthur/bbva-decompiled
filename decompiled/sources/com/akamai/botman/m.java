package com.akamai.botman;

import android.app.Application;
import android.os.SystemClock;
import android.util.Pair;
import b4.i;
import b4.j;
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
public final class m implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f26362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26364c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Future<aq<Pair<String, String>, Long, Long>> f26366e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final af f26370i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<j> f26365d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f26367f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<Pair<Integer, Long>> f26368g = new ArrayList<>();

    public class a implements Callable<aq<Pair<String, String>, Long, Long>> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ aq<Pair<String, String>, Long, Long> call() throws Exception {
            return m.this.e();
        }
    }

    public m(Application application, af afVar) {
        ap.a("MotionManager", "Initializing motion manager", new Throwable[0]);
        this.f26364c = SystemClock.uptimeMillis();
        this.f26362a = new i(application);
        this.f26370i = afVar;
    }

    public final void a() throws Exception {
        i iVar = this.f26362a;
        iVar.a();
        iVar.deleteObservers();
    }

    public final long b() {
        return this.f26365d.size();
    }

    public final String c() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (Pair<Integer, Long> pair : this.f26368g) {
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
            ap.c("MotionManager", "Exception in getBackgroundEvent", e5);
            b4.f.a(e5);
            return "";
        }
    }

    public final aq<Pair<String, String>, Long, Long> d() {
        Future<aq<Pair<String, String>, Long, Long>> future;
        aq<Pair<String, String>, Long, Long> aqVar = new aq<>(new Pair("", ""), 0L, 0L);
        try {
            Future<aq<Pair<String, String>, Long, Long>> future2 = this.f26366e;
            if (future2 != null) {
                try {
                    aqVar = future2.get();
                } catch (InterruptedException e5) {
                    ap.b("MotionManager", "Failed to get motion data: " + e5.getMessage(), new Throwable[0]);
                } catch (ExecutionException e7) {
                    ap.b("MotionManager", "Failed to get motion data: " + e7.getMessage(), new Throwable[0]);
                }
            }
            if (aqVar != null) {
                return aqVar;
            }
            a();
            aqVar = e();
            if (aqVar != null || (future = this.f26366e) == null) {
                return aqVar;
            }
            try {
                return future.get();
            } catch (InterruptedException e10) {
                ap.b("MotionManager", "Failed to get motion data: " + e10.getMessage(), new Throwable[0]);
                return aqVar;
            } catch (ExecutionException e11) {
                ap.b("MotionManager", "Failed to get motion data: " + e11.getMessage(), new Throwable[0]);
                return aqVar;
            }
        } catch (Exception e12) {
            ap.c("MotionManager", "Exception in MotionManager", e12);
            b4.f.a(e12);
            return aqVar;
        }
    }

    public final aq<Pair<String, String>, Long, Long> e() throws Throwable {
        AtomicBoolean atomicBoolean;
        boolean z10;
        String str;
        Object obj;
        Long l6;
        String str2;
        float[] fArr;
        ArrayList<j> arrayList;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        float[] fArr5;
        String str3 = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;
        ArrayList<j> arrayList2 = this.f26365d;
        if (arrayList2.size() <= 1) {
            return new aq<>(new Pair("", ""), 0L, 0L);
        }
        AtomicBoolean atomicBoolean2 = this.f26367f;
        if (!atomicBoolean2.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                int iA = (int) ao.a(arrayList2.size());
                float[] fArr6 = new float[iA];
                float[] fArr7 = new float[iA];
                float[] fArr8 = new float[iA];
                try {
                    float[] fArr9 = new float[iA];
                    float[] fArr10 = new float[iA];
                    float[] fArr11 = new float[iA];
                    l6 = 0L;
                    try {
                        float[] fArr12 = new float[iA];
                        obj = "";
                        try {
                            float[] fArr13 = new float[iA];
                            try {
                                try {
                                    float[] fArr14 = new float[iA];
                                    try {
                                        float[] fArr15 = new float[iA];
                                        long j10 = this.f26364c;
                                        Iterator<j> it = arrayList2.iterator();
                                        int i10 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str2 = str3;
                                                fArr = fArr15;
                                                arrayList = arrayList2;
                                                fArr2 = fArr14;
                                                fArr3 = fArr13;
                                                fArr4 = fArr11;
                                                fArr5 = fArr12;
                                                break;
                                            }
                                            arrayList = arrayList2;
                                            j next = it.next();
                                            str2 = str3;
                                            float f6 = next.f24805d;
                                            fArr = fArr15;
                                            long j11 = next.f24811j;
                                            fArr6[i10] = f6;
                                            fArr7[i10] = next.f24806e;
                                            fArr8[i10] = next.f24807f;
                                            fArr9[i10] = next.f24802a;
                                            fArr10[i10] = next.f24803b;
                                            fArr11[i10] = next.f24804c;
                                            fArr12[i10] = next.f24808g;
                                            fArr13[i10] = next.f24809h;
                                            fArr14[i10] = next.f24810i;
                                            fArr2 = fArr14;
                                            fArr3 = fArr13;
                                            fArr4 = fArr11;
                                            fArr5 = fArr12;
                                            long jMax = Math.max(0L, j11 - j10);
                                            if (next.f24812k && i10 != 0) {
                                                jMax = Math.max(0L, next.f24813l);
                                                this.f26368g.add(new Pair<>(Integer.valueOf(i10), Long.valueOf(j11 - j10)));
                                            }
                                            fArr[i10] = jMax;
                                            SystemClock.uptimeMillis();
                                            float f10 = fArr6[i10];
                                            float f11 = fArr7[i10];
                                            float f12 = fArr8[i10];
                                            float f13 = fArr9[i10];
                                            float f14 = fArr10[i10];
                                            float f15 = fArr4[i10];
                                            float f16 = fArr5[i10];
                                            float f17 = fArr3[i10];
                                            float f18 = fArr2[i10];
                                            int i11 = i10 + 1;
                                            if (i11 >= iA) {
                                                break;
                                            }
                                            fArr13 = fArr3;
                                            j10 = j11;
                                            i10 = i11;
                                            str3 = str2;
                                            arrayList2 = arrayList;
                                            fArr15 = fArr;
                                            fArr14 = fArr2;
                                            fArr11 = fArr4;
                                            fArr12 = fArr5;
                                        }
                                        Pair<String, Long> pairA = al.a(fArr6, 0.6f);
                                        Pair<String, Long> pairA2 = al.a(fArr7, 0.6f);
                                        Pair<String, Long> pairA3 = al.a(fArr8, 0.6f);
                                        Pair<String, Long> pairA4 = al.a(fArr9, 0.6f);
                                        Pair<String, Long> pairA5 = al.a(fArr10, 0.6f);
                                        Pair<String, Long> pairA6 = al.a(fArr4, 0.6f);
                                        Pair<String, Long> pairA7 = al.a(fArr5, 0.6f);
                                        Pair<String, Long> pairA8 = al.a(fArr3, 0.6f);
                                        Pair<String, Long> pairA9 = al.a(fArr2, 0.6f);
                                        Pair<String, Long> pairA10 = al.a(fArr, 0.0f);
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append((String) pairA.first);
                                        String str4 = str2;
                                        sb2.append(str4);
                                        sb2.append((String) pairA2.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA3.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA4.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA5.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA6.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA7.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA8.first);
                                        sb2.append(str4);
                                        sb2.append((String) pairA9.first);
                                        Pair pair = new Pair(sb2.toString(), pairA10.first);
                                        long jLongValue = ((Long) pairA.second).longValue() + ((Long) pairA2.second).longValue() + ((Long) pairA3.second).longValue() + ((Long) pairA4.second).longValue() + ((Long) pairA5.second).longValue() + ((Long) pairA6.second).longValue() + ((Long) pairA7.second).longValue() + ((Long) pairA8.second).longValue() + ((Long) pairA9.second).longValue();
                                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                                        try {
                                            str = "MotionManager";
                                            try {
                                                ap.a(str, "Motion Event Count: " + iA + "/" + arrayList.size(), new Throwable[0]);
                                                ap.a(str, "Motion SDCalc-Time: " + jUptimeMillis2 + "ms", new Throwable[0]);
                                                aq<Pair<String, String>, Long, Long> aqVar = new aq<>(pair, Long.valueOf(jLongValue), Long.valueOf((long) iA));
                                                atomicBoolean2.set(false);
                                                return aqVar;
                                            } catch (Exception e5) {
                                                e = e5;
                                                atomicBoolean = atomicBoolean2;
                                                try {
                                                    Throwable[] thArr = new Throwable[1];
                                                    try {
                                                        thArr[0] = e;
                                                        ap.b(str, "Exception in getting motion events", thArr);
                                                        b4.f.a(e);
                                                        atomicBoolean.set(false);
                                                        Object obj2 = obj;
                                                        Pair pair2 = new Pair(obj2, obj2);
                                                        Long l7 = l6;
                                                        return new aq<>(pair2, l7, l7);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z10 = false;
                                                        atomicBoolean.set(z10);
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z10 = false;
                                                    atomicBoolean.set(z10);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            atomicBoolean = atomicBoolean2;
                                            z10 = false;
                                            atomicBoolean.set(z10);
                                            throw th;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        atomicBoolean = atomicBoolean2;
                                        str = "MotionManager";
                                        Throwable[] thArr2 = new Throwable[1];
                                        thArr2[0] = e;
                                        ap.b(str, "Exception in getting motion events", thArr2);
                                        b4.f.a(e);
                                        atomicBoolean.set(false);
                                        Object obj3 = obj;
                                        Pair pair3 = new Pair(obj3, obj3);
                                        Long l10 = l6;
                                        return new aq<>(pair3, l10, l10);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    str = "MotionManager";
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                atomicBoolean = atomicBoolean2;
                                z10 = false;
                                atomicBoolean.set(z10);
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = "MotionManager";
                            atomicBoolean = atomicBoolean2;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = "MotionManager";
                        atomicBoolean = atomicBoolean2;
                        obj = "";
                    }
                } catch (Throwable th6) {
                    th = th6;
                    atomicBoolean = atomicBoolean2;
                }
            } catch (Exception e13) {
                e = e13;
                str = "MotionManager";
                atomicBoolean = atomicBoolean2;
                obj = "";
                l6 = 0L;
            }
        } catch (Throwable th7) {
            th = th7;
            atomicBoolean = atomicBoolean2;
            z10 = false;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null) {
            return;
        }
        ArrayList<j> arrayList = this.f26365d;
        try {
            if (arrayList.size() < 128) {
                if (arrayList.size() >= 32 && !this.f26369h) {
                    this.f26369h = true;
                    this.f26370i.i();
                }
                arrayList.add((j) obj);
                return;
            }
            a();
            Future<aq<Pair<String, String>, Long, Long>> future = this.f26366e;
            if (future != null && !future.isCancelled() && !this.f26366e.isDone()) {
                return;
            }
            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
            this.f26366e = executorServiceNewFixedThreadPool.submit(new a());
            executorServiceNewFixedThreadPool.shutdown();
        } catch (Exception e5) {
            ap.b("MotionManager", "Exception in processing motion event", e5);
            b4.f.a(e5);
        }
    }
}
