package com.bbva.glomohybrid.base.datasource;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.base.models.InAppUpdatesScheduleData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InAppUpdatesScheduleDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/datasource/InAppUpdatesScheduleDataSource;", "", "Lcom/bbva/glomohybrid/base/models/InAppUpdatesScheduleData;", "get", "data", "", "save", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInAppUpdatesScheduleDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppUpdatesScheduleDataSource.kt\ncom/bbva/glomohybrid/base/datasource/InAppUpdatesScheduleDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class InAppUpdatesScheduleDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f31229a;

    public InAppUpdatesScheduleDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f31229a = storage;
    }

    @Nullable
    public final InAppUpdatesScheduleData get() {
        Object objM5535constructorimpl;
        String string$default = MainStorage.getString$default(this.f31229a, "in-app-update-schedule-configuration", null, false, null, 12, null);
        if (string$default == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((InAppUpdatesScheduleData) Json.INSTANCE.decodeFromString(InAppUpdatesScheduleData.INSTANCE.serializer(), string$default));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (InAppUpdatesScheduleData) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    public final void save(@NotNull InAppUpdatesScheduleData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        MainStorage.put$default(this.f31229a, "in-app-update-schedule-configuration", Json.INSTANCE.encodeToString(InAppUpdatesScheduleData.INSTANCE.serializer(), data), false, null, 12, null);
    }
}
