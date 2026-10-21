package fc;

import android.os.Bundle;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.smartassistance.flags.SmartAssistanceFlag;
import com.google.android.datatransport.Transformer;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.aead.c;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.mac.b;
import com.google.crypto.tink.proto.AesGcmSivKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Channel.BundleAdapter, ParametersParser.ParametersParsingFunction, KeySerializer.KeySerializationFunction, Transformer {
    @Override // com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.f48293c.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<AesGcmSivParameters, ProtoParametersSerialization> parametersSerializer = c.f46544a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            return AesGcmSivParameters.builder().setKeySizeBytes(AesGcmSivKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry()).getKeySize()).setVariant(c.b(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e5);
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        HmacKey hmacKey = (HmacKey) key;
        ParametersSerializer<HmacParameters, ProtoParametersSerialization> parametersSerializer = b.f46805a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.HmacKey", com.google.crypto.tink.proto.HmacKey.newBuilder().setParams(b.a(hmacKey.getParameters())).setKeyValue(ByteString.copyFrom(hmacKey.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, b.c(hmacKey.getParameters().getVariant()), hmacKey.getIdRequirementOrNull());
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        SmartAssistanceFlag smartAssistanceFlag = new SmartAssistanceFlag(false, false, 3, null);
        Intrinsics.checkNotNull(bundle);
        return smartAssistanceFlag.getFlags(bundle);
    }
}
