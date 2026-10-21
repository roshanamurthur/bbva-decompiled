package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FunctionTypeKindExtractor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nFunctionTypeKindExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n1477#2:71\n1502#2,3:72\n1505#2,3:82\n1747#2,3:85\n372#3,7:75\n*S KotlinDebug\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n*L\n32#1:71\n32#1:72,3\n32#1:82,3\n54#1:85,3\n32#1:75,7\n*E\n"})
public final class FunctionTypeKindExtractor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FunctionTypeKindExtractor f80128c = new FunctionTypeKindExtractor(CollectionsKt__CollectionsKt.listOf((Object[]) new FunctionTypeKind[]{FunctionTypeKind.Function.INSTANCE, FunctionTypeKind.SuspendFunction.INSTANCE, FunctionTypeKind.KFunction.INSTANCE, FunctionTypeKind.KSuspendFunction.INSTANCE}));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<FunctionTypeKind> f80129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f80130b;

    /* JADX INFO: compiled from: FunctionTypeKindExtractor.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionTypeKindExtractor getDefault() {
            return FunctionTypeKindExtractor.f80128c;
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKindExtractor.kt */
    public static final class KindWithArity {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FunctionTypeKind f80131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f80132b;

        public KindWithArity(@NotNull FunctionTypeKind kind, int i10) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f80131a = kind;
            this.f80132b = i10;
        }

        @NotNull
        public final FunctionTypeKind component1() {
            return this.f80131a;
        }

        public final int component2() {
            return this.f80132b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KindWithArity)) {
                return false;
            }
            KindWithArity kindWithArity = (KindWithArity) obj;
            return Intrinsics.areEqual(this.f80131a, kindWithArity.f80131a) && this.f80132b == kindWithArity.f80132b;
        }

        @NotNull
        public final FunctionTypeKind getKind() {
            return this.f80131a;
        }

        public int hashCode() {
            return (this.f80131a.hashCode() * 31) + this.f80132b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
            sb2.append(this.f80131a);
            sb2.append(", arity=");
            return a.d(sb2, this.f80132b, RootService.CLOSE_BRACKET);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FunctionTypeKindExtractor(@NotNull List<? extends FunctionTypeKind> kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f80129a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            FqName packageFqName = ((FunctionTypeKind) obj).getPackageFqName();
            Object arrayList = linkedHashMap.get(packageFqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(packageFqName, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f80130b = linkedHashMap;
    }

    @Nullable
    public final FunctionTypeKind getFunctionalClassKind(@NotNull FqName packageFqName, @NotNull String className) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        KindWithArity functionalClassKindWithArity = getFunctionalClassKindWithArity(packageFqName, className);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    @Nullable
    public final KindWithArity getFunctionalClassKindWithArity(@NotNull FqName packageFqName, @NotNull String className) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<FunctionTypeKind> list = (List) this.f80130b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (FunctionTypeKind functionTypeKind : list) {
            int i10 = 0;
            if (l.startsWith$default(className, functionTypeKind.getClassNamePrefix(), false, 2, null)) {
                String strSubstring = className.substring(functionTypeKind.getClassNamePrefix().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length = strSubstring.length();
                int i11 = 0;
                while (true) {
                    if (i10 >= length) {
                        numValueOf = Integer.valueOf(i11);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i10) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i11 = (i11 * 10) + iCharAt;
                    i10++;
                }
                if (numValueOf != null) {
                    return new KindWithArity(functionTypeKind, numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
