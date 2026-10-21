package com.bbva.showinfo.generator;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.util.d;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.e;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.showinfo.InfoNotificationExtensionsKt;
import com.bbva.showinfo.model.InfoNotification;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoNotificationGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/showinfo/generator/InfoNotificationGenerator;", "Lcom/bbva/showinfo/generator/ElementInfoable;", "Lcom/bbva/showinfo/model/InfoNotification;", "Landroid/content/Context;", "context", "element", "", "create", HideCommand.ID, "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoNotificationGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoNotificationGenerator.kt\ncom/bbva/showinfo/generator/InfoNotificationGenerator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class InfoNotificationGenerator implements ElementInfoable<InfoNotification> {

    @NotNull
    public static final InfoNotificationGenerator INSTANCE = new InfoNotificationGenerator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static NotificationCompat.Builder f36477a;

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void create(@NotNull Context context, @NotNull InfoNotification element) throws IllegalArgumentException {
        NotificationCompat.Builder contentIntent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        String channelID = element.getChannelID();
        if (channelID != null) {
            if (!(!l.isBlank(channelID))) {
                throw new IllegalArgumentException("Channel ID must be filled".toString());
            }
            InfoNotificationGenerator infoNotificationGenerator = INSTANCE;
            String channelName = element.getChannelName();
            String channelDesc = element.getChannelDesc();
            Integer importance = element.getImportance();
            infoNotificationGenerator.getClass();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                Object systemService = context.getSystemService("notification");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (notificationManager.getNotificationChannel(channelID) == null) {
                    e.e();
                    if (channelName == null) {
                        channelName = channelID;
                    }
                    NotificationChannel notificationChannelA = d.a(channelID, channelName, importance != null ? importance.intValue() : 3);
                    if (channelDesc == null) {
                        channelDesc = channelID;
                    }
                    notificationChannelA.setDescription(channelDesc);
                    notificationManager.createNotificationChannel(notificationChannelA);
                }
            }
            f36477a = new NotificationCompat.Builder(context, channelID);
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(PKIFailureInfo.duplicateCertReq);
            }
            Unit unit = null;
            if (i10 >= 31) {
                NotificationCompat.Builder builder = f36477a;
                if (builder != null) {
                    contentIntent = builder.setContentIntent(PendingIntent.getActivity(context, 0, launchIntentForPackage, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
                } else {
                    contentIntent = null;
                }
            } else {
                NotificationCompat.Builder builder2 = f36477a;
                if (builder2 != null) {
                    contentIntent = builder2.setContentIntent(PendingIntent.getActivity(context, 0, launchIntentForPackage, 134217728));
                } else {
                    contentIntent = null;
                }
            }
            if (contentIntent != null) {
                Integer id = element.getId();
                if (id != null) {
                    if (id.intValue() <= 0) {
                        throw new IllegalArgumentException("Notification identifier value must be greater than zero".toString());
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    throw new IllegalArgumentException("Notification ID must not be null");
                }
                String tag = element.getTag();
                if (tag != null && tag.length() <= 0) {
                    throw new IllegalArgumentException("Tag must be filled in".toString());
                }
                NotificationCompat.Builder builder3 = f36477a;
                if (builder3 != null) {
                    InfoNotificationExtensionsKt.title(builder3, context, element.getTitle());
                    InfoNotificationExtensionsKt.message(builder3, context, element.getMessage());
                    InfoNotificationExtensionsKt.smallIcon(builder3, element.getSmallIcon());
                    InfoNotificationExtensionsKt.ticker(builder3, context, element.getTicker());
                    InfoNotificationExtensionsKt.color(builder3, context, element.getColor());
                    InfoNotificationExtensionsKt.whenever(builder3, element.getWhenever());
                    InfoNotificationExtensionsKt.bigTextStyle(builder3, element.getBigTextStyle());
                    InfoNotificationExtensionsKt.bigPictureStyle(builder3, element.getBigPictureStyle());
                    InfoNotificationExtensionsKt.inboxStyle(builder3, element.getInboxStyle());
                    InfoNotificationExtensionsKt.autoCancel(builder3, element.getAutoCancel());
                    InfoNotificationExtensionsKt.ongoing(builder3, element.getOngoing());
                    InfoNotificationExtensionsKt.ticker(builder3, context, element.getTicker());
                    InfoNotificationExtensionsKt.largeIcon(builder3, context, element.getLargeIcon());
                    InfoNotificationExtensionsKt.number(builder3, element.getNumber());
                    InfoNotificationExtensionsKt.groupKey(builder3, element.getGroupKey());
                    InfoNotificationExtensionsKt.groupSummary(builder3, element.getGroupSummary());
                    InfoNotificationExtensionsKt.vibration(builder3, element.getVibration());
                    InfoNotificationExtensionsKt.lights(builder3, element.getLights());
                    InfoNotificationExtensionsKt.sound(builder3, element.getSound());
                    InfoNotificationExtensionsKt.onlyAlertOnce(builder3, element.getOnlyAlertOnce());
                    InfoNotificationExtensionsKt.person(builder3, element.getAddPerson());
                    InfoNotificationExtensionsKt.actions(builder3, element.getActions());
                    InfoNotificationExtensionsKt.notificationTap(builder3, element.getNotificationTap());
                    InfoNotificationExtensionsKt.flags(builder3, element.getFlags());
                    InfoNotificationExtensionsKt.dismiss(builder3, element.getDismiss());
                }
                Integer id2 = element.getId();
                String tag2 = element.getTag();
                NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
                NotificationCompat.Builder builder4 = f36477a;
                if (builder4 != null) {
                    notificationManagerCompatFrom.notify(tag2, id2 != null ? id2.intValue() : 1, builder4.build());
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void hide(@NotNull Context context, @NotNull InfoNotification element) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        ElementInfoable.DefaultImpls.hide(this, context, element);
        Integer id = element.getId();
        if (id == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        NotificationManagerCompat.from(context).cancel(id.intValue());
    }
}
