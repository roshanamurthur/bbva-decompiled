package com.bbva.ethermobilesdk.token.plugin.command;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.TokenDetail;
import com.bbva.ethermobilesdk.token.plugin.InjectorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: compiled from: GetActivatedTokensDetailCommand.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/command/GetActivatedTokensDetailCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGetActivatedTokensDetailCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetActivatedTokensDetailCommand.kt\ncom/bbva/ethermobilesdk/token/plugin/command/GetActivatedTokensDetailCommand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1549#2:59\n1620#2,3:60\n*S KotlinDebug\n*F\n+ 1 GetActivatedTokensDetailCommand.kt\ncom/bbva/ethermobilesdk/token/plugin/command/GetActivatedTokensDetailCommand\n*L\n48#1:59\n48#1:60,3\n*E\n"})
public final class GetActivatedTokensDetailCommand extends AbstractCommand implements CoroutineScope {

    @NotNull
    public static final String ACTIVATION_TIMESTAMP = "activationTimestamp";

    @NotNull
    public static final String ID = "getactivatedtokensdetail";

    @NotNull
    public static final String TOKEN_ID = "id";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30140p0;

    /* JADX INFO: compiled from: GetActivatedTokensDetailCommand.kt */
    public static final class a extends Lambda implements Function1<EtherToken, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f30142q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CommandCallback commandCallback) {
            super(1);
            this.f30142q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EtherToken etherToken) {
            EtherToken it = etherToken;
            Intrinsics.checkNotNullParameter(it, "it");
            GetActivatedTokensDetailCommand getActivatedTokensDetailCommand = GetActivatedTokensDetailCommand.this;
            BuildersKt__Builders_commonKt.launch$default(getActivatedTokensDetailCommand, null, null, new d(it, this.f30142q0, getActivatedTokensDetailCommand, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public GetActivatedTokensDetailCommand() {
        super(Void.class);
        this.f30140p0 = CoroutineScopeKt.MainScope();
    }

    public static final JSONArray access$toArray(GetActivatedTokensDetailCommand getActivatedTokensDetailCommand, List list) {
        getActivatedTokensDetailCommand.getClass();
        List<TokenDetail> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (TokenDetail tokenDetail : list2) {
            arrayList.add(q.mapOf(TuplesKt.to("id", tokenDetail.getId()), TuplesKt.to(ACTIVATION_TIMESTAMP, Long.valueOf(tokenDetail.getActivationTimestamp()))));
        }
        return new JSONArray((Collection) arrayList);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30140p0.getCoroutineContext();
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        InjectorKt.withClient(callback, new a(callback));
    }
}
