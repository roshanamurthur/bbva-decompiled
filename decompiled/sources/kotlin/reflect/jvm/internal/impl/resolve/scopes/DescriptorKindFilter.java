package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1855#2,2:262\n1726#2,3:264\n288#2,2:267\n1603#2,9:269\n1855#2:278\n1856#2:280\n1612#2:281\n1603#2,9:286\n1855#2:295\n1856#2:297\n1612#2:298\n766#2:303\n857#2,2:304\n1603#2,9:306\n1855#2:315\n1856#2:317\n1612#2:318\n1#3:279\n1#3:296\n1#3:316\n210#4:282\n210#4:299\n3792#5:283\n4307#5,2:284\n3792#5:300\n4307#5,2:301\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter\n*L\n98#1:262,2\n103#1:264,3\n129#1:267,2\n131#1:269,9\n131#1:278\n131#1:280\n131#1:281\n197#1:286,9\n197#1:295\n197#1:297\n197#1:298\n203#1:303\n203#1:304,2\n204#1:306,9\n204#1:315\n204#1:317\n204#1:318\n131#1:279\n197#1:296\n204#1:316\n196#1:282\n202#1:299\n196#1:283\n196#1:284,2\n202#1:300\n202#1:301,2\n*E\n"})
public final class DescriptorKindFilter {

    @JvmField
    @NotNull
    public static final DescriptorKindFilter ALL;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter CALLABLES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;

    @NotNull
    public static final Companion Companion;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter PACKAGES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter VALUES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter VARIABLES;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f81574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f81575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f81576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f81577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f81579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f81580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f81581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f81582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ArrayList f81583l;

    @NotNull
    public static final ArrayList m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<DescriptorKindExclude> f81584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81585b;

    /* JADX INFO: compiled from: MemberScope.kt */
    @SourceDebugExtension({"SMAP\nMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,261:1\n1#2:262\n3792#3:263\n4307#3,2:264\n*S KotlinDebug\n*F\n+ 1 MemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/DescriptorKindFilter$Companion\n*L\n210#1:263\n210#1:264,2\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: MemberScope.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f81586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f81587b;

            public a(int i10, @NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f81586a = i10;
                this.f81587b = name;
            }

            public final int getMask() {
                return this.f81586a;
            }

            @NotNull
            public final String getName() {
                return this.f81587b;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int access$nextMask(Companion companion) {
            companion.getClass();
            int i10 = DescriptorKindFilter.f81574c;
            DescriptorKindFilter.f81574c <<= 1;
            return i10;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.f81581j;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.f81582k;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.f81579h;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f81575d;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.f81578g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.f81576e;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.f81577f;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.f81580i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion.a aVar;
        Companion.a aVar2;
        Companion companion = new Companion(null);
        Companion = companion;
        f81574c = 1;
        int iAccess$nextMask = Companion.access$nextMask(companion);
        f81575d = iAccess$nextMask;
        int iAccess$nextMask2 = Companion.access$nextMask(companion);
        f81576e = iAccess$nextMask2;
        int iAccess$nextMask3 = Companion.access$nextMask(companion);
        f81577f = iAccess$nextMask3;
        int iAccess$nextMask4 = Companion.access$nextMask(companion);
        f81578g = iAccess$nextMask4;
        int iAccess$nextMask5 = Companion.access$nextMask(companion);
        f81579h = iAccess$nextMask5;
        int iAccess$nextMask6 = Companion.access$nextMask(companion);
        f81580i = iAccess$nextMask6;
        int iAccess$nextMask7 = Companion.access$nextMask(companion) - 1;
        f81581j = iAccess$nextMask7;
        int i10 = iAccess$nextMask | iAccess$nextMask2 | iAccess$nextMask3;
        f81582k = i10;
        int i11 = 2;
        ALL = new DescriptorKindFilter(iAccess$nextMask7, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        CALLABLES = new DescriptorKindFilter(iAccess$nextMask5 | iAccess$nextMask6, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iAccess$nextMask, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iAccess$nextMask2, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        TYPE_ALIASES = new DescriptorKindFilter(iAccess$nextMask3, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        CLASSIFIERS = new DescriptorKindFilter(i10, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        PACKAGES = new DescriptorKindFilter(iAccess$nextMask4, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        FUNCTIONS = new DescriptorKindFilter(iAccess$nextMask5, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        VARIABLES = new DescriptorKindFilter(iAccess$nextMask6, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        VALUES = new DescriptorKindFilter(iAccess$nextMask2 | iAccess$nextMask5 | iAccess$nextMask6, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                String name = field2.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                aVar2 = new Companion.a(descriptorKindFilter.f81585b, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f81583l = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.areEqual(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                aVar = new Companion.a(iIntValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        m = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i10, @NotNull List<? extends DescriptorKindExclude> excludes) {
        Intrinsics.checkNotNullParameter(excludes, "excludes");
        this.f81584a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((DescriptorKindExclude) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.f81585b = i10;
    }

    public final boolean acceptsKinds(int i10) {
        return (i10 & this.f81585b) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(DescriptorKindFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.areEqual(this.f81584a, descriptorKindFilter.f81584a) && this.f81585b == descriptorKindFilter.f81585b;
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.f81584a;
    }

    public final int getKindMask() {
        return this.f81585b;
    }

    public int hashCode() {
        return (this.f81584a.hashCode() * 31) + this.f81585b;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int i10) {
        int i11 = i10 & this.f81585b;
        if (i11 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i11, this.f81584a);
    }

    @NotNull
    public String toString() {
        Object next;
        Iterator it = f81583l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Companion.a) next).getMask() != this.f81585b);
        Companion.a aVar = (Companion.a) next;
        String name = aVar != null ? aVar.getName() : null;
        if (name == null) {
            ArrayList<Companion.a> arrayList = m;
            ArrayList arrayList2 = new ArrayList();
            for (Companion.a aVar2 : arrayList) {
                String name2 = acceptsKinds(aVar2.getMask()) ? aVar2.getName() : null;
                if (name2 != null) {
                    arrayList2.add(name2);
                }
            }
            name = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, " | ", null, null, 0, null, null, 62, null);
        }
        return a.c(ci.a.d("DescriptorKindFilter(", name, ", "), this.f81584a, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ DescriptorKindFilter(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
