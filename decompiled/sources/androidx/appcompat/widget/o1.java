package androidx.appcompat.widget;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.cellscore.channel.model.Channel;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdi;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.HmacKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import com.noknok.android.client.asm.core.uaf.AntiHammering;
import com.noknok.android.client.asm.sdk.IMatcher;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements Channel.ObjectAdapter, KeyParser.KeyParsingFunction, ParametersSerializer.ParametersSerializationFunction, IMatcher.ITimeProvider {
    public static int a(int i10, int i11, int i12) {
        return zzdi.zzD(i10) + i11 + i12;
    }

    public static String b(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.v());
        return sb2.toString();
    }

    public static StringBuilder c(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static List d(PathBuilder pathBuilder, float f6, float f10, float f11, float f12) {
        pathBuilder.reflectiveCurveToRelative(f6, f10, f11, f12);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KoinDefinition e(Module module, SingleInstanceFactory singleInstanceFactory, Function1 function1) {
        return OptionDSLKt.onOptions(new KoinDefinition(module, singleInstanceFactory), function1);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher.ITimeProvider
    public long getCurrentTime() {
        return AntiHammering.b();
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<AesGcmParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.b.f46539a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            AesGcmKey from = AesGcmKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.aead.AesGcmKey.builder().setParameters(AesGcmParameters.builder().setKeySizeBytes(from.getKeyValue().size()).setIvSizeBytes(12).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.b.b(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public Serialization serializeParameters(Parameters parameters) {
        HmacParameters hmacParameters = (HmacParameters) parameters;
        ParametersSerializer<HmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.b.f46805a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.HmacKey").setValue(HmacKeyFormat.newBuilder().setParams(com.google.crypto.tink.mac.b.a(hmacParameters)).setKeySize(hmacParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.mac.b.c(hmacParameters.getVariant())).build());
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public Object transform(Object obj) {
        return bk.p.mapOf(TuplesKt.to("whatsNew", (Boolean) obj));
    }
}
