package com.bbva.slidemenuview.cells.channels;

import androidx.appcompat.widget.o1;
import bk.d;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuWebChannels.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/slidemenuview/cells/channels/MenuWebChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "a", "Lkotlin/Lazy;", "getMenuChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "menuChannel", "", "getWebChannels", "()Ljava/util/List;", "webChannels", "<init>", "()V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class MenuWebChannels {

    @NotNull
    public static final MenuWebChannels INSTANCE = new MenuWebChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy menuChannel = LazyKt__LazyJVMKt.lazy(a.f36656p0);

    /* JADX INFO: compiled from: MenuWebChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<Boolean>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36656p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Boolean> invoke() {
            return new WebChannel.Builder("global_mobile_menu_status").toWebObject(new o1()).create();
        }
    }

    @NotNull
    public final Channel<Boolean> getMenuChannel() {
        Object value = menuChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final List<Channel<?>> getWebChannels() {
        return d.listOf(getMenuChannel());
    }
}
