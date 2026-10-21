package u;

import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.constraintlayout.motion.widget.Key;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transformable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {169, 171, ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY}, m = "detectZoom", n = {"$this$detectZoom", "panZoomLock", "channel", "canPan", Key.ROTATION, "zoom", GoogleTapAndPay.KEY_PAN, "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "panZoomLock", "channel", "canPan", Key.ROTATION, "zoom", GoogleTapAndPay.KEY_PAN, "pastTouchSlop", "touchSlop", "lockedToPanZoom", "$this$detectZoom", "panZoomLock", "channel", "canPan", "event", Key.ROTATION, "zoom", GoogleTapAndPay.KEY_PAN, "pastTouchSlop", "touchSlop", "lockedToPanZoom", "canceled"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "F$0", "F$1", "J$0", "I$0", "F$2", "I$1", "I$2"})
public final class s extends ContinuationImpl {
    public int E0;
    public int F0;
    public /* synthetic */ Object G0;
    public int H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AwaitPointerEventScope f93695p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public State f93696q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Channel f93697r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public State f93698s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public PointerEvent f93699t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f93700u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f93701w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f93702x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f93703y0;

    public s() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.G0 = obj;
        this.H0 |= Integer.MIN_VALUE;
        return TransformableKt.access$detectZoom(null, null, null, null, this);
    }
}
