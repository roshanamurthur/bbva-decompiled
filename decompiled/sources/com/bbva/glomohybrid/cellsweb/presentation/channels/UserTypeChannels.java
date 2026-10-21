package com.bbva.glomohybrid.cellsweb.presentation.channels;

import androidx.databinding.f;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import w4.j;

/* JADX INFO: compiled from: UserTypeChannels.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR#\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/channels/UserTypeChannels;", "", "", "GLOBAL_AUTH_GEMA", "Ljava/lang/String;", "GLOBAL_AUTH_GLOMO", "DEVICE_ID", "GEMA_CLIENT_ID", "Lcom/bbva/cellscore/channel/model/Channel;", "Ljava/lang/Void;", "a", "Lkotlin/Lazy;", "getShowProfileChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "showProfileChannel", "b", "getSwitchProfileChannel", "switchProfileChannel", "c", "getSplashReadyReceived", "splashReadyReceived", "<init>", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class UserTypeChannels {

    @NotNull
    public static final String DEVICE_ID = "device_accesses_device_id";

    @NotNull
    public static final String GEMA_CLIENT_ID = "gema_client_id_global_channel";

    @NotNull
    public static final String GLOBAL_AUTH_GEMA = "global_auth_token";

    @NotNull
    public static final String GLOBAL_AUTH_GLOMO = "global-auth-token";

    @NotNull
    public static final UserTypeChannels INSTANCE = new UserTypeChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy showProfileChannel = LazyKt__LazyJVMKt.lazy(a.f31653p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy switchProfileChannel = LazyKt__LazyJVMKt.lazy(c.f31655p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy splashReadyReceived = LazyKt__LazyJVMKt.lazy(b.f31654p0);

    /* JADX INFO: compiled from: UserTypeChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31653p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Void> invoke() {
            return f.d("show_profile_dialog");
        }
    }

    /* JADX INFO: compiled from: UserTypeChannels.kt */
    public static final class b extends Lambda implements Function0<WebChannel<Void>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f31654p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Void> invoke() {
            return f.d("channel_splash_ready_received");
        }
    }

    /* JADX INFO: compiled from: UserTypeChannels.kt */
    public static final class c extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f31655p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return new WebChannel.Builder("singleapp_switch_profile").toNativeObject(new j(3)).create();
        }
    }

    @NotNull
    public final Channel<Void> getShowProfileChannel() {
        Object value = showProfileChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Void> getSplashReadyReceived() {
        Object value = splashReadyReceived.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<String> getSwitchProfileChannel() {
        Object value = switchProfileChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }
}
