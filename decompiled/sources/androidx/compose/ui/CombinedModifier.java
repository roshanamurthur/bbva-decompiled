package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.e;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u001a\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "Landroidx/compose/ui/Modifier;", "getOuter$ui_release", "()Landroidx/compose/ui/Modifier;", "outer", "b", "getInner$ui_release", "inner", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier outer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier inner;

    /* JADX INFO: compiled from: Modifier.kt */
    public static final class a extends Lambda implements Function2<String, Modifier.Element, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15404p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, Modifier.Element element) {
            String acc = str;
            Modifier.Element element2 = element;
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element2, "element");
            if (acc.length() == 0) {
                return element2.toString();
            }
            return acc + ", " + element2;
        }
    }

    public CombinedModifier(@NotNull Modifier outer, @NotNull Modifier inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.outer = outer;
        this.inner = inner;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return this.outer.all(predicate) && this.inner.all(predicate);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return this.outer.any(predicate) || this.inner.any(predicate);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) other;
            if (Intrinsics.areEqual(this.outer, combinedModifier.outer) && Intrinsics.areEqual(this.inner, combinedModifier.inner)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.inner.foldIn(this.outer.foldIn(initial, operation), operation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R initial, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.outer.foldOut(this.inner.foldOut(initial, operation), operation);
    }

    @NotNull
    /* JADX INFO: renamed from: getInner$ui_release, reason: from getter */
    public final Modifier getInner() {
        return this.inner;
    }

    @NotNull
    /* JADX INFO: renamed from: getOuter$ui_release, reason: from getter */
    public final Modifier getOuter() {
        return this.outer;
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return e.a(this, modifier);
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder(Constant.BRACKET_OPEN), (String) foldIn("", a.f15404p0), AbstractJsonLexerKt.END_LIST);
    }
}
