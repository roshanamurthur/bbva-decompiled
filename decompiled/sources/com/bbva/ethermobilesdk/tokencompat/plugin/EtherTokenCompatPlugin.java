package com.bbva.ethermobilesdk.tokencompat.plugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherTokenCompatPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/EtherTokenCompatPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/ethermobilesdk/tokencompat/plugin/EtherTokenCompatCommandFactory;", "createCommandFactory", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "tokenCompatConfig", "Lkotlin/Function1;", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "", "onCreated", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;Lkotlin/jvm/functions/Function1;)V", "Companion", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class EtherTokenCompatPlugin extends Plugin {

    @NotNull
    public static final String ID = "SoftToken";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TokenCompatConfig f30599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function1<TokenCompat, Unit> f30600b;

    public /* synthetic */ EtherTokenCompatPlugin(TokenCompatConfig tokenCompatConfig, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenCompatConfig, (i10 & 2) != 0 ? null : function1);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EtherTokenCompatPlugin(@NotNull TokenCompatConfig tokenCompatConfig, @Nullable Function1<? super TokenCompat, Unit> function1) {
        Intrinsics.checkNotNullParameter(tokenCompatConfig, "tokenCompatConfig");
        this.f30599a = tokenCompatConfig;
        this.f30600b = function1;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public EtherTokenCompatCommandFactory createCommandFactory() {
        return new EtherTokenCompatCommandFactory(this.f30599a, this.f30600b);
    }
}
