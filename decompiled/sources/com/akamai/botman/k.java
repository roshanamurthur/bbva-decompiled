package com.akamai.botman;

import android.app.Application;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import b4.h;
import b4.i;
import b4.l;
import b4.o;
import b4.p;
import b4.q;
import com.akamai.botman.ah.b;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.cyberfend.cyfsecurity.SensorDataBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.time.DurationKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements af {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ArrayList<Integer> f26344o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f26345p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static boolean f26346q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f26347r = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26358k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26360n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f26348a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f26349b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f26350c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ac f26351d = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b4.d f26354g = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f26352e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q f26355h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f26356i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f26357j = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Date f26359l = null;
    public boolean m = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26353f = true;

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            kVar.a();
            kVar.f26356i.compareAndSet(true, false);
        }
    }

    public static void b() {
        b4.a.f24773r0 = true;
    }

    public final synchronized String a() {
        try {
            ap.a("CYFManager", "Getting sensor data", new Throwable[0]);
            String strJ = "default-mobile";
            try {
                if (this.f26349b != null && this.f26350c != null) {
                    strJ = j();
                    ap.a("CYFManager", "Sensor Data: ".concat(String.valueOf(strJ)), new Throwable[0]);
                    return strJ;
                }
                ap.c("CYFManager", "AkamaiBMP SDK is not initialized", new Throwable[0]);
                return "default-mobile";
            } catch (Exception e5) {
                ap.c("CYFManager", "Failed to get sensor data", e5);
                b4.f.a(e5);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        try {
            r rVar = this.f26350c;
            ArrayList<b4.k> arrayList = rVar.f26375d;
            l lVar = rVar.f26372a;
            if (arrayList.size() >= 128 || rVar.f26378g.get()) {
                return;
            }
            SensorManager sensorManager = lVar.f24819p0;
            lVar.f24820q0 = sensorManager.getDefaultSensor(1);
            lVar.f24821r0 = sensorManager.getDefaultSensor(2);
            HandlerThread handlerThread = new HandlerThread("CYFOrientationListener");
            lVar.f24823t0 = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(lVar.f24823t0.getLooper());
            lVar.f24824u0 = sensorManager.registerListener(lVar, lVar.f24820q0, 1, handler);
            lVar.v0 = sensorManager.registerListener(lVar, lVar.f24821r0, 1, handler);
            Sensor defaultSensor = sensorManager.getDefaultSensor(9);
            lVar.f24822s0 = defaultSensor;
            boolean zRegisterListener = sensorManager.registerListener(lVar, defaultSensor, 1, handler);
            lVar.f24825w0 = zRegisterListener;
            if (zRegisterListener) {
                sensorManager.unregisterListener(lVar, lVar.f24820q0);
                lVar.f24824u0 = false;
                e.f26330g = 1;
            } else {
                e.f26330g = 0;
            }
            lVar.I0 = true;
            lVar.F0 = SystemClock.uptimeMillis();
            if ((lVar.f24824u0 || lVar.f24825w0) && lVar.v0) {
                rVar.f26373b = true;
                lVar.addObserver(rVar);
            } else {
                ap.c("OrientationListener", "Failed to register orientation listener", new Throwable[0]);
                lVar.a();
                ap.c("OrientationManager", "Orientation listener registration failed", new Throwable[0]);
            }
        } catch (Exception e5) {
            String message = e5.getMessage();
            CYFMonitor.CYFSDKInitCallback cYFSDKInitCallback = com.cyberfend.cyfsecurity.CYFMonitor.f39233a;
            if (cYFSDKInitCallback != null && !this.f26360n) {
                this.f26360n = true;
                cYFSDKInitCallback.onSDKInitFailure(message);
            }
            ap.c("CYFManager", "Exception in starting orientation manager", e5);
            b4.f.a(e5);
        }
    }

    public final synchronized void d() {
        try {
            this.f26350c.a();
        } catch (Exception e5) {
            ap.c("CYFManager", "Exception in stopping orientation manager", e5);
            b4.f.a(e5);
        }
    }

    public final synchronized void e() {
        try {
            m mVar = this.f26349b;
            if (mVar.f26365d.size() < 128 && !mVar.f26367f.get()) {
                i iVar = mVar.f26362a;
                iVar.f24794q0 = iVar.f24793p0.getDefaultSensor(1);
                iVar.f24795r0 = iVar.f24793p0.getDefaultSensor(4);
                HandlerThread handlerThread = new HandlerThread("CYFMotionListener");
                iVar.f24796s0 = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(iVar.f24796s0.getLooper());
                iVar.f24798u0 = iVar.f24793p0.registerListener(iVar, iVar.f24794q0, 1, handler);
                iVar.v0 = iVar.f24793p0.registerListener(iVar, iVar.f24795r0, 1, handler);
                ap.a("MotionListener", "GyroScope status " + iVar.v0 + " and Accelerometer status " + iVar.f24798u0, new Throwable[0]);
                boolean z10 = iVar.f24798u0;
                if (!z10 && !iVar.v0) {
                    ap.c("MotionListener", "Failed to register motion listener", new Throwable[0]);
                    iVar.a();
                    ap.c("MotionManager", "Motion listener registration failed", new Throwable[0]);
                    return;
                }
                iVar.f24800x0 = !z10;
                iVar.f24799w0 = !iVar.v0;
                iVar.f24797t0 = SystemClock.uptimeMillis();
                iVar.N0 = System.nanoTime();
                iVar.P0 = 0;
                iVar.Q0 = true;
                mVar.f26363b = true;
                mVar.f26362a.addObserver(mVar);
            }
        } catch (Exception e5) {
            String message = e5.getMessage();
            CYFMonitor.CYFSDKInitCallback cYFSDKInitCallback = com.cyberfend.cyfsecurity.CYFMonitor.f39233a;
            if (cYFSDKInitCallback != null && !this.f26360n) {
                this.f26360n = true;
                cYFSDKInitCallback.onSDKInitFailure(message);
            }
            ap.c("CYFManager", "Exception in starting motion manager", e5);
            b4.f.a(e5);
        }
    }

    public final synchronized void f() {
        try {
            this.f26349b.a();
        } catch (Exception e5) {
            ap.c("CYFManager", "Exception in stopping motion manager", e5);
            b4.f.a(e5);
        }
    }

    public final synchronized Boolean g() {
        if (this.f26359l == null) {
            return Boolean.FALSE;
        }
        Date date = new Date();
        date.getTime();
        this.f26359l.getTime();
        if ((date.getTime() - this.f26359l.getTime()) / 1000 > 300) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final synchronized int h() {
        return this.f26358k;
    }

    @Override // com.akamai.botman.af
    public final void i() {
        m mVar;
        r rVar;
        CYFMonitor.CYFSDKInitCallback cYFSDKInitCallback = com.cyberfend.cyfsecurity.CYFMonitor.f39233a;
        if (cYFSDKInitCallback == null || this.f26360n || (mVar = this.f26349b) == null || (rVar = this.f26350c) == null || !mVar.f26369h || !rVar.f26379h || !f26346q || !f26345p) {
            return;
        }
        boolean z10 = this.f26353f;
        if (!(z10 && f26347r) && z10) {
            return;
        }
        cYFSDKInitCallback.onSDKInitSuccess();
        this.f26360n = true;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x029c  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f6 A[Catch: Exception -> 0x030a, LOOP:0: B:114:0x02f0->B:116:0x02f6, LOOP_END, TryCatch #1 {Exception -> 0x030a, blocks: (B:113:0x02d4, B:114:0x02f0, B:116:0x02f6, B:119:0x030d), top: B:276:0x02d4 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0329  */
    /* JADX WARN: Code duplicated, block: B:126:0x038a  */
    /* JADX WARN: Code duplicated, block: B:129:0x039e  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x03c4 A[Catch: Exception -> 0x03fb, TRY_LEAVE, TryCatch #10 {Exception -> 0x03fb, blocks: (B:135:0x03be, B:137:0x03c4), top: B:294:0x03be }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0411  */
    /* JADX WARN: Code duplicated, block: B:157:0x0420  */
    /* JADX WARN: Code duplicated, block: B:158:0x0423 A[Catch: Exception -> 0x0420, TryCatch #8 {Exception -> 0x0420, blocks: (B:155:0x0418, B:158:0x0423), top: B:290:0x0418 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0427  */
    /* JADX WARN: Code duplicated, block: B:162:0x042b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0436  */
    /* JADX WARN: Code duplicated, block: B:166:0x0439 A[Catch: Exception -> 0x0436, TryCatch #5 {Exception -> 0x0436, blocks: (B:163:0x042e, B:166:0x0439), top: B:284:0x042e }] */
    /* JADX WARN: Code duplicated, block: B:168:0x043d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0440  */
    /* JADX WARN: Code duplicated, block: B:173:0x0472  */
    /* JADX WARN: Code duplicated, block: B:174:0x0474  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:178:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:181:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:182:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:185:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:190:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:193:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:195:0x06df  */
    /* JADX WARN: Code duplicated, block: B:197:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:199:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:203:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:206:0x0709 A[LOOP:3: B:204:0x0703->B:206:0x0709, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0730  */
    /* JADX WARN: Code duplicated, block: B:210:0x0739  */
    /* JADX WARN: Code duplicated, block: B:213:0x073e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0743  */
    /* JADX WARN: Code duplicated, block: B:219:0x0752  */
    /* JADX WARN: Code duplicated, block: B:223:0x0762  */
    /* JADX WARN: Code duplicated, block: B:227:0x07a8 A[Catch: Exception -> 0x07da, TryCatch #11 {Exception -> 0x07da, blocks: (B:225:0x07a4, B:227:0x07a8, B:229:0x07c4, B:231:0x07ca, B:233:0x07d2, B:237:0x07dc, B:238:0x07de, B:240:0x07e2, B:241:0x07e5), top: B:296:0x07a4 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x07c4 A[Catch: Exception -> 0x07da, TryCatch #11 {Exception -> 0x07da, blocks: (B:225:0x07a4, B:227:0x07a8, B:229:0x07c4, B:231:0x07ca, B:233:0x07d2, B:237:0x07dc, B:238:0x07de, B:240:0x07e2, B:241:0x07e5), top: B:296:0x07a4 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x07ca A[Catch: Exception -> 0x07da, TryCatch #11 {Exception -> 0x07da, blocks: (B:225:0x07a4, B:227:0x07a8, B:229:0x07c4, B:231:0x07ca, B:233:0x07d2, B:237:0x07dc, B:238:0x07de, B:240:0x07e2, B:241:0x07e5), top: B:296:0x07a4 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x07e2 A[Catch: Exception -> 0x07da, TryCatch #11 {Exception -> 0x07da, blocks: (B:225:0x07a4, B:227:0x07a8, B:229:0x07c4, B:231:0x07ca, B:233:0x07d2, B:237:0x07dc, B:238:0x07de, B:240:0x07e2, B:241:0x07e5), top: B:296:0x07a4 }] */
    /* JADX WARN: Code duplicated, block: B:246:0x0818  */
    /* JADX WARN: Code duplicated, block: B:250:0x0835 A[Catch: Exception -> 0x084b, TryCatch #0 {Exception -> 0x084b, blocks: (B:248:0x0824, B:250:0x0835, B:252:0x083b, B:254:0x0843, B:258:0x084d, B:259:0x084f, B:261:0x0865, B:263:0x086b, B:265:0x0873, B:266:0x0879, B:267:0x087c), top: B:274:0x0824 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x083b A[Catch: Exception -> 0x084b, TryCatch #0 {Exception -> 0x084b, blocks: (B:248:0x0824, B:250:0x0835, B:252:0x083b, B:254:0x0843, B:258:0x084d, B:259:0x084f, B:261:0x0865, B:263:0x086b, B:265:0x0873, B:266:0x0879, B:267:0x087c), top: B:274:0x0824 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0865 A[Catch: Exception -> 0x084b, TryCatch #0 {Exception -> 0x084b, blocks: (B:248:0x0824, B:250:0x0835, B:252:0x083b, B:254:0x0843, B:258:0x084d, B:259:0x084f, B:261:0x0865, B:263:0x086b, B:265:0x0873, B:266:0x0879, B:267:0x087c), top: B:274:0x0824 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x086b A[Catch: Exception -> 0x084b, TryCatch #0 {Exception -> 0x084b, blocks: (B:248:0x0824, B:250:0x0835, B:252:0x083b, B:254:0x0843, B:258:0x084d, B:259:0x084f, B:261:0x0865, B:263:0x086b, B:265:0x0873, B:266:0x0879, B:267:0x087c), top: B:274:0x0824 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0824 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x06f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x0201  */
    /* JADX WARN: Instruction removed from duplicated block: B:112:0x029c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final String j() throws Exception {
        String str;
        String str2;
        String str3;
        long j10;
        String str4;
        int i10;
        int i11;
        String str5;
        q qVar;
        String str6;
        String str7;
        String str8;
        aq<Pair<String, String>, Long, Long> aqVarD;
        String strC;
        String strC2;
        Pair<String, Long> pair;
        ac acVar;
        Pair<String, Long> pair2;
        z zVar;
        b4.d dVar;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i12;
        z zVar2;
        long j11;
        ac acVar2;
        long j12;
        ArrayList arrayList;
        g gVar;
        LinkedHashMap linkedHashMap;
        g gVar2;
        Object[] objArr;
        Iterator it;
        String strBuildN;
        g gVar3;
        String str15;
        r rVar;
        Future<aq<Pair<String, String>, Long, Long>> future;
        m mVar;
        Future<aq<Pair<String, String>, Long, Long>> future2;
        ac acVar3;
        z zVar3;
        Future<Pair<String, Long>> future3;
        int length;
        int i13;
        Object obj;
        m mVar2;
        r rVar2;
        String str16;
        String string;
        StringBuilder sb2;
        Looper looperMyLooper;
        String str17 = "Resetting values";
        String str18 = "dm_unr";
        String str19 = "CYFManager";
        ap.a("CYFManager", "Building sensor data: " + Thread.currentThread(), new Throwable[0]);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (b4.e.f24787c.equals("default_performance")) {
            try {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i14 = 0;
                int i15 = 0;
                int i16 = 1;
                while (true) {
                    if (i16 >= 1000000) {
                        break;
                    }
                    if (((4508713 % i16) * 11) % i16 == 0) {
                        i14++;
                    }
                    if (i16 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis2 > 2) {
                        break;
                    }
                    i15++;
                    i16++;
                }
                int i17 = i15 / 100;
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                float f6 = 33.34f;
                int i18 = 1;
                int i19 = 0;
                int i20 = 0;
                for (i10 = DurationKt.NANOS_IN_MILLIS; i18 < i10; i10 = DurationKt.NANOS_IN_MILLIS) {
                    f6 += i18;
                    if ((19.239f * f6) / 3.56f < 10000.0f) {
                        i19++;
                    }
                    if (i18 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis3 > 2) {
                        break;
                    }
                    i20++;
                    i18++;
                }
                int i21 = i19;
                int i22 = i20 / 100;
                long jUptimeMillis4 = SystemClock.uptimeMillis();
                double d2 = 1.0d;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    if (d2 >= 1000000.0d) {
                        str = str18;
                        break;
                    }
                    try {
                        if (Math.sqrt(d2) > 30.0d) {
                            i23++;
                        }
                        str = str18;
                        try {
                            if (((int) d2) % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis4 > 2) {
                                break;
                            }
                            i24++;
                            d2 += 1.0d;
                            str18 = str;
                        } catch (Exception e5) {
                            e = e5;
                            str2 = "do_unr";
                            str3 = "CYFManager";
                            j10 = jUptimeMillis;
                            b4.f.a(e);
                            str4 = "-1,-1,-1,-1,-1,-1,-1,-1,-1";
                            b4.e.f24787c = str4;
                            if (this.f26357j == null) {
                                looperMyLooper = Looper.myLooper();
                                if (looperMyLooper == null) {
                                    looperMyLooper = Looper.getMainLooper();
                                }
                                this.f26357j = new Handler(looperMyLooper);
                            }
                            if (com.cyberfend.cyfsecurity.CYFMonitor.f39233a != null) {
                                str5 = "1";
                            } else {
                                str5 = "0";
                            }
                            String str20 = str5;
                            String str21 = "";
                            if (this.f26349b.b() >= 32) {
                            }
                            String str22 = str3;
                            qVar = this.f26355h;
                            if (qVar != null) {
                                String str23 = qVar.f24828a;
                                str7 = qVar.f24829b + "," + qVar.f24830c + "," + qVar.f24831d + "," + qVar.f24832e + "," + qVar.f24833f + "," + qVar.f24834g;
                                try {
                                    ArrayList<Pair> arrayList2 = new ArrayList();
                                    arrayList2.add(new Pair("-2,3,-50,-301", p.e()));
                                    sb2 = new StringBuilder();
                                    for (Pair pair3 : arrayList2) {
                                        sb2.append(pair3.first);
                                        sb2.append(",");
                                        sb2.append(pair3.second);
                                    }
                                    string = sb2.toString();
                                } catch (Exception e7) {
                                    ap.c("CYFSystemInfoManager", "Exception in getNewDeviceInfo", e7);
                                    b4.f.a(e7);
                                    string = "default-info";
                                }
                                str8 = string;
                                str6 = str23;
                            } else {
                                str6 = "-1";
                                str7 = str6;
                                str8 = "";
                            }
                            int iA = o.a(str6);
                            String strValueOf = String.valueOf(new Random().nextInt());
                            String strValueOf2 = String.valueOf(e.f26324a / 2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str6);
                            sb3.append(",");
                            sb3.append(iA);
                            sb3.append(",");
                            sb3.append(strValueOf);
                            String strF = ad.d.f(sb3, ",", strValueOf2);
                            aqVarD = this.f26350c.d();
                            aq<Pair<String, String>, Long, Long> aqVarD2 = this.f26349b.d();
                            strC = this.f26350c.c();
                            strC2 = this.f26349b.c();
                            pair = new Pair<>("", 0L);
                            acVar = this.f26351d;
                            if (acVar != null) {
                                pair = acVar.a();
                            }
                            Pair<String, Long> pair4 = pair;
                            pair2 = new Pair<>("", 0L);
                            zVar = this.f26348a;
                            if (zVar != null) {
                                pair2 = zVar.b();
                            }
                            Pair<String, Long> pair5 = pair2;
                            String str24 = (String) pair5.first;
                            String str25 = (String) pair4.first;
                            String str26 = b4.e.f24785a;
                            dVar = this.f26354g;
                            try {
                                try {
                                    try {
                                        if (dVar != null) {
                                            ArrayList<Pair<String, Long>> arrayList3 = dVar.f24784p0;
                                            try {
                                                str10 = str7;
                                                str12 = "";
                                                for (Pair<String, Long> pair6 : arrayList3) {
                                                    try {
                                                        str9 = strC2;
                                                        try {
                                                            str11 = strC;
                                                            try {
                                                                str12 = str12 + ((String) pair6.first) + "," + pair6.second + ReplenishLogic.ID_SEPARATOR;
                                                                strC = str11;
                                                                strC2 = str9;
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                b4.f.a(e);
                                                                str12 = "";
                                                                rVar2 = this.f26350c;
                                                                if (rVar2.f26372a.E0) {
                                                                    str13 = str2;
                                                                } else {
                                                                    if (rVar2.f26373b) {
                                                                        str16 = "do_en";
                                                                    } else {
                                                                        str16 = "do_dis";
                                                                    }
                                                                    str13 = str16;
                                                                }
                                                                mVar2 = this.f26349b;
                                                                if (mVar2.f26362a.f24801y0) {
                                                                    str14 = str;
                                                                } else if (mVar2.f26363b) {
                                                                    str14 = "dm_en";
                                                                } else {
                                                                    str14 = "dm_dis";
                                                                }
                                                                String str27 = str13 + "," + str14 + ",t_en";
                                                                long jUptimeMillis5 = (SystemClock.uptimeMillis() - j10) * 1000;
                                                                if (Looper.myLooper() != Looper.getMainLooper()) {
                                                                    i12 = 1;
                                                                } else {
                                                                    i12 = 0;
                                                                }
                                                                boolean z10 = b4.a.f24773r0;
                                                                String str28 = str8;
                                                                String str29 = str12;
                                                                long jLongValue = aqVarD2.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair4.second).longValue() + ((Long) pair5.second).longValue();
                                                                int i25 = i12;
                                                                long jCurrentTimeMillis = System.currentTimeMillis() - e.f26324a;
                                                                zVar2 = this.f26348a;
                                                                if (zVar2 != null) {
                                                                    j11 = zVar2.f26387f;
                                                                } else {
                                                                    j11 = 0;
                                                                }
                                                                acVar2 = this.f26351d;
                                                                if (acVar2 != null) {
                                                                    j12 = acVar2.f26263d;
                                                                } else {
                                                                    j12 = 0;
                                                                }
                                                                String str30 = pair5.second + "," + pair4.second + "," + aqVarD.f26312b + "," + aqVarD2.f26312b + "," + jLongValue + "," + jCurrentTimeMillis + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD2.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis5 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue)) << 32) | (((long) ((int) (aqVarD2.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis) + "," + e.f26324a + "," + h();
                                                                String str31 = i25 + "," + (z10 ? 1 : 0);
                                                                Pair<String, String> pair7 = aqVarD.f26311a;
                                                                String str32 = (String) pair7.first;
                                                                String str33 = (String) pair7.second;
                                                                Pair<String, String> pair8 = aqVarD2.f26311a;
                                                                String str34 = (String) pair8.first;
                                                                String str35 = (String) pair8.second;
                                                                arrayList = new ArrayList();
                                                                arrayList.add(new Pair("", "3.3.9"));
                                                                gVar = this.f26352e;
                                                                if (gVar != null) {
                                                                    arrayList.add(new Pair("-90", this.f26352e.b()));
                                                                }
                                                                linkedHashMap = new LinkedHashMap();
                                                                linkedHashMap.put("-70", new Pair("-70", ""));
                                                                linkedHashMap.put("-80", new Pair("-80", ""));
                                                                linkedHashMap.put("-121", new Pair("-121", ""));
                                                                linkedHashMap.put("-100", new Pair("-100", strF));
                                                                linkedHashMap.put("-101", new Pair("-101", str27));
                                                                linkedHashMap.put("-102", new Pair("-102", str26));
                                                                linkedHashMap.put("-103", new Pair("-103", str29));
                                                                linkedHashMap.put("-104", new Pair("-104", str28));
                                                                linkedHashMap.put("-108", new Pair("-108", str24));
                                                                linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
                                                                linkedHashMap.put("-115", new Pair("-115", str30));
                                                                linkedHashMap.put("-117", new Pair("-117", str25));
                                                                linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
                                                                linkedHashMap.put("-144", new Pair("-144", str33));
                                                                linkedHashMap.put("-160", new Pair("-160", str11));
                                                                linkedHashMap.put("-142", new Pair("-142", str32));
                                                                linkedHashMap.put("-145", new Pair("-145", str35));
                                                                linkedHashMap.put("-161", new Pair("-161", str9));
                                                                linkedHashMap.put("-143", new Pair("-143", str34));
                                                                linkedHashMap.put("-150", new Pair("-150", str31));
                                                                linkedHashMap.put("-163", new Pair("-163", str10));
                                                                linkedHashMap.put("-240", new Pair("-240", str20));
                                                                gVar2 = this.f26352e;
                                                                if (gVar2 != null) {
                                                                    objArr = null;
                                                                } else {
                                                                    objArr = null;
                                                                }
                                                                if (objArr != null) {
                                                                    length = objArr.length;
                                                                    for (i13 = 0; i13 < length; i13++) {
                                                                        obj = objArr[i13];
                                                                        if (!linkedHashMap.containsKey(obj)) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    it = linkedHashMap.values().iterator();
                                                                    while (it.hasNext()) {
                                                                        arrayList.add((Pair) it.next());
                                                                    }
                                                                }
                                                                ap.a(str22, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
                                                                SensorDataBuilder.a();
                                                                if (SensorDataBuilder.f39252a) {
                                                                    strBuildN = null;
                                                                } else {
                                                                    strBuildN = SensorDataBuilder.a().buildN(arrayList);
                                                                }
                                                                gVar3 = this.f26352e;
                                                                if (gVar3 != null) {
                                                                    str15 = "";
                                                                } else {
                                                                    str15 = "";
                                                                }
                                                                if (aqVarD.f26313c.longValue() < 32) {
                                                                    ah ahVarA = ah.a();
                                                                    ahVarA.f26301b = strBuildN;
                                                                    new Thread(ahVarA.new b()).start();
                                                                    ah.a().b(str15);
                                                                } else {
                                                                    ah ahVarA2 = ah.a();
                                                                    ahVarA2.f26301b = strBuildN;
                                                                    new Thread(ahVarA2.new b()).start();
                                                                    ah.a().b(str15);
                                                                }
                                                                StringBuilder sbE = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
                                                                sbE.append(ag.f().h());
                                                                sbE.append(Constant.MXN_SYMBOL);
                                                                sbE.append(ae.a().i());
                                                                sbE.append(Constant.MXN_SYMBOL);
                                                                sbE.append(str15);
                                                                String string2 = sbE.toString();
                                                                acVar3 = this.f26351d;
                                                                if (acVar3 != null) {
                                                                    acVar3.f26261b = 0;
                                                                    acVar3.f26262c = 0;
                                                                    acVar3.f26263d = 0L;
                                                                    acVar3.f26264e = "";
                                                                    acVar3.f26268i = 0L;
                                                                    acVar3.f26260a = SystemClock.uptimeMillis();
                                                                    acVar3.f26265f.clear();
                                                                    future3 = acVar3.f26266g;
                                                                    if (future3 != null) {
                                                                        if (!future3.isCancelled()) {
                                                                            acVar3.f26266g.cancel(true);
                                                                        }
                                                                        acVar3.f26266g = null;
                                                                    }
                                                                }
                                                                zVar3 = this.f26348a;
                                                                if (zVar3 != null) {
                                                                    zVar3.a();
                                                                }
                                                                String str36 = str17;
                                                                ap.a("EventResult", str36, new Throwable[0]);
                                                                b4.e.f24785a = "";
                                                                b4.e.f24786b = "";
                                                                ap.a("Constants", str36, new Throwable[0]);
                                                                e.f26326c = SystemClock.uptimeMillis();
                                                                e.f26324a = System.currentTimeMillis();
                                                                if (aqVarD.f26313c.longValue() < 128) {
                                                                    try {
                                                                        rVar = this.f26350c;
                                                                        rVar.f26374c = SystemClock.uptimeMillis();
                                                                        rVar.f26375d.clear();
                                                                        future = rVar.f26377f;
                                                                        if (future != null) {
                                                                            if (!future.isCancelled()) {
                                                                                rVar.f26377f.cancel(true);
                                                                            }
                                                                            rVar.f26377f = null;
                                                                        }
                                                                        rVar.f26376e.clear();
                                                                        mVar = this.f26349b;
                                                                        mVar.f26364c = SystemClock.uptimeMillis();
                                                                        mVar.f26365d.clear();
                                                                        future2 = mVar.f26366e;
                                                                        if (future2 != null) {
                                                                            if (!future2.isCancelled()) {
                                                                                mVar.f26366e.cancel(true);
                                                                            }
                                                                            mVar.f26366e = null;
                                                                        }
                                                                        mVar.f26368g.clear();
                                                                    } catch (Exception e11) {
                                                                        b4.f.a(e11);
                                                                    }
                                                                } else {
                                                                    rVar = this.f26350c;
                                                                    rVar.f26374c = SystemClock.uptimeMillis();
                                                                    rVar.f26375d.clear();
                                                                    future = rVar.f26377f;
                                                                    if (future != null) {
                                                                        if (!future.isCancelled()) {
                                                                            rVar.f26377f.cancel(true);
                                                                        }
                                                                        rVar.f26377f = null;
                                                                    }
                                                                    rVar.f26376e.clear();
                                                                    mVar = this.f26349b;
                                                                    mVar.f26364c = SystemClock.uptimeMillis();
                                                                    mVar.f26365d.clear();
                                                                    future2 = mVar.f26366e;
                                                                    if (future2 != null) {
                                                                        if (!future2.isCancelled()) {
                                                                            mVar.f26366e.cancel(true);
                                                                        }
                                                                        mVar.f26366e = null;
                                                                    }
                                                                    mVar.f26368g.clear();
                                                                }
                                                                this.f26357j.post(new h(this));
                                                                return string2;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            str11 = strC;
                                                            b4.f.a(e);
                                                            str12 = "";
                                                            rVar2 = this.f26350c;
                                                            if (rVar2.f26372a.E0) {
                                                                str13 = str2;
                                                            } else {
                                                                if (rVar2.f26373b) {
                                                                    str16 = "do_dis";
                                                                } else {
                                                                    str16 = "do_en";
                                                                }
                                                                str13 = str16;
                                                            }
                                                            mVar2 = this.f26349b;
                                                            if (mVar2.f26362a.f24801y0) {
                                                                str14 = str;
                                                            } else if (mVar2.f26363b) {
                                                                str14 = "dm_dis";
                                                            } else {
                                                                str14 = "dm_en";
                                                            }
                                                            String str210 = str13 + "," + str14 + ",t_en";
                                                            long jUptimeMillis6 = (SystemClock.uptimeMillis() - j10) * 1000;
                                                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                                                i12 = 1;
                                                            } else {
                                                                i12 = 0;
                                                            }
                                                            boolean z11 = b4.a.f24773r0;
                                                            String str211 = str8;
                                                            String str212 = str12;
                                                            long jLongValue2 = aqVarD2.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair4.second).longValue() + ((Long) pair5.second).longValue();
                                                            int i26 = i12;
                                                            long jCurrentTimeMillis2 = System.currentTimeMillis() - e.f26324a;
                                                            zVar2 = this.f26348a;
                                                            if (zVar2 != null) {
                                                                j11 = zVar2.f26387f;
                                                            } else {
                                                                j11 = 0;
                                                            }
                                                            acVar2 = this.f26351d;
                                                            if (acVar2 != null) {
                                                                j12 = acVar2.f26263d;
                                                            } else {
                                                                j12 = 0;
                                                            }
                                                            String str37 = pair5.second + "," + pair4.second + "," + aqVarD.f26312b + "," + aqVarD2.f26312b + "," + jLongValue2 + "," + jCurrentTimeMillis2 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD2.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis6 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue2)) << 32) | (((long) ((int) (aqVarD2.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis2) + "," + e.f26324a + "," + h();
                                                            String str38 = i26 + "," + (z11 ? 1 : 0);
                                                            Pair<String, String> pair9 = aqVarD.f26311a;
                                                            String str39 = (String) pair9.first;
                                                            String str310 = (String) pair9.second;
                                                            Pair<String, String> pair10 = aqVarD2.f26311a;
                                                            String str311 = (String) pair10.first;
                                                            String str312 = (String) pair10.second;
                                                            arrayList = new ArrayList();
                                                            arrayList.add(new Pair("", "3.3.9"));
                                                            gVar = this.f26352e;
                                                            if (gVar != null) {
                                                                arrayList.add(new Pair("-90", this.f26352e.b()));
                                                            }
                                                            linkedHashMap = new LinkedHashMap();
                                                            linkedHashMap.put("-70", new Pair("-70", ""));
                                                            linkedHashMap.put("-80", new Pair("-80", ""));
                                                            linkedHashMap.put("-121", new Pair("-121", ""));
                                                            linkedHashMap.put("-100", new Pair("-100", strF));
                                                            linkedHashMap.put("-101", new Pair("-101", str210));
                                                            linkedHashMap.put("-102", new Pair("-102", str26));
                                                            linkedHashMap.put("-103", new Pair("-103", str212));
                                                            linkedHashMap.put("-104", new Pair("-104", str211));
                                                            linkedHashMap.put("-108", new Pair("-108", str24));
                                                            linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
                                                            linkedHashMap.put("-115", new Pair("-115", str37));
                                                            linkedHashMap.put("-117", new Pair("-117", str25));
                                                            linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
                                                            linkedHashMap.put("-144", new Pair("-144", str310));
                                                            linkedHashMap.put("-160", new Pair("-160", str11));
                                                            linkedHashMap.put("-142", new Pair("-142", str39));
                                                            linkedHashMap.put("-145", new Pair("-145", str312));
                                                            linkedHashMap.put("-161", new Pair("-161", str9));
                                                            linkedHashMap.put("-143", new Pair("-143", str311));
                                                            linkedHashMap.put("-150", new Pair("-150", str38));
                                                            linkedHashMap.put("-163", new Pair("-163", str10));
                                                            linkedHashMap.put("-240", new Pair("-240", str20));
                                                            gVar2 = this.f26352e;
                                                            if (gVar2 != null) {
                                                                objArr = null;
                                                            } else {
                                                                objArr = null;
                                                            }
                                                            if (objArr != null) {
                                                                length = objArr.length;
                                                                while (i13 < length) {
                                                                    obj = objArr[i13];
                                                                    if (!linkedHashMap.containsKey(obj)) {
                                                                    }
                                                                }
                                                            } else {
                                                                it = linkedHashMap.values().iterator();
                                                                while (it.hasNext()) {
                                                                    arrayList.add((Pair) it.next());
                                                                }
                                                            }
                                                            ap.a(str22, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
                                                            SensorDataBuilder.a();
                                                            if (SensorDataBuilder.f39252a) {
                                                                strBuildN = SensorDataBuilder.a().buildN(arrayList);
                                                            } else {
                                                                strBuildN = null;
                                                            }
                                                            gVar3 = this.f26352e;
                                                            if (gVar3 != null) {
                                                                str15 = "";
                                                            } else {
                                                                str15 = "";
                                                            }
                                                            if (aqVarD.f26313c.longValue() < 32) {
                                                                ah ahVarA3 = ah.a();
                                                                ahVarA3.f26301b = strBuildN;
                                                                new Thread(ahVarA3.new b()).start();
                                                                ah.a().b(str15);
                                                            } else {
                                                                ah ahVarA4 = ah.a();
                                                                ahVarA4.f26301b = strBuildN;
                                                                new Thread(ahVarA4.new b()).start();
                                                                ah.a().b(str15);
                                                            }
                                                            StringBuilder sbE2 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
                                                            sbE2.append(ag.f().h());
                                                            sbE2.append(Constant.MXN_SYMBOL);
                                                            sbE2.append(ae.a().i());
                                                            sbE2.append(Constant.MXN_SYMBOL);
                                                            sbE2.append(str15);
                                                            String string3 = sbE2.toString();
                                                            acVar3 = this.f26351d;
                                                            if (acVar3 != null) {
                                                                acVar3.f26261b = 0;
                                                                acVar3.f26262c = 0;
                                                                acVar3.f26263d = 0L;
                                                                acVar3.f26264e = "";
                                                                acVar3.f26268i = 0L;
                                                                acVar3.f26260a = SystemClock.uptimeMillis();
                                                                acVar3.f26265f.clear();
                                                                future3 = acVar3.f26266g;
                                                                if (future3 != null) {
                                                                    if (!future3.isCancelled()) {
                                                                        acVar3.f26266g.cancel(true);
                                                                    }
                                                                    acVar3.f26266g = null;
                                                                }
                                                            }
                                                            zVar3 = this.f26348a;
                                                            if (zVar3 != null) {
                                                                zVar3.a();
                                                            }
                                                            String str313 = str17;
                                                            ap.a("EventResult", str313, new Throwable[0]);
                                                            b4.e.f24785a = "";
                                                            b4.e.f24786b = "";
                                                            ap.a("Constants", str313, new Throwable[0]);
                                                            e.f26326c = SystemClock.uptimeMillis();
                                                            e.f26324a = System.currentTimeMillis();
                                                            if (aqVarD.f26313c.longValue() < 128) {
                                                                rVar = this.f26350c;
                                                                rVar.f26374c = SystemClock.uptimeMillis();
                                                                rVar.f26375d.clear();
                                                                future = rVar.f26377f;
                                                                if (future != null) {
                                                                    if (!future.isCancelled()) {
                                                                        rVar.f26377f.cancel(true);
                                                                    }
                                                                    rVar.f26377f = null;
                                                                }
                                                                rVar.f26376e.clear();
                                                                mVar = this.f26349b;
                                                                mVar.f26364c = SystemClock.uptimeMillis();
                                                                mVar.f26365d.clear();
                                                                future2 = mVar.f26366e;
                                                                if (future2 != null) {
                                                                    if (!future2.isCancelled()) {
                                                                        mVar.f26366e.cancel(true);
                                                                    }
                                                                    mVar.f26366e = null;
                                                                }
                                                                mVar.f26368g.clear();
                                                            } else {
                                                                rVar = this.f26350c;
                                                                rVar.f26374c = SystemClock.uptimeMillis();
                                                                rVar.f26375d.clear();
                                                                future = rVar.f26377f;
                                                                if (future != null) {
                                                                    if (!future.isCancelled()) {
                                                                        rVar.f26377f.cancel(true);
                                                                    }
                                                                    rVar.f26377f = null;
                                                                }
                                                                rVar.f26376e.clear();
                                                                mVar = this.f26349b;
                                                                mVar.f26364c = SystemClock.uptimeMillis();
                                                                mVar.f26365d.clear();
                                                                future2 = mVar.f26366e;
                                                                if (future2 != null) {
                                                                    if (!future2.isCancelled()) {
                                                                        mVar.f26366e.cancel(true);
                                                                    }
                                                                    mVar.f26366e = null;
                                                                }
                                                                mVar.f26368g.clear();
                                                            }
                                                            this.f26357j.post(new h(this));
                                                            return string3;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        str9 = strC2;
                                                    }
                                                }
                                                str9 = strC2;
                                                str11 = strC;
                                                arrayList3.clear();
                                            } catch (Exception e14) {
                                                e = e14;
                                                str9 = strC2;
                                                str10 = str7;
                                            }
                                            rVar2 = this.f26350c;
                                            if (rVar2.f26372a.E0) {
                                                str13 = str2;
                                            } else {
                                                if (rVar2.f26373b) {
                                                    str16 = "do_dis";
                                                } else {
                                                    str16 = "do_en";
                                                }
                                                str13 = str16;
                                            }
                                            mVar2 = this.f26349b;
                                            if (mVar2.f26362a.f24801y0) {
                                                str14 = str;
                                            } else if (mVar2.f26363b) {
                                                str14 = "dm_dis";
                                            } else {
                                                str14 = "dm_en";
                                            }
                                            String str213 = str13 + "," + str14 + ",t_en";
                                            long jUptimeMillis7 = (SystemClock.uptimeMillis() - j10) * 1000;
                                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                                i12 = 1;
                                            } else {
                                                i12 = 0;
                                            }
                                            boolean z12 = b4.a.f24773r0;
                                            String str214 = str8;
                                            String str215 = str12;
                                            long jLongValue3 = aqVarD2.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair4.second).longValue() + ((Long) pair5.second).longValue();
                                            int i27 = i12;
                                            long jCurrentTimeMillis3 = System.currentTimeMillis() - e.f26324a;
                                            zVar2 = this.f26348a;
                                            if (zVar2 != null) {
                                                j11 = zVar2.f26387f;
                                            } else {
                                                j11 = 0;
                                            }
                                            acVar2 = this.f26351d;
                                            if (acVar2 != null) {
                                                j12 = acVar2.f26263d;
                                            } else {
                                                j12 = 0;
                                            }
                                            String str314 = pair5.second + "," + pair4.second + "," + aqVarD.f26312b + "," + aqVarD2.f26312b + "," + jLongValue3 + "," + jCurrentTimeMillis3 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD2.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis7 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue3)) << 32) | (((long) ((int) (aqVarD2.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis3) + "," + e.f26324a + "," + h();
                                            String str315 = i27 + "," + (z12 ? 1 : 0);
                                            Pair<String, String> pair11 = aqVarD.f26311a;
                                            String str316 = (String) pair11.first;
                                            String str317 = (String) pair11.second;
                                            Pair<String, String> pair12 = aqVarD2.f26311a;
                                            String str318 = (String) pair12.first;
                                            String str319 = (String) pair12.second;
                                            arrayList = new ArrayList();
                                            arrayList.add(new Pair("", "3.3.9"));
                                            gVar = this.f26352e;
                                            if (gVar != null) {
                                                arrayList.add(new Pair("-90", this.f26352e.b()));
                                            }
                                            linkedHashMap = new LinkedHashMap();
                                            linkedHashMap.put("-70", new Pair("-70", ""));
                                            linkedHashMap.put("-80", new Pair("-80", ""));
                                            linkedHashMap.put("-121", new Pair("-121", ""));
                                            linkedHashMap.put("-100", new Pair("-100", strF));
                                            linkedHashMap.put("-101", new Pair("-101", str213));
                                            linkedHashMap.put("-102", new Pair("-102", str26));
                                            linkedHashMap.put("-103", new Pair("-103", str215));
                                            linkedHashMap.put("-104", new Pair("-104", str214));
                                            linkedHashMap.put("-108", new Pair("-108", str24));
                                            linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
                                            linkedHashMap.put("-115", new Pair("-115", str314));
                                            linkedHashMap.put("-117", new Pair("-117", str25));
                                            linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
                                            linkedHashMap.put("-144", new Pair("-144", str317));
                                            linkedHashMap.put("-160", new Pair("-160", str11));
                                            linkedHashMap.put("-142", new Pair("-142", str316));
                                            linkedHashMap.put("-145", new Pair("-145", str319));
                                            linkedHashMap.put("-161", new Pair("-161", str9));
                                            linkedHashMap.put("-143", new Pair("-143", str318));
                                            linkedHashMap.put("-150", new Pair("-150", str315));
                                            linkedHashMap.put("-163", new Pair("-163", str10));
                                            linkedHashMap.put("-240", new Pair("-240", str20));
                                            gVar2 = this.f26352e;
                                            if (gVar2 != null) {
                                                objArr = null;
                                            } else {
                                                objArr = null;
                                            }
                                            if (objArr != null) {
                                                length = objArr.length;
                                                while (i13 < length) {
                                                    obj = objArr[i13];
                                                    if (!linkedHashMap.containsKey(obj)) {
                                                    }
                                                }
                                            } else {
                                                it = linkedHashMap.values().iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add((Pair) it.next());
                                                }
                                            }
                                            ap.a(str22, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
                                            SensorDataBuilder.a();
                                            if (SensorDataBuilder.f39252a) {
                                                strBuildN = SensorDataBuilder.a().buildN(arrayList);
                                            } else {
                                                strBuildN = null;
                                            }
                                            gVar3 = this.f26352e;
                                            if (gVar3 != null) {
                                                str15 = "";
                                            } else {
                                                str15 = "";
                                            }
                                            if (aqVarD.f26313c.longValue() < 32) {
                                                ah ahVarA5 = ah.a();
                                                ahVarA5.f26301b = strBuildN;
                                                new Thread(ahVarA5.new b()).start();
                                                ah.a().b(str15);
                                            } else {
                                                ah ahVarA6 = ah.a();
                                                ahVarA6.f26301b = strBuildN;
                                                new Thread(ahVarA6.new b()).start();
                                                ah.a().b(str15);
                                            }
                                            StringBuilder sbE3 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
                                            sbE3.append(ag.f().h());
                                            sbE3.append(Constant.MXN_SYMBOL);
                                            sbE3.append(ae.a().i());
                                            sbE3.append(Constant.MXN_SYMBOL);
                                            sbE3.append(str15);
                                            String string4 = sbE3.toString();
                                            acVar3 = this.f26351d;
                                            if (acVar3 != null) {
                                                acVar3.f26261b = 0;
                                                acVar3.f26262c = 0;
                                                acVar3.f26263d = 0L;
                                                acVar3.f26264e = "";
                                                acVar3.f26268i = 0L;
                                                acVar3.f26260a = SystemClock.uptimeMillis();
                                                acVar3.f26265f.clear();
                                                future3 = acVar3.f26266g;
                                                if (future3 != null) {
                                                    if (!future3.isCancelled()) {
                                                        acVar3.f26266g.cancel(true);
                                                    }
                                                    acVar3.f26266g = null;
                                                }
                                            }
                                            zVar3 = this.f26348a;
                                            if (zVar3 != null) {
                                                zVar3.a();
                                            }
                                            String str3110 = str17;
                                            ap.a("EventResult", str3110, new Throwable[0]);
                                            b4.e.f24785a = "";
                                            b4.e.f24786b = "";
                                            ap.a("Constants", str3110, new Throwable[0]);
                                            e.f26326c = SystemClock.uptimeMillis();
                                            e.f26324a = System.currentTimeMillis();
                                            if (aqVarD.f26313c.longValue() < 128) {
                                                rVar = this.f26350c;
                                                rVar.f26374c = SystemClock.uptimeMillis();
                                                rVar.f26375d.clear();
                                                future = rVar.f26377f;
                                                if (future != null) {
                                                    if (!future.isCancelled()) {
                                                        rVar.f26377f.cancel(true);
                                                    }
                                                    rVar.f26377f = null;
                                                }
                                                rVar.f26376e.clear();
                                                mVar = this.f26349b;
                                                mVar.f26364c = SystemClock.uptimeMillis();
                                                mVar.f26365d.clear();
                                                future2 = mVar.f26366e;
                                                if (future2 != null) {
                                                    if (!future2.isCancelled()) {
                                                        mVar.f26366e.cancel(true);
                                                    }
                                                    mVar.f26366e = null;
                                                }
                                                mVar.f26368g.clear();
                                            } else {
                                                rVar = this.f26350c;
                                                rVar.f26374c = SystemClock.uptimeMillis();
                                                rVar.f26375d.clear();
                                                future = rVar.f26377f;
                                                if (future != null) {
                                                    if (!future.isCancelled()) {
                                                        rVar.f26377f.cancel(true);
                                                    }
                                                    rVar.f26377f = null;
                                                }
                                                rVar.f26376e.clear();
                                                mVar = this.f26349b;
                                                mVar.f26364c = SystemClock.uptimeMillis();
                                                mVar.f26365d.clear();
                                                future2 = mVar.f26366e;
                                                if (future2 != null) {
                                                    if (!future2.isCancelled()) {
                                                        mVar.f26366e.cancel(true);
                                                    }
                                                    mVar.f26366e = null;
                                                }
                                                mVar.f26368g.clear();
                                            }
                                            this.f26357j.post(new h(this));
                                            return string4;
                                        }
                                        str9 = strC2;
                                        str10 = str7;
                                        str11 = strC;
                                        acVar3 = this.f26351d;
                                        if (acVar3 != null) {
                                            acVar3.f26261b = 0;
                                            acVar3.f26262c = 0;
                                            acVar3.f26263d = 0L;
                                            acVar3.f26264e = "";
                                            acVar3.f26268i = 0L;
                                            acVar3.f26260a = SystemClock.uptimeMillis();
                                            acVar3.f26265f.clear();
                                            future3 = acVar3.f26266g;
                                            if (future3 != null) {
                                                if (!future3.isCancelled()) {
                                                    acVar3.f26266g.cancel(true);
                                                }
                                                acVar3.f26266g = null;
                                            }
                                        }
                                        zVar3 = this.f26348a;
                                        if (zVar3 != null) {
                                            zVar3.a();
                                        }
                                        String str3111 = str17;
                                        ap.a("EventResult", str3111, new Throwable[0]);
                                        b4.e.f24785a = "";
                                        b4.e.f24786b = "";
                                        ap.a("Constants", str3111, new Throwable[0]);
                                        e.f26326c = SystemClock.uptimeMillis();
                                        e.f26324a = System.currentTimeMillis();
                                    } catch (Exception e15) {
                                        b4.f.a(e15);
                                    }
                                    rVar2 = this.f26350c;
                                    if (rVar2.f26372a.E0) {
                                        str13 = str2;
                                    } else {
                                        if (rVar2.f26373b) {
                                            str16 = "do_dis";
                                        } else {
                                            str16 = "do_en";
                                        }
                                        str13 = str16;
                                    }
                                } catch (Exception unused) {
                                }
                                mVar2 = this.f26349b;
                                if (mVar2.f26362a.f24801y0) {
                                    str14 = str;
                                } else if (mVar2.f26363b) {
                                    str14 = "dm_dis";
                                } else {
                                    str14 = "dm_en";
                                }
                            } catch (Exception unused2) {
                            }
                            str12 = "";
                            String str216 = str13 + "," + str14 + ",t_en";
                            long jUptimeMillis8 = (SystemClock.uptimeMillis() - j10) * 1000;
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            boolean z13 = b4.a.f24773r0;
                            String str217 = str8;
                            String str218 = str12;
                            long jLongValue4 = aqVarD2.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair4.second).longValue() + ((Long) pair5.second).longValue();
                            int i28 = i12;
                            long jCurrentTimeMillis4 = System.currentTimeMillis() - e.f26324a;
                            zVar2 = this.f26348a;
                            if (zVar2 != null) {
                                j11 = zVar2.f26387f;
                            } else {
                                j11 = 0;
                            }
                            acVar2 = this.f26351d;
                            if (acVar2 != null) {
                                j12 = acVar2.f26263d;
                            } else {
                                j12 = 0;
                            }
                            String str3112 = pair5.second + "," + pair4.second + "," + aqVarD.f26312b + "," + aqVarD2.f26312b + "," + jLongValue4 + "," + jCurrentTimeMillis4 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD2.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis8 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue4)) << 32) | (((long) ((int) (aqVarD2.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis4) + "," + e.f26324a + "," + h();
                            String str3113 = i28 + "," + (z13 ? 1 : 0);
                            Pair<String, String> pair13 = aqVarD.f26311a;
                            String str3114 = (String) pair13.first;
                            String str3115 = (String) pair13.second;
                            Pair<String, String> pair14 = aqVarD2.f26311a;
                            String str3116 = (String) pair14.first;
                            String str3117 = (String) pair14.second;
                            arrayList = new ArrayList();
                            arrayList.add(new Pair("", "3.3.9"));
                            gVar = this.f26352e;
                            if (gVar != null) {
                                arrayList.add(new Pair("-90", this.f26352e.b()));
                            }
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("-70", new Pair("-70", ""));
                            linkedHashMap.put("-80", new Pair("-80", ""));
                            linkedHashMap.put("-121", new Pair("-121", ""));
                            linkedHashMap.put("-100", new Pair("-100", strF));
                            linkedHashMap.put("-101", new Pair("-101", str216));
                            linkedHashMap.put("-102", new Pair("-102", str26));
                            linkedHashMap.put("-103", new Pair("-103", str218));
                            linkedHashMap.put("-104", new Pair("-104", str217));
                            linkedHashMap.put("-108", new Pair("-108", str24));
                            linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
                            linkedHashMap.put("-115", new Pair("-115", str3112));
                            linkedHashMap.put("-117", new Pair("-117", str25));
                            linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
                            linkedHashMap.put("-144", new Pair("-144", str3115));
                            linkedHashMap.put("-160", new Pair("-160", str11));
                            linkedHashMap.put("-142", new Pair("-142", str3114));
                            linkedHashMap.put("-145", new Pair("-145", str3117));
                            linkedHashMap.put("-161", new Pair("-161", str9));
                            linkedHashMap.put("-143", new Pair("-143", str3116));
                            linkedHashMap.put("-150", new Pair("-150", str3113));
                            linkedHashMap.put("-163", new Pair("-163", str10));
                            linkedHashMap.put("-240", new Pair("-240", str20));
                            gVar2 = this.f26352e;
                            if (gVar2 != null) {
                                objArr = null;
                            } else {
                                objArr = null;
                            }
                            if (objArr != null) {
                                length = objArr.length;
                                while (i13 < length) {
                                    obj = objArr[i13];
                                    if (!linkedHashMap.containsKey(obj)) {
                                    }
                                }
                            } else {
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    arrayList.add((Pair) it.next());
                                }
                            }
                            ap.a(str22, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
                            SensorDataBuilder.a();
                            if (SensorDataBuilder.f39252a) {
                                strBuildN = SensorDataBuilder.a().buildN(arrayList);
                            } else {
                                strBuildN = null;
                            }
                            gVar3 = this.f26352e;
                            if (gVar3 != null) {
                                str15 = "";
                            } else {
                                str15 = "";
                            }
                            if (aqVarD.f26313c.longValue() < 32) {
                                ah ahVarA7 = ah.a();
                                ahVarA7.f26301b = strBuildN;
                                new Thread(ahVarA7.new b()).start();
                                ah.a().b(str15);
                            } else {
                                ah ahVarA8 = ah.a();
                                ahVarA8.f26301b = strBuildN;
                                new Thread(ahVarA8.new b()).start();
                                ah.a().b(str15);
                            }
                            StringBuilder sbE4 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
                            sbE4.append(ag.f().h());
                            sbE4.append(Constant.MXN_SYMBOL);
                            sbE4.append(ae.a().i());
                            sbE4.append(Constant.MXN_SYMBOL);
                            sbE4.append(str15);
                            String string5 = sbE4.toString();
                            if (aqVarD.f26313c.longValue() < 128) {
                                rVar = this.f26350c;
                                rVar.f26374c = SystemClock.uptimeMillis();
                                rVar.f26375d.clear();
                                future = rVar.f26377f;
                                if (future != null) {
                                    if (!future.isCancelled()) {
                                        rVar.f26377f.cancel(true);
                                    }
                                    rVar.f26377f = null;
                                }
                                rVar.f26376e.clear();
                                mVar = this.f26349b;
                                mVar.f26364c = SystemClock.uptimeMillis();
                                mVar.f26365d.clear();
                                future2 = mVar.f26366e;
                                if (future2 != null) {
                                    if (!future2.isCancelled()) {
                                        mVar.f26366e.cancel(true);
                                    }
                                    mVar.f26366e = null;
                                }
                                mVar.f26368g.clear();
                            } else {
                                rVar = this.f26350c;
                                rVar.f26374c = SystemClock.uptimeMillis();
                                rVar.f26375d.clear();
                                future = rVar.f26377f;
                                if (future != null) {
                                    if (!future.isCancelled()) {
                                        rVar.f26377f.cancel(true);
                                    }
                                    rVar.f26377f = null;
                                }
                                rVar.f26376e.clear();
                                mVar = this.f26349b;
                                mVar.f26364c = SystemClock.uptimeMillis();
                                mVar.f26365d.clear();
                                future2 = mVar.f26366e;
                                if (future2 != null) {
                                    if (!future2.isCancelled()) {
                                        mVar.f26366e.cancel(true);
                                    }
                                    mVar.f26366e = null;
                                }
                                mVar.f26368g.clear();
                            }
                            this.f26357j.post(new h(this));
                            return string5;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str = str18;
                        str2 = "do_unr";
                        str3 = "CYFManager";
                        j10 = jUptimeMillis;
                        b4.f.a(e);
                        str4 = "-1,-1,-1,-1,-1,-1,-1,-1,-1";
                        b4.e.f24787c = str4;
                        if (this.f26357j == null) {
                            looperMyLooper = Looper.myLooper();
                            if (looperMyLooper == null) {
                                looperMyLooper = Looper.getMainLooper();
                            }
                            this.f26357j = new Handler(looperMyLooper);
                        }
                        if (com.cyberfend.cyfsecurity.CYFMonitor.f39233a != null) {
                            str5 = "1";
                        } else {
                            str5 = "0";
                        }
                        String str219 = str5;
                        String str220 = "";
                        if (this.f26349b.b() >= 32) {
                        }
                        String str221 = str3;
                        qVar = this.f26355h;
                        if (qVar != null) {
                            String str222 = qVar.f24828a;
                            str7 = qVar.f24829b + "," + qVar.f24830c + "," + qVar.f24831d + "," + qVar.f24832e + "," + qVar.f24833f + "," + qVar.f24834g;
                            ArrayList<Pair> arrayList4 = new ArrayList();
                            arrayList4.add(new Pair("-2,3,-50,-301", p.e()));
                            sb2 = new StringBuilder();
                            while (r0.hasNext()) {
                                sb2.append(pair3.first);
                                sb2.append(",");
                                sb2.append(pair3.second);
                            }
                            string = sb2.toString();
                            str8 = string;
                            str6 = str222;
                        } else {
                            str6 = "-1";
                            str7 = str6;
                            str8 = "";
                        }
                        int iA2 = o.a(str6);
                        String strValueOf3 = String.valueOf(new Random().nextInt());
                        String strValueOf4 = String.valueOf(e.f26324a / 2);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str6);
                        sb4.append(",");
                        sb4.append(iA2);
                        sb4.append(",");
                        sb4.append(strValueOf3);
                        String strF2 = ad.d.f(sb4, ",", strValueOf4);
                        aqVarD = this.f26350c.d();
                        aq<Pair<String, String>, Long, Long> aqVarD3 = this.f26349b.d();
                        strC = this.f26350c.c();
                        strC2 = this.f26349b.c();
                        pair = new Pair<>("", 0L);
                        acVar = this.f26351d;
                        if (acVar != null) {
                            pair = acVar.a();
                        }
                        Pair<String, Long> pair15 = pair;
                        pair2 = new Pair<>("", 0L);
                        zVar = this.f26348a;
                        if (zVar != null) {
                            pair2 = zVar.b();
                        }
                        Pair<String, Long> pair16 = pair2;
                        String str223 = (String) pair16.first;
                        String str224 = (String) pair15.first;
                        String str225 = b4.e.f24785a;
                        dVar = this.f26354g;
                        if (dVar != null) {
                            ArrayList<Pair<String, Long>> arrayList5 = dVar.f24784p0;
                            str10 = str7;
                            str12 = "";
                            while (r28.hasNext()) {
                                str9 = strC2;
                                str11 = strC;
                                str12 = str12 + ((String) pair6.first) + "," + pair6.second + ReplenishLogic.ID_SEPARATOR;
                                strC = str11;
                                strC2 = str9;
                            }
                            str9 = strC2;
                            str11 = strC;
                            arrayList5.clear();
                            rVar2 = this.f26350c;
                            if (rVar2.f26372a.E0) {
                                str13 = str2;
                            } else {
                                if (rVar2.f26373b) {
                                    str16 = "do_dis";
                                } else {
                                    str16 = "do_en";
                                }
                                str13 = str16;
                            }
                            mVar2 = this.f26349b;
                            if (mVar2.f26362a.f24801y0) {
                                str14 = str;
                            } else if (mVar2.f26363b) {
                                str14 = "dm_dis";
                            } else {
                                str14 = "dm_en";
                            }
                            String str2110 = str13 + "," + str14 + ",t_en";
                            long jUptimeMillis9 = (SystemClock.uptimeMillis() - j10) * 1000;
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            boolean z14 = b4.a.f24773r0;
                            String str2111 = str8;
                            String str2112 = str12;
                            long jLongValue5 = aqVarD3.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair15.second).longValue() + ((Long) pair16.second).longValue();
                            int i29 = i12;
                            long jCurrentTimeMillis5 = System.currentTimeMillis() - e.f26324a;
                            zVar2 = this.f26348a;
                            if (zVar2 != null) {
                                j11 = zVar2.f26387f;
                            } else {
                                j11 = 0;
                            }
                            acVar2 = this.f26351d;
                            if (acVar2 != null) {
                                j12 = acVar2.f26263d;
                            } else {
                                j12 = 0;
                            }
                            String str3118 = pair16.second + "," + pair15.second + "," + aqVarD.f26312b + "," + aqVarD3.f26312b + "," + jLongValue5 + "," + jCurrentTimeMillis5 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD3.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis9 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue5)) << 32) | (((long) ((int) (aqVarD3.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis5) + "," + e.f26324a + "," + h();
                            String str3119 = i29 + "," + (z14 ? 1 : 0);
                            Pair<String, String> pair17 = aqVarD.f26311a;
                            String str31110 = (String) pair17.first;
                            String str31111 = (String) pair17.second;
                            Pair<String, String> pair18 = aqVarD3.f26311a;
                            String str31112 = (String) pair18.first;
                            String str31113 = (String) pair18.second;
                            arrayList = new ArrayList();
                            arrayList.add(new Pair("", "3.3.9"));
                            gVar = this.f26352e;
                            if (gVar != null) {
                                arrayList.add(new Pair("-90", this.f26352e.b()));
                            }
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("-70", new Pair("-70", ""));
                            linkedHashMap.put("-80", new Pair("-80", ""));
                            linkedHashMap.put("-121", new Pair("-121", ""));
                            linkedHashMap.put("-100", new Pair("-100", strF2));
                            linkedHashMap.put("-101", new Pair("-101", str2110));
                            linkedHashMap.put("-102", new Pair("-102", str225));
                            linkedHashMap.put("-103", new Pair("-103", str2112));
                            linkedHashMap.put("-104", new Pair("-104", str2111));
                            linkedHashMap.put("-108", new Pair("-108", str223));
                            linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
                            linkedHashMap.put("-115", new Pair("-115", str3118));
                            linkedHashMap.put("-117", new Pair("-117", str224));
                            linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
                            linkedHashMap.put("-144", new Pair("-144", str31111));
                            linkedHashMap.put("-160", new Pair("-160", str11));
                            linkedHashMap.put("-142", new Pair("-142", str31110));
                            linkedHashMap.put("-145", new Pair("-145", str31113));
                            linkedHashMap.put("-161", new Pair("-161", str9));
                            linkedHashMap.put("-143", new Pair("-143", str31112));
                            linkedHashMap.put("-150", new Pair("-150", str3119));
                            linkedHashMap.put("-163", new Pair("-163", str10));
                            linkedHashMap.put("-240", new Pair("-240", str219));
                            gVar2 = this.f26352e;
                            if (gVar2 != null) {
                                objArr = null;
                            } else {
                                objArr = null;
                            }
                            if (objArr != null) {
                                length = objArr.length;
                                while (i13 < length) {
                                    obj = objArr[i13];
                                    if (!linkedHashMap.containsKey(obj)) {
                                    }
                                }
                            } else {
                                it = linkedHashMap.values().iterator();
                                while (it.hasNext()) {
                                    arrayList.add((Pair) it.next());
                                }
                            }
                            ap.a(str221, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
                            SensorDataBuilder.a();
                            if (SensorDataBuilder.f39252a) {
                                strBuildN = SensorDataBuilder.a().buildN(arrayList);
                            } else {
                                strBuildN = null;
                            }
                            gVar3 = this.f26352e;
                            if (gVar3 != null) {
                                str15 = "";
                            } else {
                                str15 = "";
                            }
                            if (aqVarD.f26313c.longValue() < 32) {
                                ah ahVarA9 = ah.a();
                                ahVarA9.f26301b = strBuildN;
                                new Thread(ahVarA9.new b()).start();
                                ah.a().b(str15);
                            } else {
                                ah ahVarA10 = ah.a();
                                ahVarA10.f26301b = strBuildN;
                                new Thread(ahVarA10.new b()).start();
                                ah.a().b(str15);
                            }
                            StringBuilder sbE5 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
                            sbE5.append(ag.f().h());
                            sbE5.append(Constant.MXN_SYMBOL);
                            sbE5.append(ae.a().i());
                            sbE5.append(Constant.MXN_SYMBOL);
                            sbE5.append(str15);
                            String string6 = sbE5.toString();
                            acVar3 = this.f26351d;
                            if (acVar3 != null) {
                                acVar3.f26261b = 0;
                                acVar3.f26262c = 0;
                                acVar3.f26263d = 0L;
                                acVar3.f26264e = "";
                                acVar3.f26268i = 0L;
                                acVar3.f26260a = SystemClock.uptimeMillis();
                                acVar3.f26265f.clear();
                                future3 = acVar3.f26266g;
                                if (future3 != null) {
                                    if (!future3.isCancelled()) {
                                        acVar3.f26266g.cancel(true);
                                    }
                                    acVar3.f26266g = null;
                                }
                            }
                            zVar3 = this.f26348a;
                            if (zVar3 != null) {
                                zVar3.a();
                            }
                            String str31114 = str17;
                            ap.a("EventResult", str31114, new Throwable[0]);
                            b4.e.f24785a = "";
                            b4.e.f24786b = "";
                            ap.a("Constants", str31114, new Throwable[0]);
                            e.f26326c = SystemClock.uptimeMillis();
                            e.f26324a = System.currentTimeMillis();
                            if (aqVarD.f26313c.longValue() < 128) {
                                rVar = this.f26350c;
                                rVar.f26374c = SystemClock.uptimeMillis();
                                rVar.f26375d.clear();
                                future = rVar.f26377f;
                                if (future != null) {
                                    if (!future.isCancelled()) {
                                        rVar.f26377f.cancel(true);
                                    }
                                    rVar.f26377f = null;
                                }
                                rVar.f26376e.clear();
                                mVar = this.f26349b;
                                mVar.f26364c = SystemClock.uptimeMillis();
                                mVar.f26365d.clear();
                                future2 = mVar.f26366e;
                                if (future2 != null) {
                                    if (!future2.isCancelled()) {
                                        mVar.f26366e.cancel(true);
                                    }
                                    mVar.f26366e = null;
                                }
                                mVar.f26368g.clear();
                            } else {
                                rVar = this.f26350c;
                                rVar.f26374c = SystemClock.uptimeMillis();
                                rVar.f26375d.clear();
                                future = rVar.f26377f;
                                if (future != null) {
                                    if (!future.isCancelled()) {
                                        rVar.f26377f.cancel(true);
                                    }
                                    rVar.f26377f = null;
                                }
                                rVar.f26376e.clear();
                                mVar = this.f26349b;
                                mVar.f26364c = SystemClock.uptimeMillis();
                                mVar.f26365d.clear();
                                future2 = mVar.f26366e;
                                if (future2 != null) {
                                    if (!future2.isCancelled()) {
                                        mVar.f26366e.cancel(true);
                                    }
                                    mVar.f26366e = null;
                                }
                                mVar.f26368g.clear();
                            }
                            this.f26357j.post(new h(this));
                            return string6;
                        }
                        str9 = strC2;
                        str10 = str7;
                        str11 = strC;
                        str12 = "";
                        rVar2 = this.f26350c;
                        if (rVar2.f26372a.E0) {
                            str13 = str2;
                        } else {
                            if (rVar2.f26373b) {
                                str16 = "do_dis";
                            } else {
                                str16 = "do_en";
                            }
                            str13 = str16;
                        }
                        mVar2 = this.f26349b;
                        if (mVar2.f26362a.f24801y0) {
                            str14 = str;
                        } else if (mVar2.f26363b) {
                            str14 = "dm_dis";
                        } else {
                            str14 = "dm_en";
                        }
                        String str2113 = str13 + "," + str14 + ",t_en";
                        long jUptimeMillis10 = (SystemClock.uptimeMillis() - j10) * 1000;
                        if (Looper.myLooper() != Looper.getMainLooper()) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        boolean z15 = b4.a.f24773r0;
                        String str2114 = str8;
                        String str2115 = str12;
                        long jLongValue6 = aqVarD3.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair15.second).longValue() + ((Long) pair16.second).longValue();
                        int i210 = i12;
                        long jCurrentTimeMillis6 = System.currentTimeMillis() - e.f26324a;
                        zVar2 = this.f26348a;
                        if (zVar2 != null) {
                            j11 = zVar2.f26387f;
                        } else {
                            j11 = 0;
                        }
                        acVar2 = this.f26351d;
                        if (acVar2 != null) {
                            j12 = acVar2.f26263d;
                        } else {
                            j12 = 0;
                        }
                        String str31115 = pair16.second + "," + pair15.second + "," + aqVarD.f26312b + "," + aqVarD3.f26312b + "," + jLongValue6 + "," + jCurrentTimeMillis6 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD3.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis10 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue6)) << 32) | (((long) ((int) (aqVarD3.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis6) + "," + e.f26324a + "," + h();
                        String str31116 = i210 + "," + (z15 ? 1 : 0);
                        Pair<String, String> pair19 = aqVarD.f26311a;
                        String str31117 = (String) pair19.first;
                        String str31118 = (String) pair19.second;
                        Pair<String, String> pair110 = aqVarD3.f26311a;
                        String str31119 = (String) pair110.first;
                        String str311110 = (String) pair110.second;
                        arrayList = new ArrayList();
                        arrayList.add(new Pair("", "3.3.9"));
                        gVar = this.f26352e;
                        if (gVar != null) {
                            arrayList.add(new Pair("-90", this.f26352e.b()));
                        }
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("-70", new Pair("-70", ""));
                        linkedHashMap.put("-80", new Pair("-80", ""));
                        linkedHashMap.put("-121", new Pair("-121", ""));
                        linkedHashMap.put("-100", new Pair("-100", strF2));
                        linkedHashMap.put("-101", new Pair("-101", str2113));
                        linkedHashMap.put("-102", new Pair("-102", str225));
                        linkedHashMap.put("-103", new Pair("-103", str2115));
                        linkedHashMap.put("-104", new Pair("-104", str2114));
                        linkedHashMap.put("-108", new Pair("-108", str223));
                        linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
                        linkedHashMap.put("-115", new Pair("-115", str31115));
                        linkedHashMap.put("-117", new Pair("-117", str224));
                        linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
                        linkedHashMap.put("-144", new Pair("-144", str31118));
                        linkedHashMap.put("-160", new Pair("-160", str11));
                        linkedHashMap.put("-142", new Pair("-142", str31117));
                        linkedHashMap.put("-145", new Pair("-145", str311110));
                        linkedHashMap.put("-161", new Pair("-161", str9));
                        linkedHashMap.put("-143", new Pair("-143", str31119));
                        linkedHashMap.put("-150", new Pair("-150", str31116));
                        linkedHashMap.put("-163", new Pair("-163", str10));
                        linkedHashMap.put("-240", new Pair("-240", str219));
                        gVar2 = this.f26352e;
                        if (gVar2 != null) {
                            objArr = null;
                        } else {
                            objArr = null;
                        }
                        if (objArr != null) {
                            length = objArr.length;
                            while (i13 < length) {
                                obj = objArr[i13];
                                if (!linkedHashMap.containsKey(obj)) {
                                }
                            }
                        } else {
                            it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                                arrayList.add((Pair) it.next());
                            }
                        }
                        ap.a(str221, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
                        SensorDataBuilder.a();
                        if (SensorDataBuilder.f39252a) {
                            strBuildN = SensorDataBuilder.a().buildN(arrayList);
                        } else {
                            strBuildN = null;
                        }
                        gVar3 = this.f26352e;
                        if (gVar3 != null) {
                            str15 = "";
                        } else {
                            str15 = "";
                        }
                        if (aqVarD.f26313c.longValue() < 32) {
                            ah ahVarA11 = ah.a();
                            ahVarA11.f26301b = strBuildN;
                            new Thread(ahVarA11.new b()).start();
                            ah.a().b(str15);
                        } else {
                            ah ahVarA12 = ah.a();
                            ahVarA12.f26301b = strBuildN;
                            new Thread(ahVarA12.new b()).start();
                            ah.a().b(str15);
                        }
                        StringBuilder sbE6 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
                        sbE6.append(ag.f().h());
                        sbE6.append(Constant.MXN_SYMBOL);
                        sbE6.append(ae.a().i());
                        sbE6.append(Constant.MXN_SYMBOL);
                        sbE6.append(str15);
                        String string7 = sbE6.toString();
                        acVar3 = this.f26351d;
                        if (acVar3 != null) {
                            acVar3.f26261b = 0;
                            acVar3.f26262c = 0;
                            acVar3.f26263d = 0L;
                            acVar3.f26264e = "";
                            acVar3.f26268i = 0L;
                            acVar3.f26260a = SystemClock.uptimeMillis();
                            acVar3.f26265f.clear();
                            future3 = acVar3.f26266g;
                            if (future3 != null) {
                                if (!future3.isCancelled()) {
                                    acVar3.f26266g.cancel(true);
                                }
                                acVar3.f26266g = null;
                            }
                        }
                        zVar3 = this.f26348a;
                        if (zVar3 != null) {
                            zVar3.a();
                        }
                        String str311111 = str17;
                        ap.a("EventResult", str311111, new Throwable[0]);
                        b4.e.f24785a = "";
                        b4.e.f24786b = "";
                        ap.a("Constants", str311111, new Throwable[0]);
                        e.f26326c = SystemClock.uptimeMillis();
                        e.f26324a = System.currentTimeMillis();
                        if (aqVarD.f26313c.longValue() < 128) {
                            rVar = this.f26350c;
                            rVar.f26374c = SystemClock.uptimeMillis();
                            rVar.f26375d.clear();
                            future = rVar.f26377f;
                            if (future != null) {
                                if (!future.isCancelled()) {
                                    rVar.f26377f.cancel(true);
                                }
                                rVar.f26377f = null;
                            }
                            rVar.f26376e.clear();
                            mVar = this.f26349b;
                            mVar.f26364c = SystemClock.uptimeMillis();
                            mVar.f26365d.clear();
                            future2 = mVar.f26366e;
                            if (future2 != null) {
                                if (!future2.isCancelled()) {
                                    mVar.f26366e.cancel(true);
                                }
                                mVar.f26366e = null;
                            }
                            mVar.f26368g.clear();
                        } else {
                            rVar = this.f26350c;
                            rVar.f26374c = SystemClock.uptimeMillis();
                            rVar.f26375d.clear();
                            future = rVar.f26377f;
                            if (future != null) {
                                if (!future.isCancelled()) {
                                    rVar.f26377f.cancel(true);
                                }
                                rVar.f26377f = null;
                            }
                            rVar.f26376e.clear();
                            mVar = this.f26349b;
                            mVar.f26364c = SystemClock.uptimeMillis();
                            mVar.f26365d.clear();
                            future2 = mVar.f26366e;
                            if (future2 != null) {
                                if (!future2.isCancelled()) {
                                    mVar.f26366e.cancel(true);
                                }
                                mVar.f26366e = null;
                            }
                            mVar.f26368g.clear();
                        }
                        this.f26357j.post(new h(this));
                        return string7;
                    }
                }
                int i30 = i23;
                int i31 = i24 / 100;
                long jUptimeMillis11 = SystemClock.uptimeMillis();
                str17 = "Resetting values";
                str2 = "do_unr";
                int i32 = DurationKt.NANOS_IN_MILLIS;
                int i33 = 1;
                int i34 = 0;
                int i35 = 0;
                while (true) {
                    if (i33 >= i32) {
                        i11 = i30;
                        str3 = str19;
                        j10 = jUptimeMillis;
                        break;
                    }
                    j10 = jUptimeMillis;
                    try {
                        str3 = str19;
                        try {
                            i11 = i30;
                            if (Math.acos(i33 / i32) + Math.asin(i33 / i32) + Math.atan(i33 / DurationKt.NANOS_IN_MILLIS) > 1.5d) {
                                i34++;
                            }
                            if (i33 % 100 == 0 && SystemClock.uptimeMillis() - jUptimeMillis11 > 2) {
                                break;
                            }
                            i35++;
                            i33++;
                            str19 = str3;
                            jUptimeMillis = j10;
                            i30 = i11;
                            i32 = DurationKt.NANOS_IN_MILLIS;
                        } catch (Exception e17) {
                            e = e17;
                            b4.f.a(e);
                            str4 = "-1,-1,-1,-1,-1,-1,-1,-1,-1";
                        }
                    } catch (Exception e18) {
                        e = e18;
                        str3 = str19;
                        b4.f.a(e);
                        str4 = "-1,-1,-1,-1,-1,-1,-1,-1,-1";
                    }
                }
                int i36 = i35 / 100;
                long jUptimeMillis12 = SystemClock.uptimeMillis();
                int i37 = 0;
                for (int i38 = 1; i38 < 1000000 && SystemClock.uptimeMillis() - jUptimeMillis12 <= 2; i38++) {
                    i37++;
                }
                str4 = i14 + "," + i17 + "," + i21 + "," + i22 + "," + i11 + "," + i31 + "," + i34 + "," + i36 + "," + i37;
            } catch (Exception e19) {
                e = e19;
                str = "dm_unr";
            }
            b4.e.f24787c = str4;
        } else {
            str17 = "Resetting values";
            str = "dm_unr";
            str2 = "do_unr";
            str3 = "CYFManager";
            j10 = jUptimeMillis;
        }
        if (this.f26357j == null) {
            looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            this.f26357j = new Handler(looperMyLooper);
        }
        if (com.cyberfend.cyfsecurity.CYFMonitor.f39233a != null) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        String str2116 = str5;
        String str226 = "";
        if (this.f26349b.b() >= 32 && this.f26350c.b() < 32 && ah.a().f26301b != null) {
            String str40 = ah.a().f26301b;
            if (this.f26356i.compareAndSet(false, true)) {
                ap.c(str3, "Refresh Sensor data", new Throwable[0]);
                new Timer().schedule(new a(), 5000L);
            }
            Context context = ah.a().f26300a.get();
            if (context == null) {
                ap.b("SensorDataCache", "getServerSignal: Context is null", new Throwable[0]);
            } else {
                String string8 = context.getSharedPreferences("com.akamai.botman.preferences", 0).getString("ss_signal", null);
                if (string8 != null) {
                    str226 = string8;
                }
            }
            StringBuilder sbE7 = androidx.camera.core.processing.f.e(str40, Constant.MXN_SYMBOL);
            sbE7.append(ag.f().h());
            sbE7.append(Constant.MXN_SYMBOL);
            sbE7.append(ae.a().i());
            sbE7.append(Constant.MXN_SYMBOL);
            sbE7.append(str226);
            String string9 = sbE7.toString();
            this.f26357j.post(new h(this));
            return string9;
        }
        String str227 = str3;
        qVar = this.f26355h;
        if (qVar != null) {
            String str228 = qVar.f24828a;
            str7 = qVar.f24829b + "," + qVar.f24830c + "," + qVar.f24831d + "," + qVar.f24832e + "," + qVar.f24833f + "," + qVar.f24834g;
            ArrayList<Pair> arrayList6 = new ArrayList();
            arrayList6.add(new Pair("-2,3,-50,-301", p.e()));
            sb2 = new StringBuilder();
            while (r0.hasNext()) {
                sb2.append(pair3.first);
                sb2.append(",");
                sb2.append(pair3.second);
            }
            string = sb2.toString();
            str8 = string;
            str6 = str228;
        } else {
            str6 = "-1";
            str7 = str6;
            str8 = "";
        }
        int iA3 = o.a(str6);
        String strValueOf5 = String.valueOf(new Random().nextInt());
        String strValueOf6 = String.valueOf(e.f26324a / 2);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str6);
        sb5.append(",");
        sb5.append(iA3);
        sb5.append(",");
        sb5.append(strValueOf5);
        String strF3 = ad.d.f(sb5, ",", strValueOf6);
        aqVarD = this.f26350c.d();
        aq<Pair<String, String>, Long, Long> aqVarD4 = this.f26349b.d();
        strC = this.f26350c.c();
        strC2 = this.f26349b.c();
        pair = new Pair<>("", 0L);
        acVar = this.f26351d;
        if (acVar != null) {
            pair = acVar.a();
        }
        Pair<String, Long> pair111 = pair;
        pair2 = new Pair<>("", 0L);
        zVar = this.f26348a;
        if (zVar != null) {
            pair2 = zVar.b();
        }
        Pair<String, Long> pair112 = pair2;
        String str229 = (String) pair112.first;
        String str2210 = (String) pair111.first;
        String str2211 = b4.e.f24785a;
        dVar = this.f26354g;
        if (dVar != null) {
            ArrayList<Pair<String, Long>> arrayList7 = dVar.f24784p0;
            str10 = str7;
            str12 = "";
            while (r28.hasNext()) {
                str9 = strC2;
                str11 = strC;
                str12 = str12 + ((String) pair6.first) + "," + pair6.second + ReplenishLogic.ID_SEPARATOR;
                strC = str11;
                strC2 = str9;
            }
            str9 = strC2;
            str11 = strC;
            arrayList7.clear();
            rVar2 = this.f26350c;
            if (rVar2.f26372a.E0) {
                str13 = str2;
            } else {
                if (rVar2.f26373b) {
                    str16 = "do_dis";
                } else {
                    str16 = "do_en";
                }
                str13 = str16;
            }
            mVar2 = this.f26349b;
            if (mVar2.f26362a.f24801y0) {
                str14 = str;
            } else if (mVar2.f26363b) {
                str14 = "dm_dis";
            } else {
                str14 = "dm_en";
            }
            String str2117 = str13 + "," + str14 + ",t_en";
            long jUptimeMillis13 = (SystemClock.uptimeMillis() - j10) * 1000;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            boolean z16 = b4.a.f24773r0;
            String str2118 = str8;
            String str2119 = str12;
            long jLongValue7 = aqVarD4.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair111.second).longValue() + ((Long) pair112.second).longValue();
            int i211 = i12;
            long jCurrentTimeMillis7 = System.currentTimeMillis() - e.f26324a;
            zVar2 = this.f26348a;
            if (zVar2 != null) {
                j11 = zVar2.f26387f;
            } else {
                j11 = 0;
            }
            acVar2 = this.f26351d;
            if (acVar2 != null) {
                j12 = acVar2.f26263d;
            } else {
                j12 = 0;
            }
            String str311112 = pair112.second + "," + pair111.second + "," + aqVarD.f26312b + "," + aqVarD4.f26312b + "," + jLongValue7 + "," + jCurrentTimeMillis7 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD4.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis13 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue7)) << 32) | (((long) ((int) (aqVarD4.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis7) + "," + e.f26324a + "," + h();
            String str311113 = i211 + "," + (z16 ? 1 : 0);
            Pair<String, String> pair113 = aqVarD.f26311a;
            String str311114 = (String) pair113.first;
            String str311115 = (String) pair113.second;
            Pair<String, String> pair114 = aqVarD4.f26311a;
            String str311116 = (String) pair114.first;
            String str311117 = (String) pair114.second;
            arrayList = new ArrayList();
            arrayList.add(new Pair("", "3.3.9"));
            gVar = this.f26352e;
            if (gVar != null && gVar.b() != null) {
                arrayList.add(new Pair("-90", this.f26352e.b()));
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("-70", new Pair("-70", ""));
            linkedHashMap.put("-80", new Pair("-80", ""));
            linkedHashMap.put("-121", new Pair("-121", ""));
            linkedHashMap.put("-100", new Pair("-100", strF3));
            linkedHashMap.put("-101", new Pair("-101", str2117));
            linkedHashMap.put("-102", new Pair("-102", str2211));
            linkedHashMap.put("-103", new Pair("-103", str2119));
            linkedHashMap.put("-104", new Pair("-104", str2118));
            linkedHashMap.put("-108", new Pair("-108", str229));
            linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
            linkedHashMap.put("-115", new Pair("-115", str311112));
            linkedHashMap.put("-117", new Pair("-117", str2210));
            linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
            linkedHashMap.put("-144", new Pair("-144", str311115));
            linkedHashMap.put("-160", new Pair("-160", str11));
            linkedHashMap.put("-142", new Pair("-142", str311114));
            linkedHashMap.put("-145", new Pair("-145", str311117));
            linkedHashMap.put("-161", new Pair("-161", str9));
            linkedHashMap.put("-143", new Pair("-143", str311116));
            linkedHashMap.put("-150", new Pair("-150", str311113));
            linkedHashMap.put("-163", new Pair("-163", str10));
            linkedHashMap.put("-240", new Pair("-240", str2116));
            gVar2 = this.f26352e;
            if (gVar2 != null || (objArr = gVar2.f26338b.f26331a) == null) {
                objArr = null;
            }
            if (objArr != null) {
                length = objArr.length;
                while (i13 < length) {
                    obj = objArr[i13];
                    if (!linkedHashMap.containsKey(obj) && linkedHashMap.get(obj) != null) {
                        arrayList.add(linkedHashMap.get(obj));
                    }
                }
            } else {
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    arrayList.add((Pair) it.next());
                }
            }
            ap.a(str227, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
            SensorDataBuilder.a();
            if (SensorDataBuilder.f39252a) {
                strBuildN = SensorDataBuilder.a().buildN(arrayList);
            } else {
                strBuildN = null;
            }
            gVar3 = this.f26352e;
            if (gVar3 != null || (str15 = gVar3.f26341e) == null) {
                str15 = "";
            }
            if (aqVarD.f26313c.longValue() < 32 || aqVarD4.f26313c.longValue() >= 32) {
                ah ahVarA13 = ah.a();
                ahVarA13.f26301b = strBuildN;
                new Thread(ahVarA13.new b()).start();
                ah.a().b(str15);
            }
            StringBuilder sbE8 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
            sbE8.append(ag.f().h());
            sbE8.append(Constant.MXN_SYMBOL);
            sbE8.append(ae.a().i());
            sbE8.append(Constant.MXN_SYMBOL);
            sbE8.append(str15);
            String string10 = sbE8.toString();
            acVar3 = this.f26351d;
            if (acVar3 != null) {
                acVar3.f26261b = 0;
                acVar3.f26262c = 0;
                acVar3.f26263d = 0L;
                acVar3.f26264e = "";
                acVar3.f26268i = 0L;
                acVar3.f26260a = SystemClock.uptimeMillis();
                acVar3.f26265f.clear();
                future3 = acVar3.f26266g;
                if (future3 != null) {
                    if (!future3.isCancelled() && !acVar3.f26266g.isDone()) {
                        acVar3.f26266g.cancel(true);
                    }
                    acVar3.f26266g = null;
                }
            }
            zVar3 = this.f26348a;
            if (zVar3 != null) {
                zVar3.a();
            }
            String str311118 = str17;
            ap.a("EventResult", str311118, new Throwable[0]);
            b4.e.f24785a = "";
            b4.e.f24786b = "";
            ap.a("Constants", str311118, new Throwable[0]);
            e.f26326c = SystemClock.uptimeMillis();
            e.f26324a = System.currentTimeMillis();
            if (aqVarD.f26313c.longValue() < 128 || aqVarD4.f26313c.longValue() >= 128) {
                rVar = this.f26350c;
                rVar.f26374c = SystemClock.uptimeMillis();
                rVar.f26375d.clear();
                future = rVar.f26377f;
                if (future != null) {
                    if (!future.isCancelled() && !rVar.f26377f.isDone()) {
                        rVar.f26377f.cancel(true);
                    }
                    rVar.f26377f = null;
                }
                rVar.f26376e.clear();
                mVar = this.f26349b;
                mVar.f26364c = SystemClock.uptimeMillis();
                mVar.f26365d.clear();
                future2 = mVar.f26366e;
                if (future2 != null) {
                    if (!future2.isCancelled() && !mVar.f26366e.isDone()) {
                        mVar.f26366e.cancel(true);
                    }
                    mVar.f26366e = null;
                }
                mVar.f26368g.clear();
            }
            this.f26357j.post(new h(this));
            return string10;
        }
        str9 = strC2;
        str10 = str7;
        str11 = strC;
        str12 = "";
        rVar2 = this.f26350c;
        if (rVar2.f26372a.E0) {
            str13 = str2;
        } else {
            if (rVar2.f26373b) {
                str16 = "do_dis";
            } else {
                str16 = "do_en";
            }
            str13 = str16;
        }
        mVar2 = this.f26349b;
        if (mVar2.f26362a.f24801y0) {
            str14 = str;
        } else if (mVar2.f26363b) {
            str14 = "dm_dis";
        } else {
            str14 = "dm_en";
        }
        String str21110 = str13 + "," + str14 + ",t_en";
        long jUptimeMillis14 = (SystemClock.uptimeMillis() - j10) * 1000;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        boolean z17 = b4.a.f24773r0;
        String str21111 = str8;
        String str21112 = str12;
        long jLongValue8 = aqVarD4.f26312b.longValue() + aqVarD.f26312b.longValue() + ((Long) pair111.second).longValue() + ((Long) pair112.second).longValue();
        int i212 = i12;
        long jCurrentTimeMillis8 = System.currentTimeMillis() - e.f26324a;
        zVar2 = this.f26348a;
        if (zVar2 != null) {
            j11 = zVar2.f26387f;
        } else {
            j11 = 0;
        }
        acVar2 = this.f26351d;
        if (acVar2 != null) {
            j12 = acVar2.f26263d;
        } else {
            j12 = 0;
        }
        String str311119 = pair112.second + "," + pair111.second + "," + aqVarD.f26312b + "," + aqVarD4.f26312b + "," + jLongValue8 + "," + jCurrentTimeMillis8 + "," + j11 + "," + j12 + "," + aqVarD.f26313c + "," + aqVarD4.f26313c + "," + (e.f26329f * 1000) + "," + jUptimeMillis14 + "," + e.f26330g + "," + aj.a((((long) ((int) jLongValue8)) << 32) | (((long) ((int) (aqVarD4.f26313c.longValue() + aqVarD.f26313c.longValue() + j11 + j12))) & 4294967295L), (int) jCurrentTimeMillis8) + "," + e.f26324a + "," + h();
        String str3111110 = i212 + "," + (z17 ? 1 : 0);
        Pair<String, String> pair115 = aqVarD.f26311a;
        String str3111111 = (String) pair115.first;
        String str3111112 = (String) pair115.second;
        Pair<String, String> pair116 = aqVarD4.f26311a;
        String str3111113 = (String) pair116.first;
        String str3111114 = (String) pair116.second;
        arrayList = new ArrayList();
        arrayList.add(new Pair("", "3.3.9"));
        gVar = this.f26352e;
        if (gVar != null) {
            arrayList.add(new Pair("-90", this.f26352e.b()));
        }
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("-70", new Pair("-70", ""));
        linkedHashMap.put("-80", new Pair("-80", ""));
        linkedHashMap.put("-121", new Pair("-121", ""));
        linkedHashMap.put("-100", new Pair("-100", strF3));
        linkedHashMap.put("-101", new Pair("-101", str21110));
        linkedHashMap.put("-102", new Pair("-102", str2211));
        linkedHashMap.put("-103", new Pair("-103", str21112));
        linkedHashMap.put("-104", new Pair("-104", str21111));
        linkedHashMap.put("-108", new Pair("-108", str229));
        linkedHashMap.put("-112", new Pair("-112", b4.e.f24787c));
        linkedHashMap.put("-115", new Pair("-115", str311119));
        linkedHashMap.put("-117", new Pair("-117", str2210));
        linkedHashMap.put("-120", new Pair("-120", b4.e.f24786b));
        linkedHashMap.put("-144", new Pair("-144", str3111112));
        linkedHashMap.put("-160", new Pair("-160", str11));
        linkedHashMap.put("-142", new Pair("-142", str3111111));
        linkedHashMap.put("-145", new Pair("-145", str3111114));
        linkedHashMap.put("-161", new Pair("-161", str9));
        linkedHashMap.put("-143", new Pair("-143", str3111113));
        linkedHashMap.put("-150", new Pair("-150", str3111110));
        linkedHashMap.put("-163", new Pair("-163", str10));
        linkedHashMap.put("-240", new Pair("-240", str2116));
        gVar2 = this.f26352e;
        if (gVar2 != null) {
            objArr = null;
        } else {
            objArr = null;
        }
        if (objArr != null) {
            length = objArr.length;
            while (i13 < length) {
                obj = objArr[i13];
                if (!linkedHashMap.containsKey(obj)) {
                }
            }
        } else {
            it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                arrayList.add((Pair) it.next());
            }
        }
        ap.a(str227, androidx.datastore.preferences.protobuf.e.f("Plain-BuildSensorData-Time: ", SystemClock.uptimeMillis() - j10, "ms"), new Throwable[0]);
        SensorDataBuilder.a();
        if (SensorDataBuilder.f39252a) {
            strBuildN = SensorDataBuilder.a().buildN(arrayList);
        } else {
            strBuildN = null;
        }
        gVar3 = this.f26352e;
        if (gVar3 != null) {
            str15 = "";
        } else {
            str15 = "";
        }
        if (aqVarD.f26313c.longValue() < 32) {
            ah ahVarA14 = ah.a();
            ahVarA14.f26301b = strBuildN;
            new Thread(ahVarA14.new b()).start();
            ah.a().b(str15);
        } else {
            ah ahVarA15 = ah.a();
            ahVarA15.f26301b = strBuildN;
            new Thread(ahVarA15.new b()).start();
            ah.a().b(str15);
        }
        StringBuilder sbE9 = androidx.camera.core.processing.f.e(strBuildN, Constant.MXN_SYMBOL);
        sbE9.append(ag.f().h());
        sbE9.append(Constant.MXN_SYMBOL);
        sbE9.append(ae.a().i());
        sbE9.append(Constant.MXN_SYMBOL);
        sbE9.append(str15);
        String string11 = sbE9.toString();
        acVar3 = this.f26351d;
        if (acVar3 != null) {
            acVar3.f26261b = 0;
            acVar3.f26262c = 0;
            acVar3.f26263d = 0L;
            acVar3.f26264e = "";
            acVar3.f26268i = 0L;
            acVar3.f26260a = SystemClock.uptimeMillis();
            acVar3.f26265f.clear();
            future3 = acVar3.f26266g;
            if (future3 != null) {
                if (!future3.isCancelled()) {
                    acVar3.f26266g.cancel(true);
                }
                acVar3.f26266g = null;
            }
        }
        zVar3 = this.f26348a;
        if (zVar3 != null) {
            zVar3.a();
        }
        String str3111115 = str17;
        ap.a("EventResult", str3111115, new Throwable[0]);
        b4.e.f24785a = "";
        b4.e.f24786b = "";
        ap.a("Constants", str3111115, new Throwable[0]);
        e.f26326c = SystemClock.uptimeMillis();
        e.f26324a = System.currentTimeMillis();
        if (aqVarD.f26313c.longValue() < 128) {
            rVar = this.f26350c;
            rVar.f26374c = SystemClock.uptimeMillis();
            rVar.f26375d.clear();
            future = rVar.f26377f;
            if (future != null) {
                if (!future.isCancelled()) {
                    rVar.f26377f.cancel(true);
                }
                rVar.f26377f = null;
            }
            rVar.f26376e.clear();
            mVar = this.f26349b;
            mVar.f26364c = SystemClock.uptimeMillis();
            mVar.f26365d.clear();
            future2 = mVar.f26366e;
            if (future2 != null) {
                if (!future2.isCancelled()) {
                    mVar.f26366e.cancel(true);
                }
                mVar.f26366e = null;
            }
            mVar.f26368g.clear();
        } else {
            rVar = this.f26350c;
            rVar.f26374c = SystemClock.uptimeMillis();
            rVar.f26375d.clear();
            future = rVar.f26377f;
            if (future != null) {
                if (!future.isCancelled()) {
                    rVar.f26377f.cancel(true);
                }
                rVar.f26377f = null;
            }
            rVar.f26376e.clear();
            mVar = this.f26349b;
            mVar.f26364c = SystemClock.uptimeMillis();
            mVar.f26365d.clear();
            future2 = mVar.f26366e;
            if (future2 != null) {
                if (!future2.isCancelled()) {
                    mVar.f26366e.cancel(true);
                }
                mVar.f26366e = null;
            }
            mVar.f26368g.clear();
        }
        this.f26357j.post(new h(this));
        return string11;
    }

    public final void b(Window window) {
        try {
            if (this.f26351d == null) {
                this.f26351d = new ac();
            }
            ac acVar = this.f26351d;
            ap.a("TouchManager", "Listening on window", new Throwable[0]);
            acVar.f26260a = SystemClock.uptimeMillis();
            b4.a aVar = new b4.a(window.getCallback());
            window.setCallback(aVar);
            aVar.addObserver(acVar);
        } catch (Exception e5) {
            ap.c("CYFManager", "Exception in creating touch manager", e5);
            b4.f.a(e5);
        }
    }

    public final synchronized void d(Application application) {
        if (!f26345p && application != null) {
            try {
                q qVar = new q();
                this.f26355h = qVar;
                long jUptimeMillis = SystemClock.uptimeMillis();
                qVar.f24828a = p.b(application);
                qVar.f24829b = ((TelephonyManager) application.getSystemService("phone")).getSimOperatorName();
                new u();
                qVar.f24830c = androidx.constraintlayout.core.state.a.a(u.a(application, application.getPackageName()));
                qVar.f24831d = p.f(application);
                qVar.f24832e = p.a();
                qVar.f24834g = aa.a();
                qVar.f24833f = aa.a(application);
                e.f26329f = SystemClock.uptimeMillis() - jUptimeMillis;
                ap.a("CYFSystemInfoManager", "DeviceInfo-Time: " + e.f26329f + "ms", new Throwable[0]);
                f26345p = true;
                i();
            } catch (Exception e5) {
                b4.f.a(e5);
                String message = e5.getMessage();
                CYFMonitor.CYFSDKInitCallback cYFSDKInitCallback = com.cyberfend.cyfsecurity.CYFMonitor.f39233a;
                if (cYFSDKInitCallback != null && !this.f26360n) {
                    this.f26360n = true;
                    cYFSDKInitCallback.onSDKInitFailure(message);
                }
            }
        }
    }

    public static synchronized boolean a(Window window) throws Exception {
        int iHashCode = window.hashCode();
        int i10 = 0;
        while (true) {
            ArrayList<Integer> arrayList = f26344o;
            if (i10 < arrayList.size()) {
                if (iHashCode == arrayList.get(i10).intValue()) {
                    return true;
                }
                i10++;
            } else {
                arrayList.add(Integer.valueOf(iHashCode));
                return false;
            }
        }
    }

    public final synchronized void b(Application application) {
        if (this.f26349b != null) {
            return;
        }
        this.f26349b = new m(application, this);
    }

    public final void a(ViewGroup viewGroup) {
        try {
            ArrayList<View> arrayListA = b4.m.a(viewGroup);
            for (int i10 = 0; i10 < arrayListA.size(); i10++) {
                View view = arrayListA.get(i10);
                if (view instanceof EditText) {
                    if (!this.m) {
                        this.f26348a = new z();
                        this.m = true;
                    }
                    z zVar = this.f26348a;
                    EditText editText = (EditText) view;
                    ap.a("TextChangeManager", "Listening on edit text: " + editText.getId(), new Throwable[0]);
                    int iA = o.a(String.valueOf(editText.getId()));
                    if (!b4.e.f24785a.toLowerCase().contains(Integer.toString(iA).toLowerCase())) {
                        b4.e.f24785a += iA + ReplenishLogic.ID_SEPARATOR;
                    }
                    if ((editText.getInputType() & 129) != 129 && (editText.getInputType() & 18) != 18 && (editText.getInputType() & 145) != 145 && (editText.getInputType() & 225) != 225) {
                        b4.r rVar = new b4.r(iA);
                        editText.addTextChangedListener(rVar);
                        rVar.addObserver(zVar.f26382a);
                    } else {
                        b4.r rVar2 = new b4.r(iA);
                        editText.addTextChangedListener(rVar2);
                        rVar2.addObserver(zVar.f26382a);
                    }
                }
            }
        } catch (Exception e5) {
            ap.c("CYFManager", "Exception in creating text listener", e5);
            b4.f.a(e5);
        }
    }

    public final synchronized void c(Application application, String str, String str2) {
        if (application != null) {
            try {
                if (this.f26352e != null) {
                    this.f26359l = new Date();
                    g gVar = this.f26352e;
                    try {
                        gVar.f26339c = application;
                        gVar.f26340d = str;
                        gVar.f26341e = str2;
                        gVar.a();
                    } catch (Exception e5) {
                        b4.f.a(e5);
                    }
                }
            } catch (Exception e7) {
                b4.f.a(e7);
            }
        }
    }

    public final synchronized void a(Application application) {
        if (this.f26350c != null) {
            return;
        }
        this.f26350c = new r(application, this);
    }

    public final synchronized void c(Application application) {
        if (!f26346q) {
            b4.d dVar = new b4.d();
            dVar.f24784p0 = new ArrayList<>();
            this.f26354g = dVar;
            application.registerActivityLifecycleCallbacks(dVar);
            f26346q = true;
            i();
        }
    }

    public final synchronized void a(Application application, String str, String str2) {
        if (application != null) {
            if (!f26347r) {
                if (this.f26352e != null) {
                    return;
                }
                this.f26359l = new Date();
                g gVar = new g();
                try {
                    gVar.f26339c = application;
                    gVar.f26340d = str;
                    gVar.f26341e = str2;
                    gVar.a();
                } catch (Exception e5) {
                    b4.f.a(e5);
                }
                this.f26352e = gVar;
                f26347r = true;
                i();
                return;
            }
        }
        if (f26347r) {
            c(application, str, str2);
        }
    }

    public final synchronized void a(int i10) {
        this.f26358k = i10;
    }
}
