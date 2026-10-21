package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModifierLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getDefaultFactory$ui_release", "()Lkotlin/jvm/functions/Function0;", "defaultFactory", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<T> defaultFactory;

    public ModifierLocal() {
        throw null;
    }

    public ModifierLocal(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this.defaultFactory = function0;
    }

    @NotNull
    public final Function0<T> getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }
}
