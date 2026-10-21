package kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import bk.q;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002!\"BA\u0012\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/reflect/Type;", "e", "Ljava/util/List;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "getMember", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "jClass", "", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,181:1\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,2:187\n1622#2:190\n1549#2:191\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n1#3:189\n11155#4:199\n11266#4,4:200\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n*L\n28#1:182\n28#1:183,3\n35#1:186\n35#1:187,2\n35#1:190\n37#1:191\n37#1:192,3\n20#1:195\n20#1:196,3\n53#1:199\n53#1:200,4\n*E\n"})
public final class AnnotationConstructorCaller implements Caller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<?> f80038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f80039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CallMode f80040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Method> f80041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f80042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f80043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f80044g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class CallMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallMode[] $VALUES;
        public static final CallMode CALL_BY_NAME;
        public static final CallMode POSITIONAL_CALL;

        static {
            CallMode callMode = new CallMode("CALL_BY_NAME", 0);
            CALL_BY_NAME = callMode;
            CallMode callMode2 = new CallMode("POSITIONAL_CALL", 1);
            POSITIONAL_CALL = callMode2;
            CallMode[] callModeArr = {callMode, callMode2};
            $VALUES = callModeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(callModeArr);
        }

        public CallMode() {
            throw null;
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class Origin {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Origin[] $VALUES;
        public static final Origin JAVA;
        public static final Origin KOTLIN;

        static {
            Origin origin = new Origin("JAVA", 0);
            JAVA = origin;
            Origin origin2 = new Origin("KOTLIN", 1);
            KOTLIN = origin2;
            Origin[] originArr = {origin, origin2};
            $VALUES = originArr;
            $ENTRIES = EnumEntriesKt.enumEntries(originArr);
        }

        public Origin() {
            throw null;
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public AnnotationConstructorCaller(@NotNull Class<?> jClass, @NotNull List<String> parameterNames, @NotNull CallMode callMode, @NotNull Origin origin, @NotNull List<Method> methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f80038a = jClass;
        this.f80039b = parameterNames;
        this.f80040c = callMode;
        this.f80041d = methods;
        List<Method> list = methods;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f80042e = arrayList;
        List<Method> list2 = this.f80041d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.checkNotNull(returnType);
            Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(returnType);
            if (wrapperByPrimitive != null) {
                returnType = wrapperByPrimitive;
            }
            arrayList2.add(returnType);
        }
        this.f80043f = arrayList2;
        List<Method> list3 = this.f80041d;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f80044g = arrayList3;
        if (this.f80040c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && (!CollectionsKt___CollectionsKt.minus(this.f80039b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        checkArguments(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List<String> list = this.f80039b;
            if (i10 >= length) {
                return AnnotationConstructorCallerKt.createAnnotationInstance(this.f80038a, q.toMap(CollectionsKt___CollectionsKt.zip(list, arrayList)), this.f80041d);
            }
            Object obj = args[i10];
            int i12 = i11 + 1;
            ArrayList arrayList2 = this.f80043f;
            Object objAccess$transformKotlinToJvm = (obj == null && this.f80040c == CallMode.CALL_BY_NAME) ? this.f80044g.get(i11) : AnnotationConstructorCallerKt.access$transformKotlinToJvm(obj, (Class) arrayList2.get(i11));
            if (objAccess$transformKotlinToJvm == null) {
                AnnotationConstructorCallerKt.access$throwIllegalArgumentType(i11, list.get(i11), (Class) arrayList2.get(i11));
                throw null;
            }
            arrayList.add(objAccess$transformKotlinToJvm);
            i10++;
            i11 = i12;
        }
    }

    public void checkArguments(@NotNull Object[] objArr) {
        Caller.DefaultImpls.checkArguments(this, objArr);
    }

    @Nullable
    public Void getMember() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.f80042e;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.f80038a;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Member mo5770getMember() {
        return (Member) getMember();
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        if ((i10 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, callMode, origin, list3);
    }
}
