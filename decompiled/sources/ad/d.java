package ad;

import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import bk.q;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.AesCmacKey;
import com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Interpolator, Predicate, Channel.BundleAdapter, RetryStrategy, ParametersParser.ParametersParsingFunction, PrimitiveConstructor.PrimitiveConstructionFunction, CrashlyticsReportJsonTransform.a {
    public static int a(Attributes attributes, int i10) {
        return com.caverock.androidsvg.c.g.a(attributes.getLocalName(i10)).ordinal();
    }

    public static PathBuilder c(float f6, float f10) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f6, f10);
        return pathBuilder;
    }

    public static String d(int i10, String str, int i11, String str2, int i12) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
        return sb2.toString();
    }

    public static String e(String str, char c10, String str2) {
        return str + c10 + str2;
    }

    public static String f(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) throws IOException {
        DataEncoder dataEncoder = CrashlyticsReportJsonTransform.f48234a;
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                case "size":
                    builder.setSize(jsonReader.nextLong());
                    break;
                case "uuid":
                    builder.setUuidFromUtf8Bytes(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    builder.setBaseAddress(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public Object constructPrimitive(Key key) {
        return new ChunkedAesCmacImpl((AesCmacKey) key);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("linear").get(f6);
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<AesEaxParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.a.f46534a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            AesEaxKeyFormat from = AesEaxKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            return AesEaxParameters.builder().setKeySizeBytes(from.getKeySize()).setIvSizeBytes(from.getParams().getIvSize()).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.a.c(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e5);
        }
    }

    @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
    public Object shouldRetry(Object obj, Object obj2) {
        sd.a.C0490a c0490a = (sd.a.C0490a) obj;
        sd.a.b bVar = (sd.a.b) obj2;
        URL url = bVar.f93173b;
        if (url == null) {
            return null;
        }
        Logging.d("CctTransportBackend", "Following redirect to: %s", url);
        return new sd.a.C0490a(bVar.f93173b, c0490a.f93170b, c0490a.f93171c);
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.InactiveAccount;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : setKeySet) {
            Intrinsics.checkNotNull(str);
            Object obj = bundle.get(str);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put(str, (String) obj);
        }
        return q.toMap(linkedHashMap);
    }
}
