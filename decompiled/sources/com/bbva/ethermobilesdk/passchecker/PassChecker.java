package com.bbva.ethermobilesdk.passchecker;

import android.content.Context;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.passchecker.extension.QualityMapKt;
import com.bbva.ethermobilesdk.passchecker.extension.StrengthKt;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Policy;
import com.bbva.ethermobilesdk.passchecker.model.api.output.Validation;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationEvaluation;
import com.bbva.ethermobilesdk.passchecker.util.CompromisedKt;
import com.bbva.ethermobilesdk.passchecker.util.LevenshteinKt;
import com.bbva.ethermobilesdk.passchecker.util.ZxcvbnKt;
import com.bbva.ethermobilesdk.passchecker.validation.AllowValidation;
import com.bbva.ethermobilesdk.passchecker.validation.LimitValidation;
import com.bbva.ethermobilesdk.passchecker.validation.RequireValidation;
import com.bbva.network.NetworkWorker;
import com.nulabinc.zxcvbn.Strength;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PassChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/PassChecker;", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", Constants.policy, "", "password", "oldPassword", "", "disableCompromised", "", "timeout", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/Validation;", "validate", "(Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Landroid/content/Context;Lcom/bbva/network/NetworkWorker;)V", "passchecker_release"}, k = 1, mv = {1, 8, 0})
public final class PassChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final NetworkWorker f29886b;

    /* JADX INFO: compiled from: PassChecker.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.passchecker.PassChecker$validate$2", f = "PassChecker.kt", i = {0, 0, 0, 0, 0}, l = {68}, m = "invokeSuspend", n = {"errors", "evaluationPass", "evaluationOldPass", "validationConfig", "zxcvbnEvaluation"}, s = {"L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<Validation>>, Object> {
        public final /* synthetic */ PassChecker E0;
        public final /* synthetic */ boolean F0;
        public final /* synthetic */ Integer G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ArrayList f29887p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f29888q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f29889r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public ValidationConfig f29890s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Strength f29891t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f29892u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Policy f29893w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ String f29894x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ String f29895y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Policy policy, String str, String str2, PassChecker passChecker, boolean z10, Integer num, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29893w0 = policy;
            this.f29894x0 = str;
            this.f29895y0 = str2;
            this.E0 = passChecker;
            this.F0 = z10;
            this.G0 = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f29893w0, this.f29894x0, this.f29895y0, this.E0, this.F0, this.G0, continuation);
            aVar.v0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Validation>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Policy policy;
            ArrayList arrayList;
            String lowerCase;
            String str;
            ValidationConfig validationConfig;
            String str2;
            Strength zxcvbnEvaluation;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29892u0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    policy = this.f29893w0;
                    PassChecker passChecker = this.E0;
                    Integer num = this.G0;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    arrayList = new ArrayList();
                    boolean ignoreCase = policy.getAllow().getIgnoreCase();
                    String lowerCase2 = this.f29894x0;
                    if (ignoreCase) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    }
                    String str3 = lowerCase2;
                    String str4 = this.f29895y0;
                    if (ignoreCase) {
                        lowerCase = str4.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    } else {
                        lowerCase = str4;
                    }
                    ValidationConfig validationConfig2 = new ValidationConfig(policy, str3, lowerCase);
                    Strength strengthZxcvbnMeasure = ZxcvbnKt.zxcvbnMeasure(str3);
                    Context context = passChecker.f29885a;
                    NetworkWorker networkWorker = passChecker.f29886b;
                    boolean z10 = this.F0;
                    this.v0 = policy;
                    this.f29887p0 = arrayList;
                    this.f29888q0 = str3;
                    this.f29889r0 = lowerCase;
                    this.f29890s0 = validationConfig2;
                    this.f29891t0 = strengthZxcvbnMeasure;
                    this.f29892u0 = 1;
                    obj = CompromisedKt.compromised(context, networkWorker, z10, num, str3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = lowerCase;
                    validationConfig = validationConfig2;
                    str2 = str3;
                    zxcvbnEvaluation = strengthZxcvbnMeasure;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zxcvbnEvaluation = this.f29891t0;
                    validationConfig = this.f29890s0;
                    str = this.f29889r0;
                    str2 = this.f29888q0;
                    arrayList = this.f29887p0;
                    policy = (Policy) this.v0;
                    ResultKt.throwOnFailure(obj);
                }
                int iIntValue = ((Number) obj).intValue();
                int iLevenshtein = LevenshteinKt.levenshtein(str2, str);
                int iQualityLevel = QualityMapKt.qualityLevel(policy.getQualityMap(), zxcvbnEvaluation.getScore());
                Intrinsics.checkNotNullExpressionValue(zxcvbnEvaluation, "zxcvbnEvaluation");
                ValidationEvaluation validationEvaluation = new ValidationEvaluation(iIntValue, iLevenshtein, iQualityLevel, zxcvbnEvaluation);
                arrayList.addAll(new AllowValidation().validate(validationConfig, validationEvaluation));
                arrayList.addAll(new RequireValidation().validate(validationConfig, validationEvaluation));
                arrayList.addAll(new LimitValidation().validate(validationConfig, validationEvaluation));
                boolean zIsEmpty = arrayList.isEmpty();
                int quality = validationEvaluation.getQuality();
                int distance = validationEvaluation.getDistance();
                int compromised = validationEvaluation.getCompromised();
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(new Validation(zIsEmpty, quality, distance, compromised, arrayList, StrengthKt.map(zxcvbnEvaluation))));
            } catch (Throwable th2) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
        }
    }

    public PassChecker(@NotNull Context context, @Nullable NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29885a = context;
        this.f29886b = networkWorker;
    }

    public static /* synthetic */ Object validate$default(PassChecker passChecker, Policy policy, String str, String str2, boolean z10, Integer num, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            num = null;
        }
        return passChecker.validate(policy, str, str2, z11, num, continuation);
    }

    @Nullable
    public final Object validate(@NotNull Policy policy, @NotNull String str, @NotNull String str2, boolean z10, @Nullable Integer num, @NotNull Continuation<? super Result<Validation>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(policy, str, str2, this, z10, num, null), continuation);
    }

    public /* synthetic */ PassChecker(Context context, NetworkWorker networkWorker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : networkWorker);
    }
}
