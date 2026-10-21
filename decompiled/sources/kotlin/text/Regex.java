package kotlin.text;

import androidx.appcompat.widget.o1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B\u0011\b\u0001\u0012\u0006\u0010)\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+B\u0011\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0014¢\u0006\u0004\b*\u0010,B\u0019\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\u0006\u0010-\u001a\u00020%¢\u0006\u0004\b*\u0010.B\u001f\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0014\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b*\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0017J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\nJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0007J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0006\u0010 \u001a\u00020\u001fR\u0011\u0010#\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "input", "", "matches", "containsMatchIn", "", "startIndex", "Lkotlin/text/MatchResult;", "find", "Lkotlin/sequences/Sequence;", "findAll", "matchEntire", FirebaseAnalytics.Param.INDEX, "matchAt", "matchesAt", "", "replacement", "replace", "Lkotlin/Function1;", "transform", "replaceFirst", "limit", "", "split", "splitToSequence", "toString", "Ljava/util/regex/Pattern;", "toPattern", "getPattern", "()Ljava/lang/String;", "pattern", "", "Lkotlin/text/RegexOption;", "getOptions", "()Ljava/util/Set;", "options", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Pattern f82328p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Set<? extends RegexOption> f82329q0;

    /* JADX INFO: compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "", "literal", "Lkotlin/text/Regex;", "fromLiteral", "escape", "escapeReplacement", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int access$ensureUnicodeCase(Companion companion, int i10) {
            companion.getClass();
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        @NotNull
        public final String escape(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuote = Pattern.quote(literal);
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        @NotNull
        public final String escapeReplacement(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        @NotNull
        public final Regex fromLiteral(@NotNull String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\r"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "pattern", "", "flags", "<init>", "(Ljava/lang/String;I)V", "r0", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final String f82331p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f82332q0;

        public Serialized(@NotNull String pattern, int i10) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f82331p0 = pattern;
            this.f82332q0 = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f82331p0, this.f82332q0);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<MatchResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Regex f82333p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CharSequence f82334q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f82335r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence, Regex regex, int i10) {
            super(0);
            this.f82333p0 = regex;
            this.f82334q0 = charSequence;
            this.f82335r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final MatchResult invoke() {
            return this.f82333p0.find(this.f82334q0, this.f82335r0);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82336p0 = new b();

        public b() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final MatchResult invoke(@NotNull MatchResult p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return p4.next();
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, 287}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    public static final class c extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Matcher f82337p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f82338q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f82339r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f82340s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CharSequence f82342u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CharSequence charSequence, int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f82342u0 = charSequence;
            this.v0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = Regex.this.new c(this.f82342u0, this.v0, continuation);
            cVar.f82340s0 = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0070 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        /* JADX WARN: Code duplicated, block: B:27:0x009c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            c cVar;
            SequenceScope sequenceScope;
            Matcher matcher;
            int i10;
            String string;
            String string2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f82339r0;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f82340s0;
                Pattern pattern = Regex.this.f82328p0;
                CharSequence charSequence = this.f82342u0;
                Matcher matcher2 = pattern.matcher(charSequence);
                if (this.v0 != 1 && matcher2.find()) {
                    int iEnd = 0;
                    cVar = this;
                    sequenceScope = sequenceScope2;
                    matcher = matcher2;
                    i10 = 0;
                    string = cVar.f82342u0.subSequence(iEnd, matcher.start()).toString();
                    cVar.f82340s0 = sequenceScope;
                    cVar.f82337p0 = matcher;
                    cVar.f82338q0 = i10;
                    cVar.f82339r0 = 2;
                    if (sequenceScope.yield(string, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iEnd = matcher.end();
                    i10++;
                    if (i10 != cVar.v0 - 1) {
                    }
                    CharSequence charSequence2 = cVar.f82342u0;
                    string2 = charSequence2.subSequence(iEnd, charSequence2.length()).toString();
                    cVar.f82340s0 = null;
                    cVar.f82337p0 = null;
                    cVar.f82339r0 = 3;
                    if (sequenceScope.yield(string2, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                String string3 = charSequence.toString();
                this.f82339r0 = 1;
                if (sequenceScope2.yield(string3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        i10 = this.f82338q0;
                        Matcher matcher3 = this.f82337p0;
                        sequenceScope = (SequenceScope) this.f82340s0;
                        ResultKt.throwOnFailure(obj);
                        cVar = this;
                        matcher = matcher3;
                        iEnd = matcher.end();
                        i10++;
                        if (i10 != cVar.v0 - 1 || !matcher.find()) {
                            CharSequence charSequence3 = cVar.f82342u0;
                            string2 = charSequence3.subSequence(iEnd, charSequence3.length()).toString();
                            cVar.f82340s0 = null;
                            cVar.f82337p0 = null;
                            cVar.f82339r0 = 3;
                            if (sequenceScope.yield(string2, cVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        string = cVar.f82342u0.subSequence(iEnd, matcher.start()).toString();
                        cVar.f82340s0 = sequenceScope;
                        cVar.f82337p0 = matcher;
                        cVar.f82338q0 = i10;
                        cVar.f82339r0 = 2;
                        if (sequenceScope.yield(string, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        iEnd = matcher.end();
                        i10++;
                        if (i10 != cVar.v0 - 1) {
                        }
                        CharSequence charSequence4 = cVar.f82342u0;
                        string2 = charSequence4.subSequence(iEnd, charSequence4.length()).toString();
                        cVar.f82340s0 = null;
                        cVar.f82337p0 = null;
                        cVar.f82339r0 = 3;
                        if (sequenceScope.yield(string2, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super String> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @PublishedApi
    public Regex(@NotNull Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f82328p0 = nativePattern;
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.find(charSequence, i10);
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.findAll(charSequence, i10);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.split(charSequence, i10);
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.splitToSequence(charSequence, i10);
    }

    private final Object writeReplace() {
        Pattern pattern = this.f82328p0;
        String strPattern = pattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return new Serialized(strPattern, pattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f82328p0.matcher(input).find();
    }

    @Nullable
    public final MatchResult find(@NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f82328p0.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.access$findNext(matcher, startIndex, input);
    }

    @NotNull
    public final Sequence<MatchResult> findAll(@NotNull CharSequence input, int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (startIndex >= 0 && startIndex <= input.length()) {
            return SequencesKt__SequencesKt.generateSequence((Function0) new a(input, this, startIndex), (Function1) b.f82336p0);
        }
        StringBuilder sbC = o1.c("Start index out of bounds: ", startIndex, ", input length: ");
        sbC.append(input.length());
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @NotNull
    public final Set<RegexOption> getOptions() {
        Set set = this.f82329q0;
        if (set != null) {
            return set;
        }
        final int iFlags = this.f82328p0.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        Intrinsics.checkNotNull(enumSetAllOf);
        bk.g.retainAll(enumSetAllOf, new Function1<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(RegexOption regexOption) {
                RegexOption regexOption2 = regexOption;
                return Boolean.valueOf((regexOption2.getMask() & iFlags) == regexOption2.getValue());
            }
        });
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        this.f82329q0 = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        String strPattern = this.f82328p0.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return strPattern;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public final MatchResult matchAt(@NotNull CharSequence input, int index) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcherRegion = this.f82328p0.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        Intrinsics.checkNotNull(matcherRegion);
        return new MatcherMatchResult(matcherRegion, input);
    }

    @Nullable
    public final MatchResult matchEntire(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f82328p0.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.access$matchEntire(matcher, input);
    }

    public final boolean matches(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f82328p0.matcher(input).matches();
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final boolean matchesAt(@NotNull CharSequence input, int index) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f82328p0.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.f82328p0.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceFirst = this.f82328p0.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence input, int limit) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(limit);
        Matcher matcher = this.f82328p0.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return bk.d.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? kotlin.ranges.c.coerceAtMost(limit, 10) : 10);
        int i10 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i10 >= 0 && arrayList.size() == i10) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @NotNull
    public final Sequence<String> splitToSequence(@NotNull CharSequence input, int limit) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(limit);
        return SequencesKt__SequenceBuilderKt.sequence(new c(input, limit, null));
    }

    @NotNull
    /* JADX INFO: renamed from: toPattern, reason: from getter */
    public final Pattern getF82328p0() {
        return this.f82328p0;
    }

    @NotNull
    public String toString() {
        String string = this.f82328p0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, input, 0, 2, null);
        if (matchResultFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, matchResultFind$default.getRange().getStart().intValue());
            sb2.append(transform.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.getRange().getEndInclusive().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull RegexOption option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, Companion.access$ensureUnicodeCase(INSTANCE, option.getValue()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String pattern, @NotNull Set<? extends RegexOption> options) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, Companion.access$ensureUnicodeCase(INSTANCE, RegexKt.access$toInt(options)));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
