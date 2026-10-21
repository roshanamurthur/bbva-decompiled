package com.bbva.glomohybrid.landing.domain.usecase;

import androidx.camera.core.processing.f;
import com.bbva.component.dm.settings.domain.model.ScheduledShutdown;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.bbva.glomoutils.time.DateExtensionsKt;
import com.bbva.glomoutils.usecase.UseCaseWithParams;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScheduledShutdownCheckerUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/usecase/ScheduledShutdownCheckerUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "", "params", "execute", "(Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;)Ljava/lang/Boolean;", "", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "pattern", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class ScheduledShutdownCheckerUseCase implements UseCaseWithParams<ScheduledShutdown, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pattern;

    /* JADX WARN: Multi-variable type inference failed */
    public ScheduledShutdownCheckerUseCase() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getPattern() {
        return this.pattern;
    }

    public ScheduledShutdownCheckerUseCase(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.pattern = pattern;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    @NotNull
    public Boolean execute(@Nullable ScheduledShutdown params) {
        if (params == null) {
            LoggerKt.logError$default("[ScheduledShutdownChecker] ScheduledShutdown is null. No shutdown scheduled.", null, null, 6, null);
            return Boolean.FALSE;
        }
        Date date = new Date();
        boolean z10 = false;
        try {
            if (params.getStart() != null && params.getEnd() != null) {
                String start = params.getStart();
                String str = this.pattern;
                Date date2 = start != null ? DateExtensionsKt.toDate(start, str) : null;
                String end = params.getEnd();
                Date date3 = end != null ? DateExtensionsKt.toDate(end, str) : null;
                if (date2 != null && date3 != null) {
                    if (date3.before(date2)) {
                        LoggerKt.logError$default("[ScheduledShutdownChecker] End date is before start date.", null, null, 6, null);
                        return Boolean.FALSE;
                    }
                    if (date.after(date2) && date.before(date3)) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                }
                LoggerKt.logError$default("[ScheduledShutdownChecker] Failed to parse start or end date.", null, null, 6, null);
                return Boolean.FALSE;
            }
            LoggerKt.logError$default("[ScheduledShutdownChecker] Missing one or both dates.", null, null, 6, null);
            return Boolean.FALSE;
        } catch (Exception e5) {
            LoggerKt.logError$default(f.d("[ScheduledShutdownChecker] Exception while parsing dates: ", e5.getMessage()), null, null, 6, null);
        }
    }

    public /* synthetic */ ScheduledShutdownCheckerUseCase(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ssXXX" : str);
    }
}
