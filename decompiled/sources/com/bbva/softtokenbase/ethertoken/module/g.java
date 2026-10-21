package com.bbva.softtokenbase.ethertoken.module;

import android.content.Context;
import com.bbva.ethermobilesdk.token.plugin.model.Configuration;
import com.bbva.ethermobilesdk.token.shared.storage.TokenSharedStorage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: EtherTokenModule.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class g extends Lambda implements Function2<Context, Configuration, TokenSharedStorage> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f36881p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(2);
        this.f36881p0 = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TokenSharedStorage invoke(Context context, Configuration configuration) {
        Context context2 = context;
        Configuration config = configuration;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        return new TokenSharedStorage(context2, this.f36881p0, config.getUserId());
    }
}
