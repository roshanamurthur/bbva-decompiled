package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.camera.camera2.internal.h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "", "markState", "Landroidx/lifecycle/Lifecycle$Event;", "event", "handleLifecycleEvent", "Landroidx/lifecycle/LifecycleObserver;", "observer", "addObserver", "removeObserver", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "setCurrentState", "(Landroidx/lifecycle/Lifecycle$State;)V", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "currentStateFlow", "", "getObserverCount", "()I", "observerCount", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
public class LifecycleRegistry extends Lifecycle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public FastSafeIterableMap<LifecycleObserver, ObserverWithState> f21905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Lifecycle.State f21906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final WeakReference<LifecycleOwner> f21907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList<Lifecycle.State> f21911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Lifecycle.State> f21912j;

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "()V", "createUnsafe", "Landroidx/lifecycle/LifecycleRegistry;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "min", "Landroidx/lifecycle/Lifecycle$State;", "state1", "state2", "min$lifecycle_runtime_release", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @VisibleForTesting
        @NotNull
        public final LifecycleRegistry createUnsafe(@NotNull LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new LifecycleRegistry(owner, false, null);
        }

        @JvmStatic
        @NotNull
        public final Lifecycle.State min$lifecycle_runtime_release(@NotNull Lifecycle.State state1, @Nullable Lifecycle.State state2) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "dispatchEvent", "Landroidx/lifecycle/Lifecycle$State;", "a", "Landroidx/lifecycle/Lifecycle$State;", "getState", "()Landroidx/lifecycle/Lifecycle$State;", "setState", "(Landroidx/lifecycle/Lifecycle$State;)V", "state", "Landroidx/lifecycle/LifecycleEventObserver;", "b", "Landroidx/lifecycle/LifecycleEventObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleEventObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "observer", "initialState", "<init>", "(Landroidx/lifecycle/LifecycleObserver;Landroidx/lifecycle/Lifecycle$State;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class ObserverWithState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Lifecycle.State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public LifecycleEventObserver lifecycleObserver;

        public ObserverWithState(@Nullable LifecycleObserver lifecycleObserver, @NotNull Lifecycle.State initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = initialState;
        }

        public final void dispatchEvent(@Nullable LifecycleOwner owner, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.INSTANCE.min$lifecycle_runtime_release(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            Intrinsics.checkNotNull(owner);
            lifecycleEventObserver.onStateChanged(owner, event);
            this.state = targetState;
        }

        @NotNull
        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        @NotNull
        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setLifecycleObserver(@NotNull LifecycleEventObserver lifecycleEventObserver) {
            Intrinsics.checkNotNullParameter(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void setState(@NotNull Lifecycle.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }
    }

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, z10);
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public static final LifecycleRegistry createUnsafe(@NotNull LifecycleOwner lifecycleOwner) {
        return INSTANCE.createUnsafe(lifecycleOwner);
    }

    public final Lifecycle.State a(LifecycleObserver lifecycleObserver) {
        ObserverWithState value;
        Map.Entry<LifecycleObserver, ObserverWithState> entryCeil = this.f21905c.ceil(lifecycleObserver);
        Lifecycle.State state = (entryCeil == null || (value = entryCeil.getValue()) == null) ? null : value.getState();
        ArrayList<Lifecycle.State> arrayList = this.f21911i;
        Lifecycle.State state2 = arrayList.isEmpty() ^ true ? (Lifecycle.State) androidx.appcompat.view.menu.b.b(arrayList, 1) : null;
        Companion companion = INSTANCE;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.f21906d, state), state2);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@NotNull LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        Intrinsics.checkNotNullParameter(observer, "observer");
        b("addObserver");
        Lifecycle.State state = this.f21906d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        ObserverWithState observerWithState = new ObserverWithState(observer, state2);
        if (this.f21905c.putIfAbsent(observer, observerWithState) == null && (lifecycleOwner = this.f21907e.get()) != null) {
            boolean z10 = this.f21908f != 0 || this.f21909g;
            Lifecycle.State stateA = a(observer);
            this.f21908f++;
            while (observerWithState.getState().compareTo(stateA) < 0 && this.f21905c.contains(observer)) {
                this.f21911i.add(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.INSTANCE.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                ArrayList<Lifecycle.State> arrayList = this.f21911i;
                arrayList.remove(arrayList.size() - 1);
                stateA = a(observer);
            }
            if (!z10) {
                d();
            }
            this.f21908f--;
        }
    }

    public final void b(String str) {
        if (this.f21904b && !LifecycleRegistry_androidKt.isMainThread()) {
            throw new IllegalStateException(h0.b("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void c(Lifecycle.State state) {
        Lifecycle.State state2 = this.f21906d;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.f21906d + " in component " + this.f21907e.get()).toString());
        }
        this.f21906d = state;
        if (this.f21909g || this.f21908f != 0) {
            this.f21910h = true;
            return;
        }
        this.f21909g = true;
        d();
        this.f21909g = false;
        if (this.f21906d == Lifecycle.State.DESTROYED) {
            this.f21905c = new FastSafeIterableMap<>();
        }
    }

    public final void d() {
        LifecycleOwner lifecycleOwner = this.f21907e.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (this.f21905c.size() != 0) {
            Map.Entry<LifecycleObserver, ObserverWithState> entryEldest = this.f21905c.eldest();
            Intrinsics.checkNotNull(entryEldest);
            Lifecycle.State state = entryEldest.getValue().getState();
            Map.Entry<LifecycleObserver, ObserverWithState> entryNewest = this.f21905c.newest();
            Intrinsics.checkNotNull(entryNewest);
            Lifecycle.State state2 = entryNewest.getValue().getState();
            if (state == state2 && this.f21906d == state2) {
                break;
            }
            this.f21910h = false;
            Lifecycle.State state3 = this.f21906d;
            Map.Entry<LifecycleObserver, ObserverWithState> entryEldest2 = this.f21905c.eldest();
            Intrinsics.checkNotNull(entryEldest2);
            if (state3.compareTo(entryEldest2.getValue().getState()) < 0) {
                Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> itDescendingIterator = this.f21905c.descendingIterator();
                Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
                while (itDescendingIterator.hasNext() && !this.f21910h) {
                    Map.Entry<LifecycleObserver, ObserverWithState> next = itDescendingIterator.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next()");
                    LifecycleObserver key = next.getKey();
                    ObserverWithState value = next.getValue();
                    while (value.getState().compareTo(this.f21906d) > 0 && !this.f21910h && this.f21905c.contains(key)) {
                        Lifecycle.Event eventDownFrom = Lifecycle.Event.INSTANCE.downFrom(value.getState());
                        if (eventDownFrom == null) {
                            throw new IllegalStateException("no event down from " + value.getState());
                        }
                        this.f21911i.add(eventDownFrom.getTargetState());
                        value.dispatchEvent(lifecycleOwner, eventDownFrom);
                        ArrayList<Lifecycle.State> arrayList = this.f21911i;
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            Map.Entry<LifecycleObserver, ObserverWithState> entryNewest2 = this.f21905c.newest();
            if (!this.f21910h && entryNewest2 != null && this.f21906d.compareTo(entryNewest2.getValue().getState()) > 0) {
                SafeIterableMap<LifecycleObserver, ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.f21905c.iteratorWithAdditions();
                Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "observerMap.iteratorWithAdditions()");
                while (iteratorWithAdditions.hasNext() && !this.f21910h) {
                    Map.Entry next2 = iteratorWithAdditions.next();
                    LifecycleObserver lifecycleObserver = (LifecycleObserver) next2.getKey();
                    ObserverWithState observerWithState = (ObserverWithState) next2.getValue();
                    while (observerWithState.getState().compareTo(this.f21906d) < 0 && !this.f21910h && this.f21905c.contains(lifecycleObserver)) {
                        this.f21911i.add(observerWithState.getState());
                        Lifecycle.Event eventUpFrom = Lifecycle.Event.INSTANCE.upFrom(observerWithState.getState());
                        if (eventUpFrom == null) {
                            throw new IllegalStateException("no event up from " + observerWithState.getState());
                        }
                        observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                        ArrayList<Lifecycle.State> arrayList2 = this.f21911i;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                }
            }
        }
        this.f21910h = false;
        this.f21912j.setValue(getF21906d());
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    /* JADX INFO: renamed from: getCurrentState, reason: from getter */
    public Lifecycle.State getF21906d() {
        return this.f21906d;
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public StateFlow<Lifecycle.State> getCurrentStateFlow() {
        return FlowKt.asStateFlow(this.f21912j);
    }

    public int getObserverCount() {
        b("getObserverCount");
        return this.f21905c.size();
    }

    public void handleLifecycleEvent(@NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b("handleLifecycleEvent");
        c(event.getTargetState());
    }

    @Deprecated(message = "Override [currentState].")
    @MainThread
    public void markState(@NotNull Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@NotNull LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        b("removeObserver");
        this.f21905c.remove(observer);
    }

    public void setCurrentState(@NotNull Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        b("setCurrentState");
        c(state);
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z10) {
        this.f21904b = z10;
        this.f21905c = new FastSafeIterableMap<>();
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.f21906d = state;
        this.f21911i = new ArrayList<>();
        this.f21907e = new WeakReference<>(lifecycleOwner);
        this.f21912j = StateFlowKt.MutableStateFlow(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(@NotNull LifecycleOwner provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
