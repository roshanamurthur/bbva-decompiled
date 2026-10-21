package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import qe.k;
import qe.l;
import qe.m;
import qe.s;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static WeakReference<View> f45965f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Rect f45969d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f45966a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45967b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45968c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ShapeProvider f45970e = new ShapeableViewShapeProvider();

    public interface ShapeProvider {
        @Nullable
        ShapeAppearanceModel provideShape(@NonNull View view);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @Nullable
        public ShapeAppearanceModel provideShape(@NonNull View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
        return this.f45970e;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.f45968c;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.f45967b;
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f45965f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        ShapeAppearanceModel shapeAppearanceModelProvideShape;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f45965f) != null && this.f45970e != null && (view = weakReference.get()) != null && (shapeAppearanceModelProvideShape = this.f45970e.provideShape(view)) != null) {
            viewOnCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, shapeAppearanceModelProvideShape);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activity = ContextUtils.getActivity(view.getContext())) == null) {
            return;
        }
        Window window = activity.getWindow();
        if (this.f45966a) {
            Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
                MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
                if (!this.f45968c) {
                    window.setSharedElementReenterTransition(null);
                }
                if (this.f45967b) {
                    if (materialContainerTransform.getDuration() >= 0) {
                        window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
                    }
                    materialContainerTransform.addListener(new k(window));
                    return;
                }
                return;
            }
            return;
        }
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform2 = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform2.setHoldAtEndEnabled(true);
            materialContainerTransform2.addListener(new l(activity));
            if (this.f45967b) {
                if (materialContainerTransform2.getDuration() >= 0) {
                    window.setTransitionBackgroundFadeDuration(materialContainerTransform2.getDuration());
                }
                materialContainerTransform2.addListener(new m(window));
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i10 = R.id.mtrl_motion_snapshot_view;
            if (view.getTag(i10) instanceof View) {
                list2.get(0).setTag(i10, null);
            }
        }
        if (!this.f45966a && !list2.isEmpty()) {
            View view2 = list2.get(0);
            RectF rectF = s.f92861a;
            this.f45969d = new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
        }
        this.f45966a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f45966a || list2.isEmpty() || this.f45969d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f45969d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f45969d.height(), 1073741824));
        Rect rect = this.f45969d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setShapeProvider(@Nullable ShapeProvider shapeProvider) {
        this.f45970e = shapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z10) {
        this.f45968c = z10;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z10) {
        this.f45967b = z10;
    }
}
