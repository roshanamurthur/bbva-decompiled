package uc;

import com.bumptech.glide.util.Util;
import java.util.Queue;
import uc.e;

/* JADX INFO: compiled from: BaseKeyPool.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b<T extends e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f93771a = Util.createQueue(20);

    public final void a(T t10) {
        Queue<T> queue = this.f93771a;
        if (queue.size() < 20) {
            queue.offer(t10);
        }
    }
}
