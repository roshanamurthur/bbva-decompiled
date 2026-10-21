package com.bbva.component.dm.biometriclogin.presentation.reactions;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w4.a;
import w4.b;

/* JADX INFO: compiled from: BiometricLoginAnalyticsReactions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/reactions/BiometricLoginAnalyticsReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "Companion", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class BiometricLoginAnalyticsReactions implements PageReactionDelegator {

    @NotNull
    public static final String BIOMETRIC_TYPE = "biometricType";

    @NotNull
    public static final String BIOMETRIC_TYPE_VALUE = "biometric";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f27500p0;

    /* JADX INFO: compiled from: BiometricLoginAnalyticsReactions.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/reactions/BiometricLoginAnalyticsReactions$Companion;", "", "()V", "BIOMETRIC_TYPE", "", "BIOMETRIC_TYPE_VALUE", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BiometricLoginAnalyticsReactions(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f27500p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        BaseReaction baseReaction = this.f27500p0;
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = baseReaction.whenever(BiometricAuthenticationDataManager.ID);
        ActionSpec<BiometryAuthResult> actionSpec = BiometricAuthenticationDataManager.ACTION_BIOMETRICS_AUTHENTICATE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf = plainActionBuilderWhenever.doAction(actionSpec).then().onlyIf(new a(0));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf, "onlyIf(...)");
        final AnalyticsEvent analyticsEvent = AnalyticsEvent.LOGIN_BIOMETRIC_SUCCESS;
        reactionBuilderOnlyIf.inside(AnalyticsManager.ID, AnalyticsManager.class).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.c
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                BiometricLoginAnalyticsReactions.Companion companion = BiometricLoginAnalyticsReactions.INSTANCE;
                AnalyticsEvent event = analyticsEvent;
                Intrinsics.checkNotNullParameter(event, "$event");
                event.putData(BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE_VALUE);
                ((AnalyticsManager) obj).trackEvent(event);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf2 = baseReaction.whenever(BiometricAuthenticationDataManager.ID).doAction(actionSpec).then().onlyIf(new b(0));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf2, "onlyIf(...)");
        final AnalyticsEvent analyticsEvent2 = AnalyticsEvent.LOGIN_BIOMETRIC_ERROR;
        reactionBuilderOnlyIf2.inside(AnalyticsManager.ID, AnalyticsManager.class).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.c
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                BiometricLoginAnalyticsReactions.Companion companion = BiometricLoginAnalyticsReactions.INSTANCE;
                AnalyticsEvent event = analyticsEvent2;
                Intrinsics.checkNotNullParameter(event, "$event");
                event.putData(BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE_VALUE);
                ((AnalyticsManager) obj).trackEvent(event);
            }
        });
    }
}
