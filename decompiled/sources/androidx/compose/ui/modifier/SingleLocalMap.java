package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0003\u001a\u00028\u0000H\u0090\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0090\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0014\u001a\u00020\u00112\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0090\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/modifier/SingleLocalMap;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "", "value", "", "forceValue$ui_release", "(Ljava/lang/Object;)V", "forceValue", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "set$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", SetCommand.ID, "get$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "get", "", "contains$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocal;)Z", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "<init>", "(Landroidx/compose/ui/modifier/ModifierLocal;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,208:1\n81#2:209\n107#2,2:210\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n41#1:209\n41#1:210,2\n*E\n"})
public final class SingleLocalMap extends ModifierLocalMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ModifierLocal<?> f16727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f16728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleLocalMap(@NotNull ModifierLocal<?> key) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        this.f16727a = key;
        this.f16728b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(@NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this.f16727a;
    }

    public final void forceValue$ui_release(@Nullable Object value) {
        this.f16728b.setValue(value);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    @Nullable
    public <T> T get$ui_release(@NotNull ModifierLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key != this.f16727a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        T value = this.f16728b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo3647set$ui_release(@NotNull ModifierLocal<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key != this.f16727a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f16728b.setValue(value);
    }
}
