package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidViewsHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aJ\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010 \u001a\u00020\u0005H\u0017J\b\u0010!\u001a\u00020\u0007H\u0016R3\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#0\"j\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020#`$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R3\u0010,\u001a\u001e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00180\"j\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0018`$8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(¨\u00061"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "changed", "l", "t", "r", "b", "onLayout", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "", "location", "Landroid/graphics/Rect;", "dirty", "", "invalidateChildInParent", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "Landroid/graphics/Canvas;", "canvas", "drawView", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "requestLayout", "shouldDelayChildPressedState", "Ljava/util/HashMap;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "p0", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "q0", "getLayoutNodeToHolder", "layoutNodeToHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidViewsHandler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1855#2,2:99\n1855#2,2:101\n*S KotlinDebug\n*F\n+ 1 AndroidViewsHandler.android.kt\nandroidx/compose/ui/platform/AndroidViewsHandler\n*L\n54#1:99,2\n61#1:101,2\n*E\n"})
public final class AndroidViewsHandler extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return true;
    }

    public final void drawView(@NotNull AndroidViewHolder view, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        view.draw(canvas);
    }

    @NotNull
    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    @NotNull
    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public Void invalidateChildInParent(@Nullable int[] location, @Nullable Rect dirty) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(@NotNull View child, @NotNull View target) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
        Set<AndroidViewHolder> setKeySet = this.holderToLayoutNode.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : setKeySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (View.MeasureSpec.getMode(heightMeasureSpec) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
        Set<AndroidViewHolder> setKeySet = this.holderToLayoutNode.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "holderToLayoutNode.keys");
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            ((AndroidViewHolder) it.next()).remeasure();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }
}
