package com.bbva.plugin.showinfo.manager;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.bbva.androidtoolkit.utils.ResourceUtils;
import com.bbva.plugin.showinfo.data.Light;
import com.bbva.plugin.showinfo.data.NotificationDTO;
import com.bbva.showinfo.model.BigPictureStyle;
import com.bbva.showinfo.model.InfoNotification;
import com.bbva.showinfo.model.Lights;
import com.bbva.showinfo.model.Raw;
import com.bbva.showinfo.model.Res;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: InfoManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoManager.kt\ncom/bbva/plugin/showinfo/manager/BasicInfoHandler$showNotification$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class a extends Lambda implements Function1<InfoNotification, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NotificationDTO f36025p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f36026q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, NotificationDTO notificationDTO) {
        super(1);
        this.f36025p0 = notificationDTO;
        this.f36026q0 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InfoNotification infoNotification) {
        InfoNotification notification = infoNotification;
        Intrinsics.checkNotNullParameter(notification, "$this$notification");
        NotificationDTO notificationDTO = this.f36025p0;
        notification.setId(notificationDTO.getId());
        notification.setChannelID(notificationDTO.getChannelID());
        notification.setChannelName(notificationDTO.getChannelName());
        notification.setChannelDesc(notificationDTO.getChannelDesc());
        notification.setImportance(notificationDTO.getImportance());
        notification.setTag(notificationDTO.getTag());
        notification.setColor(notificationDTO.getColor());
        notification.setWhenever(notificationDTO.getWhenever());
        notification.setAutoCancel(notificationDTO.getAutoCancel());
        notification.setOngoing(notificationDTO.getOngoing());
        notification.setGroupKey(notificationDTO.getGroupKey());
        notification.setGroupSummary(notificationDTO.getGroupSummary());
        notification.setNumber(notificationDTO.getNumber());
        notification.setVibration(notificationDTO.getVibration());
        notification.setOnlyAlertOnce(notificationDTO.getOnlyAlertOnce());
        notification.setAddPerson(notificationDTO.getAddPerson());
        notification.setFlags(notificationDTO.getFlags());
        String title = notificationDTO.getTitle();
        if (title != null) {
            notification.setTitle(new Raw(title));
        }
        String message = notificationDTO.getMessage();
        if (message != null) {
            notification.setMessage(new Raw(message));
        }
        String smallIcon = notificationDTO.getSmallIcon();
        Context context = this.f36026q0;
        if (smallIcon != null) {
            notification.setSmallIcon(new Res(ResourceUtils.getDrawable(context, smallIcon)));
        }
        String ticker = notificationDTO.getTicker();
        if (ticker != null) {
            notification.setTicker(new Raw(ticker));
        }
        String largeIcon = notificationDTO.getLargeIcon();
        if (largeIcon != null) {
            notification.setLargeIcon(new Res(ResourceUtils.getDrawable(context, largeIcon)));
        }
        Light lights = notificationDTO.getLights();
        if (lights != null) {
            notification.setLights(new Lights(lights.getColor(), lights.getLedOnMilliseconds(), lights.getLedOffMilliseconds()));
        }
        String bigPicture = notificationDTO.getBigPicture();
        if (bigPicture != null) {
            notification.setBigPictureStyle(new BigPictureStyle(BitmapFactory.decodeResource(context.getResources(), ResourceUtils.getDrawable(context, bigPicture)), null, null, null, 14, null));
        }
        return Unit.INSTANCE;
    }
}
