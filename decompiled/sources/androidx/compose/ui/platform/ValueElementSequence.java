package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "", "iterator", "", "name", "", "value", "", SetCommand.ID, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class ValueElementSequence implements Sequence<ValueElement> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f17308a = new ArrayList();

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<ValueElement> iterator() {
        return this.f17308a.iterator();
    }

    public final void set(@NotNull String name, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17308a.add(new ValueElement(name, value));
    }
}
