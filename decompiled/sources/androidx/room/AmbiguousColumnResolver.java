package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.h0;
import bk.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "", "", "resultColumns", "mappings", "", "resolve", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "<init>", "()V", "a", "b", "Solution", "room-common"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,253:1\n1#2:254\n13579#3,2:255\n13644#3,3:257\n13644#3,2:260\n11335#3:262\n11670#3,2:263\n11672#3:267\n13646#3:268\n1855#4,2:265\n1726#4,3:269\n1549#4:272\n1620#4,3:273\n1855#4,2:278\n37#5,2:276\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n85#1:255,2\n87#1:257,3\n96#1:260,2\n118#1:262\n118#1:263,2\n118#1:267\n96#1:268\n120#1:265,2\n141#1:269,3\n151#1:272\n151#1:273,3\n188#1:278,2\n151#1:276,2\n*E\n"})
public final class AmbiguousColumnResolver {

    @NotNull
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    public static final class Solution implements Comparable<Solution> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public static final Companion f23094s0 = new Companion(null);

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @NotNull
        public static final Solution f23095t0 = new Solution(Integer.MAX_VALUE, Integer.MAX_VALUE, CollectionsKt__CollectionsKt.emptyList());

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final List<a> f23096p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f23097q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f23098r0;

        /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "", "Landroidx/room/AmbiguousColumnResolver$a;", "matches", "Landroidx/room/AmbiguousColumnResolver$Solution;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", "<init>", "()V", "room-common"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Solution build(@NotNull List<a> matches) {
                Intrinsics.checkNotNullParameter(matches, "matches");
                List<a> list = matches;
                int i10 = 0;
                int last = 0;
                for (a aVar : list) {
                    last += ((aVar.f23099a.getLast() - aVar.f23099a.getFirst()) + 1) - aVar.f23100b.size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((a) it.next()).f23099a.getFirst();
                while (it.hasNext()) {
                    int first2 = ((a) it.next()).f23099a.getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last2 = ((a) it2.next()).f23099a.getLast();
                while (it2.hasNext()) {
                    int last3 = ((a) it2.next()).f23099a.getLast();
                    if (last2 < last3) {
                        last2 = last3;
                    }
                }
                Iterable intRange = new IntRange(first, last2);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i12 = 0;
                        while (it4.hasNext()) {
                            if (((a) it4.next()).f23099a.contains(iNextInt)) {
                                i12++;
                            }
                            if (i12 > 1) {
                                i11++;
                                if (i11 >= 0) {
                                    break;
                                }
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                                break;
                            }
                        }
                    }
                    i10 = i11;
                }
                return new Solution(last, i10, matches);
            }

