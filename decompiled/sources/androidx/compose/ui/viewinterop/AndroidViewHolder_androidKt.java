package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import d1.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mk.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidViewHolder_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 f18367a = new NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public final /* synthetic */ Object mo218onPostFlingRZ2iAVY(long j10, long j11, Continuation continuation) {
            return a.a(this, j10, j11, continuation);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public final /* synthetic */ long mo219onPostScrollDzOQY0M(long j10, long j11, int i10) {
            return a.b(this, j10, j11, i10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        public final /* synthetic */ Object mo220onPreFlingQWom1Mo(long j10, Continuation continuation) {
            return a.c(this, j10, continuation);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public final /* synthetic */ long mo221onPreScrollOzD1aCk(long j10, int i10) {
            return a.d(this, j10, i10);
        }
    };

    public static final void access$layoutAccordingTo(View view, LayoutNode layoutNode) {
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int iRoundToInt = c.roundToInt(Offset.m2275getXimpl(jPositionInRoot));
        int iRoundToInt2 = c.roundToInt(Offset.m2276getYimpl(jPositionInRoot));
        view.layout(iRoundToInt, iRoundToInt2, view.getMeasuredWidth() + iRoundToInt, view.getMeasuredHeight() + iRoundToInt2);
    }

    public static final float access$toComposeOffset(int i10) {
        return i10 * (-1);
    }

    public static final float access$toComposeVelocity(float f6) {
        return f6 * (-1.0f);
    }

    public static final int access$toNestedScrollSource(int i10) {
        return i10 == 0 ? NestedScrollSource.INSTANCE.m3392getDragWNlRxjI() : NestedScrollSource.INSTANCE.m3393getFlingWNlRxjI();
    }
}
