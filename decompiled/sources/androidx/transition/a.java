package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: compiled from: GhostViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f23731r0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public ViewGroup f23732p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f23733q0;

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GhostViewHolder.java */
    @RequiresApi(21)
    public static class C0106a {
        @DoNotInline
        public static float a(View view) {
            return view.getZ();
        }
    }

    public static void a(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f23733q0) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            int i10 = R.id.ghost_view_holder;
            ViewGroup viewGroup = this.f23732p0;
            viewGroup.setTag(i10, null);
            viewGroup.getOverlay().remove(this);
            this.f23733q0 = false;
        }
    }
}
