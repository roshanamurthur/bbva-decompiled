package com.dasnano.vdphotoselfiecapture.other;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.dasnano.vdphotoselfiecapture.api.model.Action;
import com.dasnano.vdphotoselfiecapture.api.model.Token;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
public class WebVTTBuilder {
    public static String buildWebVTTString(Token token) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Time.GMT));
        int i10 = 1;
        String strConcat = "WEBVTT Kind: metadata\n\n";
        for (Action action : token.getChallenge().getActions()) {
            String strConcat2 = strConcat.concat(i10 + RootService.LINE_BREAK);
            long webVTTStartTime = action.getWebVTTStartTime() != 0 ? action.getWebVTTStartTime() - action.getChallengeStartDetectionTime() : 0L;
            strConcat = strConcat2.concat(simpleDateFormat.format(Long.valueOf(webVTTStartTime)) + " --> " + simpleDateFormat.format(Long.valueOf(action.getWebVTTEndTime() != 0 ? action.getWebVTTEndTime() - action.getChallengeStartDetectionTime() : webVTTStartTime)) + RootService.LINE_BREAK).concat("{\n").concat("\t\"schema\": \"https://veridas.com/dasface/schemas/craft-v0.0.0.json\",\n").concat("\t\"action\": {\"class\": \"" + action.getType() + "\", \"name\": \"" + action.getName() + "\", \"parameters\": {\"direction\": \"" + action.getParameters().getDirection() + "\"}}\n").concat("}\n\n");
            i10++;
        }
        return strConcat;
    }
}
