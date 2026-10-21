package com.bbva.glomohybrid.usecase;

import android.content.Context;
import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomohybrid.model.AppConfigModel;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.google.gson.Gson;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetUrlUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/usecase/GetUrlUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/glomo/user/domain/model/UserType;", "", "params", "execute", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGetUrlUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetUrlUseCase.kt\ncom/bbva/glomohybrid/usecase/GetUrlUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class GetUrlUseCase implements UseCaseWithParams<UserType, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f34723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f34724b;

    /* JADX INFO: compiled from: GetUrlUseCase.kt */
    public static final class a extends Lambda implements Function0<AppConfigModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AppConfigModel invoke() {
            return GetUrlUseCase.access$parseAppConfig(GetUrlUseCase.this);
        }
    }

    public GetUrlUseCase(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34723a = context;
        this.f34724b = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final AppConfigModel access$parseAppConfig(GetUrlUseCase getUrlUseCase) {
        getUrlUseCase.getClass();
        try {
            Gson gson = new Gson();
            InputStream inputStreamOpen = getUrlUseCase.f34723a.getAssets().open("config/app.config.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            byte[] bytes = ByteStreamsKt.readBytes(inputStreamOpen);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            Object objFromJson = gson.fromJson(new String(bytes, charsetDefaultCharset), (Class<Object>) AppConfigModel.class);
            Intrinsics.checkNotNull(objFromJson);
            return (AppConfigModel) objFromJson;
        } catch (Throwable unused) {
            return new AppConfigModel(null, 1, null);
        }
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public String execute(@NotNull UserType params) {
        Map<String, String> web;
        String str;
        Intrinsics.checkNotNullParameter(params, "params");
        List<AppConfigModel.AppConfigEnvironmentModel> environments = ((AppConfigModel) this.f34724b.getValue()).getEnvironments();
        AppConfigModel.AppConfigEnvironmentModel appConfigEnvironmentModel = null;
        Object obj = null;
        if (environments != null) {
            for (Object obj2 : environments) {
                if (((AppConfigModel.AppConfigEnvironmentModel) obj2).getWeb().containsKey(params.getWebId())) {
                    obj = obj2;
                    break;
                }
            }
            appConfigEnvironmentModel = (AppConfigModel.AppConfigEnvironmentModel) obj;
        }
        return (appConfigEnvironmentModel == null || (web = appConfigEnvironmentModel.getWeb()) == null || (str = web.get(params.getWebId())) == null) ? "https://appassets.androidplatform.net/assets/www/index.html" : str;
    }
}
