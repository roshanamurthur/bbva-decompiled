package ad;

import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.component.EmptyMessage;
import com.bbva.cellscore.pubsub.PubSubMessage;
import com.bbva.glomohybrid.base.cells.channels.SigningChannels;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import io.reactivex.functions.Predicate;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.xmss.DefaultXMSSMTOid;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements Interpolator, Predicate, Channel.ObjectAdapter, TransportScheduleCallback, ParametersSerializer.ParametersSerializationFunction, KeySerializer.KeySerializationFunction, Continuation {
    public static int a(int i10, int i11, int i12) {
        return zzje.zzA(i10) + i11 + i12;
    }

    public static int b(TextStyle textStyle, int i10, int i11) {
        return (textStyle.hashCode() + i10) * i11;
    }

    public static PathBuilder c(float f6, float f10, float f11, float f12) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f6, f10);
        pathBuilder.lineToRelative(f11, f12);
        return pathBuilder;
    }

    public static String d(String str, IOException iOException) {
        return str + iOException;
    }

    public static void e(int i10, String str, HashMap map, String str2) {
        map.put(str2, new DefaultXMSSMTOid(i10, str));
    }

    public static void f(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static void g(Throwable th2, StringBuilder sb2, String str, boolean z10) {
        sb2.append(th2.getMessage());
        com.huawei.secure.android.common.activity.a.a(str, sb2.toString(), z10);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f6);
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        AesCmacKey aesCmacKey = (AesCmacKey) key;
        ParametersSerializer<AesCmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.a.f46800a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.crypto.tink.proto.AesCmacKey.newBuilder().setParams(AesCmacParams.newBuilder().setTagSize(aesCmacKey.getParameters().getCryptographicTagSizeBytes()).build()).setKeyValue(ByteString.copyFrom(aesCmacKey.getAesKey().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.mac.a.a(aesCmacKey.getParameters().getVariant()), aesCmacKey.getIdRequirementOrNull());
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public Serialization serializeParameters(Parameters parameters) throws GeneralSecurityException {
        AesGcmParameters aesGcmParameters = (AesGcmParameters) parameters;
        com.google.crypto.tink.aead.b.c(aesGcmParameters);
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.AesGcmKey").setValue(AesGcmKeyFormat.newBuilder().setKeySize(aesGcmParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.aead.b.a(aesGcmParameters.getVariant())).build());
    }

    @Override // io.reactivex.functions.Predicate
    public boolean test(Object obj) {
        return !(((PubSubMessage) obj) instanceof EmptyMessage);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Object obj = FcmBroadcastProcessor.f48542c;
        return 403;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public Object transform(Object obj) {
        Map map = (Map) obj;
        SigningChannels signingChannels = SigningChannels.INSTANCE;
        Intrinsics.checkNotNull(map);
        Map mapAccess$filterOtpChallengeHeaders = SigningChannels.access$filterOtpChallengeHeaders(signingChannels, map);
        if (mapAccess$filterOtpChallengeHeaders.isEmpty()) {
            return null;
        }
        return mapAccess$filterOtpChallengeHeaders;
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(Exception exc) {
    }
}
