package androidx.core.graphics;

import android.graphics.Canvas;
import androidx.compose.runtime.PreconditionsKt;
import com.adobe.marketing.mobile.AdobeCallbackWithError;
import com.adobe.marketing.mobile.AdobeError;
import com.adobe.marketing.mobile.Identity;
import com.bbva.component.ay.catalyst.data.response.CatalystCustomError;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.firebase.encoders.FieldDescriptor;
import com.mypinpad.tsdk.isolation.vc;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.util.ArrayList;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements FlowableOnSubscribe {
    public static float a(float f6, float f10, float f11, float f12) {
        return (f11 - (f6 * f10)) * f12;
    }

    public static FieldDescriptor b(int i10, FieldDescriptor.Builder builder) {
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(i10);
        return builder.withProperty(zzcqVar.zzb()).build();
    }

    public static String c(String str, Path path) {
        return str + path;
    }

    public static StringBuilder d(byte b10, ArrayList arrayList, String str) {
        arrayList.add(Byte.valueOf(b10));
        return new StringBuilder(str);
    }

    public static void e(int i10, Canvas canvas, int i11, int i12) {
        InlineMarker.finallyStart(i10);
        canvas.restoreToCount(i11);
        InlineMarker.finallyEnd(i12);
    }

    public static void f(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
    }

    public static void g(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        PreconditionsKt.throwIllegalStateException(sb2.toString());
    }

    public static byte[] h(String str, JSONObject jSONObject, String str2) throws JSONException {
        String string = jSONObject.getString(str.intern());
        Intrinsics.checkNotNullExpressionValue(string, str2);
        return vc.setX(string);
    }

    @Override // io.reactivex.FlowableOnSubscribe
    public void subscribe(final FlowableEmitter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Identity.getExperienceCloudId(new AdobeCallbackWithError<String>() { // from class: com.bbva.component.ay.catalyst.data.IdentityDataSource$getExperienceCloudId$1$1
            @Override // com.adobe.marketing.mobile.AdobeCallbackWithError
            public void fail(@Nullable AdobeError p4) {
                if (p4 == null) {
                    return;
                }
                int errorCode = p4.getErrorCode();
                String errorName = p4.getErrorName();
                Intrinsics.checkNotNullExpressionValue(errorName, "error.errorName");
                CatalystCustomError catalystCustomError = new CatalystCustomError(errorCode, errorName);
                FlowableEmitter<String> flowableEmitter = it;
                flowableEmitter.onError(catalystCustomError);
                flowableEmitter.onComplete();
            }

            @Override // com.adobe.marketing.mobile.AdobeCallback
            public void call(@Nullable String p4) {
                if (p4 == null) {
                    return;
                }
                FlowableEmitter<String> flowableEmitter = it;
                flowableEmitter.onNext(p4);
                flowableEmitter.onComplete();
            }
        });
    }
}
