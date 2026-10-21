package androidx.camera.core;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.arch.core.util.Function;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import com.bbva.cells.component.kit.tracking.TrackingEvent;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.channels.HearingDisabilitiesChannels;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesEaxKey;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesCmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import java.util.List;
import kotlin.TuplesKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements Function, Interpolator, Reaction.TracerMessageMapper, Channel.ObjectAdapter, Channel.BundleAdapter, SQLiteEventStore.a, KeySerializer.KeySerializationFunction, ParametersSerializer.ParametersSerializationFunction, CrashlyticsReportJsonTransform.a {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2170p0;

    public /* synthetic */ m0(int i10) {
        this.f2170p0 = i10;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f2170p0) {
            case 0:
                return ImageCapture.lambda$submitStillCaptureRequest$12((List) obj);
            default:
                Encoding encoding = SQLiteEventStore.f43867u0;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public final Object b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.a(jsonReader);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("anticipate").get(f6);
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.TracerMessageMapper
    public final TrackingEvent map(String str, Object obj) {
        return new TrackingEvent(str);
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        AesEaxKey aesEaxKey = (AesEaxKey) key;
        ParametersSerializer<AesEaxParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.a.f46534a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.crypto.tink.proto.AesEaxKey.newBuilder().setParams(com.google.crypto.tink.aead.a.a(aesEaxKey.getParameters())).setKeyValue(ByteString.copyFrom(aesEaxKey.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.aead.a.b(aesEaxKey.getParameters().getVariant()), aesEaxKey.getIdRequirementOrNull());
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        AesCmacParameters aesCmacParameters = (AesCmacParameters) parameters;
        ParametersSerializer<AesCmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.a.f46800a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.AesCmacKey").setValue(AesCmacKeyFormat.newBuilder().setParams(AesCmacParams.newBuilder().setTagSize(aesCmacParameters.getCryptographicTagSizeBytes()).build()).setKeySize(aesCmacParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.mac.a.a(aesCmacParameters.getVariant())).build());
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        return HearingDisabilitiesChannels.userInfoDisabilityVideocall$lambda$0(bundle);
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public final Object transform(Object obj) {
        return bk.p.mapOf(TuplesKt.to("value", (Boolean) obj));
    }
}
