package com.bbva.actionlauncher;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.camera.core.processing.f;
import androidx.core.content.FileProvider;
import com.bbva.actionlauncher.converter.ValueMappersKt;
import com.bbva.actionlauncher.converter.ZoomConverterKt;
import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.actionlauncher.model.PlatformTypeKt;
import com.bbva.actonlauncher.R;
import com.bbva.io.file.FileIOKt;
import com.bbva.io.file.Source;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidActionLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u001e"}, d2 = {"Lcom/bbva/actionlauncher/AndroidActionLauncher;", "Lcom/bbva/actionlauncher/ActionLauncher;", "", "phone", "", "launchDialer", "packageName", "launchApp", "Lcom/bbva/actionlauncher/UriValue;", "uri", "canOpenUri", "Lcom/bbva/actionlauncher/model/PlatformType;", "platformType", "", "launchMarket", "uriString", "launchMaps", "Lcom/bbva/actionlauncher/SharedValue;", "contentValue", "launchShare", "Lcom/bbva/actionlauncher/ViewValue;", "launchView", "launchSettings", "Landroid/content/Context;", "context", "Lcom/bbva/actionlauncher/ActionLauncherConfig;", "actionLauncherConfig", "<init>", "(Landroid/content/Context;Lcom/bbva/actionlauncher/ActionLauncherConfig;)V", "Companion", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidActionLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidActionLauncher.kt\ncom/bbva/actionlauncher/AndroidActionLauncher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,162:1\n1#2:163\n*E\n"})
public final class AndroidActionLauncher implements ActionLauncher {

    @NotNull
    public static final String GEO_SCHEME = "geo:";

    @NotNull
    public static final String GOOGLE_NAV_SCHEME = "google.navigation:";

    @NotNull
    public static final String PETAL_NAV_SCHEME = "mapapp://navigation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f26432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ActionLauncherConfig f26433b;

