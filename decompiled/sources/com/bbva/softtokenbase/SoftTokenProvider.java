package com.bbva.softtokenbase;

import android.content.Context;
import androidx.annotation.IntegerRes;
import com.bbva.glomoutils.usecase.UseCase;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SoftTokenProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/bbva/softtokenbase/SoftTokenProvider;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getInitFileReference", "()I", "initFileReference", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "c", "Lcom/bbva/glomoutils/usecase/UseCase;", "getResetSoftTokenValuesUseCase", "()Lcom/bbva/glomoutils/usecase/UseCase;", "resetSoftTokenValuesUseCase", "d", "getDeleteSoftTokenSeedsUseCase", "deleteSoftTokenSeedsUseCase", "<init>", "(Landroid/content/Context;ILcom/bbva/glomoutils/usecase/UseCase;Lcom/bbva/glomoutils/usecase/UseCase;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
public final class SoftTokenProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int initFileReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UseCase<Unit> resetSoftTokenValuesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UseCase<Unit> deleteSoftTokenSeedsUseCase;

    public SoftTokenProvider(@NotNull Context context, @IntegerRes int i10, @NotNull UseCase<Unit> resetSoftTokenValuesUseCase, @NotNull UseCase<Unit> deleteSoftTokenSeedsUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resetSoftTokenValuesUseCase, "resetSoftTokenValuesUseCase");
        Intrinsics.checkNotNullParameter(deleteSoftTokenSeedsUseCase, "deleteSoftTokenSeedsUseCase");
        this.context = context;
        this.initFileReference = i10;
        this.resetSoftTokenValuesUseCase = resetSoftTokenValuesUseCase;
        this.deleteSoftTokenSeedsUseCase = deleteSoftTokenSeedsUseCase;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final UseCase<Unit> getDeleteSoftTokenSeedsUseCase() {
        return this.deleteSoftTokenSeedsUseCase;
    }

    public final int getInitFileReference() {
        return this.initFileReference;
    }

    @NotNull
    public final UseCase<Unit> getResetSoftTokenValuesUseCase() {
        return this.resetSoftTokenValuesUseCase;
    }
}
