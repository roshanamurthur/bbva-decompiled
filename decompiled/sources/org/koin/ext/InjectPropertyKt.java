package org.koin.ext;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KMutableProperty0;
import org.koin.core.Koin;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: InjectProperty.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b\u001a#\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\b¨\u0006\b"}, d2 = {"inject", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KMutableProperty0;", "koin", "Lorg/koin/core/Koin;", "scope", "Lorg/koin/core/scope/Scope;", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInjectProperty.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjectProperty.kt\norg/koin/ext/InjectPropertyKt\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,18:1\n104#2,4:19\n104#2,4:24\n133#3:23\n133#3:28\n129#3,5:29\n*S KotlinDebug\n*F\n+ 1 InjectProperty.kt\norg/koin/ext/InjectPropertyKt\n*L\n9#1:19,4\n13#1:24,4\n9#1:23\n13#1:28\n17#1:29,5\n*E\n"})
public final class InjectPropertyKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void inject(KMutableProperty0<T> kMutableProperty0) {
        Intrinsics.checkNotNullParameter(kMutableProperty0, "<this>");
        Scope rootScope = KoinPlatformTools.INSTANCE.defaultContext().get().getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        kMutableProperty0.set(rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void inject(KMutableProperty0<T> kMutableProperty0, Koin koin) {
        Intrinsics.checkNotNullParameter(kMutableProperty0, "<this>");
        Intrinsics.checkNotNullParameter(koin, "koin");
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        kMutableProperty0.set(rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void inject(KMutableProperty0<T> kMutableProperty0, Scope scope) {
        Intrinsics.checkNotNullParameter(kMutableProperty0, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        kMutableProperty0.set(scope.get(Reflection.getOrCreateKotlinClass(Object.class), null, null));
    }
}
