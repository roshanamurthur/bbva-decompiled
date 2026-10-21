package com.bbva.component.dm.singlesignon.di;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.singlesignon.data.SSOResponseMapper;
import com.bbva.component.dm.singlesignon.data.SingleSignOnDataSource;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnRequest;
import com.bbva.component.dm.singlesignon.mapper.SSOContentMapper;
import com.bbva.component.dm.singlesignon.usecase.SSOFetchContentFragmentUseCase;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleSignOnUseCaseFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/singlesignon/di/SingleSignOnUseCaseFactory;", "", "()V", "inject", "Lcom/bbva/cells/componentkit/usecase/UseCase;", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest;", ExifInterface.GPS_DIRECTION_TRUE, "worker", "Lcom/bbva/network/NetworkWorker;", "mapper", "Lcom/bbva/component/dm/singlesignon/mapper/SSOContentMapper;", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleSignOnUseCaseFactory {

    @NotNull
    public static final SingleSignOnUseCaseFactory INSTANCE = new SingleSignOnUseCaseFactory();

    @NotNull
    public final <T> UseCase<SingleSignOnRequest, T> inject(@NotNull NetworkWorker worker, @NotNull SSOContentMapper<? extends T> mapper) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new SSOFetchContentFragmentUseCase(new SingleSignOnDataSource(worker, new SSOResponseMapper()), mapper);
    }
}
