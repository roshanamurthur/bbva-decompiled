package com.bbva.glomohybrid.crashHandler;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.bbva.glomohybrid.infoscreen.crashError.CrashErrorActivity;
import com.bbva.glomohybrid.logs.handler.CrashlyticsHandler;
import com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter;
import com.bbva.glomoutils.mobileservices.craslytics.CrashReporter;
import com.bbva.glomoutils.mobileservices.craslytics.Crashlytics;
import com.bbva.glomoutils.usecase.CrashlyticsExtensionsKt;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppExceptionHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/crashHandler/AppExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/lang/Thread;", "thread", "", "exception", "", "uncaughtException", "systemHandler", "Landroid/app/Application;", Constants.APPLICATION, "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", CrashlyticsHandler.ID, "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/app/Application;Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class AppExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Thread.UncaughtExceptionHandler f32019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Application f32020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Crashlytics f32021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Activity f32022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32023e;

    /* JADX INFO: compiled from: AppExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/crashHandler/AppExceptionHandler$Companion;", "", "()V", "setAsDefaultHandler", "", Constants.APPLICATION, "Landroid/app/Application;", CrashlyticsHandler.ID, "Lcom/bbva/glomoutils/mobileservices/craslytics/Crashlytics;", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAppExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppExceptionHandler.kt\ncom/bbva/glomohybrid/crashHandler/AppExceptionHandler$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setAsDefaultHandler(@NotNull Application application, @NotNull Crashlytics crashlytics) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler != null ? new AppExceptionHandler(defaultUncaughtExceptionHandler, application, crashlytics) : null);
        }
    }

    /* JADX INFO: compiled from: AppExceptionHandler.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Throwable f32025q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th2) {
            super(0);
            this.f32025q0 = th2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AppExceptionHandler.access$navigateToErrorScreen(AppExceptionHandler.this, this.f32025q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppExceptionHandler.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Thread f32028q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Throwable f32029r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Thread thread, Throwable th2) {
            super(0);
            this.f32028q0 = thread;
            this.f32029r0 = th2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AppExceptionHandler appExceptionHandler = AppExceptionHandler.this;
            CrashlyticsExtensionsKt.setUncaughtCrashCustomKeys(appExceptionHandler.f32021c, appExceptionHandler.f32020b);
            appExceptionHandler.f32019a.uncaughtException(this.f32028q0, this.f32029r0);
            return Unit.INSTANCE;
        }
    }

    public AppExceptionHandler(@NotNull Thread.UncaughtExceptionHandler systemHandler, @NotNull Application application, @NotNull Crashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(systemHandler, "systemHandler");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f32019a = systemHandler;
        this.f32020b = application;
        this.f32021c = crashlytics;
        application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksAdapter() { // from class: com.bbva.glomohybrid.crashHandler.AppExceptionHandler$activityLifecycleCallbacks$1
            @Override // com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AppExceptionHandler appExceptionHandler = this.f32026p0;
                appExceptionHandler.f32023e++;
                appExceptionHandler.f32022d = activity;
            }

            @Override // com.bbva.glomoutils.lifecycle.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                AppExceptionHandler appExceptionHandler = this.f32026p0;
                appExceptionHandler.f32023e--;
                if (appExceptionHandler.f32023e <= 0) {
                    appExceptionHandler.f32022d = null;
                }
            }
        });
    }

    public static final void access$navigateToErrorScreen(AppExceptionHandler appExceptionHandler, Throwable th2) {
        appExceptionHandler.getClass();
        th2.printStackTrace();
        Application application = appExceptionHandler.f32020b;
        Intent intent = new Intent(application, (Class<?>) CrashErrorActivity.class);
        intent.putExtra(CrashReporter.PENDING_CRASH, th2);
        intent.addFlags(268468224);
        application.startActivity(intent);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (this.f32022d != null) {
            new a(exception).invoke();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new n8.a(2, null), 3, null);
        } else {
            new b(thread, exception).invoke();
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new n8.a(2, null), 3, null);
        }
    }
}
