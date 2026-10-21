package androidx.emoji2.text.flatbuffer;

import android.os.Bundle;
import com.bbva.cellscore.channel.model.Channel;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmKey;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.HmacKey;
import com.google.crypto.tink.mac.internal.ChunkedHmacImpl;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.mypinpad.tsdk.isolation.adu;
import com.mypinpad.tsdk.isolation.bax;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Channel.BundleAdapter, KeySerializer.KeySerializationFunction, PrimitiveConstructor.PrimitiveConstructionFunction {
    public static long a(long j10, long j11, long j12, long j13) {
        return (j10 * j11) + j12 + j13;
    }

    public static Object b(List list, int i10) {
        return list.get(list.size() - i10);
    }

    public static String c(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String d(GeneralSecurityException generalSecurityException, StringBuilder sb2) {
        sb2.append(generalSecurityException.getMessage());
        return sb2.toString();
    }

    public static void e(int i10, int i11, adu aduVar, HashMap map, Integer num) {
        map.put(num, new bax(i10, i11, aduVar));
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public Object constructPrimitive(Key key) {
        return new ChunkedHmacImpl((HmacKey) key);
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        AesGcmKey aesGcmKey = (AesGcmKey) key;
        ParametersSerializer<AesGcmParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.b.f46539a;
        com.google.crypto.tink.aead.b.c(aesGcmKey.getParameters());
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.crypto.tink.proto.AesGcmKey.newBuilder().setKeyValue(ByteString.copyFrom(aesGcmKey.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.aead.b.a(aesGcmKey.getParameters().getVariant()), aesGcmKey.getIdRequirementOrNull());
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        return bundle.getString("type");
    }
}
