package i8;

import androidx.core.splashscreen.SplashScreen;
import bk.q;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.base.cells.components.ZipActionsComponent;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannelsKt;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomoutils.Either;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.ChaCha20Poly1305Key;
import com.google.crypto.tink.aead.ChaCha20Poly1305Parameters;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.prf.HkdfPrfParameters;
import com.google.crypto.tink.proto.HkdfPrfKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements Reaction.ReactionExecution, SplashScreen.KeepOnScreenCondition, Predicate, Channel.ObjectAdapter, KeySerializer.KeySerializationFunction, ParametersParser.ParametersParsingFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69521p0;

    public /* synthetic */ d(int i10) {
        this.f69521p0 = i10;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        switch (this.f69521p0) {
            case 0:
                ((WebController) obj).sendOnBack();
                break;
            default:
                ZipActionsComponent zipActionsComponent = (ZipActionsComponent) obj;
                LoginReaction.Companion companion = LoginReaction.INSTANCE;
                Intrinsics.checkNotNull(zipActionsComponent);
                ZipActionsComponent.onActionPerformed$default(zipActionsComponent, ActionConstants.INSTANCE.getACTION_WEB_READY(), null, 2, null);
                break;
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<HkdfPrfParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.prf.a.f46848a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.HkdfPrfKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            HkdfPrfKeyFormat from = HkdfPrfKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() == 0) {
                if (protoParametersSerialization.getKeyTemplate().getOutputPrefixType() == OutputPrefixType.RAW) {
                    return HkdfPrfParameters.builder().setKeySizeBytes(from.getKeySize()).setHashType(com.google.crypto.tink.prf.a.b(from.getParams().getHash())).setSalt(Bytes.copyFrom(from.getParams().getSalt().toByteArray())).build();
                }
                throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: only RAW output prefix type is accepted");
            }
            throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: unknown Version " + from.getVersion());
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing HkdfPrfParameters failed: ", e5);
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        ChaCha20Poly1305Key chaCha20Poly1305Key = (ChaCha20Poly1305Key) key;
        ParametersSerializer<ChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.d.f46549a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.crypto.tink.proto.ChaCha20Poly1305Key.newBuilder().setKeyValue(ByteString.copyFrom(chaCha20Poly1305Key.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.aead.d.a(chaCha20Poly1305Key.getParameters().getVariant()), chaCha20Poly1305Key.getIdRequirementOrNull());
    }

    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        return false;
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.Retry;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public Object transform(Object obj) {
        switch (this.f69521p0) {
            case 2:
                AccessToken accessToken = (AccessToken) obj;
                return q.mapOf(TuplesKt.to("token", accessToken.getToken()), TuplesKt.to("type", accessToken.getType()));
            default:
                Either either = (Either) obj;
                Intrinsics.checkNotNull(either);
                return FileInteractionChannelsKt.access$toWebObject(either);
        }
    }
}
