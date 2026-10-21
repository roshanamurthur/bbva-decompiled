package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B$\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010\f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/material3/SearchBarColors;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/ui/graphics/Color;", "a", "J", "getContainerColor-0d7_KjU", "()J", "containerColor", "b", "getDividerColor-0d7_KjU", "dividerColor", "Landroidx/compose/material3/TextFieldColors;", "c", "Landroidx/compose/material3/TextFieldColors;", "getInputFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "inputFieldColors", "<init>", "(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SearchBarColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long containerColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long dividerColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextFieldColors inputFieldColors;

    public SearchBarColors(long j10, long j11, TextFieldColors inputFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(inputFieldColors, "inputFieldColors");
        this.containerColor = j10;
        this.dividerColor = j11;
        this.inputFieldColors = inputFieldColors;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SearchBarColors.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.material3.SearchBarColors");
        SearchBarColors searchBarColors = (SearchBarColors) other;
        return Color.m2509equalsimpl0(this.containerColor, searchBarColors.containerColor) && Color.m2509equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && Intrinsics.areEqual(this.inputFieldColors, searchBarColors.inputFieldColors);
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getDividerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    public int hashCode() {
        return this.inputFieldColors.hashCode() + androidx.collection.j.a(this.dividerColor, Color.m2515hashCodeimpl(this.containerColor) * 31, 31);
    }
}
