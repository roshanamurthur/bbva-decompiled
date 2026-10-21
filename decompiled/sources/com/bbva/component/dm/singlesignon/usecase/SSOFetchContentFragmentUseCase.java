package com.bbva.component.dm.singlesignon.usecase;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.singlesignon.data.SingleSignOnDataSource;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnRequest;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import com.bbva.component.dm.singlesignon.mapper.SSOContentMapper;
import com.bbva.component.dm.singlesignon.model.SSOEmptyContentException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SSOFetchContentFragmentUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/singlesignon/usecase/SSOFetchContentFragmentUseCase;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/componentkit/usecase/UseCase;", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest;", "params", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/singlesignon/data/SingleSignOnDataSource;", "dataSource", "Lcom/bbva/component/dm/singlesignon/mapper/SSOContentMapper;", "mapper", "<init>", "(Lcom/bbva/component/dm/singlesignon/data/SingleSignOnDataSource;Lcom/bbva/component/dm/singlesignon/mapper/SSOContentMapper;)V", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0})
public final class SSOFetchContentFragmentUseCase<T> extends UseCase<SingleSignOnRequest, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SingleSignOnDataSource f28072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SSOContentMapper<T> f28073b;

    /* JADX WARN: Multi-variable type inference failed */
    public SSOFetchContentFragmentUseCase(@NotNull SingleSignOnDataSource dataSource, @NotNull SSOContentMapper<? extends T> mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f28072a = dataSource;
        this.f28073b = mapper;
    }

    @Override // com.bbva.cells.componentkit.usecase.UseCase
    @Nullable
    public Object call(@NotNull SingleSignOnRequest singleSignOnRequest, @NotNull Continuation<? super T> continuation) throws Throwable {
        FetchResult<SingleSignOnResponse> fetchResultFetch = this.f28072a.fetch(singleSignOnRequest);
        if (fetchResultFetch instanceof FetchResult.Error) {
            throw ((FetchResult.Error) fetchResultFetch).getException();
        }
        if (!(fetchResultFetch instanceof FetchResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        T map = this.f28073b.map((SingleSignOnResponse) ((FetchResult.Success) fetchResultFetch).getValue());
        if (map != null) {
            return map;
        }
        throw new SSOEmptyContentException((String) null, 1, (DefaultConstructorMarker) null);
    }
}
