package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n+ 2 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 3 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder\n*L\n1#1,254:1\n201#1:256\n13#2:255\n207#3:257\n207#3:258\n207#3:259\n207#3:260\n207#3:261\n207#3:262\n207#3:263\n207#3:264\n207#3:265\n207#3:266\n207#3:267\n207#3:268\n207#3:269\n207#3:270\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/PredefinedEnhancementInfoKt\n*L\n52#1:256\n41#1:255\n53#1:257\n58#1:258\n63#1:259\n75#1:260\n80#1:261\n128#1:262\n148#1:263\n154#1:264\n160#1:265\n167#1:266\n172#1:267\n178#1:268\n184#1:269\n191#1:270\n*E\n"})
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final JavaTypeQualifiers f80791a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final JavaTypeQualifiers f80792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final JavaTypeQualifiers f80793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> f80794d;

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class a extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80795p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f80795p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80795p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class a0 extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80796p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str) {
            super(1);
            this.f80796p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80796p0, PredefinedEnhancementInfoKt.f80792b);
            function.returns(JvmPrimitiveType.BOOLEAN);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class b extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80797p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f80797p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80797p0, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class b0 extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80798p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(String str) {
            super(1);
            this.f80798p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80798p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
            function.returns(JvmPrimitiveType.BOOLEAN);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class c extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80799p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f80799p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80799p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class d extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80800p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.f80800p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80800p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.returns(str, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class e extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80801p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.f80801p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80801p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
            function.returns(str, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class f extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80802p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.f80802p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80802p0, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class g extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SignatureBuildingComponents f80803p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SignatureBuildingComponents signatureBuildingComponents) {
            super(1);
            this.f80803p0 = signatureBuildingComponents;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80803p0.javaUtil("Spliterator"), PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class h extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80804p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.f80804p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80804p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
            function.returns(JvmPrimitiveType.BOOLEAN);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class i extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80805p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(1);
            this.f80805p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80805p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class j extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80806p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(1);
            this.f80806p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80806p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class k extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80807p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.f80807p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80807p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class l extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80808p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(1);
            this.f80808p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80808p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class m extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80809p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(1);
            this.f80809p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80809p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
            function.returns(str, PredefinedEnhancementInfoKt.f80791a);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class n extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80810p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(1);
            this.f80810p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80810p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
            function.returns(str, PredefinedEnhancementInfoKt.f80791a);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class o extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80811p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(1);
            this.f80811p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80811p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
            function.parameter(str, PredefinedEnhancementInfoKt.f80792b);
            function.returns(JvmPrimitiveType.BOOLEAN);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class p extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80812p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(1);
            this.f80812p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80812p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class q extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80813p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f80814q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2) {
            super(1);
            this.f80813p0 = str;
            this.f80814q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80813p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(this.f80814q0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80791a, PredefinedEnhancementInfoKt.f80791a);
            function.returns(str, PredefinedEnhancementInfoKt.f80791a);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class r extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80815p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f80816q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2) {
            super(1);
            this.f80815p0 = str;
            this.f80816q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80815p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(this.f80816q0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b);
            function.returns(str, PredefinedEnhancementInfoKt.f80792b);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class s extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80817p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f80818q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, String str2) {
            super(1);
            this.f80817p0 = str;
            this.f80818q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80817p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(this.f80818q0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80793c, PredefinedEnhancementInfoKt.f80791a);
            function.returns(str, PredefinedEnhancementInfoKt.f80791a);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class t extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80819p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f80820q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, String str2) {
            super(1);
            this.f80819p0 = str;
            this.f80820q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            JavaTypeQualifiers[] javaTypeQualifiersArr = {PredefinedEnhancementInfoKt.f80792b};
            String str = this.f80819p0;
            function.parameter(str, javaTypeQualifiersArr);
            function.parameter(str, PredefinedEnhancementInfoKt.f80793c);
            function.parameter(this.f80820q0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80793c, PredefinedEnhancementInfoKt.f80793c, PredefinedEnhancementInfoKt.f80791a);
            function.returns(str, PredefinedEnhancementInfoKt.f80791a);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class u extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80821p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str) {
            super(1);
            this.f80821p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80821p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80793c);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class v extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80822p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f80823q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, String str2) {
            super(1);
            this.f80822p0 = str;
            this.f80823q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80822p0, PredefinedEnhancementInfoKt.f80793c);
            function.returns(this.f80823q0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80793c);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class w extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80824p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f80825q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, String str2) {
            super(1);
            this.f80824p0 = str;
            this.f80825q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80824p0, PredefinedEnhancementInfoKt.f80791a);
            function.returns(this.f80825q0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80793c);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class x extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80826p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(1);
            this.f80826p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80826p0, PredefinedEnhancementInfoKt.f80793c);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class y extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80827p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str) {
            super(1);
            this.f80827p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.parameter(this.f80827p0, PredefinedEnhancementInfoKt.f80792b, PredefinedEnhancementInfoKt.f80793c);
        }
    }

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public static final class z extends Lambda implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f80828p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(1);
            this.f80828p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
            invoke2(functionEnhancementBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder function) {
            Intrinsics.checkNotNullParameter(function, "$this$function");
            function.returns(this.f80828p0, PredefinedEnhancementInfoKt.f80791a);
        }
    }

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f80792b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f80793c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents.javaLang("Object");
        String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator")).function("forEachRemaining", new a(strJavaFunction3));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("Iterable")).function("spliterator", new g(signatureBuildingComponents));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Collection"));
        classEnhancementBuilder.function("removeIf", new h(strJavaFunction));
        classEnhancementBuilder.function("stream", new i(strJavaUtil));
        classEnhancementBuilder.function("parallelStream", new j(strJavaUtil));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("List")).function("replaceAll", new k(strJavaFunction6));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder2 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Map"));
        classEnhancementBuilder2.function("forEach", new l(strJavaFunction5));
        classEnhancementBuilder2.function("putIfAbsent", new m(strJavaLang));
        classEnhancementBuilder2.function("replace", new n(strJavaLang));
        classEnhancementBuilder2.function("replace", new o(strJavaLang));
        classEnhancementBuilder2.function("replaceAll", new p(strJavaFunction4));
        classEnhancementBuilder2.function("compute", new q(strJavaLang, strJavaFunction4));
        classEnhancementBuilder2.function("computeIfAbsent", new r(strJavaLang, strJavaFunction2));
        classEnhancementBuilder2.function("computeIfPresent", new s(strJavaLang, strJavaFunction4));
        classEnhancementBuilder2.function("merge", new t(strJavaLang, strJavaFunction4));
        SignatureEnhancementBuilder.ClassEnhancementBuilder classEnhancementBuilder3 = new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaUtil2);
        classEnhancementBuilder3.function("empty", new u(strJavaUtil2));
        classEnhancementBuilder3.function("of", new v(strJavaLang, strJavaUtil2));
        classEnhancementBuilder3.function("ofNullable", new w(strJavaLang, strJavaUtil2));
        classEnhancementBuilder3.function("get", new x(strJavaLang));
        classEnhancementBuilder3.function("ifPresent", new y(strJavaFunction3));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaLang("ref/Reference")).function("get", new z(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction).function("test", new a0(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("BiPredicate")).function("test", new b0(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction3).function("accept", new b(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction5).function("accept", new c(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction2).function("apply", new d(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, strJavaFunction4).function("apply", new e(strJavaLang));
        new SignatureEnhancementBuilder.ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaFunction("Supplier")).function("get", new f(strJavaLang));
        f80794d = signatureEnhancementBuilder.build();
    }

    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return f80794d;
    }
}
