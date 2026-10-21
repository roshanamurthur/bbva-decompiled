package com.bbva.smartassistance.channels;

import androidx.databinding.f;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.smartassistance.flags.SmartAssistanceFlag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import w4.i;

/* JADX INFO: compiled from: SmartAssistanceChannels.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/bbva/smartassistance/channels/SmartAssistanceChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "a", "Lkotlin/Lazy;", "getAskToSmartAssistance", "()Lcom/bbva/cellscore/channel/model/Channel;", "askToSmartAssistance", "b", "getInitializeSmartAssistance", "initializeSmartAssistance", "c", "getLogoutSmartAssistance", "logoutSmartAssistance", "Lcom/bbva/smartassistance/flags/SmartAssistanceFlag;", "d", "getUpdateSmartAssistanceFlags", "updateSmartAssistanceFlags", "<init>", "()V", "gl-smart-assistance_release"}, k = 1, mv = {1, 9, 0})
public final class SmartAssistanceChannels {

    @NotNull
    public static final SmartAssistanceChannels INSTANCE = new SmartAssistanceChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy askToSmartAssistance = LazyKt__LazyJVMKt.lazy(a.f36803p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy initializeSmartAssistance = LazyKt__LazyJVMKt.lazy(b.f36804p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy logoutSmartAssistance = LazyKt__LazyJVMKt.lazy(c.f36805p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy updateSmartAssistanceFlags = LazyKt__LazyJVMKt.lazy(d.f36806p0);

    /* JADX INFO: compiled from: SmartAssistanceChannels.kt */
    public static final class a extends Lambda implements Function0<WebChannel<String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36803p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<String> invoke() {
            return new WebChannel.Builder("global_sa_ask_channel").toNativeObject(new i(2)).create();
        }
    }

    /* JADX INFO: compiled from: SmartAssistanceChannels.kt */
    public static final class b extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f36804p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return f.d("global_sa_initialize_channel");
        }
    }

    /* JADX INFO: compiled from: SmartAssistanceChannels.kt */
    public static final class c extends Lambda implements Function0<WebChannel<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f36805p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<Object> invoke() {
            return f.d("global_sa_logout_channel");
        }
    }

    /* JADX INFO: compiled from: SmartAssistanceChannels.kt */
    public static final class d extends Lambda implements Function0<WebChannel<SmartAssistanceFlag>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f36806p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final WebChannel<SmartAssistanceFlag> invoke() {
            return new WebChannel.Builder("global_sa_update_flags_channel").toNativeObject(new fc.a()).create();
        }
    }

    @NotNull
    public final Channel<String> getAskToSmartAssistance() {
        Object value = askToSmartAssistance.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Object> getInitializeSmartAssistance() {
        Object value = initializeSmartAssistance.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<Object> getLogoutSmartAssistance() {
        Object value = logoutSmartAssistance.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }

    @NotNull
    public final Channel<SmartAssistanceFlag> getUpdateSmartAssistanceFlags() {
        Object value = updateSmartAssistanceFlags.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Channel) value;
    }
}
