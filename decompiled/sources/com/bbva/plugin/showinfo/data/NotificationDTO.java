package com.bbva.plugin.showinfo.data;

import androidx.annotation.Keep;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010 R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010%\u001a\u0004\b/\u0010$R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b0\u0010+R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b1\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b6\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010%\u001a\u0004\b7\u0010$R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010%\u001a\u0004\b8\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/bbva/plugin/showinfo/data/NotificationDTO;", "", "id", "", "channelID", "", "channelName", "channelDesc", "importance", "title", "message", "smallIcon", LogKeysKt.TAG, "color", "ticker", "whenever", "", "autoCancel", "", "ongoing", "largeIcon", "groupKey", "groupSummary", "number", "vibration", "", "lights", "Lcom/bbva/plugin/showinfo/data/Light;", "onlyAlertOnce", "addPerson", "flags", "bigPicture", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;[JLcom/bbva/plugin/showinfo/data/Light;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getAddPerson", "()Ljava/lang/String;", "getAutoCancel", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBigPicture", "getChannelDesc", "getChannelID", "getChannelName", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFlags", "getGroupKey", "getGroupSummary", "getId", "getImportance", "getLargeIcon", "getLights", "()Lcom/bbva/plugin/showinfo/data/Light;", "getMessage", "getNumber", "getOngoing", "getOnlyAlertOnce", "getSmallIcon", "getTag", "getTicker", "getTitle", "getVibration", "()[J", "getWhenever", "()Ljava/lang/Long;", "Ljava/lang/Long;", "showinfo-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NotificationDTO {

    @Nullable
    private final String addPerson;

    @Nullable
    private final Boolean autoCancel;

    @Nullable
    private final String bigPicture;

    @Nullable
    private final String channelDesc;

    @Nullable
    private final String channelID;

    @Nullable
    private final String channelName;

    @Nullable
    private final Integer color;

    @Nullable
    private final Integer flags;

    @Nullable
    private final String groupKey;

    @Nullable
    private final Boolean groupSummary;

    @Nullable
    private final Integer id;

    @Nullable
    private final Integer importance;

    @Nullable
    private final String largeIcon;

    @Nullable
    private final Light lights;

    @Nullable
    private final String message;

    @Nullable
    private final Integer number;

    @Nullable
    private final Boolean ongoing;

    @Nullable
    private final Boolean onlyAlertOnce;

    @Nullable
    private final String smallIcon;

    @Nullable
    private final String tag;

    @Nullable
    private final String ticker;

    @Nullable
    private final String title;

    @Nullable
    private final long[] vibration;

    @Nullable
    private final Long whenever;

    public NotificationDTO(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num2, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num3, @Nullable String str8, @Nullable Long l6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str9, @Nullable String str10, @Nullable Boolean bool3, @Nullable Integer num4, @Nullable long[] jArr, @Nullable Light light, @Nullable Boolean bool4, @Nullable String str11, @Nullable Integer num5, @Nullable String str12) {
        this.id = num;
        this.channelID = str;
        this.channelName = str2;
        this.channelDesc = str3;
        this.importance = num2;
        this.title = str4;
        this.message = str5;
        this.smallIcon = str6;
        this.tag = str7;
        this.color = num3;
        this.ticker = str8;
        this.whenever = l6;
        this.autoCancel = bool;
        this.ongoing = bool2;
        this.largeIcon = str9;
        this.groupKey = str10;
        this.groupSummary = bool3;
        this.number = num4;
        this.vibration = jArr;
        this.lights = light;
        this.onlyAlertOnce = bool4;
        this.addPerson = str11;
        this.flags = num5;
        this.bigPicture = str12;
    }

    @Nullable
    public final String getAddPerson() {
        return this.addPerson;
    }

    @Nullable
    public final Boolean getAutoCancel() {
        return this.autoCancel;
    }

    @Nullable
    public final String getBigPicture() {
        return this.bigPicture;
    }

    @Nullable
    public final String getChannelDesc() {
        return this.channelDesc;
    }

    @Nullable
    public final String getChannelID() {
        return this.channelID;
    }

    @Nullable
    public final String getChannelName() {
        return this.channelName;
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getFlags() {
        return this.flags;
    }

    @Nullable
    public final String getGroupKey() {
        return this.groupKey;
    }

    @Nullable
    public final Boolean getGroupSummary() {
        return this.groupSummary;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Integer getImportance() {
        return this.importance;
    }

    @Nullable
    public final String getLargeIcon() {
        return this.largeIcon;
    }

    @Nullable
    public final Light getLights() {
        return this.lights;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Integer getNumber() {
        return this.number;
    }

    @Nullable
    public final Boolean getOngoing() {
        return this.ongoing;
    }

    @Nullable
    public final Boolean getOnlyAlertOnce() {
        return this.onlyAlertOnce;
    }

    @Nullable
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTicker() {
        return this.ticker;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final long[] getVibration() {
        return this.vibration;
    }

    @Nullable
    public final Long getWhenever() {
        return this.whenever;
    }

    public /* synthetic */ NotificationDTO(Integer num, String str, String str2, String str3, Integer num2, String str4, String str5, String str6, String str7, Integer num3, String str8, Long l6, Boolean bool, Boolean bool2, String str9, String str10, Boolean bool3, Integer num4, long[] jArr, Light light, Boolean bool4, String str11, Integer num5, String str12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2, str4, (i10 & 64) != 0 ? null : str5, str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : num3, (i10 & 1024) != 0 ? null : str8, (i10 & 2048) != 0 ? null : l6, (i10 & 4096) != 0 ? null : bool, (i10 & 8192) != 0 ? null : bool2, (i10 & 16384) != 0 ? null : str9, (32768 & i10) != 0 ? null : str10, (65536 & i10) != 0 ? null : bool3, (131072 & i10) != 0 ? null : num4, (262144 & i10) != 0 ? null : jArr, (524288 & i10) != 0 ? null : light, (1048576 & i10) != 0 ? null : bool4, (2097152 & i10) != 0 ? null : str11, (4194304 & i10) != 0 ? null : num5, (i10 & 8388608) != 0 ? null : str12);
    }
}
