package com.google.firebase.sessions.settings;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.ApplicationInfo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014Jo\u0010\f\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "", "", "onSuccess", "onFailure", "doConfigFetch", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "baseUrl", "<init>", "(Lcom/google/firebase/sessions/ApplicationInfo;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ApplicationInfo f48935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f48936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f48937c;

    /* JADX INFO: compiled from: RemoteSettingsFetcher.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f48938p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f48940r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<JSONObject, Continuation<? super Unit>, Object> f48941s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> f48942t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f48940r0 = map;
            this.f48941s0 = function2;
            this.f48942t0 = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RemoteSettingsFetcher.this.new a(this.f48940r0, this.f48941s0, this.f48942t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48938p0;
            Function2<String, Continuation<? super Unit>, Object> function2 = this.f48942t0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    URLConnection uRLConnectionOpenConnection = RemoteSettingsFetcher.access$settingsUrl(RemoteSettingsFetcher.this).openConnection();
                    Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty("Accept", "application/json");
                    for (Map.Entry<String, String> entry : this.f48940r0.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            objectRef.element = line;
                            if (line == 0) {
                                break;
                            }
                            sb2.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb2.toString());
                        Function2<JSONObject, Continuation<? super Unit>, Object> function3 = this.f48941s0;
                        this.f48938p0 = 1;
                        if (function3.invoke(jSONObject, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        String str = "Bad response code: " + responseCode;
                        this.f48938p0 = 2;
                        if (function2.invoke(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e5) {
                String message = e5.getMessage();
                if (message == null) {
                    message = e5.toString();
                }
                this.f48938p0 = 3;
                if (function2.invoke(message, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo appInfo, @NotNull CoroutineContext blockingDispatcher, @NotNull String baseUrl) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f48935a = appInfo;
        this.f48936b = blockingDispatcher;
        this.f48937c = baseUrl;
    }

    public static final URL access$settingsUrl(RemoteSettingsFetcher remoteSettingsFetcher) {
        remoteSettingsFetcher.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority(remoteSettingsFetcher.f48937c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ApplicationInfo applicationInfo = remoteSettingsFetcher.f48935a;
        return new URL(builderAppendPath.appendPath(applicationInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", applicationInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", applicationInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object doConfigFetch(@NotNull Map<String, String> map, @NotNull Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.f48936b, new a(map, function2, function3, null), continuation);
        return objWithContext == ek.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationInfo, coroutineContext, (i10 & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
