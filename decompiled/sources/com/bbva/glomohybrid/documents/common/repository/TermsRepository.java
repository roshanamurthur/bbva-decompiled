package com.bbva.glomohybrid.documents.common.repository;

import com.bbva.glomohybrid.documents.common.model.TermsDataModel;
import com.bbva.glomohybrid.documents.common.repository.dataSource.TermsDataSource;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TermsRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/TermsRepository;", "", "", "name", "Lcom/bbva/glomohybrid/documents/common/model/TermsDataModel;", "byName", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", "save", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/TermsDataSource;", "termsDataSource", "<init>", "(Lcom/bbva/glomohybrid/documents/common/repository/dataSource/TermsDataSource;)V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class TermsRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TermsDataSource f32076a;

    public TermsRepository(@NotNull TermsDataSource termsDataSource) {
        Intrinsics.checkNotNullParameter(termsDataSource, "termsDataSource");
        this.f32076a = termsDataSource;
    }

    @Nullable
    public final TermsDataModel byName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f32076a.getByName(name);
    }

    public final void save(@NotNull List<TermsDataModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f32076a.save(list);
    }
}
