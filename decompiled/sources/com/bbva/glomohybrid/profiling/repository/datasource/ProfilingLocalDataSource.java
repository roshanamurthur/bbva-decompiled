package com.bbva.glomohybrid.profiling.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomohybrid.profiling.domain.model.Profiling;
import com.bbva.glomohybrid.profiling.repository.mapper.ProfilingMapper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfilingLocalDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/profiling/repository/datasource/ProfilingLocalDataSource;", "", "Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "value", "getFeatureFlags", "()Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;", "setFeatureFlags", "(Lcom/bbva/glomohybrid/profiling/domain/model/Profiling;)V", "featureFlags", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nProfilingLocalDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfilingLocalDataSource.kt\ncom/bbva/glomohybrid/profiling/repository/datasource/ProfilingLocalDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class ProfilingLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f33845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ProfilingMapper f33846b;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilingLocalDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f33845a = storage;
        this.f33846b = new ProfilingMapper(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Profiling getFeatureFlags() {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(this.f33845a.getString(LocalStorageConstantsKt.KEY_PROFILING, null, true, TargetStorage.Local));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            try {
                objM5535constructorimpl2 = Result.m5535constructorimpl(this.f33846b.map((String) objM5535constructorimpl));
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = ResultKt.createFailure(th3);
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
        } else {
            objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        }
        return (Profiling) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
    }

    public final void setFeatureFlags(@Nullable Profiling profiling) {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f33845a.put(LocalStorageConstantsKt.KEY_PROFILING, profiling != null ? this.f33846b.map(profiling) : null, true, TargetStorage.Local);
            Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
