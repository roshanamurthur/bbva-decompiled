package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PipHintTrackerKt {

    /* JADX INFO: compiled from: PipHintTracker.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Activity f355p0;

        public a(Activity activity) {
            this.f355p0 = activity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Api26Impl.INSTANCE.setPipParamsSourceRectHint(this.f355p0, (Rect) obj);
            return Unit.INSTANCE;
        }
    }

    public static final Rect access$trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    @RequiresApi(26)
    @Nullable
    public static final Object trackPipAnimationHintView(@NotNull Activity activity, @NotNull View view, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.callbackFlow(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new a(activity), continuation);
        return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
