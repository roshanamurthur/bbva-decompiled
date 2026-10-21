package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModelLazy.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0014\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "", "isInitialized", "Lkotlin/reflect/KClass;", "p0", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "q0", "Lkotlin/jvm/functions/Function0;", "storeProducer", "Landroidx/lifecycle/ViewModelProvider$Factory;", "r0", "factoryProducer", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelLazy.kt\nandroidx/lifecycle/ViewModelLazy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final KClass<VM> viewModelClass;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Function0<ViewModelStore> storeProducer;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Function0<ViewModelProvider.Factory> factoryProducer;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Function0<CreationExtras> f22032s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public VM f22033t0;

    /* JADX INFO: compiled from: ViewModelLazy.kt */
    public static final class a extends Lambda implements Function0<CreationExtras.Empty> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f22034p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Function0<? extends ViewModelStore> storeProducer, @NotNull Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f22033t0 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Function0<? extends ViewModelStore> storeProducer, @NotNull Function0<? extends ViewModelProvider.Factory> factoryProducer, @NotNull Function0<? extends CreationExtras> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.f22032s0 = extrasProducer;
    }

    @Override // kotlin.Lazy
    @NotNull
    public VM getValue() {
        VM vm2 = this.f22033t0;
        if (vm2 != null) {
            return vm2;
        }
        VM vm3 = (VM) ViewModelProvider.INSTANCE.create(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.f22032s0.invoke()).get(this.viewModelClass);
        this.f22033t0 = vm3;
        return vm3;
    }

    public /* synthetic */ ViewModelLazy(KClass kClass, Function0 function0, Function0 function1, Function0 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, function0, function1, (i10 & 8) != 0 ? a.f22034p0 : function2);
    }
}
