package androidx.databinding;

import android.os.Bundle;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.glomohybrid.base.file.channels.FileInteractionChannels;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmSivKey;
import com.google.crypto.tink.aead.AesGcmSivParameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.HmacParameters;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.mypinpad.tsdk.isolation.aql;
import com.mypinpad.tsdk.isolation.aqp;
import com.salesforce.marketingcloud.internal.m;
import java.lang.ref.ReferenceQueue;
import java.security.GeneralSecurityException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements b, Predicate, Channel.BundleAdapter, KeySerializer.KeySerializationFunction, KeyParser.KeyParsingFunction, Continuation {
    public static long b(long j10, int i10, int i11) {
        return IntOffsetKt.IntOffset(i11, IntOffset.m4508getYimpl(j10) + i10);
    }

    public static MeasurePolicy c(Alignment.Companion companion, boolean z10, Composer composer, int i10, int i11) {
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), z10, composer, i10);
        composer.startReplaceableGroup(i11);
        return measurePolicyRememberBoxMeasurePolicy;
    }

    public static WebChannel d(String str) {
        return new WebChannel.Builder(str).create();
    }

    public static aqp e(Object[] objArr, int i10, int i11, int i12, int[] iArr) {
        aql.setOnFocusChangeListener(objArr, i10, i11, i12);
        return new aqp(iArr);
    }

    public static Object f(CharSequence charSequence, int i10, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i10)));
    }

    public static String g(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(str);
        Intrinsics.checkNotNullExpressionValue(strOptString, str2);
        return m.b(strOptString);
    }

    @Override // androidx.databinding.b
    public h a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue referenceQueue) {
        ViewDataBindingKtx viewDataBindingKtx = ViewDataBindingKtx.INSTANCE;
        Intrinsics.checkNotNull(referenceQueue);
        return new ViewDataBindingKtx.StateFlowListener(viewDataBinding, i10, referenceQueue).getListener();
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<HmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.b.f46805a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            HmacKey from = HmacKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.mac.HmacKey.builder().setParameters(HmacParameters.builder().setKeySizeBytes(from.getKeyValue().size()).setTagSizeBytes(from.getParams().getTagSize()).setHashType(com.google.crypto.tink.mac.b.b(from.getParams().getHash())).setVariant(com.google.crypto.tink.mac.b.d(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        AesGcmSivKey aesGcmSivKey = (AesGcmSivKey) key;
        ParametersSerializer<AesGcmSivParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.c.f46544a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.crypto.tink.proto.AesGcmSivKey.newBuilder().setKeyValue(ByteString.copyFrom(aesGcmSivKey.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.aead.c.a(aesGcmSivKey.getParameters().getVariant()), aesGcmSivKey.getIdRequirementOrNull());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometryAuthResult) obj) instanceof BiometryAuthResult.Success;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return task.isSuccessful() ? Tasks.forResult(DefaultAppCheckTokenResult.constructFromAppCheckToken((AppCheckToken) task.getResult())) : Tasks.forResult(DefaultAppCheckTokenResult.constructFromError(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        FileInteractionChannels fileInteractionChannels = FileInteractionChannels.INSTANCE;
        Intrinsics.checkNotNull(bundle);
        return FileInteractionChannels.access$convertToOperation(fileInteractionChannels, bundle);
    }
}