            @NotNull
            public final Solution getNO_SOLUTION() {
                return Solution.f23095t0;
            }
        }

        public Solution(int i10, int i11, @NotNull List matches) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.f23096p0 = matches;
            this.f23097q0 = i10;
            this.f23098r0 = i11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution solution) {
            Solution other = solution;
            Intrinsics.checkNotNullParameter(other, "other");
            int iCompare = Intrinsics.compare(this.f23098r0, other.f23098r0);
            return iCompare != 0 ? iCompare : Intrinsics.compare(this.f23097q0, other.f23097q0);
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final IntRange f23099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<Integer> f23100b;

        public a(@NotNull List resultIndices, @NotNull IntRange resultRange) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.f23099a = resultRange;
            this.f23100b = resultIndices;
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f23101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23102b;

        public b(@NotNull String name, int i10) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f23101a = name;
            this.f23102b = i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f23101a, bVar.f23101a) && this.f23102b == bVar.f23102b;
        }

        public final int hashCode() {
            return (this.f23101a.hashCode() * 31) + this.f23102b;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ResultColumn(name=");
            sb2.append(this.f23101a);
            sb2.append(", index=");
            return androidx.activity.a.d(sb2, this.f23102b, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n11335#2:254\n11670#2,2:255\n11672#2:259\n288#3,2:257\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$1\n*L\n102#1:254\n102#1:255,2\n102#1:259\n103#1:257,2\n*E\n"})
    public static final class c extends Lambda implements Function3<Integer, Integer, List<? extends b>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String[] f23103p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<List<a>> f23104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f23105r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String[] strArr, ArrayList arrayList, int i10) {
            super(3);
            this.f23103p0 = strArr;
            this.f23104q0 = arrayList;
            this.f23105r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Integer num2, List<? extends b> list) {
            Object next;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            List<? extends b> resultColumnsSublist = list;
            Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
            String[] strArr = this.f23103p0;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                Iterator<T> it = resultColumnsSublist.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(str, ((b) next).f23101a));
                b bVar = (b) next;
                if (bVar == null) {
                    return Unit.INSTANCE;
                }
                arrayList.add(Integer.valueOf(bVar.f23102b));
            }
            this.f23104q0.get(this.f23105r0).add(new a(arrayList, new IntRange(iIntValue, iIntValue2 - 1)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$resolve$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
    public static final class d extends Lambda implements Function1<List<? extends Integer>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<List<a>> f23106p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f23107q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ArrayList arrayList, int i10) {
            super(1);
            this.f23106p0 = arrayList;
            this.f23107q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends Integer> list) {
            List<? extends Integer> indices = list;
            Intrinsics.checkNotNullParameter(indices, "indices");
            List<? extends Integer> list2 = indices;
            Iterator<T> it = list2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue = ((Number) it.next()).intValue();
            while (it.hasNext()) {
                int iIntValue2 = ((Number) it.next()).intValue();
                if (iIntValue > iIntValue2) {
                    iIntValue = iIntValue2;
                }
            }
            Iterator<T> it2 = list2.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int iIntValue3 = ((Number) it2.next()).intValue();
            while (it2.hasNext()) {
                int iIntValue4 = ((Number) it2.next()).intValue();
                if (iIntValue3 < iIntValue4) {
                    iIntValue3 = iIntValue4;
                }
            }
            this.f23106p0.get(this.f23107q0).add(new a(indices, new IntRange(iIntValue, iIntValue3)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    public static final class e extends Lambda implements Function1<List<? extends a>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Solution> f23108p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.ObjectRef<Solution> objectRef) {
            super(1);
            this.f23108p0 = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [T, androidx.room.AmbiguousColumnResolver$Solution, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends a> list) {
            List<? extends a> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            ?? Build = Solution.f23094s0.build(it);
            Ref.ObjectRef<Solution> objectRef = this.f23108p0;
            Solution other = objectRef.element;
            Build.getClass();
            Intrinsics.checkNotNullParameter(other, "other");
            int iCompare = Intrinsics.compare(Build.f23098r0, other.f23098r0);
            if (iCompare == 0) {
                iCompare = Intrinsics.compare(Build.f23097q0, other.f23097q0);
            }
            if (iCompare < 0) {
                objectRef.element = Build;
            }
            return Unit.INSTANCE;
        }
    }

    public static void a(ArrayList arrayList, List list, int i10, Function1 function1) {
        if (i10 == arrayList.size()) {
            function1.invoke(CollectionsKt___CollectionsKt.toList(list));
            return;
        }
        Iterator it = ((Iterable) arrayList.get(i10)).iterator();
        while (it.hasNext()) {
            list.add(it.next());
            INSTANCE.getClass();
            a(arrayList, list, i10 + 1, function1);
            bk.g.removeLast(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    @NotNull
    public static final int[][] resolve(@NotNull String[] resultColumns, @NotNull String[][] mappings) {
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String strSubstring = resultColumns[i11];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale locale = Locale.US;
            resultColumns[i11] = androidx.room.a.d(locale, "US", strSubstring, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        int length2 = mappings.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int length3 = mappings[i12].length;
            for (int i13 = 0; i13 < length3; i13++) {
                String[] strArr = mappings[i12];
                String str = strArr[i13];
                Locale locale2 = Locale.US;
                strArr[i13] = androidx.room.a.d(locale2, "US", str, locale2, "this as java.lang.String).toLowerCase(locale)");
            }
        }
        Set setCreateSetBuilder = v.createSetBuilder();
        for (String[] strArr2 : mappings) {
            bk.g.addAll(setCreateSetBuilder, strArr2);
        }
        Set setBuild = v.build(setCreateSetBuilder);
        List listCreateListBuilder = bk.d.createListBuilder();
        int length4 = resultColumns.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length4) {
            String str2 = resultColumns[i14];
            int i16 = i15 + 1;
            if (setBuild.contains(str2)) {
                listCreateListBuilder.add(new b(str2, i15));
            }
            i14++;
            i15 = i16;
        }
        List<b> listBuild = bk.d.build(listCreateListBuilder);
        int length5 = mappings.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i17 = 0; i17 < length5; i17++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length6) {
            String[] strArr3 = mappings[i18];
            int i20 = i19 + 1;
            AmbiguousColumnResolver ambiguousColumnResolver = INSTANCE;
            c cVar = new c(strArr3, arrayList, i19);
            ambiguousColumnResolver.getClass();
            int length7 = strArr3.length;
            int i21 = i10;
            int iHashCode = i21;
            while (i21 < length7) {
                iHashCode += strArr3[i21].hashCode();
                i21++;
            }
            int length8 = strArr3.length;
            Iterator it = listBuild.subList(i10, length8).iterator();
            int iHashCode2 = i10;
            while (it.hasNext()) {
                iHashCode2 += ((b) it.next()).f23101a.hashCode();
            }
            int i22 = i10;
            while (true) {
                if (iHashCode == iHashCode2) {
                    cVar.invoke(Integer.valueOf(i22), Integer.valueOf(length8), listBuild.subList(i22, length8));
                }
                int i23 = i22 + 1;
                int i24 = length8 + 1;
                if (i24 > listBuild.size()) {
                    break;
                }
                iHashCode2 = (iHashCode2 - ((b) listBuild.get(i22)).f23101a.hashCode()) + ((b) listBuild.get(length8)).f23101a.hashCode();
                i22 = i23;
                length8 = i24;
            }
            if (((List) arrayList.get(i19)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                for (String str3 : strArr3) {
                    List listCreateListBuilder2 = bk.d.createListBuilder();
                    for (b bVar : listBuild) {
                        if (Intrinsics.areEqual(str3, bVar.f23101a)) {
                            listCreateListBuilder2.add(Integer.valueOf(bVar.f23102b));
                        }
                    }
                    List listBuild2 = bk.d.build(listCreateListBuilder2);
                    if (!(!listBuild2.isEmpty())) {
                        throw new IllegalStateException(h0.b("Column ", str3, " not found in result").toString());
                    }
                    arrayList2.add(listBuild2);
                }
                AmbiguousColumnResolver ambiguousColumnResolver2 = INSTANCE;
                d dVar = new d(arrayList, i19);
                ArrayList arrayList3 = new ArrayList();
                ambiguousColumnResolver2.getClass();
                a(arrayList2, arrayList3, 0, dVar);
            }
            i18++;
            i19 = i20;
            i10 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!(!((List) it2.next()).isEmpty())) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.f23094s0.getNO_SOLUTION();
        AmbiguousColumnResolver ambiguousColumnResolver3 = INSTANCE;
        e eVar = new e(objectRef);
        ArrayList arrayList4 = new ArrayList();
        ambiguousColumnResolver3.getClass();
        a(arrayList, arrayList4, 0, eVar);
        List<a> list = ((Solution) objectRef.element).f23096p0;
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList5.add(CollectionsKt___CollectionsKt.toIntArray(((a) it3.next()).f23100b));
        }
        return (int[][]) arrayList5.toArray(new int[0][]);
    }
}
