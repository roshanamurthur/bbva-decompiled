package b4;

import android.os.SystemClock;
import com.akamai.botman.ag;
import com.akamai.botman.ap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends TimerTask {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f24781p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ag f24782q0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            c cVar = c.this;
            ag agVar = cVar.f24782q0;
            if (agVar.f26274d == 2) {
                agVar.b();
                return;
            }
            ap.a("PoW", "computeProofOfWork, Challenge Count: " + agVar.f26287r, new Throwable[0]);
            agVar.f26277g = "Solving MC: " + agVar.f26287r;
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                long j10 = agVar.f26280j + ((long) agVar.f26287r);
                Random random = new Random();
                DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(ag.A);
                decimalFormat.applyPattern("#.############");
                boolean z10 = false;
                long jUptimeMillis2 = 0;
                while (true) {
                    i10 = cVar.f24781p0;
                    if (z10) {
                        break;
                    }
                    String str = decimalFormat.format(random.nextDouble());
                    String str2 = agVar.f26286q + j10 + str;
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    c cVar2 = cVar;
                    messageDigest.update(str2.getBytes());
                    int i11 = 0;
                    long j11 = 0;
                    for (byte[] bArrDigest = messageDigest.digest(); i11 < bArrDigest.length; bArrDigest = bArrDigest) {
                        j11 = ((j11 << 8) | ((long) (bArrDigest[i11] & 255))) % j10;
                        i11++;
                    }
                    if (j11 != 0) {
                        int i12 = agVar.f26288s + 1;
                        agVar.f26288s = i12;
                        if (i12 % 1000 == 0) {
                            jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                            long j12 = agVar.m;
                            if (jUptimeMillis2 > j12 && agVar.f26274d != 2) {
                                new Timer().schedule(new c(agVar, i10), j12 + 1000);
                                break;
                            }
                        }
                    } else {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        jUptimeMillis2 = jUptimeMillis3 - jUptimeMillis;
                        long j13 = jUptimeMillis3 - agVar.f26289t;
                        ap.a("PoW", "Challenge (" + str2 + ") " + agVar.f26287r + " solved at iteration: " + agVar.f26288s + " in " + j13 + "ms", new Throwable[0]);
                        agVar.f26290u.add(str);
                        agVar.f26292w.add(Integer.valueOf(agVar.f26288s));
                        agVar.f26291v.add(Long.valueOf(j13));
                        z10 = true;
                    }
                    if (agVar.f26274d == 2) {
                        agVar.b();
                        return;
                    }
                    cVar = cVar2;
                }
                if (z10) {
                    agVar.f26287r++;
                    agVar.f26289t = SystemClock.uptimeMillis();
                    agVar.a(agVar.f26287r);
                    if (agVar.f26287r < 10) {
                        agVar.f26288s = 0;
                        new Timer().schedule(new c(agVar, i10), agVar.f26281k + jUptimeMillis2);
                        return;
                    }
                    agVar.f26288s = 0;
                    agVar.c();
                    agVar.f26290u = new ArrayList<>();
                    agVar.f26291v = new ArrayList<>();
                    agVar.f26292w = new ArrayList<>();
                    agVar.d(0);
                    if (SystemClock.uptimeMillis() - agVar.f26285p > agVar.f26279i * 1000 && i10 == 0) {
                        agVar.a(100L, i10);
                    }
                    agVar.d();
                }
            } catch (NoSuchAlgorithmException e5) {
                ap.c("PoW", "computeProofOfWork: " + e5.toString(), new Throwable[0]);
            }
        }
    }

    public c(ag agVar, int i10) {
        this.f24782q0 = agVar;
        this.f24781p0 = i10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        new Thread(new a()).start();
    }
}
