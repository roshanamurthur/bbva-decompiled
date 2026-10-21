package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o1;
import java.util.ArrayList;

/* JADX INFO: compiled from: ChildHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0101b f22958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22959b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22960c = new ArrayList();

    /* JADX INFO: compiled from: ChildHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f22961a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f22962b;

        public final void a(int i10) {
            if (i10 < 64) {
                this.f22961a &= ~(1 << i10);
                return;
            }
            a aVar = this.f22962b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public final int b(int i10) {
            a aVar = this.f22962b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f22961a) : Long.bitCount(this.f22961a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f22961a & ((1 << i10) - 1));
            }
            return Long.bitCount(this.f22961a) + aVar.b(i10 - 64);
        }

        public final void c() {
            if (this.f22962b == null) {
                this.f22962b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f22961a & (1 << i10)) != 0;
            }
            c();
            return this.f22962b.d(i10 - 64);
        }

        public final void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f22962b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f22961a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f22961a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f22962b != null) {
                c();
                this.f22962b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f22962b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f22961a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f22961a = j12;
            long j13 = j10 - 1;
            this.f22961a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f22962b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f22962b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f22961a = 0L;
            a aVar = this.f22962b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 < 64) {
                this.f22961a |= 1 << i10;
            } else {
                c();
                this.f22962b.h(i10 - 64);
            }
        }

        public final String toString() {
            if (this.f22962b == null) {
                return Long.toBinaryString(this.f22961a);
            }
            return this.f22962b.toString() + "xx" + Long.toBinaryString(this.f22961a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChildHelper.java */
    public interface InterfaceC0101b {
    }

    public b(u uVar) {
        this.f22958a = uVar;
    }

    public final void a(View view, int i10, boolean z10) {
        InterfaceC0101b interfaceC0101b = this.f22958a;
        int childCount = i10 < 0 ? ((u) interfaceC0101b).f23086a.getChildCount() : f(i10);
        this.f22959b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = ((u) interfaceC0101b).f23086a;
        recyclerView.addView(view, childCount);
        RecyclerView.ViewHolder viewHolderD = RecyclerView.D(view);
        recyclerView.onChildAttachedToWindow(view);
        RecyclerView.Adapter adapter = recyclerView.G0;
        if (adapter != null && viewHolderD != null) {
            adapter.onViewAttachedToWindow(viewHolderD);
        }
        ArrayList arrayList = recyclerView.X0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((RecyclerView.OnChildAttachStateChangeListener) recyclerView.X0.get(size)).onChildViewAttachedToWindow(view);
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        InterfaceC0101b interfaceC0101b = this.f22958a;
        int childCount = i10 < 0 ? ((u) interfaceC0101b).f23086a.getChildCount() : f(i10);
        this.f22959b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        u uVar = (u) interfaceC0101b;
        uVar.getClass();
        RecyclerView.ViewHolder viewHolderD = RecyclerView.D(view);
        RecyclerView recyclerView = uVar.f23086a;
        if (viewHolderD != null) {
            if (!viewHolderD.isTmpDetached() && !viewHolderD.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(viewHolderD);
                throw new IllegalArgumentException(o1.b(recyclerView, sb2));
            }
            viewHolderD.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.ViewHolder viewHolderD;
        int iF = f(i10);
        this.f22959b.f(iF);
        RecyclerView recyclerView = ((u) this.f22958a).f23086a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (viewHolderD = RecyclerView.D(childAt)) != null) {
            if (viewHolderD.isTmpDetached() && !viewHolderD.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(viewHolderD);
                throw new IllegalArgumentException(o1.b(recyclerView, sb2));
            }
            viewHolderD.addFlags(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i10) {
        return ((u) this.f22958a).f23086a.getChildAt(f(i10));
    }

    public final int e() {
        return ((u) this.f22958a).f23086a.getChildCount() - this.f22960c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = ((u) this.f22958a).f23086a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            a aVar = this.f22959b;
            int iB = i10 - (i11 - aVar.b(i11));
            if (iB == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((u) this.f22958a).f23086a.getChildAt(i10);
    }

    public final int h() {
        return ((u) this.f22958a).f23086a.getChildCount();
    }

    public final void i(View view) {
        this.f22960c.add(view);
        u uVar = (u) this.f22958a;
        uVar.getClass();
        RecyclerView.ViewHolder viewHolderD = RecyclerView.D(view);
        if (viewHolderD != null) {
            viewHolderD.onEnteredHiddenState(uVar.f23086a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = ((u) this.f22958a).f23086a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        a aVar = this.f22959b;
        if (aVar.d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - aVar.b(iIndexOfChild);
    }

    public final boolean k(View view) {
        return this.f22960c.contains(view);
    }

    public final void l(int i10) {
        int iF = f(i10);
        u uVar = (u) this.f22958a;
        View childAt = uVar.f23086a.getChildAt(iF);
        if (childAt == null) {
            return;
        }
        if (this.f22959b.f(iF)) {
            m(childAt);
        }
        uVar.a(iF);
    }

    public final void m(View view) {
        if (this.f22960c.remove(view)) {
            u uVar = (u) this.f22958a;
            uVar.getClass();
            RecyclerView.ViewHolder viewHolderD = RecyclerView.D(view);
            if (viewHolderD != null) {
                viewHolderD.onLeftHiddenState(uVar.f23086a);
            }
        }
    }

    public final String toString() {
        return this.f22959b.toString() + ", hidden list:" + this.f22960c.size();
    }
}
