package com.bbva.glomohybrid.documents.common;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.bbva.glomohybrid.documents.common.repository.TermsRepository;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTermsUrlByNameUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated(message = "Should be removed when FileChannels gets removed")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/GetTermsUrlByNameUseCase;", "Lcom/bbva/cells/component/kit/datamanager/domain/usecase/UseCase;", "", "params", NotificationCompat.CATEGORY_CALL, "documentsPath", "Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;", "termsRepository", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class GetTermsUrlByNameUseCase extends UseCase<String, String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f32053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TermsRepository f32054e;

    public GetTermsUrlByNameUseCase(@NotNull String documentsPath, @NotNull TermsRepository termsRepository) {
        Intrinsics.checkNotNullParameter(documentsPath, "documentsPath");
        Intrinsics.checkNotNullParameter(termsRepository, "termsRepository");
        this.f32053d = documentsPath;
        this.f32054e = termsRepository;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase
    @NotNull
    public String call(@Nullable String params) {
        if (params == null) {
            params = "";
        }
        TermsDataModel termsDataModelByName = this.f32054e.byName(params);
        if (termsDataModelByName == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String str = String.format(this.f32053d, Arrays.copyOf(new Object[]{termsDataModelByName.getId()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }
}
