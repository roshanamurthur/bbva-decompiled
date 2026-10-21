package com.bbva.ethermobilesdk.geolocation.utils;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.geolocation.utils.extension.LoggerKt;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", "", "alwaysShow", "Lcom/google/android/gms/location/LocationRequest;", "locationRequest", "checkLocationSettings", "(Landroid/content/Context;ZLcom/google/android/gms/location/LocationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "areLocationPermissionsGranted", "geolocation_release"}, k = 2, mv = {2, 0, 0})
public final class SettingsKt {

    /* JADX INFO: compiled from: Settings.kt */
    public static final class a implements Function1<LocationSettingsResponse, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f29872p0;

        public a(SafeContinuation safeContinuation) {
            this.f29872p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LocationSettingsResponse locationSettingsResponse) {
            Result.Companion companion = Result.INSTANCE;
            this.f29872p0.resumeWith(Result.m5535constructorimpl(Boolean.TRUE));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Settings.kt */
    public static final class b implements OnFailureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f29873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f29874b;

        public b(Context context, SafeContinuation safeContinuation) {
            this.f29873a = context;
            this.f29874b = safeContinuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Context context = this.f29873a;
            if (!(context instanceof Activity)) {
                LoggerKt.logError$default("Context is not Activity.", null, 2, null);
            } else if (exception instanceof ApiException) {
                SettingsKt.access$handleStatus((ApiException) exception, (Activity) context, this.f29874b);
            } else {
                LoggerKt.logError$default("ApiException was not thrown.", null, 2, null);
            }
        }
    }

    /* JADX INFO: compiled from: Settings.kt */
    public static final class c implements OnSuccessListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f29875a;

        public c(a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f29875a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f29875a.invoke(obj);
        }
    }

    public static final void access$handleStatus(ApiException apiException, Activity activity, Continuation continuation) {
        try {
            int statusCode = apiException.getStatusCode();
            if (statusCode == 6) {
                Intrinsics.checkNotNull(apiException, "null cannot be cast to non-null type com.google.android.gms.common.api.ResolvableApiException");
                ((ResolvableApiException) apiException).startResolutionForResult(activity, 0);
            } else if (statusCode != 8502) {
                LoggerKt.logError$default("Unknown status resolution", null, 2, null);
            } else {
                LoggerKt.logError$default("Changing Settings is not available", null, 2, null);
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m5535constructorimpl(Boolean.FALSE));
            }
        } catch (IntentSender.SendIntentException unused) {
            LoggerKt.logError$default("PendingIntent unable to execute request.", null, 2, null);
        }
    }

    public static final boolean areLocationPermissionsGranted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    @Nullable
    public static final Object checkLocationSettings(@NotNull Context context, boolean z10, @NotNull LocationRequest locationRequest, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        LocationSettingsRequest locationSettingsRequestBuild = new LocationSettingsRequest.Builder().setAlwaysShow(z10).addLocationRequest(locationRequest).build();
        Intrinsics.checkNotNullExpressionValue(locationSettingsRequestBuild, "build(...)");
        LocationServices.getSettingsClient(context).checkLocationSettings(locationSettingsRequestBuild).addOnSuccessListener(new c(new a(safeContinuation))).addOnFailureListener(new b(context, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
