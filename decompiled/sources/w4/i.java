package w4;

import android.os.Bundle;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.glomohybrid.login.extensions.BundleExtensionKt;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.proto.AesGcmSivKeyFormat;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Predicate, Channel.BundleAdapter, SQLiteEventStore.a, ParametersSerializer.ParametersSerializationFunction, ParametersParser.ParametersParsingFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94144p0;

    public /* synthetic */ i(int i10) {
        this.f94144p0 = i10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        Encoding encoding = SQLiteEventStore.f43867u0;
        throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public final Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<HmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.b.f46805a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            HmacKeyFormat from = HmacKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() == 0) {
                return HmacParameters.builder().setKeySizeBytes(from.getKeySize()).setTagSizeBytes(from.getParams().getTagSize()).setHashType(com.google.crypto.tink.mac.b.b(from.getParams().getHash())).setVariant(com.google.crypto.tink.mac.b.d(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + from.getVersion());
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e5);
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        AesGcmSivParameters aesGcmSivParameters = (AesGcmSivParameters) parameters;
        ParametersSerializer<AesGcmSivParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.c.f46544a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.AesGcmSivKey").setValue(AesGcmSivKeyFormat.newBuilder().setKeySize(aesGcmSivParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.aead.c.a(aesGcmSivParameters.getVariant())).build());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        return ((BiometryAuthResult) obj) instanceof BiometryAuthResult.Success;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        switch (this.f94144p0) {
            case 1:
                Intrinsics.checkNotNull(bundle);
                return BundleExtensionKt.toMagicLogData(bundle);
            default:
                return bundle.getString("value");
        }
    }
}
