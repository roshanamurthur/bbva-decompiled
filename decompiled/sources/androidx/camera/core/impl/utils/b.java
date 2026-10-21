package androidx.camera.core.impl.utils;

import android.database.Cursor;
import android.os.Bundle;
import android.util.JsonReader;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.proto.AesCmacKeyFormat;
import com.google.crypto.tink.proto.AesEaxKey;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DoubleFunction, Interpolator, Predicate, Channel.BundleAdapter, SQLiteEventStore.a, KeyParser.KeyParsingFunction, ParametersParser.ParametersParsingFunction, CrashlyticsReportJsonTransform.a {
    public static String a(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String c(ASN1TaggedObject aSN1TaggedObject, StringBuilder sb2) {
        sb2.append(aSN1TaggedObject.getTagNo());
        return sb2.toString();
    }

    public static StringBuilder d(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(charSequence2, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence3);
        return sb2;
    }

    public static ArrayList e(int i10, HashMap map, ArrayList arrayList, int i11, String str) {
        map.put(Integer.valueOf(i10), arrayList);
        ArrayList arrayList2 = new ArrayList(i11);
        arrayList2.add(str);
        return arrayList2;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.a(jsonReader);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("overshoot").get(f6);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d2) {
        Rgb.Companion companion = Rgb.INSTANCE;
        return d2;
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<AesEaxParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.a.f46534a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            AesEaxKey from = AesEaxKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.aead.AesEaxKey.builder().setParameters(AesEaxParameters.builder().setKeySizeBytes(from.getKeyValue().size()).setIvSizeBytes(from.getParams().getIvSize()).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.a.c(protoKeySerialization.getOutputPrefixType())).build()).setKeyBytes(SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<AesCmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.a.f46800a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            AesCmacKeyFormat from = AesCmacKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry());
            return AesCmacParameters.builder().setKeySizeBytes(from.getKeySize()).setTagSizeBytes(from.getParams().getTagSize()).setVariant(com.google.crypto.tink.mac.a.b(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e5);
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.BlockedPassword;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        return bundle.getString("spanId");
    }
}
