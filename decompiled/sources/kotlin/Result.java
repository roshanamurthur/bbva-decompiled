package kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import java.io.Serializable;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0013\b\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u0088\u0001\u001b\u0092\u0001\u0004\u0018\u00010\u0010¨\u0006 "}, d2 = {"Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "isSuccess-impl", "(Ljava/lang/Object;)Z", NetworkErrorFragment.IS_SUCCESS, "isFailure-impl", "isFailure", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "Failure", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@JvmInline
public final class Result<T> implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Object f79387p0;

    /* JADX INFO: compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/Result$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: Result.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure implements Serializable {

        @JvmField
        @NotNull
        public final Throwable exception;

        public Failure(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.exception + RootService.CLOSE_BRACKET;
        }
    }

    @PublishedApi
    public /* synthetic */ Result(Object obj) {
        this.f79387p0 = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Result m5534boximpl(Object obj) {
        return new Result(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m5536equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && Intrinsics.areEqual(obj, ((Result) obj2).getF79387p0());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5537equalsimpl0(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @Nullable
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m5538exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5539hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m5540isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m5541isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m5542toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m5536equalsimpl(this.f79387p0, obj);
    }

    public int hashCode() {
        return m5539hashCodeimpl(this.f79387p0);
    }

    @NotNull
    public String toString() {
        return m5542toStringimpl(this.f79387p0);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Object getF79387p0() {
        return this.f79387p0;
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m5535constructorimpl(@Nullable Object obj) {
        return obj;
    }
}
