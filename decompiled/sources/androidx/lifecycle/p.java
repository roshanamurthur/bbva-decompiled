package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewModelProvider.android.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.INSTANCE;
    }

    @NotNull
    public static ViewModel a(ViewModelProvider.Factory factory, @NotNull Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return androidx.lifecycle.viewmodel.internal.ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
    }

    @NotNull
    public static ViewModel b(ViewModelProvider.Factory factory, @NotNull Class modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return factory.create(modelClass);
    }

    @NotNull
    public static ViewModel c(ViewModelProvider.Factory factory, @NotNull KClass modelClass, @NotNull CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return factory.create(JvmClassMappingKt.getJavaClass(modelClass), extras);
    }

    @JvmStatic
    @NotNull
    public static ViewModelProvider.Factory d(@NotNull ViewModelInitializer<?>... viewModelInitializerArr) {
        return ViewModelProvider.Factory.INSTANCE.from(viewModelInitializerArr);
    }
}
