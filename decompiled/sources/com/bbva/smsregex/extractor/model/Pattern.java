package com.bbva.smsregex.extractor.model;

import androidx.appcompat.app.i;
import bk.o;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Pattern.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J)\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/smsregex/extractor/model/Pattern;", "", "", "convert", "component2", "", "map", HashCommand.ID, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "b", "Ljava/lang/String;", "getHash", "()Ljava/lang/String;", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Pattern {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f36829g = {i.d(Pattern.class, "regex", "getRegex()Ljava/lang/String;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f36830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String hash;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f36832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f36833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f36834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f36835f;

    /* JADX INFO: compiled from: Pattern.kt */
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return PatternKt.access$toSeparator((String) Pattern.this.f36830a.get("endSeparator"));
        }
    }

    /* JADX INFO: compiled from: Pattern.kt */
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return PatternKt.access$toSeparator((String) Pattern.this.f36830a.get("middleSeparator"));
        }
    }

    /* JADX INFO: compiled from: Pattern.kt */
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return PatternKt.access$toSeparator((String) Pattern.this.f36830a.get("startSeparator"));
        }
    }

    public Pattern(@NotNull Map<String, String> map, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.f36830a = map;
        this.hash = hash;
        String str = map.get("listen");
        this.f36832c = str == null ? "<#>" : str;
        this.f36833d = LazyKt__LazyJVMKt.lazy(new c());
        this.f36834e = LazyKt__LazyJVMKt.lazy(new b());
        this.f36835f = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pattern copy$default(Pattern pattern, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = pattern.f36830a;
        }
        if ((i10 & 2) != 0) {
            str = pattern.hash;
        }
        return pattern.copy(map, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @NotNull
    public final String convert() {
        return StringsKt__StringsKt.trim((CharSequence) this.f36832c).toString() + ((String) this.f36833d.getValue()) + StringsKt__StringsKt.trim((CharSequence) o.getOrImplicitDefaultNullable(this.f36830a, f36829g[0].getName())).toString() + ((String) this.f36834e.getValue()) + StringsKt__StringsKt.trim((CharSequence) this.hash).toString() + ((String) this.f36835f.getValue());
    }

    @NotNull
    public final Pattern copy(@NotNull Map<String, String> map, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new Pattern(map, hash);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pattern)) {
            return false;
        }
        Pattern pattern = (Pattern) other;
        return Intrinsics.areEqual(this.f36830a, pattern.f36830a) && Intrinsics.areEqual(this.hash, pattern.hash);
    }

    @NotNull
    public final String getHash() {
        return this.hash;
    }

    public int hashCode() {
        return this.hash.hashCode() + (this.f36830a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Pattern(map=" + this.f36830a + ", hash=" + this.hash + ")";
    }
}
