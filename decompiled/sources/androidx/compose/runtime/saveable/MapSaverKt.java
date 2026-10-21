package androidx.compose.runtime.saveable;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapSaver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ax\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00022:\u0010\u0004\u001a6\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n0\u0005¢\u0006\u0002\b\f2\"\u0010\r\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e¨\u0006\u000f"}, d2 = {"mapSaver", "Landroidx/compose/runtime/saveable/Saver;", ExifInterface.GPS_DIRECTION_TRUE, "", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "", "", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MapSaverKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: MapSaver.kt */
    @SourceDebugExtension({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
    public static final class a<T> extends Lambda implements Function2<SaverScope, T, List<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<SaverScope, T, Map<String, Object>> f15196p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> function2) {
            super(2);
            this.f15196p0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(SaverScope saverScope, Object obj) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : this.f15196p0.invoke(saverScope, obj).entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: MapSaver.kt */
    @SourceDebugExtension({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    public static final class b<T> extends Lambda implements Function1<List<? extends Object>, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Map<String, ? extends Object>, T> f15197p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
            super(1);
            this.f15197p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list2.size() % 2 != 0) {
                throw new IllegalStateException("non-zero remainder".toString());
            }
            for (int i10 = 0; i10 < list2.size(); i10 += 2) {
                Object obj = list2.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list2.get(i10 + 1));
            }
            return this.f15197p0.invoke(linkedHashMap);
        }
    }

    @NotNull
    public static final <T> Saver<T, Object> mapSaver(@NotNull Function2<? super SaverScope, ? super T, ? extends Map<String, ? extends Object>> function2, @NotNull Function1<? super Map<String, ? extends Object>, ? extends T> function1) {
        return ListSaverKt.listSaver(new a(function2), new b(function1));
    }
}
