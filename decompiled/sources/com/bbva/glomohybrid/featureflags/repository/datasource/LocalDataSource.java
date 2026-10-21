package com.bbva.glomohybrid.featureflags.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.glomohybrid.featureflags.repository.mapper.FeatureFlagsMapper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/repository/datasource/LocalDataSource;", "", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "value", "getFeatureFlags", "()Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "setFeatureFlags", "(Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;)V", "featureFlags", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDataSource.kt\ncom/bbva/glomohybrid/featureflags/repository/datasource/LocalDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class LocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsMapper f32159b;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32158a = storage;
        this.f32159b = new FeatureFlagsMapper(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final FeatureFlags getFeatureFlags() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f32158a.getString(LocalStorageConstantsKt.KEY_FEATURE_FLAGS, null, true, TargetStorage.Local));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                objM5535constructorimpl2 = Result.m5535constructorimpl(this.f32159b.map((String) objM5535constructorimpl));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        return (FeatureFlags) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
    }

    public final void setFeatureFlags(@Nullable FeatureFlags featureFlags) {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f32158a.put(LocalStorageConstantsKt.KEY_FEATURE_FLAGS, featureFlags != null ? this.f32159b.map(featureFlags) : null, true, TargetStorage.Local);
            Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
