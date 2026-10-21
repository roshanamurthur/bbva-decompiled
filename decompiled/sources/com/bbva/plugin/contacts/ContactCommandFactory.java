package com.bbva.plugin.contacts;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.contacts.ContactAccessor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7.b;
import r7.c;
import r7.d;

/* JADX INFO: compiled from: ContactCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/contacts/ContactCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "contactAccessor", "Lcom/bbva/contacts/ContactAccessor;", "(Lcom/bbva/contacts/ContactAccessor;)V", "Companion", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContactCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ContactCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/contacts/ContactCommandFactory$Companion;", "", "()V", "FIND", "", "GET", "PICK", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContactCommandFactory(@NotNull ContactAccessor contactAccessor) {
        Intrinsics.checkNotNullParameter(contactAccessor, "contactAccessor");
        int i10 = 1;
        addCommandProvider("findcontactsbysearchterm", new b(contactAccessor, i10));
        addCommandProvider("getallcontacts", new c(contactAccessor, i10));
        addCommandProvider("pickcontact", new d(contactAccessor, 2));
    }
}
