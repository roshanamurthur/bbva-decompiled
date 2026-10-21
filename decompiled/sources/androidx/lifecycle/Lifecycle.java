package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'RR\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\b2\u001a\u0010\t\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\b8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "", "Landroidx/lifecycle/LifecycleObserver;", "observer", "", "addObserver", "removeObserver", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/lifecycle/AtomicReference;", "<set-?>", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "getInternalScopeRef", "()Ljava/util/concurrent/atomic/AtomicReference;", "setInternalScopeRef", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "internalScopeRef", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "currentStateFlow", "<init>", "()V", "Event", "State", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/Lifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Landroidx/lifecycle/Lifecycle$State;", "getTargetState", "()Landroidx/lifecycle/Lifecycle$State;", "targetState", "Companion", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Event ON_ANY;
        public static final Event ON_CREATE;
        public static final Event ON_DESTROY;
        public static final Event ON_PAUSE;
        public static final Event ON_RESUME;
        public static final Event ON_START;
        public static final Event ON_STOP;

        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "()V", "downFrom", "Landroidx/lifecycle/Lifecycle$Event;", "state", "Landroidx/lifecycle/Lifecycle$State;", "downTo", "upFrom", "upTo", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: Lifecycle.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            public final Event downFrom(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i10 == 2) {
                    return Event.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @JvmStatic
            @Nullable
            public final Event downTo(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_STOP;
                }
                if (i10 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @JvmStatic
            @Nullable
            public final Event upFrom(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_START;
                }
                if (i10 == 2) {
                    return Event.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @JvmStatic
            @Nullable
            public final Event upTo(@NotNull State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_CREATE;
                }
                if (i10 == 2) {
                    return Event.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            Event event = new Event("ON_CREATE", 0);
            ON_CREATE = event;
            Event event2 = new Event("ON_START", 1);
            ON_START = event2;
            Event event3 = new Event("ON_RESUME", 2);
            ON_RESUME = event3;
            Event event4 = new Event("ON_PAUSE", 3);
            ON_PAUSE = event4;
            Event event5 = new Event("ON_STOP", 4);
            ON_STOP = event5;
            Event event6 = new Event("ON_DESTROY", 5);
            ON_DESTROY = event6;
            Event event7 = new Event("ON_ANY", 6);
            ON_ANY = event7;
            $VALUES = new Event[]{event, event2, event3, event4, event5, event6, event7};
            INSTANCE = new Companion(null);
        }

        public Event() {
            throw null;
        }

        @JvmStatic
        @Nullable
        public static final Event downFrom(@NotNull State state) {
            return INSTANCE.downFrom(state);
        }

        @JvmStatic
        @Nullable
        public static final Event downTo(@NotNull State state) {
            return INSTANCE.downTo(state);
        }

        @JvmStatic
        @Nullable
        public static final Event upFrom(@NotNull State state) {
            return INSTANCE.upFrom(state);
        }

        @JvmStatic
        @Nullable
        public static final Event upTo(@NotNull State state) {
            return INSTANCE.upTo(state);
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        @NotNull
        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "state", "", "isAtLeast", "DESTROYED", "INITIALIZED", DebugCoroutineInfoImplKt.CREATED, "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State CREATED;
        public static final State DESTROYED;
        public static final State INITIALIZED;
        public static final State RESUMED;
        public static final State STARTED;

        static {
            State state = new State("DESTROYED", 0);
            DESTROYED = state;
            State state2 = new State("INITIALIZED", 1);
            INITIALIZED = state2;
            State state3 = new State(DebugCoroutineInfoImplKt.CREATED, 2);
            CREATED = state3;
            State state4 = new State("STARTED", 3);
            STARTED = state4;
            State state5 = new State("RESUMED", 4);
            RESUMED = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean isAtLeast(@NotNull State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    @MainThread
    public abstract void addObserver(@NotNull LifecycleObserver observer);

    @MainThread
    @NotNull
    public abstract State getCurrentState();

    @NotNull
    public StateFlow<State> getCurrentStateFlow() {
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.g
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                MutableStateFlow mutableStateFlow = MutableStateFlow;
                Intrinsics.checkNotNullParameter(mutableStateFlow, "$mutableStateFlow");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                mutableStateFlow.setValue(event.getTargetState());
            }
        });
        return FlowKt.asStateFlow(MutableStateFlow);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @MainThread
    public abstract void removeObserver(@NotNull LifecycleObserver observer);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setInternalScopeRef(@NotNull AtomicReference<Object> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
