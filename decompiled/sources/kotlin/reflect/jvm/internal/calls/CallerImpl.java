package kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CallerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001f*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b !\"\u001f#$%&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0007'()*+,-¨\u0006."}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "obj", "", "checkObjectInstance", "a", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "b", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "getInstanceClass", "()Ljava/lang/Class;", "instanceClass", "", "d", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "Companion", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
public abstract class CallerImpl<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final M member;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Type returnType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Class<?> instanceClass;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Type> parameterTypes;

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n262#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n*L\n76#1:266\n76#1:267\n*E\n"})
    public static final class AccessorForHiddenBoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f80053e;

        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenBoundConstructor(@NotNull java.lang.reflect.Constructor<?> constructor, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length - 1)), null);
            this.f80053e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> constructorMo5770getMember = mo5770getMember();
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.add(this.f80053e);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return constructorMo5770getMember.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n258#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n*L\n62#1:266\n62#1:267\n*E\n"})
    public static final class AccessorForHiddenConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public AccessorForHiddenConstructor(@NotNull java.lang.reflect.Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(genericParameterTypes, 0, genericParameterTypes.length - 1)), null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> constructorMo5770getMember = mo5770getMember();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(args);
            spreadBuilder.add(null);
            return constructorMo5770getMember.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class BoundConstructor extends CallerImpl<java.lang.reflect.Constructor<?>> implements BoundCaller {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f80054e;

        /* JADX WARN: Illegal instructions before constructor call */
        public BoundConstructor(@NotNull java.lang.reflect.Constructor<?> constructor, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, null, genericParameterTypes, null);
            this.f80054e = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            java.lang.reflect.Constructor<?> constructorMo5770getMember = mo5770getMember();
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(this.f80054e);
            spreadBuilder.addSpread(args);
            return constructorMo5770getMember.newInstance(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006J(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0001\u0010\u0005\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u0004H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Companion;", "", "()V", "dropFirst", "", ExifInterface.GPS_DIRECTION_TRUE, "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n26#2:266\n26#2:267\n26#2:268\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n254#1:266\n258#1:267\n262#1:268\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "constructor", "(Ljava/lang/reflect/Constructor;)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Constructor extends CallerImpl<java.lang.reflect.Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        public Constructor(@NotNull java.lang.reflect.Constructor<?> constructor) {
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
            Class<?> cls = (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : declaringClass3;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            super(constructor, declaringClass, cls, genericParameterTypes, null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            return mo5770getMember().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\b\t\n\u000b\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n26#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter\n*L\n172#1:266\n*E\n"})
    public static abstract class FieldGetter extends CallerImpl<Field> {

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
        public static final class BoundInstance extends FieldGetter implements BoundCaller {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public final Object f80055e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull Field field, @Nullable Object obj) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f80055e = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldGetter, kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return mo5770getMember().get(this.f80055e);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends FieldGetter implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Instance extends FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class JvmStaticInObject extends FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull Field field) {
                super(field, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.checkArguments(args);
                checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Static extends FieldGetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull Field field) {
                super(field, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldGetter(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            return mo5770getMember().get(getInstanceClass() != null ? ArraysKt___ArraysKt.first(args) : null);
        }
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000b\f\r\u000e\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static abstract class FieldSetter extends CallerImpl<Field> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f80056e;

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
        public static final class BoundInstance extends FieldSetter implements BoundCaller {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public final Object f80057f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull Field field, boolean z10, @Nullable Object obj) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f80057f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            @NotNull
            public Object call(@NotNull Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                mo5770getMember().set(this.f80057f, ArraysKt___ArraysKt.first(args));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends FieldSetter implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull Field field, boolean z10) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.Caller
            @NotNull
            public Object call(@NotNull Object[] args) throws IllegalAccessException {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                mo5770getMember().set(null, ArraysKt___ArraysKt.last(args));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Instance extends FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull Field field, boolean z10) {
                super(field, z10, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "checkArguments", "", "args", "", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class JvmStaticInObject extends FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull Field field, boolean z10) {
                super(field, z10, true, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // kotlin.reflect.jvm.internal.calls.CallerImpl.FieldSetter, kotlin.reflect.jvm.internal.calls.CallerImpl
            public void checkArguments(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.checkArguments(args);
                checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(args));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "field", "Ljava/lang/reflect/Field;", "notNull", "", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Static extends FieldSetter {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull Field field, boolean z10) {
                super(field, z10, false, null);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FieldSetter(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
            super(field, TYPE, declaringClass, new Type[]{genericType}, null);
            this.f80056e = z10;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(args, "args");
            checkArguments(args);
            mo5770getMember().set(getInstanceClass() != null ? ArraysKt___ArraysKt.first(args) : null, ArraysKt___ArraysKt.last(args));
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.calls.CallerImpl
        public void checkArguments(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            super.checkArguments(args);
            if (this.f80056e && ArraysKt___ArraysKt.last(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    public CallerImpl() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    public CallerImpl(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        List<Type> list;
        this.member = member;
        this.returnType = type;
        this.instanceClass = cls;
        if (cls != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(cls);
            spreadBuilder.addSpread(typeArr);
            list = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Type[spreadBuilder.size()]));
            list = list == null ? ArraysKt___ArraysKt.toList(typeArr) : list;
        }
        this.parameterTypes = list;
    }

    public void checkArguments(@NotNull Object[] objArr) {
        Caller.DefaultImpls.checkArguments(this, objArr);
    }

    public final void checkObjectInstance(@Nullable Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Nullable
    public final Class<?> getInstanceClass() {
        return this.instanceClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* JADX INFO: renamed from: getMember */
    public final M mo5770getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public final Type getReturnType() {
        return this.returnType;
    }

    /* JADX INFO: compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "callMethod", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "BoundStaticMultiFieldValueClass", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static abstract class Method extends CallerImpl<java.lang.reflect.Method> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f80058e;

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
        public static final class BoundInstance extends Method implements BoundCaller {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @Nullable
            public final Object f80059f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundInstance(@NotNull java.lang.reflect.Method method, @Nullable Object obj) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
                this.f80059f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(this.f80059f, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BoundJvmStaticInObject extends Method implements BoundCaller {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BoundJvmStaticInObject(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "getBoundReceiver$kotlin_reflection", "()Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n254#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n*L\n126#1:266\n126#1:267\n*E\n"})
        public static final class BoundStatic extends Method implements BoundCaller {

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStatic(@NotNull java.lang.reflect.Method method, @Nullable Object obj) {
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : ArraysKt___ArraysJvmKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length)), null);
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(this.boundReceiver);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            }

            @Nullable
            /* JADX INFO: renamed from: getBoundReceiver$kotlin_reflection, reason: from getter */
            public final Object getBoundReceiver() {
                return this.boundReceiver;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "[Ljava/lang/Object;", "getBoundReceiverComponents$kotlin_reflection", "()[Ljava/lang/Object;", "boundReceiverComponents", "", "getReceiverComponentsCount", "()I", "receiverComponentsCount", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,265:1\n37#2,2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n*L\n139#1:266,2\n*E\n"})
        public static final class BoundStaticMultiFieldValueClass extends Method implements BoundCaller {

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Object[] boundReceiverComponents;

            /* JADX WARN: Illegal instructions before constructor call */
            public BoundStaticMultiFieldValueClass(@NotNull java.lang.reflect.Method method, @NotNull Object[] boundReceiverComponents) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                super(method, false, (Type[]) ArraysKt___ArraysKt.drop(genericParameterTypes, boundReceiverComponents.length).toArray(new Type[0]), null);
                this.boundReceiverComponents = boundReceiverComponents;
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(this.boundReceiverComponents);
                spreadBuilder.addSpread(args);
                return callMethod(null, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            }

            @NotNull
            /* JADX INFO: renamed from: getBoundReceiverComponents$kotlin_reflection, reason: from getter */
            public final Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            public final int getReceiverComponentsCount() {
                return this.boundReceiverComponents.length;
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n254#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n*L\n113#1:266\n113#1:267\n*E\n"})
        public static final class Instance extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Instance(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(args[0], args.length <= 1 ? new Object[0] : ArraysKt___ArraysJvmKt.copyOfRange(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n254#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n*L\n121#1:266\n121#1:267\n*E\n"})
        public static final class JvmStaticInObject extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JvmStaticInObject(@NotNull java.lang.reflect.Method method) {
                super(method, true, null, 4, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                checkObjectInstance(ArraysKt___ArraysKt.firstOrNull(args));
                return callMethod(null, args.length <= 1 ? new Object[0] : ArraysKt___ArraysJvmKt.copyOfRange(args, 1, args.length));
            }
        }

        /* JADX INFO: compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Static extends Method {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Static(@NotNull java.lang.reflect.Method method) {
                super(method, false, null, 6, null);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // kotlin.reflect.jvm.internal.calls.Caller
            @Nullable
            public Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                checkArguments(args);
                return callMethod(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Method(java.lang.reflect.Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i10 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(typeArr, "getGenericParameterTypes(...)");
            }
            this(method, z10, typeArr, null);
        }

        @Nullable
        public final Object callMethod(@Nullable Object instance, @NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.f80058e ? Unit.INSTANCE : mo5770getMember().invoke(instance, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Method(java.lang.reflect.Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr, null);
            this.f80058e = Intrinsics.areEqual(getReturnType(), Void.TYPE);
        }
    }
}
