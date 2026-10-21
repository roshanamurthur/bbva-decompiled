package com.bbva.ethermobilesdk.deviceinfo.component;

import android.content.Context;
import android.provider.Settings;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.deviceinfo.utils.extension.DateKt;
import com.instacart.library.truetime.TrueTime;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Time;", "", "", "host", "", "timeout", "getTrueTime", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentDate", "()Ljava/lang/String;", "currentDate", "getCurrentTime", "currentTime", "getCurrentTimeZone", "currentTimeZone", "", "isAutomaticDateAndTime", "()Z", "isAutomaticZone", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class Time {

    @NotNull
    public static final String DATE_FORMAT = "yyyy/MM/dd";

    @NotNull
    public static final String GMT = "GMT";

    @NotNull
    public static final String TIME_FORMAT = "HH:mm:ss";

    @NotNull
    public static final String TIME_ZONE_FORMAT = "%02d:%02d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29544a;

    /* JADX INFO: compiled from: Time.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.deviceinfo.component.Time$getTrueTime$2", f = "Time.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29545p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f29546q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f29547r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29546q0 = str;
            this.f29547r0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f29546q0, this.f29547r0, continuation);
            aVar.f29545p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = this.f29546q0;
            int i10 = this.f29547r0;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!TrueTime.isInitialized()) {
                    TrueTime.build().withNtpHost(str).withConnectionTimeout(i10).initialize();
                }
                Date dateNow = TrueTime.now();
                Intrinsics.checkNotNullExpressionValue(dateNow, "now()");
                objM5535constructorimpl = Result.m5535constructorimpl(DateKt.asISODate(dateNow));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                return null;
            }
            return objM5535constructorimpl;
        }
    }

    public Time(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29544a = context;
    }

    public static /* synthetic */ Object getTrueTime$default(Time time, String str, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "time.google.com";
        }
        if ((i11 & 2) != 0) {
            i10 = 10000;
        }
        return time.getTrueTime(str, i10, continuation);
    }

    @NotNull
    public final String getCurrentDate() {
        String str = new SimpleDateFormat("yyyy/MM/dd", java.util.Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(DATE_FO…Default()).format(Date())");
        return str;
    }

    @NotNull
    public final String getCurrentTime() {
        String str = new SimpleDateFormat(TIME_FORMAT, java.util.Locale.getDefault()).format(new Date(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "this.format(Date(System.currentTimeMillis()))");
        return str;
    }

    @NotNull
    public final String getCurrentTimeZone() {
        int offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(java.util.Locale.getDefault(), TIME_ZONE_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(offset / 3600000)), Integer.valueOf(Math.abs((offset / 60000) % 60))}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return h0.b(GMT, offset >= 0 ? "+" : Constant.DASH_STRING, str);
    }

    @Nullable
    public final Object getTrueTime(@NotNull String str, int i10, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(str, i10, null), continuation);
    }

    public final boolean isAutomaticDateAndTime() {
        return Settings.Global.getInt(this.f29544a.getContentResolver(), "auto_time", 0) != 0;
    }

    public final boolean isAutomaticZone() {
        return Settings.Global.getInt(this.f29544a.getApplicationContext().getContentResolver(), "auto_time_zone", 0) == 1;
    }
}
