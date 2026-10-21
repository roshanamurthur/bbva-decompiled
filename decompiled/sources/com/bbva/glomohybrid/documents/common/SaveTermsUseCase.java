package com.bbva.glomohybrid.documents.common;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SaveTermsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0006\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/SaveTermsUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "", "Lcom/bbva/glomohybrid/documents/common/model/TermsDataModel;", "params", NotificationCompat.CATEGORY_CALL, "(Ljava/util/List;)Ljava/lang/Boolean;", "Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;", "repository", "<init>", "(Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class SaveTermsUseCase extends UseCase<Boolean, List<? extends TermsDataModel>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TermsRepository f32057d;

    public SaveTermsUseCase(@NotNull TermsRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f32057d = repository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    public /* bridge */ /* synthetic */ Boolean call(List<? extends TermsDataModel> list) {
        return call2((List<TermsDataModel>) list);
    }

    @NotNull
    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public Boolean call2(@Nullable List<TermsDataModel> params) {
        if (params == null) {
            params = CollectionsKt__CollectionsKt.emptyList();
        }
        this.f32057d.save(params);
        return Boolean.TRUE;
    }
}
