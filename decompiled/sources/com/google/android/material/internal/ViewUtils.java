package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.drawable.DrawableUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ViewUtils {

    @RequiresApi(16)
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    public class a implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f44899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f44900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f44901r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ OnApplyWindowInsetsListener f44902s0;

        public a(boolean z10, boolean z11, boolean z12, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            this.f44899p0 = z10;
            this.f44900q0 = z11;
            this.f44901r0 = z12;
            this.f44902s0 = onApplyWindowInsetsListener;
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        @NonNull
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull RelativePadding relativePadding) {
            if (this.f44899p0) {
                relativePadding.bottom = windowInsetsCompat.getSystemWindowInsetBottom() + relativePadding.bottom;
            }
            boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
            if (this.f44900q0) {
                if (zIsLayoutRtl) {
                    relativePadding.end = windowInsetsCompat.getSystemWindowInsetLeft() + relativePadding.end;
                } else {
                    relativePadding.start = windowInsetsCompat.getSystemWindowInsetLeft() + relativePadding.start;
                }
            }
            if (this.f44901r0) {
                if (zIsLayoutRtl) {
                    relativePadding.start = windowInsetsCompat.getSystemWindowInsetRight() + relativePadding.start;
                } else {
                    relativePadding.end = windowInsetsCompat.getSystemWindowInsetRight() + relativePadding.end;
                }
            }
            relativePadding.applyToView(view);
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f44902s0;
            return onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompat, relativePadding) : windowInsetsCompat;
        }
    }

    public class b implements androidx.core.view.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OnApplyWindowInsetsListener f44903p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RelativePadding f44904q0;

        public b(OnApplyWindowInsetsListener onApplyWindowInsetsListener, RelativePadding relativePadding) {
            this.f44903p0 = onApplyWindowInsetsListener;
            this.f44904q0 = relativePadding;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f44903p0.onApplyWindowInsets(view, windowInsetsCompat, new RelativePadding(this.f44904q0));
        }
    }

    public static void addOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect calculateOffsetRectFromBounds(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, view2.getWidth() + i12, view2.getHeight() + i13);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i10, int i11) {
        doOnApplyWindowInsets(view, attributeSet, i10, i11, null);
    }

    public static float dpToPx(@NonNull Context context, @Dimension(unit = 0) int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public static Integer getBackgroundColor(@NonNull View view) {
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(view.getBackground());
        if (colorStateListOrNull != null) {
            return Integer.valueOf(colorStateListOrNull.getDefaultColor());
        }
        return null;
    }

    @NonNull
    public static List<View> getChildren(@Nullable View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                arrayList.add(viewGroup.getChildAt(i10));
            }
        }
        return arrayList;
    }

    @Nullable
    public static ViewGroup getContentView(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    public static ViewOverlayImpl getContentViewOverlay(@NonNull View view) {
        return getOverlay(getContentView(view));
    }

    @Nullable
    public static ViewOverlayImpl getOverlay(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new e(view);
    }

    public static float getParentAbsoluteElevation(@NonNull View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ViewCompat.getElevation((View) parent);
        }
        return elevation;
    }

    public static void hideKeyboard(@NonNull View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view) {
        if (ViewCompat.isAttachedToWindow(view)) {
            ViewCompat.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void requestFocusAndShowKeyboard(@NonNull View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void setBoundsFromRect(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(@NonNull View view) {
        showKeyboard(view, true);
    }

    @NonNull
    public static Rect calculateRectFromBounds(@NonNull View view, int i10) {
        return new Rect(view.getLeft(), view.getTop() + i10, view.getRight(), view.getBottom() + i10);
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @Nullable AttributeSet attributeSet, int i10, int i11, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Insets, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new a(z10, z11, z12, onApplyWindowInsetsListener));
    }

    public static void hideKeyboard(@NonNull View view, boolean z10) {
        WindowInsetsControllerCompat windowInsetsController;
        if (z10 && (windowInsetsController = ViewCompat.getWindowInsetsController(view)) != null) {
            windowInsetsController.hide(WindowInsetsCompat.Type.ime());
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestFocusAndShowKeyboard(@NonNull final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.f
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z10);
            }
        });
    }

    public static void showKeyboard(@NonNull View view, boolean z10) {
        WindowInsetsControllerCompat windowInsetsController;
        if (!z10 || (windowInsetsController = ViewCompat.getWindowInsetsController(view)) == null) {
            ((InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
        } else {
            windowInsetsController.show(WindowInsetsCompat.Type.ime());
        }
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i10, int i11, int i12, int i13) {
            this.start = i10;
            this.top = i11;
            this.end = i12;
            this.bottom = i13;
        }

        public void applyToView(View view) {
            ViewCompat.setPaddingRelative(view, this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @NonNull OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ViewCompat.setOnApplyWindowInsetsListener(view, new b(onApplyWindowInsetsListener, new RelativePadding(ViewCompat.getPaddingStart(view), view.getPaddingTop(), ViewCompat.getPaddingEnd(view), view.getPaddingBottom())));
        requestApplyInsetsWhenAttached(view);
    }

    public class c implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
