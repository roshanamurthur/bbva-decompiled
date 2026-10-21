package com.bbva.glomoutils.koin;

import android.content.ComponentCallbacks;
import androidx.camera.core.impl.utils.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: KoinExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0007H\u0086\b\u001aG\u0010\b\u001a\u0004\u0018\u0001H\u0002\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001aG\u0010\b\u001a\u0004\u0018\u0001H\u0002\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\t*\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aH\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0014\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000\u001aH\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0014\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\t*\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"fullNamed", "Lorg/koin/core/qualifier/StringQualifier;", ExifInterface.GPS_DIRECTION_TRUE, "name", "", "getAll", "", "Lorg/koin/core/component/KoinComponent;", "getOrNull", "", "Landroid/content/ComponentCallbacks;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lorg/koin/core/component/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "injectOrNull", "Lkotlin/Lazy;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKoinExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,72:1\n176#2:73\n120#2:75\n120#2:77\n352#3:74\n158#3:76\n158#3:78\n*S KotlinDebug\n*F\n+ 1 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n*L\n19#1:73\n45#1:75\n71#1:77\n19#1:74\n45#1:76\n71#1:78\n*E\n"})
public final class KoinExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.bbva.glomoutils.koin.KoinExtensionsKt$injectOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: KoinExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nKoinExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt$injectOrNull$1\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,72:1\n45#2:73\n120#3:74\n158#4:75\n*S KotlinDebug\n*F\n+ 1 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt$injectOrNull$1\n*L\n32#1:73\n32#1:74\n32#1:75\n*E\n"})
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f34852p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34853q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f34854r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(KoinComponent koinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f34852p0 = koinComponent;
            this.f34853q0 = qualifier;
            this.f34854r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            Scope rootScope = this.f34852p0.getKoin().getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), this.f34853q0, this.f34854r0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.bbva.glomoutils.koin.KoinExtensionsKt$injectOrNull$2, reason: invalid class name */
    /* JADX INFO: compiled from: KoinExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nKoinExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt$injectOrNull$2\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n+ 3 Koin.kt\norg/koin/core/Koin\n+ 4 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,72:1\n71#2:73\n120#3:74\n158#4:75\n*S KotlinDebug\n*F\n+ 1 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt$injectOrNull$2\n*L\n58#1:73\n58#1:74\n58#1:75\n*E\n"})
    public static final class AnonymousClass2<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f34855p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34856q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<ParametersHolder> f34857r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
            super(0);
            this.f34855p0 = componentCallbacks;
            this.f34856q0 = qualifier;
            this.f34857r0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            Scope rootScope = ComponentCallbackExtKt.getKoin(this.f34855p0).getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), this.f34856q0, this.f34857r0);
        }
    }

    public static final /* synthetic */ <T> StringQualifier fullNamed(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return new StringQualifier(a.b(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class)), PushConstants.GE_PARAMS_SEPARATOR, name));
    }

    public static final /* synthetic */ <T> List<T> getAll(KoinComponent koinComponent) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static final /* synthetic */ <T> T getOrNull(KoinComponent koinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(KoinComponent koinComponent, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    public static final /* synthetic */ <T> Lazy<T> injectOrNull(KoinComponent koinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass1(koinComponent, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(KoinComponent koinComponent, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass1(koinComponent, qualifier, function0));
    }

    public static final /* synthetic */ <T> Lazy<T> injectOrNull(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass2(componentCallbacks, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(new AnonymousClass2(componentCallbacks, qualifier, function0));
    }

    public static final /* synthetic */ <T> T getOrNull(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Scope rootScope = ComponentCallbackExtKt.getKoin(componentCallbacks).getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualifier = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        Intrinsics.checkNotNullParameter(componentCallbacks, "<this>");
        Scope rootScope = ComponentCallbackExtKt.getKoin(componentCallbacks).getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }
}
