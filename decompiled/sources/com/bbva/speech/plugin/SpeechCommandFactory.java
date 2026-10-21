package com.bbva.speech.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.speech.plugin.command.PauseSpeakCommand;
import com.bbva.speech.plugin.command.RecognizeCommand;
import com.bbva.speech.plugin.command.ResumeSpeakCommand;
import com.bbva.speech.plugin.command.SpeakCommand;
import com.bbva.speech.plugin.command.StopRecognitionCommand;
import com.bbva.speech.plugin.command.StopSpeakCommand;
import com.bbva.speech.plugin.command.SupportedLanguagesCommand;
import kotlin.Metadata;
import q6.a;
import z6.b;
import z6.c;
import z6.t;
import z6.u;
import z6.v;

/* JADX INFO: compiled from: SpeechPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/speech/plugin/SpeechCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "speech-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SpeechCommandFactory extends CommandFactory {
    public SpeechCommandFactory() {
        int i10 = 5;
        addCommandProvider(SpeakCommand.ID, new t(i10));
        addCommandProvider(RecognizeCommand.ID, new u(6));
        addCommandProvider(SupportedLanguagesCommand.ID, new v(8));
        addCommandProvider(PauseSpeakCommand.ID, new b(6));
        addCommandProvider(ResumeSpeakCommand.ID, new a(6));
        addCommandProvider(StopRecognitionCommand.ID, new q6.b(8));
        addCommandProvider(StopSpeakCommand.ID, new c(i10));
    }
}
