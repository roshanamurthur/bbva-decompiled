package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: AnimationHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<a> f21229f = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f21233d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleArrayMap<b, Long> f21230a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f21231b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0079a f21232c = new C0079a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21234e = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimationHandler.java */
    public class C0079a {
        public C0079a() {
        }
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public interface b {
        boolean doAnimationFrame(long j10);
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0079a f21236a;

        public c(C0079a c0079a) {
            this.f21236a = c0079a;
        }
    }

    /* JADX INFO: compiled from: AnimationHandler.java */
    @RequiresApi(16)
    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f21237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ChoreographerFrameCallbackC0080a f21238c;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnimationHandler.java */
        public class ChoreographerFrameCallbackC0080a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0080a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                ArrayList<b> arrayList;
                C0079a c0079a = d.this.f21236a;
                c0079a.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                aVar.getClass();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (true) {
                    arrayList = aVar.f21231b;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    b bVar = arrayList.get(i10);
                    if (bVar != null) {
                        SimpleArrayMap<b, Long> simpleArrayMap = aVar.f21230a;
                        Long l6 = simpleArrayMap.get(bVar);
                        if (l6 == null) {
                            bVar.doAnimationFrame(jUptimeMillis);
                        } else if (l6.longValue() < jUptimeMillis2) {
                            simpleArrayMap.remove(bVar);
                            bVar.doAnimationFrame(jUptimeMillis);
                        }
                    }
                    i10++;
                }
                if (aVar.f21234e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f21234e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.f21233d == null) {
                        aVar.f21233d = new d(aVar.f21232c);
                    }
                    d dVar = aVar.f21233d;
                    dVar.f21237b.postFrameCallback(dVar.f21238c);
                }
            }
        }

        public d(C0079a c0079a) {
            super(c0079a);
            this.f21237b = Choreographer.getInstance();
            this.f21238c = new ChoreographerFrameCallbackC0080a();
        }
    }
}
