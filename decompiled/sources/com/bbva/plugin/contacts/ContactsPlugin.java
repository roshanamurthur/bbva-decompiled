package com.bbva.plugin.contacts;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.contacts.ContactAccessor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContactsPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/contacts/ContactsPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "components", "", "initialize", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "<init>", "()V", "Companion", "contacts-plugin_release"}, k = 1, mv = {1, 9, 0})
public final class ContactsPlugin extends Plugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ContactAccessor f35605a;

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @Nullable
    public CommandFactory createCommandFactory() {
        ContactAccessor contactAccessor = this.f35605a;
        if (contactAccessor != null) {
            return new ContactCommandFactory(contactAccessor);
        }
        return null;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "Contacts";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@NotNull PluginComponentContainer components) {
        Intrinsics.checkNotNullParameter(components, "components");
        Context applicationContext = components.getApplication().getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        this.f35605a = new ContactAccessor(applicationContext);
        super.initialize(components);
    }
}
