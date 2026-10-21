package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import bk.d;
import bk.w;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KClassImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001gB\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\be\u0010fJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0016J\u0013\u0010\u0015\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR'\u0010%\u001a\u0012\u0012\u000e\u0012\f0 R\b\u0012\u0004\u0012\u00028\u00000\u00000\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001e\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00106\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000070\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010-R\u001e\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010-R\u0016\u0010>\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020B0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010)R\"\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010)R\u0016\u0010J\u001a\u0004\u0018\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010LR\u0014\u0010O\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010LR\u0014\u0010P\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010LR\u0014\u0010Q\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010LR\u0014\u0010R\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0014\u0010S\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010LR\u001a\u0010T\u001a\u00020\u00128VX\u0096\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\bT\u0010LR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010a¨\u0006h"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", FirebaseAnalytics.Param.INDEX, "getLocalProperty", "value", "", "isInstance", "other", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Ljava/lang/Class;", "r0", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "s0", "Lkotlin/Lazy;", "getData", "()Lkotlin/Lazy;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "getSimpleName", "()Ljava/lang/String;", "simpleName", "getQualifiedName", "qualifiedName", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "isSealed", "isData", "isInner", "isCompanion", "isFun", "isValue", "isValue$annotations", "()V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "<init>", "(Ljava/lang/Class;)V", "Data", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<T> jClass;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy<KClassImpl<T>.Data> data;

    /* JADX INFO: compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b?\u0010@R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\rR-\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0016R#\u0010#\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010!R!\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR!\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR)\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a0\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\bR%\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0016R%\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u0016R%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\u0016R%\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\u0016R%\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0016¨\u0006A"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "", "", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "e", "getSimpleName", "()Ljava/lang/String;", "simpleName", "f", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KFunction;", "g", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "h", "getNestedClasses", "nestedClasses", "i", "Lkotlin/Lazy;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "j", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "k", "getSupertypes", "supertypes", "l", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "m", "getDeclaredNonStaticMembers", "declaredNonStaticMembers", "q", "getAllNonStaticMembers", "allNonStaticMembers", "r", "getAllStaticMembers", "allStaticMembers", "s", "getDeclaredMembers", "declaredMembers", "t", "getAllMembers", "allMembers", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f79896u = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "annotations", "getAnnotations()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "simpleName", "getSimpleName()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "constructors", "getConstructors()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "supertypes", "getSupertypes()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Data.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal annotations;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal simpleName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal qualifiedName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal constructors;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal nestedClasses;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Lazy objectInstance;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal typeParameters;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal supertypes;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal sealedSubclasses;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal declaredNonStaticMembers;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79907n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79908o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public final ReflectProperties.LazySoftVal f79909p;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal allNonStaticMembers;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal allStaticMembers;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal declaredMembers;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal allMembers;

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class a extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79914p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(KClassImpl<T>.Data data) {
                super(0);
                this.f79914p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T>.Data data = this.f79914p0;
                return CollectionsKt___CollectionsKt.plus((Collection) data.getAllNonStaticMembers(), (Iterable) data.getAllStaticMembers());
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class b extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79915p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(KClassImpl<T>.Data data) {
                super(0);
                this.f79915p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T>.Data data = this.f79915p0;
                return CollectionsKt___CollectionsKt.plus((Collection) data.getDeclaredNonStaticMembers(), (Iterable) Data.access$getInheritedNonStaticMembers(data));
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class c extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79916p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(KClassImpl<T>.Data data) {
                super(0);
                this.f79916p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T>.Data data = this.f79916p0;
                return CollectionsKt___CollectionsKt.plus(Data.access$getDeclaredStaticMembers(data), (Iterable) Data.access$getInheritedStaticMembers(data));
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class d extends Lambda implements Function0<List<? extends Annotation>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79917p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(KClassImpl<T>.Data data) {
                super(0);
                this.f79917p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return UtilKt.computeAnnotations(this.f79917p0.getDescriptor());
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        @SourceDebugExtension({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$constructors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1549#2:363\n1620#2,3:364\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$constructors$2\n*L\n105#1:363\n105#1:364,3\n*E\n"})
        public static final class e extends Lambda implements Function0<List<? extends KFunction<? extends T>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79918p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79918p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KFunction<T>> invoke() {
                KClassImpl<T> kClassImpl = this.f79918p0;
                Collection<ConstructorDescriptor> constructorDescriptors = kClassImpl.getConstructorDescriptors();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(constructorDescriptors, 10));
                Iterator<T> it = constructorDescriptors.iterator();
                while (it.hasNext()) {
                    arrayList.add(new KFunctionImpl(kClassImpl, (ConstructorDescriptor) it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class f extends Lambda implements Function0<List<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79919p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(KClassImpl<T>.Data data) {
                super(0);
                this.f79919p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T>.Data data = this.f79919p0;
                return CollectionsKt___CollectionsKt.plus((Collection) data.getDeclaredNonStaticMembers(), (Iterable) Data.access$getDeclaredStaticMembers(data));
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class g extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79920p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79920p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f79920p0;
                return kClassImpl.getMembers(kClassImpl.getMemberScope$kotlin_reflection(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class h extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79921p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79921p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f79921p0;
                return kClassImpl.getMembers(kClassImpl.getStaticScope$kotlin_reflection(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class i extends Lambda implements Function0<ClassDescriptor> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79922p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79922p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ClassDescriptor invoke() {
                KClassImpl<T> kClassImpl = this.f79922p0;
                ClassId classIdAccess$getClassId = KClassImpl.access$getClassId(kClassImpl);
                RuntimeModuleData moduleData = kClassImpl.getData().getValue().getModuleData();
                ClassDescriptor classDescriptorDeserializeClass = (classIdAccess$getClassId.isLocal() && kClassImpl.getJClass().isAnnotationPresent(Metadata.class)) ? moduleData.getDeserialization().deserializeClass(classIdAccess$getClassId) : FindClassInModuleKt.findClassAcrossModuleDependencies(moduleData.getModule(), classIdAccess$getClassId);
                return classDescriptorDeserializeClass == null ? KClassImpl.access$createSyntheticClassOrFail(kClassImpl, classIdAccess$getClassId, moduleData) : classDescriptorDeserializeClass;
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class j extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79923p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79923p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f79923p0;
                return kClassImpl.getMembers(kClassImpl.getMemberScope$kotlin_reflection(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class k extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79924p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79924p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Collection<? extends KCallableImpl<?>> invoke() {
                KClassImpl<T> kClassImpl = this.f79924p0;
                return kClassImpl.getMembers(kClassImpl.getStaticScope$kotlin_reflection(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        @SourceDebugExtension({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$nestedClasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n819#2:363\n847#2,2:364\n1603#2,9:366\n1855#2:375\n1856#2:378\n1612#2:379\n1#3:376\n1#3:377\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$nestedClasses$2\n*L\n111#1:363\n111#1:364,2\n112#1:366,9\n112#1:375\n112#1:378\n112#1:379\n112#1:377\n*E\n"})
        public static final class l extends Lambda implements Function0<List<? extends KClassImpl<? extends Object>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79925p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(KClassImpl<T>.Data data) {
                super(0);
                this.f79925p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KClassImpl<? extends Object>> invoke() {
                MemberScope unsubstitutedInnerClassesScope = this.f79925p0.getDescriptor().getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "getUnsubstitutedInnerClassesScope(...)");
                Collection contributedDescriptors$default = ResolutionScope.DefaultImpls.getContributedDescriptors$default(unsubstitutedInnerClassesScope, null, null, 3, null);
                ArrayList<DeclarationDescriptor> arrayList = new ArrayList();
                for (T t10 : contributedDescriptors$default) {
                    if (!DescriptorUtils.isEnumEntry((DeclarationDescriptor) t10)) {
                        arrayList.add(t10);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (DeclarationDescriptor declarationDescriptor : arrayList) {
                    ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptor : null;
                    Class<?> javaClass = classDescriptor != null ? UtilKt.toJavaClass(classDescriptor) : null;
                    KClassImpl kClassImpl = javaClass != null ? new KClassImpl(javaClass) : null;
                    if (kClassImpl != null) {
                        arrayList2.add(kClassImpl);
                    }
                }
                return arrayList2;
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class m extends Lambda implements Function0<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79926p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79927q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
                super(0);
                this.f79926p0 = data;
                this.f79927q0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final T invoke() {
                ClassDescriptor descriptor = this.f79926p0.getDescriptor();
                if (descriptor.getKind() != ClassKind.OBJECT) {
                    return null;
                }
                boolean zIsCompanionObject = descriptor.isCompanionObject();
                KClassImpl<T> kClassImpl = this.f79927q0;
                T t10 = (T) ((!zIsCompanionObject || CompanionObjectMappingUtilsKt.isMappedIntrinsicCompanionObject(CompanionObjectMapping.INSTANCE, descriptor)) ? kClassImpl.getJClass().getDeclaredField("INSTANCE") : kClassImpl.getJClass().getEnclosingClass().getDeclaredField(descriptor.getName().asString())).get(null);
                Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return t10;
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class n extends Lambda implements Function0<String> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79928p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(KClassImpl<T> kClassImpl) {
                super(0);
                this.f79928p0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                KClassImpl<T> kClassImpl = this.f79928p0;
                if (kClassImpl.getJClass().isAnonymousClass()) {
                    return null;
                }
                ClassId classIdAccess$getClassId = KClassImpl.access$getClassId(kClassImpl);
                if (classIdAccess$getClassId.isLocal()) {
                    return null;
                }
                return classIdAccess$getClassId.asSingleFqName().asString();
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        @SourceDebugExtension({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$sealedSubclasses$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n1603#2,9:363\n1855#2:372\n1856#2:375\n1612#2:376\n1#3:373\n1#3:374\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$sealedSubclasses$2\n*L\n165#1:363,9\n165#1:372\n165#1:375\n165#1:376\n165#1:374\n*E\n"})
        public static final class o extends Lambda implements Function0<List<? extends KClassImpl<? extends T>>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79929p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(KClassImpl<T>.Data data) {
                super(0);
                this.f79929p0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<KClassImpl<? extends T>> invoke() {
                Collection<ClassDescriptor> sealedSubclasses = this.f79929p0.getDescriptor().getSealedSubclasses();
                Intrinsics.checkNotNullExpressionValue(sealedSubclasses, "getSealedSubclasses(...)");
                ArrayList arrayList = new ArrayList();
                for (ClassDescriptor classDescriptor : sealedSubclasses) {
                    Intrinsics.checkNotNull(classDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                    KClassImpl kClassImpl = javaClass != null ? new KClassImpl(javaClass) : null;
                    if (kClassImpl != null) {
                        arrayList.add(kClassImpl);
                    }
                }
                return arrayList;
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        public static final class p extends Lambda implements Function0<String> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79930p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79931q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(Data data, KClassImpl kClassImpl) {
                super(0);
                this.f79930p0 = kClassImpl;
                this.f79931q0 = data;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                KClassImpl<T> kClassImpl = this.f79930p0;
                if (kClassImpl.getJClass().isAnonymousClass()) {
                    return null;
                }
                ClassId classIdAccess$getClassId = KClassImpl.access$getClassId(kClassImpl);
                if (classIdAccess$getClassId.isLocal()) {
                    return Data.access$calculateLocalClassName(this.f79931q0, kClassImpl.getJClass());
                }
                String strAsString = classIdAccess$getClassId.getShortClassName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                return strAsString;
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        @SourceDebugExtension({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1620#2,3:363\n1726#2,3:366\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$supertypes$2\n*L\n138#1:363,3\n155#1:366,3\n*E\n"})
        public static final class q extends Lambda implements Function0<List<? extends KTypeImpl>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79932p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79933q0;

            /* JADX INFO: compiled from: KClassImpl.kt */
            public static final class a extends Lambda implements Function0<Type> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ KotlinType f79934p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ KClassImpl<T>.Data f79935q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ KClassImpl<T> f79936r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(KotlinType kotlinType, KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
                    super(0);
                    this.f79934p0 = kotlinType;
                    this.f79935q0 = data;
                    this.f79936r0 = kClassImpl;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Type invoke() {
                    ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = this.f79934p0.getConstructor().mo5778getDeclarationDescriptor();
                    if (!(classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor)) {
                        throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorMo5778getDeclarationDescriptor);
                    }
                    Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
                    KClassImpl<T>.Data data = this.f79935q0;
                    if (javaClass == null) {
                        throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + classifierDescriptorMo5778getDeclarationDescriptor);
                    }
                    KClassImpl<T> kClassImpl = this.f79936r0;
                    if (Intrinsics.areEqual(kClassImpl.getJClass().getSuperclass(), javaClass)) {
                        Type genericSuperclass = kClassImpl.getJClass().getGenericSuperclass();
                        Intrinsics.checkNotNull(genericSuperclass);
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = kClassImpl.getJClass().getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                    int iIndexOf = ArraysKt___ArraysKt.indexOf(interfaces, javaClass);
                    if (iIndexOf >= 0) {
                        Type type = kClassImpl.getJClass().getGenericInterfaces()[iIndexOf];
                        Intrinsics.checkNotNull(type);
                        return type;
                    }
                    throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + classifierDescriptorMo5778getDeclarationDescriptor);
                }
            }

            /* JADX INFO: compiled from: KClassImpl.kt */
            public static final class b extends Lambda implements Function0<Type> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public static final b f79937p0 = new b(0);

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Type invoke() {
                    return Object.class;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
                super(0);
                this.f79932p0 = data;
                this.f79933q0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeImpl> invoke() {
                KClassImpl<T>.Data data = this.f79932p0;
                Collection<KotlinType> supertypes = data.getDescriptor().getTypeConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                ArrayList arrayList = new ArrayList(supertypes.size());
                for (KotlinType kotlinType : supertypes) {
                    Intrinsics.checkNotNull(kotlinType);
                    arrayList.add(new KTypeImpl(kotlinType, new a(kotlinType, data, this.f79933q0)));
                }
                if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(data.getDescriptor())) {
                    if (arrayList.isEmpty()) {
                        SimpleType anyType = DescriptorUtilsKt.getBuiltIns(data.getDescriptor()).getAnyType();
                        Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
                        arrayList.add(new KTypeImpl(anyType, b.f79937p0));
                    } else {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            ClassKind kind = DescriptorUtils.getClassDescriptorForType(((KTypeImpl) it.next()).getF80013p0()).getKind();
                            Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
                            if (kind == ClassKind.INTERFACE || kind == ClassKind.ANNOTATION_CLASS) {
                            }
                        }
                        SimpleType anyType2 = DescriptorUtilsKt.getBuiltIns(data.getDescriptor()).getAnyType();
                        Intrinsics.checkNotNullExpressionValue(anyType2, "getAnyType(...)");
                        arrayList.add(new KTypeImpl(anyType2, b.f79937p0));
                    }
                }
                return CollectionsKt.compact(arrayList);
            }
        }

        /* JADX INFO: compiled from: KClassImpl.kt */
        @SourceDebugExtension({"SMAP\nKClassImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$typeParameters$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1549#2:363\n1620#2,3:364\n*S KotlinDebug\n*F\n+ 1 KClassImpl.kt\nkotlin/reflect/jvm/internal/KClassImpl$Data$typeParameters$2\n*L\n132#1:363\n132#1:364,3\n*E\n"})
        public static final class r extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T>.Data f79938p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ KClassImpl<T> f79939q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(KClassImpl<T>.Data data, KClassImpl<T> kClassImpl) {
                super(0);
                this.f79938p0 = data;
                this.f79939q0 = kClassImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeParameterImpl> invoke() {
                List<TypeParameterDescriptor> declaredTypeParameters = this.f79938p0.getDescriptor().getDeclaredTypeParameters();
                Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
                List<TypeParameterDescriptor> list = declaredTypeParameters;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    Intrinsics.checkNotNull(typeParameterDescriptor);
                    arrayList.add(new KTypeParameterImpl(this.f79939q0, typeParameterDescriptor));
                }
                return arrayList;
            }
        }

        public Data(KClassImpl kClassImpl) {
            super(kClassImpl);
            this.f79897c = ReflectProperties.lazySoft(new i(kClassImpl));
            this.annotations = ReflectProperties.lazySoft(new d(this));
            this.simpleName = ReflectProperties.lazySoft(new p(this, kClassImpl));
            this.qualifiedName = ReflectProperties.lazySoft(new n(kClassImpl));
            this.constructors = ReflectProperties.lazySoft(new e(kClassImpl));
            this.nestedClasses = ReflectProperties.lazySoft(new l(this));
            this.objectInstance = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new m(this, kClassImpl));
            this.typeParameters = ReflectProperties.lazySoft(new r(this, kClassImpl));
            this.supertypes = ReflectProperties.lazySoft(new q(this, kClassImpl));
            this.sealedSubclasses = ReflectProperties.lazySoft(new o(this));
            this.declaredNonStaticMembers = ReflectProperties.lazySoft(new g(kClassImpl));
            this.f79907n = ReflectProperties.lazySoft(new h(kClassImpl));
            this.f79908o = ReflectProperties.lazySoft(new j(kClassImpl));
            this.f79909p = ReflectProperties.lazySoft(new k(kClassImpl));
            this.allNonStaticMembers = ReflectProperties.lazySoft(new b(this));
            this.allStaticMembers = ReflectProperties.lazySoft(new c(this));
            this.declaredMembers = ReflectProperties.lazySoft(new f(this));
            this.allMembers = ReflectProperties.lazySoft(new a(this));
        }

        public static final String access$calculateLocalClassName(Data data, Class cls) {
            data.getClass();
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt__StringsKt.substringAfter$default(simpleName, enclosingMethod.getName() + Typography.dollar, (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                Intrinsics.checkNotNull(simpleName);
                return StringsKt__StringsKt.substringAfter$default(simpleName, Typography.dollar, (String) null, 2, (Object) null);
            }
            Intrinsics.checkNotNull(simpleName);
            return StringsKt__StringsKt.substringAfter$default(simpleName, enclosingConstructor.getName() + Typography.dollar, (String) null, 2, (Object) null);
        }

        public static final Collection access$getDeclaredStaticMembers(Data data) {
            data.getClass();
            T value = data.f79907n.getValue(data, f79896u[10]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        public static final Collection access$getInheritedNonStaticMembers(Data data) {
            data.getClass();
            T value = data.f79908o.getValue(data, f79896u[11]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        public static final Collection access$getInheritedStaticMembers(Data data) {
            data.getClass();
            T value = data.f79909p.getValue(data, f79896u[12]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllMembers() {
            T value = this.allMembers.getValue(this, f79896u[16]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllNonStaticMembers() {
            T value = this.allNonStaticMembers.getValue(this, f79896u[13]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getAllStaticMembers() {
            T value = this.allStaticMembers.getValue(this, f79896u[14]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final List<Annotation> getAnnotations() {
            T value = this.annotations.getValue(this, f79896u[1]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (List) value;
        }

        @NotNull
        public final Collection<KFunction<T>> getConstructors() {
            T value = this.constructors.getValue(this, f79896u[4]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredMembers() {
            T value = this.declaredMembers.getValue(this, f79896u[15]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final Collection<KCallableImpl<?>> getDeclaredNonStaticMembers() {
            T value = this.declaredNonStaticMembers.getValue(this, f79896u[9]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @NotNull
        public final ClassDescriptor getDescriptor() {
            T value = this.f79897c.getValue(this, f79896u[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (ClassDescriptor) value;
        }

        @NotNull
        public final Collection<KClass<?>> getNestedClasses() {
            T value = this.nestedClasses.getValue(this, f79896u[5]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (Collection) value;
        }

        @Nullable
        public final T getObjectInstance() {
            return (T) this.objectInstance.getValue();
        }

        @Nullable
        public final String getQualifiedName() {
            return (String) this.qualifiedName.getValue(this, f79896u[3]);
        }

        @NotNull
        public final List<KClass<? extends T>> getSealedSubclasses() {
            T value = this.sealedSubclasses.getValue(this, f79896u[8]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (List) value;
        }

        @Nullable
        public final String getSimpleName() {
            return (String) this.simpleName.getValue(this, f79896u[2]);
        }

        @NotNull
        public final List<KType> getSupertypes() {
            T value = this.supertypes.getValue(this, f79896u[7]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (List) value;
        }

        @NotNull
        public final List<KTypeParameter> getTypeParameters() {
            T value = this.typeParameters.getValue(this, f79896u[6]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (List) value;
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    public static final class a extends Lambda implements Function0<KClassImpl<T>.Data> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KClassImpl<T> f79940p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClassImpl<T> kClassImpl) {
            super(0);
            this.f79940p0 = kClassImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final KClassImpl<T>.Data invoke() {
            return new Data(this.f79940p0);
        }
    }

    /* JADX INFO: compiled from: KClassImpl.kt */
    public /* synthetic */ class b extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f79941p0 = new b(2);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MemberDeserializer.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final PropertyDescriptor invoke(@NotNull MemberDeserializer p4, @NotNull ProtoBuf.Property p10) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return p4.loadProperty(p10);
        }
    }

    public KClassImpl(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
        this.data = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a(this));
    }

    public static final ClassDescriptor access$createSyntheticClassOrFail(KClassImpl kClassImpl, ClassId classId, RuntimeModuleData runtimeModuleData) {
        KotlinClassHeader classHeader;
        if (kClassImpl.getJClass().isSynthetic()) {
            return g(classId, runtimeModuleData);
        }
        ReflectKotlinClass reflectKotlinClassCreate = ReflectKotlinClass.Factory.create(kClassImpl.getJClass());
        KotlinClassHeader.Kind kind = (reflectKotlinClassCreate == null || (classHeader = reflectKotlinClassCreate.getClassHeader()) == null) ? null : classHeader.getKind();
        switch (kind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + kClassImpl.getJClass() + " (kind = " + kind + RootService.CLOSE_BRACKET);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return g(classId, runtimeModuleData);
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + kClassImpl.getJClass() + " (kind = " + kind + RootService.CLOSE_BRACKET);
        }
    }

    public static final ClassId access$getClassId(KClassImpl kClassImpl) {
        kClassImpl.getClass();
        return RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(kClassImpl.getJClass());
    }

    public static ClassDescriptorImpl g(ClassId classId, RuntimeModuleData runtimeModuleData) {
        ModuleDescriptor module = runtimeModuleData.getModule();
        FqName packageFqName = classId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(module, packageFqName), classId.getShortClassName(), Modality.FINAL, ClassKind.CLASS, d.listOf(runtimeModuleData.getModule().getBuiltIns().getAny().getDefaultType()), SourceElement.NO_SOURCE, false, runtimeModuleData.getDeserialization().getStorageManager());
        classDescriptorImpl.initialize(new KClassImpl$createSyntheticClass$1$1(runtimeModuleData.getDeserialization().getStorageManager(), classDescriptorImpl), w.emptySet(), null);
        return classDescriptorImpl;
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@Nullable Object other) {
        return (other instanceof KClassImpl) && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass) other));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.data.getValue().getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        ClassDescriptor f80025p0 = getF80025p0();
        if (f80025p0.getKind() == ClassKind.INTERFACE || f80025p0.getKind() == ClassKind.OBJECT) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Collection<ClassConstructorDescriptor> constructors = f80025p0.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
        return constructors;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KFunction<T>> getConstructors() {
        return this.data.getValue().getConstructors();
    }

    @NotNull
    public final Lazy<KClassImpl<T>.Data> getData() {
        return this.data;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope$kotlin_reflection = getMemberScope$kotlin_reflection();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.plus((Collection) memberScope$kotlin_reflection.getContributedFunctions(name, noLookupLocation), (Iterable) getStaticScope$kotlin_reflection().getContributedFunctions(name, noLookupLocation));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class<T> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int index) {
        Class<?> declaringClass;
        if (Intrinsics.areEqual(getJClass().getSimpleName(), "DefaultImpls") && (declaringClass = getJClass().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(declaringClass);
            Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) kotlinClass).getLocalProperty(index);
        }
        ClassDescriptor f80025p0 = getF80025p0();
        DeserializedClassDescriptor deserializedClassDescriptor = f80025p0 instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) f80025p0 : null;
        if (deserializedClassDescriptor == null) {
            return null;
        }
        ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.classLocalVariable;
        Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(classProto, classLocalVariable, index);
        if (property != null) {
            return (PropertyDescriptor) UtilKt.deserializeToDescriptor(getJClass(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), b.f79941p0);
        }
        return null;
    }

    @NotNull
    public final MemberScope getMemberScope$kotlin_reflection() {
        return getF80025p0().getDefaultType().getMemberScope();
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return this.data.getValue().getAllMembers();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        return this.data.getValue().getNestedClasses();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public T getObjectInstance() {
        return this.data.getValue().getObjectInstance();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope$kotlin_reflection = getMemberScope$kotlin_reflection();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt___CollectionsKt.plus((Collection) memberScope$kotlin_reflection.getContributedVariables(name, noLookupLocation), (Iterable) getStaticScope$kotlin_reflection().getContributedVariables(name, noLookupLocation));
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getQualifiedName() {
        return this.data.getValue().getQualifiedName();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KClass<? extends T>> getSealedSubclasses() {
        return this.data.getValue().getSealedSubclasses();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getSimpleName() {
        return this.data.getValue().getSimpleName();
    }

    @NotNull
    public final MemberScope getStaticScope$kotlin_reflection() {
        MemberScope staticScope = getF80025p0().getStaticScope();
        Intrinsics.checkNotNullExpressionValue(staticScope, "getStaticScope(...)");
        return staticScope;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KType> getSupertypes() {
        return this.data.getValue().getSupertypes();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        return this.data.getValue().getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getF80025p0().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        return getF80025p0().getModality() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        return getF80025p0().isCompanionObject();
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        return getF80025p0().isData();
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        return getF80025p0().getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        return getF80025p0().isFun();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        return getF80025p0().isInner();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(@Nullable Object value) {
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return TypeIntrinsics.isFunctionOfArity(value, functionClassArity.intValue());
        }
        Class wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        return getF80025p0().getModality() == Modality.OPEN;
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        return getF80025p0().getModality() == Modality.SEALED;
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        return getF80025p0().isValue();
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("class ");
        ClassId classIdMapJvmClassToKotlinClassId = RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
        FqName packageFqName = classIdMapJvmClassToKotlinClassId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName, "getPackageFqName(...)");
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + '.';
        }
        String strAsString = classIdMapJvmClassToKotlinClassId.getRelativeClassName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        sb2.append(str + l.replace$default(strAsString, '.', Typography.dollar, false, 4, (Object) null));
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: getDescriptor */
    public ClassDescriptor getF80025p0() {
        return this.data.getValue().getDescriptor();
    }
}
