package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Version;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SidecarCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0005\u001e\u0012\u001f !B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0017R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "", "setExtensionCallback", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "onWindowLayoutChangeListenerAdded", "Landroid/os/IBinder;", "windowToken", "register", "onWindowLayoutChangeListenerRemoved", "", "validateExtensionInterface", "Landroidx/window/sidecar/SidecarInterface;", "a", "Landroidx/window/sidecar/SidecarInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Companion", "DistinctSidecarElementCallback", "b", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SidecarCompat implements ExtensionInterfaceCompat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SidecarInterface sidecar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SidecarAdapter f24188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f24189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f24190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f24191e;

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "getActivityWindowToken$window_release", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", "context", "Landroid/content/Context;", "getSidecarCompat$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final IBinder getActivityWindowToken$window_release(@Nullable Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @Nullable
        public final SidecarInterface getSidecarCompat$window_release(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @Nullable
        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.INSTANCE.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SidecarAdapter f24192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SidecarInterface.SidecarCallback f24193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f24194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @GuardedBy("lock")
        @Nullable
        public SidecarDeviceState f24195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @GuardedBy("mLock")
        @NotNull
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f24196e;

        public DistinctSidecarElementCallback(@NotNull SidecarAdapter sidecarAdapter, @NotNull SidecarInterface.SidecarCallback callbackInterface) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.f24192a = sidecarAdapter;
            this.f24193b = callbackInterface;
            this.f24194c = new ReentrantLock();
            this.f24196e = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f24194c;
            reentrantLock.lock();
            try {
                if (this.f24192a.isEqualSidecarDeviceState(this.f24195d, newDeviceState)) {
                    return;
                }
                this.f24195d = newDeviceState;
                this.f24193b.onDeviceStateChanged(newDeviceState);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            synchronized (this.f24194c) {
                if (this.f24192a.isEqualSidecarWindowLayoutInfo(this.f24196e.get(token), newLayout)) {
                    return;
                }
                this.f24196e.put(token, newLayout);
                this.f24193b.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¨\u0006\f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "(Landroidx/window/layout/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SidecarCompat f24197a;

        public TranslatingCallback(SidecarCompat this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f24197a = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f24197a.f24189c.values();
            SidecarCompat sidecarCompat = this.f24197a;
            for (Activity activity : collectionValues) {
                IBinder activityWindowToken$window_release = SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    windowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.f24191e;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.f24188b.translate(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Activity activity = (Activity) this.f24197a.f24189c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter = this.f24197a.f24188b;
            SidecarInterface sidecar = this.f24197a.getSidecar();
            SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo windowLayoutInfoTranslate = sidecarAdapter.translate(newLayout, deviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.f24197a.f24191e;
            if (extensionCallbackInterface == null) {
                return;
            }
            extensionCallbackInterface.onWindowLayoutChanged(activity, windowLayoutInfoTranslate);
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    public static final class a implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ExtensionInterfaceCompat.ExtensionCallbackInterface f24198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ReentrantLock f24199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @GuardedBy("mLock")
        @NotNull
        public final WeakHashMap<Activity, WindowLayoutInfo> f24200c;

        public a(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.f24198a = callbackInterface;
            this.f24199b = new ReentrantLock();
            this.f24200c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public final void onWindowLayoutChanged(@NotNull Activity activity, @NotNull WindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f24199b;
            reentrantLock.lock();
            WeakHashMap<Activity, WindowLayoutInfo> weakHashMap = this.f24200c;
            try {
                if (Intrinsics.areEqual(newLayout, weakHashMap.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                weakHashMap.put(activity, newLayout);
                reentrantLock.unlock();
                this.f24198a.onWindowLayoutChanged(activity, newLayout);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: SidecarCompat.kt */
    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final SidecarCompat f24201p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final WeakReference<Activity> f24202q0;

        public b(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f24201p0 = sidecarCompat;
            this.f24202q0 = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f24202q0.get();
            IBinder activityWindowToken$window_release = SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.f24201p0.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @VisibleForTesting
    public SidecarCompat(@VisibleForTesting @Nullable SidecarInterface sidecarInterface, @NotNull SidecarAdapter sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.f24188b = sidecarAdapter;
        this.f24189c = new LinkedHashMap();
        this.f24190d = new LinkedHashMap();
    }

    @Nullable
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @VisibleForTesting
    @NotNull
    public final WindowLayoutInfo getWindowLayoutInfo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(CollectionsKt__CollectionsKt.emptyList());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        SidecarDeviceState deviceState = sidecarInterface != null ? sidecarInterface.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.f24188b.translate(windowLayoutInfo, deviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new b(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        LinkedHashMap linkedHashMap = this.f24190d;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.f24189c;
        boolean z10 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(activityWindowToken$window_release);
        if (!z10 || sidecarInterface == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void register(@NotNull IBinder windowToken, @NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        LinkedHashMap linkedHashMap = this.f24189c;
        linkedHashMap.put(windowToken, activity);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (linkedHashMap.size() == 1 && sidecarInterface != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        a aVar = this.f24191e;
        if (aVar != null) {
            aVar.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f24190d;
        if (linkedHashMap2.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@NotNull Configuration newConfig) {
                    Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                    SidecarCompat sidecarCompat = this.f24203p0;
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.f24191e;
                    if (extensionCallbackInterface == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    extensionCallbackInterface.onWindowLayoutChanged(activity2, sidecarCompat.getWindowLayoutInfo(activity2));
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            linkedHashMap2.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(@NotNull ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.f24191e = new a(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f24188b, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    @SuppressLint({"BanUncheckedReflection"})
    public boolean validateExtensionInterface() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.sidecar;
            Class<?> returnType = null;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType2 = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!Intrinsics.areEqual(returnType2, cls5)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'setSidecarCallback': ", returnType2));
            }
            SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.sidecar;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.sidecar;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType3 = method2 == null ? null : method2.getReturnType();
            if (!Intrinsics.areEqual(returnType3, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'getWindowLayoutInfo': ", returnType3));
            }
            SidecarInterface sidecarInterface5 = this.sidecar;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType4 = method3 == null ? null : method3.getReturnType();
            if (!Intrinsics.areEqual(returnType4, cls5)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType4));
            }
            SidecarInterface sidecarInterface6 = this.sidecar;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            if (method4 != null) {
                returnType = method4.getReturnType();
            }
            if (!Intrinsics.areEqual(returnType, cls5)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (!Intrinsics.areEqual(arrayList, (List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@NotNull Context context) {
        this(INSTANCE.getSidecarCompat$window_release(context), new SidecarAdapter(null, 1, null));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
