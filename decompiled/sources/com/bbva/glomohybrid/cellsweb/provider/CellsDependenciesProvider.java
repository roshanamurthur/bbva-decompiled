package com.bbva.glomohybrid.cellsweb.provider;

import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.LifecycleObserver;
import bk.d;
import com.bbva.glomohybrid.base.file.receipts.ReceiptsStore;
import com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: CellsDependenciesProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/provider/CellsDependenciesProvider;", "Lcom/bbva/glomohybrid/base/provider/ActivityDependenciesProvider;", "", "Landroidx/lifecycle/LifecycleObserver;", "observers", "", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "<init>", "(Ljava/lang/String;)V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsDependenciesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsDependenciesProvider.kt\ncom/bbva/glomohybrid/cellsweb/provider/CellsDependenciesProvider\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,20:1\n56#2,6:21\n*S KotlinDebug\n*F\n+ 1 CellsDependenciesProvider.kt\ncom/bbva/glomohybrid/cellsweb/provider/CellsDependenciesProvider\n*L\n14#1:21,6\n*E\n"})
public final class CellsDependenciesProvider implements ActivityDependenciesProvider {

    @NotNull
    public static final String ID = "cells-dependencies-provider";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f32004q0;

    /* JADX WARN: Multi-variable type inference failed */
    public CellsDependenciesProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return ActivityDependenciesProvider.DefaultImpls.getKoin(this);
    }

    @Override // com.bbva.glomohybrid.base.provider.ActivityDependenciesProvider
    @NotNull
    public List<LifecycleObserver> observers() {
        return d.listOf((ReceiptsStore) this.f32004q0.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CellsDependenciesProvider(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32004q0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<ReceiptsStore>() { // from class: com.bbva.glomohybrid.cellsweb.provider.CellsDependenciesProvider$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.base.file.receipts.ReceiptsStore, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ReceiptsStore invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ReceiptsStore.class), qualifier, objArr);
            }
        });
    }

    public /* synthetic */ CellsDependenciesProvider(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ID : str);
    }
}
