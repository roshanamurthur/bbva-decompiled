package org.koin.core.instance;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTimeTools;

/* JADX INFO: compiled from: InstanceBuilder.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "defParams", "newInstance", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "kClass", "params", "(Lorg/koin/core/scope/Scope;Lkotlin/reflect/KClass;Lorg/koin/core/parameter/ParametersHolder;)Ljava/lang/Object;", "koin-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInstanceBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceBuilder.kt\norg/koin/core/instance/InstanceBuilderKt\n+ 2 Logger.kt\norg/koin/core/logger/Logger\n+ 3 Measure.kt\norg/koin/core/time/MeasureKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,80:1\n28#2:81\n46#2,2:82\n29#2:84\n28#2:94\n46#2,2:95\n29#2:97\n28#2:107\n46#2,2:108\n29#2:110\n43#3,9:85\n43#3,9:98\n26#4:111\n*S KotlinDebug\n*F\n+ 1 InstanceBuilder.kt\norg/koin/core/instance/InstanceBuilderKt\n*L\n29#1:81\n29#1:82,2\n29#1:84\n39#1:94\n39#1:95,2\n39#1:97\n49#1:107\n49#1:108,2\n49#1:110\n36#1:85,9\n46#1:98,9\n70#1:111\n*E\n"})
public final class InstanceBuilderKt {

    /* JADX INFO: compiled from: InstanceBuilder.kt */
    public static final class a extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ParametersHolder f92338p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ParametersHolder parametersHolder) {
            super(0);
            this.f92338p0 = parametersHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ParametersHolder invoke() {
            return this.f92338p0;
        }
    }

    public static final Object[] a(Constructor<?> constructor, Scope scope, ParametersHolder parametersHolder) throws NoBeanDefFoundException {
        int length = constructor.getParameterTypes().length;
        if (length == 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < length; i10++) {
            objArr[i10] = Unit.INSTANCE;
        }
        for (int i11 = 0; i11 < length; i11++) {
            Class<?> p4 = constructor.getParameterTypes()[i11];
            Intrinsics.checkNotNullExpressionValue(p4, "p");
            KClass<?> kotlinClass = JvmClassMappingKt.getKotlinClass(p4);
            Object orNull = scope.getOrNull(kotlinClass, null, new a(parametersHolder));
            if (orNull == null && (orNull = parametersHolder.getOrNull(kotlinClass)) == null) {
                throw new NoBeanDefFoundException("No definition found for class '" + kotlinClass + '\'');
            }
            objArr[i11] = orNull;
        }
        return objArr;
    }

    @Deprecated(message = "Koin Reflection API is deprecated")
    @KoinReflectAPI
    public static final /* synthetic */ <T> T newInstance(Scope scope, ParametersHolder defParams) {
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(defParams, "defParams");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), defParams);
    }

    public static /* synthetic */ Object newInstance$default(Scope scope, ParametersHolder defParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            defParams = ParametersHolderKt.emptyParametersHolder();
        }
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(defParams, "defParams");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), defParams);
    }

    @Deprecated(message = "Koin Reflection API is deprecated")
    @NotNull
    @KoinReflectAPI
    public static final <T> T newInstance(@NotNull Scope scope, @NotNull KClass<T> kClass, @NotNull ParametersHolder params) throws NoBeanDefFoundException {
        Object[] objArrA;
        T t10;
        Intrinsics.checkNotNullParameter(scope, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(params, "params");
        Level level = scope.getLogger().getLevel();
        Level level2 = Level.DEBUG;
        if (level == level2) {
            Logger logger = scope.getLogger();
            String str = "|- creating new instance - " + KClassExtKt.getFullName(kClass);
            if (logger.isAt(level2)) {
                logger.display(level2, str);
            }
        }
        Constructor<?>[] constructors = JvmClassMappingKt.getJavaClass((KClass) kClass).getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "kClass.java.constructors");
        Constructor constructor = (Constructor) ArraysKt___ArraysKt.firstOrNull(constructors);
        if (constructor == null) {
            throw new IllegalStateException(("No constructor found for class '" + KClassExtKt.getFullName(kClass) + '\'').toString());
        }
        if (scope.getLogger().getLevel() == level2) {
            KoinPlatformTimeTools koinPlatformTimeTools = KoinPlatformTimeTools.INSTANCE;
            Pair pair = new Pair(a(constructor, scope, params), Double.valueOf((koinPlatformTimeTools.getTimeInNanoSeconds() - koinPlatformTimeTools.getTimeInNanoSeconds()) / 1000000.0d));
            Pair pair2 = new Pair(pair.component1(), Double.valueOf(((Number) pair.component2()).doubleValue()));
            objArrA = (Object[]) pair2.component1();
            double dDoubleValue = ((Number) pair2.component2()).doubleValue();
            Logger logger2 = scope.getLogger();
            String str2 = "|- got arguments in " + dDoubleValue + " ms";
            if (logger2.isAt(level2)) {
                logger2.display(level2, str2);
            }
        } else {
            objArrA = a(constructor, scope, params);
        }
        if (scope.getLogger().getLevel() == level2) {
            KoinPlatformTimeTools koinPlatformTimeTools2 = KoinPlatformTimeTools.INSTANCE;
            long timeInNanoSeconds = koinPlatformTimeTools2.getTimeInNanoSeconds();
            Object objNewInstance = objArrA.length == 0 ? constructor.newInstance(new Object[0]) : constructor.newInstance(Arrays.copyOf(objArrA, objArrA.length));
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "if (args.isEmpty()) {\n  ….newInstance(*args)\n    }");
            Pair pair3 = new Pair(objNewInstance, Double.valueOf((koinPlatformTimeTools2.getTimeInNanoSeconds() - timeInNanoSeconds) / 1000000.0d));
            Pair pair4 = new Pair(pair3.component1(), Double.valueOf(((Number) pair3.component2()).doubleValue()));
            t10 = (T) pair4.component1();
            double dDoubleValue2 = ((Number) pair4.component2()).doubleValue();
            Logger logger3 = scope.getLogger();
            String str3 = "|- created instance in " + dDoubleValue2 + " ms";
            if (logger3.isAt(level2)) {
                logger3.display(level2, str3);
            }
        } else {
            t10 = (T) (objArrA.length == 0 ? constructor.newInstance(new Object[0]) : constructor.newInstance(Arrays.copyOf(objArrA, objArrA.length)));
            Intrinsics.checkNotNullExpressionValue(t10, "if (args.isEmpty()) {\n  ….newInstance(*args)\n    }");
        }
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of org.koin.core.instance.InstanceBuilderKt.newInstance");
        return t10;
    }
}
