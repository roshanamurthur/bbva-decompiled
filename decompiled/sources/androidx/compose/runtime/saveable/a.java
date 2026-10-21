package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberSaveable.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class a<T> implements SaverScope, RememberObserver {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public Saver<T, Object> f15239p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public SaveableStateRegistry f15240q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public String f15241r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public T f15242s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public Object[] f15243t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public SaveableStateRegistry.Entry f15244u0;

    @NotNull
    public final C0058a v0 = new C0058a(this);

    /* JADX INFO: renamed from: androidx.compose.runtime.saveable.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RememberSaveable.kt */
    @SourceDebugExtension({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/SaveableHolder$valueProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
    public static final class C0058a extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ a<T> f15245p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0058a(a<T> aVar) {
            super(0);
            this.f15245p0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            a<T> aVar = this.f15245p0;
            Saver<T, Object> saver = aVar.f15239p0;
            T t10 = aVar.f15242s0;
            if (t10 != null) {
                return saver.save(aVar, t10);
            }
            throw new IllegalArgumentException("Value should be initialized".toString());
        }
    }

    public a(@NotNull Saver<T, Object> saver, @Nullable SaveableStateRegistry saveableStateRegistry, @NotNull String str, T t10, @NotNull Object[] objArr) {
        this.f15239p0 = saver;
        this.f15240q0 = saveableStateRegistry;
        this.f15241r0 = str;
        this.f15242s0 = t10;
        this.f15243t0 = objArr;
    }

    public final void a() {
        SaveableStateRegistry saveableStateRegistry = this.f15240q0;
        if (this.f15244u0 != null) {
            throw new IllegalArgumentException(("entry(" + this.f15244u0 + ") is not null").toString());
        }
        if (saveableStateRegistry != null) {
            C0058a c0058a = this.v0;
            RememberSaveableKt.access$requireCanBeSaved(saveableStateRegistry, c0058a.invoke());
            this.f15244u0 = saveableStateRegistry.registerProvider(this.f15241r0, c0058a);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(@NotNull Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.f15240q0;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.f15244u0;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SaveableStateRegistry.Entry entry = this.f15244u0;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        a();
    }
}
