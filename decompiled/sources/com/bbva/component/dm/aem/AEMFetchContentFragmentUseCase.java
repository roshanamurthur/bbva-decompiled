package com.bbva.component.dm.aem;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.aem.data.AEMDataSource;
import com.bbva.component.dm.aem.data.model.AEMContent;
import com.bbva.component.dm.aem.data.model.AEMRequest;
import com.bbva.component.dm.aem.mapper.AEMContentMapper;
import com.bbva.component.dm.aem.model.AEMEmptyContentException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AEMFetchContentFragmentUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/aem/AEMFetchContentFragmentUseCase;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/componentkit/usecase/UseCase;", "Lcom/bbva/component/dm/aem/data/model/AEMRequest;", "params", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/component/dm/aem/data/model/AEMRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/aem/data/AEMDataSource;", "dataSource", "Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;", "mapper", "<init>", "(Lcom/bbva/component/dm/aem/data/AEMDataSource;Lcom/bbva/component/dm/aem/mapper/AEMContentMapper;)V", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1})
public final class AEMFetchContentFragmentUseCase<T> extends UseCase<AEMRequest, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AEMDataSource f27376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AEMContentMapper<T> f27377b;

    /* JADX WARN: Multi-variable type inference failed */
    public AEMFetchContentFragmentUseCase(@NotNull AEMDataSource dataSource, @NotNull AEMContentMapper<? extends T> mapper) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f27376a = dataSource;
        this.f27377b = mapper;
    }

    @Override // com.bbva.cells.componentkit.usecase.UseCase
    @Nullable
    public Object call(@NotNull AEMRequest aEMRequest, @NotNull Continuation<? super T> continuation) throws Throwable {
        FetchResult<AEMContent> fetchResultFetch = this.f27376a.fetch(aEMRequest);
        if (fetchResultFetch instanceof FetchResult.Error) {
            throw ((FetchResult.Error) fetchResultFetch).getException();
        }
        if (!(fetchResultFetch instanceof FetchResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        T map = this.f27377b.map((AEMContent) ((FetchResult.Success) fetchResultFetch).getValue());
        if (map != null) {
            return map;
        }
        throw new AEMEmptyContentException(null, 1, null);
    }
}
