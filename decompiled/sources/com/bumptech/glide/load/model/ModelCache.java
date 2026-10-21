package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public class ModelCache<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38451a;

    public class a extends LruCache<b<A>, B> {
        @Override // com.bumptech.glide.util.LruCache
        public final void onItemEvicted(@NonNull Object obj, @Nullable Object obj2) {
            b<?> bVar = (b) obj;
            bVar.getClass();
            Queue<b<?>> queue = b.f38452d;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    @VisibleForTesting
    public static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Queue<b<?>> f38452d = Util.createQueue(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A f38455c;

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(int i10, int i11, Object obj) {
            b<?> bVarPoll;
            Queue<b<?>> queue = f38452d;
            synchronized (queue) {
                bVarPoll = queue.poll();
            }
            if (bVarPoll == null) {
                bVarPoll = new b<>();
            }
            bVarPoll.f38455c = obj;
            bVarPoll.f38454b = i10;
            bVarPoll.f38453a = i11;
            return bVarPoll;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f38454b == bVar.f38454b && this.f38453a == bVar.f38453a && this.f38455c.equals(bVar.f38455c);
        }

        public final int hashCode() {
            return this.f38455c.hashCode() + (((this.f38453a * 31) + this.f38454b) * 31);
        }
    }

    public ModelCache() {
        this(250L);
    }

    public void clear() {
        this.f38451a.clearMemory();
    }

    @Nullable
    public B get(A a10, int i10, int i11) {
        b<?> bVarA = b.a(i10, i11, a10);
        B b10 = this.f38451a.get(bVarA);
        Queue<b<?>> queue = b.f38452d;
        synchronized (queue) {
            queue.offer(bVarA);
        }
        return b10;
    }

    public void put(A a10, int i10, int i11, B b10) {
        this.f38451a.put(b.a(i10, i11, a10), b10);
    }

    public ModelCache(long j10) {
        this.f38451a = new a(j10);
    }
}
