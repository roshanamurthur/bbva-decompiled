package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollingParentHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20221b;

    public NestedScrollingParentHelper(@NonNull ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        return this.f20220a | this.f20221b;
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f20221b = i10;
        } else {
            this.f20220a = i10;
        }
    }

    public void onStopNestedScroll(@NonNull View view, int i10) {
        if (i10 == 1) {
            this.f20221b = 0;
        } else {
            this.f20220a = 0;
        }
    }
}
