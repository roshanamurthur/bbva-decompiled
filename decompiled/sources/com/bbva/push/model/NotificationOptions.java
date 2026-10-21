package com.bbva.push.model;

import android.net.Uri;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002?@B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u009d\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J½\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001b¨\u0006A"}, d2 = {"Lcom/bbva/push/model/NotificationOptions;", "", "builder", "Lcom/bbva/push/model/NotificationOptions$Builder;", "(Lcom/bbva/push/model/NotificationOptions$Builder;)V", "title", "", "titleLocKey", "titleLocArgs", "", "content", "bodyLocKey", "bodyLocArgs", "icon", "channelId", "clickAction", "color", DynamicLink.Builder.KEY_LINK, "Landroid/net/Uri;", "sound", LogKeysKt.TAG, "rawMessage", "Lcom/bbva/push/model/RawMessage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/push/model/RawMessage;)V", "getBodyLocArgs", "()Ljava/util/List;", "getBodyLocKey", "()Ljava/lang/String;", "getChannelId", "getClickAction", "getColor", "getContent", "getIcon", "getLink", "()Landroid/net/Uri;", "getRawMessage", "()Lcom/bbva/push/model/RawMessage;", "getSound", "getTag", "getTitle", "getTitleLocArgs", "getTitleLocKey", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Builder", "Companion", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotificationOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("body_loc_args")
    @Nullable
    private final List<String> bodyLocArgs;

    @SerializedName("body_loc_key")
    @Nullable
    private final String bodyLocKey;

    @SerializedName("channelId")
    @Nullable
    private final String channelId;

    @SerializedName("clickAction")
    @Nullable
    private final String clickAction;

    @SerializedName("color")
    @Nullable
    private final String color;

    @SerializedName("content")
    @Nullable
    private final String content;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName(DynamicLink.Builder.KEY_LINK)
    @Nullable
    private final Uri link;

    @Nullable
    private final transient RawMessage rawMessage;

    @SerializedName("sound")
    @Nullable
    private final String sound;

    @SerializedName(LogKeysKt.TAG)
    @Nullable
    private final String tag;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("title_loc_args")
    @Nullable
    private final List<String> titleLocArgs;

    @SerializedName("title_loc_key")
    @Nullable
    private final String titleLocKey;

    /* JADX INFO: compiled from: NotificationModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bL\u0010MJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR$\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR$\u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR*\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010G\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\b\"\u0004\bF\u0010\nR*\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010B¨\u0006N"}, d2 = {"Lcom/bbva/push/model/NotificationOptions$Builder;", "", "Lcom/bbva/push/model/NotificationOptions;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "b", "getContent", "setContent", "content", "c", "getIcon", "setIcon", "icon", "d", "getChannelId", "setChannelId", "channelId", "e", "getClickAction", "setClickAction", "clickAction", "f", "getColor", "setColor", "color", "Landroid/net/Uri;", "g", "Landroid/net/Uri;", "getLink", "()Landroid/net/Uri;", "setLink", "(Landroid/net/Uri;)V", DynamicLink.Builder.KEY_LINK, "h", "getSound", "setSound", "sound", "i", "getTag", "setTag", LogKeysKt.TAG, "Lcom/bbva/push/model/RawMessage;", "j", "Lcom/bbva/push/model/RawMessage;", "getRawMessage", "()Lcom/bbva/push/model/RawMessage;", "setRawMessage", "(Lcom/bbva/push/model/RawMessage;)V", "rawMessage", "k", "getBodyLocKey", "setBodyLocKey", "bodyLocKey", "", "l", "Ljava/util/List;", "getBodyLocArgs", "()Ljava/util/List;", "setBodyLocArgs", "(Ljava/util/List;)V", "bodyLocArgs", "m", "getTitleLocKey", "setTitleLocKey", "titleLocKey", "n", "getTitleLocArgs", "setTitleLocArgs", "titleLocArgs", "<init>", "()V", "push_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String content;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String icon;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String channelId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String clickAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String color;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Uri link;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String sound;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String tag;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public RawMessage rawMessage;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String bodyLocKey;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<String> bodyLocArgs;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public String titleLocKey;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<String> titleLocArgs;

        @NotNull
        public final NotificationOptions build() {
            return new NotificationOptions(this, null);
        }

        @Nullable
        public final List<String> getBodyLocArgs() {
            return this.bodyLocArgs;
        }

        @Nullable
        public final String getBodyLocKey() {
            return this.bodyLocKey;
        }

        @Nullable
        public final String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public final String getClickAction() {
            return this.clickAction;
        }

        @Nullable
        public final String getColor() {
            return this.color;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final Uri getLink() {
            return this.link;
        }

        @Nullable
        public final RawMessage getRawMessage() {
            return this.rawMessage;
        }

        @Nullable
        public final String getSound() {
            return this.sound;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final List<String> getTitleLocArgs() {
            return this.titleLocArgs;
        }

        @Nullable
        public final String getTitleLocKey() {
            return this.titleLocKey;
        }

        public final void setBodyLocArgs(@Nullable List<String> list) {
            this.bodyLocArgs = list;
        }

        public final void setBodyLocKey(@Nullable String str) {
            this.bodyLocKey = str;
        }

        public final void setChannelId(@Nullable String str) {
            this.channelId = str;
        }

        public final void setClickAction(@Nullable String str) {
            this.clickAction = str;
        }

        public final void setColor(@Nullable String str) {
            this.color = str;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setLink(@Nullable Uri uri) {
            this.link = uri;
        }

        public final void setRawMessage(@Nullable RawMessage rawMessage) {
            this.rawMessage = rawMessage;
        }

        public final void setSound(@Nullable String str) {
            this.sound = str;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTitleLocArgs(@Nullable List<String> list) {
            this.titleLocArgs = list;
        }

        public final void setTitleLocKey(@Nullable String str) {
            this.titleLocKey = str;
        }
    }

    /* JADX INFO: compiled from: NotificationModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lcom/bbva/push/model/NotificationOptions$Companion;", "", "()V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/push/model/NotificationOptions;", "block", "Lkotlin/Function1;", "Lcom/bbva/push/model/NotificationOptions$Builder;", "", "Lkotlin/ExtensionFunctionType;", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationOptions build(@NotNull Function1<? super Builder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ NotificationOptions(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Uri getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final RawMessage getRawMessage() {
        return this.rawMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleLocKey() {
        return this.titleLocKey;
    }

    @Nullable
    public final List<String> component3() {
        return this.titleLocArgs;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBodyLocKey() {
        return this.bodyLocKey;
    }

    @Nullable
    public final List<String> component6() {
        return this.bodyLocArgs;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final NotificationOptions copy(@Nullable String title, @Nullable String titleLocKey, @Nullable List<String> titleLocArgs, @Nullable String content, @Nullable String bodyLocKey, @Nullable List<String> bodyLocArgs, @Nullable String icon, @Nullable String channelId, @Nullable String clickAction, @Nullable String color, @Nullable Uri link, @Nullable String sound, @Nullable String tag, @Nullable RawMessage rawMessage) {
        return new NotificationOptions(title, titleLocKey, titleLocArgs, content, bodyLocKey, bodyLocArgs, icon, channelId, clickAction, color, link, sound, tag, rawMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationOptions)) {
            return false;
        }
        NotificationOptions notificationOptions = (NotificationOptions) other;
        return Intrinsics.areEqual(this.title, notificationOptions.title) && Intrinsics.areEqual(this.titleLocKey, notificationOptions.titleLocKey) && Intrinsics.areEqual(this.titleLocArgs, notificationOptions.titleLocArgs) && Intrinsics.areEqual(this.content, notificationOptions.content) && Intrinsics.areEqual(this.bodyLocKey, notificationOptions.bodyLocKey) && Intrinsics.areEqual(this.bodyLocArgs, notificationOptions.bodyLocArgs) && Intrinsics.areEqual(this.icon, notificationOptions.icon) && Intrinsics.areEqual(this.channelId, notificationOptions.channelId) && Intrinsics.areEqual(this.clickAction, notificationOptions.clickAction) && Intrinsics.areEqual(this.color, notificationOptions.color) && Intrinsics.areEqual(this.link, notificationOptions.link) && Intrinsics.areEqual(this.sound, notificationOptions.sound) && Intrinsics.areEqual(this.tag, notificationOptions.tag) && Intrinsics.areEqual(this.rawMessage, notificationOptions.rawMessage);
    }

    @Nullable
    public final List<String> getBodyLocArgs() {
        return this.bodyLocArgs;
    }

    @Nullable
    public final String getBodyLocKey() {
        return this.bodyLocKey;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getClickAction() {
        return this.clickAction;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Uri getLink() {
        return this.link;
    }

    @Nullable
    public final RawMessage getRawMessage() {
        return this.rawMessage;
    }

    @Nullable
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<String> getTitleLocArgs() {
        return this.titleLocArgs;
    }

    @Nullable
    public final String getTitleLocKey() {
        return this.titleLocKey;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleLocKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.titleLocArgs;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bodyLocKey;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list2 = this.bodyLocArgs;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.icon;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channelId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.clickAction;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.color;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Uri uri = this.link;
        int iHashCode11 = (iHashCode10 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str9 = this.sound;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tag;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        RawMessage rawMessage = this.rawMessage;
        return iHashCode13 + (rawMessage != null ? rawMessage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationOptions(title=" + this.title + ", titleLocKey=" + this.titleLocKey + ", titleLocArgs=" + this.titleLocArgs + ", content=" + this.content + ", bodyLocKey=" + this.bodyLocKey + ", bodyLocArgs=" + this.bodyLocArgs + ", icon=" + this.icon + ", channelId=" + this.channelId + ", clickAction=" + this.clickAction + ", color=" + this.color + ", link=" + this.link + ", sound=" + this.sound + ", tag=" + this.tag + ", rawMessage=" + this.rawMessage + RootService.CLOSE_BRACKET;
    }

    public NotificationOptions(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable List<String> list2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Uri uri, @Nullable String str9, @Nullable String str10, @Nullable RawMessage rawMessage) {
        this.title = str;
        this.titleLocKey = str2;
        this.titleLocArgs = list;
        this.content = str3;
        this.bodyLocKey = str4;
        this.bodyLocArgs = list2;
        this.icon = str5;
        this.channelId = str6;
        this.clickAction = str7;
        this.color = str8;
        this.link = uri;
        this.sound = str9;
        this.tag = str10;
        this.rawMessage = rawMessage;
    }

    private NotificationOptions(Builder builder) {
        this(builder.getTitle(), builder.getTitleLocKey(), builder.getTitleLocArgs(), builder.getContent(), builder.getBodyLocKey(), builder.getBodyLocArgs(), builder.getIcon(), builder.getChannelId(), builder.getClickAction(), builder.getColor(), builder.getLink(), builder.getSound(), builder.getTag(), builder.getRawMessage());
    }
}
