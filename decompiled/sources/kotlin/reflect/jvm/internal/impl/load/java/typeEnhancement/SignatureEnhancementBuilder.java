package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.camera.core.processing.f;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SignatureEnhancementBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f80833a = new LinkedHashMap();

    @NotNull
    public final Map<String, PredefinedFunctionEnhancementInfo> build() {
        return this.f80833a;
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public final class ClassEnhancementBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f80834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SignatureEnhancementBuilder f80835b;

        public ClassEnhancementBuilder(@NotNull SignatureEnhancementBuilder signatureEnhancementBuilder, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f80835b = signatureEnhancementBuilder;
            this.f80834a = className;
        }

        public final void function(@NotNull String name, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Map map = this.f80835b.f80833a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name);
            block.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> pairBuild = functionEnhancementBuilder.build();
            map.put(pairBuild.getFirst(), pairBuild.getSecond());
        }

        @NotNull
        public final String getClassName() {
            return this.f80834a;
        }

        /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
        @SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1208#2,2:255\n1238#2,4:257\n1208#2,2:261\n1238#2,4:263\n1549#2:267\n1620#2,3:268\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n*L\n226#1:255,2\n226#1:257,4\n237#1:261,2\n237#1:263,4\n245#1:267\n245#1:268,3\n246#1:271\n246#1:272,3\n*E\n"})
        public final class FunctionEnhancementBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f80836a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final ArrayList f80837b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public Pair<String, TypeEnhancementInfo> f80838c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ClassEnhancementBuilder f80839d;

            public FunctionEnhancementBuilder(@NotNull ClassEnhancementBuilder classEnhancementBuilder, String functionName) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f80839d = classEnhancementBuilder;
                this.f80836a = functionName;
                this.f80837b = new ArrayList();
                this.f80838c = TuplesKt.to(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);
            }

            @NotNull
            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.f80839d.getClassName();
                ArrayList arrayList = this.f80837b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) ((Pair) it.next()).getFirst());
                }
                String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(this.f80836a, arrayList2, this.f80838c.getFirst()));
                TypeEnhancementInfo second = this.f80838c.getSecond();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((TypeEnhancementInfo) ((Pair) it2.next()).getSecond());
                }
                return TuplesKt.to(strSignature, new PredefinedFunctionEnhancementInfo(second, arrayList3));
            }

            public final void parameter(@NotNull String type, @NotNull JavaTypeQualifiers... qualifiers) {
                TypeEnhancementInfo typeEnhancementInfo;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                ArrayList arrayList = this.f80837b;
                if (qualifiers.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<IndexedValue> iterableWithIndex = ArraysKt___ArraysKt.withIndex(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(iterableWithIndex, 10, 16));
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                arrayList.add(TuplesKt.to(type, typeEnhancementInfo));
            }

            public final void returns(@NotNull String type, @NotNull JavaTypeQualifiers... qualifiers) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableWithIndex = ArraysKt___ArraysKt.withIndex(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(iterableWithIndex, 10, 16));
                for (IndexedValue indexedValue : iterableWithIndex) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (JavaTypeQualifiers) indexedValue.getValue());
                }
                this.f80838c = TuplesKt.to(type, new TypeEnhancementInfo(linkedHashMap));
            }

            public final void returns(@NotNull JvmPrimitiveType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                String desc = type.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
                this.f80838c = TuplesKt.to(desc, null);
            }
        }
    }
}
