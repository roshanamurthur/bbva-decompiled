package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0001¢\u0006\u0004\b!\u0010\"B,\b\u0016\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0001¢\u0006\u0004\b!\u0010#J3\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "toString", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "J", "getSelection-d9O1mEE", "()J", "c", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getText", "()Ljava/lang/String;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldValue {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Saver<TextFieldValue, Object> f18137d = SaverKt.Saver(a.f18141p0, b.f18142p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnnotatedString annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long selection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final TextRange composition;

    /* JADX INFO: compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.f18137d;
        }
    }

    /* JADX INFO: compiled from: TextFieldValue.kt */
    public static final class a extends Lambda implements Function2<SaverScope, TextFieldValue, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f18141p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextFieldValue textFieldValue) {
            SaverScope Saver = saverScope;
            TextFieldValue it = textFieldValue;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.getAnnotatedString(), SaversKt.getAnnotatedStringSaver(), Saver), SaversKt.save(TextRange.m3955boximpl(it.getSelection()), SaversKt.getSaver(TextRange.INSTANCE), Saver));
        }
    }

    /* JADX INFO: compiled from: TextFieldValue.kt */
    @SourceDebugExtension({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n55#2,2:202\n55#2,2:205\n1#3:204\n1#3:207\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:202,2\n169#1:205,2\n168#1:204\n169#1:207\n*E\n"})
    public static final class b extends Lambda implements Function1<Object, TextFieldValue> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f18142p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextFieldValue invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : annotatedStringSaver.restore(obj);
            Intrinsics.checkNotNull(annotatedStringRestore);
            Object obj2 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.INSTANCE);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                textRangeRestore = saver.restore(obj2);
            }
            Intrinsics.checkNotNull(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.getF17768a(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m3973coerceIn8ffj60Q(j10, 0, getText().length());
        this.composition = textRange != null ? TextRange.m3955boximpl(TextRangeKt.m3973coerceIn8ffj60Q(textRange.getF17768a(), 0, getText().length())) : null;
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4171copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4173copy3r_uNRQ(annotatedString, j10, textRange);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m4173copy3r_uNRQ(@NotNull AnnotatedString annotatedString, long selection, @Nullable TextRange composition) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        return new TextFieldValue(annotatedString, selection, composition, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return TextRange.m3960equalsimpl0(this.selection, textFieldValue.selection) && Intrinsics.areEqual(this.composition, textFieldValue.composition) && Intrinsics.areEqual(this.annotatedString, textFieldValue.annotatedString);
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name and from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        int iM3968hashCodeimpl = (TextRange.m3968hashCodeimpl(this.selection) + (this.annotatedString.hashCode() * 31)) * 31;
        TextRange textRange = this.composition;
        return iM3968hashCodeimpl + (textRange != null ? TextRange.m3968hashCodeimpl(textRange.getF17768a()) : 0);
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m3970toStringimpl(this.selection)) + ", composition=" + this.composition + RootService.CLOSE_BRACKET;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m4174copy3r_uNRQ(@NotNull String text, long selection, @Nullable TextRange composition) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextFieldValue(new AnnotatedString(text, null, null, 6, null), selection, composition, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m4172copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j10, TextRange textRange, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4174copy3r_uNRQ(str, j10, textRange);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextFieldValue(String text, long j10, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(new AnnotatedString(text, null, null, 6, null), j10, textRange, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, TextRange textRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i10 & 2) != 0 ? TextRange.INSTANCE.m3972getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, TextRange textRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? TextRange.INSTANCE.m3972getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }
}
