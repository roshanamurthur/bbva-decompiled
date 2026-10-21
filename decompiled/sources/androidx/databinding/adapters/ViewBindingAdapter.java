package androidx.databinding.adapters;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.databinding.BindingAdapter;
import androidx.databinding.BindingMethod;
import androidx.databinding.BindingMethods;
import androidx.databinding.library.baseAdapters.R;

/* JADX INFO: loaded from: classes2.dex */
@BindingMethods({@BindingMethod(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @BindingMethod(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @BindingMethod(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @BindingMethod(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @BindingMethod(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @BindingMethod(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @BindingMethod(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @BindingMethod(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @BindingMethod(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @BindingMethod(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @BindingMethod(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @BindingMethod(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @BindingMethod(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @BindingMethod(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @BindingMethod(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @BindingMethod(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @BindingMethod(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @BindingMethod(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @BindingMethod(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @BindingMethod(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @BindingMethod(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @BindingMethod(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @BindingMethod(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @BindingMethod(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @BindingMethod(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @BindingMethod(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ViewBindingAdapter {
    public static final int FADING_EDGE_HORIZONTAL = 1;
    public static final int FADING_EDGE_NONE = 0;
    public static final int FADING_EDGE_VERTICAL = 2;

    @TargetApi(12)
    public interface OnViewAttachedToWindow {
        void onViewAttachedToWindow(View view);
    }

    @TargetApi(12)
    public interface OnViewDetachedFromWindow {
        void onViewDetachedFromWindow(View view);
    }

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ OnViewAttachedToWindow f20611p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnViewDetachedFromWindow f20612q0;

        public a(OnViewAttachedToWindow onViewAttachedToWindow, OnViewDetachedFromWindow onViewDetachedFromWindow) {
            this.f20611p0 = onViewAttachedToWindow;
            this.f20612q0 = onViewDetachedFromWindow;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            OnViewAttachedToWindow onViewAttachedToWindow = this.f20611p0;
            if (onViewAttachedToWindow != null) {
                onViewAttachedToWindow.onViewAttachedToWindow(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            OnViewDetachedFromWindow onViewDetachedFromWindow = this.f20612q0;
            if (onViewDetachedFromWindow != null) {
                onViewDetachedFromWindow.onViewDetachedFromWindow(view);
            }
        }
    }

    public static int a(float f6) {
        int i10 = (int) (0.5f + f6);
        if (i10 != 0) {
            return i10;
        }
        if (f6 == 0.0f) {
            return 0;
        }
        return f6 > 0.0f ? 1 : -1;
    }

    @BindingAdapter({"android:background"})
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @BindingAdapter({"android:onClickListener", "android:clickable"})
    public static void setClickListener(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @BindingAdapter(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void setOnAttachStateChangeListener(View view, OnViewDetachedFromWindow onViewDetachedFromWindow, OnViewAttachedToWindow onViewAttachedToWindow) {
        a aVar = (onViewDetachedFromWindow == null && onViewAttachedToWindow == null) ? null : new a(onViewAttachedToWindow, onViewDetachedFromWindow);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) ListenerUtil.trackListener(view, aVar, R.id.onAttachStateChangeListener);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @BindingAdapter({"android:onClick", "android:clickable"})
    public static void setOnClick(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @BindingAdapter({"android:onLayoutChange"})
    public static void setOnLayoutChangeListener(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @BindingAdapter({"android:onLongClick", "android:longClickable"})
    public static void setOnLongClick(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @BindingAdapter({"android:onLongClickListener", "android:longClickable"})
    public static void setOnLongClickListener(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @BindingAdapter({"android:padding"})
    public static void setPadding(View view, float f6) {
        int iA = a(f6);
        view.setPadding(iA, iA, iA, iA);
    }

    @BindingAdapter({"android:paddingBottom"})
    public static void setPaddingBottom(View view, float f6) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f6));
    }

    @BindingAdapter({"android:paddingEnd"})
    public static void setPaddingEnd(View view, float f6) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f6), view.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingLeft"})
    public static void setPaddingLeft(View view, float f6) {
        view.setPadding(a(f6), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingRight"})
    public static void setPaddingRight(View view, float f6) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f6), view.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingStart"})
    public static void setPaddingStart(View view, float f6) {
        view.setPaddingRelative(a(f6), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @BindingAdapter({"android:paddingTop"})
    public static void setPaddingTop(View view, float f6) {
        view.setPadding(view.getPaddingLeft(), a(f6), view.getPaddingRight(), view.getPaddingBottom());
    }

    @BindingAdapter({"android:requiresFadingEdge"})
    public static void setRequiresFadingEdge(View view, int i10) {
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 1) != 0;
        view.setVerticalFadingEdgeEnabled(z10);
        view.setHorizontalFadingEdgeEnabled(z11);
    }
}
