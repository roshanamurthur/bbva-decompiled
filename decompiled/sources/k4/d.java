package k4;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.cellscore.web.component.InternalWebView;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.aead.XChaCha20Poly1305Key;
import com.google.crypto.tink.aead.XChaCha20Poly1305Parameters;
import com.google.crypto.tink.aead.e;
import com.google.crypto.tink.internal.KeySerializer;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import io.reactivex.functions.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Predicate, com.bbva.androidtoolkit.optional.function.Predicate, Channel.BundleAdapter, MultiViewUpdateListener.a, KeySerializer.KeySerializationFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79188p0;

    public /* synthetic */ d(int i10) {
        this.f79188p0 = i10;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public final void c(ValueAnimator valueAnimator, View view) {
        Float f6 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f6.floatValue());
        view.setScaleY(f6.floatValue());
    }

    @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
    public final Serialization serializeKey(Key key, SecretKeyAccess secretKeyAccess) {
        XChaCha20Poly1305Key xChaCha20Poly1305Key = (XChaCha20Poly1305Key) key;
        ParametersSerializer<XChaCha20Poly1305Parameters, ProtoParametersSerialization> parametersSerializer = e.f46554a;
        return ProtoKeySerialization.create("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.crypto.tink.proto.XChaCha20Poly1305Key.newBuilder().setKeyValue(ByteString.copyFrom(xChaCha20Poly1305Key.getKeyBytes().toByteArray(SecretKeyAccess.requireAccess(secretKeyAccess)))).build().toByteString(), KeyData.KeyMaterialType.SYMMETRIC, e.a(xChaCha20Poly1305Key.getParameters().getVariant()), xChaCha20Poly1305Key.getIdRequirementOrNull());
    }

    @Override // io.reactivex.functions.Predicate
    public final boolean test(Object obj) {
        switch (this.f79188p0) {
            case 0:
                int i10 = InternalWebView.f27069t0;
                return ((Boolean) obj).booleanValue();
            case 1:
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNull(bool);
                return bool.booleanValue();
            default:
                return ((FileInteraction) obj) instanceof FileInteraction.Monthly;
        }
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        Object objTryGetValue = BundleHelper.tryGetValue(bundle);
        Intrinsics.checkNotNull(objTryGetValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objTryGetValue;
    }
}
