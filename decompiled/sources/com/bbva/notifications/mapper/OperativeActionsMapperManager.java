package com.bbva.notifications.mapper;

import androidx.camera.core.imagecapture.a;
import bk.d;
import com.bbva.component.dm.settings.domain.model.Operative;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import com.bbva.notifications.model.ShortcutAction;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OperativeActionsMapperManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/bbva/notifications/mapper/OperativeActionsMapperManager;", "", "Lcom/bbva/component/dm/settings/domain/model/Operative;", PaymentsNotificationHandler.OPERATIVE, "Lcom/bbva/notifications/model/ShortcutAction;", "map", "", "Lcom/bbva/notifications/mapper/OperativeActionMapper;", "component1", "actionsMappers", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getActionsMappers", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOperativeActionsMapperManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperativeActionsMapperManager.kt\ncom/bbva/notifications/mapper/OperativeActionsMapperManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final /* data */ class OperativeActionsMapperManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final OperativeActionsMapperManager f35383b = new OperativeActionsMapperManager(d.listOf(new OperativeCallActionMapper()));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<OperativeActionMapper> actionsMappers;

    /* JADX INFO: compiled from: OperativeActionsMapperManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/notifications/mapper/OperativeActionsMapperManager$Companion;", "", "()V", "DEFAULT", "Lcom/bbva/notifications/mapper/OperativeActionsMapperManager;", "getDEFAULT", "()Lcom/bbva/notifications/mapper/OperativeActionsMapperManager;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OperativeActionsMapperManager getDEFAULT() {
            return OperativeActionsMapperManager.f35383b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OperativeActionsMapperManager(@NotNull List<? extends OperativeActionMapper> actionsMappers) {
        Intrinsics.checkNotNullParameter(actionsMappers, "actionsMappers");
        this.actionsMappers = actionsMappers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperativeActionsMapperManager copy$default(OperativeActionsMapperManager operativeActionsMapperManager, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = operativeActionsMapperManager.actionsMappers;
        }
        return operativeActionsMapperManager.copy(list);
    }

    @NotNull
    public final List<OperativeActionMapper> component1() {
        return this.actionsMappers;
    }

    @NotNull
    public final OperativeActionsMapperManager copy(@NotNull List<? extends OperativeActionMapper> actionsMappers) {
        Intrinsics.checkNotNullParameter(actionsMappers, "actionsMappers");
        return new OperativeActionsMapperManager(actionsMappers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OperativeActionsMapperManager) && Intrinsics.areEqual(this.actionsMappers, ((OperativeActionsMapperManager) other).actionsMappers);
    }

    @NotNull
    public final List<OperativeActionMapper> getActionsMappers() {
        return this.actionsMappers;
    }

    public int hashCode() {
        return this.actionsMappers.hashCode();
    }

    @Nullable
    public final ShortcutAction map(@NotNull Operative operative) {
        Intrinsics.checkNotNullParameter(operative, "operative");
        Iterator<T> it = this.actionsMappers.iterator();
        while (it.hasNext()) {
            ShortcutAction map = ((OperativeActionMapper) it.next()).map(operative);
            if (map != null) {
                return map;
            }
        }
        return null;
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("OperativeActionsMapperManager(actionsMappers="), this.actionsMappers, ")");
    }
}
