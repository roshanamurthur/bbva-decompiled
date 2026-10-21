package com.bbva.glomohybrid.cellsweb.presentation.channels;

import androidx.databinding.f;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CellsWebChannels.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/channels/CellsWebChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "a", "Lcom/bbva/cellscore/channel/model/Channel;", "getBackToWelcomeVideo", "()Lcom/bbva/cellscore/channel/model/Channel;", "backToWelcomeVideo", "", "b", "Lkotlin/Lazy;", "getGlobalNativeUserAgentChannel", "globalNativeUserAgentChannel", "<init>", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CellsWebChannels {

    @NotNull
    public static final CellsWebChannels INSTANCE = new CellsWebChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<Object> backToWelcomeVideo = z1.b("close_native_web_view_to_welcome", "create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy globalNativeUserAgentChannel = LazyKt__LazyJVMKt.lazy(a.f31649p0);

    /* JADX INFO: compiled from: CellsWebChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31649p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return f.d("global_native_user_agent");
        }
    }

    @NotNull
    public final Channel<Object> getBackToWelcomeVideo() {
        return backToWelcomeVideo;
    }

    @NotNull
    public final Channel<String> getGlobalNativeUserAgentChannel() {
        Object value = globalNativeUserAgentChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }
}
