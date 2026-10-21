package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\u0011"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;)V", "a", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WindowLayoutComponent f24162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f24163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    @NotNull
    public final LinkedHashMap f24164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("lock")
    @NotNull
    public final LinkedHashMap f24165d;

    /* JADX INFO: compiled from: ExtensionWindowLayoutInfoBackend.kt */
    @SuppressLint({"NewApi"})
    public static final class a implements Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Activity f24166p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f24167q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @GuardedBy("lock")
        @Nullable
        public WindowLayoutInfo f24168r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @GuardedBy("lock")
        @NotNull
        public final LinkedHashSet f24169s0;

        public a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f24166p0 = activity;
            this.f24167q0 = new ReentrantLock();
            this.f24169s0 = new LinkedHashSet();
        }

        public final void a(@NotNull androidx.core.util.Consumer<WindowLayoutInfo> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock = this.f24167q0;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.f24168r0;
                if (windowLayoutInfo != null) {
                    listener.accept(windowLayoutInfo);
                }
                this.f24169s0.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.function.Consumer
        public final void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
            androidx.window.extensions.layout.WindowLayoutInfo value = windowLayoutInfo;
            Intrinsics.checkNotNullParameter(value, "value");
            ReentrantLock reentrantLock = this.f24167q0;
            reentrantLock.lock();
            try {
                this.f24168r0 = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.f24166p0, value);
                Iterator it = this.f24169s0.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.Consumer) it.next()).accept(this.f24168r0);
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean b() {
            return this.f24169s0.isEmpty();
        }

        public final void c(@NotNull androidx.core.util.Consumer<WindowLayoutInfo> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock = this.f24167q0;
            reentrantLock.lock();
            try {
                this.f24169s0.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(@NotNull WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f24162a = component;
        this.f24163b = new ReentrantLock();
        this.f24164c = new LinkedHashMap();
        this.f24165d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.Consumer<WindowLayoutInfo> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f24163b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f24164c;
        try {
            a aVar = (a) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.f24165d;
            if (aVar == null) {
                unit = null;
            } else {
                aVar.a(callback);
                linkedHashMap2.put(callback, activity);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                a aVar2 = new a(activity);
                linkedHashMap.put(activity, aVar2);
                linkedHashMap2.put(callback, activity);
                aVar2.a(callback);
                this.f24162a.addWindowLayoutInfoListener(activity, aVar2);
            }
            Unit unit2 = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull androidx.core.util.Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f24163b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f24165d.get(callback);
            if (activity == null) {
                return;
            }
            a aVar = (a) this.f24164c.get(activity);
            if (aVar == null) {
                return;
            }
            aVar.c(callback);
            if (aVar.b()) {
                this.f24162a.removeWindowLayoutInfoListener(aVar);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
