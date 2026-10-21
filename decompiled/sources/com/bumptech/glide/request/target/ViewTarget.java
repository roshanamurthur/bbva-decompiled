package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
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
@Deprecated
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static boolean f38852u0;
    public static int v0 = R.id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final b f38853q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public a f38854r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f38855s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f38856t0;
    protected final T view;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Request request = ViewTarget.this.getRequest();
            if (request == null || !request.isCleared()) {
                return;
            }
            request.begin();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTarget viewTarget = ViewTarget.this;
            Request request = viewTarget.getRequest();
            if (request != null) {
                viewTarget.f38855s0 = true;
                request.clear();
                viewTarget.f38855s0 = false;
            }
        }
    }

    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        public static Integer f38858e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f38859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f38860b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f38862d;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final WeakReference<b> f38863p0;

            public a(@NonNull b bVar) {
                this.f38863p0 = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                b bVar = this.f38863p0.get();
                if (bVar == null) {
                    return true;
                }
                ArrayList arrayList = bVar.f38860b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                View view = bVar.f38859a;
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
                    viewTreeObserver.removeOnPreDrawListener(bVar.f38862d);
                }
                bVar.f38862d = null;
                arrayList.clear();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f38859a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            boolean z10 = this.f38861c;
            View view = this.f38859a;
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
            if (f38858e == null) {
                Display defaultDisplay = ((WindowManager) Preconditions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f38858e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f38858e.intValue();
        }
    }

    public ViewTarget(@NonNull T t10) {
        this.view = (T) Preconditions.checkNotNull(t10);
        this.f38853q0 = new b(t10);
    }

    @Deprecated
    public static void setTagId(int i10) {
        if (f38852u0) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        v0 = i10;
    }

    @NonNull
    public final ViewTarget<T, Z> clearOnDetach() {
        if (this.f38854r0 != null) {
            return this;
        }
        a aVar = new a();
        this.f38854r0 = aVar;
        if (!this.f38856t0) {
            this.view.addOnAttachStateChangeListener(aVar);
            this.f38856t0 = true;
        }
        return this;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @Nullable
    public Request getRequest() {
        Object tag = this.view.getTag(v0);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.Target
    @CallSuper
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback) {
        b bVar = this.f38853q0;
        View view = bVar.f38859a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = bVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        View view2 = bVar.f38859a;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int iA2 = bVar.a(view2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            sizeReadyCallback.onSizeReady(iA, iA2);
            return;
        }
        ArrayList arrayList = bVar.f38860b;
        if (!arrayList.contains(sizeReadyCallback)) {
            arrayList.add(sizeReadyCallback);
        }
        if (bVar.f38862d == null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            b.a aVar = new b.a(bVar);
            bVar.f38862d = aVar;
            viewTreeObserver.addOnPreDrawListener(aVar);
        }
    }

    @NonNull
    public T getView() {
        return this.view;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @CallSuper
    public void onLoadCleared(@Nullable Drawable drawable) {
        a aVar;
        super.onLoadCleared(drawable);
        b bVar = this.f38853q0;
        ViewTreeObserver viewTreeObserver = bVar.f38859a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(bVar.f38862d);
        }
        bVar.f38862d = null;
        bVar.f38860b.clear();
        if (this.f38855s0 || (aVar = this.f38854r0) == null || !this.f38856t0) {
            return;
        }
        this.view.removeOnAttachStateChangeListener(aVar);
        this.f38856t0 = false;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    @CallSuper
    public void onLoadStarted(@Nullable Drawable drawable) {
        super.onLoadStarted(drawable);
        a aVar = this.f38854r0;
        if (aVar == null || this.f38856t0) {
            return;
        }
        this.view.addOnAttachStateChangeListener(aVar);
        this.f38856t0 = true;
    }

    @Override // com.bumptech.glide.request.target.Target
    @CallSuper
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback) {
        this.f38853q0.f38860b.remove(sizeReadyCallback);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void setRequest(@Nullable Request request) {
        f38852u0 = true;
        this.view.setTag(v0, request);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    @NonNull
    public final ViewTarget<T, Z> waitForLayout() {
        this.f38853q0.f38861c = true;
        return this;
    }

    @Deprecated
    public ViewTarget(@NonNull T t10, boolean z10) {
        this(t10);
        if (z10) {
            waitForLayout();
        }
    }
}
