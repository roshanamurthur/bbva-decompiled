package com.bbva.ui.widget.topsnackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.room.f;
import com.bbva.ui.R;
import com.bbva.ui.widget.topsnackbar.TSnackbar;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes9.dex */
public final class TSnackbar {
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f37749g = new Handler(Looper.getMainLooper(), new mc.b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f37750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SnackbarLayout f37752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Callback f37754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f37755f = new a();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    public static class SnackbarLayout extends LinearLayout {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TextView f37756p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Button f37757q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f37758r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final int f37759s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public b f37760t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f37761u0;

        public interface a {
        }

        public interface b {
        }

        public SnackbarLayout(Context context) {
            this(context, null);
        }

        public final boolean a(int i10, int i11, int i12) {
            boolean z10;
            if (i10 != getOrientation()) {
                setOrientation(i10);
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f37756p0.getPaddingTop() == i11 && this.f37756p0.getPaddingBottom() == i12) {
                return z10;
            }
            TextView textView = this.f37756p0;
            if (ViewCompat.isPaddingRelative(textView)) {
                ViewCompat.setPaddingRelative(textView, ViewCompat.getPaddingStart(textView), i11, ViewCompat.getPaddingEnd(textView), i12);
                return true;
            }
            textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
            return true;
        }

        public Button getActionView() {
            return this.f37757q0;
        }

        public TextView getMessageView() {
            return this.f37756p0;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            a aVar = this.f37761u0;
            if (aVar != null) {
                aVar.getClass();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            a aVar = this.f37761u0;
            if (aVar != null) {
                com.bbva.ui.widget.topsnackbar.c cVar = (com.bbva.ui.widget.topsnackbar.c) aVar;
                if (cVar.f37772a.isShownOrQueued()) {
                    TSnackbar.f37749g.post(new f(cVar, 2));
                }
            }
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            this.f37756p0 = (TextView) findViewById(R.id.snackbar_text);
            this.f37757q0 = (Button) findViewById(R.id.snackbar_action);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            b bVar = this.f37760t0;
            if (bVar != null) {
                TSnackbar tSnackbar = (TSnackbar) ((z0.d) bVar).f94924p0;
                int i14 = TSnackbar.LENGTH_INDEFINITE;
                tSnackbar.a();
                tSnackbar.f37752c.setOnLayoutChangeListener(null);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f37758r0 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f37758r0;
                if (measuredWidth > i13) {
                    i10 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    super.onMeasure(i10, i11);
                }
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_snackbar_padding_vertical);
            boolean z10 = this.f37756p0.getLayout().getLineCount() > 1;
            if (!z10 || (i12 = this.f37759s0) <= 0 || this.f37757q0.getMeasuredWidth() <= i12) {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i10, i11);
        }

        public void setOnAttachStateChangeListener(a aVar) {
            this.f37761u0 = aVar;
        }

        public void setOnLayoutChangeListener(b bVar) {
            this.f37760t0 = bVar;
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.SnackbarLayout);
            this.f37758r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f37759s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            int i10 = com.google.android.material.R.styleable.SnackbarLayout_elevation;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                ViewCompat.setElevation(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(R.layout.tsnackbar_layout_include, this);
            ViewCompat.setAccessibilityLiveRegion(this, 1);
        }
    }

    public class a implements com.bbva.ui.widget.topsnackbar.a.InterfaceC0168a {
        public a() {
        }

        @Override // com.bbva.ui.widget.topsnackbar.a.InterfaceC0168a
        public final void a(int i10) {
            Handler handler = TSnackbar.f37749g;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, TSnackbar.this));
        }

        @Override // com.bbva.ui.widget.topsnackbar.a.InterfaceC0168a
        public final void show() {
            Handler handler = TSnackbar.f37749g;
            handler.sendMessage(handler.obtainMessage(0, TSnackbar.this));
        }
    }

