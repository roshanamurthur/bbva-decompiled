package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.p;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InitializerViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "<init>", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelInitializer<?>[] f22189a;

    public InitializerViewModelFactory(@NotNull ViewModelInitializer<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f22189a = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return p.a(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return p.c(this, kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <VM extends ViewModel> VM create(@NotNull Class<VM> modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        ViewModelProviders viewModelProviders = ViewModelProviders.INSTANCE;
        KClass<VM> kotlinClass = JvmClassMappingKt.getKotlinClass(modelClass);
        ViewModelInitializer<?>[] viewModelInitializerArr = this.f22189a;
        return (VM) viewModelProviders.createViewModelFromInitializers$lifecycle_viewmodel_release(kotlinClass, extras, (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
