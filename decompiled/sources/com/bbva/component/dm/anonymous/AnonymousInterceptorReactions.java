package com.bbva.component.dm.anonymous;

import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.component.dm.headers.interceptor.HeadersInterceptorDataManager;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u4.c;
import u4.d;
import u4.e;
import u4.f;

/* JADX INFO: compiled from: AnonymousInterceptorReactions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/anonymous/AnonymousInterceptorReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "component-dm-anonymous_release"}, k = 1, mv = {1, 9, 0})
public final class AnonymousInterceptorReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f27425p0;

    public AnonymousInterceptorReactions(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f27425p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        BaseReaction baseReaction = this.f27425p0;
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = baseReaction.whenever(AnonymousInterceptorDataManager.ID);
        AnonymousInterceptorDataManager.Companion companion = AnonymousInterceptorDataManager.INSTANCE;
        int i10 = 0;
        plainActionBuilderWhenever.doAction(companion.getACTION_ANONYMOUS_REQUIRED()).then().inside(LoginDataManager.ID, LoginDataManager.class).doReactionAndCleanChannel(new c(i10));
        baseReaction.whenever(LoginDataManager.ID).doAction(LoginDataManager.ACTION_ANONYMOUS_LOGIN_ERROR).then().inside(AnonymousInterceptorDataManager.ID, AnonymousInterceptorDataManager.class).doReactionAndCleanChannel(new d(i10));
        baseReaction.whenever(HeadersInterceptorDataManager.ID).doAction(HeadersInterceptorDataManager.ACCESS_TOKEN_CHANGE).then().inside(AnonymousInterceptorDataManager.ID, AnonymousInterceptorDataManager.class).doReactionAndCleanChannel(new e(i10));
        baseReaction.whenever(AnonymousInterceptorDataManager.ID).doAction(companion.getACTION_CLEAR_TOKEN()).then().inside(HeadersInterceptorDataManager.ID, HeadersInterceptorDataManager.class).doReactionAndCleanChannel(new f(i10));
    }
}
