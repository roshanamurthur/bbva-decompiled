package hg;

import androidx.collection.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f69442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final ArrayMap f69443b = new ArrayMap();

    public m(ThreadPoolExecutor threadPoolExecutor) {
        this.f69442a = threadPoolExecutor;
    }
}
