package com.bbva.glomohybrid.base.viewmodel;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: ViewModelComponentsProviders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aA\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\n\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\t\u001aN\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0016\b\n\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"getByActivityScope", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Activity;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroid/app/Activity;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "injectByActivityScope", "Lkotlin/Lazy;", "Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "clazz", "Lkotlin/reflect/KClass;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewModelComponentsProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelComponentsProviders.kt\ncom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProvidersKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,45:1\n101#2,6:46\n133#2:52\n*S KotlinDebug\n*F\n+ 1 ViewModelComponentsProviders.kt\ncom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProvidersKt\n*L\n31#1:46,6\n43#1:52\n*E\n"})
public final class ViewModelComponentsProvidersKt {
    public static final /* synthetic */ <T> T getByActivityScope(Activity activity, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Scope orCreateScope$default = Koin.getOrCreateScope$default(ComponentCallbackExtKt.getKoin(activity), KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(activity.getClass())) + "@" + activity.hashCode(), new TypeQualifier(Reflection.getOrCreateKotlinClass(activity.getClass())), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getByActivityScope$default(Activity activity, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Scope orCreateScope$default = Koin.getOrCreateScope$default(ComponentCallbackExtKt.getKoin(activity), KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(activity.getClass())) + "@" + activity.hashCode(), new TypeQualifier(Reflection.getOrCreateKotlinClass(activity.getClass())), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static final /* synthetic */ <T> Lazy<T> injectByActivityScope(ViewModelComponentsProviders viewModelComponentsProviders, KClass<?> clazz, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(viewModelComponentsProviders, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Scope orCreateScope$default = Koin.getOrCreateScope$default(viewModelComponentsProviders.getKoin(), KClassExtKt.getFullName(clazz) + "@" + viewModelComponentsProviders.getPageId(), new TypeQualifier(Reflection.getOrCreateKotlinClass(viewModelComponentsProviders.getClass())), null, 4, null);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new ViewModelComponentsProvidersKt$injectByActivityScope$$inlined$inject$default$1(orCreateScope$default, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectByActivityScope$default(ViewModelComponentsProviders viewModelComponentsProviders, KClass clazz, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qualifier = null;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(viewModelComponentsProviders, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Scope orCreateScope$default = Koin.getOrCreateScope$default(viewModelComponentsProviders.getKoin(), KClassExtKt.getFullName(clazz) + "@" + viewModelComponentsProviders.getPageId(), new TypeQualifier(Reflection.getOrCreateKotlinClass(viewModelComponentsProviders.getClass())), null, 4, null);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new ViewModelComponentsProvidersKt$injectByActivityScope$$inlined$inject$default$1(orCreateScope$default, qualifier, function0));
    }
}
