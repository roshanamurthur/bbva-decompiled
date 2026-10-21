package org.koin.androidx.viewmodel.parameter;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.parameter.ParametersHolder;

/* JADX INFO: compiled from: AndroidParametersHolder.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lorg/koin/androidx/viewmodel/parameter/AndroidParametersHolder;", "Lorg/koin/core/parameter/ParametersHolder;", ExifInterface.GPS_DIRECTION_TRUE, "", "i", "Lkotlin/reflect/KClass;", "clazz", "elementAt", "(ILkotlin/reflect/KClass;)Ljava/lang/Object;", "getOrNull", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersDefinition;", "initialValues", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidParametersHolder extends ParametersHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CreationExtras extras;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidParametersHolder.kt */
    public static final class a<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f92298q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ KClass<?> f92299r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, KClass<?> kClass) {
            super(0);
            this.f92298q0 = i10;
            this.f92299r0 = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) AndroidParametersHolder.super.elementAt(this.f92298q0, this.f92299r0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AndroidParametersHolder.kt */
    public static final class b<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ KClass<?> f92301q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(KClass<?> kClass) {
            super(0);
            this.f92301q0 = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            return (T) AndroidParametersHolder.super.getOrNull(this.f92301q0);
        }
    }

    public /* synthetic */ AndroidParametersHolder(Function0 function0, CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0, creationExtras);
    }

    @Override // org.koin.core.parameter.ParametersHolder
    public <T> T elementAt(int i10, @NotNull KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return Intrinsics.areEqual(clazz, Reflection.getOrCreateKotlinClass(SavedStateHandle.class)) ? (T) SavedStateHandleSupport.createSavedStateHandle(this.extras) : (T) new a(i10, clazz).invoke();
    }

    @NotNull
    public final CreationExtras getExtras() {
        return this.extras;
    }

    @Override // org.koin.core.parameter.ParametersHolder
    @Nullable
    public <T> T getOrNull(@NotNull KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return Intrinsics.areEqual(clazz, Reflection.getOrCreateKotlinClass(SavedStateHandle.class)) ? (T) SavedStateHandleSupport.createSavedStateHandle(this.extras) : (T) new b(clazz).invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidParametersHolder(@Nullable Function0<? extends ParametersHolder> function0, @NotNull CreationExtras extras) {
        ParametersHolder parametersHolderInvoke;
        List<Object> values;
        List mutableList;
        Intrinsics.checkNotNullParameter(extras, "extras");
        super((function0 == null || (parametersHolderInvoke = function0.invoke()) == null || (values = parametersHolderInvoke.getValues()) == null || (mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) values)) == null) ? new ArrayList() : mutableList);
        this.extras = extras;
    }
}
