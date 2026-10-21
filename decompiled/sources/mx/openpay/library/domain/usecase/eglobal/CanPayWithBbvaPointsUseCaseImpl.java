package mx.openpay.library.domain.usecase.eglobal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.repository.EglobalRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CanPayWithBbvaPointsUseCase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCaseImpl;", "Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCase;", "", "cardBin", "slotKey", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/repository/EglobalRepository;", "repository", "<init>", "(Lmx/openpay/library/domain/repository/EglobalRepository;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class CanPayWithBbvaPointsUseCaseImpl implements CanPayWithBbvaPointsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EglobalRepository f84198a;

    /* JADX INFO: compiled from: CanPayWithBbvaPointsUseCase.kt */
    @DebugMetadata(c = "mx.openpay.library.domain.usecase.eglobal.CanPayWithBbvaPointsUseCaseImpl", f = "CanPayWithBbvaPointsUseCase.kt", i = {0}, l = {14}, m = "invoke", n = {"slotKey"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f84199p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f84200q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f84202s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f84200q0 = obj;
            this.f84202s0 |= Integer.MIN_VALUE;
            return CanPayWithBbvaPointsUseCaseImpl.this.invoke(null, null, this);
        }
    }

    public CanPayWithBbvaPointsUseCaseImpl(@NotNull EglobalRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84198a = repository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.usecase.eglobal.CanPayWithBbvaPointsUseCase
    @Nullable
    public Object invoke(@NotNull String str, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f84202s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f84202s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objIsBinToBbvaPoints = aVar.f84200q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f84202s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objIsBinToBbvaPoints);
            String strSubstring = str.substring(0, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            aVar.f84199p0 = str2;
            aVar.f84202s0 = 1;
            objIsBinToBbvaPoints = this.f84198a.isBinToBbvaPoints(strSubstring, aVar);
            if (objIsBinToBbvaPoints == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = aVar.f84199p0;
            ResultKt.throwOnFailure(objIsBinToBbvaPoints);
        }
        return (((Number) objIsBinToBbvaPoints).intValue() <= 0 || !Intrinsics.areEqual(str2, ExifInterface.GPS_MEASUREMENT_3D)) ? Boxing.boxBoolean(false) : Boxing.boxBoolean(true);
    }
}
