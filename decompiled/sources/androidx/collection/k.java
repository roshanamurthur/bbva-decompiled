package androidx.collection;

import android.os.Bundle;
import androidx.compose.ui.node.LayoutNode;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.AesGcmParameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.proto.AesCmacKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.security.GeneralSecurityException;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Predicate, Channel.BundleAdapter, ParametersParser.ParametersParsingFunction, KeyParser.KeyParsingFunction, Deferred.DeferredHandler {
    public static int a(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    public static String b(int i10, int i11, String str, int i12) {
        return str.subSequence(i12, i10 + i11).toString();
    }

    public static String c(String str, int i10, String str2, int i11, String str3) {
        return str + i10 + str2 + i11 + str3;
    }

    public static StringBuilder d(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(simpleTypeMarker);
        sb2.append(str2);
        return sb2;
    }

    public static void e(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<AesCmacParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.mac.a.f46800a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            AesCmacKey from = AesCmacKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.mac.AesCmacKey.builder().setParameters(AesCmacParameters.builder().setKeySizeBytes(from.getKeyValue().size()).setTagSizeBytes(from.getParams().getTagSize()).setVariant(com.google.crypto.tink.mac.a.b(protoKeySerialization.getOutputPrefixType())).build()).setAesKeyBytes(SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    @Override // com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction
    public Parameters parseParameters(Serialization serialization) throws GeneralSecurityException {
        ProtoParametersSerialization protoParametersSerialization = (ProtoParametersSerialization) serialization;
        ParametersSerializer<AesGcmParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.b.f46539a;
        if (!protoParametersSerialization.getKeyTemplate().getTypeUrl().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: " + protoParametersSerialization.getKeyTemplate().getTypeUrl());
        }
        try {
            return AesGcmParameters.builder().setKeySizeBytes(AesGcmKeyFormat.parseFrom(protoParametersSerialization.getKeyTemplate().getValue(), ExtensionRegistryLite.getEmptyRegistry()).getKeySize()).setIvSizeBytes(12).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.b.b(protoParametersSerialization.getKeyTemplate().getOutputPrefixType())).build();
        } catch (InvalidProtocolBufferException e5) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.FriendlyFraud;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        return new SnackbarSpec.BundleSnackbar(bundle);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
    }
}
