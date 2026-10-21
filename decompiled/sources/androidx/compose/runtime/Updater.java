package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JH\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032.\b\b\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJI\u0010\r\u001a\u00020\b\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\u000fJH\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032.\b\b\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0086\b¢\u0006\u0004\b\u0010\u0010\fJI\u0010\u0011\u001a\u00020\b\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0004\u001a\u00028\u00012,\u0010\n\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0015\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\t¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\t¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010#\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b!\u0010\"\u0088\u0001%\u0092\u0001\u00020$¨\u0006("}, d2 = {"Landroidx/compose/runtime/Updater;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/ExtensionFunctionType;", "block", "set-impl", "(Landroidx/compose/runtime/Composer;ILkotlin/jvm/functions/Function2;)V", SetCommand.ID, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "update-impl", "update", "Lkotlin/Function1;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "init", "reconcile-impl", "reconcile", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class Updater<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Composer f14811a;

    /* JADX INFO: compiled from: Composer.kt */
    public static final class a extends Lambda implements Function2<T, Unit, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f14812p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Unit> function1) {
            super(2);
            this.f14812p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Unit unit) {
            this.f14812p0.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    public static final class b extends Lambda implements Function2<T, Unit, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Unit> f14813p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super T, Unit> function1) {
            super(2);
            this.f14813p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Unit unit) {
            this.f14813p0.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Updater(Composer composer) {
        this.f14811a = composer;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m2073boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2075equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual(composer, ((Updater) obj).getF14811a());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2076equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2077hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final void m2078initimpl(Composer composer, @NotNull Function1<? super T, Unit> function1) {
        if (composer.getInserting()) {
            composer.apply(Unit.INSTANCE, new a(function1));
        }
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m2079reconcileimpl(Composer composer, @NotNull Function1<? super T, Unit> function1) {
        composer.apply(Unit.INSTANCE, new b(function1));
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m2080setimpl(Composer composer, int i10, @NotNull Function2<? super T, ? super Integer, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i10))) {
            bc.org.bouncycastle.math.ec.a.f(i10, composer, i10, function2);
        }
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2082toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + RootService.CLOSE_BRACKET;
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m2083updateimpl(Composer composer, int i10, @NotNull Function2<? super T, ? super Integer, Unit> function2) {
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i10))) {
            composer.updateRememberedValue(Integer.valueOf(i10));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i10), function2);
        }
    }

    public boolean equals(Object obj) {
        return m2075equalsimpl(this.f14811a, obj);
    }

    public int hashCode() {
        return m2077hashCodeimpl(this.f14811a);
    }

    public String toString() {
        return m2082toStringimpl(this.f14811a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getF14811a() {
        return this.f14811a;
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final <V> void m2084updateimpl(Composer composer, V v3, @NotNull Function2<? super T, ? super V, Unit> function2) {
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), v3)) {
            composer.updateRememberedValue(v3);
            if (inserting) {
                return;
            }
            composer.apply(v3, function2);
        }
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m2081setimpl(Composer composer, V v3, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), v3)) {
            composer.updateRememberedValue(v3);
            composer.apply(v3, function2);
        }
    }

    @PublishedApi
    public static /* synthetic */ void getComposer$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m2074constructorimpl(@NotNull Composer composer) {
        return composer;
    }
}
