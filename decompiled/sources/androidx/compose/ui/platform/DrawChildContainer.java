package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewLayerContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0016J'\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "getChildCount", "Landroidx/compose/ui/graphics/Canvas;", "Landroid/view/View;", "view", "", "drawingTime", "drawChild$ui_release", "(Landroidx/compose/ui/graphics/Canvas;Landroid/view/View;J)V", "drawChild", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f17220p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).getIsInvalidated()) {
                this.f17220p0 = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f17220p0 = false;
                }
            }
        }
    }

    public final void drawChild$ui_release(@NotNull androidx.compose.ui.graphics.Canvas canvas, @NotNull View view, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, drawingTime);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f17220p0) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
    }
}
