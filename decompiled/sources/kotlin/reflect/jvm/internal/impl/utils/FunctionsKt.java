package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: functions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class FunctionsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f82100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e f82101b;

    /* JADX INFO: compiled from: functions.kt */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ int f82102p0 = 0;

        static {
            new a(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(@Nullable Object obj) {
            return null;
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public static final class b extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82103p0 = new b(1);

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@Nullable Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public static final class c extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ int f82104p0 = 0;

        static {
            new c(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public static final class d extends Lambda implements Function2<Object, Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ int f82105p0 = 0;

        static {
            new d(2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Object obj, @Nullable Object obj2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
            invoke2(obj, obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: functions.kt */
    public static final class e extends Lambda implements Function3<Object, Object, Object, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f82106p0 = new e(3);

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3) {
            invoke2(obj, obj2, obj3);
            return Unit.INSTANCE;
        }
    }

    static {
        int i10 = f.f82107p0;
        f82100a = b.f82103p0;
        int i11 = a.f82102p0;
        int i12 = c.f82104p0;
        int i13 = d.f82105p0;
        f82101b = e.f82106p0;
    }

    @NotNull
    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return f82100a;
    }

    @NotNull
    public static final Function3<Object, Object, Object, Unit> getDO_NOTHING_3() {
        return f82101b;
    }

    /* JADX INFO: compiled from: functions.kt */
    public static final class f extends Lambda implements Function1<Object, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final /* synthetic */ int f82107p0 = 0;

        static {
            new f(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Object obj) {
            return obj;
        }
    }
}
