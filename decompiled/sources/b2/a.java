package b2;

import android.app.Activity;
import android.os.Bundle;
import android.util.JsonReader;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.bridge.extensions.NativeLinkExtensionsKt;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.EcdsaPrivateKey;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.signature.EcdsaParameters;
import com.google.crypto.tink.util.SecretBigInteger;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate, Channel.BundleAdapter, Reaction.NavigationExecution, KeyParser.KeyParsingFunction, ComponentRegistrarProcessor, CrashlyticsReportJsonTransform.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f24770p0;

    public /* synthetic */ a(int i10) {
        this.f24770p0 = i10;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public final Object b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.b(jsonReader);
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        CellsMessage cellsMessage = (CellsMessage) obj2;
        Intrinsics.checkNotNull(cellsMessage);
        ((Dispatcher) obj).dispatch(activity, NativeLinkExtensionsKt.setPopAndPushOperationWhenNativeLogin(cellsMessage));
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.signature.a.f47355a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + protoKeySerialization.getTypeUrl());
        }
        try {
            EcdsaPrivateKey from = EcdsaPrivateKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            EcdsaPublicKey publicKey = from.getPublicKey();
            return com.google.crypto.tink.signature.EcdsaPrivateKey.builder().setPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey.builder().setParameters(EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.a.e(publicKey.getParams().getHashType())).setSignatureEncoding(com.google.crypto.tink.signature.a.g(publicKey.getParams().getEncoding())).setCurveType(com.google.crypto.tink.signature.a.d(publicKey.getParams().getCurve())).setVariant(com.google.crypto.tink.signature.a.h(protoKeySerialization.getOutputPrefixType())).build()).setPublicPoint(new ECPoint(BigIntegerEncoding.fromUnsignedBigEndianBytes(publicKey.getX().toByteArray()), BigIntegerEncoding.fromUnsignedBigEndianBytes(publicKey.getY().toByteArray()))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build()).setPrivateValue(SecretBigInteger.fromBigInteger(BigIntegerEncoding.fromUnsignedBigEndianBytes(from.getKeyValue().toByteArray()), SecretKeyAccess.requireAccess(secretKeyAccess))).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public final List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f24770p0) {
            case 1:
                return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.FriendlyFraud;
            default:
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                return Intrinsics.areEqual(((CellsMessage) obj).operation(), NavigationOperations.UPDATE);
        }
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        return Integer.valueOf((int) bundle.getDouble("points", 0.0d));
    }
}