    public class b extends ViewPropertyAnimatorListenerAdapter {
        public b() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            TSnackbar tSnackbar = TSnackbar.this;
            Callback callback = tSnackbar.f37754e;
            if (callback != null) {
                callback.onShown(tSnackbar);
            }
            com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
            a aVar = TSnackbar.this.f37755f;
            synchronized (aVarC.f37765a) {
                try {
                    if (aVarC.d(aVar)) {
                        aVarC.e(aVarC.f37767c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            SnackbarLayout snackbarLayout = TSnackbar.this.f37752c;
            snackbarLayout.f37756p0.setAlpha(0.0f);
            long j10 = 180;
            long j11 = 70;
            ViewCompat.animate(snackbarLayout.f37756p0).alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
            if (snackbarLayout.f37757q0.getVisibility() == 0) {
                snackbarLayout.f37757q0.setAlpha(0.0f);
                ViewCompat.animate(snackbarLayout.f37757q0).alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
            }
        }
    }

    public final class c extends SwipeDismissBehavior<SnackbarLayout> {
        public c() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean canSwipeDismissView(@NonNull View view) {
            return view instanceof SnackbarLayout;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, @NonNull View view, MotionEvent motionEvent) {
            SnackbarLayout snackbarLayout = (SnackbarLayout) view;
            if (coordinatorLayout.isPointInChildBounds(snackbarLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                int actionMasked = motionEvent.getActionMasked();
                TSnackbar tSnackbar = TSnackbar.this;
                if (actionMasked == 0) {
                    com.bbva.ui.widget.topsnackbar.a.c().b(tSnackbar.f37755f);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
                    a aVar = tSnackbar.f37755f;
                    synchronized (aVarC.f37765a) {
                        try {
                            if (aVarC.d(aVar)) {
                                aVarC.e(aVarC.f37767c);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, snackbarLayout, motionEvent);
        }
    }

    public TSnackbar(ViewGroup viewGroup) {
        this.f37750a = viewGroup;
        Context context = viewGroup.getContext();
        this.f37751b = context;
        this.f37752c = (SnackbarLayout) LayoutInflater.from(context).inflate(R.layout.tsnackbar_layout, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[DONT_INVERT, EDGE_INSN: B:25:0x004c->B:31:0x0061 BREAK  A[LOOP:1: B:21:0x0042->B:30:0x005e], EDGE_INSN: B:50:0x0061->B:31:0x0061 BREAK  A[LOOP:1: B:21:0x0042->B:30:0x005e], PHI: r2
      0x0061: PHI (r2v2 android.view.ViewGroup) = 
      (r2v1 android.view.ViewGroup)
      (r2v1 android.view.ViewGroup)
      (r2v1 android.view.ViewGroup)
      (r2v1 android.view.ViewGroup)
      (r2v1 android.view.ViewGroup)
      (r2v1 android.view.ViewGroup)
      (r2v5 android.view.ViewGroup)
     binds: [B:17:0x002e, B:19:0x003b, B:48:0x0061, B:25:0x004c, B:50:0x0061, B:15:0x0026, B:11:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:3:0x0004->B:47:?, LOOP_END, SYNTHETIC] */
    @NonNull
    public static TSnackbar make(@NonNull View view, @NonNull CharSequence charSequence, int i10) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup2 = (ViewGroup) view;
                    if (view != null) {
                        parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                    }
                    if (view == null) {
                        viewGroup = viewGroup2;
                    }
                }
            } else if (((view instanceof Toolbar) || (view instanceof android.widget.Toolbar)) && (view.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                if (viewGroup3.getChildCount() > 1) {
                    int childCount = viewGroup3.getChildCount();
                    int i11 = 0;
                    while (i11 < childCount) {
                        if (viewGroup3.getChildAt(i11) != view) {
                            i11++;
                        } else if (i11 < childCount - 1) {
                            while (i11 < childCount) {
                                i11++;
                                View childAt = viewGroup3.getChildAt(i11);
                                if (childAt instanceof ViewGroup) {
                                    viewGroup = (ViewGroup) childAt;
                                }
                            }
                            break;
                        }
                    }
                    if (view != null) {
                        parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                    }
                    if (view == null) {
                        viewGroup = viewGroup2;
                    }
                } else {
                    if (view != null) {
                        parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                    }
                    if (view == null) {
                        viewGroup = viewGroup2;
                    }
                }
            } else {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                }
            }
            TSnackbar tSnackbar = new TSnackbar(viewGroup);
            tSnackbar.setText(charSequence);
            tSnackbar.setDuration(i10);
            return tSnackbar;
        }
        viewGroup = (ViewGroup) view;
        TSnackbar tSnackbar2 = new TSnackbar(viewGroup);
        tSnackbar2.setText(charSequence);
        tSnackbar2.setDuration(i10);
        return tSnackbar2;
    }

    public final void a() {
        SnackbarLayout snackbarLayout = this.f37752c;
        snackbarLayout.setTranslationY(-snackbarLayout.getHeight());
        ViewCompat.animate(snackbarLayout).translationY(0.0f).setInterpolator(new FastOutSlowInInterpolator()).setDuration(250L).setListener(new b()).start();
    }

    @Deprecated
    public TSnackbar addIcon(int i10, int i11) {
        TextView messageView = this.f37752c.getMessageView();
        Context context = this.f37751b;
        messageView.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(((BitmapDrawable) ResourcesCompat.getDrawable(context.getResources(), i10, null)).getBitmap(), i11, i11, true)), (Drawable) null, (Drawable) null, (Drawable) null);
        return this;
    }

    public final void b(int i10) {
        com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
        a aVar = this.f37755f;
        synchronized (aVarC.f37765a) {
            try {
                if (aVarC.d(aVar)) {
                    com.bbva.ui.widget.topsnackbar.a.a(aVarC.f37767c, i10);
                } else {
                    com.bbva.ui.widget.topsnackbar.a.b bVar = aVarC.f37768d;
                    if (bVar != null && aVar != null && bVar.f37769a.get() == aVar) {
                        com.bbva.ui.widget.topsnackbar.a.a(aVarC.f37768d, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Drawable c(Drawable drawable, int i10) {
        boolean z10;
        Bitmap bitmap;
        if ((drawable.getIntrinsicWidth() != i10 || drawable.getIntrinsicHeight() != i10) && ((z10 = drawable instanceof BitmapDrawable))) {
            Resources resources = this.f37751b.getResources();
            if (z10) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                if (!(drawable instanceof VectorDrawable)) {
                    throw new IllegalArgumentException("unsupported drawable type");
                }
                VectorDrawable vectorDrawable = (VectorDrawable) drawable;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                vectorDrawable.draw(canvas);
                bitmap = bitmapCreateBitmap;
            }
            drawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(bitmap, i10, i10, true));
        }
        drawable.setBounds(0, 0, i10, i10);
        return drawable;
    }

    public final void d(int i10) {
        com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
        a aVar = this.f37755f;
        synchronized (aVarC.f37765a) {
            try {
                if (aVarC.d(aVar)) {
                    aVarC.f37767c = null;
                    com.bbva.ui.widget.topsnackbar.a.b bVar = aVarC.f37768d;
                    if (bVar != null && bVar != null) {
                        aVarC.f37767c = bVar;
                        aVarC.f37768d = null;
                        com.bbva.ui.widget.topsnackbar.a.InterfaceC0168a interfaceC0168a = bVar.f37769a.get();
                        if (interfaceC0168a != null) {
                            interfaceC0168a.show();
                        } else {
                            aVarC.f37767c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Callback callback = this.f37754e;
        if (callback != null) {
            callback.onDismissed(this, i10);
        }
        ViewParent parent = this.f37752c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f37752c);
        }
    }

    public void dismiss() {
        b(3);
    }

    public int getDuration() {
        return this.f37753d;
    }

    @NonNull
    public View getView() {
        return this.f37752c;
    }

    public boolean isShown() {
        boolean zD;
        com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
        a aVar = this.f37755f;
        synchronized (aVarC.f37765a) {
            zD = aVarC.d(aVar);
        }
        return zD;
    }

    public boolean isShownOrQueued() {
        boolean z10;
        com.bbva.ui.widget.topsnackbar.a.b bVar;
        com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
        a aVar = this.f37755f;
        synchronized (aVarC.f37765a) {
            z10 = aVarC.d(aVar) || !((bVar = aVarC.f37768d) == null || aVar == null || bVar.f37769a.get() != aVar);
        }
        return z10;
    }

    @NonNull
    public TSnackbar setAction(@StringRes int i10, View.OnClickListener onClickListener) {
        return setAction(this.f37751b.getText(i10), onClickListener);
    }

    @NonNull
    public TSnackbar setActionTextColor(ColorStateList colorStateList) {
        this.f37752c.getActionView().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    public TSnackbar setCallback(Callback callback) {
        this.f37754e = callback;
        return this;
    }

    @NonNull
    public TSnackbar setDuration(int i10) {
        this.f37753d = i10;
        return this;
    }

    public TSnackbar setIconLeft(@DrawableRes int i10, float f6) {
        TextView messageView = this.f37752c.getMessageView();
        Context context = this.f37751b;
        Drawable drawable = ContextCompat.getDrawable(context, i10);
        if (drawable == null) {
            throw new IllegalArgumentException("resource_id is not a valid drawable!");
        }
        Drawable drawableC = c(drawable, (int) ((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f6));
        Drawable[] compoundDrawables = messageView.getCompoundDrawables();
        messageView.setCompoundDrawables(drawableC, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        return this;
    }

    public TSnackbar setIconPadding(int i10) {
        this.f37752c.getMessageView().setCompoundDrawablePadding(i10);
        return this;
    }

    public TSnackbar setIconRight(@DrawableRes int i10, float f6) {
        TextView messageView = this.f37752c.getMessageView();
        Context context = this.f37751b;
        Drawable drawable = ContextCompat.getDrawable(context, i10);
        if (drawable == null) {
            throw new IllegalArgumentException("resource_id is not a valid drawable!");
        }
        Drawable drawableC = c(drawable, (int) ((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f6));
        Drawable[] compoundDrawables = messageView.getCompoundDrawables();
        messageView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], drawableC, compoundDrawables[3]);
        return this;
    }

    public TSnackbar setMaxWidth(int i10) {
        this.f37752c.f37758r0 = i10;
        return this;
    }

    @NonNull
    public TSnackbar setText(@NonNull CharSequence charSequence) {
        this.f37752c.getMessageView().setText(charSequence);
        return this;
    }

    public void show() {
        com.bbva.ui.widget.topsnackbar.a aVarC = com.bbva.ui.widget.topsnackbar.a.c();
        int i10 = this.f37753d;
        a aVar = this.f37755f;
        synchronized (aVarC.f37765a) {
            try {
                if (aVarC.d(aVar)) {
                    com.bbva.ui.widget.topsnackbar.a.b bVar = aVarC.f37767c;
                    bVar.f37770b = i10;
                    aVarC.f37766b.removeCallbacksAndMessages(bVar);
                    aVarC.e(aVarC.f37767c);
                    return;
                }
                com.bbva.ui.widget.topsnackbar.a.b bVar2 = aVarC.f37768d;
                if (bVar2 == null || aVar == null || bVar2.f37769a.get() != aVar) {
                    aVarC.f37768d = new com.bbva.ui.widget.topsnackbar.a.b(i10, aVar);
                } else {
                    aVarC.f37768d.f37770b = i10;
                }
                com.bbva.ui.widget.topsnackbar.a.b bVar3 = aVarC.f37767c;
                if (bVar3 == null || !com.bbva.ui.widget.topsnackbar.a.a(bVar3, 4)) {
                    aVarC.f37767c = null;
                    com.bbva.ui.widget.topsnackbar.a.b bVar4 = aVarC.f37768d;
                    if (bVar4 != null) {
                        aVarC.f37767c = bVar4;
                        aVarC.f37768d = null;
                        com.bbva.ui.widget.topsnackbar.a.InterfaceC0168a interfaceC0168a = bVar4.f37769a.get();
                        if (interfaceC0168a != null) {
                            interfaceC0168a.show();
                        } else {
                            aVarC.f37767c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public TSnackbar setAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        return setAction(charSequence, true, onClickListener);
    }

    @NonNull
    public TSnackbar setAction(CharSequence charSequence, final boolean z10, final View.OnClickListener onClickListener) {
        Button actionView = this.f37752c.getActionView();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: mc.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = TSnackbar.LENGTH_INDEFINITE;
                    TSnackbar tSnackbar = this.f83389p0;
                    tSnackbar.getClass();
                    onClickListener.onClick(view);
                    if (z10) {
                        tSnackbar.b(1);
                    }
                }
            });
        } else {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
        }
        return this;
    }

    @NonNull
    public TSnackbar setActionTextColor(@ColorInt int i10) {
        this.f37752c.getActionView().setTextColor(i10);
        return this;
    }

    @NonNull
    public TSnackbar setText(@StringRes int i10) {
        return setText(this.f37751b.getText(i10));
    }

    @NonNull
    public static TSnackbar make(@NonNull View view, @StringRes int i10, int i11) {
        return make(view, view.getResources().getText(i10), i11);
    }

    public static abstract class Callback {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public void onShown(TSnackbar tSnackbar) {
        }

        public void onDismissed(TSnackbar tSnackbar, int i10) {
        }
    }
}
