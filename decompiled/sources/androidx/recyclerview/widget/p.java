package androidx.recyclerview.widget;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MessageThreadUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements ThreadUtil$BackgroundCallback<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f23060a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f23061b = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23062c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f23063d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ThreadUtil$BackgroundCallback f23064e;

    /* JADX INFO: compiled from: MessageThreadUtil.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (true) {
                p pVar = p.this;
                r rVarA = pVar.f23060a.a();
                if (rVarA == null) {
                    pVar.f23062c.set(false);
                    return;
                }
                int i10 = rVarA.f23071b;
                if (i10 == 1) {
                    pVar.f23060a.b(1);
                    pVar.f23064e.refresh(rVarA.f23072c);
                } else if (i10 == 2) {
                    pVar.f23060a.b(2);
                    pVar.f23060a.b(3);
                    pVar.f23064e.updateRange(rVarA.f23072c, rVarA.f23073d, rVarA.f23074e, rVarA.f23075f, rVarA.f23076g);
                } else if (i10 == 3) {
                    pVar.f23064e.loadTile(rVarA.f23072c, rVarA.f23073d);
                } else if (i10 == 4) {
                    pVar.f23064e.recycleTile((TileList.Tile) rVarA.f23077h);
                }
            }
        }
    }

    public p(AsyncListUtil.b bVar) {
        this.f23064e = bVar;
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void loadTile(int i10, int i11) {
        this.f23060a.c(r.a(3, i10, i11, 0, 0, 0, null));
        if (this.f23062c.compareAndSet(false, true)) {
            this.f23061b.execute(this.f23063d);
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void recycleTile(TileList.Tile<Object> tile) {
        this.f23060a.c(r.a(4, 0, 0, 0, 0, 0, tile));
        if (this.f23062c.compareAndSet(false, true)) {
            this.f23061b.execute(this.f23063d);
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void refresh(int i10) {
        r rVarA = r.a(1, i10, 0, 0, 0, 0, null);
        q qVar = this.f23060a;
        synchronized (qVar.f23067b) {
            rVarA.f23070a = qVar.f23066a;
            qVar.f23066a = rVarA;
        }
        if (this.f23062c.compareAndSet(false, true)) {
            this.f23061b.execute(this.f23063d);
        }
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void updateRange(int i10, int i11, int i12, int i13, int i14) {
        r rVarA = r.a(2, i10, i11, i12, i13, i14, null);
        q qVar = this.f23060a;
        synchronized (qVar.f23067b) {
            rVarA.f23070a = qVar.f23066a;
            qVar.f23066a = rVarA;
        }
        if (this.f23062c.compareAndSet(false, true)) {
            this.f23061b.execute(this.f23063d);
        }
    }
}
