package kotlinx.serialization.json.internal;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import ek.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0082@¢\u0006\u0004\b\u0003\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonElement;", "readObject", "Lkotlin/DeepRecursiveScope;", "", "(Lkotlin/DeepRecursiveScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readArray", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "readValue", "readDeepRecursive", "read", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "isLenient", "Z", "trailingCommaAllowed", "", "stackDepth", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nJsonTreeReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,121:1\n27#1,25:122\n27#1,25:147\n531#2,3:172\n*S KotlinDebug\n*F\n+ 1 JsonTreeReader.kt\nkotlinx/serialization/json/internal/JsonTreeReader\n*L\n19#1:122,25\n24#1:147,25\n64#1:172,3\n*E\n"})
public final class JsonTreeReader {
    private final boolean isLenient;

    @NotNull
    private final AbstractJsonLexer lexer;
    private int stackDepth;
    private final boolean trailingCommaAllowed;

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1, reason: invalid class name */
    /* JADX INFO: compiled from: JsonTreeReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlin/DeepRecursiveScope;", "", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DeepRecursiveScope deepRecursiveScope = (DeepRecursiveScope) this.L$0;
                byte bPeekNextToken = JsonTreeReader.this.lexer.peekNextToken();
                if (bPeekNextToken == 1) {
                    return JsonTreeReader.this.readValue(true);
                }
                if (bPeekNextToken == 0) {
                    return JsonTreeReader.this.readValue(false);
                }
                if (bPeekNextToken != 6) {
                    if (bPeekNextToken == 8) {
                        return JsonTreeReader.this.readArray();
                    }
                    AbstractJsonLexer.fail$default(JsonTreeReader.this.lexer, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                JsonTreeReader jsonTreeReader = JsonTreeReader.this;
                this.label = 1;
                obj = jsonTreeReader.readObject(deepRecursiveScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (JsonElement) obj;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull DeepRecursiveScope<Unit, JsonElement> deepRecursiveScope, @NotNull Unit unit, @Nullable Continuation<? super JsonElement> continuation) {
            AnonymousClass1 anonymousClass1 = JsonTreeReader.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = deepRecursiveScope;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.JsonTreeReader$readObject$2, reason: invalid class name */
    /* JADX INFO: compiled from: JsonTreeReader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", i = {0, 0, 0, 0}, l = {24}, m = "readObject", n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JsonTreeReader.this.readObject(null, this);
        }
    }

    public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull AbstractJsonLexer lexer) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.lexer = lexer;
        this.isLenient = configuration.getIsLenient();
        this.trailingCommaAllowed = configuration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        byte bConsumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() == 4) {
            AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.lexer.canConsumeValue()) {
            arrayList.add(read());
            bConsumeNextToken = this.lexer.consumeNextToken();
            if (bConsumeNextToken != 4) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                boolean z10 = bConsumeNextToken == 9;
                int i10 = abstractJsonLexer.currentPosition;
                if (!z10) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bConsumeNextToken == 8) {
            this.lexer.consumeNextToken((byte) 9);
        } else if (bConsumeNextToken == 4) {
            if (!this.trailingCommaAllowed) {
                JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
                throw new KotlinNothingValueException();
            }
            this.lexer.consumeNextToken((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement readDeepRecursive() {
        return (JsonElement) DeepRecursiveKt.invoke(new DeepRecursiveFunction(new AnonymousClass1(null)), Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object readObject(kotlin.DeepRecursiveScope<kotlin.Unit, kotlinx.serialization.json.JsonElement> r21, kotlin.coroutines.Continuation<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObject(kotlin.DeepRecursiveScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive readValue(boolean isString) {
        String strConsumeStringLenient = (this.isLenient || !isString) ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
        return (isString || !Intrinsics.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL)) ? new JsonLiteral(strConsumeStringLenient, isString, null, 4, null) : JsonNull.INSTANCE;
    }

    @NotNull
    public final JsonElement read() {
        byte bPeekNextToken = this.lexer.peekNextToken();
        if (bPeekNextToken == 1) {
            return readValue(true);
        }
        if (bPeekNextToken == 0) {
            return readValue(false);
        }
        if (bPeekNextToken == 6) {
            int i10 = this.stackDepth + 1;
            this.stackDepth = i10;
            JsonElement deepRecursive = i10 == 200 ? readDeepRecursive() : readObject();
            this.stackDepth--;
            return deepRecursive;
        }
        if (bPeekNextToken == 8) {
            return readArray();
        }
        AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(bPeekNextToken), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final JsonElement readObject() {
        byte bConsumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (this.lexer.canConsumeValue()) {
                String strConsumeStringLenient = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
                this.lexer.consumeNextToken((byte) 5);
                linkedHashMap.put(strConsumeStringLenient, read());
                bConsumeNextToken = this.lexer.consumeNextToken();
                if (bConsumeNextToken != 4) {
                    if (bConsumeNextToken == 7) {
                        break;
                    }
                    AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            if (bConsumeNextToken == 6) {
                this.lexer.consumeNextToken((byte) 7);
            } else if (bConsumeNextToken == 4) {
                if (this.trailingCommaAllowed) {
                    this.lexer.consumeNextToken((byte) 7);
                } else {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new KotlinNothingValueException();
                }
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
