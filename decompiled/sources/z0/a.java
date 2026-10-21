package z0;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.transition.Transition;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.EcdsaKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.signature.EcdsaParameters;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements DoubleFunction, Transition.g, Predicate, Channel.BundleAdapter, SQLiteEventStore.a, MultiViewUpdateListener.a, ParametersSerializer.ParametersSerializationFunction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94921p0;

    public /* synthetic */ a(int i10) {
        this.f94921p0 = i10;
    }

    @Override // androidx.transition.Transition.g
    public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z10) {
        transitionListener.onTransitionStart(transition, z10);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        Encoding encoding = SQLiteEventStore.f43867u0;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.a
    public final void c(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return ColorSpaceKt.absRcpResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public final Serialization serializeParameters(Parameters parameters) {
        EcdsaParameters ecdsaParameters = (EcdsaParameters) parameters;
        ParametersSerializer<EcdsaParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.signature.a.f47355a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").setValue(EcdsaKeyFormat.newBuilder().setParams(com.google.crypto.tink.signature.a.b(ecdsaParameters)).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.signature.a.f(ecdsaParameters.getVariant())).build());
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f94921p0) {
            case 2:
                return !((Boolean) obj).booleanValue();
            default:
                return ((FileInteraction) obj) instanceof FileInteraction.PdfDocument;
        }
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public final Object transform(Bundle bundle) {
        Object objTryGetValue = BundleHelper.tryGetValue(bundle);
        Intrinsics.checkNotNull(objTryGetValue, "null cannot be cast to non-null type kotlin.String");
        return (String) objTryGetValue;
    }
}
