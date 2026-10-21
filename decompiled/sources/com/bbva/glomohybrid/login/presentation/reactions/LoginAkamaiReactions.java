package com.bbva.glomohybrid.login.presentation.reactions;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.bbva.akamaibase.AkamaiReactions;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginAkamaiReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/LoginAkamaiReactions;", "Lcom/bbva/akamaibase/AkamaiReactions;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "pageReaction", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginAkamaiReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginAkamaiReactions.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginAkamaiReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,31:1\n25#2,8:32\n*S KotlinDebug\n*F\n+ 1 LoginAkamaiReactions.kt\ncom/bbva/glomohybrid/login/presentation/reactions/LoginAkamaiReactions\n*L\n27#1:32,8\n*E\n"})
public final class LoginAkamaiReactions extends AkamaiReactions {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f33487r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginAkamaiReactions(@NotNull BaseReaction pageReaction, @NotNull Activity activity) {
        super(pageReaction, activity);
        Intrinsics.checkNotNullParameter(pageReaction, "pageReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f33487r0 = pageReaction;
    }

    @Override // com.bbva.akamaibase.AkamaiReactions, com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        super.configure();
        CellsChannels cellsChannels = CellsChannels.INSTANCE;
        Channel<Object> showGenericErrorChannel = cellsChannels.getShowGenericErrorChannel();
        BaseReaction baseReaction = this.f33487r0;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(showGenericErrorChannel).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen.inside(LoginModals.ID, LoginModals.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.LoginAkamaiReactions$showGenericError$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                Activity activity = this.f33488p0.getCom.bbva.ethermobilesdk.geolocation.utils.ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID java.lang.String();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ((LoginModals) p4).showGenericError((FragmentActivity) activity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd, cellsChannels.getShowGenericErrorChannel());
    }
}
