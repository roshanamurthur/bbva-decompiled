package com.bbva.glomohybrid.base.cells.channels;

import android.os.Bundle;
import bk.q;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.glomohybrid.base.extensions.BundleExtensionsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenExternalWebViewChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "Landroid/os/Bundle;", "a", "Lcom/bbva/cellscore/channel/model/Channel;", "getInstance", "()Lcom/bbva/cellscore/channel/model/Channel;", "instance", "<init>", "()V", "NativeObject", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class OpenExternalWebViewChannel {

    @NotNull
    public static final OpenExternalWebViewChannel INSTANCE = new OpenExternalWebViewChannel();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final WebChannel f31173a;

    static {
        WebChannel webChannelCreate = new WebChannel.Builder("open_external_webview").create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
        f31173a = webChannelCreate;
    }

    @NotNull
    public final Channel<Bundle> getInstance() {
        return f31173a;
    }

    /* JADX INFO: compiled from: OpenExternalWebViewChannel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\t\u0018\u0000 @2\u00020\u0001:\u0001@BÙ\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0018\u0012\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0018\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010)\u001a\u00020$\u0012\b\b\u0002\u0010,\u001a\u00020$\u0012\b\b\u0002\u0010/\u001a\u00020$\u0012\u001a\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0018\u0012\u0006\u00105\u001a\u00020$\u0012\b\b\u0002\u00107\u001a\u00020$\u0012\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u000108¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R+\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010/\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R+\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00188\u0006¢\u0006\f\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001cR\u0017\u00105\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u0017\u00107\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(R%\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u0001088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel$NativeObject;", "", "", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "b", "getMethod", "method", "c", "getUrl", "url", "", "d", "[B", "getBody", "()[B", "body", "e", "getDarkModeSupport", "darkModeSupport", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "getCloseUrls", "()Ljava/util/ArrayList;", Companion.CONSTANTS.CLOSE_URLS_KEY, "g", "getResetPasswordUrls", Companion.CONSTANTS.RESET_PASSWORD_URLS_KEY, "h", "getMessage", "message", "", "i", "Z", "getCloseUrlsToCamelCase", "()Z", Companion.CONSTANTS.CLOSE_URLS_CAMEL_CASE_KEY, "j", "getHideToolbar", Companion.CONSTANTS.HIDE_TOOLBAR_KEY, "k", "getSendInitMessage", Companion.CONSTANTS.SEND_INIT_MESSAGE_KEY, "l", "getPermissions", "permissions", "m", "getMediaPlaybackRequired", Companion.CONSTANTS.MEDIA_PLAYBACK_REQUIRED_KEY, "n", "isBackDisabled", "", "o", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZZZLjava/util/ArrayList;ZZLjava/util/Map;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class NativeObject {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String method;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final byte[] body;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String darkModeSupport;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final ArrayList<String> closeUrls;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final ArrayList<String> resetPasswordUrls;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String message;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final boolean closeUrlsToCamelCase;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final boolean hideToolbar;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public final boolean sendInitMessage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final ArrayList<String> permissions;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public final boolean mediaPlaybackRequired;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final boolean isBackDisabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Map<String, String> headers;

        /* JADX INFO: compiled from: OpenExternalWebViewChannel.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel$NativeObject$Companion;", "", "Landroid/os/Bundle;", "bundle", "Lcom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel$NativeObject;", "from", "<init>", "()V", "CONSTANTS", "Base_release"}, k = 1, mv = {1, 9, 0})
        @SourceDebugExtension({"SMAP\nOpenExternalWebViewChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenExternalWebViewChannel.kt\ncom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel$NativeObject$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,112:1\n125#2:113\n152#2,3:114\n*S KotlinDebug\n*F\n+ 1 OpenExternalWebViewChannel.kt\ncom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel$NativeObject$Companion\n*L\n65#1:113\n65#1:114,3\n*E\n"})
        public static final class Companion {

            /* JADX INFO: compiled from: OpenExternalWebViewChannel.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/OpenExternalWebViewChannel$NativeObject$Companion$CONSTANTS;", "", "()V", "BACK_DISABLED_KEY", "", "CLOSE_URLS_CAMEL_CASE_KEY", "CLOSE_URLS_KEY", "DARK_MODE_SUPPORT_KEY", "HEADERS_KEY", "HIDE_TOOLBAR_KEY", "MEDIA_PLAYBACK_REQUIRED_KEY", "MESSAGE_KEY", "METHOD_KEY", "PARAMS_KEY", "PERMISSIONS_KEY", "RESET_PASSWORD_URLS_KEY", "SEND_INIT_MESSAGE_KEY", "TITLE_KEY", "URL_KEY", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class CONSTANTS {

                @NotNull
                public static final String BACK_DISABLED_KEY = "backDisabled";

                @NotNull
                public static final String CLOSE_URLS_CAMEL_CASE_KEY = "closeUrlsToCamelCase";

                @NotNull
                public static final String CLOSE_URLS_KEY = "closeUrls";

                @NotNull
                public static final String DARK_MODE_SUPPORT_KEY = "nativeDarkModeSupport";

                @NotNull
                public static final String HEADERS_KEY = "headers";

                @NotNull
                public static final String HIDE_TOOLBAR_KEY = "hideToolbar";

                @NotNull
                public static final CONSTANTS INSTANCE = new CONSTANTS();

                @NotNull
                public static final String MEDIA_PLAYBACK_REQUIRED_KEY = "mediaPlaybackRequired";

                @NotNull
                public static final String MESSAGE_KEY = "message";

                @NotNull
                public static final String METHOD_KEY = "method";

                @NotNull
                public static final String PARAMS_KEY = "params";

                @NotNull
                public static final String PERMISSIONS_KEY = "permissions";

                @NotNull
                public static final String RESET_PASSWORD_URLS_KEY = "resetPasswordUrls";

                @NotNull
                public static final String SEND_INIT_MESSAGE_KEY = "sendInitMessage";

                @NotNull
                public static final String TITLE_KEY = "title";

                @NotNull
                public static final String URL_KEY = "url";
            }

            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final NativeObject from(@NotNull Bundle bundle) {
                byte[] bArr;
                Map map;
                Map<String, Object> map2;
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                String string = bundle.getString("title", "");
                String string2 = bundle.getString("method", "GET");
                String string3 = bundle.getString("url", "");
                Bundle bundle2 = bundle.getBundle("params");
                if (bundle2 != null) {
                    Charset charset = Charsets.UTF_8;
                    Set<String> setKeySet = bundle2.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
                    byte[] bytes = CollectionsKt___CollectionsKt.joinToString$default(setKeySet, "&", null, null, 0, null, new a(bundle2), 30, null).getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    bArr = bytes;
                } else {
                    bArr = null;
                }
                String string4 = bundle.getString(CONSTANTS.DARK_MODE_SUPPORT_KEY);
                ArrayList<String> stringArrayList = bundle.getStringArrayList(CONSTANTS.CLOSE_URLS_KEY);
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList(CONSTANTS.RESET_PASSWORD_URLS_KEY);
                String string5 = bundle.getString("message");
                boolean z10 = bundle.getBoolean(CONSTANTS.CLOSE_URLS_CAMEL_CASE_KEY);
                boolean z11 = bundle.getBoolean(CONSTANTS.HIDE_TOOLBAR_KEY);
                boolean z12 = bundle.getBoolean(CONSTANTS.SEND_INIT_MESSAGE_KEY);
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("permissions");
                boolean z13 = bundle.getBoolean(CONSTANTS.MEDIA_PLAYBACK_REQUIRED_KEY, true);
                boolean z14 = bundle.getBoolean(CONSTANTS.BACK_DISABLED_KEY, false);
                Bundle bundle3 = bundle.getBundle("headers");
                if (bundle3 == null || (map2 = BundleExtensionsKt.toMap(bundle3)) == null) {
                    map = null;
                } else {
                    ArrayList arrayList = new ArrayList(map2.size());
                    for (Map.Entry<String, Object> entry : map2.entrySet()) {
                        arrayList.add(TuplesKt.to(entry.getKey(), String.valueOf(entry.getValue())));
                    }
                    map = q.toMap(arrayList);
                }
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string2);
                Intrinsics.checkNotNull(string3);
                return new NativeObject(string, string2, string3, bArr, string4, stringArrayList, stringArrayList2, string5, z10, z11, z12, stringArrayList3, z13, z14, map);
            }
        }

        public NativeObject(@NotNull String title, @NotNull String method, @NotNull String url, @Nullable byte[] bArr, @Nullable String str, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2, @Nullable String str2, boolean z10, boolean z11, boolean z12, @Nullable ArrayList<String> arrayList3, boolean z13, boolean z14, @Nullable Map<String, String> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            this.title = title;
            this.method = method;
            this.url = url;
            this.body = bArr;
            this.darkModeSupport = str;
            this.closeUrls = arrayList;
            this.resetPasswordUrls = arrayList2;
            this.message = str2;
            this.closeUrlsToCamelCase = z10;
            this.hideToolbar = z11;
            this.sendInitMessage = z12;
            this.permissions = arrayList3;
            this.mediaPlaybackRequired = z13;
            this.isBackDisabled = z14;
            this.headers = map;
        }

        @Nullable
        public final byte[] getBody() {
            return this.body;
        }

        @Nullable
        public final ArrayList<String> getCloseUrls() {
            return this.closeUrls;
        }

        public final boolean getCloseUrlsToCamelCase() {
            return this.closeUrlsToCamelCase;
        }

        @Nullable
        public final String getDarkModeSupport() {
            return this.darkModeSupport;
        }

        @Nullable
        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final boolean getHideToolbar() {
            return this.hideToolbar;
        }

        public final boolean getMediaPlaybackRequired() {
            return this.mediaPlaybackRequired;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final String getMethod() {
            return this.method;
        }

        @Nullable
        public final ArrayList<String> getPermissions() {
            return this.permissions;
        }

        @Nullable
        public final ArrayList<String> getResetPasswordUrls() {
            return this.resetPasswordUrls;
        }

        public final boolean getSendInitMessage() {
            return this.sendInitMessage;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: isBackDisabled, reason: from getter */
        public final boolean getIsBackDisabled() {
            return this.isBackDisabled;
        }

        public /* synthetic */ NativeObject(String str, String str2, String str3, byte[] bArr, String str4, ArrayList arrayList, ArrayList arrayList2, String str5, boolean z10, boolean z11, boolean z12, ArrayList arrayList3, boolean z13, boolean z14, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, bArr, str4, arrayList, arrayList2, str5, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12, arrayList3, z13, (i10 & 8192) != 0 ? false : z14, (i10 & 16384) != 0 ? null : map);
        }
    }
}
