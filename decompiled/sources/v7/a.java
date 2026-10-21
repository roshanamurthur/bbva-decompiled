package v7;

import android.os.Build;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.ui.biometrics.BiometricResult;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannelsKt;
import com.bbva.glomoutils.Either;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.aead.c;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.AesGcmSivKey;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Predicate, Channel.ObjectAdapter, KeyParser.KeyParsingFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93981p0;

    public /* synthetic */ a(int i10) {
        this.f93981p0 = i10;
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<AesGcmSivParameters, ProtoParametersSerialization> parametersSerializer = c.f46544a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            AesGcmSivKey from = AesGcmSivKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.aead.AesGcmSivKey.builder().setParameters(AesGcmSivParameters.builder().setKeySizeBytes(from.getKeyValue().size()).setVariant(c.b(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f93981p0) {
            case 0:
                return Build.VERSION.SDK_INT >= 25;
            default:
                return Intrinsics.areEqual((BiometricResult) obj, BiometricResult.Success.INSTANCE);
        }
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public final Object transform(Object obj) {
        Either either = (Either) obj;
        Intrinsics.checkNotNull(either);
        return FileInteractionChannelsKt.access$toWebObject(either);
    }
}
