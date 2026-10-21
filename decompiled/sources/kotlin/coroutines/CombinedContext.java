package kotlin.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.mypinpad.tsdk.isolation.y2;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001eB\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001f"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Lkotlin/coroutines/CoroutineContext$Element;", ExifInterface.LONGITUDE_EAST, "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", Parameters.DIRECTION.LEFT, "element", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class CombinedContext implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f79576p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final CoroutineContext.Element f79577q0;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \n2\u00060\u0001j\u0002`\u0002:\u0001\u000bB\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\f"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "Lkotlin/coroutines/CoroutineContext;", "elements", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "q0", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    public static final class Serialized implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final CoroutineContext[] f79579p0;

        public Serialized(@NotNull CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f79579p0 = elements;
        }

        private final Object readResolve() {
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext coroutineContext : this.f79579p0) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function2<String, CoroutineContext.Element, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f79580p0 = new a(2);

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final String invoke(@NotNull String acc, @NotNull CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Lambda implements Function2<Unit, CoroutineContext.Element, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext[] f79581p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f79582q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef) {
            super(2);
            this.f79581p0 = coroutineContextArr;
            this.f79582q0 = intRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit, CoroutineContext.Element element) {
            invoke2(unit, element);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Unit unit, @NotNull CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(element, "element");
            Ref.IntRef intRef = this.f79582q0;
            int i10 = intRef.element;
            intRef.element = i10 + 1;
            this.f79581p0[i10] = element;
        }
    }

    public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f79576p0 = left;
        this.f79577q0 = element;
    }

    private final Object writeReplace() {
        int iA = a();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iA];
        Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.INSTANCE, new b(coroutineContextArr, intRef));
        if (intRef.element == iA) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int a() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f79576p0;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            if (other instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) other;
                if (combinedContext.a() == a()) {
                    CombinedContext combinedContext2 = this;
                    while (true) {
                        CoroutineContext.Element element = combinedContext2.f79577q0;
                        if (!Intrinsics.areEqual(combinedContext.get(element.getKey()), element)) {
                            break;
                        }
                        CoroutineContext coroutineContext = combinedContext2.f79576p0;
                        if (coroutineContext instanceof CombinedContext) {
                            combinedContext2 = (CombinedContext) coroutineContext;
                        } else {
                            Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                            if (Intrinsics.areEqual(combinedContext.get(element2.getKey()), element2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.f79576p0.fold(initial, operation), this.f79577q0);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e5 = (E) combinedContext.f79577q0.get(key);
            if (e5 != null) {
                return e5;
            }
            CoroutineContext coroutineContext = combinedContext.f79576p0;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f79577q0.hashCode() + this.f79576p0.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f79577q0;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f79576p0;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        if (coroutineContextMinusKey == coroutineContext) {
            return this;
        }
        return coroutineContextMinusKey == EmptyCoroutineContext.INSTANCE ? element : new CombinedContext(coroutineContextMinusKey, element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.plus(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder(Constant.BRACKET_OPEN), (String) fold("", a.f79580p0), AbstractJsonLexerKt.END_LIST);
    }
}
