package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u00126\u0010\u0014\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00120\u0011\"\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/MultiLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "value", "", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", SetCommand.ID, "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "Lkotlin/Pair;", "", "entries", "<init>", "([Lkotlin/Pair;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class MultiLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SnapshotStateMap<ModifierLocal<?>, Object> f16726a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLocalMap(@NotNull Pair<? extends ModifierLocal<?>, ? extends Object>... entries) {
        super(null);
        Intrinsics.checkNotNullParameter(entries, "entries");
        SnapshotStateMap<ModifierLocal<?>, Object> snapshotStateMapMutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
        this.f16726a = snapshotStateMapMutableStateMapOf;
        snapshotStateMapMutableStateMapOf.putAll(q.toMap(entries));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f16726a.containsKey(key);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @Nullable
    public <T> T get$ui_release(@NotNull ModifierLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f16726a.get(key);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo3647set$ui_release(@NotNull ModifierLocal<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f16726a.put(key, value);
    }
}
