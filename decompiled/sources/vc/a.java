package vc;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f94022a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f94023b = new b();

    /* JADX INFO: renamed from: vc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class C0502a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReentrantLock f94024a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f94025b;
    }

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f94026a = new ArrayDeque();

        public final C0502a a() {
            C0502a c0502a;
            synchronized (this.f94026a) {
                c0502a = (C0502a) this.f94026a.poll();
            }
            return c0502a == null ? new C0502a() : c0502a;
        }

        public final void b(C0502a c0502a) {
            synchronized (this.f94026a) {
                try {
                    if (this.f94026a.size() < 10) {
                        this.f94026a.offer(c0502a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(String str) {
        C0502a c0502a;
        synchronized (this) {
            try {
                c0502a = (C0502a) Preconditions.checkNotNull(this.f94022a.get(str));
                int i10 = c0502a.f94025b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0502a.f94025b);
                }
                int i11 = i10 - 1;
                c0502a.f94025b = i11;
                if (i11 == 0) {
                    C0502a c0502a2 = (C0502a) this.f94022a.remove(str);
                    if (!c0502a2.equals(c0502a)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0502a + ", but actually removed: " + c0502a2 + ", safeKey: " + str);
                    }
                    this.f94023b.b(c0502a2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c0502a.f94024a.unlock();
    }
}
