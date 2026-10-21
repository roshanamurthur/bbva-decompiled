package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import bk.p;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a-\u0010\n\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u001a#\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\f"}, d2 = {"", "generateSemanticsId", "Landroidx/compose/ui/Modifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", LogKeysKt.PROPERTIES, "semantics", "clearAndSetSemantics", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1179#2,2:209\n1253#2,4:211\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n205#1:209,2\n205#1:211,4\n*E\n"})
public final class SemanticsModifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f17519a = new AtomicInteger(0);

    public static final void access$addSemanticsPropertiesFrom(InspectorInfo inspectorInfo, SemanticsConfiguration semanticsConfiguration) {
        ValueElementSequence properties = inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(semanticsConfiguration, 10)), 16));
        for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> entry : semanticsConfiguration) {
            SemanticsPropertyKey<?> key = entry.getKey();
            Pair pair = TuplesKt.to(key.getName(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        properties.set(LogKeysKt.PROPERTIES, linkedHashMap);
    }

    @NotNull
    public static final Modifier clearAndSetSemantics(@NotNull Modifier modifier, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return modifier.then(new ClearAndSetSemanticsElement(properties));
    }

    public static final int generateSemanticsId() {
        return f17519a.addAndGet(1);
    }

    @NotNull
    public static final Modifier semantics(@NotNull Modifier modifier, boolean z10, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> properties) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return modifier.then(new AppendedSemanticsElement(z10, properties));
    }

    public static /* synthetic */ Modifier semantics$default(Modifier modifier, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return semantics(modifier, z10, function1);
    }
}
