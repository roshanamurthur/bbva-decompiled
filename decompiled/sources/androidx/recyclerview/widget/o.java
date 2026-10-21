package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: MessageThreadUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements ThreadUtil$MainThreadCallback<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f23055a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f23056b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f23057c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadUtil$MainThreadCallback f23058d;

    /* JADX INFO: compiled from: MessageThreadUtil.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o oVar = o.this;
            for (r rVarA = oVar.f23055a.a(); rVarA != null; rVarA = oVar.f23055a.a()) {
                int i10 = rVarA.f23071b;
                if (i10 == 1) {
                    oVar.f23058d.updateItemCount(rVarA.f23072c, rVarA.f23073d);
                } else if (i10 == 2) {
                    oVar.f23058d.addTile(rVarA.f23072c, (TileList.Tile) rVarA.f23077h);
                } else if (i10 == 3) {
                    oVar.f23058d.removeTile(rVarA.f23072c, rVarA.f23073d);
                }
            }
        }
    }

    public o(AsyncListUtil.a aVar) {
        this.f23058d = aVar;
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void addTile(int i10, TileList.Tile<Object> tile) {
        this.f23055a.c(r.a(2, i10, 0, 0, 0, 0, tile));
        this.f23056b.post(this.f23057c);
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void removeTile(int i10, int i11) {
        this.f23055a.c(r.a(3, i10, i11, 0, 0, 0, null));
        this.f23056b.post(this.f23057c);
    }

    @Override // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void updateItemCount(int i10, int i11) {
        this.f23055a.c(r.a(1, i10, i11, 0, 0, 0, null));
        this.f23056b.post(this.f23057c);
    }
}