    /* JADX INFO: compiled from: AndroidActionLauncher.kt */
    public static final class a extends Lambda implements Function0<Intent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f26434p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f26434p0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Intent invoke() {
            Intent data = new Intent("android.intent.action.DIAL").setData(Uri.parse("tel:" + this.f26434p0));
            Intrinsics.checkNotNullExpressionValue(data, "Intent(Intent.ACTION_DIA…(Uri.parse(\"tel:$phone\"))");
            return data;
        }
    }

    /* JADX INFO: compiled from: AndroidActionLauncher.kt */
    public static final class b extends Lambda implements Function0<Intent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f26435p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.f26435p0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Intent invoke() {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(ZoomConverterKt.getZoomAndReplaceValue(this.f26435p0)));
            return intent;
        }
    }

    /* JADX INFO: compiled from: AndroidActionLauncher.kt */
    public static final class c extends Lambda implements Function0<Intent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f26436p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f26436p0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Intent invoke() {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f26436p0, null));
            Intrinsics.checkNotNullExpressionValue(data, "Intent(Settings.ACTION_A…age\", packageName, null))");
            return data;
        }
    }

    /* JADX INFO: compiled from: AndroidActionLauncher.kt */
    public static final class d extends Lambda implements Function0<Intent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Intent f26437p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AndroidActionLauncher f26438q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Intent intent, AndroidActionLauncher androidActionLauncher) {
            super(0);
            this.f26437p0 = intent;
            this.f26438q0 = androidActionLauncher;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Intent invoke() {
            Intent intentCreateChooser = Intent.createChooser(this.f26437p0, this.f26438q0.f26432a.getString(R.string.share_with));
            Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(intent, co…ing(R.string.share_with))");
            return intentCreateChooser;
        }
    }

    /* JADX INFO: compiled from: AndroidActionLauncher.kt */
    public static final class e extends Lambda implements Function0<Intent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Intent f26439p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AndroidActionLauncher f26440q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Intent intent, AndroidActionLauncher androidActionLauncher) {
            super(0);
            this.f26439p0 = intent;
            this.f26440q0 = androidActionLauncher;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Intent invoke() {
            Intent intentCreateChooser = Intent.createChooser(this.f26439p0, this.f26440q0.f26432a.getString(R.string.open_with));
            Intrinsics.checkNotNullExpressionValue(intentCreateChooser, "createChooser(intent, co…ring(R.string.open_with))");
            return intentCreateChooser;
        }
    }

    public AndroidActionLauncher(@NotNull Context context, @NotNull ActionLauncherConfig actionLauncherConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actionLauncherConfig, "actionLauncherConfig");
        this.f26432a = context;
        this.f26433b = actionLauncherConfig;
    }

    public final boolean a(Function0<? extends Intent> function0) {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f26432a.startActivity(function0.invoke().addFlags(268435456));
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = Boolean.TRUE;
        }
        Object objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        Boolean bool = Boolean.FALSE;
        if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
            objM5535constructorimpl2 = bool;
        }
        return ((Boolean) objM5535constructorimpl2).booleanValue();
    }

    public final String b(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str2);
        ActionLauncherConfig actionLauncherConfig = this.f26433b;
        File file = new File(actionLauncherConfig.getTempFolderPath());
        if (!file.exists()) {
            file.mkdir();
        }
        File fileCreateTempFile$default = ik.e.createTempFile$default(null, f.d(Constant.DOT_STRING, extensionFromMimeType), file, 1, null);
        FileIOKt.write(fileCreateTempFile$default, new Source.Base64Source(str));
        String string = FileProvider.getUriForFile(this.f26432a, actionLauncherConfig.getAuthorities(), fileCreateTempFile$default).toString();
        Intrinsics.checkNotNullExpressionValue(string, "getUriForFile(context, a…)\n            .toString()");
        return string;
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean canOpenUri(@NotNull UriValue uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z10 = uri instanceof UriValue.Uri;
        Context context = this.f26432a;
        if (z10) {
            if (new Intent("android.intent.action.VIEW", Uri.parse(((UriValue.Uri) uri).getUri())).resolveActivity(context.getPackageManager()) == null) {
                return false;
            }
        } else {
            if (!(uri instanceof UriValue.App)) {
                throw new NoWhenBranchMatchedException();
            }
            if (context.getPackageManager().getLaunchIntentForPackage(((UriValue.App) uri).getPackageId()) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean launchApp(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Context context = this.f26432a;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage == null) {
            return false;
        }
        context.startActivity(launchIntentForPackage);
        return true;
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean launchDialer(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        return a(new a(phone));
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean launchMaps(@NotNull String uriString) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        if (l.startsWith$default(uriString, GEO_SCHEME, false, 2, null) || l.startsWith$default(uriString, GOOGLE_NAV_SCHEME, false, 2, null) || l.startsWith$default(uriString, PETAL_NAV_SCHEME, false, 2, null)) {
            return a(new b(uriString));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public void launchMarket(@NotNull String packageName, @NotNull PlatformType platformType) {
        Context context = this.f26432a;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        List<String> marketSchemeAndUri = PlatformTypeKt.getMarketSchemeAndUri(platformType, packageName);
        String str = marketSchemeAndUri.get(0);
        String str2 = marketSchemeAndUri.get(1);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        try {
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setData(Uri.parse(str2));
            context.startActivity(intent);
        }
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean launchSettings(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return a(new c(packageName));
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean launchShare(@NotNull SharedValue contentValue) {
        Intent intent;
        Intrinsics.checkNotNullParameter(contentValue, "contentValue");
        if (contentValue instanceof SharedValue.File) {
            SharedValue.File file = (SharedValue.File) contentValue;
            intent = ValueMappersKt.toIntent(new SharedValue.Uri(file.getMimetype(), b(file.getBase64(), file.getMimetype()), 0, 4, null));
        } else if (contentValue instanceof SharedValue.Text) {
            intent = ValueMappersKt.toIntent((SharedValue.Text) contentValue);
        } else if (contentValue instanceof SharedValue.Url) {
            intent = ValueMappersKt.toIntent((SharedValue.Url) contentValue);
        } else if (contentValue instanceof SharedValue.Email) {
            intent = ValueMappersKt.toIntent((SharedValue.Email) contentValue);
        } else {
            if (!(contentValue instanceof SharedValue.Uri)) {
                throw new NoWhenBranchMatchedException();
            }
            intent = ValueMappersKt.toIntent((SharedValue.Uri) contentValue);
        }
        return a(new d(intent, this));
    }

    @Override // com.bbva.actionlauncher.ActionLauncher
    public boolean launchView(@NotNull ViewValue contentValue) {
        Intent intent;
        Intrinsics.checkNotNullParameter(contentValue, "contentValue");
        if (contentValue instanceof ViewValue.File) {
            ViewValue.File file = (ViewValue.File) contentValue;
            intent = ValueMappersKt.toIntent(new ViewValue.Uri(file.getMimeType(), b(file.getBase64(), file.getMimeType()), 0, 4, null));
        } else if (contentValue instanceof ViewValue.Url) {
            intent = ValueMappersKt.toIntent((ViewValue.Url) contentValue);
        } else {
            if (!(contentValue instanceof ViewValue.Uri)) {
                throw new NoWhenBranchMatchedException();
            }
            intent = ValueMappersKt.toIntent((ViewValue.Uri) contentValue);
        }
        intent.addFlags(268435456);
        return a(new e(intent, this));
    }

    public /* synthetic */ AndroidActionLauncher(Context context, ActionLauncherConfig actionLauncherConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? ValueMappersKt.defaultConfig(context) : actionLauncherConfig);
    }
}
