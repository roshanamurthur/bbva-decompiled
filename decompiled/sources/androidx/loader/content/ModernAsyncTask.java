package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SdkDigitizeStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ModernAsyncTask<Result> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static Handler f22226t0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile Status f22228q0 = Status.PENDING;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AtomicBoolean f22229r0 = new AtomicBoolean();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicBoolean f22230s0 = new AtomicBoolean();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final b f22227p0 = new b(new a());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;

        static {
            Status status = new Status(SdkDigitizeStatus.PENDING, 0);
            PENDING = status;
            Status status2 = new Status(DebugCoroutineInfoImplKt.RUNNING, 1);
            RUNNING = status2;
            Status status3 = new Status("FINISHED", 2);
            FINISHED = status3;
            $VALUES = new Status[]{status, status2, status3};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public class a implements Callable<Result> {
        public a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public final Result call() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            modernAsyncTask.f22230s0.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) modernAsyncTask.a();
                Binder.flushPendingCommands();
                modernAsyncTask.d(result);
                return result;
            } catch (Throwable th2) {
                try {
                    modernAsyncTask.f22229r0.set(true);
                    throw th2;
                } catch (Throwable th3) {
                    modernAsyncTask.d(result);
                    throw th3;
                }
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(a aVar) {
            super(aVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            try {
                Result result = get();
                if (modernAsyncTask.f22230s0.get()) {
                    return;
                }
                modernAsyncTask.d(result);
            } catch (InterruptedException e5) {
                Log.w("AsyncTask", e5);
            } catch (CancellationException unused) {
                if (modernAsyncTask.f22230s0.get()) {
                    return;
                }
                modernAsyncTask.d(null);
            } catch (ExecutionException e7) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e7.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f22233p0;

        public c(Object obj) {
            this.f22233p0 = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
            Object obj = this.f22233p0;
            if (modernAsyncTask.f22229r0.get()) {
                modernAsyncTask.b(obj);
            } else {
                modernAsyncTask.c(obj);
            }
            modernAsyncTask.f22228q0 = Status.FINISHED;
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22235a;

        static {
            int[] iArr = new int[Status.values().length];
            f22235a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22235a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract Result a();

    public final void d(Result result) {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f22226t0 == null) {
                    f22226t0 = new Handler(Looper.getMainLooper());
                }
                handler = f22226t0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new c(result));
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
