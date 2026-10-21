package w4;

import android.database.Cursor;
import android.os.Bundle;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.cellsweb.presentation.channels.UserTypeChannels;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.prf.HkdfPrfParameters;
import com.google.crypto.tink.proto.HkdfPrfKey;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.XChaCha20Poly1305KeyFormat;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Predicate, Channel.SaveExecutor, Channel.BundleAdapter, SQLiteEventStore.a, ParametersSerializer.ParametersSerializationFunction, KeyParser.KeyParsingFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94145p0;

    public /* synthetic */ j(int i10) {
        this.f94145p0 = i10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }

    @Override // com.bbva.cellscore.channel.model.Channel.SaveExecutor
    public final void onSave(Bundle bundle, Object obj) {
        bundle.putParcelable(UserTypeChannels.GLOBAL_AUTH_GLOMO, (AccessToken) obj);
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<HkdfPrfParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.prf.a.f46848a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.HkdfPrfKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HkdfPrfProtoSerialization.parseKey");
        }
        try {
            HkdfPrfKey from = HkdfPrfKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (protoKeySerialization.getIdRequirementOrNull() != null) {
                throw new GeneralSecurityException("ID requirement must be null.");
            }
            return com.google.crypto.tink.prf.HkdfPrfKey.builder().setParameters(HkdfPrfParameters.builder().setKeySizeBytes(from.getKeyValue().size()).setHashType(com.google.crypto.tink.prf.a.b(from.getParams().getHash())).setSalt(Bytes.copyFrom(from.getParams().getSalt().toByteArray())).build()).setKeyBytes(SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HkdfPrfKey failed");
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        ParametersSerializer<XChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.e.f46554a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").setValue(XChaCha20Poly1305KeyFormat.getDefaultInstance().toByteString()).setOutputPrefixType(com.google.crypto.tink.aead.e.a(((XChaCha20Poly1305Parameters) parameters).getVariant())).build());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f94145p0) {
            case 0:
                return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.UserLockOut;
            default:
                return ((FileInteraction) obj) instanceof FileInteraction.Receipt;
        }
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        return bundle.getString("selected");
    }
}
