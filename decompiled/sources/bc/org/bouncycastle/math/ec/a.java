package bc.org.bouncycastle.math.ec;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.transition.Transition;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.landing.presentation.LandingContract;
import com.bbva.glomohybrid.landing.presentation.viewmodel.LandingViewModel;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.signature.EcdsaPublicKey;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.encoders.FieldDescriptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Transition.g, Channel.BundleAdapter, Predicate, MultiViewUpdateListener.a, KeySerializer.KeySerializationFunction, CrashlyticsReportJsonTransform.a, Reaction.ReactionExecution {
    public static int d(int i10, int i11, int i12, int i13) {
        return RIPEMD160Digest.a(i10 + i11, i12) + i13;
    }

    public static ECFieldElement e(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static void f(int i10, Composer composer, int i11, Function2 function2) {
        composer.updateRememberedValue(Integer.valueOf(i10));
        composer.apply(Integer.valueOf(i11), function2);
    }

    public static void g(int i10, FieldDescriptor.Builder builder) {
        zzbi zzbiVar = new zzbi();
        zzbiVar.zza(i10);
        builder.withProperty(zzbiVar.zzb()).build();
    }

    @Override // androidx.transition.Transition.g
    public void a(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionCancel(transition);
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.e(jsonReader);
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public void c(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        SnackbarSpec snackbarSpec = (SnackbarSpec) obj2;
        Intrinsics.checkNotNull(snackbarSpec);
        ((LandingViewModel) obj).setIntent(new LandingContract.Intent.SnackBarReceived(snackbarSpec));
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        EcdsaPublicKey ecdsaPublicKey = (EcdsaPublicKey) key;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", com.google.crypto.tink.signature.a.c(ecdsaPublicKey).toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.signature.a.f(ecdsaPublicKey.getParameters().getVariant()), ecdsaPublicKey.getIdRequirementOrNull());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        LoginReaction.Companion companion = LoginReaction.INSTANCE;
        return Build.VERSION.SDK_INT >= 25;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        return bundle.getString("transactionId");
    }
}
