package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0004\u001e\u001f !B!\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\u0004H\u0007J\b\u0010\u0016\u001a\u00020\u0004H\u0007¨\u0006\""}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "setOnBackInvokedDispatcher", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "addCallback", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "(Landroidx/activity/OnBackPressedCallback;)Landroidx/activity/Cancellable;", "addCancellableCallback", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "hasEnabledCallbacks", "Landroidx/activity/BackEventCompat;", "backEvent", "dispatchOnBackStarted", "dispatchOnBackProgressed", "onBackPressed", "dispatchOnBackCancelled", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/Consumer;", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "Api33Impl", "Api34Impl", "f", "g", "activity_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"})
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Runnable f331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Consumer<Boolean> f332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<OnBackPressedCallback> f333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public OnBackPressedCallback f334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final OnBackInvokedCallback f335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public OnBackInvokedDispatcher f336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f338h;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi(33)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J \u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "()V", "createOnBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackInvoked", "Lkotlin/Function0;", "", "registerOnBackInvokedCallback", "dispatcher", "priority", "", "callback", "unregisterOnBackInvokedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {

        @NotNull
        public static final Api33Impl INSTANCE = new Api33Impl();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback createOnBackInvokedCallback(@NotNull final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.q
                public final void onBackInvoked() {
                    Function0 onBackInvoked2 = onBackInvoked;
                    OnBackPressedDispatcher.Api33Impl api33Impl = OnBackPressedDispatcher.Api33Impl.INSTANCE;
                    Intrinsics.checkNotNullParameter(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(@NotNull Object dispatcher, int priority, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(@NotNull Object dispatcher, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi(34)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jj\u0010\u0003\u001a\u00020\u00042!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0007¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "()V", "createOnBackAnimationCallback", "Landroid/window/OnBackInvokedCallback;", "onBackStarted", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", "name", "backEvent", "", "onBackProgressed", "onBackInvoked", "Lkotlin/Function0;", "onBackCancelled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        @DoNotInline
        @NotNull
        public final OnBackInvokedCallback createOnBackAnimationCallback(@NotNull final Function1<? super BackEventCompat, Unit> onBackStarted, @NotNull final Function1<? super BackEventCompat, Unit> onBackProgressed, @NotNull final Function0<Unit> onBackInvoked, @NotNull final Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                public void onBackProgressed(@NotNull BackEvent backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public void onBackStarted(@NotNull BackEvent backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class a extends Lambda implements Function1<BackEventCompat, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BackEventCompat backEventCompat) {
            BackEventCompat backEvent = backEventCompat;
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            OnBackPressedDispatcher.this.c(backEvent);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class b extends Lambda implements Function1<BackEventCompat, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BackEventCompat backEventCompat) {
            BackEventCompat backEvent = backEventCompat;
            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
            OnBackPressedDispatcher.this.b(backEvent);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OnBackPressedDispatcher.this.a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class f implements LifecycleEventObserver, Cancellable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Lifecycle f348p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final OnBackPressedCallback f349q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public Cancellable f350r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f351s0;

        public f(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @NotNull Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f351s0 = onBackPressedDispatcher;
            this.f348p0 = lifecycle;
            this.f349q0 = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            this.f348p0.removeObserver(this);
            this.f349q0.removeCancellable(this);
            Cancellable cancellable = this.f350r0;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.f350r0 = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.f350r0 = this.f351s0.addCancellableCallback$activity_release(this.f349q0);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.f350r0;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class g implements Cancellable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final OnBackPressedCallback f352p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcher f353q0;

        public g(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.f353q0 = onBackPressedDispatcher;
            this.f352p0 = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f353q0;
            ArrayDeque arrayDeque = onBackPressedDispatcher.f333c;
            OnBackPressedCallback onBackPressedCallback = this.f352p0;
            arrayDeque.remove(onBackPressedCallback);
            if (Intrinsics.areEqual(onBackPressedDispatcher.f334d, onBackPressedCallback)) {
                onBackPressedCallback.handleOnBackCancelled();
                onBackPressedDispatcher.f334d = null;
            }
            onBackPressedCallback.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public /* synthetic */ class h extends FunctionReferenceImpl implements Function0<Unit> {
        public h(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((OnBackPressedDispatcher) this.receiver).e();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public /* synthetic */ class i extends FunctionReferenceImpl implements Function0<Unit> {
        public i(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((OnBackPressedDispatcher) this.receiver).e();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @MainThread
    public final void a() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.f333c;
        ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            }
            onBackPressedCallbackPrevious = listIterator.previous();
        } while (!onBackPressedCallbackPrevious.getIsEnabled());
        OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        this.f334d = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    @MainThread
    public final void addCallback(@NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @MainThread
    @NotNull
    public final Cancellable addCancellableCallback$activity_release(@NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f333c.add(onBackPressedCallback);
        g gVar = new g(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(gVar);
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new i(this));
        return gVar;
    }

    @MainThread
    public final void b(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.f333c;
        ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            }
            onBackPressedCallbackPrevious = listIterator.previous();
        } while (!onBackPressedCallbackPrevious.getIsEnabled());
        OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackProgressed(backEventCompat);
        }
    }

    @MainThread
    public final void c(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.f333c;
        ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            }
            onBackPressedCallbackPrevious = listIterator.previous();
        } while (!onBackPressedCallbackPrevious.getIsEnabled());
        OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        this.f334d = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    @RequiresApi(33)
    public final void d(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f336f;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f335e) == null) {
            return;
        }
        if (z10 && !this.f337g) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f337g = true;
        } else {
            if (z10 || !this.f337g) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f337g = false;
        }
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        a();
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        b(backEvent);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        c(backEvent);
    }

    public final void e() {
        boolean z10 = this.f338h;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.f333c;
        boolean z11 = false;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<OnBackPressedCallback> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (it.next().getIsEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f338h = z11;
        if (z11 != z10) {
            Consumer<Boolean> consumer = this.f332b;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                d(z11);
            }
        }
    }

    @MainThread
    /* JADX INFO: renamed from: hasEnabledCallbacks, reason: from getter */
    public final boolean getF338h() {
        return this.f338h;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.f333c;
        ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        do {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            }
            onBackPressedCallbackPrevious = listIterator.previous();
        } while (!onBackPressedCallbackPrevious.getIsEnabled());
        OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        this.f334d = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f331a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@NotNull OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.f336f = invoker;
        d(this.f338h);
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable, @Nullable Consumer<Boolean> consumer) {
        this.f331a = runnable;
        this.f332b = consumer;
        this.f333c = new ArrayDeque<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f335e = i10 >= 34 ? Api34Impl.INSTANCE.createOnBackAnimationCallback(new a(), new b(), new c(), new d()) : Api33Impl.INSTANCE.createOnBackInvokedCallback(new e());
        }
    }

    @MainThread
    public final void addCallback(@NotNull LifecycleOwner owner, @NotNull OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getF21906d() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new f(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new h(this));
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    @JvmOverloads
    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this(runnable, null);
    }
}
