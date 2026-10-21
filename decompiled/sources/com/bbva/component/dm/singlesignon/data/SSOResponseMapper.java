package com.bbva.component.dm.singlesignon.data;

import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SSOResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/singlesignon/data/SSOResponseMapper;", "", "()V", "map", "Lcom/bbva/cells/componentkit/model/FetchResult;", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnResponse;", "rawResponse", "", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SSOResponseMapper {

    /* JADX INFO: compiled from: SSOResponseMapper.kt */
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28060p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(JsonBuilder jsonBuilder) {
            JsonBuilder Json = jsonBuilder;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final FetchResult<SingleSignOnResponse> map(@Nullable String rawResponse) {
        return rawResponse == null ? new FetchResult.Error(new IllegalArgumentException("Response can't be null")) : new FetchResult.Success((SingleSignOnResponse) JsonKt.Json$default(null, a.f28060p0, 1, null).decodeFromString(SingleSignOnResponse.INSTANCE.serializer(), rawResponse));
    }
}
