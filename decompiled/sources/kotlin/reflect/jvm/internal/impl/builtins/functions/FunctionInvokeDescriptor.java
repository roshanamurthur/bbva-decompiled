package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n2624#2,3:162\n1549#2:165\n1620#2,3:166\n1726#2,3:169\n1549#2:172\n1620#2,3:173\n1747#2,3:176\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n*L\n63#1:162,3\n64#1:165\n64#1:166,3\n88#1:169,3\n92#1:172\n92#1:173,3\n106#1:176,3\n*E\n"})
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    @NotNull
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: compiled from: FunctionInvokeDescriptor.kt */
    @SourceDebugExtension({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n959#2,7:162\n1549#2:169\n1620#2,3:170\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n*L\n122#1:162,7\n124#1:169\n124#1:170,3\n*E\n"})
    public static final class Factory {
        public Factory() {
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FunctionInvokeDescriptor create(@NotNull FunctionClassDescriptor functionClass, boolean z10) {
            String lowerCase;
            Intrinsics.checkNotNullParameter(functionClass, "functionClass");
            List<TypeParameterDescriptor> declaredTypeParameters = functionClass.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z10, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClass.getThisAsReceiverParameter();
            List<ReceiverParameterDescriptor> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            List<? extends TypeParameterDescriptor> listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredTypeParameters) {
                if (((TypeParameterDescriptor) obj).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
            for (IndexedValue indexedValue : iterableWithIndex) {
                Factory factory = FunctionInvokeDescriptor.Factory;
                int index = indexedValue.getIndex();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) indexedValue.getValue();
                factory.getClass();
                String strAsString = typeParameterDescriptor.getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                if (Intrinsics.areEqual(strAsString, ExifInterface.GPS_DIRECTION_TRUE)) {
                    lowerCase = "instance";
                } else if (Intrinsics.areEqual(strAsString, ExifInterface.LONGITUDE_EAST)) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strAsString.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                Annotations empty = Annotations.Companion.getEMPTY();
                Name nameIdentifier = Name.identifier(lowerCase);
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
                SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                ReceiverParameterDescriptor receiverParameterDescriptor = thisAsReceiverParameter;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, index, empty, nameIdentifier, defaultType, false, false, false, null, NO_SOURCE));
                arrayList2 = arrayList3;
                thisAsReceiverParameter = receiverParameterDescriptor;
            }
            functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, listEmptyList, listEmptyList2, (List<ValueParameterDescriptor>) arrayList2, (KotlinType) ((TypeParameterDescriptor) CollectionsKt___CollectionsKt.last((List) declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
            functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
            return functionInvokeDescriptor;
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @NotNull
    public FunctionDescriptorImpl createSubstitutedCopy(@NotNull DeclarationDescriptor newOwner, @Nullable FunctionDescriptor functionDescriptor, @NotNull CallableMemberDescriptor.Kind kind, @Nullable Name name, @NotNull Annotations annotations, @NotNull SourceElement source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    @Nullable
    public FunctionDescriptor doSubstitute(@NotNull FunctionDescriptorImpl.CopyConfiguration configuration) {
        Name name;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.doSubstitute(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type) != null) {
                List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                List<ValueParameterDescriptor> list2 = valueParameters2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2));
                }
                int size = functionInvokeDescriptor.getValueParameters().size() - arrayList.size();
                boolean z10 = true;
                if (size == 0) {
                    List<ValueParameterDescriptor> valueParameters3 = functionInvokeDescriptor.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters3, "getValueParameters(...)");
                    List<Pair> listZip = CollectionsKt___CollectionsKt.zip(arrayList, valueParameters3);
                    if ((listZip instanceof Collection) && listZip.isEmpty()) {
                        return functionInvokeDescriptor;
                    }
                    for (Pair pair : listZip) {
                        if (!Intrinsics.areEqual((Name) pair.component1(), ((ValueParameterDescriptor) pair.component2()).getName())) {
                        }
                    }
                    return functionInvokeDescriptor;
                }
                List<ValueParameterDescriptor> valueParameters4 = functionInvokeDescriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters4, "getValueParameters(...)");
                List<ValueParameterDescriptor> list3 = valueParameters4;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                    Name name2 = valueParameterDescriptor.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    int index = valueParameterDescriptor.getIndex();
                    int i10 = index - size;
                    if (i10 >= 0 && (name = (Name) arrayList.get(i10)) != null) {
                        name2 = name;
                    }
                    arrayList2.add(valueParameterDescriptor.copy(functionInvokeDescriptor, name2, index));
                }
                FunctionDescriptorImpl.CopyConfiguration copyConfigurationNewCopyBuilder = functionInvokeDescriptor.newCopyBuilder(TypeSubstitutor.EMPTY);
                if (arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((Name) it3.next()) == null) {
                        }
                    }
                    z10 = false;
                }
                FunctionDescriptorImpl.CopyConfiguration original = copyConfigurationNewCopyBuilder.setHasSynthesizedParameterNames(z10).setValueParameters((List<ValueParameterDescriptor>) arrayList2).setOriginal((CallableMemberDescriptor) functionInvokeDescriptor.getOriginal());
                Intrinsics.checkNotNullExpressionValue(original, "setOriginal(...)");
                FunctionDescriptor functionDescriptorDoSubstitute = super.doSubstitute(original);
                Intrinsics.checkNotNull(functionDescriptorDoSubstitute);
                return functionDescriptorDoSubstitute;
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z10) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z10);
        setHasStableParameterNames(false);
    }
}
