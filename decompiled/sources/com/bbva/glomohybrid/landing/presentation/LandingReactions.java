package com.bbva.glomohybrid.landing.presentation;

import bk.d;
import com.bbva.component.dm.anonymous.AnonymousInterceptorReactions;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.SnackbarChannels;
import com.bbva.glomohybrid.base.extensions.PageDelegatorExtensionsKt;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingReactions;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingReactions extends BaseReaction {

    @NotNull
    public final Lazy H0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: compiled from: LandingReactions.kt */
    public static final class a extends Lambda implements Function0<List<? extends AnonymousInterceptorReactions>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends AnonymousInterceptorReactions> invoke() {
            return d.listOf(new AnonymousInterceptorReactions(LandingReactions.this));
        }
    }

    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        reactTo(SnackbarChannels.INSTANCE.getSnackbarChannel()).then().inside(LandingViewModel.ID, LandingViewModel.class).doReactionAndCleanChannel(new bc.org.bouncycastle.math.ec.a());
        reactTo(CellsChannels.INSTANCE.getInactiveChannel()).then().inside(LandingViewModel.ID, LandingViewModel.class).doReactionAndCleanChannel(new ai.a());
        PageDelegatorExtensionsKt.configureAll((List) this.H0.getValue());
    }
}
