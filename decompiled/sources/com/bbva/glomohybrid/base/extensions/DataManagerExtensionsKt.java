package com.bbva.glomohybrid.base.extensions;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DataManagerExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003\"\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"disposeAll", "", "useCases", "", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "([Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;)V", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataManagerExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataManagerExtensions.kt\ncom/bbva/glomohybrid/base/extensions/DataManagerExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,8:1\n13309#2,2:9\n*S KotlinDebug\n*F\n+ 1 DataManagerExtensions.kt\ncom/bbva/glomohybrid/base/extensions/DataManagerExtensionsKt\n*L\n6#1:9,2\n*E\n"})
public final class DataManagerExtensionsKt {
    public static final void disposeAll(@NotNull UseCase<?, ?>... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        for (UseCase<?, ?> useCase : useCases) {
            useCase.dispose();
        }
    }
}
