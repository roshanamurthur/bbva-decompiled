package androidx.compose.ui.text;

import bk.q;
import bk.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmAnnotatedString.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJvmAnnotatedString.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,80:1\n151#2,3:81\n33#2,4:84\n154#2,2:88\n38#2:90\n156#2:91\n151#2,3:92\n33#2,4:95\n154#2,2:99\n38#2:101\n156#2:102\n151#2,3:103\n33#2,4:106\n154#2,2:110\n38#2:112\n156#2:113\n33#2,4:117\n38#2:123\n108#3,3:114\n111#3,2:121\n113#3:124\n*S KotlinDebug\n*F\n+ 1 JvmAnnotatedString.jvm.kt\nandroidx/compose/ui/text/JvmAnnotatedString_jvmKt\n*L\n44#1:81,3\n44#1:84,4\n44#1:88,2\n44#1:90\n44#1:91\n48#1:92,3\n48#1:95,4\n48#1:99,2\n48#1:101\n48#1:102\n51#1:103,3\n51#1:106,4\n51#1:110,2\n51#1:112\n51#1:113\n73#1:117,4\n73#1:123\n73#1:114,3\n73#1:121,2\n73#1:124\n*E\n"})
public final class JvmAnnotatedString_jvmKt {

    /* JADX INFO: compiled from: JvmAnnotatedString.jvm.kt */
    public static final class a extends Lambda implements Function1<List<? extends Integer>, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f17609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<String, Integer, Integer, String> f17610q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ AnnotatedString f17611r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Map<Integer, Integer> f17612s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Ref.ObjectRef<String> objectRef, Function3<? super String, ? super Integer, ? super Integer, String> function3, AnnotatedString annotatedString, Map<Integer, Integer> map) {
            super(1);
            this.f17609p0 = objectRef;
            this.f17610q0 = function3;
            this.f17611r0 = annotatedString;
            this.f17612s0 = map;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(List<? extends Integer> list) {
            List<? extends Integer> list2 = list;
            Intrinsics.checkNotNullParameter(list2, "<name for destructuring parameter 0>");
            int iIntValue = list2.get(0).intValue();
            int iIntValue2 = list2.get(1).intValue();
            StringBuilder sb2 = new StringBuilder();
            Ref.ObjectRef<String> objectRef = this.f17609p0;
            sb2.append(objectRef.element);
            sb2.append(this.f17610q0.invoke(this.f17611r0.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
            objectRef.element = sb2.toString();
            return this.f17612s0.put(Integer.valueOf(iIntValue2), Integer.valueOf(objectRef.element.length()));
        }
    }

    public static final void a(List list, TreeSet treeSet) {
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i10);
                treeSet.add(Integer.valueOf(range.getStart()));
                treeSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final AnnotatedString transform(@NotNull AnnotatedString annotatedString, @NotNull Function3<? super String, ? super Integer, ? super Integer, String> transform) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        TreeSet treeSetSortedSetOf = v.sortedSetOf(0, Integer.valueOf(annotatedString.getText().length()));
        a(annotatedString.getSpanStylesOrNull$ui_text_release(), treeSetSortedSetOf);
        a(annotatedString.getParagraphStylesOrNull$ui_text_release(), treeSetSortedSetOf);
        a(annotatedString.getAnnotations$ui_text_release(), treeSetSortedSetOf);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Map mapMutableMapOf = q.mutableMapOf(TuplesKt.to(0, 0));
        CollectionsKt___CollectionsKt.windowed$default(treeSetSortedSetOf, 2, 0, false, new a(objectRef, transform, annotatedString, mapMutableMapOf), 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList3 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i10);
                SpanStyle item = range.getItem();
                Object obj = mapMutableMapOf.get(Integer.valueOf(range.getStart()));
                Intrinsics.checkNotNull(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = mapMutableMapOf.get(Integer.valueOf(range.getEnd()));
                Intrinsics.checkNotNull(obj2);
                arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size2 = paragraphStylesOrNull$ui_text_release.size();
            for (int i11 = 0; i11 < size2; i11++) {
                AnnotatedString.Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i11);
                ParagraphStyle item2 = range2.getItem();
                Object obj3 = mapMutableMapOf.get(Integer.valueOf(range2.getStart()));
                Intrinsics.checkNotNull(obj3);
                int iIntValue2 = ((Number) obj3).intValue();
                Object obj4 = mapMutableMapOf.get(Integer.valueOf(range2.getEnd()));
                Intrinsics.checkNotNull(obj4);
                arrayList2.add(new AnnotatedString.Range(item2, iIntValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList3 = new ArrayList(annotations$ui_text_release.size());
            int size3 = annotations$ui_text_release.size();
            for (int i12 = 0; i12 < size3; i12++) {
                AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i12);
                Object item3 = range3.getItem();
                Object obj5 = mapMutableMapOf.get(Integer.valueOf(range3.getStart()));
                Intrinsics.checkNotNull(obj5);
                int iIntValue3 = ((Number) obj5).intValue();
                Object obj6 = mapMutableMapOf.get(Integer.valueOf(range3.getEnd()));
                Intrinsics.checkNotNull(obj6);
                arrayList3.add(new AnnotatedString.Range(item3, iIntValue3, ((Number) obj6).intValue()));
            }
        }
        return new AnnotatedString((String) objectRef.element, arrayList, arrayList2, arrayList3);
    }
}
