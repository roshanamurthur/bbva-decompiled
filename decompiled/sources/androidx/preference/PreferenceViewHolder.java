package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Drawable f22412p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ColorStateList f22413q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final SparseArray<View> f22414r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f22415s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f22416t0;

    public PreferenceViewHolder(@NonNull View view) {
        super(view);
        SparseArray<View> sparseArray = new SparseArray<>(4);
        this.f22414r0 = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        int i10 = R.id.icon_frame;
        sparseArray.put(i10, view.findViewById(i10));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f22412p0 = view.getBackground();
        if (textView != null) {
            this.f22413q0 = textView.getTextColors();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.TESTS})
    public static PreferenceViewHolder createInstanceForTests(@NonNull View view) {
        return new PreferenceViewHolder(view);
    }

    public View findViewById(@IdRes int i10) {
        SparseArray<View> sparseArray = this.f22414r0;
        View view = sparseArray.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i10);
        if (viewFindViewById != null) {
            sparseArray.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean isDividerAllowedAbove() {
        return this.f22415s0;
    }

    public boolean isDividerAllowedBelow() {
        return this.f22416t0;
    }

    public void setDividerAllowedAbove(boolean z10) {
        this.f22415s0 = z10;
    }

    public void setDividerAllowedBelow(boolean z10) {
        this.f22416t0 = z10;
    }
}
