package ai;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SkippableUpdater;
import androidx.transition.Transition;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.ui.snackbar.CountrySnackbarsFactory;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.signature.EcdsaParameters;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Transition.g, Predicate, Channel.BundleAdapter, MultiViewUpdateListener.a, KeyParser.KeyParsingFunction, CrashlyticsReportJsonTransform.a, Transformer, Reaction.ReactionExecution {
    public static int d(int i10, int i11, int i12) {
        return zzuc.zzz(i10) + i11 + i12;
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        return RIPEMD160Digest.a(i10 + i11 + i12, i13) + i14;
    }

    public static int f(String str, String str2, int i10) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return str.length() - i10;
    }

    public static long g(long j10, long j11, long j12, long j13) {
        return ((j10 + j11) - j12) + j13;
    }

    public static Integer h(HashMap map, Integer num, String str, int i10, String str2) {
        map.put(num, str);
        Integer numValueOf = Integer.valueOf(i10);
        map.put(numValueOf, str2);
        return numValueOf;
    }

    public static String i(Object[] objArr, int i10, String str, String str2) {
        String str3 = String.format(str, Arrays.copyOf(objArr, i10));
        Intrinsics.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static void j(int i10, Function3 function3, SkippableUpdater skippableUpdater, Composer composer, int i11) {
        function3.invoke(skippableUpdater, composer, Integer.valueOf(i10));
        composer.startReplaceableGroup(i11);
    }

    @Override // androidx.transition.Transition.g
    public void a(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionPause(transition);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) throws IOException {
        DataEncoder dataEncoder = CrashlyticsReportJsonTransform.f48234a;
        CrashlyticsReport.FilesPayload.File.Builder builder = CrashlyticsReport.FilesPayload.File.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                builder.setFilename(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                builder.setContents(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public void c(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        ((LandingViewModel) obj).setIntent(new LandingContract.Intent.SnackBarReceived(CountrySnackbarsFactory.INSTANCE.sessionExpirationSnackbar()));
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.signature.a.f47355a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + protoKeySerialization.getTypeUrl());
        }
        try {
            EcdsaPublicKey from = EcdsaPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.signature.EcdsaPublicKey.builder().setParameters(EcdsaParameters.builder().setHashType(com.google.crypto.tink.signature.a.e(from.getParams().getHashType())).setSignatureEncoding(com.google.crypto.tink.signature.a.g(from.getParams().getEncoding())).setCurveType(com.google.crypto.tink.signature.a.d(from.getParams().getCurve())).setVariant(com.google.crypto.tink.signature.a.h(protoKeySerialization.getOutputPrefixType())).build()).setPublicPoint(new ECPoint(BigIntegerEncoding.fromUnsignedBigEndianBytes(from.getX().toByteArray()), BigIntegerEncoding.fromUnsignedBigEndianBytes(from.getY().toByteArray()))).setIdRequirement(protoKeySerialization.getIdRequirementOrNull()).build();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.Fatal;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        return Integer.valueOf((int) bundle.getDouble("enabled"));
    }
}
