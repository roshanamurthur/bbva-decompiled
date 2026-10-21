package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f22586s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f22587h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f22588i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<e> f22589j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<d> f22590k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> f22591l = new ArrayList<>();
    public final ArrayList<ArrayList<e>> m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f22592n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f22593o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f22594p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f22595q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f22596r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22597p0;

        public a(ArrayList arrayList) {
            this.f22597p0 = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f22597p0;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                if (!zHasNext) {
                    arrayList.clear();
                    defaultItemAnimator.m.remove(arrayList);
                    return;
                }
                e eVar = (e) it.next();
                RecyclerView.ViewHolder viewHolder = eVar.f22609a;
                defaultItemAnimator.getClass();
                View view = viewHolder.itemView;
                int i10 = eVar.f22612d - eVar.f22610b;
                int i11 = eVar.f22613e - eVar.f22611c;
                if (i10 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i11 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                defaultItemAnimator.f22594p.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(defaultItemAnimator.getMoveDuration()).setListener(new f(defaultItemAnimator, viewHolder, i10, view, i11, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22599p0;

        public b(ArrayList arrayList) {
            this.f22599p0 = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f22599p0;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                if (!zHasNext) {
                    arrayList.clear();
                    defaultItemAnimator.f22592n.remove(arrayList);
                    return;
                }
                d dVar = (d) it.next();
                defaultItemAnimator.getClass();
                RecyclerView.ViewHolder viewHolder = dVar.f22603a;
                View view = viewHolder == null ? null : viewHolder.itemView;
                RecyclerView.ViewHolder viewHolder2 = dVar.f22604b;
                View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
                ArrayList<RecyclerView.ViewHolder> arrayList2 = defaultItemAnimator.f22596r;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(defaultItemAnimator.getChangeDuration());
                    arrayList2.add(dVar.f22603a);
                    duration.translationX(dVar.f22607e - dVar.f22605c);
                    duration.translationY(dVar.f22608f - dVar.f22606d);
                    duration.alpha(0.0f).setListener(new g(defaultItemAnimator, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(dVar.f22604b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(defaultItemAnimator.getChangeDuration()).alpha(1.0f).setListener(new h(defaultItemAnimator, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22601p0;

        public c(ArrayList arrayList) {
            this.f22601p0 = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f22601p0;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                if (!zHasNext) {
                    arrayList.clear();
                    defaultItemAnimator.f22591l.remove(arrayList);
                    return;
                }
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                defaultItemAnimator.getClass();
                View view = viewHolder.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                defaultItemAnimator.f22593o.add(viewHolder);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(defaultItemAnimator.getAddDuration()).setListener(new androidx.recyclerview.widget.e(view, viewPropertyAnimatorAnimate, defaultItemAnimator, viewHolder)).start();
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f22603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.ViewHolder f22604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22608f;

        @SuppressLint({"UnknownNullness"})
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f22603a);
            sb2.append(", newHolder=");
            sb2.append(this.f22604b);
            sb2.append(", fromX=");
            sb2.append(this.f22605c);
            sb2.append(", fromY=");
            sb2.append(this.f22606d);
            sb2.append(", toX=");
            sb2.append(this.f22607e);
            sb2.append(", toY=");
            return androidx.activity.a.d(sb2, this.f22608f, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f22609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22613e;
    }

    public static void b(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        f(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f22588i.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i10, int i11, int i12, int i13) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i10, i11, i12, i13);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        f(viewHolder);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            f(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i14);
            viewHolder2.itemView.setTranslationY(-i15);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList<d> arrayList = this.f22590k;
        d dVar = new d();
        dVar.f22603a = viewHolder;
        dVar.f22604b = viewHolder2;
        dVar.f22605c = i10;
        dVar.f22606d = i11;
        dVar.f22607e = i12;
        dVar.f22608f = i13;
        arrayList.add(dVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i10, int i11, int i12, int i13) {
        View view = viewHolder.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) viewHolder.itemView.getTranslationY());
        f(viewHolder);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList<e> arrayList = this.f22589j;
        e eVar = new e();
        eVar.f22609a = viewHolder;
        eVar.f22610b = translationX;
        eVar.f22611c = translationY;
        eVar.f22612d = i12;
        eVar.f22613e = i13;
        arrayList.add(eVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        f(viewHolder);
        this.f22587h.add(viewHolder);
        return true;
    }

    public final void c() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }

    public final void d(RecyclerView.ViewHolder viewHolder, ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (e(dVar, viewHolder) && dVar.f22603a == null && dVar.f22604b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean e(d dVar, RecyclerView.ViewHolder viewHolder) {
        boolean z10 = false;
        if (dVar.f22604b == viewHolder) {
            dVar.f22604b = null;
        } else {
            if (dVar.f22603a != viewHolder) {
                return false;
            }
            dVar.f22603a = null;
            z10 = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.f22589j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f22609a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                arrayList.remove(size);
            }
        }
        d(viewHolder, this.f22590k);
        if (this.f22587h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f22588i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f22592n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            d(viewHolder, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (arrayList5.get(size4).f22609a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.ViewHolder>> arrayList6 = this.f22591l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f22595q.remove(viewHolder);
        this.f22593o.remove(viewHolder);
        this.f22596r.remove(viewHolder);
        this.f22594p.remove(viewHolder);
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        ArrayList<e> arrayList = this.f22589j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.f22609a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(eVar.f22609a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f22587h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f22588i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = arrayList3.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f22590k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.ViewHolder viewHolder2 = dVar.f22603a;
            if (viewHolder2 != null) {
                e(dVar, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = dVar.f22604b;
            if (viewHolder3 != null) {
                e(dVar, viewHolder3);
            }
        }
        arrayList4.clear();
        if (isRunning()) {
            ArrayList<ArrayList<e>> arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.f22609a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(eVar2.f22609a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.ViewHolder>> arrayList7 = this.f22591l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList8.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.f22592n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = dVar2.f22603a;
                    if (viewHolder5 != null) {
                        e(dVar2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = dVar2.f22604b;
                    if (viewHolder6 != null) {
                        e(dVar2, viewHolder6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            b(this.f22595q);
            b(this.f22594p);
            b(this.f22593o);
            b(this.f22596r);
            dispatchAnimationsFinished();
        }
    }

    public final void f(RecyclerView.ViewHolder viewHolder) {
        if (f22586s == null) {
            f22586s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f22586s);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        return (this.f22588i.isEmpty() && this.f22590k.isEmpty() && this.f22589j.isEmpty() && this.f22587h.isEmpty() && this.f22594p.isEmpty() && this.f22595q.isEmpty() && this.f22593o.isEmpty() && this.f22596r.isEmpty() && this.m.isEmpty() && this.f22591l.isEmpty() && this.f22592n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        ArrayList<RecyclerView.ViewHolder> arrayList = this.f22587h;
        boolean z10 = !arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.f22589j;
        boolean z11 = !arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f22590k;
        boolean z12 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.ViewHolder> arrayList4 = this.f22588i;
        boolean z13 = !arrayList4.isEmpty();
        if (z10 || z11 || z13 || z12) {
            for (RecyclerView.ViewHolder viewHolder : arrayList) {
                View view = viewHolder.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f22595q.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new androidx.recyclerview.widget.d(view, viewPropertyAnimatorAnimate, this, viewHolder)).start();
            }
            arrayList.clear();
            if (z11) {
                ArrayList<e> arrayList5 = new ArrayList<>();
                arrayList5.addAll(arrayList2);
                this.m.add(arrayList5);
                arrayList2.clear();
                a aVar = new a(arrayList5);
                if (z10) {
                    ViewCompat.postOnAnimationDelayed(arrayList5.get(0).f22609a.itemView, aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<d> arrayList6 = new ArrayList<>();
                arrayList6.addAll(arrayList3);
                this.f22592n.add(arrayList6);
                arrayList3.clear();
                b bVar = new b(arrayList6);
                if (z10) {
                    ViewCompat.postOnAnimationDelayed(arrayList6.get(0).f22603a.itemView, bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.ViewHolder> arrayList7 = new ArrayList<>();
                arrayList7.addAll(arrayList4);
                this.f22591l.add(arrayList7);
                arrayList4.clear();
                c cVar = new c(arrayList7);
                if (z10 || z11 || z12) {
                    ViewCompat.postOnAnimationDelayed(arrayList7.get(0).itemView, cVar, Math.max(z11 ? getMoveDuration() : 0L, z12 ? getChangeDuration() : 0L) + (z10 ? getRemoveDuration() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }
}
