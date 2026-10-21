package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalResetTermsDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/LocalResetTermsDataSource;", "Lcom/bbva/glomo/user/repository/datasource/ResetTermsDataSource;", "", "getNeedCleanTerms", "needCleanTerms", "", "setNeedCleanTerms", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class LocalResetTermsDataSource implements ResetTermsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30877a;

    public LocalResetTermsDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30877a = storage;
    }

    @Override // com.bbva.glomo.user.repository.datasource.ResetTermsDataSource
    public boolean getNeedCleanTerms() {
        return MainStorage.getBoolean$default(this.f30877a, LocalStorageConstantsKt.NEED_CLEAN_TERMS, false, null, 4, null);
    }

    @Override // com.bbva.glomo.user.repository.datasource.ResetTermsDataSource
    public void setNeedCleanTerms(boolean needCleanTerms) {
        MainStorage.putBoolean$default(this.f30877a, LocalStorageConstantsKt.NEED_CLEAN_TERMS, needCleanTerms, null, 4, null);
    }
}
