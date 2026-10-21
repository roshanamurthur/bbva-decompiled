package com.bbva.glomohybrid.welcome.presentation.reactions;

import android.app.Activity;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.reactor.GlobalReaction;
import com.bbva.component.ui.welcome.footer.ButtonConfig;
import com.bbva.component.ui.welcome.footer.WelcomeFooterViewModel;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.welcome.presentation.viewmodel.WelcomeGlobalViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WelcomeReaction.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/welcome/presentation/reactions/WelcomeReaction;", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "", "configure", "<init>", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWelcomeReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeReaction.kt\ncom/bbva/glomohybrid/welcome/presentation/reactions/WelcomeReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,66:1\n25#2,8:67\n*S KotlinDebug\n*F\n+ 1 WelcomeReaction.kt\ncom/bbva/glomohybrid/welcome/presentation/reactions/WelcomeReaction\n*L\n57#1:67,8\n*E\n"})
public final class WelcomeReaction extends BaseReaction {

    @NotNull
    public final Lazy H0 = LazyKt__LazyJVMKt.lazy(new b());

    @NotNull
    public final Lazy I0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: compiled from: WelcomeReaction.kt */
    public static final class a extends Lambda implements Function0<CountryWelcomeReaction> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CountryWelcomeReaction invoke() {
            WelcomeReaction welcomeReaction = WelcomeReaction.this;
            Activity activity = ((GlobalReaction) welcomeReaction).mActivity;
            Intrinsics.checkNotNullExpressionValue(activity, "access$getMActivity$p$s547295115(...)");
            return new CountryWelcomeReaction(welcomeReaction, activity);
        }
    }

    /* JADX INFO: compiled from: WelcomeReaction.kt */
    public static final class b extends Lambda implements Function0<CountryWelcomeErrorModals> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CountryWelcomeErrorModals invoke() {
            return new CountryWelcomeErrorModals(WelcomeReaction.this);
        }
    }

    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        addComponent(WelcomeModals.ID, WelcomeModals.INSTANCE);
        ((WelcomeModals) this.H0.getValue()).configure();
        ((CountryWelcomeReaction) this.I0.getValue()).configure();
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = whenever(WelcomeFooterViewModel.ID).doAction(WelcomeFooterViewModel.ACTION_TOP_BUTTON_CLICK).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside("welcome-view-model", WelcomeGlobalViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.welcome.presentation.reactions.WelcomeReaction$onWelcomeTopButtonClick$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, ButtonConfig buttonConfig) {
                Intrinsics.checkNotNull(p4);
                WelcomeGlobalViewModel welcomeGlobalViewModel = (WelcomeGlobalViewModel) p4;
                String route = buttonConfig.getRoute();
                if (route == null) {
                    route = "";
                }
                WelcomeGlobalViewModel.navigateTo$default(welcomeGlobalViewModel, route, null, false, 6, null);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = whenever("welcome-view-model");
        Router router = Router.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = plainActionBuilderWhenever.doAction(router.getACTION_NAVIGATE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        BaseReaction.openScreen$default((BaseReaction) this, reactionBuilderThen2, (Animation) Animation.Fade.INSTANCE, false, (Function2) ka.b.f79276p0, 2, (Object) null);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = whenever("welcome-view-model").doAction(router.getACTION_CLOSE_SCREEN()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        closeScreen(reactionBuilderThen3);
    }
}
