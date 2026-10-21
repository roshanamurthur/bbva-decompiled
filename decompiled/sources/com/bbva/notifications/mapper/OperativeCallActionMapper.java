package com.bbva.notifications.mapper;

import com.bbva.component.dm.settings.domain.model.Operative;
import com.bbva.component.dm.settings.domain.model.OperativeParamAction;
import com.bbva.component.dm.settings.domain.model.OperativeParams;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import com.bbva.notifications.model.ShortcutAction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OperativeCallActionMapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/notifications/mapper/OperativeCallActionMapper;", "Lcom/bbva/notifications/mapper/OperativeActionMapper;", "Lcom/bbva/component/dm/settings/domain/model/Operative;", PaymentsNotificationHandler.OPERATIVE, "Lcom/bbva/notifications/model/ShortcutAction;", "map", "<init>", "()V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nOperativeCallActionMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperativeCallActionMapper.kt\ncom/bbva/notifications/mapper/OperativeCallActionMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class OperativeCallActionMapper extends OperativeActionMapper {

    @NotNull
    public static final String KEY_PHONE = "phone";

    public OperativeCallActionMapper() {
        super(OperativeParamAction.CALL);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    @Override // com.bbva.notifications.mapper.OperativeActionMapper
    @Nullable
    public ShortcutAction map(@NotNull Operative operative) {
        Operative operative2;
        Map<String, Object> config;
        OperativeParams params;
        Intrinsics.checkNotNullParameter(operative, "operative");
        if (Intrinsics.areEqual(operative.getWebManager(), Boolean.FALSE)) {
            OperativeParams params2 = operative.getParams();
            if ((params2 != null ? params2.getAction() : null) != getAction() || (params = operative.getParams()) == null) {
                operative2 = null;
            } else {
                Object obj = params.getConfig().get("phone");
                String str = obj instanceof String ? (String) obj : null;
                if (str == null || str.length() == 0) {
                    operative2 = null;
                } else {
                    operative2 = operative;
                }
            }
        } else {
            operative2 = null;
        }
        if (operative2 == null) {
            return null;
        }
        OperativeParams params3 = operative.getParams();
        Object obj2 = (params3 == null || (config = params3.getConfig()) == null) ? null : config.get("phone");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        return new ShortcutAction.ActionCall(str2);
    }
}
