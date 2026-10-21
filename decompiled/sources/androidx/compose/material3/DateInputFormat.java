package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/DateInputFormat;", "", "", "component1", "", "component2", "patternWithDelimiters", "delimiter", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getPatternWithDelimiters", "()Ljava/lang/String;", "b", "C", "getDelimiter", "()C", "c", "getPatternWithoutDelimiters", "patternWithoutDelimiters", "<init>", "(Ljava/lang/String;C)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DateInputFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String patternWithDelimiters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final char delimiter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String patternWithoutDelimiters;

    public DateInputFormat(@NotNull String patternWithDelimiters, char c10) {
        Intrinsics.checkNotNullParameter(patternWithDelimiters, "patternWithDelimiters");
        this.patternWithDelimiters = patternWithDelimiters;
        this.delimiter = c10;
        this.patternWithoutDelimiters = kotlin.text.l.replace$default(patternWithDelimiters, String.valueOf(c10), "", false, 4, (Object) null);
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i10 & 2) != 0) {
            c10 = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final char getDelimiter() {
        return this.delimiter;
    }

    @NotNull
    public final DateInputFormat copy(@NotNull String patternWithDelimiters, char delimiter) {
        Intrinsics.checkNotNullParameter(patternWithDelimiters, "patternWithDelimiters");
        return new DateInputFormat(patternWithDelimiters, delimiter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) other;
        return Intrinsics.areEqual(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    @NotNull
    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    @NotNull
    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + this.delimiter;
    }

    @NotNull
    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + RootService.CLOSE_BRACKET;
    }
}
