package androidx.lifecycle.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewModelProviderImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0015J1\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "", "key", "getViewModel$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "getViewModel", "Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class ViewModelProviderImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelStore f22193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewModelProvider.Factory f22194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CreationExtras f22195c;

    public ViewModelProviderImpl(@NotNull ViewModelStore store, @NotNull ViewModelProvider.Factory factory, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f22193a = store;
        this.f22194b = factory;
        this.f22195c = extras;
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, KClass kClass, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(kClass);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(kClass, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @NotNull
    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(@NotNull KClass<T> modelClass, @NotNull String key) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        ViewModelStore viewModelStore = this.f22193a;
        T t10 = (T) viewModelStore.get(key);
        boolean zIsInstance = modelClass.isInstance(t10);
        ViewModelProvider.Factory factory = this.f22194b;
        if (zIsInstance) {
            if (factory instanceof ViewModelProvider.OnRequeryFactory) {
                Intrinsics.checkNotNull(t10);
                ((ViewModelProvider.OnRequeryFactory) factory).onRequery(t10);
            }
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return t10;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f22195c);
        mutableCreationExtras.set(ViewModelProviders.ViewModelKey.INSTANCE, key);
        T t11 = (T) ViewModelProviderImpl_androidKt.createViewModel(factory, modelClass, mutableCreationExtras);
        viewModelStore.put(key, t11);
        return t11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProviderImpl(@NotNull ViewModelStoreOwner owner, @NotNull ViewModelProvider.Factory factory, @NotNull CreationExtras extras) {
        this(owner.getViewModelStore(), factory, extras);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
    }
}
