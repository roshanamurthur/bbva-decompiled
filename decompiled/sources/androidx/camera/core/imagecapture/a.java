package androidx.camera.core.imagecapture;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.JsonReader;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import com.bbva.androidtoolkit.optional.function.Predicate;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.glomohybrid.base.cells.channels.EnrollmentChannels;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.payments.InitPaymentCallback;
import com.bbva.valkyria.sdk.services.AndroidHceService;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Interpolator, Predicate, Channel.BundleAdapter, InitPaymentCallback, LibraryVersionComponent.VersionExtractor, CrashlyticsReportJsonTransform.a {
    public static String a(int i10, String str, int i11) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String c(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static Iterator d(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static Scope e(KoinComponent koinComponent) {
        return koinComponent.getKoin().getScopeRegistry().getRootScope();
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) throws IOException {
        DataEncoder dataEncoder = CrashlyticsReportJsonTransform.f48234a;
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builder = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    builder.setLibraryName(jsonReader.nextString());
                    break;
                case "arch":
                    builder.setArch(jsonReader.nextString());
                    break;
                case "buildId":
                    builder.setBuildId(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        return (i10 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("accelerate").get(f6);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.payments.InitPaymentCallback
    public void init() {
        String str = AndroidHceService.TAG;
        ((Vibrator) MobilePayment.getInstance().getContext().getSystemService("vibrator")).vibrate(500L);
    }

    @Override // com.bbva.androidtoolkit.optional.function.Predicate
    public boolean test(Object obj) {
        return ((BiometricErrorNavigation) obj) instanceof BiometricErrorNavigation.ExpiredPassword;
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        EnrollmentChannels enrollmentChannels = EnrollmentChannels.INSTANCE;
        Object objTryGetValue = BundleHelper.tryGetValue(bundle);
        Intrinsics.checkNotNull(objTryGetValue, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objTryGetValue;
    }
}
