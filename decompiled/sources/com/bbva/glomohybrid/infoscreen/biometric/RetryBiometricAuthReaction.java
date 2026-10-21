package com.bbva.glomohybrid.infoscreen.biometric;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.glomohybrid.base.cells.DeepLinkScreenComponentReaction;
import com.bbva.glomohybrid.base.cells.channels.BiometricAuthenticationChannels;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x8.c;

/* JADX INFO: compiled from: RetryBiometricAuthReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/biometric/RetryBiometricAuthReaction;", "Lcom/bbva/glomohybrid/base/cells/DeepLinkScreenComponentReaction;", "", "configure", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRetryBiometricAuthReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryBiometricAuthReaction.kt\ncom/bbva/glomohybrid/infoscreen/biometric/RetryBiometricAuthReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,41:1\n25#2,8:42\n*S KotlinDebug\n*F\n+ 1 RetryBiometricAuthReaction.kt\ncom/bbva/glomohybrid/infoscreen/biometric/RetryBiometricAuthReaction\n*L\n37#1:42,8\n*E\n"})
public final class RetryBiometricAuthReaction extends DeepLinkScreenComponentReaction {
    @Override // com.bbva.glomohybrid.base.cells.BaseReaction, com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        super.configure();
        addPageComponent(new InfoScreenComponent(null, 1, null));
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = whenever("biometry-error-retry");
        ActionSpec<Boolean> actionSpec = RetryBiometricAuthActivity.ACTION_RETRY_AUTH;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = plainActionBuilderWhenever.doAction(actionSpec).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside("biometry-error-retry", RetryBiometricAuthActivity.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.infoscreen.biometric.RetryBiometricAuthReaction$closeActivity$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((RetryBiometricAuthActivity) p4).finish();
            }
        }), "doReaction(...)");
        writeOn(BiometricAuthenticationChannels.INSTANCE.getRetryAuthChannel()).when("biometry-error-retry").doAction(actionSpec);
        whenever("biometry-error-retry").doAction(RetryBiometricAuthActivity.INSTANCE.getACTION_SCREEN_START()).then().inside(AnalyticsManager.ID, AnalyticsManager.class).doReaction(new c(0));
    }
}
