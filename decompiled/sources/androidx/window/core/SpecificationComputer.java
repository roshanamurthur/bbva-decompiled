package androidx.window.core;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.glomohybrid.logs.LogKeysKt;
import k3.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u000f*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H\u0004J/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\t\u001a\u00020\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH&¨\u0006\u0011"}, d2 = {"Landroidx/window/core/SpecificationComputer;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "compute", "()Ljava/lang/Object;", "createMessage", "", "value", "message", "require", LandingAEMContentMapper.CONDITION, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "VerificationMode", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class SpecificationComputer<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0001*\u0002H\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "()V", "startSpecification", "Landroidx/window/core/SpecificationComputer;", ExifInterface.GPS_DIRECTION_TRUE, LogKeysKt.TAG, "", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "logger", "Landroidx/window/core/Logger;", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/Logger;)Landroidx/window/core/SpecificationComputer;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i10 & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        @NotNull
        public final <T> SpecificationComputer<T> startSpecification(@NotNull T t10, @NotNull String tag, @NotNull VerificationMode verificationMode, @NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(t10, "<this>");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new a(t10, tag, verificationMode, logger);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class VerificationMode {
        private static final /* synthetic */ VerificationMode[] $VALUES;
        public static final VerificationMode LOG;
        public static final VerificationMode QUIET;
        public static final VerificationMode STRICT;

        static {
            VerificationMode verificationMode = new VerificationMode("STRICT", 0);
            STRICT = verificationMode;
            VerificationMode verificationMode2 = new VerificationMode("LOG", 1);
            LOG = verificationMode2;
            VerificationMode verificationMode3 = new VerificationMode("QUIET", 2);
            QUIET = verificationMode3;
            $VALUES = new VerificationMode[]{verificationMode, verificationMode2, verificationMode3};
        }

        public VerificationMode() {
            throw null;
        }

        public static VerificationMode valueOf(String str) {
            return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
        }

        public static VerificationMode[] values() {
            return (VerificationMode[]) $VALUES.clone();
        }
    }

    @Nullable
    public abstract T compute();

    @NotNull
    public final String createMessage(@NotNull Object value, @NotNull String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    @NotNull
    public abstract SpecificationComputer<T> require(@NotNull String message, @NotNull Function1<? super T, Boolean> condition);
}
