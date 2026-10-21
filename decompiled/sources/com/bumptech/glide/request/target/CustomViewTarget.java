package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.R;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CustomViewTarget<T extends View, Z> implements Target<Z> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @IdRes
    public static final int f38820t0 = R.id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final b f38821p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public a f38822q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f38823r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f38824s0;
    protected final T view;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Request request = CustomViewTarget.this.getRequest();
            if (request == null || !request.isCleared()) {
                return;
            }
            request.begin();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CustomViewTarget customViewTarget = CustomViewTarget.this;
            Request request = customViewTarget.getRequest();
            if (request != null) {
                customViewTarget.f38823r0 = true;
                request.clear();
                customViewTarget.f38823r0 = false;
            }
        }
    }

    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f38826e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f38827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f38828b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f38830d;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final WeakReference<b> f38831p0;

            public a(@NonNull b bVar) {
                this.f38831p0 = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                b bVar = this.f38831p0.get();
                if (bVar == null) {
                    return true;
                }
                ArrayList arrayList = bVar.f38828b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                View view = bVar.f38827a;
                int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int iA = bVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int iA2 = bVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((SizeReadyCallback) it.next()).onSizeReady(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(bVar.f38830d);
                }
                bVar.f38830d = null;
                arrayList.clear();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f38827a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            boolean z10 = this.f38829c;
            View view = this.f38827a;
            if (z10 && view.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (view.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            Context context = view.getContext();
            if (f38826e == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f38826e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f38826e.intValue();
        }
    }

    public CustomViewTarget(@NonNull T t10) {
        this.view = (T) Preconditions.checkNotNull(t10);
        this.f38821p0 = new b(t10);
    }

    @NonNull
    public final CustomViewTarget<T, Z> clearOnDetach() {
        if (this.f38822q0 != null) {
            return this;
        }
        a aVar = new a();
        this.f38822q0 = aVar;
        if (!this.f38824s0) {
            this.view.addOnAttachStateChangeListener(aVar);
            this.f38824s0 = true;
        }
        return this;
    }

    @Override // com.bumptech.glide.request.target.Target
    @Nullable
    public final Request getRequest() {
        Object tag = this.view.getTag(f38820t0);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        b bVar = this.f38821p0;
        View view = bVar.f38827a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = bVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = bVar.f38827a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = bVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            sizeReadyCallback.onSizeReady(iA, iA2);
            return;
        }
        ArrayList arrayList = bVar.f38828b;
        if (!arrayList.contains(sizeReadyCallback)) {
            arrayList.add(sizeReadyCallback);
        }
        if (bVar.f38830d == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            b.a aVar = new b.a(bVar);
            bVar.f38830d = aVar;
            viewTreeObserver.addOnPreDrawListener(aVar);
        }
    }

    @NonNull
    public final T getView() {
        return this.view;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadCleared(@Nullable Drawable drawable) {
        a aVar;
        b bVar = this.f38821p0;
        ViewTreeObserver viewTreeObserver = bVar.f38827a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(bVar.f38830d);
        }
        bVar.f38830d = null;
        bVar.f38828b.clear();
        onResourceCleared(drawable);
        if (this.f38823r0 || (aVar = this.f38822q0) == null || !this.f38824s0) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(aVar);
        this.f38824s0 = false;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onLoadStarted(@Nullable Drawable drawable) {
        a aVar = this.f38822q0;
        if (aVar != null && !this.f38824s0) {
            this.view.addOnAttachStateChangeListener(aVar);
            this.f38824s0 = true;
        }
        onResourceLoading(drawable);
    }

    public abstract void onResourceCleared(@Nullable Drawable drawable);

    @Override // com.bumptech.glide.request.target.Target
    public final void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f38821p0.f38828b.remove(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void setRequest(@Nullable Request request) {
        this.view.setTag(f38820t0, request);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    @NonNull
    public final CustomViewTarget<T, Z> waitForLayout() {
        this.f38821p0.f38829c = true;
        return this;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    public void onResourceLoading(@Nullable Drawable drawable) {
    }

    @Deprecated
    public final CustomViewTarget<T, Z> useTagId(@IdRes int i10) {
        return this;
    }
}
