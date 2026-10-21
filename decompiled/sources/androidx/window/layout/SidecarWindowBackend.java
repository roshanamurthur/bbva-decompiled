package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.Version;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SidecarWindowBackend.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001e\u001f B\u0013\b\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001d\u0010\u0012J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/layout/ExtensionInterfaceCompat;", "a", "Landroidx/window/layout/ExtensionInterfaceCompat;", "getWindowExtension", "()Landroidx/window/layout/ExtensionInterfaceCompat;", "setWindowExtension", "(Landroidx/window/layout/ExtensionInterfaceCompat;)V", "windowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "<init>", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SidecarWindowBackend implements WindowBackend {
    public static final boolean DEBUG = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile SidecarWindowBackend f24205c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @GuardedBy("globalLock")
    @VisibleForTesting
    @Nullable
    public ExtensionInterfaceCompat windowExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ReentrantLock f24206d = new ReentrantLock();

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "()V", "DEBUG", "", "TAG", "", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "context", "Landroid/content/Context;", "initAndVerifyExtension", "Landroidx/window/layout/ExtensionInterfaceCompat;", "isSidecarVersionSupported", "sidecarVersion", "Landroidx/window/core/Version;", "resetInstance", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SidecarWindowBackend getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (SidecarWindowBackend.f24205c == null) {
                ReentrantLock reentrantLock = SidecarWindowBackend.f24206d;
                reentrantLock.lock();
                try {
                    if (SidecarWindowBackend.f24205c == null) {
                        SidecarWindowBackend.f24205c = new SidecarWindowBackend(SidecarWindowBackend.INSTANCE.initAndVerifyExtension(context));
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            SidecarWindowBackend sidecarWindowBackend = SidecarWindowBackend.f24205c;
            Intrinsics.checkNotNull(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        @Nullable
        public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                if (!isSidecarVersionSupported(SidecarCompat.INSTANCE.getSidecarVersion())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (sidecarCompat.validateExtensionInterface()) {
                    return sidecarCompat;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        @VisibleForTesting
        public final boolean isSidecarVersionSupported(@Nullable Version sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(Version.INSTANCE.getVERSION_0_1()) >= 0;
        }

        @VisibleForTesting
        public final void resetInstance() {
            SidecarWindowBackend.f24205c = null;
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017¨\u0006\t"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "(Landroidx/window/layout/SidecarWindowBackend;)V", "onWindowLayoutChanged", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "newLayout", "Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @VisibleForTesting
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SidecarWindowBackend f24209a;

        public ExtensionListenerImpl(SidecarWindowBackend this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f24209a = this$0;
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull Activity activity, @NotNull WindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            for (WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper : this.f24209a.getWindowLayoutChangeCallbacks()) {
                if (Intrinsics.areEqual(windowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                    windowLayoutChangeCallbackWrapper.accept(newLayout);
                }
            }
        }
    }

    /* JADX INFO: compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "Landroidx/window/layout/WindowLayoutInfo;", "newLayoutInfo", "", "accept", "Landroid/app/Activity;", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/core/util/Consumer;", "c", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "callback", "d", "Landroidx/window/layout/WindowLayoutInfo;", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "lastInfo", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class WindowLayoutChangeCallbackWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Activity activity;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Executor f24211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Consumer<WindowLayoutInfo> callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.activity = activity;
            this.f24211b = executor;
            this.callback = callback;
        }

        public final void accept(@NotNull WindowLayoutInfo newLayoutInfo) {
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
            this.lastInfo = newLayoutInfo;
            this.f24211b.execute(new androidx.camera.camera2.interop.g(this, newLayoutInfo, 2));
        }

        @NotNull
        public final Activity getActivity() {
            return this.activity;
        }

        @NotNull
        public final Consumer<WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        @Nullable
        public final WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(@Nullable WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }
    }

    @VisibleForTesting
    public SidecarWindowBackend(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 == null) {
            return;
        }
        extensionInterfaceCompat2.setExtensionCallback(new ExtensionListenerImpl(this));
    }

    @Nullable
    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    @NotNull
    public final CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> callback) {
        WindowLayoutInfo lastInfo;
        Object next;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = f24206d;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat windowExtension = getWindowExtension();
            if (windowExtension == null) {
                callback.accept(new WindowLayoutInfo(CollectionsKt__CollectionsKt.emptyList()));
                reentrantLock.unlock();
                return;
            }
            CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
            boolean z10 = false;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<WindowLayoutChangeCallbackWrapper> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(it.next().getActivity(), activity)) {
                        z10 = true;
                        break;
                    }
                }
            }
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            getWindowLayoutChangeCallbacks().add(windowLayoutChangeCallbackWrapper);
            if (z10) {
                Iterator<T> it2 = getWindowLayoutChangeCallbacks().iterator();
                do {
                    lastInfo = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(activity, ((WindowLayoutChangeCallbackWrapper) next).getActivity()));
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) next;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    lastInfo = windowLayoutChangeCallbackWrapper2.getLastInfo();
                }
                if (lastInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(lastInfo);
                }
            } else {
                windowExtension.onWindowLayoutChangeListenerAdded(activity);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void setWindowExtension(@Nullable ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(@NotNull Consumer<WindowLayoutInfo> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f24206d) {
            try {
                if (getWindowExtension() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (WindowLayoutChangeCallbackWrapper callbackWrapper : getWindowLayoutChangeCallbacks()) {
                    if (callbackWrapper.getCallback() == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                getWindowLayoutChangeCallbacks().removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((WindowLayoutChangeCallbackWrapper) it.next()).getActivity();
                    CopyOnWriteArrayList<WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<WindowLayoutChangeCallbackWrapper> it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.areEqual(it2.next().getActivity(), activity)) {
                                }
                            }
                        }
                    }
                    ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
                    if (extensionInterfaceCompat != null) {
                        extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }
}
