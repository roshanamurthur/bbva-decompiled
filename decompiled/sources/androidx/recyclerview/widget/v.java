package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: RecyclerView.java */
/* JADX INFO: loaded from: classes2.dex */
public final class v implements a.InterfaceC0100a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f23087a;

    public v(RecyclerView recyclerView) {
        this.f23087a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f22954a;
        RecyclerView recyclerView = this.f23087a;
        if (i10 == 1) {
            recyclerView.H0.onItemsAdded(recyclerView, bVar.f22955b, bVar.f22957d);
            return;
        }
        if (i10 == 2) {
            recyclerView.H0.onItemsRemoved(recyclerView, bVar.f22955b, bVar.f22957d);
        } else if (i10 == 4) {
            recyclerView.H0.onItemsUpdated(recyclerView, bVar.f22955b, bVar.f22957d, bVar.f22956c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.H0.onItemsMoved(recyclerView, bVar.f22955b, bVar.f22957d, 1);
        }
    }

    public final void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f23087a;
        int iH = recyclerView.f22763u0.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = recyclerView.f22763u0.g(i15);
            RecyclerView.ViewHolder viewHolderD = RecyclerView.D(viewG);
            if (viewHolderD != null && !viewHolderD.shouldIgnore() && (i13 = viewHolderD.mPosition) >= i10 && i13 < i14) {
                viewHolderD.addFlags(2);
                viewHolderD.addChangePayload(obj);
                ((RecyclerView.LayoutParams) viewG.getLayoutParams()).f22798c = true;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.f22758r0;
        ArrayList<RecyclerView.ViewHolder> arrayList = recycler.f22809c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = arrayList.get(size);
            if (viewHolder != null && (i12 = viewHolder.mPosition) >= i10 && i12 < i14) {
                viewHolder.addFlags(2);
                recycler.f(size);
            }
        }
        recyclerView.D1 = true;
    }

    public final void c(int i10, int i11) {
        RecyclerView recyclerView = this.f23087a;
        int iH = recyclerView.f22763u0.h();
        for (int i12 = 0; i12 < iH; i12++) {
            RecyclerView.ViewHolder viewHolderD = RecyclerView.D(recyclerView.f22763u0.g(i12));
            if (viewHolderD != null && !viewHolderD.shouldIgnore() && viewHolderD.mPosition >= i10) {
                viewHolderD.offsetPosition(i11, false);
                recyclerView.f22772z1.f22837g = true;
            }
        }
        ArrayList<RecyclerView.ViewHolder> arrayList = recyclerView.f22758r0.f22809c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.ViewHolder viewHolder = arrayList.get(i13);
            if (viewHolder != null && viewHolder.mPosition >= i10) {
                viewHolder.offsetPosition(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.C1 = true;
    }

    public final void d(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f23087a;
        int iH = recyclerView.f22763u0.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            RecyclerView.ViewHolder viewHolderD = RecyclerView.D(recyclerView.f22763u0.g(i20));
            if (viewHolderD != null && (i18 = viewHolderD.mPosition) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    viewHolderD.offsetPosition(i11 - i10, false);
                } else {
                    viewHolderD.offsetPosition(i14, false);
                }
                recyclerView.f22772z1.f22837g = true;
            }
        }
        RecyclerView.Recycler recycler = recyclerView.f22758r0;
        recycler.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList<RecyclerView.ViewHolder> arrayList = recycler.f22809c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.ViewHolder viewHolder = arrayList.get(i21);
            if (viewHolder != null && (i17 = viewHolder.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    viewHolder.offsetPosition(i11 - i10, false);
                } else {
                    viewHolder.offsetPosition(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.C1 = true;
    }
}
