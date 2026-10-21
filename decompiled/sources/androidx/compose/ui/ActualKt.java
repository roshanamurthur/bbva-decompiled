package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import dk.e;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Actual.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¨\u0006\n"}, d2 = {"areObjectsOfSameType", "", "a", "", "b", "tryPopulateReflectively", "", "Landroidx/compose/ui/platform/InspectorInfo;", "element", "Landroidx/compose/ui/node/ModifierNodeElement;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,49:1\n6442#2:50\n33#3,6:51\n*S KotlinDebug\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n*L\n34#1:50\n35#1:51,6\n*E\n"})
public final class ActualKt {
    public static final boolean areObjectsOfSameType(@NotNull Object a10, @NotNull Object b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return a10.getClass() == b10.getClass();
    }

    public static final void tryPopulateReflectively(@NotNull InspectorInfo inspectorInfo, @NotNull ModifierNodeElement<?> element) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        Field[] declaredFields = element.getClass().getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "element.javaClass.declaredFields");
        List listSortedWith = ArraysKt___ArraysKt.sortedWith(declaredFields, new Comparator() { // from class: androidx.compose.ui.ActualKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(((Field) t10).getName(), ((Field) t11).getName());
            }
        });
        int size = listSortedWith.size();
        for (int i10 = 0; i10 < size; i10++) {
            Field field = (Field) listSortedWith.get(i10);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    ValueElementSequence valueElementSequence = inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "field.name");
                    valueElementSequence.set(name, field.get(element));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
