package androidx.collection;

import android.animation.ValueAnimator;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import androidx.transition.Transition;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.signature.EcdsaParameters;
import com.google.crypto.tink.signature.EcdsaPrivateKey;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Transition.g, Channel.BundleAdapter, Predicate, SQLiteEventStore.a, MultiViewUpdateListener.a, KeySerializer.KeySerializationFunction, CrashlyticsReportJsonTransform.a {
    public static String d(StringBuilder sb2, long j10, String str) {
        sb2.append(j10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder e(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static KotlinNothingValueException f() {
        SnapshotStateMapKt.unsupported();
        return new KotlinNothingValueException();
    }

    @Override // androidx.transition.Transition.g
    public void a(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionResume(transition);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) throws IOException {
        DataEncoder dataEncoder = CrashlyticsReportJsonTransform.f48234a;
        CrashlyticsReport.Session.Event.RolloutAssignment.Builder builder = CrashlyticsReport.Session.Event.RolloutAssignment.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    builder.setParameterKey(jsonReader.nextString());
                    break;
                case "templateVersion":
                    builder.setTemplateVersion(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builder2 = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("variantId")) {
                            builder2.setVariantId(jsonReader.nextString());
                        } else if (strNextName2.equals("rolloutId")) {
                            builder2.setRolloutId(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    builder.setRolloutVariant(builder2.build());
                    break;
                case "parameterValue":
                    builder.setParameterValue(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public void c(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        EcdsaPrivateKey ecdsaPrivateKey = (EcdsaPrivateKey) key;
        ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.signature.a.f47355a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", com.google.crypto.tink.proto.EcdsaPrivateKey.newBuilder().setPublicKey(com.google.crypto.tink.signature.a.c(ecdsaPrivateKey.getPublicKey())).setKeyValue(ByteString.copyFrom(BigIntegerEncoding.toBigEndianBytesOfFixedLength(ecdsaPrivateKey.getPrivateValue().getBigInteger(SecretKeyAccess.requireAccess(secretKeyAccess)), com.google.crypto.tink.signature.a.a(ecdsaPrivateKey.getParameters().getCurveType())))).build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, com.google.crypto.tink.signature.a.f(ecdsaPrivateKey.getParameters().getVariant()), ecdsaPrivateKey.getIdRequirementOrNull());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((FileInteraction) obj) instanceof FileInteraction.TermsAndConditions;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        Object objTryGetValue = BundleHelper.tryGetValue(bundle);
        Intrinsics.checkNotNull(objTryGetValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objTryGetValue;
    }
}
