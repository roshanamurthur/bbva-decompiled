package com.bbva.cellscore.reactor;

import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.components.type.CellsComponent;
import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.data.component.Channel;
import com.bbva.cellscore.web.data.component.ComponentDefinition;
import com.bbva.cellscore.web.model.channel.JsonChannel;
import com.bbva.cellscore.web.navigation.Dispatcher;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class JsonPageReaction extends PageReaction {
    public final CellsPage H0;
    public final HashMap I0 = new HashMap();
    public final Dispatcher J0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27037a;

        static {
            int[] iArr = new int[Channel.ChannelType.values().length];
            f27037a = iArr;
            try {
                iArr[Channel.ChannelType.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27037a[Channel.ChannelType.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public JsonPageReaction(CellsPage cellsPage, Dispatcher dispatcher) {
        this.H0 = cellsPage;
        this.J0 = dispatcher;
    }

    @Override // com.bbva.cellscore.reactor.GlobalReaction
    public void configure() {
        for (ComponentDefinition componentDefinition : this.H0.getComponents()) {
            for (Channel channel : componentDefinition.channels()) {
                HashMap map = this.I0;
                JsonChannel jsonChannel = (JsonChannel) map.get(channel.name());
                if (jsonChannel == null) {
                    jsonChannel = new JsonChannel(channel.name());
                    boolean z10 = (channel.webLink().isEmpty() && channel.nativeLink().isEmpty()) ? false : true;
                    jsonChannel.setAutoClean(z10);
                    jsonChannel.setSaveOnDestroy(!z10);
                    map.put(channel.name(), jsonChannel);
                }
                String strTag = componentDefinition.tag();
                int i10 = a.f27037a[channel.type().ordinal()];
                if (i10 == 1) {
                    reactTo(jsonChannel).then().in(strTag, CellsComponent.class).doReaction(new c(channel.bind(), 0));
                } else if (i10 == 2) {
                    if (!channel.nativeLink().isEmpty()) {
                        reactTo(jsonChannel).then().in(strTag, CellsComponent.class).doNavigation(new d(this, channel.nativeLink()));
                    } else if (!channel.webLink().isEmpty()) {
                        reactTo(jsonChannel).then().doWebNavigation(channel.webLink());
                    }
                    writeOn(jsonChannel).when(strTag).doAction(new ActionSpec(channel.bind()));
                }
            }
        }
    }
}
