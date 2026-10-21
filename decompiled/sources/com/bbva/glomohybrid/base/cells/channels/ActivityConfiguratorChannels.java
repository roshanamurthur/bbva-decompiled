package com.bbva.glomohybrid.base.cells.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityConfiguratorChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/ActivityConfiguratorChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "Lcom/bbva/glomohybrid/base/activityConfigurators/ScratchcardConfiguration;", "a", "Lkotlin/Lazy;", "getScratchcardChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "scratchcardChannel", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class ActivityConfiguratorChannels {

    @NotNull
    public static final ActivityConfiguratorChannels INSTANCE = new ActivityConfiguratorChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy scratchcardChannel = LazyKt__LazyJVMKt.lazy(a.f31063p0);

    /* JADX INFO: compiled from: ActivityConfiguratorChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<ScratchcardConfiguration>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31063p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<ScratchcardConfiguration> invoke() {
            return new WebChannel.Builder("open_scratchcard_channel").toNativeObject(new w4.a(2)).create();
        }
    }

    @NotNull
    public final Channel<ScratchcardConfiguration> getScratchcardChannel() {
        Object value = scratchcardChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }
}
