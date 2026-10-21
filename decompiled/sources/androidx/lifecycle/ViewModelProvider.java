package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.datastore.preferences.protobuf.q;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import com.bbva.nativesettings.common.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModelProvider.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0005\u001b\u001a\u001c\u001d\u001eB#\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0014\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0019J(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0097\u0002¢\u0006\u0004\b\u0006\u0010\tJ0\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\fJ0\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0097\u0002¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "get", "(Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "", "key", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "Companion", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class ViewModelProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final CreationExtras.Key<String> VIEW_MODEL_KEY = androidx.lifecycle.viewmodel.internal.ViewModelProviders.ViewModelKey.INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewModelProviderImpl f22035a;

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "create", "Landroidx/lifecycle/ViewModelProvider;", "store", "Landroidx/lifecycle/ViewModelStore;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                factory = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            if ((i10 & 4) != 0) {
                creationExtras = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(viewModelStoreOwner);
            }
            return companion.create(viewModelStoreOwner, factory, creationExtras);
        }

        @JvmStatic
        @NotNull
        public final ViewModelProvider create(@NotNull ViewModelStoreOwner owner, @NotNull Factory factory, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }

        @JvmStatic
        @NotNull
        public final ViewModelProvider create(@NotNull ViewModelStore store, @NotNull Factory factory, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }

        public static /* synthetic */ ViewModelProvider create$default(Companion companion, ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                factory = DefaultViewModelProviderFactory.INSTANCE;
            }
            if ((i10 & 4) != 0) {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
            return companion.create(viewModelStore, factory, creationExtras);
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J-\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ-\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.f22038a;

        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "()V", "from", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ Companion f22038a = new Companion();

            @JvmStatic
            @NotNull
            public final Factory from(@NotNull ViewModelInitializer<?>... initializers) {
                Intrinsics.checkNotNullParameter(initializers, "initializers");
                return androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release((ViewModelInitializer<?>[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @NotNull
        <T extends ViewModel> T create(@NotNull Class<T> modelClass);

        @NotNull
        <T extends ViewModel> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras);

        @NotNull
        <T extends ViewModel> T create(@NotNull KClass<T> modelClass, @NotNull CreationExtras extras);
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\bJ-\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ-\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\f2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class NewInstanceFactory implements Factory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = androidx.lifecycle.viewmodel.internal.ViewModelProviders.ViewModelKey.INSTANCE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public static NewInstanceFactory f22039a;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public static final NewInstanceFactory getInstance() {
            return INSTANCE.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return (T) JvmViewModelProviders.INSTANCE.createViewModel(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends ViewModel> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends ViewModel> T create(@NotNull KClass<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(JvmClassMappingKt.getJavaClass((KClass) modelClass), extras);
        }

        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "_instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "instance", "getInstance$annotations", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            @NotNull
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.f22039a == null) {
                    NewInstanceFactory.f22039a = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory.f22039a;
                Intrinsics.checkNotNull(newInstanceFactory);
                return newInstanceFactory;
            }

            @JvmStatic
            public static /* synthetic */ void getInstance$annotations() {
            }
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OnRequeryFactory {
        public void onRequery(@NotNull ViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewModelProvider(@NotNull ViewModelStore store, @NotNull Factory factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    @JvmStatic
    @NotNull
    public static final ViewModelProvider create(@NotNull ViewModelStore viewModelStore, @NotNull Factory factory, @NotNull CreationExtras creationExtras) {
        return INSTANCE.create(viewModelStore, factory, creationExtras);
    }

    @MainThread
    @NotNull
    public final <T extends ViewModel> T get(@NotNull KClass<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) ViewModelProviderImpl.getViewModel$lifecycle_viewmodel_release$default(this.f22035a, modelClass, null, 2, null);
    }

    /* JADX INFO: compiled from: ViewModelProvider.android.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0016¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Landroid/app/Application;", Constants.APPLICATION, "(Landroid/app/Application;)V", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static AndroidViewModelFactory f22036c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Application f22037b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final CreationExtras.Key<Application> APPLICATION_KEY = new CreationExtras.Key<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion$APPLICATION_KEY$1
        };

        /* JADX INFO: compiled from: ViewModelProvider.android.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "()V", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "_instance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "getInstance", Constants.APPLICATION, "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final AndroidViewModelFactory getInstance(@NotNull Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (AndroidViewModelFactory.f22036c == null) {
                    AndroidViewModelFactory.f22036c = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.f22036c;
                Intrinsics.checkNotNull(androidViewModelFactory);
                return androidViewModelFactory;
            }
        }

        public AndroidViewModelFactory(Application application, int i10) {
            this.f22037b = application;
        }

        @JvmStatic
        @NotNull
        public static final AndroidViewModelFactory getInstance(@NotNull Application application) {
            return INSTANCE.getInstance(application);
        }

        public final ViewModel a(Application application, Class cls) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(viewModel, "{\n                try {\n…          }\n            }");
                return viewModel;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException(q.c("Cannot create an instance of ", cls), e5);
            } catch (InstantiationException e7) {
                throw new RuntimeException(q.c("Cannot create an instance of ", cls), e7);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(q.c("Cannot create an instance of ", cls), e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(q.c("Cannot create an instance of ", cls), e11);
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends ViewModel> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f22037b != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) a(application, modelClass);
            }
            if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(@NotNull Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f22037b;
            if (application != null) {
                return (T) a(application, modelClass);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i10 & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    @JvmStatic
    @NotNull
    public static final ViewModelProvider create(@NotNull ViewModelStoreOwner viewModelStoreOwner, @NotNull Factory factory, @NotNull CreationExtras creationExtras) {
        return INSTANCE.create(viewModelStoreOwner, factory, creationExtras);
    }

    @MainThread
    @NotNull
    public <T extends ViewModel> T get(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) get(JvmClassMappingKt.getKotlinClass(modelClass));
    }

    @MainThread
    @NotNull
    public final <T extends ViewModel> T get(@NotNull String key, @NotNull KClass<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f22035a.getViewModel$lifecycle_viewmodel_release(modelClass, key);
    }

    @JvmOverloads
    public ViewModelProvider(@NotNull ViewModelStore store, @NotNull Factory factory, @NotNull CreationExtras defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f22035a = new ViewModelProviderImpl(store, factory, defaultCreationExtras);
    }

    @MainThread
    @NotNull
    public <T extends ViewModel> T get(@NotNull String key, @NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) this.f22035a.getViewModel$lifecycle_viewmodel_release(JvmClassMappingKt.getKotlinClass(modelClass), key);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(@NotNull ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewModelStore viewModelStore = owner.getViewModelStore();
        androidx.lifecycle.viewmodel.internal.ViewModelProviders viewModelProviders = androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE;
        this(viewModelStore, viewModelProviders.getDefaultFactory$lifecycle_viewmodel_release(owner), viewModelProviders.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(@NotNull ViewModelStoreOwner owner, @NotNull Factory factory) {
        this(owner.getViewModelStore(), factory, androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.getDefaultCreationExtras$lifecycle_viewmodel_release(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
