package ie;

import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.TsdkLogger;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69617b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.f69616a = i10;
        this.f69617b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69616a) {
            case 0:
                return ((MaterialDynamicColors) this.f69617b).primary();
            case 1:
                MaterialDynamicColors materialDynamicColors = (MaterialDynamicColors) this.f69617b;
                return new ToneDeltaPair(materialDynamicColors.tertiaryFixed(), materialDynamicColors.tertiaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
            default:
                TsdkLogger tsdkLogger = (TsdkLogger) this.f69617b;
                String str = (String) obj;
                String str2 = TsdkLogger.f67745a;
                tsdkLogger.getClass();
                TsdkLogger.DEFAULT_SINK.apply(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" \n");
                String string = sb2.toString();
                String str3 = LocalDateTime.ofInstant(Instant.ofEpochMilli(Instant.now().toEpochMilli()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(TsdkLogger.f67748d);
                sb3.append(str3);
                sb3.append(string);
                TsdkLogger.f67748d = sb3.toString();
                tsdkLogger.sendLogToServer();
                TsdkLogger.f67748d = "";
                return null;
        }
    }
}
