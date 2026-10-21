package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class InterpolateOnScrollPositionChangeHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f45228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MaterialShapeDrawable f45229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScrollView f45230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f45231d = new int[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f45232e = new int[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f45233f = new a();

    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    }

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        this.f45228a = view;
        this.f45229b = materialShapeDrawable;
        this.f45230c = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.f45230c = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.f45229b = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f45233f);
    }

    public void stopListeningForScrollChanges(@NonNull ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f45233f);
    }

    public void updateInterpolationForScreenPosition() {
        ScrollView scrollView = this.f45230c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() == 0) {
            throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        }
        ScrollView scrollView2 = this.f45230c;
        int[] iArr = this.f45231d;
        scrollView2.getLocationInWindow(iArr);
        View childAt = this.f45230c.getChildAt(0);
        int[] iArr2 = this.f45232e;
        childAt.getLocationInWindow(iArr2);
        View view = this.f45228a;
        int top = (view.getTop() - iArr[1]) + iArr2[1];
        int height = view.getHeight();
        int height2 = this.f45230c.getHeight();
        if (top < 0) {
            this.f45229b.setInterpolation(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
            view.invalidate();
            return;
        }
        int i10 = top + height;
        if (i10 > height2) {
            this.f45229b.setInterpolation(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i10 - height2) / height))));
            view.invalidate();
        } else if (this.f45229b.getInterpolation() != 1.0f) {
            this.f45229b.setInterpolation(1.0f);
            view.invalidate();
        }
    }
}
