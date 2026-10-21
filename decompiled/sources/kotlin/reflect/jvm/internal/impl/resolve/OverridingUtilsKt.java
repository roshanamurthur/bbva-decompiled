package kotlin.reflect.jvm.internal.impl.resolve;

import a.d;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: overridingUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1620#2,3:85\n847#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
public final class OverridingUtilsKt {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* JADX INFO: compiled from: overridingUtils.kt */
    public static final class a<H> extends Lambda implements Function1<H, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SmartSet<H> f81528p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SmartSet<H> smartSet) {
            super(1);
            this.f81528p0 = smartSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(H h4) {
            Intrinsics.checkNotNull(h4);
            this.f81528p0.add(h4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) linkedList);
            SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection<d> collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objFirst, linkedList, descriptorByHandle, new a(smartSetCreate2));
            Intrinsics.checkNotNullExpressionValue(collectionExtractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objSingle = CollectionsKt___CollectionsKt.single(collectionExtractMembersOverridableInBothWays);
                Intrinsics.checkNotNullExpressionValue(objSingle, "single(...)");
                smartSetCreate.add(objSingle);
            } else {
                d dVar = (Object) OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                Intrinsics.checkNotNullExpressionValue(dVar, "selectMostSpecificMember(...)");
                CallableDescriptor callableDescriptorInvoke = descriptorByHandle.invoke(dVar);
                for (d dVar2 : collectionExtractMembersOverridableInBothWays) {
                    Intrinsics.checkNotNull(dVar2);
                    if (!OverridingUtil.isMoreSpecific(callableDescriptorInvoke, descriptorByHandle.invoke(dVar2))) {
                        smartSetCreate2.add(dVar2);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(dVar);
            }
        }
        return smartSetCreate;
    }
}
