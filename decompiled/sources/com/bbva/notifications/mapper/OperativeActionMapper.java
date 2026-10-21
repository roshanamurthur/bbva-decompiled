package com.bbva.notifications.mapper;

import com.bbva.component.dm.settings.domain.model.Operative;
import com.bbva.component.dm.settings.domain.model.OperativeParamAction;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import com.bbva.notifications.model.ShortcutAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OperativeActionMapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/notifications/mapper/OperativeActionMapper;", "", "Lcom/bbva/component/dm/settings/domain/model/Operative;", PaymentsNotificationHandler.OPERATIVE, "Lcom/bbva/notifications/model/ShortcutAction;", "map", "Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;", "a", "Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;", "getAction", "()Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;", "action", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/OperativeParamAction;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class OperativeActionMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OperativeParamAction action;

    public OperativeActionMapper(@NotNull OperativeParamAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
    }

    @NotNull
    public final OperativeParamAction getAction() {
        return this.action;
    }

    @Nullable
    public abstract ShortcutAction map(@NotNull Operative operative);
}
