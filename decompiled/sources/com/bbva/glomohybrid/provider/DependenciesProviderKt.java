package com.bbva.glomohybrid.provider;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.component.KoinComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: DependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0086\b\u001aC\u0010\u0004\u001a\u0004\u0018\u0001H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0004\u0018\u0001`\nH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"getAll", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/component/KoinComponent;", "getOrNull", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/component/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProviderKt\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,200:1\n107#2:201\n176#2:203\n133#3:202\n352#3:204\n*S KotlinDebug\n*F\n+ 1 DependenciesProvider.kt\ncom/bbva/glomohybrid/provider/DependenciesProviderKt\n*L\n192#1:201\n198#1:203\n192#1:202\n198#1:204\n*E\n"})
public final class DependenciesProviderKt {
    public static final /* synthetic */ <T> List<T> getAll(KoinComponent koinComponent) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public static final /* synthetic */ <T> T getOrNull(KoinComponent koinComponent, Qualifier qualifier, Function0<? extends ParametersHolder> function0) {
        Intrinsics.checkNotNullParameter(koinComponent, "<this>");
        try {
            Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        } catch (Exception unused) {
            return null;
        }
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
        try {
            Scope rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
        } catch (Exception unused) {
            return null;
        }
    }
}
