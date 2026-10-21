package com.bbva.component.dm.devices.usecase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.componentkit.usecase.UseCase;
import com.bbva.component.dm.devices.data.UnrollNotificationsDataSource;
import com.bbva.component.dm.devices.model.UnrollNotificationsRequest;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UnrollNotificationsUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/dm/devices/usecase/UnrollNotificationsUseCase;", "Lcom/bbva/cells/componentkit/usecase/UseCase;", "Lcom/bbva/component/dm/devices/model/UnrollNotificationsRequest;", "", "params", NotificationCompat.CATEGORY_CALL, "(Lcom/bbva/component/dm/devices/model/UnrollNotificationsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component/dm/devices/data/UnrollNotificationsDataSource;", "dataSource", "<init>", "(Lcom/bbva/component/dm/devices/data/UnrollNotificationsDataSource;)V", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
public final class UnrollNotificationsUseCase extends UseCase<UnrollNotificationsRequest, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UnrollNotificationsDataSource f27611a;

    public UnrollNotificationsUseCase(@NotNull UnrollNotificationsDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f27611a = dataSource;
    }

    @Override // com.bbva.cells.componentkit.usecase.UseCase
    @Nullable
    public Object call(@NotNull UnrollNotificationsRequest unrollNotificationsRequest, @NotNull Continuation<? super Unit> continuation) throws NotConnectionAvailable, ConnectionException {
        this.f27611a.unrollNotifications(unrollNotificationsRequest);
        return Unit.INSTANCE;
    }
}
