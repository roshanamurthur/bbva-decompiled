package z0;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.transition.Transition;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.glomohybrid.base.shortcuts.ShortcutActions;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.EcdsaKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.signature.EcdsaParameters;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DoubleFunction, Transition.g, Predicate, Channel.BundleAdapter, MultiViewUpdateListener.a, ParametersParser.ParametersParsingFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94922p0;

    public /* synthetic */ b(int i10) {
        this.f94922p0 = i10;
    }

    @Override // androidx.transition.Transition.g
    public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionEnd(transition, z10);
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public final void c(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return ColorSpaceKt.absResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.signature.a.f47355a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            EcdsaKeyFormat from = EcdsaKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            return EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.a.e(from.getParams().getHashType())).setSignatureEncoding(com.google.crypto.tink.signature.a.g(from.getParams().getEncoding())).setCurveType(com.google.crypto.tink.signature.a.d(from.getParams().getCurve())).setVariant(com.google.crypto.tink.signature.a.h(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e5);
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f94922p0) {
            case 2:
                return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.Fatal;
            default:
                ShortcutActions shortcutActions = (ShortcutActions) obj;
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                return shortcutActions == ShortcutActions.ATMLOCATOR;
        }
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        return bundle.getString("transaction");
    }
}
