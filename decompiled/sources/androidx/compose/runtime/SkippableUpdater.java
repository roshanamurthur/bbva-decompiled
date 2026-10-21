package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\n\u001a\u00020\u00052\u001d\u0010\u0007\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u0088\u0001\u0019\u0092\u0001\u00020\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "", "Lkotlin/ExtensionFunctionType;", "block", "update-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "update", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "equals", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class SkippableUpdater<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Composer f14736a;

    public /* synthetic */ SkippableUpdater(Composer composer) {
        this.f14736a = composer;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SkippableUpdater m2065boximpl(Composer composer) {
        return new SkippableUpdater(composer);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2067equalsimpl(Composer composer, Object obj) {
        return (obj instanceof SkippableUpdater) && Intrinsics.areEqual(composer, ((SkippableUpdater) obj).getF14736a());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2068equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2069hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2070toStringimpl(Composer composer) {
        return "SkippableUpdater(composer=" + composer + RootService.CLOSE_BRACKET;
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m2071updateimpl(Composer composer, @NotNull Function1<? super Updater<T>, Unit> function1) {
        composer.startReplaceableGroup(509942095);
        function1.invoke(Updater.m2073boximpl(Updater.m2074constructorimpl(composer)));
        composer.endReplaceableGroup();
    }

    public boolean equals(Object obj) {
        return m2067equalsimpl(this.f14736a, obj);
    }

    public int hashCode() {
        return m2069hashCodeimpl(this.f14736a);
    }

    public String toString() {
        return m2070toStringimpl(this.f14736a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Composer getF14736a() {
        return this.f14736a;
    }

    @PublishedApi
    public static /* synthetic */ void getComposer$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m2066constructorimpl(@NotNull Composer composer) {
        return composer;
    }
}
