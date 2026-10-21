package com.bbva.glomohybrid.cellsweb.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import j4.b;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SettingsDialogChannel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/channels/SettingsDialogChannel;", "", "", "CANCEL_SETTINGS_MODAL_CHANNEL", "Ljava/lang/String;", "Lcom/bbva/cellscore/channel/model/Channel;", "a", "Lkotlin/Lazy;", "getShowSettingsModalChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "showSettingsModalChannel", "<init>", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class SettingsDialogChannel {

    @NotNull
    public static final String CANCEL_SETTINGS_MODAL_CHANNEL = "cancel_button_settings_dialog";

    @NotNull
    public static final SettingsDialogChannel INSTANCE = new SettingsDialogChannel();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy showSettingsModalChannel = LazyKt__LazyJVMKt.lazy(a.f31636p0);

    /* JADX INFO: compiled from: SettingsDialogChannel.kt */
    public static final class a extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31636p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return new WebChannel.Builder("show_settings_dialog").toNativeObject(new b(2)).create();
        }
    }

    @NotNull
    public final Channel<String> getShowSettingsModalChannel() {
        Object value = showSettingsModalChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }
}
