package androidx.lifecycle.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders_jvmKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\bJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "", "addInitializer", "Landroidx/lifecycle/ViewModelProvider$Factory;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f22190a = new LinkedHashMap();

    public final <T extends ViewModel> void addInitializer(@NotNull KClass<T> clazz, @NotNull Function1<? super CreationExtras, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f22190a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new ViewModelInitializer(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + ViewModelProviders_jvmKt.getCanonicalName(clazz) + '.').toString());
    }

    @NotNull
    public final ViewModelProvider.Factory build() {
        return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release(this.f22190a.values());
    }
}
