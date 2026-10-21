package w4;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.internal.KeyParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.XChaCha20Poly1305Key;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.util.SecretBytes;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Predicate, Channel.BundleAdapter, SQLiteEventStore.a, ShapeAppearanceModel.CornerSizeUnaryOperator, MultiViewUpdateListener.a, KeyParser.KeyParsingFunction {
    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        int i10 = MaskableFrameLayout.v0;
        return cornerSize instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize((AbsoluteCornerSize) cornerSize) : cornerSize;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public final void c(ValueAnimator valueAnimator, View view) {
        Float f6 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f6.floatValue());
        view.setScaleY(f6.floatValue());
    }

    @Override // com.google.crypto.tink.internal.KeyParser.KeyParsingFunction
    public final Key parseKey(Serialization serialization, SecretKeyAccess secretKeyAccess) throws GeneralSecurityException {
        ProtoKeySerialization protoKeySerialization = (ProtoKeySerialization) serialization;
        ParametersSerializer<XChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.e.f46554a;
        if (!protoKeySerialization.getTypeUrl().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            XChaCha20Poly1305Key from = XChaCha20Poly1305Key.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            if (from.getVersion() == 0) {
                return com.google.crypto.tink.aead.XChaCha20Poly1305Key.create(com.google.crypto.tink.aead.e.b(protoKeySerialization.getOutputPrefixType()), SecretBytes.copyFrom(from.getKeyValue().toByteArray(), SecretKeyAccess.requireAccess(secretKeyAccess)), protoKeySerialization.getIdRequirementOrNull());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.NotEnrolled;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        Object objTryGetValue = BundleHelper.tryGetValue(bundle);
        Intrinsics.checkNotNull(objTryGetValue, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objTryGetValue;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }
}
