package androidx.lifecycle.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InitializerViewModelFactory.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u0012\u0010\u0013B0\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\f¢\u0006\u0004\b\u0012\u0010\u0015R \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR+\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\b\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KClass;", "a", "Lkotlin/reflect/KClass;", "getClazz$lifecycle_viewmodel_release", "()Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "getInitializer$lifecycle_viewmodel_release", "()Lkotlin/jvm/functions/Function1;", "initializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class ViewModelInitializer<T extends ViewModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KClass<T> clazz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelInitializer(@NotNull KClass<T> clazz, @NotNull Function1<? super CreationExtras, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    @NotNull
    public final KClass<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    @NotNull
    public final Function1<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(@NotNull Class<T> clazz, @NotNull Function1<? super CreationExtras, ? extends T> initializer) {
        this(JvmClassMappingKt.getKotlinClass(clazz), initializer);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
    }
}
