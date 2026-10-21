package androidx.compose.runtime.saveable;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Saver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aw\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012.\u0010\t\u001a*\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003¢\u0006\u0002\b\b2#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n\u001a\u0018\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\f\"\u0004\b\u0000\u0010\u000e¨\u0006\u0010"}, d2 = {"Original", "", "Saveable", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/Saver;", "Saver", ExifInterface.GPS_DIRECTION_TRUE, "autoSaver", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0})
public final class SaverKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Saver<Object, Object> f15234a = Saver(a.f15237p0, b.f15238p0);

    /* JADX INFO: compiled from: Saver.kt */
    public static final class a extends Lambda implements Function2<SaverScope, Object, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15237p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Object obj) {
            return obj;
        }
    }

    @NotNull
    public static final <Original, Saveable> Saver<Original, Saveable> Saver(@NotNull final Function2<? super SaverScope, ? super Original, ? extends Saveable> function2, @NotNull final Function1<? super Saveable, ? extends Original> function1) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt.Saver.1
            @Override // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Original restore(@NotNull Saveable value) {
                return function1.invoke(value);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            @Nullable
            public Saveable save(@NotNull SaverScope saverScope, Original original) {
                return function2.invoke(saverScope, original);
            }
        };
    }

    @NotNull
    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) f15234a;
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }

    /* JADX INFO: compiled from: Saver.kt */
    public static final class b extends Lambda implements Function1<Object, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f15238p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@NotNull Object obj) {
            return obj;
        }
    }
}
