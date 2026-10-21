package ef;

import androidx.camera.core.processing.f;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.hybrid.subtle.AeadOrDaead;
import com.google.crypto.tink.proto.AesCtrHmacAeadKey;
import com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat;
import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.AesSivKey;
import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.HmacKey;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: RegistryEciesAeadHkdfDemHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements EciesAeadHkdfDemHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AesGcmKey f68339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AesCtrHmacAeadKey f68340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AesSivKey f68342f;

    public c(KeyTemplate keyTemplate) throws GeneralSecurityException {
        String typeUrl = keyTemplate.getTypeUrl();
        this.f68337a = typeUrl;
        if (typeUrl.equals(AeadConfig.AES_GCM_TYPE_URL)) {
            try {
                AesGcmKeyFormat from = AesGcmKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.f68339c = (AesGcmKey) Registry.newKey(keyTemplate);
                this.f68338b = from.getKeySize();
                return;
            } catch (InvalidProtocolBufferException e5) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e5);
            }
        }
        if (typeUrl.equals(AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL)) {
            try {
                AesCtrHmacAeadKeyFormat from2 = AesCtrHmacAeadKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
                this.f68340d = (AesCtrHmacAeadKey) Registry.newKey(keyTemplate);
                int keySize = from2.getAesCtrKeyFormat().getKeySize();
                this.f68341e = keySize;
                this.f68338b = keySize + from2.getHmacKeyFormat().getKeySize();
                return;
            } catch (InvalidProtocolBufferException e7) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e7);
            }
        }
        if (!typeUrl.equals(DeterministicAeadConfig.AES_SIV_TYPE_URL)) {
            throw new GeneralSecurityException(f.d("unsupported AEAD DEM key type: ", typeUrl));
        }
        try {
            AesSivKeyFormat from3 = AesSivKeyFormat.parseFrom(keyTemplate.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            this.f68342f = (AesSivKey) Registry.newKey(keyTemplate);
            this.f68338b = from3.getKeySize();
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e10);
        }
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public final AeadOrDaead getAeadOrDaead(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f68338b;
        if (length != i10) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        String str = AeadConfig.AES_GCM_TYPE_URL;
        String str2 = this.f68337a;
        if (str2.equals(str)) {
            return new AeadOrDaead((Aead) Registry.getPrimitive(str2, AesGcmKey.newBuilder().mergeFrom(this.f68339c).setKeyValue(ByteString.copyFrom(bArr, 0, i10)).build(), Aead.class));
        }
        if (!str2.equals(AeadConfig.AES_CTR_HMAC_AEAD_TYPE_URL)) {
            if (str2.equals(DeterministicAeadConfig.AES_SIV_TYPE_URL)) {
                return new AeadOrDaead((DeterministicAead) Registry.getPrimitive(str2, AesSivKey.newBuilder().mergeFrom(this.f68342f).setKeyValue(ByteString.copyFrom(bArr, 0, i10)).build(), DeterministicAead.class));
            }
            throw new GeneralSecurityException("unknown DEM key type");
        }
        int i11 = this.f68341e;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, i10);
        AesCtrKey.Builder builderNewBuilder = AesCtrKey.newBuilder();
        AesCtrHmacAeadKey aesCtrHmacAeadKey = this.f68340d;
        AesCtrKey aesCtrKeyBuild = builderNewBuilder.mergeFrom(aesCtrHmacAeadKey.getAesCtrKey()).setKeyValue(ByteString.copyFrom(bArrCopyOfRange)).build();
        return new AeadOrDaead((Aead) Registry.getPrimitive(str2, AesCtrHmacAeadKey.newBuilder().setVersion(aesCtrHmacAeadKey.getVersion()).setAesCtrKey(aesCtrKeyBuild).setHmacKey(HmacKey.newBuilder().mergeFrom(aesCtrHmacAeadKey.getHmacKey()).setKeyValue(ByteString.copyFrom(bArrCopyOfRange2)).build()).build(), Aead.class));
    }

    @Override // com.google.crypto.tink.subtle.EciesAeadHkdfDemHelper
    public final int getSymmetricKeySizeInBytes() {
        return this.f68338b;
    }
}
