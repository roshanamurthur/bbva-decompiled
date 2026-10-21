package com.bbva.socialsharing.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShareData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/socialsharing/model/ShareData;", "", "()V", "Companion", "PlainText", "Raw", "Res", "Www", "Lcom/bbva/socialsharing/model/ShareData$Res;", "Lcom/bbva/socialsharing/model/ShareData$Www;", "Lcom/bbva/socialsharing/model/ShareData$Raw;", "Lcom/bbva/socialsharing/model/ShareData$PlainText;", "socialsharing_release"}, k = 1, mv = {1, 1, 10})
public abstract class ShareData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ShareData.kt */
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/socialsharing/model/ShareData$Companion;", "", "()V", "fromMap", "Lcom/bbva/socialsharing/model/ShareData;", "map", "", "", "socialsharing_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ShareData fromMap(@NotNull Map<String, ? extends Object> map) throws IllegalArgumentException {
            ShareData plainText;
            Object obj = map.get("source");
            if (Intrinsics.areEqual(obj, "res")) {
                Object obj2 = map.get("filename");
                if (obj2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                plainText = new Res((String) obj2);
            } else if (Intrinsics.areEqual(obj, "www")) {
                Object obj3 = map.get("filename");
                if (obj3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                plainText = new Www((String) obj3);
            } else if (Intrinsics.areEqual(obj, "raw")) {
                Object obj4 = map.get("content");
                if (obj4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                String str = (String) obj4;
                Object obj5 = map.get("filename");
                if (!(obj5 instanceof String)) {
                    obj5 = null;
                }
                plainText = new Raw(str, (String) obj5);
            } else {
                if (!Intrinsics.areEqual(obj, "url") && !Intrinsics.areEqual(obj, "compound_url")) {
                    throw new IllegalArgumentException("Unknown source `" + map.get("source") + "`.");
                }
                Object obj6 = map.get("content");
                if (obj6 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
                plainText = new PlainText((String) obj6);
            }
            return plainText;
        }
    }

    /* JADX INFO: compiled from: ShareData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/socialsharing/model/ShareData$PlainText;", "Lcom/bbva/socialsharing/model/ShareData;", "", "component1", "content", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "socialsharing_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class PlainText extends ShareData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String content;

        public PlainText(@NotNull String str) {
            super(null);
            this.content = str;
        }

        @NotNull
        public static /* bridge */ /* synthetic */ PlainText copy$default(PlainText plainText, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = plainText.content;
            }
            return plainText.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final PlainText copy(@NotNull String content) {
            return new PlainText(content);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof PlainText) && Intrinsics.areEqual(this.content, ((PlainText) other).content);
            }
            return true;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public int hashCode() {
            String str = this.content;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return d.f(new StringBuilder("PlainText(content="), this.content, ")");
        }
    }

    /* JADX INFO: compiled from: ShareData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/socialsharing/model/ShareData$Raw;", "Lcom/bbva/socialsharing/model/ShareData;", "", "component1", "component2", "content", "filename", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "b", "getFilename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "socialsharing_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Raw extends ShareData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String content;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String filename;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public Raw(@NotNull String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public static /* bridge */ /* synthetic */ Raw copy$default(Raw raw, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = raw.content;
            }
            if ((i10 & 2) != 0) {
                str2 = raw.filename;
            }
            return raw.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final Raw copy(@NotNull String content, @Nullable String filename) {
            return new Raw(content, filename);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Raw)) {
                return false;
            }
            Raw raw = (Raw) other;
            return Intrinsics.areEqual(this.content, raw.content) && Intrinsics.areEqual(this.filename, raw.filename);
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getFilename() {
            return this.filename;
        }

        public int hashCode() {
            String str = this.content;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.filename;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Raw(content=");
            sb2.append(this.content);
            sb2.append(", filename=");
            return d.f(sb2, this.filename, ")");
        }

        @JvmOverloads
        public Raw(@NotNull String str, @Nullable String str2) {
            super(null);
            this.content = str;
            this.filename = str2;
        }

        @JvmOverloads
        public /* synthetic */ Raw(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: ShareData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/socialsharing/model/ShareData$Res;", "Lcom/bbva/socialsharing/model/ShareData;", "", "component1", "filename", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getFilename", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "socialsharing_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Res extends ShareData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String filename;

        public Res(@NotNull String str) {
            super(null);
            this.filename = str;
        }

        @NotNull
        public static /* bridge */ /* synthetic */ Res copy$default(Res res, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = res.filename;
            }
            return res.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final Res copy(@NotNull String filename) {
            return new Res(filename);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof Res) && Intrinsics.areEqual(this.filename, ((Res) other).filename);
            }
            return true;
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        public int hashCode() {
            String str = this.filename;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return d.f(new StringBuilder("Res(filename="), this.filename, ")");
        }
    }

    /* JADX INFO: compiled from: ShareData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/socialsharing/model/ShareData$Www;", "Lcom/bbva/socialsharing/model/ShareData;", "", "component1", "filename", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getFilename", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "socialsharing_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Www extends ShareData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String filename;

        public Www(@NotNull String str) {
            super(null);
            this.filename = str;
        }

        @NotNull
        public static /* bridge */ /* synthetic */ Www copy$default(Www www, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = www.filename;
            }
            return www.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final Www copy(@NotNull String filename) {
            return new Www(filename);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof Www) && Intrinsics.areEqual(this.filename, ((Www) other).filename);
            }
            return true;
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        public int hashCode() {
            String str = this.filename;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return d.f(new StringBuilder("Www(filename="), this.filename, ")");
        }
    }

    public ShareData() {
    }

    public /* synthetic */ ShareData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final ShareData fromMap(@NotNull Map<String, ? extends Object> map) throws IllegalArgumentException {
        return INSTANCE.fromMap(map);
    }
}
