package com.bbva.showinfo;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.bbva.showinfo.model.BigPictureStyle;
import com.bbva.showinfo.model.BigTextStyle;
import com.bbva.showinfo.model.Content;
import com.bbva.showinfo.model.Lights;
import com.bbva.showinfo.model.Raw;
import com.bbva.showinfo.model.Res;
import com.bbva.showinfo.model.ResourceOrigin;
import com.bbva.showinfo.model.Span;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoNotificationExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006H\u0000\u001a\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0016\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0000\u001a#\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\u0010\u0016\u001a\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0016\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0000\u001a\u001e\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000\u001a\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\u001e\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000\u001a\u0016\u0010!\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0000\u001a\u001b\u0010\"\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\u0010\u0016\u001a\u001b\u0010#\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u001b\u0010$\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\u0010\t\u001a\u0016\u0010%\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010&\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010'H\u0000\u001a\u0016\u0010(\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010)H\u0000\u001a\u001e\u0010*\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000\u001a\u001e\u0010+\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000\u001a\u0016\u0010,\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010-H\u0000\u001a\u001b\u0010.\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0002\u00100¨\u00061"}, d2 = {"actions", "", "Landroidx/core/app/NotificationCompat$Builder;", "source", "Ljava/util/ArrayList;", "Landroidx/core/app/NotificationCompat$Action;", "Lkotlin/collections/ArrayList;", "autoCancel", "", "(Landroidx/core/app/NotificationCompat$Builder;Ljava/lang/Boolean;)V", "bigPictureStyle", "Lcom/bbva/showinfo/model/BigPictureStyle;", "bigTextStyle", "Lcom/bbva/showinfo/model/BigTextStyle;", "color", "context", "Landroid/content/Context;", "", "(Landroidx/core/app/NotificationCompat$Builder;Landroid/content/Context;Ljava/lang/Integer;)V", "dismiss", "Landroid/app/PendingIntent;", "flags", "(Landroidx/core/app/NotificationCompat$Builder;Ljava/lang/Integer;)V", "groupKey", "", "groupSummary", "inboxStyle", "Landroidx/core/app/NotificationCompat$InboxStyle;", "largeIcon", "Lcom/bbva/showinfo/model/ResourceOrigin;", "lights", "Lcom/bbva/showinfo/model/Lights;", "message", "notificationTap", "number", "ongoing", "onlyAlertOnce", "person", "smallIcon", "Lcom/bbva/showinfo/model/Res;", "sound", "Landroid/net/Uri;", "ticker", "title", "vibration", "", "whenever", "", "(Landroidx/core/app/NotificationCompat$Builder;Ljava/lang/Long;)V", "showinfo_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInfoNotificationExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoNotificationExtensions.kt\ncom/bbva/showinfo/InfoNotificationExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n1#2:276\n13337#3,2:277\n1855#4,2:279\n*S KotlinDebug\n*F\n+ 1 InfoNotificationExtensions.kt\ncom/bbva/showinfo/InfoNotificationExtensionsKt\n*L\n212#1:277,2\n252#1:279,2\n*E\n"})
public final class InfoNotificationExtensionsKt {
    public static final void actions(@NotNull NotificationCompat.Builder builder, @Nullable ArrayList<NotificationCompat.Action> arrayList) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                builder.addAction((NotificationCompat.Action) it.next());
            }
        }
    }

    public static final void autoCancel(@NotNull NotificationCompat.Builder builder, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (bool != null) {
            builder.setAutoCancel(bool.booleanValue());
        }
    }

    public static final void bigPictureStyle(@NotNull NotificationCompat.Builder builder, @Nullable BigPictureStyle bigPictureStyle) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (bigPictureStyle != null) {
            NotificationCompat.BigPictureStyle bigPictureStyle2 = new NotificationCompat.BigPictureStyle();
            String title = bigPictureStyle.getTitle();
            if (title != null) {
                bigPictureStyle2.setBigContentTitle(title);
            }
            Bitmap picture = bigPictureStyle.getPicture();
            if (picture != null) {
                bigPictureStyle2.bigPicture(picture);
            }
            if (bigPictureStyle.getSummaryText() != null) {
                bigPictureStyle2.setSummaryText(bigPictureStyle.getSummaryText());
            }
            bigPictureStyle2.bigLargeIcon(bigPictureStyle.getLargeIcon());
            builder.setStyle(bigPictureStyle2);
        }
    }

    public static final void bigTextStyle(@NotNull NotificationCompat.Builder builder, @Nullable BigTextStyle bigTextStyle) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (bigTextStyle != null) {
            if (!(!l.isBlank(bigTextStyle.getTitle())) || !(!l.isBlank(bigTextStyle.getSource())) || !(!l.isBlank(bigTextStyle.getSummaryText()))) {
                throw new IllegalArgumentException("All values must be filled in".toString());
            }
            builder.setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(bigTextStyle.getTitle()).bigText(bigTextStyle.getSource()).setSummaryText(bigTextStyle.getSummaryText()));
        }
    }

    public static final void color(@NotNull NotificationCompat.Builder builder, @NotNull Context context, @Nullable Integer num) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                throw new IllegalArgumentException("Color value must be greater than zero".toString());
            }
            builder.setColor(context.getColor(iIntValue));
        }
    }

    public static final void dismiss(@NotNull NotificationCompat.Builder builder, @Nullable PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (pendingIntent != null) {
            builder.setDeleteIntent(pendingIntent);
        }
    }

    public static final void flags(@NotNull NotificationCompat.Builder builder, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (num != null) {
            builder.setDefaults(num.intValue());
        }
    }

    public static final void groupKey(@NotNull NotificationCompat.Builder builder, @Nullable String str) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (str != null) {
            if (!(!l.isBlank(str))) {
                throw new IllegalArgumentException("Group Key must be filled in".toString());
            }
            builder.setGroup(str);
        }
    }

    public static final void groupSummary(@NotNull NotificationCompat.Builder builder, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (bool != null) {
            builder.setGroupSummary(bool.booleanValue());
        }
    }

    public static final void inboxStyle(@NotNull NotificationCompat.Builder builder, @Nullable NotificationCompat.InboxStyle inboxStyle) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (inboxStyle != null) {
            builder.setStyle(inboxStyle);
        }
    }

    public static final void largeIcon(@NotNull NotificationCompat.Builder builder, @NotNull Context context, @Nullable ResourceOrigin resourceOrigin) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceOrigin != null) {
            if (resourceOrigin instanceof Res) {
                builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), ((Res) resourceOrigin).getValue()));
            } else {
                if (!(resourceOrigin instanceof Content)) {
                    throw new IllegalArgumentException("Origin not supported");
                }
                builder.setLargeIcon(((Content) resourceOrigin).getBitmap());
            }
        }
    }

    public static final void lights(@NotNull NotificationCompat.Builder builder, @Nullable Lights lights) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (lights != null) {
            if (lights.getLedOffMilliseconds() <= 0 || lights.getLedOnMilliseconds() <= 0) {
                throw new IllegalArgumentException("Light pattern values must be greater than zero".toString());
            }
            builder.setLights(lights.getColor(), lights.getLedOnMilliseconds(), lights.getLedOffMilliseconds());
        }
    }

    public static final void message(@NotNull NotificationCompat.Builder builder, @NotNull Context context, @Nullable ResourceOrigin resourceOrigin) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceOrigin != null) {
            if (resourceOrigin instanceof Raw) {
                Raw raw = (Raw) resourceOrigin;
                if (!(!l.isBlank(raw.getValue()))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                builder.setContentText(raw.getValue());
                return;
            }
            if (resourceOrigin instanceof Res) {
                String string = context.getResources().getString(((Res) resourceOrigin).getValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                builder.setContentText(string);
            } else {
                if (!(resourceOrigin instanceof Span)) {
                    throw new IllegalArgumentException("Origin not supported");
                }
                Span span = (Span) resourceOrigin;
                if (span.getSpanned().length() <= 0) {
                    throw new IllegalArgumentException(Unit.INSTANCE.toString());
                }
                builder.setContentText(span.getSpanned());
            }
        }
    }

    public static final void notificationTap(@NotNull NotificationCompat.Builder builder, @Nullable PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (pendingIntent != null) {
            builder.setContentIntent(pendingIntent);
        }
    }

    public static final void number(@NotNull NotificationCompat.Builder builder, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (num != null) {
            builder.setNumber(num.intValue());
        }
    }

    public static final void ongoing(@NotNull NotificationCompat.Builder builder, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (bool != null) {
            builder.setOngoing(bool.booleanValue());
        }
    }

    public static final void onlyAlertOnce(@NotNull NotificationCompat.Builder builder, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (bool != null) {
            builder.setOnlyAlertOnce(bool.booleanValue());
        }
    }

    public static final void person(@NotNull NotificationCompat.Builder builder, @Nullable String str) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (str != null) {
            if (!(!l.isBlank(str))) {
                throw new IllegalArgumentException("Person must be filled in".toString());
            }
            builder.addPerson(str);
        }
    }

    public static final void smallIcon(@NotNull NotificationCompat.Builder builder, @Nullable Res res) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (res != null) {
            if (res.getValue() == 0) {
                throw new IllegalArgumentException(Unit.INSTANCE.toString());
            }
            if (builder.setSmallIcon(res.getValue()) != null) {
                return;
            }
        }
        throw new IllegalArgumentException("Small Icon must not be null");
    }

    public static final void sound(@NotNull NotificationCompat.Builder builder, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (uri != null) {
            builder.setSound(uri);
        }
    }

    public static final void ticker(@NotNull NotificationCompat.Builder builder, @NotNull Context context, @Nullable ResourceOrigin resourceOrigin) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceOrigin != null) {
            if (resourceOrigin instanceof Raw) {
                Raw raw = (Raw) resourceOrigin;
                if (!(!l.isBlank(raw.getValue()))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                builder.setTicker(raw.getValue());
                return;
            }
            if (resourceOrigin instanceof Res) {
                String string = context.getResources().getString(((Res) resourceOrigin).getValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                builder.setTicker(string);
            } else {
                if (!(resourceOrigin instanceof Span)) {
                    throw new IllegalArgumentException();
                }
                Span span = (Span) resourceOrigin;
                if (span.getSpanned().length() <= 0) {
                    throw new IllegalArgumentException(Unit.INSTANCE.toString());
                }
                builder.setTicker(span.getSpanned());
            }
        }
    }

    public static final void title(@NotNull NotificationCompat.Builder builder, @NotNull Context context, @Nullable ResourceOrigin resourceOrigin) throws IllegalArgumentException {
        NotificationCompat.Builder contentTitle;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (resourceOrigin != null) {
            if (resourceOrigin instanceof Raw) {
                Raw raw = (Raw) resourceOrigin;
                if (!(!l.isBlank(raw.getValue()))) {
                    throw new IllegalArgumentException("Title must be filled in".toString());
                }
                contentTitle = builder.setContentTitle(raw.getValue());
            } else {
                if (!(resourceOrigin instanceof Res)) {
                    throw new IllegalArgumentException("Origin not supported");
                }
                String string = context.getResources().getString(((Res) resourceOrigin).getValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                contentTitle = builder.setContentTitle(string);
            }
            if (contentTitle != null) {
                return;
            }
        }
        throw new IllegalArgumentException("Title must be provided");
    }

    public static final void vibration(@NotNull NotificationCompat.Builder builder, @Nullable long[] jArr) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (jArr != null) {
            for (long j10 : jArr) {
                if (j10 <= 0) {
                    throw new IllegalArgumentException("Vibration pattern values must be greater than zero".toString());
                }
            }
            builder.setVibrate(jArr);
        }
    }

    public static final void whenever(@NotNull NotificationCompat.Builder builder, @Nullable Long l6) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (l6 != null) {
            long jLongValue = l6.longValue();
            if (jLongValue <= 0) {
                throw new IllegalArgumentException("When value must be greater than zero".toString());
            }
            builder.setWhen(jLongValue);
        }
    }
}
