package j4;

import android.os.Bundle;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.base.cells.constants.AuthTokenInterceptorsIds;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.view.LoginContract;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.ChaCha20Poly1305Parameters;
import com.google.crypto.tink.aead.d;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.prf.HkdfPrfKey;
import com.google.crypto.tink.prf.HkdfPrfParameters;
import com.google.crypto.tink.proto.ChaCha20Poly1305Key;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Reaction.ReactionExecution, Channel.BundleAdapter, Predicate, KeyParser.KeyParsingFunction, KeySerializer.KeySerializationFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f78767p0;

    public /* synthetic */ b(int i10) {
        this.f78767p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        switch (this.f78767p0) {
            case 0:
                ((WebController) obj).sendOnBack();
                break;
            case 1:
                BiometricLoginViewModel biometricLoginViewModel = (BiometricLoginViewModel) obj;
                BiometryAuthResult biometryAuthResult = (BiometryAuthResult) obj2;
                if (biometryAuthResult instanceof BiometryAuthResult.AuthError) {
                    biometricLoginViewModel.onBiometryAuthenticationError(((BiometryAuthResult.AuthError) biometryAuthResult).getEx());
                }
                break;
            default:
                LoginGlobalViewModel loginGlobalViewModel = (LoginGlobalViewModel) obj;
                Boolean bool = (Boolean) obj2;
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                if (bool != null) {
                    bool.booleanValue();
                    loginGlobalViewModel.setIntent(LoginContract.Intent.BiometricAuthenticationTaped.INSTANCE);
                }
                break;
        }
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<ChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = d.f46549a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            ChaCha20Poly1305Key from = ChaCha20Poly1305Key.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() == 0) {
                return com.google.crypto.tink.aead.ChaCha20Poly1305Key.create(d.b(protoKeySerialization.getOutputPrefixType()), SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess)), protoKeySerialization.getIdRequirementOrNull());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        HkdfPrfKey hkdfPrfKey = (HkdfPrfKey) key;
        ParametersSerializer<HkdfPrfParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.prf.a.f46848a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.HkdfPrfKey", com.google.crypto.tink.proto.HkdfPrfKey.newBuilder().setParams(com.google.crypto.tink.prf.a.a(hkdfPrfKey.getParameters())).setKeyValue(ByteString.copyFrom(hkdfPrfKey.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, OutputPrefixType.RAW, hkdfPrfKey.getIdRequirementOrNull());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((FileInteraction) obj) instanceof FileInteraction.TermsAndConditions;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        switch (this.f78767p0) {
            case 0:
                return new AccessToken(bundle.getString("token"), bundle.getString("type"), null, AuthTokenInterceptorsIds.GLOMO.toString());
            default:
                return bundle.getString("type");
        }
    }
}
