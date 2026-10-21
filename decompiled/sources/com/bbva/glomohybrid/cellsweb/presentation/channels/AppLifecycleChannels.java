package com.bbva.glomohybrid.cellsweb.presentation.channels;

import androidx.databinding.f;
import com.bbva.cellscore.web.model.channel.WebChannel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppLifecycleChannels.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR#\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/channels/AppLifecycleChannels;", "", "Lcom/bbva/cellscore/web/model/channel/WebChannel;", "a", "Lkotlin/Lazy;", "getInitializeLifecycleObserverChannel", "()Lcom/bbva/cellscore/web/model/channel/WebChannel;", "initializeLifecycleObserverChannel", "<init>", "()V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class AppLifecycleChannels {

    @NotNull
    public static final AppLifecycleChannels INSTANCE = new AppLifecycleChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy initializeLifecycleObserverChannel = LazyKt__LazyJVMKt.lazy(a.f31646p0);

    /* JADX INFO: compiled from: AppLifecycleChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31646p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return f.d("initialize_app_lifecycle_observer");
        }
    }

    @NotNull
    public final WebChannel<Object> getInitializeLifecycleObserverChannel() {
        Object value = initializeLifecycleObserverChannel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WebChannel) value;
    }
}
