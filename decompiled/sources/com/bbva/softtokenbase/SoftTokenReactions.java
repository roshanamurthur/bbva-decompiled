package com.bbva.softtokenbase;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.ui.biometrics.BiometricResult;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.softtokenbase.constants.SoftTokenActionConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import v7.a;

/* JADX INFO: compiled from: SoftTokenReactions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J(\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0005*\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007H$J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/bbva/softtokenbase/SoftTokenReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "Lorg/koin/core/component/KoinComponent;", "", "configure", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$ReactionBuilder;", "Lcom/bbva/glomohybrid/base/cells/Reaction;", "Lcom/bbva/cellscore/channel/builder/refactor/ReactorCoreBuilder$AndReactionBuilder;", "onAuthenticated", "Lcom/bbva/component/ui/biometrics/BiometricResult;", "biometricResult", "", "userHasNoFingerprintOrNotPresent", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "p0", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "getBaseReaction", "()Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Landroid/app/Activity;", "q0", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "r0", "Ljava/lang/String;", "getComponentId", "()Ljava/lang/String;", "componentId", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;Ljava/lang/String;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSoftTokenReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoftTokenReactions.kt\ncom/bbva/softtokenbase/SoftTokenReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n25#2,8:60\n1#3:68\n*S KotlinDebug\n*F\n+ 1 SoftTokenReactions.kt\ncom/bbva/softtokenbase/SoftTokenReactions\n*L\n43#1:60,8\n*E\n"})
public abstract class SoftTokenReactions implements PageReactionDelegator, KoinComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BaseReaction baseReaction;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String componentId;

    public SoftTokenReactions(@NotNull BaseReaction baseReaction, @NotNull Activity activity, @NotNull String componentId) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.baseReaction = baseReaction;
        this.activity = activity;
        this.componentId = componentId;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        BaseReaction baseReaction = this.baseReaction;
        String str = this.componentId;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.whenever(str).doAction(SoftTokenActionConstants.INSTANCE.getAUTHENTICATE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside(str, BiometricsComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.softtokenbase.SoftTokenReactions$initAuthentication$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                Activity activity = this.f36855p0.getActivity();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                ((BiometricsComponent) p4).authenticate((FragmentActivity) activity);
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = baseReaction.whenever(str);
        BiometricsComponent.Companion companion = BiometricsComponent.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf = plainActionBuilderWhenever.doAction(companion.getON_AUTHENTICATION()).then().onlyIf(new a(2));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf, "onlyIf(...)");
        onAuthenticated(reactionBuilderOnlyIf);
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf2 = baseReaction.whenever(str).doAction(companion.getON_AUTHENTICATION()).then().onlyIf(new hc.a(this));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf2, "onlyIf(...)");
        onAuthenticated(reactionBuilderOnlyIf2);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final BaseReaction getBaseReaction() {
        return this.baseReaction;
    }

    @NotNull
    public final String getComponentId() {
        return this.componentId;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public abstract <T> ReactorCoreBuilder.AndReactionBuilder<T> onAuthenticated(@NotNull ReactorCoreBuilder.ReactionBuilder<T> reactionBuilder);

    public final boolean userHasNoFingerprintOrNotPresent(@NotNull BiometricResult biometricResult) {
        Intrinsics.checkNotNullParameter(biometricResult, "biometricResult");
        if ((biometricResult instanceof BiometricResult.Error ? this : null) == null) {
            return false;
        }
        int code = ((BiometricResult.Error) biometricResult).getCode();
        return code == 1 || code == 11;
    }
}
