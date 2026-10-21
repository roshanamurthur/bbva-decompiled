package androidx.room;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.adobe.marketing.mobile.AdobeCallbackWithError;
import com.adobe.marketing.mobile.AdobeError;
import com.adobe.marketing.mobile.Analytics;
import com.bbva.component.ay.catalyst.data.response.CatalystCustomError;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.firebase.encoders.FieldDescriptor;
import io.card.payment.i18n.StringKey;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements FlowableOnSubscribe {
    public static int a(byte b10, ArrayList arrayList, int i10, int i11) {
        arrayList.add(Byte.valueOf(b10));
        return i10 + i11;
    }

    public static FieldDescriptor b(int i10, FieldDescriptor.Builder builder) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i10);
        return builder.withProperty(zzaeVar.zzb()).build();
    }

    public static String c(StringKey stringKey, StringBuilder sb2, String str, String str2) {
        sb2.append(stringKey.toString());
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String d(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static ASN1ObjectIdentifier e(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static void f(StringBuilder sb2, int i10, String str, String str2, String str3) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static boolean g(InteractionSource interactionSource, String str, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(interactionSource, str);
        composer.startReplaceableGroup(i10);
        return ComposerKt.isTraceInProgress();
    }

    @Override // io.reactivex.FlowableOnSubscribe
    public void subscribe(final FlowableEmitter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Analytics.getTrackingIdentifier(new AdobeCallbackWithError<String>() { // from class: com.bbva.component.ay.catalyst.data.AnalyticsDataSource$getTrackingIdentifier$1$1
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
