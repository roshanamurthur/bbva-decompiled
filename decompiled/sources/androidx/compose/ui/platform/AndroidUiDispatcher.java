package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.HandlerCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/view/Choreographer$FrameCallback;", "callback", "", "postFrameCallback$ui_release", "(Landroid/view/Choreographer$FrameCallback;)V", "postFrameCallback", "removeFrameCallback$ui_release", "removeFrameCallback", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "block", "dispatch", "Landroid/view/Choreographer;", "p0", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/runtime/MonotonicFrameClock;", "y0", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n34#2:193\n34#2:194\n34#2:195\n34#2:196\n34#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Choreographer choreographer;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Handler f17121q0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f17126w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final AndroidUiFrameClock f17128y0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Lazy<CoroutineContext> E0 = LazyKt__LazyJVMKt.lazy(a.f17129p0);

    @NotNull
    public static final AndroidUiDispatcher$Companion$currentThread$1 F0 = new ThreadLocal<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            Handler handlerCreateAsync = HandlerCompat.createAsync(looperMyLooper);
            Intrinsics.checkNotNullExpressionValue(handlerCreateAsync, "createAsync(\n           …d\")\n                    )");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerCreateAsync, null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    };

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Object f17122r0 = new Object();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Runnable> f17123s0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public List<Choreographer.FrameCallback> f17124t0 = new ArrayList();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public List<Choreographer.FrameCallback> f17125u0 = new ArrayList();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final AndroidUiDispatcher$dispatchCallback$1 f17127x0 = new AndroidUiDispatcher$dispatchCallback$1(this);

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "()V", "CurrentThread", "Lkotlin/coroutines/CoroutineContext;", "getCurrentThread", "()Lkotlin/coroutines/CoroutineContext;", "Main", "getMain", "Main$delegate", "Lkotlin/Lazy;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CoroutineContext getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.access$isMainThread()) {
                return getMain();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.F0.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @NotNull
        public final CoroutineContext getMain() {
            return (CoroutineContext) AndroidUiDispatcher.E0.getValue();
        }
    }

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    public static final class a extends Lambda implements Function0<CoroutineContext> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17129p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineContext invoke() {
            Choreographer choreographer = AndroidUiDispatcher_androidKt.access$isMainThread() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new i0(2, null));
            Intrinsics.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
            Intrinsics.checkNotNullExpressionValue(handlerCreateAsync, "createAsync(Looper.getMainLooper())");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerCreateAsync, null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this.choreographer = choreographer;
        this.f17121q0 = handler;
        this.f17128y0 = new AndroidUiFrameClock(choreographer, this);
    }

    public static final void access$performFrameDispatch(AndroidUiDispatcher androidUiDispatcher, long j10) {
        synchronized (androidUiDispatcher.f17122r0) {
            if (androidUiDispatcher.f17126w0) {
                androidUiDispatcher.f17126w0 = false;
                List<Choreographer.FrameCallback> list = androidUiDispatcher.f17124t0;
                androidUiDispatcher.f17124t0 = androidUiDispatcher.f17125u0;
                androidUiDispatcher.f17125u0 = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    public static final void access$performTrampolineDispatch(AndroidUiDispatcher androidUiDispatcher) {
        boolean z10;
        do {
            Runnable runnableE = androidUiDispatcher.e();
            while (runnableE != null) {
                runnableE.run();
                runnableE = androidUiDispatcher.e();
            }
            synchronized (androidUiDispatcher.f17122r0) {
                if (androidUiDispatcher.f17123s0.isEmpty()) {
                    z10 = false;
                    androidUiDispatcher.v0 = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo6007dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f17122r0) {
            try {
                this.f17123s0.addLast(block);
                if (!this.v0) {
                    this.v0 = true;
                    this.f17121q0.post(this.f17127x0);
                    if (!this.f17126w0) {
                        this.f17126w0 = true;
                        this.choreographer.postFrameCallback(this.f17127x0);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Runnable e() {
        Runnable runnableRemoveFirstOrNull;
        synchronized (this.f17122r0) {
            runnableRemoveFirstOrNull = this.f17123s0.removeFirstOrNull();
        }
        return runnableRemoveFirstOrNull;
    }

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @NotNull
    public final MonotonicFrameClock getFrameClock() {
        return this.f17128y0;
    }

    public final void postFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f17122r0) {
            try {
                this.f17124t0.add(callback);
                if (!this.f17126w0) {
                    this.f17126w0 = true;
                    this.choreographer.postFrameCallback(this.f17127x0);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f17122r0) {
            this.f17124t0.remove(callback);
        }
    }
}
