package com.bbva.glomohybrid.base.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "invoke", "()Ljava/lang/Object;", "org/koin/core/scope/Scope$inject$1"}, k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,403:1\n133#2:404\n*S KotlinDebug\n*F\n+ 1 Scope.kt\norg/koin/core/scope/Scope$inject$1\n*L\n106#1:404\n*E\n"})
public final class ViewModelComponentsProvidersKt$injectByActivityScope$$inlined$inject$default$1<T> extends Lambda implements Function0<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Scope f31603p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Qualifier f31604q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0 f31605r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelComponentsProvidersKt$injectByActivityScope$$inlined$inject$default$1(Scope scope, Qualifier qualifier, Function0 function0) {
        super(0);
        this.f31603p0 = scope;
        this.f31604q0 = qualifier;
        this.f31605r0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final T invoke() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) this.f31603p0.get(Reflection.getOrCreateKotlinClass(Object.class), this.f31604q0, this.f31605r0);
    }
}
