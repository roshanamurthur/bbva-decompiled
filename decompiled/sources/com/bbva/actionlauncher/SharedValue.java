package com.bbva.actionlauncher;

import ad.d;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActionLauncherValues.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/bbva/actionlauncher/SharedValue;", "", "()V", "Email", "File", "Text", "Uri", "Url", "Lcom/bbva/actionlauncher/SharedValue$Email;", "Lcom/bbva/actionlauncher/SharedValue$File;", "Lcom/bbva/actionlauncher/SharedValue$Text;", "Lcom/bbva/actionlauncher/SharedValue$Uri;", "Lcom/bbva/actionlauncher/SharedValue$Url;", "actionlauncher_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class SharedValue {

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bbva/actionlauncher/SharedValue$Email;", "Lcom/bbva/actionlauncher/SharedValue;", "", "component1", "component2", "", "component3", "text", "subject", "toEmails", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "getSubject", "c", "Ljava/util/List;", "getToEmails", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Email extends SharedValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String subject;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> toEmails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(@NotNull String text, @NotNull String subject, @NotNull List<String> toEmails) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subject, "subject");
            Intrinsics.checkNotNullParameter(toEmails, "toEmails");
            this.text = text;
            this.subject = subject;
            this.toEmails = toEmails;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Email copy$default(Email email, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = email.text;
            }
            if ((i10 & 2) != 0) {
                str2 = email.subject;
            }
            if ((i10 & 4) != 0) {
                list = email.toEmails;
            }
            return email.copy(str, str2, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSubject() {
            return this.subject;
        }

        @NotNull
        public final List<String> component3() {
            return this.toEmails;
        }

        @NotNull
        public final Email copy(@NotNull String text, @NotNull String subject, @NotNull List<String> toEmails) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(subject, "subject");
            Intrinsics.checkNotNullParameter(toEmails, "toEmails");
            return new Email(text, subject, toEmails);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return Intrinsics.areEqual(this.text, email.text) && Intrinsics.areEqual(this.subject, email.subject) && Intrinsics.areEqual(this.toEmails, email.toEmails);
        }

        @NotNull
        public final String getSubject() {
            return this.subject;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final List<String> getToEmails() {
            return this.toEmails;
        }

        public int hashCode() {
            return this.toEmails.hashCode() + n1.c(this.subject, this.text.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Email(text=");
            sb2.append(this.text);
            sb2.append(", subject=");
            sb2.append(this.subject);
            sb2.append(", toEmails=");
            return a.c(sb2, this.toEmails, ")");
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/actionlauncher/SharedValue$File;", "Lcom/bbva/actionlauncher/SharedValue;", "", "component1", "component2", "mimetype", "base64", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getMimetype", "()Ljava/lang/String;", "b", "getBase64", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class File extends SharedValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String mimetype;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String base64;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public File(@NotNull String mimetype, @NotNull String base64) {
            super(null);
            Intrinsics.checkNotNullParameter(mimetype, "mimetype");
            Intrinsics.checkNotNullParameter(base64, "base64");
            this.mimetype = mimetype;
            this.base64 = base64;
        }

        public static /* synthetic */ File copy$default(File file, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = file.mimetype;
            }
            if ((i10 & 2) != 0) {
                str2 = file.base64;
            }
            return file.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMimetype() {
            return this.mimetype;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBase64() {
            return this.base64;
        }

        @NotNull
        public final File copy(@NotNull String mimetype, @NotNull String base64) {
            Intrinsics.checkNotNullParameter(mimetype, "mimetype");
            Intrinsics.checkNotNullParameter(base64, "base64");
            return new File(mimetype, base64);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return Intrinsics.areEqual(this.mimetype, file.mimetype) && Intrinsics.areEqual(this.base64, file.base64);
        }

        @NotNull
        public final String getBase64() {
            return this.base64;
        }

        @NotNull
        public final String getMimetype() {
            return this.mimetype;
        }

        public int hashCode() {
            return this.base64.hashCode() + (this.mimetype.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("File(mimetype=");
            sb2.append(this.mimetype);
            sb2.append(", base64=");
            return d.f(sb2, this.base64, ")");
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/actionlauncher/SharedValue$Text;", "Lcom/bbva/actionlauncher/SharedValue;", "", "component1", "text", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Text extends SharedValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(@NotNull String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Text copy(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Text(text);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Text(text="), this.text, ")");
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/actionlauncher/SharedValue$Uri;", "Lcom/bbva/actionlauncher/SharedValue;", "", "component1", "component2", "", "component3", "mimetype", "uri", "flags", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getMimetype", "()Ljava/lang/String;", "b", "getUri", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFlags", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Uri extends SharedValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String mimetype;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String uri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int flags;

        public /* synthetic */ Uri(String str, String str2, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? 1 : i10);
        }

        public static /* synthetic */ Uri copy$default(Uri uri, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uri.mimetype;
            }
            if ((i11 & 2) != 0) {
                str2 = uri.uri;
            }
            if ((i11 & 4) != 0) {
                i10 = uri.flags;
            }
            return uri.copy(str, str2, i10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMimetype() {
            return this.mimetype;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final Uri copy(@NotNull String mimetype, @NotNull String uri, int flags) {
            Intrinsics.checkNotNullParameter(mimetype, "mimetype");
            Intrinsics.checkNotNullParameter(uri, "uri");
            return new Uri(mimetype, uri, flags);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uri)) {
                return false;
            }
            Uri uri = (Uri) other;
            return Intrinsics.areEqual(this.mimetype, uri.mimetype) && Intrinsics.areEqual(this.uri, uri.uri) && this.flags == uri.flags;
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getMimetype() {
            return this.mimetype;
        }

        @NotNull
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return n1.c(this.uri, this.mimetype.hashCode() * 31, 31) + this.flags;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Uri(mimetype=");
            sb2.append(this.mimetype);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", flags=");
            return androidx.appcompat.widget.a.c(sb2, this.flags, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Uri(@NotNull String mimetype, @NotNull String uri, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(mimetype, "mimetype");
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.mimetype = mimetype;
            this.uri = uri;
            this.flags = i10;
        }
    }

    /* JADX INFO: compiled from: ActionLauncherValues.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/actionlauncher/SharedValue$Url;", "Lcom/bbva/actionlauncher/SharedValue;", "", "component1", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Url extends SharedValue {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Url(@NotNull String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ Url copy$default(Url url, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = url.url;
            }
            return url.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Url copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Url(url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Url) && Intrinsics.areEqual(this.url, ((Url) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Url(url="), this.url, ")");
        }
    }

    public SharedValue() {
    }

    public /* synthetic */ SharedValue(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
