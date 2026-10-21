package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "", "frameTimeNanos", "doFrame", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1\n*L\n58#1:192\n*E\n"})
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AndroidUiDispatcher f17130p0;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.f17130p0 = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long frameTimeNanos) {
        AndroidUiDispatcher androidUiDispatcher = this.f17130p0;
        androidUiDispatcher.f17121q0.removeCallbacks(this);
        AndroidUiDispatcher.access$performTrampolineDispatch(androidUiDispatcher);
        AndroidUiDispatcher.access$performFrameDispatch(androidUiDispatcher, frameTimeNanos);
    }

    @Override // java.lang.Runnable
    public void run() {
        AndroidUiDispatcher.access$performTrampolineDispatch(this.f17130p0);
        Object obj = this.f17130p0.f17122r0;
        AndroidUiDispatcher androidUiDispatcher = this.f17130p0;
        synchronized (obj) {
            try {
                if (androidUiDispatcher.f17124t0.isEmpty()) {
                    androidUiDispatcher.getChoreographer().removeFrameCallback(this);
                    androidUiDispatcher.f17126w0 = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
