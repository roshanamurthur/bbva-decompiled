package androidx.lifecycle.viewmodel.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewModelProviders.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b$\u0010%J'\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0014\u001a\u00020\u00112\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00112\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0015\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010 \u001a\u00020\u001c2\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0015\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;", "", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "", "getDefaultKey$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "getDefaultKey", "VM", "unsupportedCreateViewModel$lifecycle_viewmodel_release", "()Landroidx/lifecycle/ViewModel;", "unsupportedCreateViewModel", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory$lifecycle_viewmodel_release", "(Ljava/util/Collection;)Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory", "", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "getDefaultFactory$lifecycle_viewmodel_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras$lifecycle_viewmodel_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras", "extras", "createViewModelFromInitializers$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;[Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModel;", "createViewModelFromInitializers", "<init>", "()V", "ViewModelKey", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n37#2,2:100\n1282#3,2:102\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n59#1:100,2\n85#1:102,2\n*E\n"})
public final class ViewModelProviders {

    @NotNull
    public static final ViewModelProviders INSTANCE = new ViewModelProviders();

    /* JADX INFO: compiled from: ViewModelProviders.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders$ViewModelKey;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewModelKey implements CreationExtras.Key<String> {

        @NotNull
        public static final ViewModelKey INSTANCE = new ViewModelKey();
    }

    @NotNull
    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(@NotNull Collection<? extends ViewModelInitializer<?>> initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }

    @NotNull
    public final <VM extends ViewModel> VM createViewModelFromInitializers$lifecycle_viewmodel_release(@NotNull KClass<VM> modelClass, @NotNull CreationExtras extras, @NotNull ViewModelInitializer<?>... initializers) {
        VM vm2;
        ViewModelInitializer<?> viewModelInitializer;
        Function1<CreationExtras, T> initializer$lifecycle_viewmodel_release;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm2 = null;
            if (i10 >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i10];
            if (Intrinsics.areEqual(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), modelClass)) {
                break;
            }
            i10++;
        }
        if (viewModelInitializer != null && (initializer$lifecycle_viewmodel_release = viewModelInitializer.getInitializer$lifecycle_viewmodel_release()) != 0) {
            vm2 = (VM) initializer$lifecycle_viewmodel_release.invoke(extras);
        }
        if (vm2 != null) {
            return vm2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + ViewModelProviders_jvmKt.getCanonicalName(modelClass)).toString());
    }

    @NotNull
    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(@NotNull ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    @NotNull
    public final ViewModelProvider.Factory getDefaultFactory$lifecycle_viewmodel_release(@NotNull ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
    }

    @NotNull
    public final <T extends ViewModel> String getDefaultKey$lifecycle_viewmodel_release(@NotNull KClass<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = ViewModelProviders_jvmKt.getCanonicalName(modelClass);
        if (canonicalName != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @NotNull
    public final <VM extends ViewModel> VM unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @NotNull
    public final ViewModelProvider.Factory createInitializerFactory$lifecycle_viewmodel_release(@NotNull ViewModelInitializer<?>... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(initializers, initializers.length));
    }
}
