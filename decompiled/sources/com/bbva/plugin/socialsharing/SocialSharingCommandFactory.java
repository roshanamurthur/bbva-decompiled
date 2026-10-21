package com.bbva.plugin.socialsharing;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.plugin.socialsharing.command.Share;
import com.bbva.socialsharing.SocialSharing;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SocialSharingCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/socialsharing/SocialSharingCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "socialSharing", "Lcom/bbva/socialsharing/SocialSharing;", "(Lcom/bbva/socialsharing/SocialSharing;)V", "socialsharing-plugin_release"}, k = 1, mv = {1, 1, 10})
public final class SocialSharingCommandFactory extends CommandFactory {

    /* JADX INFO: compiled from: SocialSharingCommandFactory.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SocialSharing f36051a;

        public a(SocialSharing socialSharing) {
            this.f36051a = socialSharing;
        }

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand create() {
            return new Share(this.f36051a);
        }
    }

    public SocialSharingCommandFactory(@NotNull SocialSharing socialSharing) {
        addCommandProvider("share", new a(socialSharing));
    }
}
