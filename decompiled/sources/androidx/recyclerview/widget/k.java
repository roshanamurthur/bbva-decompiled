package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: compiled from: ItemTouchHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ItemTouchHelper.e f23041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f23042q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ItemTouchHelper f23043r0;

    public k(ItemTouchHelper itemTouchHelper, ItemTouchHelper.e eVar, int i10) {
        this.f23043r0 = itemTouchHelper;
        this.f23041p0 = eVar;
        this.f23042q0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ItemTouchHelper itemTouchHelper = this.f23043r0;
        RecyclerView recyclerView = itemTouchHelper.f22663r;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        ItemTouchHelper.e eVar = this.f23041p0;
        if (eVar.f22694k) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = eVar.f22688e;
        if (viewHolder.getAbsoluteAdapterPosition() != -1) {
            RecyclerView.ItemAnimator itemAnimator = itemTouchHelper.f22663r.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.isRunning(null)) {
                ArrayList arrayList = itemTouchHelper.f22661p;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((ItemTouchHelper.e) arrayList.get(i10)).f22695l) {
                    }
                }
                itemTouchHelper.m.onSwiped(viewHolder, this.f23042q0);
                return;
            }
            itemTouchHelper.f22663r.post(this);
        }
    }
}
