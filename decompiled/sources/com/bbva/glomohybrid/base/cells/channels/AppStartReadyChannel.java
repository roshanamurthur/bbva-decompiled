package com.bbva.glomohybrid.base.cells.channels;

import android.os.Bundle;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w4.b;

/* JADX INFO: compiled from: AppStartReadyChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/AppStartReadyChannel;", "", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/glomohybrid/base/cells/channels/AppStartReadyChannel$AppReadyParams;", "a", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "getACTION_APP_READY", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_APP_READY", "Lcom/bbva/cellscore/channel/model/Channel;", "b", "Lcom/bbva/cellscore/channel/model/Channel;", "getInstance", "()Lcom/bbva/cellscore/channel/model/Channel;", "instance", "<init>", "()V", "AppReadyParams", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class AppStartReadyChannel {

    @NotNull
    public static final AppStartReadyChannel INSTANCE = new AppStartReadyChannel();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final ActionSpec<AppReadyParams> ACTION_APP_READY = new ActionSpec<>("action-app-ready");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final WebChannel f31067b;

    /* JADX INFO: compiled from: AppStartReadyChannel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/AppStartReadyChannel$AppReadyParams;", "", "", "a", "Ljava/lang/String;", "getPageId", "()Ljava/lang/String;", "pageId", "<init>", "(Ljava/lang/String;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class AppReadyParams {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String pageId;

        /* JADX INFO: compiled from: AppStartReadyChannel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/AppStartReadyChannel$AppReadyParams$Companion;", "", "()V", "from", "Lcom/bbva/glomohybrid/base/cells/channels/AppStartReadyChannel$AppReadyParams;", "bundle", "Landroid/os/Bundle;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final AppReadyParams from(@NotNull Bundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                String string = bundle.getString("page");
                if (string == null) {
                    string = "";
                }
                return new AppReadyParams(string);
            }
        }

        public AppReadyParams(@NotNull String pageId) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.pageId = pageId;
        }

        @NotNull
        public final String getPageId() {
            return this.pageId;
        }
    }

    static {
        WebChannel webChannelCreate = new WebChannel.Builder("global_native_app_start_ready").toNativeObject(new b(1)).create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
        f31067b = webChannelCreate;
    }

    @NotNull
    public final ActionSpec<AppReadyParams> getACTION_APP_READY() {
        return ACTION_APP_READY;
    }

    @NotNull
    public final Channel<AppReadyParams> getInstance() {
        return f31067b;
    }
}
