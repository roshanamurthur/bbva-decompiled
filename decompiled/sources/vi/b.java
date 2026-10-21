package vi;

import com.veridas.camera.metrics.Metrics;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: DefaultMetrics.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Metrics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f94080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f94081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f94082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f94083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f94084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f94085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f94086g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f94087h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f94088i = Long.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f94089j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f94090k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f94091l = Long.MIN_VALUE;
    public long m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f94092n = Long.MAX_VALUE;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f94093o = Long.MAX_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f94094p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f94095q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f94096r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f94097s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f94098t = 0;

    public b(Date date, Date date2, LinkedList linkedList, LinkedList linkedList2, LinkedList linkedList3, LinkedList linkedList4) {
        if (date == null) {
            throw new IllegalArgumentException("The from argument cannot be null.");
        }
        if (date2 == null) {
            throw new IllegalArgumentException("The until argument cannot be null.");
        }
        this.f94085f = linkedList4;
        this.f94084e = linkedList3;
        this.f94080a = date;
        this.f94083d = linkedList2;
        this.f94082c = linkedList;
        this.f94081b = date2;
    }

    public static b a(Date date, Date date2, LinkedList linkedList, LinkedList linkedList2, LinkedList linkedList3, LinkedList linkedList4) {
        int i10;
        long j10;
        b bVar = new b(date, date2, linkedList, linkedList2, linkedList3, linkedList4);
        bVar.f94095q = linkedList2.size();
        int size = linkedList.size();
        bVar.f94094p = size;
        int i11 = 0;
        if (size > 0) {
            int i12 = size - 1;
            long jLongValue = ((Long) linkedList.get(0)).longValue();
            long jRound = Math.round((((Long) linkedList.get(i12)).longValue() - jLongValue) / bVar.f94094p);
            bVar.f94090k = jRound;
            bVar.f94089j = Math.round(1000.0f / jRound);
            int i13 = 1;
            long jRound2 = 1;
            while (i13 < bVar.f94094p) {
                boolean z10 = i13 == i12;
                long jLongValue2 = ((Long) linkedList.get(i13)).longValue();
                long jLongValue3 = jLongValue2 - ((Long) linkedList.get(i13 - 1)).longValue();
                if (jLongValue3 < bVar.f94093o) {
                    bVar.f94093o = jLongValue3;
                }
                if (jLongValue3 > bVar.m) {
                    bVar.m = jLongValue3;
                }
                if (jLongValue2 >= 1000 + jLongValue || z10) {
                    if (z10) {
                        jRound2 = Math.round(1000.0f / ((jLongValue2 - jLongValue) / jRound2));
                    }
                    if (jRound2 < bVar.f94092n) {
                        bVar.f94092n = jRound2;
                    }
                    if (jRound2 > bVar.f94091l) {
                        bVar.f94091l = jRound2;
                    }
                    jLongValue = jLongValue2;
                    j10 = 1;
                    jRound2 = 0;
                } else {
                    j10 = 1;
                }
                jRound2 += j10;
                i13++;
            }
        }
        List list = bVar.f94084e;
        int size2 = list.size();
        bVar.f94096r = size2;
        if (size2 > 0) {
            long j11 = 0;
            while (true) {
                i10 = bVar.f94096r;
                if (i11 >= i10) {
                    break;
                }
                boolean zBooleanValue = ((Boolean) bVar.f94085f.get(i11)).booleanValue();
                long jLongValue4 = ((Long) list.get(i11)).longValue();
                j11 += jLongValue4;
                if (jLongValue4 < bVar.f94088i) {
                    bVar.f94088i = jLongValue4;
                }
                if (jLongValue4 > bVar.f94087h) {
                    bVar.f94087h = jLongValue4;
                }
                if (zBooleanValue) {
                    bVar.f94097s++;
                } else {
                    bVar.f94098t++;
                }
                i11++;
            }
            bVar.f94086g = j11 / ((long) i10);
        }
        return bVar;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final Metrics between(Date date, Date date2) {
        long time = date.getTime();
        long time2 = date2.getTime();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        Iterator it = this.f94082c.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (jLongValue >= time && jLongValue <= time2) {
                linkedList.add(Long.valueOf(jLongValue));
            }
        }
        Iterator it2 = this.f94083d.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = ((Long) it2.next()).longValue();
            if (jLongValue2 >= time && jLongValue2 <= time2) {
                linkedList2.add(Long.valueOf(jLongValue2));
            }
        }
        Iterator it3 = this.f94084e.iterator();
        int i10 = 0;
        while (it3.hasNext()) {
            long jLongValue3 = ((Long) it3.next()).longValue();
            if (jLongValue3 >= time && jLongValue3 <= time2) {
                linkedList3.add(Long.valueOf(jLongValue3));
                linkedList4.add((Boolean) this.f94085f.get(i10));
            }
            i10++;
        }
        return a(date, date2, linkedList, linkedList2, linkedList3, linkedList4);
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final Metrics from(Date date) {
        long time = date.getTime();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        Iterator it = this.f94082c.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (jLongValue >= time) {
                linkedList.add(Long.valueOf(jLongValue));
            }
        }
        Iterator it2 = this.f94083d.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = ((Long) it2.next()).longValue();
            if (jLongValue2 >= time) {
                linkedList2.add(Long.valueOf(jLongValue2));
            }
        }
        Iterator it3 = this.f94084e.iterator();
        int i10 = 0;
        while (it3.hasNext()) {
            long jLongValue3 = ((Long) it3.next()).longValue();
            if (jLongValue3 >= time) {
                linkedList3.add(Long.valueOf(jLongValue3));
                linkedList4.add((Boolean) this.f94085f.get(i10));
            }
            i10++;
        }
        return a(date, this.f94081b, linkedList, linkedList2, linkedList3, linkedList4);
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getAfAvgTime() {
        return this.f94086g;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getAfMaxTime() {
        return this.f94087h;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getAfMinTime() {
        return this.f94088i;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final Date getFrom() {
        return this.f94080a;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getNumberOfAfAttempts() {
        return this.f94096r;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getNumberOfPicturesTaken() {
        return this.f94095q;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getNumberOfPreviewPictures() {
        return this.f94094p;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getNumberOfSuccessfulAfAttempts() {
        return this.f94097s;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getNumberOfUnsuccessfulAfAttempts() {
        return this.f94098t;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getPreviewAvgFps() {
        return this.f94089j;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getPreviewAvgInterval() {
        return this.f94090k;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getPreviewMaxFps() {
        return this.f94091l;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getPreviewMaxInterval() {
        return this.m;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getPreviewMinFps() {
        return this.f94092n;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final long getPreviewMinInterval() {
        return this.f94093o;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final Date getUntil() {
        return this.f94081b;
    }

    @Override // com.veridas.camera.metrics.Metrics
    public final Metrics until(Date date) {
        long time = date.getTime();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        Iterator it = this.f94082c.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (jLongValue <= time) {
                linkedList.add(Long.valueOf(jLongValue));
            }
        }
        Iterator it2 = this.f94083d.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = ((Long) it2.next()).longValue();
            if (jLongValue2 <= time) {
                linkedList2.add(Long.valueOf(jLongValue2));
            }
        }
        Iterator it3 = this.f94084e.iterator();
        int i10 = 0;
        while (it3.hasNext()) {
            long jLongValue3 = ((Long) it3.next()).longValue();
            if (jLongValue3 <= time) {
                linkedList3.add(Long.valueOf(jLongValue3));
                linkedList4.add((Boolean) this.f94085f.get(i10));
            }
            i10++;
        }
        return a(this.f94080a, date, linkedList, linkedList2, linkedList3, linkedList4);
    }
}
