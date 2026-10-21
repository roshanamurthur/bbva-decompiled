package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001aB\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001c\u0010\u0005\u001a\u0018\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u00070\u0006H\u0007\u001a8\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\tH\u0007\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012$\u0010\u0005\u001a \u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u0007\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u00070\u0006H\u0007\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\tH\u0007¨\u0006\f"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "mapFunction", "Landroidx/arch/core/util/Function;", "switchMap", "switchMapFunction", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "Transformations")
public final class Transformations {

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: compiled from: Transformations.kt */
    public static final class a<X> extends Lambda implements Function1<X, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData<X> f22014p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f22015q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MediatorLiveData<X> mediatorLiveData, Ref.BooleanRef booleanRef) {
            super(1);
            this.f22014p0 = mediatorLiveData;
            this.f22015q0 = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            MediatorLiveData<X> mediatorLiveData = this.f22014p0;
            X value = mediatorLiveData.getValue();
            Ref.BooleanRef booleanRef = this.f22015q0;
            if (booleanRef.element || ((value == null && obj != null) || (value != null && !Intrinsics.areEqual(value, obj)))) {
                booleanRef.element = false;
                mediatorLiveData.setValue(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: compiled from: Transformations.kt */
    public static final class b<X> extends Lambda implements Function1<X, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData<Y> f22016p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<X, Y> f22017q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MediatorLiveData<Y> mediatorLiveData, Function1<X, Y> function1) {
            super(1);
            this.f22016p0 = mediatorLiveData;
            this.f22017q0 = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            this.f22016p0.setValue((Y) this.f22017q0.invoke((X) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Transformations.kt */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData f22018p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function f22019q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function function, MediatorLiveData mediatorLiveData) {
            super(1);
            this.f22018p0 = mediatorLiveData;
            this.f22019q0 = function;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.f22018p0.setValue(this.f22019q0.apply(obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Transformations.kt */
    public static final class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f22020a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22020a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f22020a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final kotlin.Function<?> getFunctionDelegate() {
            return this.f22020a;
        }

        public final int hashCode() {
            return this.f22020a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22020a.invoke(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    /* JADX INFO: compiled from: Transformations.kt */
    public static final class e<X> extends Lambda implements Function1<X, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<X, LiveData<Y>> f22021p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<LiveData<Y>> f22022q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MediatorLiveData<Y> f22023r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1<X, LiveData<Y>> function1, Ref.ObjectRef<LiveData<Y>> objectRef, MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.f22021p0 = function1;
            this.f22022q0 = objectRef;
            this.f22023r0 = mediatorLiveData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.lifecycle.LiveData, java.lang.Object] */
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
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v4 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // kotlin.jvm.functions.Function1
        public final kotlin.Unit invoke(java.lang.Object r4) {
            /*
                r3 = this;
                kotlin.jvm.functions.Function1<X, androidx.lifecycle.LiveData<Y>> r0 = r3.f22021p0
                java.lang.Object r4 = r0.invoke(r4)
                androidx.lifecycle.LiveData r4 = (androidx.lifecycle.LiveData) r4
                kotlin.jvm.internal.Ref$ObjectRef<androidx.lifecycle.LiveData<Y>> r0 = r3.f22022q0
                T r1 = r0.element
                if (r1 == r4) goto L2e
                androidx.lifecycle.MediatorLiveData<Y> r2 = r3.f22023r0
                if (r1 == 0) goto L1a
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                androidx.lifecycle.LiveData r1 = (androidx.lifecycle.LiveData) r1
                r2.removeSource(r1)
            L1a:
                r0.element = r4
                if (r4 == 0) goto L2e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                androidx.lifecycle.o r0 = new androidx.lifecycle.o
                r0.<init>(r2)
                androidx.lifecycle.Transformations$d r1 = new androidx.lifecycle.Transformations$d
                r1.<init>(r0)
                r2.addSource(r4, r1)
            L2e:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.Transformations.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @JvmName(name = "distinctUntilChanged")
    @NotNull
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(@NotNull LiveData<X> liveData) {
        MediatorLiveData mediatorLiveData;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (liveData.isInitialized()) {
            booleanRef.element = false;
            mediatorLiveData = new MediatorLiveData(liveData.getValue());
        } else {
            mediatorLiveData = new MediatorLiveData();
        }
        mediatorLiveData.addSource(liveData, new d(new a(mediatorLiveData, booleanRef)));
        return mediatorLiveData;
    }

    @JvmName(name = "map")
    @NotNull
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(@NotNull LiveData<X> liveData, @NotNull Function1<X, Y> transform) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        MediatorLiveData mediatorLiveData = liveData.isInitialized() ? new MediatorLiveData(transform.invoke(liveData.getValue())) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new d(new b(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    @JvmName(name = "switchMap")
    @NotNull
    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(@NotNull LiveData<X> liveData, @NotNull Function1<X, LiveData<Y>> transform) {
        LiveData<Y> liveDataInvoke;
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MediatorLiveData mediatorLiveData = (liveData.isInitialized() && (liveDataInvoke = transform.invoke(liveData.getValue())) != null && liveDataInvoke.isInitialized()) ? new MediatorLiveData(liveDataInvoke.getValue()) : new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new d(new e(transform, objectRef, mediatorLiveData)));
        return mediatorLiveData;
    }

    @JvmName(name = "map")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new d(new c(mapFunction, mediatorLiveData)));
        return mediatorLiveData;
    }

    @JvmName(name = "switchMap")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use kotlin functions, instead of outdated arch core Functions")
    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations.switchMap.2

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public LiveData liveData;

            /* JADX INFO: renamed from: androidx.lifecycle.Transformations$switchMap$2$a */
            /* JADX INFO: compiled from: Transformations.kt */
            public static final class a extends Lambda implements Function1 {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ MediatorLiveData f22027p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MediatorLiveData mediatorLiveData) {
                    super(1);
                    this.f22027p0 = mediatorLiveData;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    this.f22027p0.setValue(obj);
                    return Unit.INSTANCE;
                }
            }

            @Nullable
            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object value) {
                LiveData liveData2 = (LiveData) switchMapFunction.apply(value);
                LiveData liveData3 = this.liveData;
                if (liveData3 == liveData2) {
                    return;
                }
                MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                if (liveData3 != null) {
                    Intrinsics.checkNotNull(liveData3);
                    mediatorLiveData2.removeSource(liveData3);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    Intrinsics.checkNotNull(liveData2);
                    mediatorLiveData2.addSource(liveData2, new d(new a(mediatorLiveData2)));
                }
            }

            public final void setLiveData(@Nullable LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
